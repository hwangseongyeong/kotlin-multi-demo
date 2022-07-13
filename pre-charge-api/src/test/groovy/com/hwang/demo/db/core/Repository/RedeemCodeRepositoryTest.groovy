package com.hwang.demo.db.core.Repository

import com.hwang.demo.common.domain.RedeemCodeStatusType
import com.hwang.demo.db.core.entity.RedeemCode
import com.hwang.demo.db.core.entity.RedeemCodePublish
import com.hwang.demo.db.core.repository.RedeemCodePublishRepository
import com.hwang.demo.db.core.repository.RedeemCodeRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.ActiveProfiles
import spock.lang.Specification

import java.time.LocalDate

@ActiveProfiles("local")
@SpringBootTest
class RedeemCodeRepositoryTest extends Specification {

    @Autowired
    RedeemCodePublishRepository redeemCodePublishRepository

    @Autowired
    RedeemCodeRepository redeemCodeRepository

    def "redeemCode insert test"() {
        given:
        RedeemCodePublish redeemCodePublish =
                new RedeemCodePublish(100, LocalDate.now(), 10000, "test")

        RedeemCode redeemCode =
                new RedeemCode(redeemCodePublish, "A1B2C3C4D5D6E7E8", RedeemCodeStatusType.PUBLISH)

        when:
        redeemCodePublishRepository.save(redeemCodePublish)
        redeemCodeRepository.save(redeemCode)

        then:
        redeemCode.redeemCodePublish.id == redeemCodePublish.id
    }

}
