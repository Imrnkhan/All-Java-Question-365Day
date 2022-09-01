package com.practice;

 class Person {
        int id;
        String name;
        Person(int id,String name){
            this.id=id;
            this.name=name;
        }
    }
    class Employee extends Person{
        float salary;
        Employee(int id,String name,float salary){
            super(id,name);//reusing parent constructor
            this.salary=salary;
        }
        void display(){
            System.out.println(id+" "+name+" "+salary);}
    }
    class main {
        public static void main(String[] args){
            Employee e1=new Employee(1,"ankit",45000f);
            e1.display();
        }
    }
//    output:
//            1 ankit 45000

