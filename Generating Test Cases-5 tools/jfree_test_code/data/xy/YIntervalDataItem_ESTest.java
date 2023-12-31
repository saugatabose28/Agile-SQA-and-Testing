/*
 * This file was automatically generated by EvoSuite
 * Tue May 16 05:14:04 GMT 2023
 */

package org.jfree.data.xy;

import org.junit.Test;
import static org.junit.Assert.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jfree.data.xy.YIntervalDataItem;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class YIntervalDataItem_ESTest extends YIntervalDataItem_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      YIntervalDataItem yIntervalDataItem0 = new YIntervalDataItem(Double.NaN, 0.0, 0.0, 0.0);
      double double0 = yIntervalDataItem0.getYValue();
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      YIntervalDataItem yIntervalDataItem0 = new YIntervalDataItem(0.0, 325.715, 1375.7407596389853, 1375.7407596389853);
      double double0 = yIntervalDataItem0.getYValue();
      assertEquals(325.715, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      YIntervalDataItem yIntervalDataItem0 = new YIntervalDataItem(Double.NaN, 0.0, 0.0, 0.0);
      double double0 = yIntervalDataItem0.getYLowValue();
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      YIntervalDataItem yIntervalDataItem0 = new YIntervalDataItem(1.0, 1926.507, 1926.507, 1.0);
      double double0 = yIntervalDataItem0.getYLowValue();
      assertEquals(1926.507, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      YIntervalDataItem yIntervalDataItem0 = new YIntervalDataItem(Double.NaN, 0.0, 0.0, 0.0);
      double double0 = yIntervalDataItem0.getYHighValue();
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      YIntervalDataItem yIntervalDataItem0 = new YIntervalDataItem(1.0, 1926.507, 1926.507, 1.0);
      double double0 = yIntervalDataItem0.getYHighValue();
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      YIntervalDataItem yIntervalDataItem0 = new YIntervalDataItem(2988.0, 2988.0, 2988.0, (-1618.8953835965));
      Double double0 = yIntervalDataItem0.getX();
      assertEquals(2988.0, (double)double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      YIntervalDataItem yIntervalDataItem0 = new YIntervalDataItem(0.0, 0.0, 0.0, 0.0);
      Double double0 = yIntervalDataItem0.getX();
      assertEquals(0.0, (double)double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      YIntervalDataItem yIntervalDataItem0 = new YIntervalDataItem(Double.NaN, 0.0, 0.0, 0.0);
      Double double0 = yIntervalDataItem0.getX();
      assertEquals(Double.NaN, (double)double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      YIntervalDataItem yIntervalDataItem0 = new YIntervalDataItem((-1258.0), (-1.0), (-2724.984), (-1.0));
      Double double0 = yIntervalDataItem0.getX();
      assertEquals((-1258.0), (double)double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      YIntervalDataItem yIntervalDataItem0 = new YIntervalDataItem((-1.0), (-1.0), (-1.0), (-1.0));
      double double0 = yIntervalDataItem0.getYHighValue();
      assertEquals((-1.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      YIntervalDataItem yIntervalDataItem0 = new YIntervalDataItem((-1.0), (-1.0), (-1.0), (-1.0));
      double double0 = yIntervalDataItem0.getYLowValue();
      assertEquals((-1.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      YIntervalDataItem yIntervalDataItem0 = new YIntervalDataItem((-1.0), (-1.0), (-1.0), (-1.0));
      double double0 = yIntervalDataItem0.getYValue();
      assertEquals((-1.0), double0, 0.01);
  }
}
