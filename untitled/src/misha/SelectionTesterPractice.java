package misha;

public class SelectionTesterPractice {
    public void selectSortMe(int array[]){
        int n = array.length;
        for (int x=0; x<n-1;x++){
            int minIndex = x;
            for(int y = x+1; y<n-1;y++){
                if(array[minIndex]>array[y]){
                    int temp = array[minIndex];
                    array[minIndex] = array[y];
                    array[y] = temp;
                }
            }
        }
    }
}
