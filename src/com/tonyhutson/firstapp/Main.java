package com.tonyhutson.firstapp;

public class Main {

    private static void arrayExample(){
        int [] theInts = new int[3];
        theInts[0] = 4;
        theInts[1] = 34;
        theInts[2] = 100;


    }
    public static void main(String[] args) {
	// write your code here
        int numOfArgs = args.length;
        System.out.println("There are "+numOfArgs+" arguments");
        for (int count=0;count<numOfArgs;count++){
            System.out.println("Argument "+(count+1)+" is "+args[count]);
        }
        System.out.print("Hello World\n");

        int n = 122320;
        long l = (long)n;  // type cast from int to long
        float f = (float)n;
        System.out.println("The long value is "+f);

        arrayExample();


    }
}
