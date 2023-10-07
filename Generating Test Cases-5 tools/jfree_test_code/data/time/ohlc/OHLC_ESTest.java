/*
 * This file was automatically generated by EvoSuite
 * Tue May 16 05:49:59 GMT 2023
 */

package org.jfree.data.time.ohlc;

import org.junit.Test;
import static org.junit.Assert.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jfree.data.time.ohlc.OHLC;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class OHLC_ESTest extends OHLC_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      OHLC oHLC0 = new OHLC(1.0, 1.0, 1.0, 1.0);
      OHLC oHLC1 = new OHLC(1.0, 1.0, (-1994.0096), 1.0);
      boolean boolean0 = oHLC1.equals(oHLC0);
      assertEquals(1.0, oHLC1.getHigh(), 0.01);
      assertFalse(boolean0);
      assertEquals(1.0, oHLC0.getLow(), 0.01);
      assertFalse(oHLC0.equals((Object)oHLC1));
      assertEquals(1.0, oHLC1.getClose(), 0.01);
      assertEquals(1.0, oHLC1.getOpen(), 0.01);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      OHLC oHLC0 = new OHLC(0.0, 0.0, (-5709.10300217), (-5709.10300217));
      OHLC oHLC1 = new OHLC(0.0, (-5709.10300217), (-4593.6816), (-5709.10300217));
      boolean boolean0 = oHLC1.equals(oHLC0);
      assertEquals((-5709.10300217), oHLC1.getClose(), 0.01);
      assertFalse(boolean0);
      assertEquals((-5709.10300217), oHLC0.getClose(), 0.01);
      assertEquals(0.0, oHLC1.getOpen(), 0.01);
      assertEquals((-4593.6816), oHLC1.getLow(), 0.01);
      assertEquals(0.0, oHLC0.getHigh(), 0.01);
      assertEquals((-5709.10300217), oHLC1.getHigh(), 0.01);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      OHLC oHLC0 = new OHLC(0.0, 0.0, 0.0, (-1.0));
      OHLC oHLC1 = new OHLC(0.0, 0.0, 0.0, 379.7454085045);
      boolean boolean0 = oHLC1.equals(oHLC0);
      assertEquals(379.7454085045, oHLC1.getClose(), 0.01);
      assertEquals(0.0, oHLC1.getLow(), 0.01);
      assertEquals(0.0, oHLC1.getOpen(), 0.01);
      assertFalse(oHLC0.equals((Object)oHLC1));
      assertFalse(boolean0);
      assertEquals(0.0, oHLC1.getHigh(), 0.01);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      OHLC oHLC0 = new OHLC(0.0, 0.0, 0.0, (-1.0));
      OHLC oHLC1 = new OHLC((-1.0), (-2616.525684138786), (-2616.525684138786), (-2.3591799996460976));
      boolean boolean0 = oHLC1.equals(oHLC0);
      assertFalse(boolean0);
      assertEquals((-2616.525684138786), oHLC1.getHigh(), 0.01);
      assertEquals((-2616.525684138786), oHLC1.getLow(), 0.01);
      assertEquals((-1.0), oHLC1.getOpen(), 0.01);
      assertEquals((-2.3591799996460976), oHLC1.getClose(), 0.01);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      OHLC oHLC0 = new OHLC(0.0, (-1416.0), 0.0, (-1416.0));
      double double0 = oHLC0.getOpen();
      assertEquals(0.0, oHLC0.getLow(), 0.01);
      assertEquals((-1416.0), oHLC0.getHigh(), 0.01);
      assertEquals((-1416.0), oHLC0.getClose(), 0.01);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      OHLC oHLC0 = new OHLC((-1.0), (-1.0), 0.0, (-1457.527876137));
      double double0 = oHLC0.getOpen();
      assertEquals((-1.0), oHLC0.getHigh(), 0.01);
      assertEquals(0.0, oHLC0.getLow(), 0.01);
      assertEquals((-1.0), double0, 0.01);
      assertEquals((-1457.527876137), oHLC0.getClose(), 0.01);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      OHLC oHLC0 = new OHLC((-1.0), (-1.0), 0.0, (-1457.527876137));
      double double0 = oHLC0.getLow();
      assertEquals((-1457.527876137), oHLC0.getClose(), 0.01);
      assertEquals((-1.0), oHLC0.getOpen(), 0.01);
      assertEquals(0.0, double0, 0.01);
      assertEquals((-1.0), oHLC0.getHigh(), 0.01);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      OHLC oHLC0 = new OHLC((-1.0), (-1.0), (-1.0), (-1.0));
      double double0 = oHLC0.getLow();
      assertEquals((-1.0), oHLC0.getHigh(), 0.01);
      assertEquals((-1.0), double0, 0.01);
      assertEquals((-1.0), oHLC0.getClose(), 0.01);
      assertEquals((-1.0), oHLC0.getOpen(), 0.01);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      OHLC oHLC0 = new OHLC(1.0, 0.0, 1.0, 1.0);
      double double0 = oHLC0.getHigh();
      assertEquals(1.0, oHLC0.getOpen(), 0.01);
      assertEquals(1.0, oHLC0.getClose(), 0.01);
      assertEquals(0.0, double0, 0.01);
      assertEquals(1.0, oHLC0.getLow(), 0.01);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      OHLC oHLC0 = new OHLC((-1.0), (-1.0), 0.0, (-1457.527876137));
      double double0 = oHLC0.getHigh();
      assertEquals((-1457.527876137), oHLC0.getClose(), 0.01);
      assertEquals((-1.0), oHLC0.getOpen(), 0.01);
      assertEquals((-1.0), double0, 0.01);
      assertEquals(0.0, oHLC0.getLow(), 0.01);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      OHLC oHLC0 = new OHLC(0.0, 0.0, 0.0, 0.0);
      double double0 = oHLC0.getClose();
      assertEquals(0.0, oHLC0.getHigh(), 0.01);
      assertEquals(0.0, oHLC0.getLow(), 0.01);
      assertEquals(0.0, oHLC0.getOpen(), 0.01);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      OHLC oHLC0 = new OHLC((-1.0), (-1.0), (-1.0), (-1.0));
      double double0 = oHLC0.getClose();
      assertEquals((-1.0), oHLC0.getHigh(), 0.01);
      assertEquals((-1.0), oHLC0.getLow(), 0.01);
      assertEquals((-1.0), double0, 0.01);
      assertEquals((-1.0), oHLC0.getOpen(), 0.01);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      OHLC oHLC0 = new OHLC(1.0, 1.0, 1.0, 1.0);
      OHLC oHLC1 = new OHLC(1.0, 1.0, (-1994.0096), 1.0);
      boolean boolean0 = oHLC0.equals(oHLC1);
      assertEquals(1.0, oHLC1.getHigh(), 0.01);
      assertFalse(oHLC1.equals((Object)oHLC0));
      assertEquals(1.0, oHLC1.getOpen(), 0.01);
      assertFalse(boolean0);
      assertEquals(1.0, oHLC1.getClose(), 0.01);
      assertEquals(1.0, oHLC0.getLow(), 0.01);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      OHLC oHLC0 = new OHLC(3186.4035220978944, 3186.4035220978944, (-1885.00086), (-1885.00086));
      OHLC oHLC1 = new OHLC(3186.4035220978944, (-477.9), (-1885.00086), (-1885.00086));
      boolean boolean0 = oHLC0.equals(oHLC1);
      assertFalse(oHLC1.equals((Object)oHLC0));
      assertFalse(boolean0);
      assertEquals((-477.9), oHLC1.getHigh(), 0.01);
      assertEquals(3186.4035220978944, oHLC1.getOpen(), 0.01);
      assertEquals((-1885.00086), oHLC1.getClose(), 0.01);
      assertEquals((-1885.00086), oHLC1.getLow(), 0.01);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      OHLC oHLC0 = new OHLC(0.0, 0.0, 0.0, (-1.0));
      OHLC oHLC1 = new OHLC(0.0, 0.0, 0.0, 379.7454085045);
      boolean boolean0 = oHLC0.equals(oHLC1);
      assertEquals(0.0, oHLC1.getLow(), 0.01);
      assertFalse(oHLC1.equals((Object)oHLC0));
      assertEquals(0.0, oHLC1.getHigh(), 0.01);
      assertEquals(379.7454085045, oHLC1.getClose(), 0.01);
      assertFalse(boolean0);
      assertEquals(0.0, oHLC1.getOpen(), 0.01);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      OHLC oHLC0 = new OHLC(0.0, 0.0, 0.0, (-1.0));
      OHLC oHLC1 = new OHLC((-1.0), (-2616.525684138786), (-2616.525684138786), (-2.3591799996460976));
      boolean boolean0 = oHLC0.equals(oHLC1);
      assertEquals((-1.0), oHLC1.getOpen(), 0.01);
      assertFalse(boolean0);
      assertEquals((-2.3591799996460976), oHLC1.getClose(), 0.01);
      assertEquals((-2616.525684138786), oHLC1.getHigh(), 0.01);
      assertEquals((-2616.525684138786), oHLC1.getLow(), 0.01);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      OHLC oHLC0 = new OHLC(1.0, 1.0, 1.0, 1.0);
      OHLC oHLC1 = new OHLC(1.0, 1.0, 1.0, 1.0);
      boolean boolean0 = oHLC0.equals(oHLC1);
      assertEquals(1.0, oHLC1.getHigh(), 0.01);
      assertEquals(1.0, oHLC1.getLow(), 0.01);
      assertTrue(boolean0);
      assertEquals(1.0, oHLC1.getOpen(), 0.01);
      assertEquals(1.0, oHLC1.getClose(), 0.01);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      OHLC oHLC0 = new OHLC(1.0, 1.0, 1.0, 1.0);
      boolean boolean0 = oHLC0.equals(oHLC0);
      assertEquals(1.0, oHLC0.getLow(), 0.01);
      assertEquals(1.0, oHLC0.getHigh(), 0.01);
      assertTrue(boolean0);
      assertEquals(1.0, oHLC0.getOpen(), 0.01);
      assertEquals(1.0, oHLC0.getClose(), 0.01);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      OHLC oHLC0 = new OHLC(1.0, 1.0, 1.0, 1.0);
      double double0 = oHLC0.getHigh();
      assertEquals(1.0, double0, 0.01);
      assertEquals(1.0, oHLC0.getLow(), 0.01);
      assertEquals(1.0, oHLC0.getOpen(), 0.01);
      assertEquals(1.0, oHLC0.getClose(), 0.01);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      OHLC oHLC0 = new OHLC(1.0, 1.0, 1.0, 1.0);
      double double0 = oHLC0.getLow();
      assertEquals(1.0, oHLC0.getOpen(), 0.01);
      assertEquals(1.0, double0, 0.01);
      assertEquals(1.0, oHLC0.getClose(), 0.01);
      assertEquals(1.0, oHLC0.getHigh(), 0.01);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      OHLC oHLC0 = new OHLC(1.0, 1.0, 1.0, 1.0);
      oHLC0.hashCode();
      assertEquals(1.0, oHLC0.getHigh(), 0.01);
      assertEquals(1.0, oHLC0.getClose(), 0.01);
      assertEquals(1.0, oHLC0.getOpen(), 0.01);
      assertEquals(1.0, oHLC0.getLow(), 0.01);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      OHLC oHLC0 = new OHLC(1.0, 1.0, 1.0, 1.0);
      double double0 = oHLC0.getClose();
      assertEquals(1.0, oHLC0.getHigh(), 0.01);
      assertEquals(1.0, oHLC0.getLow(), 0.01);
      assertEquals(1.0, double0, 0.01);
      assertEquals(1.0, oHLC0.getOpen(), 0.01);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      OHLC oHLC0 = new OHLC(1.0, 1.0, 1.0, 1.0);
      double double0 = oHLC0.getOpen();
      assertEquals(1.0, oHLC0.getClose(), 0.01);
      assertEquals(1.0, double0, 0.01);
      assertEquals(1.0, oHLC0.getHigh(), 0.01);
      assertEquals(1.0, oHLC0.getLow(), 0.01);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      OHLC oHLC0 = new OHLC((-1.0), (-1.0), (-1.0), (-1.0));
      Object object0 = new Object();
      boolean boolean0 = oHLC0.equals(object0);
      assertEquals((-1.0), oHLC0.getLow(), 0.01);
      assertEquals((-1.0), oHLC0.getHigh(), 0.01);
      assertFalse(boolean0);
      assertEquals((-1.0), oHLC0.getClose(), 0.01);
      assertEquals((-1.0), oHLC0.getOpen(), 0.01);
  }
}
