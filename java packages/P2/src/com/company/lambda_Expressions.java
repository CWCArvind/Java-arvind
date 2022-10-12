package com.company;
@FunctionalInterface
interface Mood {
    void myMood (int a);
}
interface anodemo{
    void meth1 ();
    void meth2 ();
}

//
 public class lambda_Expressions {
    public static void main(String[] args) {

        Mood obj1 = (a)->{
            System.out.println("My mood is very cool at this time as I am going to bath at "+a+" pm");
        };

        obj1.myMood(1);







        anodemo obj = new anodemo() {
            public void methExtra (){
                System.out.println("I am extra method just to show you that you can create more methods in an anonymous class");
            }
            @Override
            public void meth1() {
                System.out.println("I am meth one ");
            }

            @Override
            public void meth2() {
                System.out.println("I am meth two ");
            }
        };

        obj.meth1();
        obj.meth2();



    }
}