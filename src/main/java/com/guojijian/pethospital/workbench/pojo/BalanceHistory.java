package com.guojijian.pethospital.workbench.pojo;

public class BalanceHistory {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_balance_history.id
     *
     * @mbggenerated Fri Feb 17 09:48:01 CST 2023
     */
    private String id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_balance_history.money
     *
     * @mbggenerated Fri Feb 17 09:48:01 CST 2023
     */
    private Float money;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_balance_history.status
     *
     * @mbggenerated Fri Feb 17 09:48:01 CST 2023
     */
    private String status;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_balance_history.balance_id
     *
     * @mbggenerated Fri Feb 17 09:48:01 CST 2023
     */
    private String balanceId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_balance_history.id
     *
     * @return the value of tbl_balance_history.id
     *
     * @mbggenerated Fri Feb 17 09:48:01 CST 2023
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_balance_history.id
     *
     * @param id the value for tbl_balance_history.id
     *
     * @mbggenerated Fri Feb 17 09:48:01 CST 2023
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_balance_history.money
     *
     * @return the value of tbl_balance_history.money
     *
     * @mbggenerated Fri Feb 17 09:48:01 CST 2023
     */
    public Float getMoney() {
        return money;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_balance_history.money
     *
     * @param money the value for tbl_balance_history.money
     *
     * @mbggenerated Fri Feb 17 09:48:01 CST 2023
     */
    public void setMoney(Float money) {
        this.money = money;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_balance_history.status
     *
     * @return the value of tbl_balance_history.status
     *
     * @mbggenerated Fri Feb 17 09:48:01 CST 2023
     */
    public String getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_balance_history.status
     *
     * @param status the value for tbl_balance_history.status
     *
     * @mbggenerated Fri Feb 17 09:48:01 CST 2023
     */
    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_balance_history.balance_id
     *
     * @return the value of tbl_balance_history.balance_id
     *
     * @mbggenerated Fri Feb 17 09:48:01 CST 2023
     */
    public String getBalanceId() {
        return balanceId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_balance_history.balance_id
     *
     * @param balanceId the value for tbl_balance_history.balance_id
     *
     * @mbggenerated Fri Feb 17 09:48:01 CST 2023
     */
    public void setBalanceId(String balanceId) {
        this.balanceId = balanceId == null ? null : balanceId.trim();
    }
}