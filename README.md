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
- JDK: **JDK 64-Bit 1.8.0_144**
- 构建工具：**Gradle**
- 微服务框架：**Spring Cloud**
  - 服务注册/配置管理 ： **Alibaba Nacos**
  - 链路追踪：**Skywalking**
  - 服务熔断：**Hystrix**
  - 服务网关：**Spring Cloud Gateway**
  - 负载均衡：**Ribbon**s
  - 服务调用：**Open Feign + OkHttp**
- ORM框架：**Mybatis + Mybatis Plus**
- 国际化配置： **Spring MessageSource** 
- 数据校验框架：**Spring Validation**
- 接口管理系统：**DOClever**
- 用户认证：**JWT**
- 数据库连接池：**Hikari CP**
- 容器技术： **Docker + Docker Compose**
- 缓存技术： **Redis + Lettuce + Redission**
- 分布式任务调度： **xxl-job**
## 任务计划
- 技术预演，所有功能实现在demo-server中
- 业务分析，设计原型
- 编码实现
- 部署运维部署监控 (高可用，集群，分布式,实时监控报警，降级，自我修复)
## 技术预演
所有的技术选型都是根据一定的理论进行选择，选择严格执行一个规范，现在所有的技术实现，统一在biz-server/demo下面实现
- [技术选型原则和架构原则](./doc/design/architectural-design-principles.md)
- [前后数据流转中的处理](./doc/design/data-flow.md)
- [使用专门的接口管理工具，而不是Swageer](./doc/design/api-system.md)
MySql
- Mysql各种数据类型分析，及业务字段选择
- Mysql关于货币字段的存储类型选择
- Mysql各种引擎的选择
- Mysql索引相关
- 异常处理
- 拦截器（空格处理，xss,crf,sql注入拦截）
关于Null和空字符串的思考
- 关于Mybatis自定义枚举转换器，3.4.5+ （https://github.com/mybatis/mybatis-3/pull/971/commits/a2381869a56e11959bab43c5e0d23daa58757bcc）
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







