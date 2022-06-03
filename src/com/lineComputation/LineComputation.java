package com.lineComputation;

import java.util.Scanner;

public class LineComputation {
    public static void main(String[] args) {
        System.out.println("WELCOME TO LINE COMPARISON PROGRAM ");
        Scanner scanner=new Scanner(System.in);
        //local variables
        int x1,x2,y1,y2;

        //taking inputs from the user
        System.out.println("ENTER THE VALUE OF X1: ");
        x1=scanner.nextInt();
        System.out.println("ENTER THE VALUE OF X2: ");
        x2= scanner.nextInt();
        System.out.println("ENTER THE VALUE OF Y1: ");
        y1= scanner.nextInt();
        System.out.println("ENTER THE VALUE OF Y2: ");
        y2= scanner.nextInt();

        //finding length of the line
        double lengthOfTheLine=Math.sqrt(Math.pow((x2-x1),2)+Math.pow((y2-y1),2));
        System.out.println("LENGTH OF THE LINE IS : "+lengthOfTheLine);

    }
}
