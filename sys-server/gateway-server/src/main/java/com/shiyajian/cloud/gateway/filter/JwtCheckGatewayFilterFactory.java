package com.shiyajian.cloud.gateway.filter;

import org.apache.commons.lang.StringUtils;
import org.springframework.cloud.gateway.filter.GatewayFilter;
import org.springframework.cloud.gateway.filter.factory.AbstractGatewayFilterFactory;

/**
 * @author shiyajian
 * create: 2018-12-22
 */
public class JwtCheckGatewayFilterFactory extends AbstractGatewayFilterFactory<JwtCheckGatewayFilterFactory.Config> {

    private static final String JWT_TOKEN_NAME = "x-token";

    public JwtCheckGatewayFilterFactory() {
        super(Config.class);
    }

    @Override
    public GatewayFilter apply(Config config) {
        return ((exchange, chain) -> {
            String token = exchange.getRequest().getHeaders().getFirst(JWT_TOKEN_NAME);

            if (StringUtils.isBlank(token)) {
                throw new RuntimeException("没有登录");
            }

            return chain.filter(exchange);
        });
    }

    public static class Config {
        // 这里可以配置一些属性，从配置文件中加载过来
    }
}
