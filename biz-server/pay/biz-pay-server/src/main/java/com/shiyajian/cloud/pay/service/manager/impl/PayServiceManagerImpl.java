package com.shiyajian.cloud.pay.service.manager.impl;

import com.shiyajian.cloud.file.client.FileClient;
import com.shiyajian.cloud.core.entity.ResponseVO;
import com.shiyajian.cloud.order.client.OrderClient;
import com.shiyajian.cloud.order.client.entity.vo.OrderInfoVO;
import com.shiyajian.cloud.pay.pojo.dto.OrderDTO;
import com.shiyajian.cloud.pay.pojo.vo.PayInfoVO;
import com.shiyajian.cloud.pay.service.PayService;
import com.shiyajian.cloud.pay.service.manager.PayServiceManager;
import org.apache.commons.fileupload.disk.DiskFileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.io.IOUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;

/**
 * @author shiyajian
 * create: 2018-10-25
 */
@Component
public class PayServiceManagerImpl implements PayServiceManager {

    @Autowired
    private PayService payService;

    @Autowired
    private OrderClient orderClient;

    @Autowired
    private FileClient fileClient;


    @Override
    public PayInfoVO payOrder(String orderNo) {

        // 查询订单信息
        ResponseVO<List<OrderInfoVO>> orderInfoResponse = orderClient.getOrderInfoByNo(orderNo);
        if(!orderInfoResponse.getSucceeded()){
            throw new RuntimeException(orderInfoResponse.getMsg());
        }

        // 根据订单信息进行支付，此处使用BeanUtils拷贝属性，是为了远程和本地实体部分不一致情况
        OrderDTO orderDTO = new OrderDTO();
        BeanUtils.copyProperties(orderInfoResponse.getData(),orderDTO);
        payService.saveOrderPay(orderDTO);

        return null;
    }

    @Override
    public void fileTest() {
        fileClient.getFileById("12345");
        File file = new File("/Users/shiyajian/hello.txt");
        DiskFileItem fileItem = (DiskFileItem) new DiskFileItemFactory().createItem("files",
                MediaType.TEXT_PLAIN_VALUE, true, file.getName());

        try (InputStream input = new FileInputStream(file);
             OutputStream os = fileItem.getOutputStream()) {
            IOUtils.copy(input, os);
        } catch (Exception e) {
            throw new IllegalArgumentException("Invalid file: " + e, e);
        }

        MultipartFile multi = new CommonsMultipartFile(fileItem);

        MultipartFile multi2 = new CommonsMultipartFile(fileItem);
        MultipartFile[] files = {multi,multi2};
        fileClient.uploadFiles(files,1);

        DiskFileItem fileItem2 = (DiskFileItem) new DiskFileItemFactory().createItem("file",
                MediaType.TEXT_PLAIN_VALUE, true, file.getName());

        try (InputStream input = new FileInputStream(file);
             OutputStream os = fileItem2.getOutputStream()) {
            IOUtils.copy(input, os);
        } catch (Exception e) {
            throw new IllegalArgumentException("Invalid file: " + e, e);
        }

        MultipartFile multi3 = new CommonsMultipartFile(fileItem2);

        fileClient.uploadFile(multi3,2);
    }
}
