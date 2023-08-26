package com.atguigu.spring.service;

/**
 * Date:2022/7/6
 * Author:ybc
 * Description:
 * 结账接口
 */
public interface CheckoutService {
    void checkout(Integer userId, Integer[] bookIds);

    /**
     * 结账
     * @param userId
     * @param bookIds
     */
    //void checkout(Integer userId, Integer[] bookIds);

}
