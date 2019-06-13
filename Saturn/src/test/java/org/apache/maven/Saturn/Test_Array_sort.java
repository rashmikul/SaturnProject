package org.apache.maven.Saturn;
import org.junit.runners.Parameterized.Parameters;

import org.junit.Test;
import java.util.Arrays;
import java.util.Collection;

public class Test_Array_sort {
	@Parameters
	public static Collection<Object[]> parameters(){
	    return Arrays.asList(new Object[][]{
	        {new int[] {1,4,1,6,3,5}, 6, new int[] {1,1,3,4,5,6}},
	        {new int[] {1,4,1,6,3,5}, 6, new int[] {1,3,1,4,5,6}},
	        {new int[] {70000,4,1,6,3,5}, 7, new int[] {1,3,4,5,6,70000}},
	    });
	}

	@Test
	public void test() {
		int arrayIn = 0, arrayOut=0;
	new Test_Array_sort().sort(arrayIn);

	Test_array(arrayOut, arrayIn);
	}

	private void Test_array(int arrayOut, int arrayIn) {
		
	}

	private void sort(int arrayIn) {
		
	}
}

	
