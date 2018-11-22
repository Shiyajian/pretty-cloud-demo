package com.shiyajian.cloud.file.client;

import com.shiyajian.cloud.file.client.config.FeignMultipartSupportConfig;
import com.shiyajian.cloud.file.client.entity.vo.FileVO;
import com.shiyajian.cloud.global.entity.ResponseVO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

import static org.springframework.http.MediaType.MULTIPART_FORM_DATA_VALUE;

/**
 * @author shiyajian
 * create: 2018-11-22
 */
@FeignClient(value = "support-file-server", configuration = FeignMultipartSupportConfig.class)
public interface FileClient {


    /**
     * 根据文件id查找文件
     *
     * @param fileId 文件id
     * @return 文件
     */
    @GetMapping("client/file/{fileId}")
    ResponseVO<FileVO> getFileById(@PathVariable("fileId") String fileId);


    @PostMapping(value = "client/files/upload", consumes = MULTIPART_FORM_DATA_VALUE)
    ResponseVO<List<FileVO>> updateFiles(@RequestPart("files") MultipartFile[] files, @RequestParam("type") Integer type);

     @PostMapping(value = "client/file/upload", consumes = MULTIPART_FORM_DATA_VALUE)
    ResponseVO<FileVO> updateFile(@RequestPart("file") MultipartFile file, @RequestParam("type") Integer type);


}
