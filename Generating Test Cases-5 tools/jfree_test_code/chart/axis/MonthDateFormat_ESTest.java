/*
 * This file was automatically generated by EvoSuite
 * Tue May 16 06:56:42 GMT 2023
 */

package org.jfree.chart.axis;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.text.DateFormat;
import java.text.FieldPosition;
import java.text.Format;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.ZoneId;
import java.util.Arrays;
import java.util.Date;
import java.util.Locale;
import java.util.SimpleTimeZone;
import java.util.TimeZone;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.mock.java.text.MockDateFormat;
import org.evosuite.runtime.mock.java.time.MockInstant;
import org.evosuite.runtime.mock.java.util.MockDate;
import org.jfree.chart.axis.MonthDateFormat;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class MonthDateFormat_ESTest extends MonthDateFormat_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ZoneId zoneId0 = ZoneId.systemDefault();
      assertNotNull(zoneId0);
      
      TimeZone timeZone0 = TimeZone.getTimeZone(zoneId0);
      assertNotNull(timeZone0);
      assertEquals("GMT", timeZone0.getID());
      
      Locale locale0 = Locale.UK;
      assertNotNull(locale0);
      assertEquals("GB", locale0.getCountry());
      assertEquals("eng", locale0.getISO3Language());
      assertEquals("", locale0.getVariant());
      assertEquals("en", locale0.getLanguage());
      assertEquals("GBR", locale0.getISO3Country());
      assertEquals("en_GB", locale0.toString());
      
      boolean[] booleanArray0 = new boolean[5];
      SimpleDateFormat simpleDateFormat0 = (SimpleDateFormat)MockDateFormat.getDateInstance();
      assertNotNull(simpleDateFormat0);
      assertTrue(simpleDateFormat0.isLenient());
      assertEquals("MMM d, yyyy", simpleDateFormat0.toPattern());
      assertEquals("MMM d, yyyy", simpleDateFormat0.toLocalizedPattern());
      
      MonthDateFormat monthDateFormat0 = new MonthDateFormat(timeZone0, locale0, 0, booleanArray0, simpleDateFormat0);
      assertEquals(5, booleanArray0.length);
      assertTrue(Arrays.equals(new boolean[] {false, false, false, false, false}, booleanArray0));
      assertNotNull(monthDateFormat0);
      assertEquals("GMT", timeZone0.getID());
      assertEquals("GB", locale0.getCountry());
      assertEquals("eng", locale0.getISO3Language());
      assertEquals("", locale0.getVariant());
      assertEquals("en", locale0.getLanguage());
      assertEquals("GBR", locale0.getISO3Country());
      assertEquals("en_GB", locale0.toString());
      assertTrue(simpleDateFormat0.isLenient());
      assertEquals("MMM d, yyyy", simpleDateFormat0.toPattern());
      assertEquals("MMM d, yyyy", simpleDateFormat0.toLocalizedPattern());
      assertTrue(monthDateFormat0.isLenient());
      
      StringBuffer stringBuffer0 = new StringBuffer();
      assertNotNull(stringBuffer0);
      assertEquals("", stringBuffer0.toString());
      assertEquals(0, stringBuffer0.length());
      
      FieldPosition fieldPosition0 = new FieldPosition(0);
      assertNotNull(fieldPosition0);
      assertEquals(0, fieldPosition0.getEndIndex());
      assertEquals("java.text.FieldPosition[field=0,attribute=null,beginIndex=0,endIndex=0]", fieldPosition0.toString());
      assertEquals(0, fieldPosition0.getBeginIndex());
      assertEquals(0, fieldPosition0.getField());
      
      // Undeclared exception!
      try { 
        monthDateFormat0.format((Date) null, stringBuffer0, fieldPosition0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.Calendar", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getDefault();
      assertNotNull(timeZone0);
      assertEquals("GMT", timeZone0.getID());
      
      boolean[] booleanArray0 = new boolean[7];
      MonthDateFormat monthDateFormat0 = null;
      try {
        monthDateFormat0 = new MonthDateFormat(timeZone0, (Locale) null, (-1922), booleanArray0, (DateFormat) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'locale' argument.
         //
         verifyException("org.jfree.chart.util.Args", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Locale locale0 = Locale.PRC;
      assertNotNull(locale0);
      assertEquals("", locale0.getVariant());
      assertEquals("CHN", locale0.getISO3Country());
      assertEquals("CN", locale0.getCountry());
      assertEquals("zh", locale0.getLanguage());
      assertEquals("zho", locale0.getISO3Language());
      assertEquals("zh_CN", locale0.toString());
      
      MonthDateFormat monthDateFormat0 = null;
      try {
        monthDateFormat0 = new MonthDateFormat((TimeZone) null, locale0, 2551, true, true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      SimpleTimeZone simpleTimeZone0 = new SimpleTimeZone(0, "P^EruN{BVKX 9,", 1326, 0, 0, 0, 0, 0, 0, (-774), (-672), (-1827), 512);
      assertNotNull(simpleTimeZone0);
      assertFalse(simpleTimeZone0.useDaylightTime());
      assertEquals("P^EruN{BVKX 9,", simpleTimeZone0.getID());
      assertEquals(0, simpleTimeZone0.getDSTSavings());
      assertEquals("java.util.SimpleTimeZone[id=P^EruN{BVKX 9,,offset=0,dstSavings=512,useDaylight=false,startYear=0,startMode=0,startMonth=1326,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=-774,endTime=-672,endTimeMode=-1827]", simpleTimeZone0.toString());
      assertEquals(0, simpleTimeZone0.getRawOffset());
      
      MonthDateFormat monthDateFormat0 = null;
      try {
        monthDateFormat0 = new MonthDateFormat(simpleTimeZone0, (Locale) null, 2740, true, true);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'locale' argument.
         //
         verifyException("org.jfree.chart.util.Args", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      MonthDateFormat monthDateFormat0 = null;
      try {
        monthDateFormat0 = new MonthDateFormat((TimeZone) null, 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      MonthDateFormat monthDateFormat0 = null;
      try {
        monthDateFormat0 = new MonthDateFormat((TimeZone) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      MonthDateFormat monthDateFormat0 = null;
      try {
        monthDateFormat0 = new MonthDateFormat((Locale) null, 0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'locale' argument.
         //
         verifyException("org.jfree.chart.util.Args", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      MonthDateFormat monthDateFormat0 = null;
      try {
        monthDateFormat0 = new MonthDateFormat((Locale) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'locale' argument.
         //
         verifyException("org.jfree.chart.util.Args", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Locale locale0 = Locale.SIMPLIFIED_CHINESE;
      assertNotNull(locale0);
      assertEquals("CHN", locale0.getISO3Country());
      assertEquals("zh_CN", locale0.toString());
      assertEquals("", locale0.getVariant());
      assertEquals("CN", locale0.getCountry());
      assertEquals("zh", locale0.getLanguage());
      assertEquals("zho", locale0.getISO3Language());
      
      boolean[] booleanArray0 = new boolean[3];
      SimpleDateFormat simpleDateFormat0 = (SimpleDateFormat)DateFormat.getDateInstance();
      assertNotNull(simpleDateFormat0);
      assertEquals("MMM d, yyyy", simpleDateFormat0.toPattern());
      assertEquals("MMM d, yyyy", simpleDateFormat0.toLocalizedPattern());
      assertTrue(simpleDateFormat0.isLenient());
      
      MonthDateFormat monthDateFormat0 = null;
      try {
        monthDateFormat0 = new MonthDateFormat((TimeZone) null, locale0, 4, booleanArray0, simpleDateFormat0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getDefault();
      assertNotNull(timeZone0);
      assertEquals("GMT", timeZone0.getID());
      
      MonthDateFormat monthDateFormat0 = new MonthDateFormat(timeZone0);
      assertNotNull(monthDateFormat0);
      assertEquals("GMT", timeZone0.getID());
      assertTrue(monthDateFormat0.isLenient());
      
      Locale locale0 = Locale.FRANCE;
      assertNotNull(locale0);
      assertEquals("fr_FR", locale0.toString());
      assertEquals("", locale0.getVariant());
      assertEquals("fr", locale0.getLanguage());
      assertEquals("FR", locale0.getCountry());
      assertEquals("fra", locale0.getISO3Language());
      assertEquals("FRA", locale0.getISO3Country());
      
      boolean[] booleanArray0 = new boolean[7];
      MonthDateFormat monthDateFormat1 = new MonthDateFormat(timeZone0, locale0, (-1749), booleanArray0, monthDateFormat0);
      assertEquals(7, booleanArray0.length);
      assertTrue(Arrays.equals(new boolean[] {false, false, false, false, false, false, false}, booleanArray0));
      assertNotNull(monthDateFormat1);
      assertFalse(monthDateFormat1.equals((Object)monthDateFormat0));
      assertEquals("GMT", timeZone0.getID());
      assertTrue(monthDateFormat0.isLenient());
      assertEquals("fr_FR", locale0.toString());
      assertEquals("", locale0.getVariant());
      assertEquals("fr", locale0.getLanguage());
      assertEquals("FR", locale0.getCountry());
      assertEquals("fra", locale0.getISO3Language());
      assertEquals("FRA", locale0.getISO3Country());
      assertTrue(monthDateFormat1.isLenient());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getTimeZone("");
      assertNotNull(timeZone0);
      assertEquals("GMT", timeZone0.getID());
      
      Locale locale0 = Locale.ITALIAN;
      assertNotNull(locale0);
      assertEquals("it", locale0.getLanguage());
      assertEquals("", locale0.getISO3Country());
      assertEquals("ita", locale0.getISO3Language());
      assertEquals("", locale0.getVariant());
      assertEquals("", locale0.getCountry());
      assertEquals("it", locale0.toString());
      
      MonthDateFormat monthDateFormat0 = new MonthDateFormat(timeZone0, locale0, 0, true, true);
      assertNotNull(monthDateFormat0);
      assertEquals("GMT", timeZone0.getID());
      assertEquals("it", locale0.getLanguage());
      assertEquals("", locale0.getISO3Country());
      assertEquals("ita", locale0.getISO3Language());
      assertEquals("", locale0.getVariant());
      assertEquals("", locale0.getCountry());
      assertEquals("it", locale0.toString());
      assertTrue(monthDateFormat0.isLenient());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Locale locale0 = Locale.JAPAN;
      assertNotNull(locale0);
      assertEquals("", locale0.getVariant());
      assertEquals("ja", locale0.getLanguage());
      assertEquals("JP", locale0.getCountry());
      assertEquals("jpn", locale0.getISO3Language());
      assertEquals("JPN", locale0.getISO3Country());
      assertEquals("ja_JP", locale0.toString());
      
      MonthDateFormat monthDateFormat0 = new MonthDateFormat(locale0);
      assertNotNull(monthDateFormat0);
      assertEquals("", locale0.getVariant());
      assertEquals("ja", locale0.getLanguage());
      assertEquals("JP", locale0.getCountry());
      assertEquals("jpn", locale0.getISO3Language());
      assertEquals("JPN", locale0.getISO3Country());
      assertEquals("ja_JP", locale0.toString());
      assertTrue(monthDateFormat0.isLenient());
      
      MonthDateFormat monthDateFormat1 = new MonthDateFormat();
      assertNotNull(monthDateFormat1);
      assertFalse(monthDateFormat1.equals((Object)monthDateFormat0));
      assertTrue(monthDateFormat1.isLenient());
      
      boolean boolean0 = monthDateFormat0.equals(monthDateFormat1);
      assertFalse(boolean0);
      assertFalse(monthDateFormat0.equals((Object)monthDateFormat1));
      assertFalse(monthDateFormat1.equals((Object)monthDateFormat0));
      assertEquals("", locale0.getVariant());
      assertEquals("ja", locale0.getLanguage());
      assertEquals("JP", locale0.getCountry());
      assertEquals("jpn", locale0.getISO3Language());
      assertEquals("JPN", locale0.getISO3Country());
      assertEquals("ja_JP", locale0.toString());
      assertTrue(monthDateFormat0.isLenient());
      assertTrue(monthDateFormat1.isLenient());
      assertNotSame(monthDateFormat0, monthDateFormat1);
      assertNotSame(monthDateFormat1, monthDateFormat0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Locale locale0 = Locale.JAPAN;
      assertNotNull(locale0);
      assertEquals("ja_JP", locale0.toString());
      assertEquals("jpn", locale0.getISO3Language());
      assertEquals("JPN", locale0.getISO3Country());
      assertEquals("", locale0.getVariant());
      assertEquals("ja", locale0.getLanguage());
      assertEquals("JP", locale0.getCountry());
      
      MonthDateFormat monthDateFormat0 = new MonthDateFormat(locale0);
      assertNotNull(monthDateFormat0);
      assertEquals("ja_JP", locale0.toString());
      assertEquals("jpn", locale0.getISO3Language());
      assertEquals("JPN", locale0.getISO3Country());
      assertEquals("", locale0.getVariant());
      assertEquals("ja", locale0.getLanguage());
      assertEquals("JP", locale0.getCountry());
      assertTrue(monthDateFormat0.isLenient());
      
      MonthDateFormat monthDateFormat1 = (MonthDateFormat)monthDateFormat0.clone();
      assertNotNull(monthDateFormat1);
      assertTrue(monthDateFormat1.equals((Object)monthDateFormat0));
      assertEquals("ja_JP", locale0.toString());
      assertEquals("jpn", locale0.getISO3Language());
      assertEquals("JPN", locale0.getISO3Country());
      assertEquals("", locale0.getVariant());
      assertEquals("ja", locale0.getLanguage());
      assertEquals("JP", locale0.getCountry());
      assertTrue(monthDateFormat0.isLenient());
      assertTrue(monthDateFormat1.isLenient());
      assertNotSame(monthDateFormat0, monthDateFormat1);
      assertNotSame(monthDateFormat1, monthDateFormat0);
      
      monthDateFormat0.setLenient(false);
      assertFalse(monthDateFormat0.equals((Object)monthDateFormat1));
      assertEquals("ja_JP", locale0.toString());
      assertEquals("jpn", locale0.getISO3Language());
      assertEquals("JPN", locale0.getISO3Country());
      assertEquals("", locale0.getVariant());
      assertEquals("ja", locale0.getLanguage());
      assertEquals("JP", locale0.getCountry());
      assertFalse(monthDateFormat0.isLenient());
      assertNotSame(monthDateFormat0, monthDateFormat1);
      
      boolean boolean0 = monthDateFormat0.equals(monthDateFormat1);
      assertFalse(boolean0);
      assertFalse(monthDateFormat0.equals((Object)monthDateFormat1));
      assertFalse(monthDateFormat1.equals((Object)monthDateFormat0));
      assertEquals("ja_JP", locale0.toString());
      assertEquals("jpn", locale0.getISO3Language());
      assertEquals("JPN", locale0.getISO3Country());
      assertEquals("", locale0.getVariant());
      assertEquals("ja", locale0.getLanguage());
      assertEquals("JP", locale0.getCountry());
      assertFalse(monthDateFormat0.isLenient());
      assertTrue(monthDateFormat1.isLenient());
      assertNotSame(monthDateFormat0, monthDateFormat1);
      assertNotSame(monthDateFormat1, monthDateFormat0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Locale locale0 = Locale.JAPAN;
      assertNotNull(locale0);
      assertEquals("jpn", locale0.getISO3Language());
      assertEquals("JP", locale0.getCountry());
      assertEquals("ja_JP", locale0.toString());
      assertEquals("ja", locale0.getLanguage());
      assertEquals("JPN", locale0.getISO3Country());
      assertEquals("", locale0.getVariant());
      
      MonthDateFormat monthDateFormat0 = new MonthDateFormat(locale0);
      assertNotNull(monthDateFormat0);
      assertEquals("jpn", locale0.getISO3Language());
      assertEquals("JP", locale0.getCountry());
      assertEquals("ja_JP", locale0.toString());
      assertEquals("ja", locale0.getLanguage());
      assertEquals("JPN", locale0.getISO3Country());
      assertEquals("", locale0.getVariant());
      assertTrue(monthDateFormat0.isLenient());
      
      MonthDateFormat monthDateFormat1 = (MonthDateFormat)monthDateFormat0.clone();
      assertNotNull(monthDateFormat1);
      assertTrue(monthDateFormat1.equals((Object)monthDateFormat0));
      assertEquals("jpn", locale0.getISO3Language());
      assertEquals("JP", locale0.getCountry());
      assertEquals("ja_JP", locale0.toString());
      assertEquals("ja", locale0.getLanguage());
      assertEquals("JPN", locale0.getISO3Country());
      assertEquals("", locale0.getVariant());
      assertTrue(monthDateFormat0.isLenient());
      assertTrue(monthDateFormat1.isLenient());
      assertNotSame(monthDateFormat0, monthDateFormat1);
      assertNotSame(monthDateFormat1, monthDateFormat0);
      
      boolean boolean0 = monthDateFormat0.equals(monthDateFormat1);
      assertTrue(boolean0);
      assertTrue(monthDateFormat0.equals((Object)monthDateFormat1));
      assertTrue(monthDateFormat1.equals((Object)monthDateFormat0));
      assertEquals("jpn", locale0.getISO3Language());
      assertEquals("JP", locale0.getCountry());
      assertEquals("ja_JP", locale0.toString());
      assertEquals("ja", locale0.getLanguage());
      assertEquals("JPN", locale0.getISO3Country());
      assertEquals("", locale0.getVariant());
      assertTrue(monthDateFormat0.isLenient());
      assertTrue(monthDateFormat1.isLenient());
      assertNotSame(monthDateFormat0, monthDateFormat1);
      assertNotSame(monthDateFormat1, monthDateFormat0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Locale locale0 = Locale.JAPAN;
      assertNotNull(locale0);
      assertEquals("", locale0.getVariant());
      assertEquals("JPN", locale0.getISO3Country());
      assertEquals("ja_JP", locale0.toString());
      assertEquals("jpn", locale0.getISO3Language());
      assertEquals("JP", locale0.getCountry());
      assertEquals("ja", locale0.getLanguage());
      
      MonthDateFormat monthDateFormat0 = new MonthDateFormat(locale0);
      assertNotNull(monthDateFormat0);
      assertEquals("", locale0.getVariant());
      assertEquals("JPN", locale0.getISO3Country());
      assertEquals("ja_JP", locale0.toString());
      assertEquals("jpn", locale0.getISO3Language());
      assertEquals("JP", locale0.getCountry());
      assertEquals("ja", locale0.getLanguage());
      assertTrue(monthDateFormat0.isLenient());
      
      boolean boolean0 = monthDateFormat0.equals(monthDateFormat0);
      assertTrue(boolean0);
      assertEquals("", locale0.getVariant());
      assertEquals("JPN", locale0.getISO3Country());
      assertEquals("ja_JP", locale0.toString());
      assertEquals("jpn", locale0.getISO3Language());
      assertEquals("JP", locale0.getCountry());
      assertEquals("ja", locale0.getLanguage());
      assertTrue(monthDateFormat0.isLenient());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      MonthDateFormat monthDateFormat0 = new MonthDateFormat();
      assertNotNull(monthDateFormat0);
      assertTrue(monthDateFormat0.isLenient());
      
      boolean boolean0 = monthDateFormat0.equals((Object) null);
      assertFalse(boolean0);
      assertTrue(monthDateFormat0.isLenient());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      MonthDateFormat monthDateFormat0 = new MonthDateFormat();
      assertNotNull(monthDateFormat0);
      assertTrue(monthDateFormat0.isLenient());
      
      Instant instant0 = MockInstant.ofEpochSecond(979L, (-1102L));
      assertNotNull(instant0);
      
      Date date0 = Date.from(instant0);
      assertNotNull(date0);
      assertEquals("Thu Jan 01 00:16:18 GMT 1970", date0.toString());
      
      StringBuffer stringBuffer0 = new StringBuffer(4);
      assertNotNull(stringBuffer0);
      assertEquals(0, stringBuffer0.length());
      assertEquals("", stringBuffer0.toString());
      
      Format.Field format_Field0 = mock(Format.Field.class, new ViolatedAssumptionAnswer());
      FieldPosition fieldPosition0 = new FieldPosition(format_Field0, 0);
      assertNotNull(fieldPosition0);
      assertEquals(0, fieldPosition0.getBeginIndex());
      assertEquals(0, fieldPosition0.getEndIndex());
      assertEquals(0, fieldPosition0.getField());
      
      StringBuffer stringBuffer1 = monthDateFormat0.format(date0, stringBuffer0, fieldPosition0);
      assertNotNull(stringBuffer1);
      assertTrue(monthDateFormat0.isLenient());
      assertEquals("Thu Jan 01 00:16:18 GMT 1970", date0.toString());
      assertEquals("J70", stringBuffer0.toString());
      assertEquals(3, stringBuffer0.length());
      assertEquals(0, fieldPosition0.getBeginIndex());
      assertEquals(0, fieldPosition0.getEndIndex());
      assertEquals(0, fieldPosition0.getField());
      assertEquals("J70", stringBuffer1.toString());
      assertEquals(3, stringBuffer1.length());
      assertSame(stringBuffer0, stringBuffer1);
      assertSame(stringBuffer1, stringBuffer0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      SimpleTimeZone simpleTimeZone0 = new SimpleTimeZone(1656, "ZfdrmzR[+C6");
      assertNotNull(simpleTimeZone0);
      assertFalse(simpleTimeZone0.useDaylightTime());
      assertEquals("ZfdrmzR[+C6", simpleTimeZone0.getID());
      assertEquals("java.util.SimpleTimeZone[id=ZfdrmzR[+C6,offset=1656,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0]", simpleTimeZone0.toString());
      assertEquals(0, simpleTimeZone0.getDSTSavings());
      assertEquals(1656, simpleTimeZone0.getRawOffset());
      
      MonthDateFormat monthDateFormat0 = new MonthDateFormat(simpleTimeZone0, 1656);
      assertNotNull(monthDateFormat0);
      assertFalse(simpleTimeZone0.useDaylightTime());
      assertEquals("ZfdrmzR[+C6", simpleTimeZone0.getID());
      assertEquals("java.util.SimpleTimeZone[id=ZfdrmzR[+C6,offset=1656,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0]", simpleTimeZone0.toString());
      assertEquals(0, simpleTimeZone0.getDSTSavings());
      assertEquals(1656, simpleTimeZone0.getRawOffset());
      assertTrue(monthDateFormat0.isLenient());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Locale locale0 = Locale.JAPAN;
      assertNotNull(locale0);
      assertEquals("JPN", locale0.getISO3Country());
      assertEquals("", locale0.getVariant());
      assertEquals("ja_JP", locale0.toString());
      assertEquals("ja", locale0.getLanguage());
      assertEquals("jpn", locale0.getISO3Language());
      assertEquals("JP", locale0.getCountry());
      
      MonthDateFormat monthDateFormat0 = new MonthDateFormat(locale0);
      assertNotNull(monthDateFormat0);
      assertEquals("JPN", locale0.getISO3Country());
      assertEquals("", locale0.getVariant());
      assertEquals("ja_JP", locale0.toString());
      assertEquals("ja", locale0.getLanguage());
      assertEquals("jpn", locale0.getISO3Language());
      assertEquals("JP", locale0.getCountry());
      assertTrue(monthDateFormat0.isLenient());
      
      ParsePosition parsePosition0 = new ParsePosition(13);
      assertNotNull(parsePosition0);
      assertEquals("java.text.ParsePosition[index=13,errorIndex=-1]", parsePosition0.toString());
      assertEquals((-1), parsePosition0.getErrorIndex());
      assertEquals(13, parsePosition0.getIndex());
      
      Date date0 = monthDateFormat0.parse("96'7.!Ds\"AQZmlybz", parsePosition0);
      assertNull(date0);
      assertEquals("JPN", locale0.getISO3Country());
      assertEquals("", locale0.getVariant());
      assertEquals("ja_JP", locale0.toString());
      assertEquals("ja", locale0.getLanguage());
      assertEquals("jpn", locale0.getISO3Language());
      assertEquals("JP", locale0.getCountry());
      assertTrue(monthDateFormat0.isLenient());
      assertEquals("java.text.ParsePosition[index=13,errorIndex=-1]", parsePosition0.toString());
      assertEquals((-1), parsePosition0.getErrorIndex());
      assertEquals(13, parsePosition0.getIndex());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      MonthDateFormat monthDateFormat0 = new MonthDateFormat();
      MockDate mockDate0 = new MockDate(839, 839, 839, 5, 10, (-1066));
      StringBuffer stringBuffer0 = new StringBuffer("pts");
      FieldPosition fieldPosition0 = new FieldPosition((-1355));
      monthDateFormat0.format((Date) mockDate0, stringBuffer0, fieldPosition0);
      assertEquals(4, stringBuffer0.length());
      assertEquals("ptsM", stringBuffer0.toString());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Locale locale0 = Locale.FRANCE;
      MonthDateFormat monthDateFormat0 = new MonthDateFormat(locale0, (-441));
      assertTrue(monthDateFormat0.isLenient());
  }
}
