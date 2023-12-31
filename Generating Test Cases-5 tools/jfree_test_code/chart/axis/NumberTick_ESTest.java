/*
 * This file was automatically generated by EvoSuite
 * Tue May 16 05:26:43 GMT 2023
 */

package org.jfree.chart.axis;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.jfree.chart.axis.NumberTick;
import org.jfree.chart.axis.TickType;
import org.jfree.chart.ui.TextAnchor;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class NumberTick_ESTest extends NumberTick_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      TickType tickType0 = mock(TickType.class, new ViolatedAssumptionAnswer());
      TextAnchor textAnchor0 = mock(TextAnchor.class, new ViolatedAssumptionAnswer());
      NumberTick numberTick0 = new NumberTick(tickType0, 617.1683542391916, "gD", textAnchor0, textAnchor0, 617.1683542391916);
      Number number0 = numberTick0.getNumber();
      assertEquals(617.1683542391916, number0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      TickType tickType0 = mock(TickType.class, new ViolatedAssumptionAnswer());
      NumberTick numberTick0 = null;
      try {
        numberTick0 = new NumberTick(tickType0, 1292.6965, "", (TextAnchor) null, (TextAnchor) null, 1.0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'textAnchor' argument.
         //
         verifyException("org.jfree.chart.util.Args", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      TickType tickType0 = mock(TickType.class, new ViolatedAssumptionAnswer());
      TextAnchor textAnchor0 = mock(TextAnchor.class, new ViolatedAssumptionAnswer());
      NumberTick numberTick0 = new NumberTick(tickType0, (-291.808155), (String) null, textAnchor0, textAnchor0, (-291.808155));
      Number number0 = numberTick0.getNumber();
      NumberTick numberTick1 = null;
      try {
        numberTick1 = new NumberTick(number0, "M", (TextAnchor) null, (TextAnchor) null, 0.0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'textAnchor' argument.
         //
         verifyException("org.jfree.chart.util.Args", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      TextAnchor textAnchor0 = mock(TextAnchor.class, new ViolatedAssumptionAnswer());
      NumberTick numberTick0 = new NumberTick((TickType) null, 0.0, "8H(uxr^", textAnchor0, textAnchor0, 0.0);
      Number number0 = numberTick0.getNumber();
      assertEquals(0.0, number0);
      
      TextAnchor textAnchor1 = mock(TextAnchor.class, new ViolatedAssumptionAnswer());
      TextAnchor textAnchor2 = mock(TextAnchor.class, new ViolatedAssumptionAnswer());
      NumberTick numberTick1 = new NumberTick(number0, "org.jfree.chart.axis.NumberTick", textAnchor1, textAnchor2, 0.0);
      assertEquals(0.0, numberTick1.getValue(), 0.01);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      NumberTick numberTick0 = null;
      try {
        numberTick0 = new NumberTick((Number) null, "sp^o78:m#", (TextAnchor) null, (TextAnchor) null, 0.0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.axis.NumberTick", e);
      }
  }
}
