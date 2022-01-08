import misha.BubbleTesterPractice;
import misha.SelectionTesterPractice;

public class SortTester {

    public static void main(String[] args) {
        int ArrayOfNumeros [] = {1,675,453,78,43,90,43,1,2,5,12};
        int ArrayOfNumbers [] = {5,143,14,12,8,56,1,6,5,7,1};
        BubbleTesterPractice bubbletest = new BubbleTesterPractice();
        SelectionTesterPractice selectiontest = new SelectionTesterPractice();
        selectiontest.selectSortMe(ArrayOfNumeros);
        bubbletest.bubbleTestMe(ArrayOfNumbers);
        for (int x =0; x<ArrayOfNumbers.length -1;x++){
            System.out.print(ArrayOfNumbers[x]+ " ");
        }
        for (int y = 0; y<ArrayOfNumeros.length -1; y++){
            System.out.print(ArrayOfNumeros[y] + " ");
        }
    }
}
