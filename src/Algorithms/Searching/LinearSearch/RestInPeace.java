package Algorithms.Searching.LinearSearch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Navneet Sharma (navneetzz) ryu on 5/7/17.
 */
public class RestInPeace {
    public static void main (String[] args) throws IOException {
        //Scanner in = new Scanner(System.in);
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(in.readLine());
        for (int i=0;i<n;i++) {
            String s = in.readLine();
            int num = Integer.parseInt(s);
            if (num%21==0 || s.contains("21"))
                System.out.println("The streak is broken!");
            else
                System.out.println("The streak lives still in our heart!");
        }
        in.close();
    }
}
