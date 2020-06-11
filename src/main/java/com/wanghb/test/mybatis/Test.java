package com.wanghb.test.mybatis;

import com.wanghb.test.mybatis.mapper.SandboxMapper;
import com.wanghb.test.mybatis.model.Sandbox;
import tk.mybatis.mapper.entity.Condition;
import tk.mybatis.mapper.entity.Example;

public class Test {

    public static void main(String[] args) {
        SandboxMapper sandboxMapper;
        Example example = new Example(Sandbox.class);
        Example.Criteria criteria = example.createCriteria();
        Condition condition = new Condition(Sandbox.class);

    }
}
