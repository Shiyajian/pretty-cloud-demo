# COBWEB

## 简介

> 本项目命名为：cobweb（蛛网）。蜘蛛网，错综复杂而又纹路清晰，看似轻薄脆弱，实则韧性十足，科学家们都在研究用蜘蛛网造防弹衣，足以说明蜘蛛网的厉害之处。本系统与蛛网类似，是一个以Spring Cloud为基础的系统，众多服务划分明确，调用链路清晰，追求优雅编码，整个项目设计精巧而优美。

> 项目为长期项目，可能会写1.2年，进度缓慢
>
> 私人好友QQ交流群：757696438

## 前言

**cobweb**作为个人学习的一个项目，吸收了个人工作中的经验积累，同时又融合了大量的个人思考和优化，做到了以下优势：

- 使用了目前前沿的技术，并且不断进行更新；
- 对技术的选择和使用方式进行了慎重考虑，有一套良好的实现及落地方案；
- 整个项目结构整洁，调用关系清晰，编码整洁又优美。

## 技术选型

- 数据库： **MySQL**
  - [订单系统的分布式主键及分库分表方案]()
  - [MySQL的一主多从的读写分离方案]()
- 构建工具：**Gradle**
  - [为什么选择Gradle，而不选择Maven？]()
  - [使用Gradle打造一个优美的系统结构]()
- 微服务框架：**Spring Cloud**
  - [微服务框架Spring Cloud 和服务治理框架 Dubbo的个人见解]()
  - 服务注册/配置管理 ： **Alibaba Nacos**
    - [对比 eureka 、consul 、 nacos]()
  - 链路追踪：**Skywalking**
    - [对比 ziplin 、 point、skywalking]()
  - 服务熔断：**Hystrix**
  - 服务网关：**Spring Cloud Gateway**
    - [对比 Zuul 、Gateway]()
  - 服务调用：**Open Feign + OkHttp**
- ORM框架：**Mybatis + Mybatis Plus**
  - [为什么选择Mybatis而不是Spring Data JPA？]()
  - [如何打造一个完美的Mybatis]()
- 国际化配置： **Spring** **+** **Yaml**
  - [使用 Yaml 文件替代 Properties 文件作为 Spring i18n 的配置]()
  - [具备国际化的全局异常处理方案]()
- 数据校验框架：**Spring Validation**
- 接口管理系统：**DOClever**
  - [为什么没有选用很流行的Swagger-UI]()
- 用户认证：**JWT**
  - [对比有状态的session-cookie方案和无状态的jwt方案]()
- 数据库连接池：**Hikari CP**
  - [对比 Druid 和 Hikari CP]()
- 容器技术： **Docker + Docker Compose**
- 缓存技术： **Redis + Lettuce + Redission**
  - [Redis,Zookeeper,Redission 实现分布式锁]()

## 开发工具

- IDE :  **IntelliJ IDEA**

## 开发环境

- JDK ：

## 架构图



## 服务说明

### USER服务

负责用户登录，当前用户的个人信息

### ORDER服务

负责用户订单

### PAY服务

负责支付

### FILE服务

服务文件上传，各个子项目通过feign传id，获取对应的地址

### NOTIFY服务

通知服务，各服务发送消息到mq,通知服务发送通知给用户和商家，有短信，邮箱，app推送，websocket长连接等







