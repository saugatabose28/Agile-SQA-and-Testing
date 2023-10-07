/*
 * This file was automatically generated by EvoSuite
 * Tue May 16 06:22:36 GMT 2023
 */

package org.jfree.chart.plot;

import org.junit.Test;
import static org.junit.Assert.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jfree.chart.plot.DialShape;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class DialShape_ESTest extends DialShape_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      DialShape dialShape0 = DialShape.CIRCLE;
      DialShape dialShape1 = DialShape.PIE;
      boolean boolean0 = dialShape0.equals(dialShape1);
      assertFalse(dialShape1.equals((Object)dialShape0));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      DialShape dialShape0 = DialShape.CHORD;
      String string0 = dialShape0.toString();
      assertEquals("DialShape.CHORD", string0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      DialShape dialShape0 = DialShape.PIE;
      boolean boolean0 = dialShape0.equals((Object) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      DialShape dialShape0 = DialShape.PIE;
      boolean boolean0 = dialShape0.equals(dialShape0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      DialShape dialShape0 = DialShape.CIRCLE;
      dialShape0.hashCode();
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      DialShape dialShape0 = DialShape.CIRCLE;
      DialShape dialShape1 = DialShape.CHORD;
      boolean boolean0 = dialShape0.equals(dialShape1);
      assertFalse(boolean0);
      assertFalse(dialShape1.equals((Object)dialShape0));
  }
}
