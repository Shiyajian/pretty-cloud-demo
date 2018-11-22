package com.shiyajian.cloud.file.client.entity.vo;

import lombok.Data;

/**
 * @author shiyajian
 * create: 2018-11-22
 */
@Data
public class FileVO {

    /**
     * 文件名称
     */
    private String fileName;

    /**
     * 文件的存放的路径
     */
    private String fileUrl;
}
