
package ru.omsu.imit.strings;


import static org.junit.Assert.*;
import static ru.omsu.imit.strings.StringProcessor.*;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class StringProcessorTest{
    String s = "String1";
    String s2 = "string";
    String s3 = "abcstring str string";
    String s4 = "1 33 4 23";
//    @BeforeClass
//    public static void setup(){
//        String s = "String1";
//    }

    @Test
    public void copyStringTest(){
        String s1 = copyString(s,5);
        System.out.println(s1);
    }
    @Test
    public void countInsertionTest(){
        String s1 = copyString(s,5);
        System.out.println(countIncertions(s1,s));
        assertTrue(countIncertions(s1,s)==5);
        System.out.println(countIncertions(s3,s2));
        assertTrue(countIncertions(s3,s2)==2);
    }
    @Test
    public void numToTextTest(){
        assertTrue(numToText(s4).equals("one threethree 4 twothree"));
        System.out.println(numToText(s4));
    }
}

