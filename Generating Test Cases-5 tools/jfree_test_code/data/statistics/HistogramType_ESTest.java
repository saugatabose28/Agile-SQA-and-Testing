/*
 * This file was automatically generated by EvoSuite
 * Tue May 16 05:06:39 GMT 2023
 */

package org.jfree.data.statistics;

import org.junit.Test;
import static org.junit.Assert.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jfree.data.statistics.HistogramType;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class HistogramType_ESTest extends HistogramType_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      HistogramType histogramType0 = HistogramType.RELATIVE_FREQUENCY;
      HistogramType histogramType1 = HistogramType.SCALE_AREA_TO_1;
      boolean boolean0 = histogramType0.equals(histogramType1);
      assertFalse(histogramType1.equals((Object)histogramType0));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      HistogramType histogramType0 = HistogramType.RELATIVE_FREQUENCY;
      boolean boolean0 = histogramType0.equals("Fy0dJw~s");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      HistogramType histogramType0 = HistogramType.SCALE_AREA_TO_1;
      HistogramType histogramType1 = HistogramType.RELATIVE_FREQUENCY;
      boolean boolean0 = histogramType0.equals(histogramType1);
      assertFalse(histogramType1.equals((Object)histogramType0));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      HistogramType histogramType0 = HistogramType.SCALE_AREA_TO_1;
      boolean boolean0 = histogramType0.equals((Object) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      HistogramType histogramType0 = HistogramType.SCALE_AREA_TO_1;
      boolean boolean0 = histogramType0.equals(histogramType0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      HistogramType histogramType0 = HistogramType.SCALE_AREA_TO_1;
      histogramType0.hashCode();
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      HistogramType histogramType0 = HistogramType.SCALE_AREA_TO_1;
      String string0 = histogramType0.toString();
      assertEquals("SCALE_AREA_TO_1", string0);
  }
}
