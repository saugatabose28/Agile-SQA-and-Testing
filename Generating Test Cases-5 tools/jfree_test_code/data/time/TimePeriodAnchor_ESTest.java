/*
 * This file was automatically generated by EvoSuite
 * Tue May 16 05:29:52 GMT 2023
 */

package org.jfree.data.time;

import org.junit.Test;
import static org.junit.Assert.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jfree.data.time.TimePeriodAnchor;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class TimePeriodAnchor_ESTest extends TimePeriodAnchor_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      TimePeriodAnchor timePeriodAnchor0 = TimePeriodAnchor.END;
      TimePeriodAnchor timePeriodAnchor1 = TimePeriodAnchor.MIDDLE;
      boolean boolean0 = timePeriodAnchor0.equals(timePeriodAnchor1);
      assertFalse(timePeriodAnchor1.equals((Object)timePeriodAnchor0));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      TimePeriodAnchor timePeriodAnchor0 = TimePeriodAnchor.MIDDLE;
      boolean boolean0 = timePeriodAnchor0.equals("TimePeriodAnchor.MIDDLE");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      TimePeriodAnchor timePeriodAnchor0 = TimePeriodAnchor.MIDDLE;
      boolean boolean0 = timePeriodAnchor0.equals(timePeriodAnchor0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      TimePeriodAnchor timePeriodAnchor0 = TimePeriodAnchor.MIDDLE;
      TimePeriodAnchor timePeriodAnchor1 = TimePeriodAnchor.START;
      boolean boolean0 = timePeriodAnchor0.equals(timePeriodAnchor1);
      assertFalse(timePeriodAnchor1.equals((Object)timePeriodAnchor0));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      TimePeriodAnchor timePeriodAnchor0 = TimePeriodAnchor.MIDDLE;
      timePeriodAnchor0.hashCode();
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      TimePeriodAnchor timePeriodAnchor0 = TimePeriodAnchor.MIDDLE;
      String string0 = timePeriodAnchor0.toString();
      assertEquals("TimePeriodAnchor.MIDDLE", string0);
  }
}
