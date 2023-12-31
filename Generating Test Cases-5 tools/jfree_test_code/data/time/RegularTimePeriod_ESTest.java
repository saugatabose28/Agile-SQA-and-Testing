/*
 * This file was automatically generated by EvoSuite
 * Tue May 16 05:42:09 GMT 2023
 */

package org.jfree.data.time;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.time.DateTimeException;
import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.chrono.JapaneseEra;
import java.util.Calendar;
import java.util.Collection;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.SimpleTimeZone;
import java.util.TimeZone;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.time.MockInstant;
import org.evosuite.runtime.mock.java.time.MockLocalDate;
import org.evosuite.runtime.mock.java.util.MockCalendar;
import org.evosuite.runtime.mock.java.util.MockDate;
import org.evosuite.runtime.mock.java.util.MockGregorianCalendar;
import org.jfree.chart.date.SerialDate;
import org.jfree.chart.date.SpreadsheetDate;
import org.jfree.data.time.Day;
import org.jfree.data.time.FixedMillisecond;
import org.jfree.data.time.Hour;
import org.jfree.data.time.Millisecond;
import org.jfree.data.time.Minute;
import org.jfree.data.time.Month;
import org.jfree.data.time.Quarter;
import org.jfree.data.time.RegularTimePeriod;
import org.jfree.data.time.Second;
import org.jfree.data.time.TimePeriodAnchor;
import org.jfree.data.time.Week;
import org.jfree.data.time.Year;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class RegularTimePeriod_ESTest extends RegularTimePeriod_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar((-1), (-569), (-1), (-1), (-10), (-1));
      Date date0 = mockGregorianCalendar0.getGregorianChange();
      Week week0 = new Week(date0, mockGregorianCalendar0);
      week0.getMiddleMillisecond();
      week0.getSerialIndex();
      week0.compareTo(mockGregorianCalendar0);
      RegularTimePeriod.getCalendarInstance();
      // Undeclared exception!
      try { 
        Month.parseMonth(":V<CO-Y");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Can't evaluate the month.
         //
         verifyException("org.jfree.data.time.Month", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      RegularTimePeriod.setThreadLocalCalendarInstance((Calendar) null);
      Week week0 = new Week();
      week0.next();
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      mockGregorianCalendar0.getTimeZone();
      TimePeriodAnchor timePeriodAnchor0 = TimePeriodAnchor.START;
      week0.getMillisecond(timePeriodAnchor0, mockGregorianCalendar0);
      RegularTimePeriod.setThreadLocalCalendarInstance(mockGregorianCalendar0);
      week0.getLastMillisecond();
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond();
      fixedMillisecond0.getTime();
      week0.getYear();
      Quarter quarter0 = new Quarter();
      quarter0.peg(mockGregorianCalendar0);
      week0.peg(mockGregorianCalendar0);
      Minute minute0 = null;
      try {
        minute0 = new Minute(4, (-1529), 1, (-1529), (-362));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The 'year' argument must be in range 1900 to 9999.
         //
         verifyException("org.jfree.chart.date.SpreadsheetDate", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
      TimeZone timeZone0 = TimeZone.getDefault();
      Locale locale0 = Locale.forLanguageTag("az]Gzx6T8i0JY>0Tc");
      Quarter quarter0 = new Quarter(mockDate0, timeZone0, locale0);
      quarter0.getYear();
      quarter0.getMiddleMillisecond();
      Calendar calendar0 = MockCalendar.getInstance(timeZone0);
      mockDate0.getTime();
      quarter0.getFirstMillisecond(calendar0);
      Day day0 = new Day(mockDate0, timeZone0, locale0);
      day0.getSerialIndex();
      Second second0 = new Second(mockDate0, calendar0);
      Millisecond millisecond0 = new Millisecond(1, second0);
      Week week0 = new Week();
      RegularTimePeriod.setThreadLocalCalendarInstance(calendar0);
      timeZone0.setRawOffset((-1));
      week0.getStart();
      millisecond0.equals(week0);
      Month month0 = new Month(mockDate0, calendar0);
      month0.getSerialIndex();
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond();
      RegularTimePeriod.getCalendarInstance();
      fixedMillisecond0.getFirstMillisecond();
      week0.getWeek();
      second0.getSerialIndex();
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      RegularTimePeriod.setThreadLocalCalendarInstance((Calendar) null);
      Week week0 = new Week();
      week0.next();
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      TimeZone timeZone0 = mockGregorianCalendar0.getTimeZone();
      Calendar calendar0 = MockCalendar.getInstance(timeZone0);
      RegularTimePeriod.setThreadLocalCalendarInstance(calendar0);
      week0.getLastMillisecond();
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond();
      fixedMillisecond0.getTime();
      Quarter quarter0 = new Quarter(1, 53);
      quarter0.peg(calendar0);
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
  public void test04()  throws Throwable  {
      Second second0 = new Second();
      second0.getLastMillisecond();
      second0.getMiddleMillisecond();
      MockDate mockDate0 = new MockDate(59);
      Millisecond millisecond0 = new Millisecond(mockDate0);
      Calendar calendar0 = MockCalendar.getInstance();
      millisecond0.previous();
      millisecond0.getFirstMillisecond(calendar0);
      millisecond0.previous();
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
      TimeZone timeZone0 = TimeZone.getDefault();
      Locale locale0 = Locale.forLanguageTag("az]Gzx6T8i0JY>0Tc");
      Quarter quarter0 = new Quarter(mockDate0, timeZone0, locale0);
      quarter0.getYear();
      quarter0.getMiddleMillisecond();
      Calendar calendar0 = MockCalendar.getInstance(timeZone0);
      mockDate0.getTime();
      quarter0.getFirstMillisecond(calendar0);
      Day day0 = new Day(mockDate0, timeZone0, locale0);
      day0.getSerialIndex();
      Second second0 = new Second(mockDate0, calendar0);
      RegularTimePeriod.setCalendarInstancePrototype(calendar0);
      Millisecond millisecond0 = new Millisecond(1, second0);
      Week week0 = new Week();
      RegularTimePeriod.setThreadLocalCalendarInstance(calendar0);
      timeZone0.setRawOffset((-1));
      week0.getStart();
      millisecond0.equals(week0);
      Month month0 = new Month(mockDate0, calendar0);
      month0.getSerialIndex();
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond();
      RegularTimePeriod.getCalendarInstance();
      fixedMillisecond0.getFirstMillisecond();
      week0.getWeek();
      day0.getFirstMillisecond();
      // Undeclared exception!
      try { 
        Week.parseWeek("az]Gzx6T8i0JY>0Tc");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Could not find separator.
         //
         verifyException("org.jfree.data.time.Week", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      MockDate mockDate0 = new MockDate(16, (-1), 930);
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond(mockDate0);
      Locale locale0 = Locale.GERMAN;
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(locale0);
      RegularTimePeriod.setThreadLocalCalendarInstance(mockGregorianCalendar0);
      RegularTimePeriod regularTimePeriod0 = fixedMillisecond0.next();
      regularTimePeriod0.getLastMillisecond();
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      MockDate mockDate0 = new MockDate((-1081), (-5120), 3918, (-5120), (-1), (-1081));
      Second second0 = new Second();
      second0.next();
      Millisecond millisecond0 = new Millisecond();
      String string0 = ";Ab:g3[z/!c=";
      SimpleTimeZone simpleTimeZone0 = null;
      try {
        simpleTimeZone0 = new SimpleTimeZone(0, ";Ab:g3[z/!c=", 0, 59, 59, (-1), (-2210), (-2210), 2583, 0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal start time -1
         //
         verifyException("java.util.SimpleTimeZone", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      MockDate mockDate0 = new MockDate(0L);
      Locale locale0 = Locale.SIMPLIFIED_CHINESE;
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(locale0);
      mockDate0.getTime();
      Month month0 = new Month(mockDate0, mockGregorianCalendar0);
      month0.getMiddleMillisecond();
      MockDate.UTC(0, 1121, 0, 9, 1121, 1);
      // Undeclared exception!
      try { 
        Year.parseYear("M$9:");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Cannot parse string.
         //
         verifyException("org.jfree.data.time.Year", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Week week0 = new Week();
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(1, 1, 1, 371, 1, 371);
      week0.getMiddleMillisecond((Calendar) mockGregorianCalendar0);
      week0.getStart();
      week0.getYearValue();
      Month month0 = null;
      try {
        month0 = new Month(2014, 1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Month outside valid range.
         //
         verifyException("org.jfree.data.time.Month", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      MockDate mockDate0 = new MockDate((-1624), (-1624), 328);
      Locale locale0 = Locale.CANADA;
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(locale0);
      MockDate mockDate1 = new MockDate(328, 328, (-1624), 328, (-1624));
      mockDate0.after(mockDate1);
      Quarter quarter0 = new Quarter(mockDate0);
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond(1);
      fixedMillisecond0.equals("");
      Millisecond millisecond0 = new Millisecond();
      millisecond0.getSerialIndex();
      Class<TimeZone> class0 = TimeZone.class;
      RegularTimePeriod.downsize(class0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      RegularTimePeriod.setThreadLocalCalendarInstance((Calendar) null);
      Week week0 = new Week();
      week0.next();
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      TimeZone timeZone0 = mockGregorianCalendar0.getTimeZone();
      Calendar calendar0 = MockCalendar.getInstance(timeZone0);
      RegularTimePeriod.setThreadLocalCalendarInstance(calendar0);
      week0.getLastMillisecond();
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond();
      Date date0 = fixedMillisecond0.getTime();
      Quarter quarter0 = new Quarter();
      quarter0.peg(calendar0);
      TimePeriodAnchor timePeriodAnchor0 = TimePeriodAnchor.END;
      quarter0.getMillisecond(timePeriodAnchor0, calendar0);
      Second second0 = new Second(date0);
      Millisecond millisecond0 = new Millisecond(1, second0);
      millisecond0.getFirstMillisecond(calendar0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Day day0 = new Day();
      day0.getSerialIndex();
      day0.getLastMillisecond();
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Week week0 = new Week();
      week0.getMiddleMillisecond();
      Locale locale0 = Locale.TAIWAN;
      Calendar calendar0 = MockCalendar.getInstance(locale0);
      week0.getFirstMillisecond(calendar0);
      SpreadsheetDate spreadsheetDate0 = new SpreadsheetDate(53);
      locale0.stripExtensions();
      Date date0 = spreadsheetDate0.toDate();
      Minute minute0 = new Minute(date0, calendar0);
      RegularTimePeriod regularTimePeriod0 = minute0.previous();
      regularTimePeriod0.compareTo(locale0);
      spreadsheetDate0.toString();
      Quarter quarter0 = new Quarter();
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(locale0);
      mockGregorianCalendar0.setFirstDayOfWeek(2);
      mockGregorianCalendar0.getActualMaximum(2);
      quarter0.equals(mockGregorianCalendar0);
      Year year0 = new Year();
      year0.next();
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond(0);
      fixedMillisecond0.compareTo(week0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Class<Day> class0 = Day.class;
      RegularTimePeriod.downsize(class0);
      Date date0 = null;
      Minute minute0 = null;
      try {
        minute0 = new Minute((Date) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'time' argument.
         //
         verifyException("org.jfree.chart.util.Args", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      Date date0 = mockGregorianCalendar0.getGregorianChange();
      Year year0 = new Year(date0, mockGregorianCalendar0);
      year0.getSerialIndex();
      year0.getFirstMillisecond((Calendar) mockGregorianCalendar0);
      Day day0 = null;
      try {
        day0 = new Day(date0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The 'year' argument must be in range 1900 to 9999.
         //
         verifyException("org.jfree.chart.date.SpreadsheetDate", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar((-1), 0, (-1), (-1), 0, (-1));
      Date date0 = mockGregorianCalendar0.getGregorianChange();
      Week week0 = new Week(date0, mockGregorianCalendar0);
      Class<Quarter> class0 = Quarter.class;
      TimeZone timeZone0 = mockGregorianCalendar0.getTimeZone();
      Locale locale0 = null;
      RegularTimePeriod.createInstance(class0, date0, timeZone0, (Locale) null);
      week0.getSerialIndex();
      week0.compareTo(mockGregorianCalendar0);
      Month month0 = new Month(date0);
      RegularTimePeriod.getCalendarInstance();
      // Undeclared exception!
      try { 
        Month.parseMonth(":V<CO-Y");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Can't evaluate the month.
         //
         verifyException("org.jfree.data.time.Month", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Class<Hour> class0 = Hour.class;
      MockDate mockDate0 = new MockDate((-3570L));
      mockDate0.setTime(0L);
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(0, 1735, 3358, 0, 0, 1735);
      TimeZone timeZone0 = mockGregorianCalendar0.getTimeZone();
      timeZone0.toZoneId();
      Locale locale0 = Locale.UK;
      RegularTimePeriod.createInstance(class0, mockDate0, timeZone0, locale0);
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond();
      fixedMillisecond0.getMiddleMillisecond();
      Minute.parseMinute("");
      RegularTimePeriod.setCalendarInstancePrototype(mockGregorianCalendar0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
      MockDate mockDate1 = new MockDate(0, 0, 284, 284, 74, 0);
      mockDate0.before(mockDate1);
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(0, 0, (-3940), (-3940), 2, 0);
      Week week0 = new Week(mockDate0, mockGregorianCalendar0);
      RegularTimePeriod.setCalendarInstancePrototype(mockGregorianCalendar0);
      week0.previous();
      int int0 = 719;
      int int1 = 3;
      SimpleTimeZone simpleTimeZone0 = null;
      try {
        simpleTimeZone0 = new SimpleTimeZone(74, "", 1954, 284, 53, 182, 0, 182, 719, (-729), 794);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal start month 1954
         //
         verifyException("java.util.SimpleTimeZone", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond(2274L);
      fixedMillisecond0.getFirstMillisecond();
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Second second0 = new Second();
      second0.getFirstMillisecond();
      ZoneOffset zoneOffset0 = ZoneOffset.ofTotalSeconds((-2145));
      TimeZone timeZone0 = TimeZone.getTimeZone((ZoneId) zoneOffset0);
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(timeZone0);
      second0.getMiddleMillisecond((Calendar) mockGregorianCalendar0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(1692, 1692, 1692);
      Date date0 = mockGregorianCalendar0.getGregorianChange();
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond(date0);
      TimePeriodAnchor timePeriodAnchor0 = TimePeriodAnchor.START;
      fixedMillisecond0.getMillisecond(timePeriodAnchor0, mockGregorianCalendar0);
      fixedMillisecond0.getEnd();
      fixedMillisecond0.getMiddleMillisecond();
      Week week0 = new Week(date0);
      int int0 = 2065;
      week0.next();
      java.time.Month month0 = java.time.Month.JULY;
      int int1 = 1401;
      // Undeclared exception!
      try { 
        MockLocalDate.of(2065, month0, 1401);
        fail("Expecting exception: DateTimeException");
      
      } catch(DateTimeException e) {
         //
         // Invalid value for DayOfMonth (valid values 1 - 28/31): 1401
         //
         verifyException("java.time.temporal.ValueRange", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Hour hour0 = new Hour();
      RegularTimePeriod regularTimePeriod0 = hour0.next();
      Instant instant0 = MockInstant.now();
      Date date0 = Date.from(instant0);
      TimeZone timeZone0 = TimeZone.getDefault();
      Locale locale0 = Locale.TAIWAN;
      Millisecond millisecond0 = new Millisecond(date0, timeZone0, locale0);
      timeZone0.getDisplayName();
      millisecond0.equals(regularTimePeriod0);
      Object object0 = locale0.clone();
      TimePeriodAnchor timePeriodAnchor0 = TimePeriodAnchor.START;
      Locale locale1 = Locale.CHINESE;
      Calendar calendar0 = MockCalendar.getInstance(locale1);
      millisecond0.getMillisecond(timePeriodAnchor0, calendar0);
      Day day0 = new Day();
      day0.compareTo(locale1);
      Day day1 = hour0.getDay();
      day1.getFirstMillisecond(calendar0);
      Locale locale2 = Locale.ENGLISH;
      Quarter quarter0 = new Quarter(date0, timeZone0, locale2);
      quarter0.compareTo(locale2);
      Week week0 = new Week(date0, calendar0);
      quarter0.equals(week0);
      hour0.getSerialIndex();
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond(53);
      fixedMillisecond0.getSerialIndex();
      Year year0 = new Year(date0);
      year0.peg(calendar0);
      year0.next();
      millisecond0.compareTo(object0);
      week0.getFirstMillisecond(calendar0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Year year0 = new Year();
      Calendar calendar0 = MockCalendar.getInstance();
      year0.peg(calendar0);
      MockDate mockDate0 = new MockDate();
      Minute minute0 = new Minute(mockDate0, calendar0);
      RegularTimePeriod regularTimePeriod0 = minute0.previous();
      MockDate mockDate1 = new MockDate((-990), (-2205), (-9999), 0, 0, 13);
      mockDate0.before(mockDate1);
      Locale locale0 = Locale.FRENCH;
      mockDate0.toInstant();
      year0.compareTo(locale0);
      regularTimePeriod0.toString();
      minute0.equals(year0);
      Quarter quarter0 = new Quarter(mockDate0);
      quarter0.getFirstMillisecond(calendar0);
      Millisecond millisecond0 = null;
      try {
        millisecond0 = new Millisecond(1, 1994, 0, 0, 0, 0, 9999);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The 'month' argument must be in the range 1 to 12.
         //
         verifyException("org.jfree.chart.date.SpreadsheetDate", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      MockDate mockDate0 = new MockDate(3326, 3326, 3326, 3326, 3326, (-1659));
      MockDate mockDate1 = new MockDate(3326, 3326, (-1659));
      mockDate0.after(mockDate1);
      Second second0 = new Second(mockDate0);
      second0.getEnd();
      // Undeclared exception!
      try { 
        Quarter.parseQuarter("hour");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Missing Q.
         //
         verifyException("org.jfree.data.time.Quarter", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond(0L);
      TimePeriodAnchor timePeriodAnchor0 = TimePeriodAnchor.MIDDLE;
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(0, 0, 2678);
      fixedMillisecond0.getMillisecond(timePeriodAnchor0, mockGregorianCalendar0);
      // Undeclared exception!
      try { 
        Week.parseWeek("j(h6,GAT(|{8Bj");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Can't evaluate the year.
         //
         verifyException("org.jfree.data.time.Week", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Month month0 = new Month();
      RegularTimePeriod regularTimePeriod0 = month0.previous();
      regularTimePeriod0.next();
      TimePeriodAnchor timePeriodAnchor0 = TimePeriodAnchor.MIDDLE;
      int int0 = 121;
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(75, 75, 75, 75, 121, 121);
      month0.getMillisecond(timePeriodAnchor0, mockGregorianCalendar0);
      // Undeclared exception!
      try { 
        mockGregorianCalendar0.roll(75, false);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.GregorianCalendar", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
      mockDate0.clone();
      Year year0 = new Year(mockDate0);
      TimePeriodAnchor timePeriodAnchor0 = TimePeriodAnchor.END;
      Locale locale0 = Locale.TAIWAN;
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(locale0);
      year0.getMillisecond(timePeriodAnchor0, mockGregorianCalendar0);
      year0.equals(mockDate0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      MockDate mockDate0 = new MockDate((-4172L));
      Day day0 = new Day(mockDate0);
      Calendar calendar0 = RegularTimePeriod.getCalendarInstance();
      day0.getLastMillisecond(calendar0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      MockDate mockDate0 = new MockDate(1, 1, 2958465);
      Minute minute0 = null;
      try {
        minute0 = new Minute(mockDate0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The 'year' argument must be in range 1900 to 9999.
         //
         verifyException("org.jfree.chart.date.SpreadsheetDate", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      RegularTimePeriod.setThreadLocalCalendarInstance((Calendar) null);
      Week week0 = new Week();
      week0.next();
      week0.getLastMillisecond();
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond(53);
      fixedMillisecond0.getTime();
      Quarter quarter0 = new Quarter();
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Class<Day> class0 = Day.class;
      Class class1 = RegularTimePeriod.downsize(class0);
      Minute minute0 = new Minute();
      Calendar calendar0 = RegularTimePeriod.getCalendarInstance();
      RegularTimePeriod.setCalendarInstancePrototype(calendar0);
      minute0.getSerialIndex();
      TimePeriodAnchor timePeriodAnchor0 = TimePeriodAnchor.MIDDLE;
      minute0.getMillisecond(timePeriodAnchor0, calendar0);
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      minute0.peg(mockGregorianCalendar0);
      Day day0 = minute0.getDay();
      mockGregorianCalendar0.set(2, (-988), 1658);
      SimpleTimeZone simpleTimeZone0 = new SimpleTimeZone(3, "SerialDate.monthCodeToString: month outside valid range.");
      Locale locale0 = Locale.ITALY;
      locale0.getDisplayScript();
      RegularTimePeriod.createInstance(class1, (Date) null, simpleTimeZone0, locale0);
      day0.getEnd();
      day0.next();
      mockGregorianCalendar0.setTimeInMillis((-1L));
      Hour hour0 = null;
      try {
        hour0 = new Hour((Date) null, mockGregorianCalendar0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'time' argument.
         //
         verifyException("org.jfree.chart.util.Args", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Year year0 = new Year();
      Calendar calendar0 = MockCalendar.getInstance();
      // Undeclared exception!
      try { 
        year0.getMillisecond((TimePeriodAnchor) null, calendar0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.data.time.RegularTimePeriod", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      RegularTimePeriod.setThreadLocalCalendarInstance((Calendar) null);
      Week week0 = new Week();
      week0.next();
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      TimeZone timeZone0 = mockGregorianCalendar0.getTimeZone();
      Calendar calendar0 = MockCalendar.getInstance(timeZone0);
      RegularTimePeriod.setThreadLocalCalendarInstance(calendar0);
      week0.getLastMillisecond();
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond();
      TimePeriodAnchor timePeriodAnchor0 = TimePeriodAnchor.START;
      fixedMillisecond0.getMillisecond(timePeriodAnchor0, mockGregorianCalendar0);
      fixedMillisecond0.getTime();
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      MockDate mockDate0 = new MockDate(1692, (-7), (-7), (-1), (-2094));
      int int0 = (-100);
      int int1 = 1;
      SimpleTimeZone simpleTimeZone0 = null;
      try {
        simpleTimeZone0 = new SimpleTimeZone(1692, "b^I", 0, (-1), (-381), (-100), (-100), (-1), 31, 1, 1692);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal start time -100
         //
         verifyException("java.util.SimpleTimeZone", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
      TimeZone timeZone0 = TimeZone.getDefault();
      Locale locale0 = Locale.forLanguageTag("az]Gzx6T8i0JY>0Tc");
      Quarter quarter0 = new Quarter(mockDate0, timeZone0, locale0);
      quarter0.getYear();
      quarter0.getMiddleMillisecond();
      Calendar calendar0 = MockCalendar.getInstance(timeZone0);
      mockDate0.getTime();
      quarter0.getFirstMillisecond(calendar0);
      Day day0 = new Day(mockDate0, timeZone0, locale0);
      day0.getSerialIndex();
      Second second0 = new Second(mockDate0, calendar0);
      Millisecond millisecond0 = new Millisecond(1, second0);
      Week week0 = new Week();
      RegularTimePeriod.setThreadLocalCalendarInstance(calendar0);
      timeZone0.setRawOffset((-1));
      week0.getStart();
      millisecond0.equals(week0);
      Month month0 = new Month(mockDate0, calendar0);
      month0.getSerialIndex();
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond();
      RegularTimePeriod.getCalendarInstance();
      fixedMillisecond0.getFirstMillisecond();
      week0.getWeek();
      week0.previous();
      fixedMillisecond0.getFirstMillisecond();
      fixedMillisecond0.previous();
      millisecond0.equals("az]Gzx6T8i0JY>0Tc");
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      MockDate mockDate0 = new MockDate(0, 0, 0, 0, 0);
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(1241, (-14), 0, (-14), 0);
      Class<Calendar> class0 = Calendar.class;
      RegularTimePeriod.downsize(class0);
      Quarter quarter0 = new Quarter(mockDate0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      Date date0 = mockGregorianCalendar0.getGregorianChange();
      Week week0 = new Week(date0, mockGregorianCalendar0);
      Class<Quarter> class0 = Quarter.class;
      TimeZone timeZone0 = mockGregorianCalendar0.getTimeZone();
      RegularTimePeriod.createInstance(class0, date0, timeZone0, (Locale) null);
      week0.getSerialIndex();
      week0.compareTo(mockGregorianCalendar0);
      Month month0 = new Month(date0);
      RegularTimePeriod.getCalendarInstance();
      Month month1 = new Month();
      // Undeclared exception!
      try { 
        SerialDate.addMonths(1, (SerialDate) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.date.SerialDate", e);
      }
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      MockDate mockDate0 = new MockDate((-1624), (-1624), 328);
      Locale locale0 = Locale.CANADA;
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(locale0);
      MockDate mockDate1 = new MockDate(328, 328, (-1624), 328, (-1624));
      mockDate0.after(mockDate1);
      Quarter quarter0 = new Quarter(mockDate0);
      Millisecond millisecond0 = new Millisecond();
      millisecond0.getSerialIndex();
      Class<TimeZone> class0 = TimeZone.class;
      Class class1 = RegularTimePeriod.downsize(class0);
      assertEquals("class org.jfree.data.time.Millisecond", class1.toString());
  }
}
