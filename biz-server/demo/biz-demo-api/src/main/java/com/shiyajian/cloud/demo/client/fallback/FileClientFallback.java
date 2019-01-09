package com.shiyajian.cloud.demo.client.fallback;

import com.shiyajian.cloud.core.entity.ResponseVO;
import com.shiyajian.cloud.core.utils.ResponseVOUtil;
import com.shiyajian.cloud.demo.client.FileClient;
import com.shiyajian.cloud.demo.client.entity.vo.FileVO;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

/**
 * @author shiyajian
 * create: 2018-12-10
 */
@Service
public class FileClientFallback implements FileClient {

    @Override
    public ResponseVO<FileVO> getFileById(String fileId) {
        return ResponseVOUtil.fallback(null);
    }

    @Override
    public ResponseVO<List<FileVO>> uploadFiles(MultipartFile[] files, Integer type) {
        return ResponseVOUtil.fallback(null);
    }

    @Override
    public ResponseVO<FileVO> uploadFile(MultipartFile file, Integer type) {
        return ResponseVOUtil.fallback(null);
    }
}
