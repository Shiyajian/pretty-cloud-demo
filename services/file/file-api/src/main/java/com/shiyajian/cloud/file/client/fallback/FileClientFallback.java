package com.shiyajian.cloud.file.client.fallback;

import com.shiyajian.cloud.file.client.FileClient;
import com.shiyajian.cloud.file.client.entity.vo.FileVO;
import com.shiyajian.cloud.core.entity.ResponseVO;
import com.shiyajian.cloud.core.utils.ResponseUtil;
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
        return ResponseUtil.fallback(null);
    }

    @Override
    public ResponseVO<List<FileVO>> uploadFiles(MultipartFile[] files, Integer type) {
        return ResponseUtil.fallback(null);
    }

    @Override
    public ResponseVO<FileVO> uploadFile(MultipartFile file, Integer type) {
        return ResponseUtil.fallback(null);
    }
}
