package com.atguigu.spring.service.impl;

import com.atguigu.spring.dao.BookDao;
import com.atguigu.spring.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.concurrent.TimeUnit;

/**
 * Date:2022/7/6
 * Author:ybc
 * Description:
 * 实现类，加上@Service的注解
 */
@Service
public class BookServiceImpl implements BookService {

    @Autowired
    private BookDao bookDao;

    @Override
    @Transactional/*加上以后就是事务*/
    /*@Transactional(
            //readOnly = true  只读只适用于全部都是查询操作的时候才行
            //timeout = 3
            //noRollbackFor = ArithmeticException.class  //这俩是设置不会造成回滚的异常，就是不影响其他的运行
            //noRollbackForClassName = "java.lang.ArithmeticException"
            //isolation = Isolation.DEFAULT  设置隔离级别，default是数据库默认的隔离级别
            propagation = Propagation.REQUIRES_NEW  propagation枚举类型，开启一个新的事务
    //阻止事件传播，REQUIRES_NEW开启它自己的事务，这里就是每买一本书就是一个事务，买一本也可以
    REQUIRES是调用它的对象开启事务，就是买2本书这个事务，要么买2本，要么一本买不到

    )*/
    public void buyBook(Integer userId, Integer bookId) {
        /*try {
            TimeUnit.SECONDS.sleep(5);//休眠5秒
        } catch (InterruptedException e) {
            e.printStackTrace();
        }*/
        //查询图书的价格
        Integer price = bookDao.getPriceByBookId(bookId);
        //更新图书的库存
        bookDao.updateStock(bookId);
        //更新用户的余额
        bookDao.updateBalance(userId, price);
        //System.out.println(1/0);
    }
}
