/*
 * This file was automatically generated by EvoSuite
 * Tue May 16 05:14:09 GMT 2023
 */

package org.jfree.data.time;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.nio.charset.Charset;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.temporal.ChronoField;
import java.time.temporal.TemporalField;
import java.util.Calendar;
import java.util.Collection;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.SimpleTimeZone;
import java.util.TimeZone;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.System;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.mock.java.time.MockLocalDateTime;
import org.evosuite.runtime.mock.java.time.MockZonedDateTime;
import org.evosuite.runtime.mock.java.util.MockCalendar;
import org.evosuite.runtime.mock.java.util.MockDate;
import org.evosuite.runtime.mock.java.util.MockGregorianCalendar;
import org.jfree.chart.date.MonthConstants;
import org.jfree.chart.date.SpreadsheetDate;
import org.jfree.data.time.Day;
import org.jfree.data.time.FixedMillisecond;
import org.jfree.data.time.Millisecond;
import org.jfree.data.time.Minute;
import org.jfree.data.time.RegularTimePeriod;
import org.jfree.data.time.Second;
import org.jfree.data.time.TimePeriodAnchor;
import org.jfree.data.time.Week;
import org.jfree.data.time.Year;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Second_ESTest extends Second_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      MockDate mockDate0 = new MockDate(24L);
      ZoneOffset zoneOffset0 = ZoneOffset.MIN;
      TimeZone timeZone0 = TimeZone.getTimeZone((ZoneId) zoneOffset0);
      Locale locale0 = Locale.FRENCH;
      Second second0 = new Second();
      Locale locale1 = Locale.UK;
      Locale.getISOLanguages();
      Locale locale2 = Locale.forLanguageTag("");
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(timeZone0, locale1);
      TimeZone.getTimeZone((ZoneId) zoneOffset0);
      TimeZone.getAvailableIDs(59);
      second0.peg(mockGregorianCalendar0);
      second0.toString();
      Locale.Category locale_Category0 = Locale.Category.FORMAT;
      Locale.setDefault(locale_Category0, locale2);
      Calendar calendar0 = MockCalendar.getInstance(timeZone0, locale2);
      zoneOffset0.toString();
      second0.getLastMillisecond(calendar0);
      MockDate.parse("Fri Feb 14 20:21:21 GMT 2014");
      MockGregorianCalendar mockGregorianCalendar1 = new MockGregorianCalendar(2743, 11, 0, 0, 0);
      RegularTimePeriod.setThreadLocalCalendarInstance(mockGregorianCalendar1);
      second0.getSerialIndex();
      second0.getSecond();
      second0.getLastMillisecond((Calendar) mockGregorianCalendar0);
      Second second1 = new Second(mockDate0, timeZone0, locale2);
      second0.compareTo(second1);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Second second0 = new Second();
      second0.getMinute();
      RegularTimePeriod.setCalendarInstancePrototype((Calendar) null);
      // Undeclared exception!
      try { 
        second0.getLastMillisecond((Calendar) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.data.time.Second", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      MockDate mockDate0 = new MockDate(0, 23, 2, (-1054), 2);
      mockDate0.clone();
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(23, (-583), 0, (-583), 23, 46);
      Minute minute0 = new Minute(mockDate0, mockGregorianCalendar0);
      Second second0 = new Second(23, minute0);
      System.setCurrentTimeMillis((-1L));
      minute0.toString();
      second0.getStart();
      second0.previous();
      mockGregorianCalendar0.isWeekDateSupported();
      mockDate0.getTime();
      RegularTimePeriod.setThreadLocalCalendarInstance(mockGregorianCalendar0);
      mockGregorianCalendar0.setTime(mockDate0);
      second0.getMinute();
      second0.getMinute();
      second0.getLastMillisecond((Calendar) mockGregorianCalendar0);
      second0.getFirstMillisecond((Calendar) mockGregorianCalendar0);
      second0.peg(mockGregorianCalendar0);
      // Undeclared exception!
      try { 
        MockLocalDateTime.parse((CharSequence) "Sat Oct 19 02:02:00 GMT 1901");
        fail("Expecting exception: DateTimeParseException");
      
      } catch(DateTimeParseException e) {
         //
         // Text 'Sat Oct 19 02:02:00 GMT 1901' could not be parsed at index 0
         //
         verifyException("java.time.format.DateTimeFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      MockDate mockDate0 = new MockDate(24L);
      ZoneOffset zoneOffset0 = ZoneOffset.MIN;
      TimeZone timeZone0 = TimeZone.getTimeZone((ZoneId) zoneOffset0);
      Locale locale0 = Locale.FRENCH;
      Second second0 = new Second(mockDate0, timeZone0, locale0);
      Locale locale1 = Locale.UK;
      Locale.getISOLanguages();
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(timeZone0, locale1);
      TimeZone.getTimeZone((ZoneId) zoneOffset0);
      TimeZone.getAvailableIDs(59);
      second0.peg(mockGregorianCalendar0);
      second0.toString();
      mockDate0.getTime();
      Calendar calendar0 = MockCalendar.getInstance(timeZone0, locale0);
      zoneOffset0.toString();
      second0.getLastMillisecond(calendar0);
      MockGregorianCalendar mockGregorianCalendar1 = new MockGregorianCalendar(2743, 11, 0, 0, 0);
      RegularTimePeriod.setThreadLocalCalendarInstance(mockGregorianCalendar1);
      second0.getSerialIndex();
      second0.getSecond();
      second0.getLastMillisecond((Calendar) mockGregorianCalendar0);
      Second second1 = (Second)second0.next();
      second1.getMinute();
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      MockDate mockDate0 = new MockDate(0, 1223, 2, 0, 2);
      mockDate0.clone();
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(23, (-583), 0, (-583), 23, 46);
      Minute minute0 = new Minute(mockDate0, mockGregorianCalendar0);
      Second second0 = new Second(23, minute0);
      Object object0 = new Object();
      second0.compareTo(object0);
      minute0.toString();
      second0.getStart();
      second0.previous();
      mockGregorianCalendar0.isWeekDateSupported();
      RegularTimePeriod.setThreadLocalCalendarInstance(mockGregorianCalendar0);
      mockGregorianCalendar0.setTime(mockDate0);
      second0.getMinute();
      second0.getMinute();
      second0.getLastMillisecond((Calendar) mockGregorianCalendar0);
      second0.getFirstMillisecond((Calendar) mockGregorianCalendar0);
      second0.peg(mockGregorianCalendar0);
      second0.getFirstMillisecond((Calendar) mockGregorianCalendar0);
      second0.getLastMillisecond((Calendar) mockGregorianCalendar0);
      second0.equals((Object) null);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Second second0 = new Second();
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      // Undeclared exception!
      try { 
        second0.peg((Calendar) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.data.time.Second", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Second second0 = new Second();
      second0.next();
      Calendar calendar0 = null;
      second0.getMiddleMillisecond();
      RegularTimePeriod.setCalendarInstancePrototype((Calendar) null);
      second0.getSerialIndex();
      RegularTimePeriod.getCalendarInstance();
      second0.next();
      // Undeclared exception!
      try { 
        second0.getFirstMillisecond((Calendar) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.data.time.Second", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      int int0 = 572;
      int int1 = 959;
      MockDate mockDate0 = new MockDate(572, 0, 0, 959, 959);
      Second second0 = new Second(mockDate0);
      second0.getMinute();
      second0.previous();
      Date date0 = second0.getStart();
      second0.getLastMillisecond();
      mockDate0.setTime(0L);
      second0.equals(date0);
      String string0 = "GL|o\"Kw3_3";
      mockDate0.clone();
      Locale.LanguageRange locale_LanguageRange0 = null;
      try {
        locale_LanguageRange0 = new Locale.LanguageRange("GL|o\"Kw3_3");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // range=gl|o\"kw3_3
         //
         verifyException("java.util.Locale$LanguageRange", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      MockDate mockDate0 = new MockDate(0, 0, 392, 392, 0, 0);
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      mockDate0.clone();
      mockGregorianCalendar0.set(392, 0, 1800);
      Second second0 = new Second(mockDate0, mockGregorianCalendar0);
      second0.getLastMillisecond((Calendar) mockGregorianCalendar0);
      second0.toString();
      second0.getFirstMillisecond((Calendar) mockGregorianCalendar0);
      second0.getMinute();
      second0.next();
      Millisecond millisecond0 = new Millisecond(mockDate0);
      millisecond0.getSerialIndex();
      second0.getEnd();
      second0.equals(millisecond0);
      second0.getLastMillisecond();
      second0.getMiddleMillisecond();
      second0.getLastMillisecond((Calendar) mockGregorianCalendar0);
      second0.getSerialIndex();
      MockGregorianCalendar mockGregorianCalendar1 = new MockGregorianCalendar();
      mockGregorianCalendar1.getTime();
      RegularTimePeriod.getCalendarInstance();
      mockGregorianCalendar1.getWeekYear();
      int int0 = (-601);
      SimpleTimeZone simpleTimeZone0 = null;
      try {
        simpleTimeZone0 = new SimpleTimeZone(0, "Tue Feb 12 08:00:00 GMT 1901", 0, (-1167), 3821, 0, 392, 59, 46, (-2627));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal start day of week 3821
         //
         verifyException("java.util.SimpleTimeZone", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Millisecond millisecond0 = new Millisecond();
      millisecond0.getMiddleMillisecond();
      millisecond0.getMiddleMillisecond();
      Second second0 = millisecond0.getSecond();
      second0.getSerialIndex();
      millisecond0.toString();
      Calendar calendar0 = MockCalendar.getInstance();
      second0.getLastMillisecond(calendar0);
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar((-922), (-2899), 328, 0, (-159), 999);
      second0.peg(mockGregorianCalendar0);
      second0.getFirstMillisecond(calendar0);
      second0.getSecond();
      second0.next();
      second0.getLastMillisecond(calendar0);
      Year year0 = new Year(3104);
      second0.equals(year0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Second second0 = new Second();
      Second.parseSecond("second");
      second0.getFirstMillisecond();
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Second second0 = new Second();
      String string0 = "org.jfree.data.time.Second";
      SimpleTimeZone simpleTimeZone0 = new SimpleTimeZone(59, "org.jfree.data.time.Second");
      // Undeclared exception!
      try { 
        Second.parseSecond((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.data.time.Second", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      MockDate mockDate0 = new MockDate(3720, (-7), 3720, 494, 22, 0);
      Second second0 = new Second(mockDate0);
      second0.toString();
      second0.getSecond();
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Second second0 = new Second();
      Locale locale0 = Locale.PRC;
      Calendar calendar0 = MockCalendar.getInstance(locale0);
      second0.toString();
      second0.getLastMillisecond(calendar0);
      second0.getFirstMillisecond();
      second0.getSecond();
      second0.getSecond();
      Second.parseSecond("HH-CJ Xj@5aT0AR{:5");
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      MockDate mockDate0 = new MockDate(52, (-840), (-840), 9999, 52);
      TimeZone timeZone0 = TimeZone.getDefault();
      DateTimeFormatter dateTimeFormatter0 = DateTimeFormatter.ISO_OFFSET_TIME;
      Locale locale0 = dateTimeFormatter0.getLocale();
      Second second0 = null;
      try {
        second0 = new Second(mockDate0, timeZone0, locale0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The 'year' argument must be in range 1900 to 9999.
         //
         verifyException("org.jfree.chart.date.SpreadsheetDate", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
      Minute minute0 = new Minute(mockDate0);
      Second second0 = null;
      try {
        second0 = new Second(2688, minute0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Require 'second' (2688) to be in the range 0 to 59
         //
         verifyException("org.jfree.chart.util.Args", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      MockDate mockDate0 = new MockDate(0L);
      TimeZone timeZone0 = TimeZone.getDefault();
      Locale locale0 = Locale.CHINA;
      locale0.toLanguageTag();
      Second second0 = new Second(mockDate0, timeZone0, locale0);
      second0.hashCode();
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(59, (-1940), 0, 0, 3677);
      second0.getFirstMillisecond((Calendar) mockGregorianCalendar0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      int int0 = 1600;
      String string0 = "";
      SimpleTimeZone simpleTimeZone0 = new SimpleTimeZone(1600, "");
      Locale locale0 = Locale.US;
      Second second0 = null;
      try {
        second0 = new Second((Date) null, simpleTimeZone0, locale0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.Calendar", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      int int0 = (-1777);
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar((-1777), (-1777), (-1777));
      Date date0 = mockGregorianCalendar0.getGregorianChange();
      Second second0 = null;
      try {
        second0 = new Second(date0, mockGregorianCalendar0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The 'year' argument must be in range 1900 to 9999.
         //
         verifyException("org.jfree.chart.date.SpreadsheetDate", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Second second0 = new Second();
      second0.getSerialIndex();
      second0.getLastMillisecond();
      Calendar calendar0 = RegularTimePeriod.getCalendarInstance();
      second0.peg(calendar0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Minute minute0 = new Minute();
      Second second0 = new Second(0, minute0);
      second0.compareTo(minute0);
      second0.toString();
      MockDate mockDate0 = new MockDate(6, 11, 0);
      Day day0 = new Day(mockDate0);
      TimeZone timeZone0 = TimeZone.getDefault();
      Locale locale0 = Locale.US;
      Calendar calendar0 = MockCalendar.getInstance(timeZone0, locale0);
      minute0.peg(calendar0);
      minute0.compareTo(day0);
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(59, 0, 0, 0, 0);
      RegularTimePeriod.setThreadLocalCalendarInstance(mockGregorianCalendar0);
      MockGregorianCalendar mockGregorianCalendar1 = new MockGregorianCalendar(59, 0, 0, 578, 0, 2190);
      second0.peg(mockGregorianCalendar1);
      Week week0 = new Week(6, 0);
      second0.compareTo(week0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Minute minute0 = new Minute();
      Second second0 = null;
      try {
        second0 = new Second(2335, minute0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Require 'second' (2335) to be in the range 0 to 59
         //
         verifyException("org.jfree.chart.util.Args", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Second second0 = new Second();
      second0.getSerialIndex();
      second0.previous();
      second0.getMiddleMillisecond();
      second0.getSecond();
      second0.getMinute();
      Locale locale0 = Locale.ITALIAN;
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(locale0);
      second0.next();
      locale0.getDisplayCountry();
      second0.next();
      mockGregorianCalendar0.set((-261), 0, (-1674), 0, (-213), 21);
      second0.getLastMillisecond((Calendar) mockGregorianCalendar0);
      Second.parseSecond("");
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      SpreadsheetDate spreadsheetDate0 = new SpreadsheetDate(1281);
      Date date0 = spreadsheetDate0.toDate();
      Calendar calendar0 = null;
      Second second0 = null;
      try {
        second0 = new Second(date0, (Calendar) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.data.time.Second", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      MockDate mockDate0 = new MockDate(0, 1090, 0);
      Second second0 = new Second(mockDate0);
      TimeZone timeZone0 = TimeZone.getTimeZone("");
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(timeZone0);
      RegularTimePeriod.setCalendarInstancePrototype(mockGregorianCalendar0);
      Date date0 = second0.getStart();
      second0.getLastMillisecond();
      second0.compareTo(date0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond();
      Date date0 = fixedMillisecond0.getTime();
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(1148, 1148, 0);
      Second second0 = new Second(date0, mockGregorianCalendar0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Second second0 = null;
      try {
        second0 = new Second((Date) null, (Calendar) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.data.time.Second", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      MockDate mockDate0 = new MockDate(0, 0, 0, 3392, 3392, 3012);
      Millisecond millisecond0 = new Millisecond(mockDate0);
      Second second0 = millisecond0.getSecond();
      second0.previous();
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      MockDate mockDate0 = new MockDate(0, 0, 0, 0, 0);
      Second second0 = null;
      try {
        second0 = new Second(mockDate0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The 'year' argument must be in range 1900 to 9999.
         //
         verifyException("org.jfree.chart.date.SpreadsheetDate", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Second second0 = null;
      try {
        second0 = new Second((Date) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.Calendar", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Second second0 = null;
      try {
        second0 = new Second(2094, 1013, 2094, (-411), (-411), 0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The 'year' argument must be in range 1900 to 9999.
         //
         verifyException("org.jfree.chart.date.SpreadsheetDate", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      int int0 = 572;
      int int1 = 959;
      MockDate mockDate0 = new MockDate(572, 0, 0, 959, 959);
      Second second0 = new Second(mockDate0);
      second0.getMinute();
      second0.previous();
      second0.getStart();
      second0.getLastMillisecond();
      long long0 = 0L;
      // Undeclared exception!
      try { 
        MockDate.parse("r|%h8-%");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.Date", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Second second0 = new Second();
      Calendar calendar0 = MockCalendar.getInstance();
      RegularTimePeriod.setCalendarInstancePrototype(calendar0);
      RegularTimePeriod.setCalendarInstancePrototype(calendar0);
      second0.toString();
      second0.toString();
      second0.previous();
      second0.peg(calendar0);
      second0.getMinute();
      RegularTimePeriod regularTimePeriod0 = second0.previous();
      second0.getEnd();
      second0.getSecond();
      second0.getLastMillisecond();
      second0.getFirstMillisecond();
      second0.getLastMillisecond(calendar0);
      second0.getSerialIndex();
      second0.next();
      second0.hashCode();
      MockCalendar.getInstance();
      second0.getSecond();
      second0.equals(calendar0);
      second0.getFirstMillisecond(calendar0);
      second0.compareTo(regularTimePeriod0);
      second0.getMinute();
      Minute minute0 = null;
      try {
        minute0 = new Minute(59, 59, 3, 1800, (-1966));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The 'year' argument must be in range 1900 to 9999.
         //
         verifyException("org.jfree.chart.date.SpreadsheetDate", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      MockDate mockDate0 = new MockDate(3720, 3720, 3720, 494, 22, 0);
      Second second0 = new Second(mockDate0);
      second0.toString();
      second0.getSecond();
      second0.compareTo("Thu Mar 28 14:22:00 GMT 5940");
      second0.getFirstMillisecond();
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      int int0 = 23;
      MockDate mockDate0 = new MockDate(0, 1223, 2, (-1054), 2);
      mockDate0.clone();
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(23, (-594), 1628, (-594), 23, 46);
      // Undeclared exception!
      try { 
        mockGregorianCalendar0.getDisplayNames((-1), 0, (Locale) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.Calendar", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Second second0 = new Second();
      second0.getMinute();
      RegularTimePeriod.setCalendarInstancePrototype((Calendar) null);
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond((-930L));
      second0.compareTo(fixedMillisecond0);
      Second.parseSecond("minute");
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Second second0 = new Second();
      Minute minute0 = new Minute();
      RegularTimePeriod.setCalendarInstancePrototype((Calendar) null);
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond((-930L));
      int int0 = MonthConstants.DECEMBER;
      Second.parseSecond("minute");
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      MockDate mockDate0 = new MockDate(24L);
      ZoneOffset zoneOffset0 = ZoneOffset.MIN;
      TimeZone timeZone0 = TimeZone.getTimeZone((ZoneId) zoneOffset0);
      Locale locale0 = Locale.FRENCH;
      Second second0 = new Second();
      Locale locale1 = Locale.UK;
      Locale.getISOLanguages();
      Locale locale2 = Locale.forLanguageTag("");
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(timeZone0, locale1);
      TimeZone.getTimeZone((ZoneId) zoneOffset0);
      TimeZone.getAvailableIDs(59);
      second0.peg(mockGregorianCalendar0);
      second0.toString();
      Locale.Category locale_Category0 = Locale.Category.FORMAT;
      Locale.setDefault(locale_Category0, locale2);
      Calendar calendar0 = MockCalendar.getInstance(timeZone0, locale2);
      zoneOffset0.toString();
      second0.getLastMillisecond(calendar0);
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT-18:00\",offset=-64800000,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=?,YEAR=2014,MONTH=1,WEEK_OF_YEAR=?,WEEK_OF_MONTH=?,DAY_OF_MONTH=14,DAY_OF_YEAR=?,DAY_OF_WEEK=?,DAY_OF_WEEK_IN_MONTH=?,AM_PM=?,HOUR=?,HOUR_OF_DAY=20,MINUTE=21,SECOND=21,MILLISECOND=0,ZONE_OFFSET=?,DST_OFFSET=?]", calendar0.toString());
      
      MockDate.parse("Fri Feb 14 20:21:21 GMT 2014");
      MockGregorianCalendar mockGregorianCalendar1 = new MockGregorianCalendar(2743, 11, 0, 0, 0);
      RegularTimePeriod.setThreadLocalCalendarInstance(mockGregorianCalendar1);
      second0.getSerialIndex();
      second0.getSecond();
      second0.getLastMillisecond((Calendar) mockGregorianCalendar0);
      RegularTimePeriod regularTimePeriod0 = second0.next();
      Second second1 = new Second(mockDate0, timeZone0, locale2);
      int int0 = ((Second) regularTimePeriod0).compareTo(second1);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
      mockDate0.getTime();
      LinkedList<Locale.LanguageRange> linkedList0 = new LinkedList<Locale.LanguageRange>();
      LinkedList<Locale> linkedList1 = new LinkedList<Locale>();
      Locale locale0 = Locale.lookup(linkedList0, linkedList1);
      assertNull(locale0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      Second second0 = null;
      try {
        second0 = new Second(0, 0, (-1454), 0, 0, (-1454));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The 'year' argument must be in range 1900 to 9999.
         //
         verifyException("org.jfree.chart.date.SpreadsheetDate", e);
      }
  }
}
