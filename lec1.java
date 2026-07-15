import java.util.*;
public class lec1{
    public static Scanner scn = new Scanner(System.in);

    public static int[] input1(int n){
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
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
        int maxElem = 0;

        return maxElem;
    }

    public static int min(int[] arr) {
        int minElem = 0;

        return minElem;
    }


    public static void main(String[] args){
        display2(input1(scn.nextInt()));
    }
}