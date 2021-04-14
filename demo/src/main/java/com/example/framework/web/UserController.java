package com.example.framework.web;

import com.example.framework.entity.User;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.SynchronousQueue;

/**
 * 用于测试表单验证提交
 */
@Controller
public class UserController {

    /**
     * 跳转到add.html
     *
     * @return
     */
    @RequestMapping("/toAdd")
    public String toAdd(User user) {
        System.out.println("UserController.toAdd");
        return "add";
    }

    /**
     * 用户添加
     * BindingResult: 用于封装验证对象（user）里面的验证结果
     */
    @RequestMapping("/add")
    public String add(@Valid User user, BindingResult result) {
        //如果存在验证错误
        if (result.hasErrors()) {
            //返回add.html
            return "add";
        }
        System.out.println("保存用户:" + user);
        return "succ";
    }

    /**
     * 用户列表展示
     */
    @RequestMapping("/list")
    public String list(Model model) {
        //模拟用户数据
        List<User> list = new ArrayList<User>();
        list.add(new User(1, "小张", 18));
        list.add(new User(2, "小李", 20));
        list.add(new User(3, "小陈", 22));

        //把数据存入model
        model.addAttribute("list", list);
        //跳转到jsp页面: list.jsp
        return "ArithmeticException";
    }

    @RequestMapping("/demo1")
    public String demo1(Model model) {
        model.addAttribute("message", "你好，Thymeleaf");
        //跳转到templates/demo1.html
        return "demo";
    }


    public static void main(String[] args) throws Exception {
        BlockingQueue<Integer> queue = new SynchronousQueue<>();
        System.out.print(queue.offer(1) + " ");
        System.out.print(queue.offer(2) + " ");
        System.out.print(queue.offer(3) + " ");
        System.out.print(queue.take() + " ");
        System.out.println(queue.size());


    }
}