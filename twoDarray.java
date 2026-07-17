import java.util.*;

public class twoDarray {
    public static Scanner scn = new Scanner(System.in);

    public static int[][] input(int row, int col) {
        int[][] arr = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                arr[i][j] = scn.nextInt();
            }
        }
        return arr;
    }

    public static void display(int[][] arr) {
        int n = arr.length, m = arr[0].length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static void stateOfWakandaSpiral (int[][] arr) {
        int n = arr.length, m = arr[0].length, tnel = n * m;
        int rmin = 0, rmax = n - 1;
        int cmin = 0, cmax = m-1;

        while(tnel > 0) {
            for (int row = rmin; row <= rmax && tnel > 0; row++) {
                System.out.print(arr[row][cmin] + " ");
                tnel--;
            }
            cmin++;
            System.out.println();

            for (int col = cmin; col <= cmax && tnel > 0; col++) {
                System.out.print(arr[rmax][col] + " ");
                tnel--;
            }
            rmax--;
            System.out.println();

            for (int row = rmax; row >= rmin && tnel > 0; row--) {
                System.out.print(arr[row][cmax] + " ");
                tnel--;
            }
            cmax--;
            System.out.println(); 

            for (int col = cmax; col >= cmin && tnel > 0; col--) {
                System.out.print(arr[rmin][col] + " ");
                tnel--;
            }
            rmin++;
            System.out.println();
        }
    }

    public static void main(String[] args) {
        stateOfWakandaSpiral(input(scn.nextInt(), scn.nextInt()));
    }
}