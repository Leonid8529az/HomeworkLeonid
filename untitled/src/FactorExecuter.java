public class FactorExecuter {




    public static void main(String[] args) {
        FactorExecuter factorExecuter = new FactorExecuter();
    int value = 15;
    factorExecuter.factorStart(value);

    }



    public int factorStart(int x){
        int number =0;
        for (int i =0; i<x;i++){
            number = number *i;
        }
        System.out.println("the factor of"+x+"is"+number);
        return number;

    }
}
