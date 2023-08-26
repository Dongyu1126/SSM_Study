package com.atguigu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Date:2022/7/7
 * Author:ybc
 * Description:
 */
@Controller
public class HelloController {

    @RequestMapping("/") //有斜线被服务器解析成绝对路径（网站地址），即localhost:8080/
    public String protal(){
        //将逻辑视图返回  调用index.html文件
        return "index";
    }

    @RequestMapping("/hello") //保证里面的路径（网站地址）与index文件里的一致
    public String hello(){
       //返回逻辑视图  调用success.html文件
        return "success";
    }

}
