# Spring Cloud 编码日记
- 2018.10.22 搭建基于gradle的spring-cloud项目雏形
- 2018.10.23 受龙果支付的影响，将业务模块放在支付方向
- 2018.10.24 支付模块依赖如下：
    - client: 调用方直接引用，使用了springboot的autoconfiguration，防止调用方忘记扫描FeginClients注解的路径
        - api: feign接口以及实体的包
    - server: 服务提供方
        - api: 实现接口（为了保证方法名和入参一致）
