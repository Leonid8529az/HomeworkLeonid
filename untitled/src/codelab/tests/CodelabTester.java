package codelab.tests;

import java.io.*;
import java.util.*;

public class CodelabTester {

   int sum=0;

    public static void main(String[] args) throws IOException {

        String stringnew = "Human brain is a biological learning machine";
        Map<Integer, String> wordNLength = findTheLargestWord(stringnew);
        System.out.println(wordNLength);

        int[] fuck = {10, 2, 1, 4, 5, 3, 7, 8, 6};
        CodelabTester codelab = new CodelabTester();
        codelab.fuckIt(fuck);
        codelab.sort(fuck);
        codelab.findMinDifference(fuck);
        System.out.println(missingNumber(fuck));

        for (int i=0; i<5;i++){
            for (int j=5-i;j>1;j--){
                System.out.print(" ");
            }
            for (int j =0;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }

        int supernumb =100;
        while (supernumb >= 0) {
            System.out.print(supernumb+ " ");
            while (supernumb>90){
                supernumb--;
                System.out.print(supernumb+ " ");
            }
            while(supernumb > 70){
                supernumb -=2;
                System.out.print(supernumb+ " ");
            }
            while(supernumb > 40){
                supernumb-=3;
                System.out.print(supernumb+ " ");
            }

                supernumb-=4;
            }

        List<String> list = new ArrayList<String>();
        list.add("Mike");
        list.add("John");
        list.add("Kyle");

        Map<String, List<String>> map = new HashMap<String, List<String>>();
        map.put("students",list);
        Iterator <String> itr1 = map.keySet().iterator();
        while(itr1.hasNext()){
            System.out.println(itr1.next());
        }
        Iterator<List<String>>itr = map.values().iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }

        Queue<Integer> Q = new LinkedList<Integer>();
        Q.add(348);
        Q.add(358);
        Q.add(379);
        Q.add(455);
        Q.remove(455);

        System.out.println(Q);



        List <String> textList = new LinkedList<String>();
        Stack <String>stack = new Stack<String>();
        File file = new File("C:\\Users\\wormi\\IdeaProjects\\untitled\\src\\codelab\\tests\\textfile");
        BufferedReader br = new BufferedReader(new FileReader(file));
        String string;
        while((string = br.readLine())!=null){
            System.out.println(string);
            for(String s: string.split("\\s+")){
                textList.add(s);
                stack.push(s);
            }

        }
        System.out.println(textList);
        for (String str: stack){
            System.out.println(str);

        }


    }



    public static Map<Integer, String> findTheLargestWord(String wordGiven) {
        Map<Integer, String> map = new HashMap<Integer, String>();
        String st = "";
        String longest;
        int i=1;

        for(String str: wordGiven.split("\\s+")){
            map.put(i++, str);

        }

        return map;
    }




    public static void fuckMe(){
    System.out.println("You were fucked on the ass");

}



    public void  fuckIt (int[] array){

        for (int i=0; i<array.length/2;i++){
           int temp = array[i];
           array[i]=array[array.length-i-1];
           array[array.length-i-1]=temp;
        }
        System.out.println(array);
    }


    public int[] sort(int[] array){
        for (int i=0; i<array.length-1; i++){
            for (int j=0; j<array.length-1;j++){
                if (array[j]>array[j+1]){
                    int temp = array[j];
                    array[j]=array[j+1];
                    array[j+1] = temp;
                }
            }
        }
        return array;
    }

    public void findMinDifference(int [] array){
        int minDiff = array[1] - array[0];


        for (int i=2; i<array.length; i++){
            minDiff = Math.min(minDiff, array[i] - array[i-1]);

        }
        System.out.println(minDiff);

    }

    public static int missingNumber(int [] arr){
        int n = arr.length;
        int total = n*(n +1)/2;
        int total1 =0;
        for (int i=0;i<arr.length; i++){
            total1 +=arr[i];
        }
        int missingNumb = total - total1;
        return missingNumb;
    }


    }

