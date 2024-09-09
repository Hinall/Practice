package Condition_IFelse;

import java.util.Scanner;

public class IsElse {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int age =sc.nextInt();
        if(age>18){
            System.out.println("can vote");
        }
        else{
            System.out.println("can not vote");

        }
        //ternary operator

        String res=age>18 ? "can vote":"can not vote";
        System.out.println(res);
    }
}
