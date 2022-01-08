package misha;

import java.util.Scanner;

public class firstClass {


    public static void main(String[] args) {
        int Array[] = {8,2,3,4,17};
        firstClass sortTester = new firstClass();
        sortTester.selectionTester(Array);
        for(int a=0;a<Array.length;a++){
            System.out.print(Array[a]+ " ");
        }
    }

    public void bubbleTester(int array[]){
        int n = array.length;
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-1;j++){
                if(array[j]>array[j+1]){
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }

    }

    public void selectionTester(int array[]){
        int n = array.length;
        for (int i=0;i<n-1;i++){
            int min = i;
            for(int j = i+1; j<n-1;j++){
                if(array[j]<array[min]){
                    min = j;
                }
            }
            int temp = array[min];
            array[min] = array[i];
            array[i] = temp;
        }

    }


}








