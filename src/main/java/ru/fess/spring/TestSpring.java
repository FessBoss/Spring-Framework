package ru.fess.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );

        TestBean testBean = context.getBean("testBean", TestBean.class); //"testBean" = bean id from context.xml

        System.out.println(testBean.getName());

        context.close();
    }
}
