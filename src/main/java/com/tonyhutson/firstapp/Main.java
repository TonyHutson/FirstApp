package com.tonyhutson.firstapp;

// By using this import statement, I no longer have to use the fully qualified name and can just use Scanner
import java.util.Scanner;

public class Main {

    private static void arrayExample(){
        int [] theInts = new int[3];
        theInts[0] = 4;
        theInts[1] = 34;
        theInts[2] = 100;

        // Test line for Git test
        for(int x=0;x<theInts.length;x++){
            System.out.println("Int "+x+" is "+theInts[x]);
        }
    }

    // Another change testing Git
    private static void stringExample(){
        // Strings are immutable, so new string assignments result in new memory allocations
        String name = "This is";
        name+=" a test";
        String anotherName = "This";
        anotherName+=" is a test";

        System.out.println(name);
        System.out.println(anotherName);
        if (name==anotherName) {
            System.out.println("These are the same. " +
                    "But we shouldn't use double equals for Strings");
        } else {
            System.out.println("These are not the same.");
        }

        System.out.println("Enter a string:");
        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine();
        System.out.println("User input is: "+userInput);
        if (name.equals(userInput)) {
            System.out.println("These are the same.");
        } else {
            System.out.println("These are not the same.");
        }  // ******* THIS IS EXPENSIVE ******

        String s3 = name.intern();
        String s4 = anotherName.intern();

        if (s3==s4){System.out.println("These strings are the same");}  // This is less expensive

        System.out.println("Enter a string of text:");
        //Scanner scanner = new Scanner(System.in);
        userInput = scanner.nextLine();
        // Split the input using a space as a delimiter and store in an array
        String[] parts = userInput.split(" ");
        for (String part : parts) {
            System.out.println(part);
        }

        StringBuilder sb = new StringBuilder((50));
        sb.append(34);
        sb.append(" There is a bear on the tree");

        int pos = sb.indexOf("on");
        sb.insert(pos, " >>bing go<<");
        String message = sb.toString();
        System.out.println(message);

        String newString = String.format("There is a big house %d tall and %d feet wide.", 50, 30);
        System.out.println(newString);


    }
    public static void main(String[] args) {
	// write your code here
        int numOfArgs = args.length;
        System.out.println("There are "+numOfArgs+" arguments");
        for (int count=0;count<numOfArgs;count++){
            System.out.println("Argument "+(count+1)+" is "+args[count]);
        }
        System.out.print("Hello World\n");



        arrayExample();
        stringExample();

    }
}
