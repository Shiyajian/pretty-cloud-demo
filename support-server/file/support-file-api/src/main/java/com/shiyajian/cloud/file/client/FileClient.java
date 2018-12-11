package com.shiyajian.cloud.file.client;

import com.shiyajian.cloud.file.client.config.FeignMultipartSupportConfig;
import com.shiyajian.cloud.file.client.entity.vo.FileVO;
import com.shiyajian.cloud.file.client.fallback.FileClientFallback;
import com.shiyajian.cloud.global.entity.ResponseVO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

import static org.springframework.http.MediaType.MULTIPART_FORM_DATA_VALUE;

/**
 * @author shiyajian
 * create: 2018-11-22
 */
@FeignClient(
        value = "support-file-server",
        configuration = FeignMultipartSupportConfig.class,
        fallback = FileClientFallback.class
)
public interface FileClient {

    /**
     * 根据文件id查找文件
     * @param fileId 文件id
     * @return 文件
     */
    @GetMapping("client/file/{fileId}")
    ResponseVO<FileVO> getFileById(@PathVariable("fileId") String fileId);

    /**
     * 上传多个文件
     * @param files 文件s
     * @param type  文件分类
     * @return 文件存储信息
     */
    @PostMapping(value = "client/files/upload", consumes = MULTIPART_FORM_DATA_VALUE)
    ResponseVO<List<FileVO>> uploadFiles(@RequestPart("files") MultipartFile[] files,
                                         @RequestParam("type") Integer type);

    /**
     * 上传文件
     * @param file 文件
     * @param type 类型
     * @return 文件存储信息
     */
    @PostMapping(value = "client/file/upload", consumes = MULTIPART_FORM_DATA_VALUE)
    ResponseVO<FileVO> uploadFile(@RequestPart("file") MultipartFile file,
                                  @RequestParam("type") Integer type);


}
