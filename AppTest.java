package com.mavenprojects.firstprojects;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
//    @Test
//    public void shouldAnswerWithTrue()
//    {
//        assertTrue( true );
//    }
//    public void shouldAnswerWithFalse()
//    {
//        assertTrue( false );
//    }
	@Test
	public void testfindMax() 
	{
		assertEquals(30,App.findMax(new int[] {1,2,30,4}));
	}
}
