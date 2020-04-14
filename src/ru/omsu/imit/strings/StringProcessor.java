package ru.omsu.imit.strings;

import java.util.Scanner;

public class StringProcessor {
    static Scanner in = new Scanner(System.in);


    public static String copyString(String s, int n){
        String ans = new String();
        if (n<0)throw new IllegalArgumentException("invalid n");
        for (int i=0;i<n;++i){
            ans+=s;
        }
        return ans;
    }
    public static int countIncertions(String s1, String s2){
        int count = 0;
        for (int i = 0;i<s1.length()-s2.length()+1; ++i){
            if(s2.compareTo(s1.substring(i,i+s2.length()))==0)count++;
        }
        return count;
    }
    public static String numToText(String s){
        for (int i =0;i<s.length();++i){
            switch (s.charAt(i)) {
                case '1':
                    s = s.substring(0,i)+"one"+s.substring(i+1);
                    break;
                case '2':
                    s = s.substring(0,i)+"two"+s.substring(i+1);
                    break;
                case '3':
                    s = s.substring(0,i)+"three"+s.substring(i+1);
                    break;
            }
        }
        return s;
    }
    public static void deleteEvenSymbols(StringBuilder s){
        for(int i=1;i<s.length();++i){
            s.deleteCharAt(i);
        }
    }
    public static void changeWords(StringBuilder s){
        int ifirst=0, ilast=0;
        for(int i=1;i<s.length();++i){
            if(s.charAt(i)==' '){ifirst=i; break;}

        }
        for(int i=s.length()-1;i>0;--i){
            if(s.charAt(i)==' '){ilast=i; break;}
        }
        String temp = s.substring(ilast+1);
        s.replace(ilast,s.length(),s.substring(0,ifirst));
        s.replace(0,ifirst,temp);
    }

    public static void main(String[] args) {
        String s = "String1";
        String s1 = copyString(s,5);
        System.out.println(copyString(s,5));
        System.out.println(countIncertions(s1,s));
        String s2 = "string";
        String s3 = "abcstring str string";
        System.out.println(countIncertions(s3,s2));
        System.out.println(numToText(s1));

        StringBuilder sb = new StringBuilder("ffppyyhhssqq");
        deleteEvenSymbols(sb);
        System.out.println(sb);
        StringBuilder sb1 = new StringBuilder("word peach unicorn seven last");
        changeWords(sb1);
        System.out.println(sb1);

    }
}
