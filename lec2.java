import java.util.*;

public class lec2 {
    public static Scanner scn = new Scanner(System.in);

    public static int[] input1(int n) {
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        return arr;
    }

    public static void display1(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
    }

    public static void addTwoArrays(int[] arr, int[] brr) {
        int n = arr.length, m = brr.length;
        int ansArrLen = Math.max(n, m) + 1;
        int[] ansArr = new int[ansArrLen];
        int i = n - 1, j = m - 1, k = ansArrLen - 1, carry = 0;

        while (k >= 0) {
            int sum = carry + ((i >= 0) ? arr[i] : 0) + ((j >= 0) ? brr[j] : 0);

            carry = sum / 10;
            ansArr[k] = sum % 10;

            i--;
            j--;
            k--;
        }

        for (int idx = 0; idx < ansArr.length; idx++) {
            System.out.print(ansArr[idx] + "\t");
        }
    }


    public static int[] subTwoArrays(int[] arr, int[] brr) {
        int n = arr.length, m = brr.length;
        int ansArrLen = Math.max(n, m);
        int[] ansArr = new int[ansArrLen];
        int i = n - 1, j = m - 1, k = ansArrLen - 1, borrow = 0;

        while(k >= 0) {
            int diff = borrow + ((i >= 0)? arr[i] : 0) - ((j >= 0) ? brr[j] : 0);

            if (diff < 0) {
                borrow = -1;
                diff += 10;
            }
            else {
                borrow = 0;
            }
            ansArr[k] = diff;

            i--;
            j--;
            k--;
        }
        return ansArr;
    }
    public static void main(String[] args) {
        display1(subTwoArrays(input1(scn.nextInt()), input1(scn.nextInt())));
    }
}