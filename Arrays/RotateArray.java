
package com.walmart.services.async.worker.utils;

public class Main {

    public static void main(String[] args) throws Exception {

        int[] arr = {1,2,3,4,5,6,7};
        int d = 3;
        rotateArrayLeft(arr,d, arr.length);
        rotateArrayRight(arr,d,arr.length);
    }


    /**
     * 1) Rotate One By One
     * @param arr
     * @param d
     * @param n
     */
    public static void rotateArrayLeft(int arr[],int d, int n){
        //1)Store 1st element in temp
        //2)Shift elements one by one to left
        //3)Put temp value to last index
        //4)Repeat this d times
        //Time Complexity O(n*d)

        int p = 1;
        while(p <= d){
            int last = arr[0];
            for(int i=0; i<n-1; i++){
                arr[i] = arr[i+1];
            }
            arr[n-1] = last;
            p++;
        }

        System.out.println("***Rotate Left***");
        for(int j=0; j<n ; j++){
            System.out.print(arr[j]+",");
        }
        System.out.println();
    }

    /**
     * 1) Rotate One By One
     * @param arr
     * @param d
     * @param n
     */
    public static void rotateArrayRight(int arr[],int d, int n){
        //1)Store last element in temp
        //2)Shift elements one by one to right
        //3)Put temp value to last index
        //4)Repeat this d times
        //Time Complexity O(n*d)

        int p = 1;
        while(p <= d){
            int first = arr[n-1];
            for(int i=n-1; i>0; i--){
                 arr[i] = arr[i-1];
            }
            arr[0] = first;
            p++;
        }

        System.out.println("***Rotate Right***");
        for(int j=0; j<n ; j++){
            System.out.print(arr[j]+",");
        }
    }
}
