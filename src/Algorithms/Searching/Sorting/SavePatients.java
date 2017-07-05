package Algorithms.Searching.Sorting;

import java.util.*;

/**
 * Created by Navneet Sharma (navneetzz) ryu on 5/7/17.
 */
public class SavePatients {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        boolean bool = true;
        for (int i=0;i<n;i++) a[i] = in.nextInt();
        for (int i=0;i<n;i++) b[i] = in.nextInt();
        for (int i=0;i<n-1;i++) {
            for (int j=0;j<n-i-1;j++) {
                if (a[j]>a[j+1]) {
                    int temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
                if (b[j]>b[j+1]) {
                    int temp=b[j+1];
                    b[j+1]=b[j];
                    b[j]=temp;
                }
                if (a[j]<=b[j]) bool=false;
            }
        }
        System.out.println(bool?"Yes":"No");
    }
}
