public class BubbleSortClass {
    public void bubbleSortThatShit(int[] arr){
        int[] list = arr;
        int n = list.length;
        for(int i =0; i<n;i++){
            for(int j=0;j<n-1;j++){
                if(list[j]>list[j+1]){
                    int temp = list[j];
                    list[j] = list[j+1];
                    list[j+1] = temp;
                }
            }
            System.out.print(list[i]+ ", ");
        }
    }
}
