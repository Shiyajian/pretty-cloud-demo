package com.shiyajian.cloud.core.utils;

import com.shiyajian.cloud.core.holder.SpringContextHolder;
import org.springframework.context.MessageSource;
import org.springframework.web.servlet.support.RequestContextUtils;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import java.util.Locale;

import static com.shiyajian.cloud.core.holder.ServletContextHolder.currentRequest;

/**
 * 国际化资源工具类
 * @author shiyajian
 * create: 2019-01-29
 */
public class I18nMessageUtil {

    /**
     * 根据key在国际化文件中找对应的文本，如果没有找到对应的文本，则直接将key返回
     * @param key  在国际化资源文件中对应的key
     * @param args 参数
     * @return 对应的内容信息
     */
    public static String getMessage(@Nonnull String key, @Nullable Object[] args) {
        MessageSource messageSource = SpringContextHolder.getBean(MessageSource.class);
        Locale locale = RequestContextUtils.getLocale(currentRequest());
        return messageSource.getMessage(key, args, key, locale);
    }
}
