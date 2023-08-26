package com.atguigu.spring.service.impl;

import com.atguigu.spring.service.BookService;
import com.atguigu.spring.service.CheckoutService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Date:2022/7/6
 * Author:ybc
 * Description:
 * 结账实现类
 *  实现类，加上@Service的注解
 */
@Service
public class CheckoutServiceImpl implements CheckoutService {

    @Autowired//买书的过程，要装配上bookService对象
    private BookService bookService;

    @Override
    @Transactional
    public void checkout(Integer userId, Integer[] bookIds) {
        for (Integer bookId : bookIds) {//每买一本书都是一个book操作，for进行
            bookService.buyBook(userId, bookId);
        }
    }
}
