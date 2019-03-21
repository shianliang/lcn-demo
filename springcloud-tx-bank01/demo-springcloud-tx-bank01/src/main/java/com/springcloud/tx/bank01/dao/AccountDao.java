package com.springcloud.tx.bank01.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Update;

@Mapper
public interface AccountDao {

    /**
     * 转账
     * @param money 转账金额
     * @param customerId 客户ID
     * @return
     */
    @Update(value = "update account set balance =balance + #{money} where customer_id =#{customerId} ")
    int transferAccount(@Param("customerId") Long customerId,@Param("money") Double money);

}
