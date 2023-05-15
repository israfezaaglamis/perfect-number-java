package org.example;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number;
        int result = 0;

        System.out.print(" Bir sayı giriniz : ");
        number = input.nextInt();
        for (int i = 1; i < number; i++){
            if (number % i == 0){
                result += i;
            }

        }
        if (result == number){
            System.out.println(number +" Mükemmel bir sayıdır ");
        }else {
            System.out.println(number +" Mükemmel bir sayı değildir ");
        }



        

    }
}