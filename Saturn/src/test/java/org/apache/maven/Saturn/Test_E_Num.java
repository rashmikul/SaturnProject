package org.apache.maven.Saturn;
 
import static org.junit.Assert.assertEquals;
 

public class Test_E_Num {
 
    public void testEvenOddNumber(){
        E_Num e = new E_Num();
        assertEquals("Number is a even number", true, e.isEvenNumber(10));
    }
}