package lesson7.example1;

import java.util.ArrayList;

public class UserSort {

    public User[] bubbleSort(User[] users){
        if(users == null){
            throw new NullPointerException("Null array");
        }
        if(users.length == 0){
            throw new RuntimeException("Array is empty");
        }
        User[] buffArr = users.clone();
        for (int i = 0; i < buffArr.length; i++) {
            for (int j = 0; j < buffArr.length - i - 1; j++) {
                Utility.swap(buffArr, j, j+1);
            }
        }
        return buffArr;
    }
}
