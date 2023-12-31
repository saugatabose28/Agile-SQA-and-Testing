/*
 * This file was automatically generated by EvoSuite
 * Tue May 16 06:25:09 GMT 2023
 */

package org.jfree.chart.axis;

import org.junit.Test;
import static org.junit.Assert.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jfree.chart.axis.AxisLabelLocation;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class AxisLabelLocation_ESTest extends AxisLabelLocation_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      AxisLabelLocation axisLabelLocation0 = AxisLabelLocation.HIGH_END;
      AxisLabelLocation axisLabelLocation1 = AxisLabelLocation.LOW_END;
      boolean boolean0 = axisLabelLocation0.equals(axisLabelLocation1);
      assertFalse(axisLabelLocation1.equals((Object)axisLabelLocation0));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      AxisLabelLocation axisLabelLocation0 = AxisLabelLocation.MIDDLE;
      String string0 = axisLabelLocation0.toString();
      assertEquals("MIDDLE", string0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      AxisLabelLocation axisLabelLocation0 = AxisLabelLocation.LOW_END;
      boolean boolean0 = axisLabelLocation0.equals("MIDDE");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      AxisLabelLocation axisLabelLocation0 = AxisLabelLocation.HIGH_END;
      boolean boolean0 = axisLabelLocation0.equals(axisLabelLocation0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      AxisLabelLocation axisLabelLocation0 = AxisLabelLocation.LOW_END;
      AxisLabelLocation axisLabelLocation1 = AxisLabelLocation.MIDDLE;
      boolean boolean0 = axisLabelLocation0.equals(axisLabelLocation1);
      assertFalse(axisLabelLocation1.equals((Object)axisLabelLocation0));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      AxisLabelLocation axisLabelLocation0 = AxisLabelLocation.LOW_END;
      axisLabelLocation0.hashCode();
  }
}
