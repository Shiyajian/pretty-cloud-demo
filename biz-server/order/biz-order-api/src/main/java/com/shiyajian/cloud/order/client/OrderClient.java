package com.shiyajian.cloud.order.client;

import com.shiyajian.cloud.core.entity.ResponseVO;
import com.shiyajian.cloud.order.client.entity.vo.OrderInfoVO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

/**
 * @author shiyajian
 * create: 2018-10-24
 */
@FeignClient(value = "biz-order-server")
public interface OrderClient {


    @GetMapping("/order/{orderNo}")
    ResponseVO<List<OrderInfoVO>> getOrderInfoByNo(@PathVariable(value = "orderNo") String orderNo);
}
