package com.neuedu.business.service;

import com.neuedu.business.common.ServerResponse;
import java.sql.SQLException;

public interface IOrderService {


    /**
     * 创建订单
     * */

    ServerResponse createOrder(Integer userId, Integer shippingId);

    /**
     *
     * 取消订单
     * */
    ServerResponse cancelOrder(Long orderNo);

    /**
     * 根据订单号查询订单信息
     * */
    ServerResponse findOrderByOrderNo(Long orderNo);

    /**
     * 支付成功后，修改订单状态
     * */
    ServerResponse updateOrder(Long orderNo, String payTime, Integer orderStatus);
}
