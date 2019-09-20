package Utilitys;

public class UtilitySorts {


    public void selectionSort(int[] arr){
        for (int i = 0; i < arr.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < arr.length; j++) {
                if(arr[j] < arr[min]){
                    min = j;
                }
            }
            int buff = arr[min];
            arr[min] = arr[i];
            arr[i] = buff;
        }
    }


    public void bubbleSort(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]){
                    int buff = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = buff;
                }
            }
        }
    }


    public void insertionSort(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            int j = i - 1;
            int buff = arr[i];
            while (j >= 0 && arr[j] > buff){
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = buff;
        }
    }

}
