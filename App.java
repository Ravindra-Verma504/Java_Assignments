package org.example;

/**
 * Hello world!
 *
 */
public class App 
{
    public static String ReverseString(String str)
    {
        String rstr="";
        char ch;
        for (int i=0; i<str.length(); i++)
        {
            ch= str.charAt(i);
            rstr= ch+rstr;
        }
        return rstr;
    }
}
