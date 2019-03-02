package com.shiyajian.cloud.core.enums;

/**
 * @author shiyajian
 * create: 2019-01-12
 */
public interface Enumerable<E extends Enum> {

    String getKey();

    int getValue();
}
