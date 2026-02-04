package com.flipmed.hospital;

import java.util.Arrays;

public class Product {

    public static void main(String[] args) {
        int[] a = new int[4];
        a[0] = 1;
        a[1] = 2;
        a[2] = 3;
        a[3] = 4;
        Product.productOfArrayExceptSelf(a);
    }
    public static void productOfArrayExceptSelf(int a[]) {
        int nums[] = new int[a.length];
        Arrays.fill(nums, 1);
        nums[0] = 1;
        int prod = 1;
        for (int i = 1; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                if (a[i] == a[j]) {
                    continue;
                }
                 prod = prod*a[i] * a[j];
                nums[i] = prod;
            }
        }
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(nums));
    }
}