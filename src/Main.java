import java.util.*;
public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        permutation(arr, 0, 3, 3);
    }

    static void permutation(int[] arr, int depth,int n, int r) {
        if (depth == arr.length) {
            print(arr, n);
            return;
        }

        for (int i = depth; i < n; i++) {
            swap(arr, depth, i);
            permutation(arr, depth+1, n, r);
            swap(arr, depth, i);
        }
    }

    static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    static void print(int[] arr, int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
