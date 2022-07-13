FROM amazoncorretto:11 AS builder
COPY gradlew .
COPY settings.gradle.kts .
COPY build.gradle.kts .
COPY gradle gradle
COPY . .
RUN chmod +x ./gradlew
RUN ./gradlew clean build --build-cache --info

FROM amazoncorretto:11-alpine-jdk

RUN apk add --no-cache\
        bash openjdk11

RUN addgroup -g 1000 pre-charge-group &&\
        adduser -h /home/pre-charge-user -u 1000 -G pre-charge-group -D pre-charge-user

COPY --from=builder pre-charge-api/build/libs/*.jar /pre-charge-api.jar
RUN chown -R pre-charge-user:pre-charge-group /home/ &&\
        chown pre-charge-user:pre-charge-group /pre-charge-api.jar

EXPOSE 8080
CMD ["java", "-Dspring.profiles.active=local", "-Dserver.port=8080", "-Djava.io.tmpdir=/home/pre-charge-user/", "-jar", "/pre-charge-api.jar"]
