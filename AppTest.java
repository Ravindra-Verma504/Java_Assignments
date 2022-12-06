package org.example;

//import junit.framework.TestCase;
//import junit.framework.TestSuite;
//import junit.framework.Assert;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Unit test for simple App.
 */
public class AppTest 
//    extends TestCase
{
//    /**
//     * Create the test case
//     *
//     * @param testName name of the test case
//     */
//    public AppTest( String testName )
//    {
//        super( testName );
//    }
//
//    /**
//     * @return the suite of tests being tested
//     */
//    public static Test suite()
//    {
//        return new TestSuite( AppTest.class );
//    }
//
//    /**
//     * Rigourous Test :-)
//     */
//    public void testApp()
//    {
//        assertTrue( true );
    @Test
    public void testReverseString()
    {
        assertEquals("ivar" ,App.ReverseString(new String("ravi")));
    }


}
