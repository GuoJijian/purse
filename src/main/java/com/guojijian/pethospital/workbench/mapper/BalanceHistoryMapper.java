package com.guojijian.pethospital.workbench.mapper;

import com.guojijian.pethospital.workbench.pojo.Balance;
import com.guojijian.pethospital.workbench.pojo.BalanceHistory;
import java.util.List;

public interface BalanceHistoryMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_balance_history
     *
     * @mbggenerated Fri Feb 17 09:48:01 CST 2023
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_balance_history
     *
     * @mbggenerated Fri Feb 17 09:48:01 CST 2023
     */
    int insert(BalanceHistory record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_balance_history
     *
     * @mbggenerated Fri Feb 17 09:48:01 CST 2023
     */
    BalanceHistory selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_balance_history
     *
     * @mbggenerated Fri Feb 17 09:48:01 CST 2023
     */
    List<BalanceHistory> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_balance_history
     *
     * @mbggenerated Fri Feb 17 09:48:01 CST 2023
     */
    int updateByPrimaryKey(BalanceHistory record);

    /**
     * 添加记录
     * @param balanceHistory
     * @return
     */
    int insertBalanceHistory(BalanceHistory balanceHistory);

    /**
     * 根据id查询记录
     */
    List<BalanceHistory> queryBalanceHistoryAllById(String id);
}