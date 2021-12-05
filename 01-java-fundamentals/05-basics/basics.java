import java.util.ArrayList;

public class basics{

    public void print1To255(){
        for(int i = 1; i <= 255; i++){
            System.out.println(i);
        }
    }

    public void printOdd1To255(){
        for(int i = 1; i <= 255; i++){
            if(i % 2 != 0){
                System.out.println(i);
            }
        }
    }

    public int sum1To255(){
        int sum = 0;
        for(int i = 1; i <= 255; i++){
            sum += i;
        }
        return sum;
    }

    public void iterateAnArray(){
        int[] x = {1,3,5,7,9,13};
        for(int i : x){
            System.out.println(i);
        }
    }

    public int findMax(int[] arr){
        int max = arr[0];
        for (int i : arr){
            if(i > max){
                max = i;
            }
        }
        return max;
    }

    public ArrayList<Integer> arrayOfOdd1To255(){
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i = 1; i <= 255; i++){
            if(i % 2 != 0){
                arr.add(i);
            }
        }
        return arr;
    }

}