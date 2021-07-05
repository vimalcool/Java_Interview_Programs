package com.interview.programs;

// 12,7,4,9,2,3,6,10

import java.util.Arrays;

public class FindSecondLargestNoArray {

    public static void main(String[] args) {

    int arr[]={12,7,12,12,2,3,6,10};

        Arrays.sort(arr);

        for(int i:arr)
        {
            System.out.print(i+" ");
        }

        int count=2;
        int lenght=arr.length;
        while(arr[lenght-count]==arr[lenght-1])
        {

            count++;
        }



        System.out.println();
        System.out.println("Second Large element " +arr[arr.length-count]);



    }

}








