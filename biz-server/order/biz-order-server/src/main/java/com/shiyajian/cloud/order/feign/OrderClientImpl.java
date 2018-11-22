package com.shiyajian.cloud.order.feign;

import com.shiyajian.cloud.global.entity.ResponseVO;
import com.shiyajian.cloud.global.utils.ResponseVOUtil;
import com.shiyajian.cloud.order.feign.entity.vo.OrderInfoVO;
import com.shiyajian.cloud.order.feign.entity.vo.ProductVO;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * 提供给外部服务的实现类
 * 参数、方法名、请求路径等应该一致
 *
 * @author shiyajian
 * create: 2018-10-24
 */
@RestController
public class OrderClientImpl implements OrderClient {


    @Override
    public ResponseVO<List<OrderInfoVO>> getOrderInfoByNo(@PathVariable String orderNo) {
        OrderInfoVO orderInfoVO = new OrderInfoVO();
        orderInfoVO.setOrderNo("123456");
        orderInfoVO.setUserId("13304094634");
        orderInfoVO.setCreatedTime(new Date());
        List<ProductVO> products = new ArrayList<>();

        ProductVO product0 = new ProductVO();
        product0.setProductName("豆腐脑");
        product0.setProductNo("0001");
        product0.setProductPrice(new BigDecimal("3.00"));
        product0.setQuantity(3);

        ProductVO product1 = new ProductVO();
        product1.setProductNo("0002");
        product1.setProductName("油条");
        product1.setProductPrice(new BigDecimal("2.50"));
        product1.setQuantity(2);
        products.add(product0);
        products.add(product1);
        orderInfoVO.setProducts(products);
        return ResponseVOUtil.success(products);
    }
}
