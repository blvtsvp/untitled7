package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        int h = t /3600;//hours
        int m = t / 60 - h*60;
        int s =  t - m*60 - h*3600;
        System.out.println(h + "h "+ m + "min "+ s+"sec");
    }
}
