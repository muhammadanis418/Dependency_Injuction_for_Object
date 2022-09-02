package com.example.dependency_injuction_for_object;

public class Student {
private  int id;
  private Exam exam;

//  public Student(int id) {
//    this.id = id;
//  }

//  public Student(Exam exam) {
//      System.out.println("Constructor is called");
//        this.exam = exam;
//    }

  public Student(int id, Exam exam) {
    System.out.println("Constructor is called");
    this.id = id;
    this.exam = exam;
  }

  public void test(){
      exam.maths();
      System.out.println("ID is:"+id);
  }
}
