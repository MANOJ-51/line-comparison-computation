package com.lineComputation;

import java.util.Scanner;

public class LineComputation {
    public static void main(String[] args) {
        System.out.println("WELCOME TO LINE COMPARISON PROGRAM ");
        Scanner scanner=new Scanner(System.in);
        //local variables
        int x1,x2,y1,y2;
        int a1,a2,b1,b2;

        //taking inputs from the user for tow lines
        System.out.println("ENTER THE VALUES OF LINE -1");
        System.out.println("");
        System.out.println("ENTER THE VALUE OF X1: ");
        x1=scanner.nextInt();
        System.out.println("ENTER THE VALUE OF X2: ");
        x2= scanner.nextInt();
        System.out.println("ENTER THE VALUE OF Y1: ");
        y1= scanner.nextInt();
        System.out.println("ENTER THE VALUE OF Y2: ");
        y2= scanner.nextInt();

        System.out.println("ENTER THE VALUES OF LINE-2 ");
        System.out.println("ENTER THE VALUE OF A1: ");
        a1= scanner.nextInt();
        System.out.println("ENTER THE VALUE OF A2: ");
        a2= scanner.nextInt();
        System.out.println("ENTER THE VALUE OF B1: ");
        b1= scanner.nextInt();
        System.out.println("ENTER THE VALUE OF B2: ");
        b2= scanner.nextInt();


        //finding length of the line-1 and line-2
        double lengthOfTheLine1=Math.sqrt(Math.pow((x2-x1),2)+Math.pow((y2-y1),2));
        double lengthOfTheLine2=Math.sqrt(Math.pow((a2-a1),2)+Math.pow((b2-b1),2));

        //displaying lengths of line-1 and line-2
        System.out.println("LENGTHS OF LINE-1 AND LINE-2");
        System.out.println("LENGTH OF THE LINE-1 IS : "+lengthOfTheLine1);
        System.out.println("LENGTH OF THE LINE-2 IS : "+lengthOfTheLine2);

        //checking two lines are equal or not
        if (lengthOfTheLine1==lengthOfTheLine2){
            System.out.println("line-1 is equal to line-2 ");
        }else{
            System.out.println("line-1 is not equal to line-2 ");
        }

    }
}
