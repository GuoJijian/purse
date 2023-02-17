package com.guojijian.pethospital.workbench.mapper;

import com.guojijian.pethospital.workbench.pojo.Order;
import java.util.List;

public interface OrderMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_order
     *
     * @mbggenerated Fri Feb 17 09:48:01 CST 2023
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_order
     *
     * @mbggenerated Fri Feb 17 09:48:01 CST 2023
     */
    int insert(Order record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_order
     *
     * @mbggenerated Fri Feb 17 09:48:01 CST 2023
     */
    Order selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_order
     *
     * @mbggenerated Fri Feb 17 09:48:01 CST 2023
     */
    List<Order> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_order
     *
     * @mbggenerated Fri Feb 17 09:48:01 CST 2023
     */
    int updateByPrimaryKey(Order record);

    /**
     * 查询所有订单
     */
    List<Order> selectOrderAll();

    /**
     * 根据id删除订单
     */
    int deleteOrderById(String id);

    /**
     * 添加订单
     */
    int insertOrder(Order order);
}