/*
 * This file was automatically generated by EvoSuite
 * Tue May 16 06:23:09 GMT 2023
 */

package org.jfree.data.time;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.TextStyle;
import java.time.temporal.TemporalAccessor;
import java.util.Calendar;
import java.util.Collection;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.SimpleTimeZone;
import java.util.TimeZone;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.System;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.mock.java.time.MockInstant;
import org.evosuite.runtime.mock.java.time.MockLocalDateTime;
import org.evosuite.runtime.mock.java.time.MockZonedDateTime;
import org.evosuite.runtime.mock.java.util.MockCalendar;
import org.evosuite.runtime.mock.java.util.MockDate;
import org.evosuite.runtime.mock.java.util.MockGregorianCalendar;
import org.jfree.chart.date.SerialDate;
import org.jfree.data.time.Day;
import org.jfree.data.time.FixedMillisecond;
import org.jfree.data.time.Hour;
import org.jfree.data.time.Minute;
import org.jfree.data.time.Month;
import org.jfree.data.time.Quarter;
import org.jfree.data.time.RegularTimePeriod;
import org.jfree.data.time.TimePeriodAnchor;
import org.jfree.data.time.Week;
import org.jfree.data.time.Year;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Quarter_ESTest extends Quarter_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Quarter quarter0 = new Quarter();
      quarter0.previous();
      Quarter quarter1 = new Quarter(1, 1);
      Class<Quarter> class0 = Quarter.class;
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(1, (-80), (-80), 1307, 4, (-80));
      mockGregorianCalendar0.getTimeZone();
      Date date0 = mockGregorianCalendar0.getGregorianChange();
      quarter1.next();
      Locale locale0 = Locale.ITALY;
      RegularTimePeriod.createInstance(class0, date0, (TimeZone) null, locale0);
      quarter0.getFirstMillisecond();
      quarter0.equals(quarter1);
      quarter0.equals(quarter1);
      quarter0.hashCode();
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Year year0 = new Year(1238);
      Quarter quarter0 = new Quarter();
      // Undeclared exception!
      try { 
        quarter0.getFirstMillisecond((Calendar) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.data.time.Quarter", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      MockDate mockDate0 = new MockDate(70, (-195), 5, 5, (-195), 568);
      MockDate.UTC(70, 0, 568, 568, 0, 568);
      Quarter quarter0 = new Quarter(mockDate0);
      quarter0.getFirstMillisecond();
      MockDate mockDate1 = new MockDate();
      mockDate0.after(mockDate1);
      quarter0.getFirstMillisecond();
      quarter0.toString();
      quarter0.previous();
      Quarter.parseQuarter("Q4/1953");
      SimpleTimeZone simpleTimeZone0 = null;
      try {
        simpleTimeZone0 = new SimpleTimeZone(70, "h%A(@tt6`At:0Ov", 4, 0, 2953, 1, 0, (-195), 212, 9, 6, 52, 52);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal end month -195
         //
         verifyException("java.util.SimpleTimeZone", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      Date date0 = mockGregorianCalendar0.getGregorianChange();
      mockGregorianCalendar0.setLenient(true);
      mockGregorianCalendar0.setMinimalDaysInFirstWeek((-3936));
      Quarter quarter0 = new Quarter(date0, mockGregorianCalendar0);
      quarter0.getEnd();
      mockGregorianCalendar0.getMaximum(4);
      quarter0.toString();
      RegularTimePeriod.setCalendarInstancePrototype(mockGregorianCalendar0);
      quarter0.getYear();
      quarter0.getLastMillisecond();
      Year year0 = quarter0.getYear();
      RegularTimePeriod.setCalendarInstancePrototype(mockGregorianCalendar0);
      quarter0.next();
      year0.getEnd();
      year0.getLastMillisecond((Calendar) mockGregorianCalendar0);
      Quarter.parseQuarter("Q4/1582");
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      Date date0 = mockGregorianCalendar0.getGregorianChange();
      mockGregorianCalendar0.setLenient(true);
      int int0 = (-3936);
      mockGregorianCalendar0.setMinimalDaysInFirstWeek((-3936));
      Quarter quarter0 = new Quarter(date0, mockGregorianCalendar0);
      RegularTimePeriod regularTimePeriod0 = quarter0.next();
      quarter0.getEnd();
      mockGregorianCalendar0.getMaximum(4);
      quarter0.toString();
      RegularTimePeriod.setCalendarInstancePrototype(mockGregorianCalendar0);
      quarter0.getYear();
      quarter0.getLastMillisecond();
      Year year0 = quarter0.getYear();
      int int1 = (-1216);
      int int2 = (-2215);
      quarter0.getLastMillisecond((Calendar) mockGregorianCalendar0);
      RegularTimePeriod.setCalendarInstancePrototype(mockGregorianCalendar0);
      regularTimePeriod0.next();
      year0.getEnd();
      year0.getLastMillisecond((Calendar) mockGregorianCalendar0);
      // Undeclared exception!
      try { 
        Quarter.parseQuarter("TimePeriodAnchor.START");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Missing Q.
         //
         verifyException("org.jfree.data.time.Quarter", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Quarter quarter0 = new Quarter();
      Quarter quarter1 = new Quarter(4, 1);
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(45, 11, 1);
      Calendar.getAvailableCalendarTypes();
      mockGregorianCalendar0.set(0, 45);
      quarter1.peg(mockGregorianCalendar0);
      quarter1.getMiddleMillisecond();
      RegularTimePeriod.getCalendarInstance();
      RegularTimePeriod regularTimePeriod0 = quarter0.previous();
      regularTimePeriod0.getSerialIndex();
      quarter0.getFirstMillisecond();
      quarter0.getStart();
      quarter0.getSerialIndex();
      quarter0.getQuarter();
      quarter0.getSerialIndex();
      quarter1.compareTo(regularTimePeriod0);
      quarter0.getEnd();
      quarter0.getSerialIndex();
      quarter0.hashCode();
      quarter0.getLastMillisecond();
      quarter0.getQuarter();
      quarter0.toString();
      quarter1.getLastMillisecond((Calendar) mockGregorianCalendar0);
      quarter0.getLastMillisecond();
      quarter1.next();
      quarter1.toString();
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Quarter quarter0 = new Quarter();
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(1, (-2002), 4, 2115, 0, 0);
      quarter0.getFirstMillisecond((Calendar) mockGregorianCalendar0);
      quarter0.getStart();
      quarter0.getYear();
      Calendar calendar0 = null;
      // Undeclared exception!
      try { 
        quarter0.peg((Calendar) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.data.time.Quarter", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Day day0 = new Day();
      Date date0 = day0.getStart();
      Calendar calendar0 = RegularTimePeriod.getCalendarInstance();
      Quarter quarter0 = new Quarter(date0, calendar0);
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond();
      quarter0.compareTo(fixedMillisecond0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Quarter quarter0 = new Quarter();
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(45, 11, 1);
      Calendar.getAvailableCalendarTypes();
      mockGregorianCalendar0.set(0, 45);
      quarter0.peg(mockGregorianCalendar0);
      quarter0.getMiddleMillisecond();
      RegularTimePeriod.getCalendarInstance();
      RegularTimePeriod regularTimePeriod0 = quarter0.previous();
      regularTimePeriod0.getSerialIndex();
      quarter0.getFirstMillisecond();
      quarter0.getStart();
      quarter0.getSerialIndex();
      quarter0.getYear();
      quarter0.getQuarter();
      quarter0.getSerialIndex();
      quarter0.compareTo(regularTimePeriod0);
      quarter0.getEnd();
      quarter0.getSerialIndex();
      quarter0.hashCode();
      quarter0.getLastMillisecond();
      quarter0.getQuarter();
      quarter0.toString();
      quarter0.getLastMillisecond((Calendar) mockGregorianCalendar0);
      quarter0.getLastMillisecond();
      quarter0.next();
      quarter0.toString();
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Quarter quarter0 = null;
      try {
        quarter0 = new Quarter((Date) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.Calendar", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Quarter quarter0 = new Quarter();
      quarter0.getEnd();
      quarter0.toString();
      quarter0.next();
      quarter0.previous();
      Calendar calendar0 = null;
      quarter0.getStart();
      // Undeclared exception!
      try { 
        quarter0.getLastMillisecond((Calendar) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.data.time.Quarter", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Year year0 = new Year();
      Quarter quarter0 = new Quarter(4, year0);
      Class<Week> class0 = Week.class;
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond();
      Date date0 = fixedMillisecond0.getTime();
      SimpleTimeZone simpleTimeZone0 = new SimpleTimeZone(0, "b'Sj\"}");
      simpleTimeZone0.observesDaylightTime();
      simpleTimeZone0.getOffset((long) 4);
      fixedMillisecond0.previous();
      Locale locale0 = Locale.JAPAN;
      RegularTimePeriod.createInstance(class0, date0, simpleTimeZone0, locale0);
      Object object0 = new Object();
      Locale locale1 = Locale.KOREA;
      locale0.getDisplayScript(locale1);
      quarter0.compareTo(object0);
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(locale0);
      quarter0.peg(mockGregorianCalendar0);
      quarter0.getSerialIndex();
      quarter0.toString();
      year0.peg(mockGregorianCalendar0);
      quarter0.getFirstMillisecond();
      quarter0.previous();
      quarter0.getSerialIndex();
      quarter0.peg(mockGregorianCalendar0);
      quarter0.getQuarter();
      quarter0.getFirstMillisecond();
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      Date date0 = mockGregorianCalendar0.getGregorianChange();
      mockGregorianCalendar0.setLenient(true);
      int int0 = (-3936);
      mockGregorianCalendar0.setMinimalDaysInFirstWeek((-3936));
      Quarter quarter0 = new Quarter(date0, mockGregorianCalendar0);
      quarter0.next();
      quarter0.getEnd();
      mockGregorianCalendar0.getMaximum(4);
      quarter0.toString();
      RegularTimePeriod.setCalendarInstancePrototype(mockGregorianCalendar0);
      quarter0.getYear();
      quarter0.getLastMillisecond();
      Year year0 = quarter0.getYear();
      int int1 = (-1216);
      int int2 = (-2215);
      RegularTimePeriod.setCalendarInstancePrototype(mockGregorianCalendar0);
      quarter0.next();
      year0.getEnd();
      year0.getLastMillisecond((Calendar) mockGregorianCalendar0);
      // Undeclared exception!
      try { 
        Quarter.parseQuarter("TimePeriodAnchor.START");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Missing Q.
         //
         verifyException("org.jfree.data.time.Quarter", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Quarter quarter0 = new Quarter();
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(32, 4, 32, 32, 3531);
      quarter0.getLastMillisecond((Calendar) mockGregorianCalendar0);
      quarter0.previous();
      MockGregorianCalendar mockGregorianCalendar1 = new MockGregorianCalendar(305, 1, 0, 23, 23);
      RegularTimePeriod.setThreadLocalCalendarInstance(mockGregorianCalendar1);
      Year year0 = quarter0.getYear();
      quarter0.compareTo(mockGregorianCalendar1);
      quarter0.peg(mockGregorianCalendar1);
      quarter0.getYear();
      quarter0.getSerialIndex();
      year0.getStart();
      quarter0.hashCode();
      String string0 = "/";
      SimpleTimeZone simpleTimeZone0 = null;
      try {
        simpleTimeZone0 = new SimpleTimeZone(1203, "/", (-9999), 3816, (-9999), 3816, 1174, 0, 1, 0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal start month -9999
         //
         verifyException("java.util.SimpleTimeZone", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Quarter quarter0 = new Quarter();
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(4, 1, 1, 0, 1, 3);
      quarter0.getLastMillisecond((Calendar) mockGregorianCalendar0);
      String string0 = "Cannot parse string.";
      MockDate mockDate0 = null;
      try {
        mockDate0 = new MockDate("Cannot parse string.");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.Date", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Quarter quarter0 = new Quarter(1, 1);
      quarter0.next();
      quarter0.getSerialIndex();
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(1, (-5134), 1);
      // Undeclared exception!
      try { 
        mockGregorianCalendar0.roll((-5134), 2088);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.GregorianCalendar", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      MockDate mockDate0 = new MockDate(70, (-195), 5, 5, (-195), 568);
      MockDate.UTC(70, 0, 568, 568, 0, 568);
      Quarter quarter0 = new Quarter(mockDate0);
      quarter0.getFirstMillisecond();
      MockDate mockDate1 = new MockDate();
      mockDate0.after(mockDate1);
      quarter0.getFirstMillisecond();
      quarter0.toString();
      quarter0.previous();
      SimpleTimeZone simpleTimeZone0 = null;
      try {
        simpleTimeZone0 = new SimpleTimeZone(70, "h%A(@tt6`At:0Ov", 4, 0, 2953, 1, 0, (-195), 212, 9, 6, 52, 52);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal end month -195
         //
         verifyException("java.util.SimpleTimeZone", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Instant instant0 = MockInstant.ofEpochSecond(1395L);
      Instant instant1 = MockInstant.minusMillis(instant0, (-521L));
      Date date0 = Date.from(instant1);
      Quarter quarter0 = new Quarter(date0);
      quarter0.getYearValue();
      quarter0.hashCode();
      quarter0.getMiddleMillisecond();
      quarter0.getEnd();
      quarter0.hashCode();
      quarter0.getLastMillisecond();
      quarter0.toString();
      quarter0.getSerialIndex();
      quarter0.toString();
      Locale locale0 = Locale.JAPANESE;
      locale0.getDisplayScript();
      locale0.getUnicodeLocaleKeys();
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(locale0);
      quarter0.getFirstMillisecond((Calendar) mockGregorianCalendar0);
      quarter0.equals((Object) null);
      quarter0.getFirstMillisecond();
      quarter0.next();
      quarter0.getSerialIndex();
      quarter0.toString();
      Calendar calendar0 = RegularTimePeriod.getCalendarInstance();
      quarter0.getFirstMillisecond(calendar0);
      quarter0.toString();
      // Undeclared exception!
      try { 
        Quarter.parseQuarter(", ");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Missing Q.
         //
         verifyException("org.jfree.data.time.Quarter", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Quarter quarter0 = new Quarter();
      quarter0.previous();
      RegularTimePeriod regularTimePeriod0 = quarter0.previous();
      Class<Quarter> class0 = Quarter.class;
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(1, 0, 0, 1307, 4, 0);
      mockGregorianCalendar0.getTimeZone();
      Date date0 = mockGregorianCalendar0.getGregorianChange();
      Locale locale0 = Locale.ITALY;
      RegularTimePeriod.createInstance(class0, date0, (TimeZone) null, locale0);
      quarter0.getFirstMillisecond();
      quarter0.equals(regularTimePeriod0);
      quarter0.equals(regularTimePeriod0);
      quarter0.hashCode();
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar((-339), (-339), (-339));
      mockGregorianCalendar0.toZonedDateTime();
      Date date0 = mockGregorianCalendar0.getGregorianChange();
      mockGregorianCalendar0.set(2, 7, 0);
      TimeZone timeZone0 = mockGregorianCalendar0.getTimeZone();
      timeZone0.getDisplayName();
      Locale locale0 = Locale.TRADITIONAL_CHINESE;
      Quarter quarter0 = new Quarter(date0, timeZone0, locale0);
      quarter0.getFirstMillisecond((Calendar) mockGregorianCalendar0);
      quarter0.getFirstMillisecond();
      Calendar calendar0 = MockCalendar.getInstance(timeZone0, locale0);
      quarter0.getFirstMillisecond(calendar0);
      quarter0.getQuarter();
      quarter0.getLastMillisecond();
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
      TimeZone timeZone0 = TimeZone.getDefault();
      Locale locale0 = new Locale("{acNg.<{tO", "{acNg.<{tO", "{acNg.<{tO");
      Quarter quarter0 = new Quarter(mockDate0, timeZone0, locale0);
      timeZone0.observesDaylightTime();
      Instant instant0 = MockInstant.ofEpochSecond((long) 4, (-1886L));
      Date.from(instant0);
      TimeZone.setDefault(timeZone0);
      quarter0.getYearValue();
      quarter0.equals("{acNg.<{tO");
      quarter0.getYearValue();
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getTimeZone("org.jfree.data.time.Month");
      Locale locale0 = Locale.CANADA_FRENCH;
      Quarter quarter0 = null;
      try {
        quarter0 = new Quarter((Date) null, timeZone0, locale0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.Calendar", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Day day0 = new Day();
      Date date0 = day0.getStart();
      Locale locale0 = new Locale("dQ?G", "dQ?G");
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(locale0);
      Quarter quarter0 = new Quarter(date0, mockGregorianCalendar0);
      quarter0.peg(mockGregorianCalendar0);
      locale0.getDisplayCountry();
      // Undeclared exception!
      try { 
        Quarter.parseQuarter("dQ?G");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"?\"
         //
         verifyException("java.lang.NumberFormatException", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar((-2002), 0, 32, (-4837), (-2002), 0);
      mockGregorianCalendar0.getTime();
      Quarter quarter0 = null;
      try {
        quarter0 = new Quarter((Date) null, mockGregorianCalendar0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.Calendar", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      // Undeclared exception!
      try { 
        Quarter.parseQuarter((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.data.time.Quarter", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      MockDate mockDate0 = new MockDate(243, 6, 243, 6, (-1335), 243);
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar((-1335), 6, (-3247), 0, 0);
      Quarter quarter0 = new Quarter(mockDate0, mockGregorianCalendar0);
      quarter0.getLastMillisecond();
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Year year0 = new Year();
      Quarter quarter0 = null;
      try {
        quarter0 = new Quarter(999, year0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Quarter outside valid range.
         //
         verifyException("org.jfree.data.time.Quarter", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      MockDate mockDate0 = new MockDate(2251, 0, 0, 1097, 1097, 0);
      Quarter quarter0 = new Quarter(mockDate0);
      quarter0.previous();
      quarter0.getSerialIndex();
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Quarter quarter0 = new Quarter();
      quarter0.next();
      quarter0.next();
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Quarter quarter0 = new Quarter();
      SimpleTimeZone simpleTimeZone0 = new SimpleTimeZone(13, "");
      Locale locale0 = Locale.ITALIAN;
      Calendar calendar0 = MockCalendar.getInstance((TimeZone) simpleTimeZone0, locale0);
      LinkedList<Locale.LanguageRange> linkedList0 = new LinkedList<Locale.LanguageRange>();
      Locale.FilteringMode locale_FilteringMode0 = Locale.FilteringMode.IGNORE_EXTENDED_RANGES;
      List<Locale> list0 = Locale.filter((List<Locale.LanguageRange>) linkedList0, (Collection<Locale>) null, locale_FilteringMode0);
      Locale.lookup(linkedList0, list0);
      quarter0.getFirstMillisecond(calendar0);
      Locale.setDefault(locale0);
      quarter0.toString();
      quarter0.getQuarter();
      quarter0.equals(calendar0);
      quarter0.getLastMillisecond(calendar0);
      // Undeclared exception!
      try { 
        Quarter.parseQuarter("]5");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Missing Q.
         //
         verifyException("org.jfree.data.time.Quarter", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Quarter quarter0 = new Quarter();
      quarter0.getYear();
      quarter0.getYear();
      TimePeriodAnchor timePeriodAnchor0 = TimePeriodAnchor.MIDDLE;
      // Undeclared exception!
      try { 
        DateTimeFormatter.ofPattern("org.jfree.data.time.Quarter", (Locale) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Unknown pattern letter: o
         //
         verifyException("java.time.format.DateTimeFormatterBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Quarter quarter0 = new Quarter();
      quarter0.getYear();
      String string0 = "WuS%1\"bCu8a^SUEx";
      // Undeclared exception!
      try { 
        Quarter.parseQuarter("WuS%1\"bCu8a^SUEx");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Missing Q.
         //
         verifyException("org.jfree.data.time.Quarter", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Year year0 = mock(Year.class, new ViolatedAssumptionAnswer());
      Quarter quarter0 = null;
      try {
        quarter0 = new Quarter((-662), year0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Quarter outside valid range.
         //
         verifyException("org.jfree.data.time.Quarter", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond((-1191L));
      Date date0 = fixedMillisecond0.getTime();
      Quarter quarter0 = new Quarter(date0);
      Locale locale0 = Locale.GERMAN;
      Locale locale1 = Locale.CANADA_FRENCH;
      locale0.getDisplayScript(locale1);
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(locale0);
      quarter0.getFirstMillisecond((Calendar) mockGregorianCalendar0);
      Locale locale2 = Locale.KOREA;
      locale2.getDisplayScript();
      quarter0.compareTo(locale2);
      // Undeclared exception!
      try { 
        Quarter.parseQuarter("Q");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Q found at end of string.
         //
         verifyException("org.jfree.data.time.Quarter", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      // Undeclared exception!
      try { 
        Quarter.parseQuarter("");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Missing Q.
         //
         verifyException("org.jfree.data.time.Quarter", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      SerialDate serialDate0 = SerialDate.createInstance(1888);
      SerialDate serialDate1 = SerialDate.addYears(1888, serialDate0);
      Date date0 = serialDate1.toDate();
      SimpleTimeZone simpleTimeZone0 = new SimpleTimeZone(2, "");
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(simpleTimeZone0);
      Quarter quarter0 = new Quarter(date0, mockGregorianCalendar0);
      quarter0.getEnd();
      quarter0.toString();
      quarter0.getYear();
      quarter0.getFirstMillisecond();
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Quarter quarter0 = null;
      try {
        quarter0 = new Quarter(45, 45);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Quarter outside valid range.
         //
         verifyException("org.jfree.data.time.Quarter", e);
      }
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      Quarter quarter0 = null;
      try {
        quarter0 = new Quarter(305, 305);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Quarter outside valid range.
         //
         verifyException("org.jfree.data.time.Quarter", e);
      }
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Quarter quarter0 = new Quarter();
      RegularTimePeriod regularTimePeriod0 = quarter0.previous();
      regularTimePeriod0.previous();
      quarter0.getSerialIndex();
      TimeZone timeZone0 = TimeZone.getDefault();
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(timeZone0);
      Locale locale0 = Locale.FRENCH;
      Locale.setDefault(locale0);
      timeZone0.getDisplayName(locale0);
      ZonedDateTime zonedDateTime0 = mockGregorianCalendar0.toZonedDateTime();
      Calendar.getAvailableCalendarTypes();
      quarter0.previous();
      timeZone0.getDisplayName();
      GregorianCalendar gregorianCalendar0 = MockGregorianCalendar.from(zonedDateTime0);
      quarter0.peg(gregorianCalendar0);
      quarter0.getSerialIndex();
      quarter0.next();
      quarter0.peg(gregorianCalendar0);
      quarter0.next();
      quarter0.toString();
      quarter0.toString();
      Quarter quarter1 = Quarter.parseQuarter("Q1/2014");
      quarter0.equals(quarter1);
      quarter1.getYearValue();
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      Quarter quarter0 = new Quarter();
      quarter0.previous();
      quarter0.getSerialIndex();
      TimeZone timeZone0 = TimeZone.getDefault();
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(timeZone0);
      Locale locale0 = Locale.FRENCH;
      Locale.setDefault(locale0);
      timeZone0.getDisplayName(locale0);
      ZonedDateTime zonedDateTime0 = mockGregorianCalendar0.toZonedDateTime();
      Calendar.getAvailableCalendarTypes();
      quarter0.previous();
      timeZone0.getDisplayName();
      GregorianCalendar gregorianCalendar0 = MockGregorianCalendar.from(zonedDateTime0);
      quarter0.peg(gregorianCalendar0);
      quarter0.getSerialIndex();
      quarter0.next();
      quarter0.peg(gregorianCalendar0);
      quarter0.next();
      quarter0.toString();
      quarter0.toString();
      Quarter quarter1 = Quarter.parseQuarter("Q1/2014");
      quarter0.equals(quarter1);
      quarter1.getYearValue();
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      Date date0 = mockGregorianCalendar0.getGregorianChange();
      mockGregorianCalendar0.setLenient(true);
      int int0 = (-3936);
      mockGregorianCalendar0.setMinimalDaysInFirstWeek((-3936));
      Quarter quarter0 = new Quarter(date0, mockGregorianCalendar0);
      RegularTimePeriod regularTimePeriod0 = quarter0.next();
      quarter0.getEnd();
      mockGregorianCalendar0.getMaximum(4);
      quarter0.toString();
      RegularTimePeriod.setCalendarInstancePrototype(mockGregorianCalendar0);
      quarter0.getYear();
      quarter0.getLastMillisecond();
      Year year0 = quarter0.getYear();
      int int1 = (-1216);
      regularTimePeriod0.previous();
      int int2 = (-2215);
      quarter0.getLastMillisecond((Calendar) mockGregorianCalendar0);
      RegularTimePeriod.setCalendarInstancePrototype(mockGregorianCalendar0);
      regularTimePeriod0.next();
      year0.getEnd();
      year0.getLastMillisecond((Calendar) mockGregorianCalendar0);
      // Undeclared exception!
      try { 
        Quarter.parseQuarter("TimePeriodAnchor.START");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Missing Q.
         //
         verifyException("org.jfree.data.time.Quarter", e);
      }
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      Year year0 = new Year(0);
      Quarter quarter0 = null;
      try {
        quarter0 = new Quarter(0, year0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Quarter outside valid range.
         //
         verifyException("org.jfree.data.time.Quarter", e);
      }
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      MockDate mockDate0 = new MockDate(2042, 2042, 2042);
      Hour hour0 = new Hour(mockDate0);
      Day day0 = hour0.getDay();
      Date date0 = day0.getStart();
      day0.toString();
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(337, 0, 0, 0, 0);
      ZoneOffset zoneOffset0 = ZoneOffset.MAX;
      TimeZone timeZone0 = TimeZone.getTimeZone((ZoneId) zoneOffset0);
      timeZone0.getOffset((long) 0);
      ZoneOffset zoneOffset1 = ZoneOffset.MIN;
      zoneOffset1.getTotalSeconds();
      zoneOffset1.toString();
      TimeZone.getDefault();
      zoneOffset0.compareTo(zoneOffset1);
      TimeZone.getDefault();
      mockGregorianCalendar0.setTimeZone(timeZone0);
      Quarter quarter0 = new Quarter(date0, mockGregorianCalendar0);
      day0.getEnd();
      Object object0 = new Object();
      day0.compareTo(object0);
      mockGregorianCalendar0.getWeeksInWeekYear();
      quarter0.equals((Object) null);
      Object object1 = new Object();
      quarter0.equals(object1);
      quarter0.getQuarter();
      quarter0.hashCode();
      day0.getFirstMillisecond((Calendar) mockGregorianCalendar0);
      day0.getSerialIndex();
      quarter0.compareTo(date0);
      quarter0.next();
      Year year0 = new Year(date0);
      quarter0.equals(year0);
      quarter0.getLastMillisecond((Calendar) mockGregorianCalendar0);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      Quarter quarter0 = null;
      try {
        quarter0 = new Quarter((-1510), (-115));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Quarter outside valid range.
         //
         verifyException("org.jfree.data.time.Quarter", e);
      }
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      MockDate mockDate0 = new MockDate(2042, 2042, 2042);
      Hour hour0 = new Hour(mockDate0);
      Day day0 = hour0.getDay();
      Date date0 = day0.getStart();
      day0.toString();
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(337, 0, 0, 0, 0);
      ZoneOffset zoneOffset0 = ZoneOffset.MAX;
      TimeZone timeZone0 = TimeZone.getTimeZone((ZoneId) zoneOffset0);
      ZoneOffset zoneOffset1 = ZoneOffset.MIN;
      zoneOffset1.getTotalSeconds();
      zoneOffset1.toString();
      TimeZone.getDefault();
      zoneOffset0.compareTo(zoneOffset1);
      TimeZone.getDefault();
      mockGregorianCalendar0.setTimeZone(timeZone0);
      Quarter quarter0 = new Quarter(date0, mockGregorianCalendar0);
      MockDate mockDate1 = new MockDate(2042, 2042, 0, 337, (-64800));
      Object object0 = new Object();
      day0.compareTo(object0);
      mockGregorianCalendar0.getWeeksInWeekYear();
      quarter0.equals((Object) null);
      Object object1 = new Object();
      quarter0.equals(object1);
      quarter0.getQuarter();
      quarter0.hashCode();
      day0.getFirstMillisecond((Calendar) mockGregorianCalendar0);
      day0.getSerialIndex();
      quarter0.compareTo(date0);
      RegularTimePeriod regularTimePeriod0 = quarter0.next();
      regularTimePeriod0.previous();
      quarter0.getLastMillisecond((Calendar) mockGregorianCalendar0);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      TimePeriodAnchor timePeriodAnchor0 = TimePeriodAnchor.MIDDLE;
      Quarter quarter0 = null;
      try {
        quarter0 = new Quarter(17, (Year) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Quarter outside valid range.
         //
         verifyException("org.jfree.data.time.Quarter", e);
      }
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      Quarter quarter0 = new Quarter();
      Locale locale0 = Locale.PRC;
      Calendar calendar0 = MockCalendar.getInstance(locale0);
      Locale locale1 = Locale.KOREAN;
      Locale.Category locale_Category0 = Locale.Category.FORMAT;
      Locale.setDefault(locale_Category0, locale1);
      locale0.getDisplayCountry(locale1);
      RegularTimePeriod.setThreadLocalCalendarInstance(calendar0);
      quarter0.peg(calendar0);
      quarter0.toString();
      quarter0.getFirstMillisecond();
      quarter0.equals("");
      quarter0.getFirstMillisecond(calendar0);
      quarter0.getQuarter();
      quarter0.getQuarter();
      quarter0.getSerialIndex();
      // Undeclared exception!
      try { 
        Quarter.parseQuarter("");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Missing Q.
         //
         verifyException("org.jfree.data.time.Quarter", e);
      }
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      Quarter quarter0 = new Quarter();
      Quarter quarter1 = (Quarter)quarter0.previous();
      Quarter quarter2 = (Quarter)quarter0.previous();
      Class<Quarter> class0 = Quarter.class;
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(1, 0, 0, 1307, 4, 0);
      mockGregorianCalendar0.getTimeZone();
      Date date0 = mockGregorianCalendar0.getGregorianChange();
      quarter2.next();
      Locale locale0 = Locale.SIMPLIFIED_CHINESE;
      RegularTimePeriod.createInstance(class0, date0, (TimeZone) null, locale0);
      quarter0.getFirstMillisecond();
      quarter0.equals(quarter2);
      quarter0.equals(quarter2);
      quarter0.hashCode();
      int int0 = quarter2.compareTo(quarter1);
      assertEquals(0, int0);
      
      Year year0 = quarter1.getYear();
      assertEquals(2013L, year0.getSerialIndex());
  }
}
