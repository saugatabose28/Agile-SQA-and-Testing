/*
 * This file was automatically generated by EvoSuite
 * Tue May 16 05:58:45 GMT 2023
 */

package org.jfree.data.time.ohlc;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Calendar;
import java.util.Locale;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.util.MockCalendar;
import org.evosuite.runtime.mock.java.util.MockDate;
import org.jfree.data.time.Day;
import org.jfree.data.time.FixedMillisecond;
import org.jfree.data.time.Hour;
import org.jfree.data.time.Millisecond;
import org.jfree.data.time.Minute;
import org.jfree.data.time.Quarter;
import org.jfree.data.time.RegularTimePeriod;
import org.jfree.data.time.Year;
import org.jfree.data.time.ohlc.OHLCItem;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class OHLCItem_ESTest extends OHLCItem_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond();
      OHLCItem oHLCItem0 = new OHLCItem(fixedMillisecond0, 1588.188572, 1588.188572, 0.0, 1588.188572);
      double double0 = oHLCItem0.getYValue();
      assertEquals(1588.188572, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Day day0 = new Day();
      OHLCItem oHLCItem0 = new OHLCItem(day0, (-1.0), (-1.0), (-1060.873823), (-1060.873823));
      double double0 = oHLCItem0.getYValue();
      assertEquals((-1060.873823), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Day day0 = new Day();
      OHLCItem oHLCItem0 = new OHLCItem(day0, 0.0, (-2401.06539), 1.0, 0.0);
      double double0 = oHLCItem0.getOpenValue();
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond();
      OHLCItem oHLCItem0 = new OHLCItem(fixedMillisecond0, 1340.8039554680704, 1340.8039554680704, 1340.8039554680704, 1340.8039554680704);
      double double0 = oHLCItem0.getOpenValue();
      assertEquals(1340.8039554680704, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Day day0 = new Day();
      OHLCItem oHLCItem0 = new OHLCItem(day0, (-1.0), (-1.0), (-1060.873823), (-1060.873823));
      double double0 = oHLCItem0.getOpenValue();
      assertEquals((-1.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Day day0 = new Day();
      OHLCItem oHLCItem0 = new OHLCItem(day0, 0.0, (-2401.06539), 1.0, 0.0);
      double double0 = oHLCItem0.getLowValue();
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Year year0 = new Year(244);
      OHLCItem oHLCItem0 = new OHLCItem(year0, 244, 1.0, (-1.0), (-9999));
      double double0 = oHLCItem0.getLowValue();
      assertEquals((-1.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Quarter quarter0 = new Quarter();
      OHLCItem oHLCItem0 = new OHLCItem(quarter0, (-2543.533295), 4, (-2543.533295), (-2543.533295));
      double double0 = oHLCItem0.getHighValue();
      assertEquals(4.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Day day0 = new Day();
      OHLCItem oHLCItem0 = new OHLCItem(day0, 0.0, (-2401.06539), 1.0, 0.0);
      double double0 = oHLCItem0.getHighValue();
      assertEquals((-2401.06539), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      MockDate mockDate0 = new MockDate(412, 669, 669);
      Millisecond millisecond0 = new Millisecond(mockDate0);
      OHLCItem oHLCItem0 = new OHLCItem(millisecond0, 999, 1.0, (-2677.239), 412);
      double double0 = oHLCItem0.getCloseValue();
      assertEquals(412.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      MockDate mockDate0 = new MockDate((-1L));
      Locale locale0 = Locale.TRADITIONAL_CHINESE;
      Calendar calendar0 = MockCalendar.getInstance(locale0);
      Quarter quarter0 = new Quarter(mockDate0, calendar0);
      OHLCItem oHLCItem0 = new OHLCItem(quarter0, 4, 202.418367301051, 4, (-1704.574));
      double double0 = oHLCItem0.getCloseValue();
      assertEquals((-1704.574), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      OHLCItem oHLCItem0 = null;
      try {
        oHLCItem0 = new OHLCItem((RegularTimePeriod) null, 0.0, 59, 0.0, 0.0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'x' argument.
         //
         verifyException("org.jfree.chart.util.Args", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Hour hour0 = new Hour();
      Minute minute0 = new Minute((-125), hour0);
      OHLCItem oHLCItem0 = new OHLCItem(minute0, Double.NaN, 0, 0, 0);
      double double0 = oHLCItem0.getCloseValue();
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Hour hour0 = new Hour();
      Minute minute0 = new Minute((-125), hour0);
      OHLCItem oHLCItem0 = new OHLCItem(minute0, Double.NaN, 0, 0, 0);
      double double0 = oHLCItem0.getLowValue();
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Hour hour0 = new Hour();
      Minute minute0 = new Minute((-125), hour0);
      OHLCItem oHLCItem0 = new OHLCItem(minute0, Double.NaN, 0, 0, 0);
      double double0 = oHLCItem0.getHighValue();
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Hour hour0 = new Hour();
      Minute minute0 = new Minute((-125), hour0);
      OHLCItem oHLCItem0 = new OHLCItem(minute0, Double.NaN, 0, 0, 0);
      Minute minute1 = (Minute)oHLCItem0.getPeriod();
      assertEquals(20, minute1.getHourValue());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Hour hour0 = new Hour();
      Minute minute0 = new Minute((-125), hour0);
      OHLCItem oHLCItem0 = new OHLCItem(minute0, Double.NaN, 0, 0, 0);
      double double0 = oHLCItem0.getYValue();
      assertEquals(0.0, double0, 0.01);
  }
}
