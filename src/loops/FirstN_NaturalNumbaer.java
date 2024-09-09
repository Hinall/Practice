package loops;

import java.util.Scanner;

public class FirstN_NaturalNumbaer {
    public static void main(String[] args) {
        System.out.println("hello");
        Scanner sc=new Scanner(System.in);
        System.out.println("enter num");
        int input= sc.nextInt();
        int n=1;
        while(input>=n){
            System.out.println(n);
            n++;
        }
//
//        do{
//            System.out.println(n);
//            n++;
//        }while (input>=n);
    }
}
