package day03;

public class Pair {


    public static void main(String[] args) {
        int [] arr = {3,5,7,2,4,1};
        bubble_sort(arr);
        for (int i=0; i<arr.length; i++){
            System.out.println(arr[i]);

        }
    }

    public static void bubble_sort(int[] arr){
        int size = arr.length;

        for(int i=0; i<size; i++){
            for(int j=0; j<size-1-i; j++){
                if(arr[j] > arr[j+1]) {
                    swap(arr, j);
                }
            }
        }

    }

    public static void swap(int[] arr, int j){
        int tmp = arr[j];
        arr[j] = arr[j+1];
        arr[j+1] = tmp;
    }

}
