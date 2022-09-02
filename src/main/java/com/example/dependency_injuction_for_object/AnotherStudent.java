package com.example.dependency_injuction_for_object;

public class AnotherStudent {


    private Exam exam;
    public AnotherStudent(Exam exam){
        this.exam=exam;
    }
    public void  atest(){
        exam.maths();
    }
}
