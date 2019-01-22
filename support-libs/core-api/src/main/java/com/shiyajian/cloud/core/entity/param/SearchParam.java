package com.shiyajian.cloud.core.entity.param;

import com.shiyajian.cloud.core.entity.enums.SortEnum;
import lombok.Data;

import java.util.LinkedHashMap;

/**
 * @author shiyajian
 * create: 2019-01-19
 */
@Data
public class SearchParam {

    private LinkedHashMap<String, SortEnum> sorts;
}
