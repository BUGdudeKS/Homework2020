package com.cbt.utilities;

public class StringUtility {
    public static void verifyEquals(String expected, String actual)
    {
        if(expected.equals(actual))
        {
            System.out.println("PASS");
            System.out.println("expected = " + expected);
            System.out.println("actual = " + actual);
        }
        else
        {
            System.out.println("FAIL");
            System.out.println("expected = " + expected);
            System.out.println("actual = " + actual);
        }
    }
    public static void verifyEquals(boolean assertion)
    {
        if(assertion)
        {
            System.out.println("PASS");
            // System.out.println("expected = " + expected);
            System.out.println("actual = " + assertion);
        }
        else
        {
            System.out.println("FAIL");
            //System.out.println("expected = " + expected);
            System.out.println("actual = " + assertion);
        }
    }
}


}
