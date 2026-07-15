import java.util.*;

public class lec1 {
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

    public static void display2(int[] arr) {
        for (int elem : arr) {
            System.out.print(elem + "\t");
        }
    }

    public static int max(int[] arr) {
        int maxElem = -(int) 1e9;
        for (int elem : arr) {
            maxElem = Math.max(maxElem, elem);
        }
        return maxElem;
    }

    public static int max2(int[] arr) {
        if (arr.length == 0) {
            return Integer.MIN_VALUE;
        }
        int maxElem = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < arr[i + 1]) {
                maxElem = arr[i + 1];
            } else {
                maxElem = arr[i];
            }
        }
        return maxElem;
    }

    public static int min(int[] arr) {
        int minElem = (int) 1e9;
        for (int elem : arr) {
            minElem = Math.min(elem, minElem);
        }
        return minElem;
    }

    public static int find(int[] arr, int data) {
        int foundAtIdx = -1;
        for (int i = 0; i < arr.length; i++) {
            if (data == arr[i]) {
                foundAtIdx = i;
            }
        }
        return foundAtIdx;
    }

    public static void main(String[] args) {
        System.out.println(find(input1(scn.nextInt()), scn.nextInt()));
    }
}

// https://github.com/HrithikSaxenaNarayan/Velammal