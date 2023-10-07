/*
 * This file was automatically generated by EvoSuite
 * Tue May 16 06:23:01 GMT 2023
 */

package org.jfree.data.xy;

import org.junit.Test;
import static org.junit.Assert.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jfree.data.xy.YInterval;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class YInterval_ESTest extends YInterval_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      YInterval yInterval0 = new YInterval(1469.8766186565408, 1469.8766186565408, 1469.8766186565408);
      YInterval yInterval1 = new YInterval(1469.8766186565408, 1469.8766186565408, 489.4);
      boolean boolean0 = yInterval0.equals(yInterval1);
      assertEquals(1469.8766186565408, yInterval1.getYLow(), 0.01);
      assertFalse(boolean0);
      assertEquals(1469.8766186565408, yInterval1.getY(), 0.01);
      assertFalse(yInterval1.equals((Object)yInterval0));
      assertEquals(1469.8766186565408, yInterval0.getYHigh(), 0.01);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      YInterval yInterval0 = new YInterval(893.466454586625, 893.466454586625, 893.466454586625);
      YInterval yInterval1 = new YInterval(893.466454586625, (-476.5170826), (-2933.0609752));
      boolean boolean0 = yInterval0.equals(yInterval1);
      assertFalse(boolean0);
      assertEquals((-476.5170826), yInterval1.getYLow(), 0.01);
      assertEquals((-2933.0609752), yInterval1.getYHigh(), 0.01);
      assertEquals(893.466454586625, yInterval1.getY(), 0.01);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      YInterval yInterval0 = new YInterval(1.0, 1.0, 0.0);
      YInterval yInterval1 = new YInterval((-1.0), 2091.847108643, 1.0);
      boolean boolean0 = yInterval0.equals(yInterval1);
      assertEquals(2091.847108643, yInterval1.getYLow(), 0.01);
      assertEquals(1.0, yInterval1.getYHigh(), 0.01);
      assertFalse(boolean0);
      assertEquals((-1.0), yInterval1.getY(), 0.01);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      YInterval yInterval0 = new YInterval(1.0, 0.0, 0.0);
      double double0 = yInterval0.getYLow();
      assertEquals(0.0, yInterval0.getYHigh(), 0.01);
      assertEquals(1.0, yInterval0.getY(), 0.01);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      YInterval yInterval0 = new YInterval(1.0, 1.0, 1.0);
      double double0 = yInterval0.getYLow();
      assertEquals(1.0, yInterval0.getY(), 0.01);
      assertEquals(1.0, double0, 0.01);
      assertEquals(1.0, yInterval0.getYHigh(), 0.01);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      YInterval yInterval0 = new YInterval(1.0, 0.0, 0.0);
      double double0 = yInterval0.getYHigh();
      assertEquals(1.0, yInterval0.getY(), 0.01);
      assertEquals(0.0, double0, 0.01);
      assertEquals(0.0, yInterval0.getYLow(), 0.01);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      YInterval yInterval0 = new YInterval((-100.86), (-100.86), 1335.5);
      double double0 = yInterval0.getYHigh();
      assertEquals(1335.5, double0, 0.01);
      assertEquals((-100.86), yInterval0.getY(), 0.01);
      assertEquals((-100.86), yInterval0.getYLow(), 0.01);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      YInterval yInterval0 = new YInterval(0.0, 0.0, 0.0);
      double double0 = yInterval0.getY();
      assertEquals(0.0, yInterval0.getYLow(), 0.01);
      assertEquals(0.0, double0, 0.01);
      assertEquals(0.0, yInterval0.getYHigh(), 0.01);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      YInterval yInterval0 = new YInterval(1.0, 0.0, 0.0);
      double double0 = yInterval0.getY();
      assertEquals(1.0, double0, 0.01);
      assertEquals(0.0, yInterval0.getYLow(), 0.01);
      assertEquals(0.0, yInterval0.getYHigh(), 0.01);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      YInterval yInterval0 = new YInterval((-100.86), (-100.86), (-100.86));
      YInterval yInterval1 = new YInterval((-100.86), (-100.86), 1335.5);
      boolean boolean0 = yInterval0.equals(yInterval1);
      assertEquals((-100.86), yInterval1.getYLow(), 0.01);
      assertFalse(yInterval1.equals((Object)yInterval0));
      assertFalse(boolean0);
      assertEquals((-100.86), yInterval1.getY(), 0.01);
      assertEquals((-100.86), yInterval0.getYHigh(), 0.01);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      YInterval yInterval0 = new YInterval(1.0, 0.0, 0.0);
      YInterval yInterval1 = new YInterval(1.0, 1.0, 0.0);
      boolean boolean0 = yInterval0.equals(yInterval1);
      assertEquals(0.0, yInterval1.getYHigh(), 0.01);
      assertFalse(boolean0);
      assertEquals(1.0, yInterval0.getY(), 0.01);
      assertFalse(yInterval1.equals((Object)yInterval0));
      assertEquals(1.0, yInterval1.getYLow(), 0.01);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      YInterval yInterval0 = new YInterval((-100.86), (-100.86), (-100.86));
      YInterval yInterval1 = new YInterval((-1.0), (-2586.53942), 1.0);
      boolean boolean0 = yInterval0.equals(yInterval1);
      assertEquals((-1.0), yInterval1.getY(), 0.01);
      assertEquals((-2586.53942), yInterval1.getYLow(), 0.01);
      assertEquals(1.0, yInterval1.getYHigh(), 0.01);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      YInterval yInterval0 = new YInterval((-1.0), (-1.0), (-1.0));
      YInterval yInterval1 = new YInterval((-1.0), (-1.0), (-1.0));
      boolean boolean0 = yInterval0.equals(yInterval1);
      assertTrue(boolean0);
      assertEquals((-1.0), yInterval1.getYLow(), 0.01);
      assertEquals((-1.0), yInterval1.getYHigh(), 0.01);
      assertEquals((-1.0), yInterval1.getY(), 0.01);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      YInterval yInterval0 = new YInterval((-1.0), (-1.0), (-1.0));
      boolean boolean0 = yInterval0.equals(yInterval0);
      assertTrue(boolean0);
      assertEquals((-1.0), yInterval0.getY(), 0.01);
      assertEquals((-1.0), yInterval0.getYHigh(), 0.01);
      assertEquals((-1.0), yInterval0.getYLow(), 0.01);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      YInterval yInterval0 = new YInterval((-1.0), (-1.0), (-1.0));
      boolean boolean0 = yInterval0.equals("g4_}E\"4KBL");
      assertEquals((-1.0), yInterval0.getYHigh(), 0.01);
      assertEquals((-1.0), yInterval0.getYLow(), 0.01);
      assertEquals((-1.0), yInterval0.getY(), 0.01);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      YInterval yInterval0 = new YInterval((-1.0), (-1.0), (-1.0));
      double double0 = yInterval0.getY();
      assertEquals((-1.0), double0, 0.01);
      assertEquals((-1.0), yInterval0.getYLow(), 0.01);
      assertEquals((-1.0), yInterval0.getYHigh(), 0.01);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      YInterval yInterval0 = new YInterval((-1.0), (-1.0), (-1.0));
      double double0 = yInterval0.getYLow();
      assertEquals((-1.0), double0, 0.01);
      assertEquals((-1.0), yInterval0.getY(), 0.01);
      assertEquals((-1.0), yInterval0.getYHigh(), 0.01);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      YInterval yInterval0 = new YInterval((-1.0), (-1.0), (-1.0));
      double double0 = yInterval0.getYHigh();
      assertEquals((-1.0), double0, 0.01);
      assertEquals((-1.0), yInterval0.getYLow(), 0.01);
      assertEquals((-1.0), yInterval0.getY(), 0.01);
  }
}
