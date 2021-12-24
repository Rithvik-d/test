package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here

        permutationString("abcd");
    }

    public static void permutationString(String a) {

        StringBuilder b = new StringBuilder(a);
     char c,d;


for(int i=0;i<a.length();i++ ){
    for(int j=0;j<a.length()-i-1;j++){
        c=b.charAt(j);
        d=b.charAt(j+1);
        b.setCharAt(j, d);
        b.setCharAt(j+1, c);

        System.out.println(b);
    }
}


    }
}
