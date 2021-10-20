package com.mycompany.sliitapp;

/**
 *
 * @author PARADOCX
 */
public class Application {
    public static void main(String[] args) {
        System.out.println("Main Method Executing");
        m1();
        m2();
        System.out.println("Main method end");                
    }
    
    public static void m1() {
        for(int i = 0; i < 10; i++){
            System.out.println("I" + i);
        }
//        int i = 0;
//        while(i < Integer.MAX_VALUE){
//            m1();
//            i++;
//        }

//        while(true){
//            m1();
//        }

//        System.out.println("M1 is Executing");
//        System.out.println("M1.1 is Executing");
//        System.out.println("M1.2 is Executing");
//        m2();
    }
    
    public static void m2() {
        System.out.println("M2 is Executing");
    }
}
