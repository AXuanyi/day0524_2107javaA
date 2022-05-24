package com.lening.mybatisplus;

import com.lening.mybatisplus.entity.UserBean;
import com.lening.mybatisplus.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
class MybatisplusApplicationTests {
    @Resource
    private UserMapper userMapper;


    @Test
    public void testUpdateById1(){
        try {
            UserBean userBean = userMapper.selectById(1513713475779186690L);
            userBean.setAge(21);
            userMapper.updateById(userBean);
            System.out.println(userBean);
        }catch (Exception e){
            e.printStackTrace();
        }

    }

    @Test
    public void testUpdateById2(){
        try {
            UserBean userBean = userMapper.selectById(1513713475779186690L);
            userBean.setAge(25);
            userMapper.updateById(userBean);
            System.out.println(userBean);
        }catch (Exception e){
            e.printStackTrace();
        }

    }



    @Test
    public void testUpdateById(){

        UserBean user = new UserBean();
        user.setId(1513713475779186690L);
        user.setAge(26);

        int result = userMapper.updateById(user);
        System.out.println(result);

    }


    @Test
    public void testInsert(){

        UserBean user = new UserBean();
        user.setName("李凉凉");
        user.setAge(18);
        user.setEmail("55317332@qq.com");

        int result = userMapper.insert(user);
        System.out.println(result); //影响的行数
        System.out.println(user); //id自动回填
    }


    @Test
    public void testFindAll(){
        List<UserBean> list = userMapper.selectList(null);
        list.forEach(user ->{
            System.out.println(user);
        });
    }

}
