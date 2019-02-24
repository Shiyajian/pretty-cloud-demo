package com.shiyajian.cloud.core.context;

import com.shiyajian.cloud.core.constants.JwtConstants;
import com.shiyajian.cloud.core.entity.User;
import com.shiyajian.cloud.core.exception.NoLoginException;
import org.apache.commons.lang3.StringUtils;

import java.util.Enumeration;

import static com.shiyajian.cloud.core.context.ServletContext.request;

/**
 * @author shiyajian
 * create: 2018-12-25
 */
public class UserContext {

    private UserContext() { /* no instance */ }

    /**
     * 获得当前登录的用户，如果没有登录信息，则抛出异常，由调用方自己处理
     * @return 当前登录用户
     */
    public static User currentUser() {

        Enumeration<String> headers = request().getHeaders(JwtConstants.JWT_HEADER_NAME);
        while (headers.hasMoreElements()) {
            String element = headers.nextElement();
            if (StringUtils.isBlank(element)) {
                throw new NoLoginException();
            }
            break;
        }

        // jwt 解密token,获得payload，转成User对象返回
        // never be null，only exception and a full entity
        return null;
    }

}
