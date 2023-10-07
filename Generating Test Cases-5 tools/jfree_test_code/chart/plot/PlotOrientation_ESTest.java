/*
 * This file was automatically generated by EvoSuite
 * Tue May 16 06:32:12 GMT 2023
 */

package org.jfree.chart.plot;

import org.junit.Test;
import static org.junit.Assert.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jfree.chart.plot.PlotOrientation;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class PlotOrientation_ESTest extends PlotOrientation_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      PlotOrientation plotOrientation0 = PlotOrientation.HORIZONTAL;
      boolean boolean0 = plotOrientation0.isVertical();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      PlotOrientation plotOrientation0 = PlotOrientation.HORIZONTAL;
      boolean boolean0 = plotOrientation0.isHorizontal();
      assertTrue(boolean0);
      assertFalse(plotOrientation0.isVertical());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      PlotOrientation plotOrientation0 = PlotOrientation.VERTICAL;
      PlotOrientation plotOrientation1 = PlotOrientation.HORIZONTAL;
      boolean boolean0 = plotOrientation0.equals(plotOrientation1);
      assertFalse(plotOrientation1.isVertical());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      PlotOrientation plotOrientation0 = PlotOrientation.HORIZONTAL;
      boolean boolean0 = plotOrientation0.equals(plotOrientation0);
      assertFalse(plotOrientation0.isVertical());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      PlotOrientation plotOrientation0 = PlotOrientation.HORIZONTAL;
      String string0 = plotOrientation0.toString();
      assertEquals("PlotOrientation.HORIZONTAL", string0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      PlotOrientation plotOrientation0 = PlotOrientation.VERTICAL;
      Object object0 = new Object();
      boolean boolean0 = plotOrientation0.equals(object0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      PlotOrientation plotOrientation0 = PlotOrientation.VERTICAL;
      boolean boolean0 = plotOrientation0.isHorizontal();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      PlotOrientation plotOrientation0 = PlotOrientation.VERTICAL;
      plotOrientation0.hashCode();
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      PlotOrientation plotOrientation0 = PlotOrientation.VERTICAL;
      boolean boolean0 = plotOrientation0.isVertical();
      assertTrue(boolean0);
      assertFalse(plotOrientation0.isHorizontal());
  }
}
