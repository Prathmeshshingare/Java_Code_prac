package com.arrayq;
public class RotateByKPositions {

    static void rotateByK(int[] arr, int k) {

        int n = arr.length;

        for (int t = 0; t < k; t++) {

            int last = arr[n - 1];

            for (int i = n - 1; i > 0; i--) {
                arr[i] = arr[i - 1];
            }

            arr[0] = last;
        }
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};
        rotateByK(arr, 2);

        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
