package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int a = 5, b = 10, c = 15;

        if ( c > b && b > a ) {
            System.out.println (1);
        }else if ( a > b && b > c ) {
            System.out.println (2);
        } else if ( b > a && b > c) {
            System.out.println (b);
        }else if(a== b && b == c){
            System.out.println (5);
        }else {
            System.out.println (0);
        }
    }
}
