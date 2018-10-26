package com.shiyajian.cloud.order.feign;

import com.shiyajian.cloud.global.entity.ResponseVO;
import com.shiyajian.cloud.order.feign.entity.vo.OrderInfoVO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author shiyajian
 * create: 2018-10-24
 */
@FeignClient(value = "biz-order-server")
public interface OrderClient {


    @GetMapping("/order/{orderNo}")
    ResponseVO<OrderInfoVO> getOrderInfoByNo(@PathVariable(value = "orderNo") String orderNo);
}
