package com.realestate.backend.Standalone;

import java.util.Arrays;

public class Test12 {
    public static void main(String[] args) {
        int[] arr=new int[]{2,-3,4,6,1};
        int k=2;
        System.out.println(findMaxSumWithJumps(arr, k));
//        int maxSum= Integer.MIN_VALUE;
//        int bestIndex=-1;
//        for(int i=0;i<arr.length;i++){
//            int sum=0;
//            for(int j=i;j<arr.length;j+=k){
//                sum+=arr[j];
//            }
//            if(sum > maxSum){
//                maxSum=sum;
//                bestIndex=i;
//            }
//        }
//
//        System.out.println("MaxSum: "+ maxSum);
//        System.out.println("Node: "+ bestIndex+1);
    }

    public static int findMaxSumWithJumps(int[] arr, int k) {
        int n = arr.length;
        int[] maxSums = new int[k];
        int[] startingIndex = new int[k];

        Arrays.fill(maxSums, Integer.MIN_VALUE);

        for (int i = 0; i < n; i++) {
            int mod = i % k;
            if (maxSums[mod] == Integer.MIN_VALUE) {
                maxSums[mod] = 0;
                startingIndex[mod] = i;
            }
            maxSums[mod] += arr[i];
        }

        int maxSum = Integer.MIN_VALUE;
        int bestIndex = -1;
        for (int i = 0; i < k; i++) {
            if (maxSums[i] > maxSum) {
                maxSum = maxSums[i];
                bestIndex = startingIndex[i];
            }
        }
        System.out.println("MaxSum: "+ maxSum);
        return maxSum;
    }

}
