package Algorithms.Searching.LinearSearch;

import java.util.*;

/**
 * Created by Navneet Sharma (navneetzz) ryu on 5/7/17.
 */
public class SimpleSearch {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for (int i=0;i<n;i++)
            arr[i] = in.nextInt();
        int k = in.nextInt();
        for (int i=0;i<n;i++) {
            if (arr[i]==k) {
                System.out.println(i);
                break;
            }
        }
        in.close();
    }
}
