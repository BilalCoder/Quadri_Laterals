package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[4];
        System.out.println("Enter the length of the four sticks in cm");
        for(int i=0; i<4; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter one internal angle");
        int angle = sc.nextInt();
        if(arr[0]==arr[1]){
            if(arr[0] == arr[2] && arr[2] == arr[3] && angle==90){
                System.out.println("It’s a square");
            }
            else if(arr[2] == arr[3] && angle==90){
                System.out.println("It's a rectangle");
            }
            else if(arr[0] == arr[2] && arr[2] == arr[3] && angle!=90){
                System.out.println("It’s a rhombus");
            }
            else if(arr[2] == arr[3] && angle!=90){
                System.out.println("It's a parallelogram");
            }
        }
        else
            System.out.println("It's a irregular quadrilateral");
    }
}
