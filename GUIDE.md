# 开发者手册

## Gradle 篇

- 为什么选择 Gradle 而不是 Maven？

  答：第一、Gradle编译速度优于Maven ; 第二、Gradle 处理依赖的版本冲突更加智能，Maven 经常会报出各种问题；第三、Gradle 语法极其清晰，阅读极其方便；第四、Gradle更加灵活，同等定位的工程，可以通过脚本进行批量配置。

- implementation 和 compile 的区别？

  答：implementation 依赖仅限于本工程，compile 的依赖，可以被上层调用的工程引用。

- 为什么有的依赖不需要写版本号？

  答：我们在 `dependencyManagement` 中引用了 `Spring Cloud`，`Spring Boot`，`Alibaba` 的依赖包。
  在这些依赖包中已经定义了部分依赖的版本，所以当我们不填写版本的时候，Gradle 自动从依赖包中读取版本号，做到版本统一，避免重复。可以通过以下地址查看已经定义过版本的依赖：

  - [Spring Cloud Dependencies](https://github.com/spring-cloud/spring-cloud-release/blob/master/spring-cloud-dependencies/pom.xml)
  - [Spring Boot Dependencies](https://github.com/spring-projects/spring-boot/blob/master/spring-boot-project/spring-boot-dependencies/pom.xml)
  - [Spring Cloud Alibaba](https://github.com/spring-cloud-incubator/spring-cloud-alibaba/blob/master/spring-cloud-alibaba-dependencies/pom.xml)

