package com.ashok;

import java.util.Scanner;

public class Program {


    public static void main(String[] args)
    {
        int a[] = new int[10];
        a[0] = 1;
        a[1] = 23;
        a[2] = 33;
        a[3] = 44;
        a[4] = 67;
        a[5]=929;
        a[6]=939;
        a[7]=959;
        a[8]=969;
        a[9]=97;
        System.out.println("The array is::");
        for(int i=0;i<a.length;i++)
        {
            System.out.println(a[i]);
        }
        int array[]={1,2,3,4,5,6,7,8,9,0};
        for(int i=0;i<array.length;i++)
        {
            System.out.println(array[i]);
        }

        System.out.println("The array is taken at runtime.");


        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter the size of array::");
        int ant= scanner.nextInt();
        int arr[]=new int[ant];
        System.out.println("Enter the elements::");
        for(int i=0;i<arr.length;i++)
        {
         arr[i]=scanner.nextInt();

        }
        System.out.println("Displaying runtime array.");
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);

        }
    }




}
