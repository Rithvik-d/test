package com.company;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Set bit count : " + getSetBitCount(12)); // 15 = 1111
        System.out.println("Set bit count : " + getdifferentBitCount(15,16));
        getdecToBinary(12);
    }

    public static int getSetBitCount(int n) {
        int count = 0, pow = 1;
        for (int i = 0; i < 32; i++) {
            if ((n & pow) > 0) {
                // bit at i th position is set
                count++;
            }
            pow <<= 1;
        }
        return count;
    }

// Get the number of different bits of 2 numbers.
// Given A & B.how many bits are different among them
// 10000 => 16
// 01111 => 15
// 0010 -> count set bits

    public static int getdifferentBitCount(int n1,int n2){
        int count = 0, pow = 1;
        for (int i = 0; i < 32; i++) {
            if ((n1 & pow)!=(n2 & pow) ) {
                // bit at i th position is set
                count++;
            }
            pow <<= 1;
        }
        return count;
    }
// decimal to binary
public static void getdecToBinary(int n)
{

    for (int i = 4; i >= 0; i--) {
        int k = n >> i;
        if ((k & 1) > 0)
            System.out.print("1");
        else
            System.out.print("0");
    }
}




}
