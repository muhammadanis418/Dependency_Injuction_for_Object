package com.example.dependency_injuction_for_object;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
    public static void main(String[] args) {

        //-----Dependency Injection for Object using Constructor---//


      /*  Exam exam= new Exam();
        Student student= new Student(exam);
        student.test();*/
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
        Student student = applicationContext.getBean("student", Student.class);
        student.test();

        AnotherStudent st = applicationContext.getBean("student1", AnotherStudent.class);
        st.atest();
    }
}
