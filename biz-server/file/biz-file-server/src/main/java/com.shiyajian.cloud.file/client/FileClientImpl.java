package com.shiyajian.cloud.file.client;

import com.shiyajian.cloud.core.entity.ResponseVO;
import com.shiyajian.cloud.core.utils.ResponseVOUtil;
import com.shiyajian.cloud.file.client.entity.vo.FileVO;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

/**
 * @author shiyajian
 * create: 2018-11-22
 */
@RestController
public class FileClientImpl implements FileClient {


    @Override
    public ResponseVO<FileVO> getFileById(@PathVariable("fileId") String fileId) {
        FileVO vo = new FileVO();
        vo.setFileName("test");
        vo.setFileUrl("http://www.baidu.com");
        return ResponseVOUtil.success(vo);
    }

    @Override
    public ResponseVO<List<FileVO>> uploadFiles(@RequestPart("files") MultipartFile[] files,
                                                @RequestParam("type") Integer type) {
        System.out.println(files[0].getName());
        return null;
    }

    @Override
    public ResponseVO<FileVO> uploadFile(@RequestPart("file") MultipartFile file,
                                         @RequestParam("type") Integer type) {
        System.out.println(file.getName());
        return null;
    }


}
