package Recursion;
import java.util.Scanner;

public class Factorial {

    public static int fact(int n){
        // base case
        if (n == 1){
            return 1;
        }

        int sOutput = n * fact(n-1);
        System.out.println("Below sOutput!");
        System.out.println(sOutput);

        return sOutput;
    }

    public static int sumOfN(int n){
        // base case
        if (n == 0){
            return 0;
        }

        int smallOutput = sumOfN(n-1);
//        System.out.println("SO: " + smallOutput);
        int output = n + smallOutput;
//        System.out.println(output);

        return output;
    }

    public static int power(int x, int n){
        // base case
        if (n == 0){
            return 1;
        }

        int smallOutput = power(x , n-1);
        int output = x * smallOutput;
        System.out.println(output);

        return output;
    }

    public static int numOfDig(int n){
        // base case
        if (n == 0){
            return 0;
        }
        System.out.println("n: " + n);

        int output = 1 + numOfDig(n/10);
        System.out.println(output);

        return output;
    }

    public static void print1Ton(int n){
        // base case
        if (n == 0){
            return;
        }

        print1Ton(n-1);

        System.out.print(n + " ");
        return;
    }

    public static int fibo(int n){
        // base case
        if (n == 1 || n == 2){
            return 1;
        }

        int fibo_n_1 = fibo(n-1);
        int fibo_n_2 = fibo(n-2);

        int output = fibo_n_1 + fibo_n_2;
        System.out.println(output);

        return output;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //  FACTORIAL :-
//        System.out.print("Enter n: ");
//        int n = sc.nextInt();
//
//        int result = fact(n);
//        System.out.println(result);

        //  Sum of n Natural numbers :-

//        System.out.print("Enter n: ");
//        int n = sc.nextInt();
//
//        int result = sumOfN(n);
//        System.out.println("Answer: " + result);

        //  Power of a Number

//        System.out.print("Enter x: ");
//        int x = sc.nextInt();
//        System.out.print("Enter n: ");
//        int n = sc.nextInt();
//
//        int result = power(x, n);
//        System.out.println("Main Answer: " + result);

        //  Number of Digits :-

//        System.out.print("Enter any number: ");
//        int n = sc.nextInt();
//
//        System.out.println("Total Digits: " + numOfDig(n));

        //  Printing numbers from 1 to n :-

//        System.out.print("Enter n: ");
//        int n = sc.nextInt();
//
//        print1Ton(n);

        //  Fibonacci series :-

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        int result = fibo(n);
        System.out.println("Answer: " + result);
    }
}
