import java.util.*;

public class lecc2 {
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
        int i = n-1, j = m - 1, k = ansArr.length - 1, carry = 0;

        while (k >= 0) {
            int sum = ((i >= 0) ? arr[i] : 0) + ((j >= 0) ? brr[j] : 0) + carry;

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
        
        if (isSmaller(arr, brr)) {
            System.out.print("-"); 
            return subTwoArrays(brr, arr); 
        }

        int n = arr.length, m = brr.length;
        int ansArrLen = n; 
        int[] ansArr = new int[ansArrLen];
        int i = n - 1, j = m - 1, k = ansArrLen - 1, borrow = 0;

        while (k >= 0) {
            int val1 = (i >= 0) ? arr[i] : 0;
            int val2 = (j >= 0) ? brr[j] : 0;
            
            int diff = val1 - val2 + borrow;

            if (diff < 0) {
                borrow = -1;
                diff += 10;
            } else {
                borrow = 0;
            }
            ansArr[k] = diff;

            i--;
            j--;
            k--;
        }
        return ansArr;
    }
    public static boolean isSmaller(int[] arr, int[] brr) {
        if (arr.length < brr.length) return true;
        if (arr.length > brr.length) return false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < brr[i]) return true;
            if (arr[i] > brr[i]) return false;
        }
        return false; 
    }

    public static void main(String[] args) {
        display1(subTwoArrays(input1(scn.nextInt()), input1(scn.nextInt())));
    }
}