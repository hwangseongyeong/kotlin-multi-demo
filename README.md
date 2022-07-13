##### Git - commit 시 kotlin-lint 수행

```
$ git config core.hookspath .githooks
```

##### Intellij IDEA
```
// Gradle Build and run with IntelliJ IDEA
Build, Execution, Deployment > Build Tools > Gradle >> Run tests using => IntelliJ IDEA
                                  
// Import kotlin code-style
Editor > Code Style > Kotlin >> Scheme >> Import Scheme >> IntelliJ IDEA code style XML >> settings/KotlinCodeStyle.xml

// to set an option in ".editorconfig" for wildcard importing.
 disabled_rules=no-wildcard-imports
```
