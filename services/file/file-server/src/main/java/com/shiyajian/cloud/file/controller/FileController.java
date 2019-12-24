package com.shiyajian.cloud.file.controller;

import com.shiyajian.cloud.core.entity.ResponseVO;
import com.shiyajian.cloud.core.utils.ResponseUtil;
import com.shiyajian.cloud.file.client.entity.vo.FileVO;
import com.shiyajian.cloud.file.pojo.param.FileDescriptorParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

/**
 * @author shiyajian
 * create: 2019-03-08
 */
@RequestMapping("/files")
public class FileController {

    @PostMapping
    public ResponseVO<FileVO> uploadFile(MultipartFile file, FileDescriptorParam param) {
        FileVO fileVO = new FileVO();
        return ResponseUtil.ok(fileVO);
    }
}
