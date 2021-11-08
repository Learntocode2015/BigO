package com.company;

public class Main {

    static int n = 4;

    public static void main(String[] args) {
        polynomial(1);
        polynomial(2);
        polynomial(3);
        polynomial(10);
        //polynomial(5);
        //polynomial(6);
    }
    public static void polynomial(int n) {
            int n1 = n;
            int p = 1;
            int a = 2 * 3; //O(1) complexity
            for (int i = 0; i < n; i++) { //O(n) complexity
                for (int j = 0; j < n; j++) {//O(n) complexity
                    for (int k = 0; k < n; k++) { //O(n) complexity
                        System.out.print(p++);
                        System.out.print(',');
                    }//O(1) + O(n) + O(n) + O(n) = O(1) + O(n^3) = O(n^3) Polynomial time complexity - squaring n - exponent is the number of loops
                }
            }
        System.out.println();
        }
    }