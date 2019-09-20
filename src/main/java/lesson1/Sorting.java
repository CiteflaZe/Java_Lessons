package lesson1;

public class Sorting {

    public int[] bubbleSort(int[] arr){
        if(arr == null){
            throw new NullPointerException("Array equals null");
        }
        if(arr.length == 0){
            throw new RuntimeException("Array length equals zero");
        }
        int[] buffArr = arr.clone();
        for (int i = 0; i < buffArr.length; i++) {
            for (int j = 0; j < buffArr.length - i - 1; j++) {
                if (buffArr[j] > buffArr[j + 1]){
                    int buff = buffArr[j];
                    buffArr[j] = buffArr[j+1];
                    buffArr[j+1] = buff;
                }
            }
        }
        return buffArr;
    }

    public int[] insertionSort(int[] arr){
        if(arr == null){
            throw new NullPointerException("Array equals null.");
        }
        if(arr.length == 0){
            throw new RuntimeException("Array length equals zero.");
        }
        int[] buffArr = arr.clone();
        for (int i = 0; i < buffArr.length; i++) {
            int j = i - 1;
            int buff = buffArr[i];
            while (j >= 0 && buffArr[j] > buff){
                buffArr[j + 1] = buffArr[j];
                j--;
            }
            buffArr[j + 1] = buff;
        }
        return buffArr;
    }

    public int[] selectionSort(int[] arr){
        if(arr == null){
            throw new NullPointerException("Array equals null.");
        }
        if(arr.length == 0){
            throw new RuntimeException("Array length equals zero.");
        }
        int[] buffArr = arr.clone();
        for (int i = 0; i < buffArr.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < buffArr.length; j++) {
                if(buffArr[j] < buffArr[min]){
                    min = j;
                }
            }
            int buff = buffArr[min];
            buffArr[min] = buffArr[i];
            buffArr[i] = buff;
        }
        return buffArr;
    }

}
