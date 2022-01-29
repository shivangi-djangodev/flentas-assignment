package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int j =sc.nextInt(); String p,s;
        int count=0,count1=0;
        for(int i =1;i<=j;i++){
            p=sc.next();
            s=sc.next();
            char p1[] = p.toCharArray();
            count1 = p1.length;
            ArrayList<Character> s1= new ArrayList<>();
            for (Character c:s.toCharArray()){
                s1.add(c);
            }
            for (Character p2:p1){
                if (s1.contains(p2)){
                    count++;
                    int temp =s1.indexOf(p2);
                    s1.remove(temp);
                }
            }
            if (count == count1){

                System.out.println("YES");
                count =0;
            }else {
                System.out.println("NO");
                count =0;
            }

        }
    }
}
