package com.example.framework.aop;

import org.springframework.stereotype.Service;

/**
 * 接口实现类
 *
 * @author xnf
 * @date 2020/7/17
 */
@Service
public class CustomerServiceImpl implements CustomerService {

    @Override
    public void save(String name) {
        System.out.println("执行save方法,name为："+name);
    }

    @Override
    public void update() {
        System.out.println("执行update方法");
    }

}
