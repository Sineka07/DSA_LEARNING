//Time complexity: O(nlog2n)
//space complexity: O(n)
import java.util.*;
// java.lang is imported automatically; explicit import removed
import java.io.*;
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        for(int i=0;i<n;i++)
        {
            nums1[m+i]=nums2[i];
        }
         Arrays.sort(nums1);
    }
}
