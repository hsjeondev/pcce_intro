package day06;

import java.util.Scanner;

public class Solution02 {
    public void solution(int n) {
        
        for(int i = 0; i < n; i++) {
            for(int j=0; j < i+1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
