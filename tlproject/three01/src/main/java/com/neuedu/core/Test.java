package com.neuedu.core;

import com.neuedu.core.bean.Person;
import com.neuedu.core.bean.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("spring-config.xml");
        /*System.out.println(context);*/
       /* Student student = (Student) context.getBean("student");
        Student student02 = (Student) context.getBean("student");
        System.out.println(student);
        System.out.println(student02);*/
      Person person=(Person)  context.getBean("person");
        System.out.println(person.getStudent());
    }
}
