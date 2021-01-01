package Coding;

import java.util.HashSet;
import java.util.Set;

public class DuplicateElements {
    public static void main(String[] args) {
        int arr[]={1,5,4,2,1,4,7};
        Set<Integer>uniqueNumber= new HashSet<>();
        boolean isDuplicateExist=false;
        for (int i=0;i<arr.length;i++){
            if (uniqueNumber.contains(arr[i]))
            {
                isDuplicateExist=true;
                System.out.println("Duplicate Exist"+arr[i]);
            }
            else {
                uniqueNumber.add(arr[i]);
            }
            if (isDuplicateExist)
            {
                System.out.println(-1);
            }
        }
    }
}
