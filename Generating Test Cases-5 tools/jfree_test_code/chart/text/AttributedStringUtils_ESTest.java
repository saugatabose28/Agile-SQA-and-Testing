/*
 * This file was automatically generated by EvoSuite
 * Tue May 16 05:09:42 GMT 2023
 */

package org.jfree.chart.text;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.text.AttributedCharacterIterator;
import java.text.AttributedString;
import java.util.Map;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.jfree.chart.text.AttributedStringUtils;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class AttributedStringUtils_ESTest extends AttributedStringUtils_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      AttributedCharacterIterator attributedCharacterIterator0 = mock(AttributedCharacterIterator.class, new ViolatedAssumptionAnswer());
      doReturn((Map) null).when(attributedCharacterIterator0).getAttributes();
      doReturn(0).when(attributedCharacterIterator0).getRunLimit();
      doReturn('a').when(attributedCharacterIterator0).first();
      AttributedString attributedString0 = mock(AttributedString.class, new ViolatedAssumptionAnswer());
      doReturn(attributedCharacterIterator0).when(attributedString0).getIterator();
      AttributedCharacterIterator attributedCharacterIterator1 = mock(AttributedCharacterIterator.class, new ViolatedAssumptionAnswer());
      doReturn((Map) null).when(attributedCharacterIterator1).getAttributes();
      doReturn(0).when(attributedCharacterIterator1).getRunLimit();
      doReturn('a').when(attributedCharacterIterator1).first();
      AttributedString attributedString1 = mock(AttributedString.class, new ViolatedAssumptionAnswer());
      doReturn(attributedCharacterIterator1).when(attributedString1).getIterator();
      // Undeclared exception!
      try { 
        AttributedStringUtils.equal(attributedString0, attributedString1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.text.AttributedStringUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      AttributedString attributedString0 = mock(AttributedString.class, new ViolatedAssumptionAnswer());
      boolean boolean0 = AttributedStringUtils.equal(attributedString0, (AttributedString) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      AttributedString attributedString0 = mock(AttributedString.class, new ViolatedAssumptionAnswer());
      doReturn((AttributedCharacterIterator) null).when(attributedString0).getIterator();
      AttributedString attributedString1 = mock(AttributedString.class, new ViolatedAssumptionAnswer());
      doReturn((AttributedCharacterIterator) null).when(attributedString1).getIterator();
      // Undeclared exception!
      try { 
        AttributedStringUtils.equal(attributedString0, attributedString1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.text.AttributedStringUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      AttributedString attributedString0 = mock(AttributedString.class, new ViolatedAssumptionAnswer());
      doReturn((AttributedCharacterIterator) null, (AttributedCharacterIterator) null).when(attributedString0).getIterator();
      // Undeclared exception!
      try { 
        AttributedStringUtils.equal(attributedString0, attributedString0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.text.AttributedStringUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      AttributedStringUtils.equal((AttributedString) null, (AttributedString) null);
      AttributedStringUtils.equal((AttributedString) null, (AttributedString) null);
      AttributedStringUtils.equal((AttributedString) null, (AttributedString) null);
      AttributedStringUtils.equal((AttributedString) null, (AttributedString) null);
      AttributedStringUtils.equal((AttributedString) null, (AttributedString) null);
      AttributedStringUtils.equal((AttributedString) null, (AttributedString) null);
      AttributedStringUtils.equal((AttributedString) null, (AttributedString) null);
      AttributedStringUtils.equal((AttributedString) null, (AttributedString) null);
      AttributedStringUtils.equal((AttributedString) null, (AttributedString) null);
      AttributedStringUtils.equal((AttributedString) null, (AttributedString) null);
      AttributedStringUtils.equal((AttributedString) null, (AttributedString) null);
      AttributedStringUtils.equal((AttributedString) null, (AttributedString) null);
      AttributedStringUtils.equal((AttributedString) null, (AttributedString) null);
      AttributedStringUtils.equal((AttributedString) null, (AttributedString) null);
      AttributedStringUtils.equal((AttributedString) null, (AttributedString) null);
      boolean boolean0 = AttributedStringUtils.equal((AttributedString) null, (AttributedString) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      AttributedCharacterIterator attributedCharacterIterator0 = mock(AttributedCharacterIterator.class, new ViolatedAssumptionAnswer());
      doReturn((Map) null, (Map) null).when(attributedCharacterIterator0).getAttributes();
      doReturn(0, 0).when(attributedCharacterIterator0).getRunLimit();
      doReturn('a', 'a').when(attributedCharacterIterator0).first();
      AttributedString attributedString0 = mock(AttributedString.class, new ViolatedAssumptionAnswer());
      doReturn(attributedCharacterIterator0, attributedCharacterIterator0).when(attributedString0).getIterator();
      // Undeclared exception!
      try { 
        AttributedStringUtils.equal(attributedString0, attributedString0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.text.AttributedStringUtils", e);
      }
  }
}
