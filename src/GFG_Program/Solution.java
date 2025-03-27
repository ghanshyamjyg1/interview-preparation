package GFG_Program;

import java.util.*;



class Solution {
    public int findExtra(int n, int arr1[], int arr2[]) {
        // add code here.
        int IndexOfMissing=0;
        for(int i=0; i< arr2.length;i++)
        {
            if(arr1[i]!=arr2[i])
            {
                IndexOfMissing=i;
                break;
            }
        }
        return IndexOfMissing;
    }
}