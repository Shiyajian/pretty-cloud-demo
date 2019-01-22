package com.shiyajian.cloud.web.properties;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author shiyajian
 * create: 2019-01-17
 */
@ConfigurationProperties(prefix = "syj.web")
@Setter
@Getter
public class WebProperties {

    private boolean enable = true;
}
