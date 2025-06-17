package basic;

import java.util.Scanner;

public class ArrayExample{

    public static void main (String[] arges){

        Scanner input = new Scanner(System.in);

        int[] myArray = {1,3,5,7,9};
        int[] anotherArray = new int[10];
        String[] gender = {"Female", "Male"};

        for(int i = 0; i < anotherArray.length; i++){
            System.out.println("Insert Item at: "+i);
            anotherArray[i] = input.nextInt();
        }

        myArray[1] = 13;
        myArray[2] = 13;
        myArray[3] = 14;
        anotherArray[5] = 17;

        for (int i = 0; i < anotherArray.length; i++){
            if (anotherArray[i] == 13){
                System.out.println("Found It");
                break;
            }
            System.out .println("Item at: "+i+ "is" +anotherArray[i]);
        }
        int sum = 0;
        for(int i = 0; i <myArray.length; i++){
            sum += myArray[i];
            System.out.print(sum);
        }
    }
}
