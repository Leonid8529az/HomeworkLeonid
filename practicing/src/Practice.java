import java.util.*;

public class Practice {

    public static void main(String[] args) {
       /*

          System.out.println("Is 11 a prime number, yes or not :" + isPrime(11));
        System.out.println("Fibonacci numbers upto 10 are numbers :");
        for (int i=1;i<10;i++){
            System.out.print(fibonacciDoIt(i)+ " ");
        }
        System.out.println("Is racecare a palindrome, yes or not? : " + isMocha("racecare"));
        System.out.println("is 214 palindrome, yes or not : " + isMochaInt(214));
        System.out.println("is 213 Armstrong, yes or not: " + isArmstrong(213));
        System.out.println("factorial of 8 is " + factorialRecur(8));
        System.out.println("factorial of 10 is " + factorialRegular(10));
                List<Integer> regular = new ArrayList<Integer>();
        regular.add(11);
        regular.add(11);
        regular.add(7);
        System.out.println(regular);
        Set<Integer> regularWithoutDupl = new LinkedHashSet<Integer>(regular);
        regular.clear();
        regular.addAll(regularWithoutDupl);
        System.out.println(regular);


        int[] numbers = {3,15,35,67,89,90,144};
        System.out.println(binarySearchIndex(numbers,115));
        reverseArray(numbers);
        System.out.println(Arrays.toString(numbers));
        System.out.println("is 2011 a leap year? : " +isLeapYear(2011));
        System.out.println("Is Mary and Army Angarams, yes no? : " +checkAnagram("army", "Mary"));
        System.out.println(reverseThisNumber(74));
        System.out.println("Fibonacci upto 11 number are : ");
        */
        pocketsSquareRootOf(49);
        System.out.println("Reverse string of fuckthisPussyboi is :" + reverseString("fuckthisPussyboi"));
        printRepeatedChar("parallel");
        giveMeTheNUmberofCharacters("fuckthispussyboi");
        pyramidMF(7);

    }


    public static int fibonacciDoIt(int number){
        int fib1 = 1;
        int fib2 = 1;
        int fib3 = 1;
       if (number == 1 || number ==2){
           return 1;
       }
       for (int i =3; i<number;i++){
           fib3 = fib1 + fib2;
           fib1 = fib2;
           fib2 = fib3;
       }
        return fib3;
    }

    public static int fibonacciRecur(int number){
        if(number == 1 || number ==2){
            return 1;
        }
        return fibonacciRecur(number -1) + fibonacciRecur(number-2);
    }

    public static boolean isPrime(int number){
        int sqrt = (int)Math.sqrt(number) + 1;
        for(int i=2; i<sqrt;i++){
            if(number%i ==0){
                return false;
            }
        }
        return true;
    }

    public static boolean isMocha(String input){
        char[] array = input.toCharArray();
        StringBuilder stringBuilder = new StringBuilder(array.length);
        for (int i=array.length-1; i>=0;i--){
            stringBuilder.append(array[i]);
        }
        return stringBuilder.toString().equals(input);
    }

    public static boolean isMochaInt(int number){
        int palindrome = number;
        int reverse = 0;
        while (palindrome!=0){
            int remainder = palindrome % 10;
            reverse = reverse * 10 + remainder;
            palindrome = palindrome/10;
        }
        return number==reverse;
    }

    public static boolean isArmstrong(int number){
        int series = number;
        int armStrong = 0;
        while(series!=0){
            int remain = series%10;
            armStrong = armStrong + (int)Math.pow(remain, 3);
            series = series/10;
        }
        return number == armStrong;
    }

    public static int factorialRecur(int number){
        if (number == 0){
            return 1;
        }
        return number * factorialRecur(number-1);
    }
    public static int factorialRegular(int number){
        int result = 1;
        while (number!=0){
            result = result * number;
            number--;
        }
        return result;
    }

    public static String reverseString(String fuckit){
      char[] array = fuckit.toCharArray();
      StringBuilder sb = new StringBuilder(array.length);
      for(int i = array.length-1; i>=0; i--){
          sb.append(array[i]);
      }
      return sb.toString();
    }

    public static void pyramidMF(int number){
        for (int i=0; i<number; i++){
            for (int j=0; j<number-i;j++){
                System.out.print(" ");
            }
            for (int k=0;k<=i;k++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void printRepeatedChar(String someString){
    char[] array = someString.toCharArray();
    Map<Character, Integer> characterIntegerMap = new HashMap<Character, Integer>();
    for (Character ch: array){
        if(characterIntegerMap.containsKey(ch)){
            characterIntegerMap.put(ch, characterIntegerMap.get(ch)+ 1);
        }
        else{
            characterIntegerMap.put(ch, 1);
        }
    }
        System.out.println(characterIntegerMap);

    }

    public static void pocketsSquareRootOf(int number){
        for (int i=1; i<=number; i++){
            int reminder = number%i;
            if(reminder ==0 && number/i==i){
                System.out.println("The square root of "+number+" is "+i);
            }

        }

    }

    public static void reverseArray(int[] array){
        if (array==null || array.length<2){
            return;
        }
        for(int i=0; i<array.length/2;i++){
            int temp = array[i];
            array[i] = array[array.length-1-i];
            array[array.length-1-i] = temp;
        }
    }

    public static boolean isLeapYear(int year){
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.YEAR, year);
        int days = cal.getActualMaximum(Calendar.DAY_OF_YEAR);
        if(days <366){
            return false;
        }
        return true;
    }
    public static int binarySearchIndex(int[] array, int number){
        int highestNumber = array.length-1;
        int lowestNumber =0;
        while(highestNumber>=lowestNumber){
            int middle = (highestNumber + lowestNumber)/2;
            if(array[middle]==number){
                return middle;
            }
            else if(array[middle]>number){
                highestNumber = middle-1;
            }
            else if (array[middle]<number){
                lowestNumber = middle + 1;
            }
        }
        return -1;

    }

    public static boolean checkAnagram(String str1, String str2){
        String str1Upd = str1.toLowerCase();
        String str2Upd = str2.toLowerCase();
        char[] array = str1Upd.toCharArray();
        StringBuilder sb = new StringBuilder(str2Upd);
        for(Character ch : array){
            int index = sb.indexOf(""+ch);
            if(index!=-1){
                sb.deleteCharAt(index);
            }
            else{
                return false;
            }
        }
        return sb.length()==0;
    }

    public static int reverseThisNumber(int number){
        int reverse =0;
        while(number>0){
            int remainder = number % 10;
            reverse = reverse*10 + remainder;
            number = number/10;
        }
        return reverse;
    }

    public static void giveMeTheNUmberofCharacters(String someString){
        char[] array = someString.toCharArray();
        Map<Character, Integer> mapCount = new HashMap<Character, Integer>();
        for (Character character : array){
            if(mapCount.containsKey(character)){
                mapCount.put(character,mapCount.get(character) + 1);
            }
            else{mapCount.put(character, 1);}

        }
        System.out.println(mapCount);
    }
}
