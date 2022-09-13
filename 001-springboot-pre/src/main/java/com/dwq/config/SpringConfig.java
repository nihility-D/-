package com.dwq.config;

import com.dwq.vo.Student;
import org.springframework.context.annotation.*;

//当前类是作为配置文件使用的，就是用来配置容器的，
//SpringConfig这个类就相当于bean.xml
@Configuration
@ImportResource(value = {"classpath:applicationContext.xml","classpath:beans.xml"})
@PropertySource(value = "classpath:config.properties")
@ComponentScan(basePackages = "com.dwq.vo")
public class SpringConfig {

//    @Bean：把对象注入到spring容器中，作用相当于<bean>
    @Bean
    public Student CreatStudent(){
        Student s1 = new Student();
        s1.setName("代代");
        s1.setAge(22);
        s1.setSex("男");
        return s1;
    }

    @Bean(name = "xiaodai")
    public Student MakeStudent(){
        Student s2 = new Student();
        s2.setName("小代");
        s2.setAge(22);
        s2.setSex("男");
        return s2;
    }
}
