/*
 * This file was automatically generated by EvoSuite
 * Tue May 16 05:08:41 GMT 2023
 */

package org.jfree.chart.labels;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.StringWriter;
import java.math.RoundingMode;
import java.sql.Connection;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import javax.swing.JLayeredPane;
import javax.swing.JPasswordField;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.System;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.jfree.chart.labels.BoxAndWhiskerToolTipGenerator;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultIntervalCategoryDataset;
import org.jfree.data.gantt.SlidingGanttCategoryDataset;
import org.jfree.data.gantt.TaskSeriesCollection;
import org.jfree.data.gantt.XYTaskDataset;
import org.jfree.data.jdbc.JDBCCategoryDataset;
import org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class BoxAndWhiskerToolTipGenerator_ESTest extends BoxAndWhiskerToolTipGenerator_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      BoxAndWhiskerToolTipGenerator boxAndWhiskerToolTipGenerator0 = new BoxAndWhiskerToolTipGenerator();
      assertEquals("X: {1} Mean: {2} Median: {3} Min: {4} Max: {5} Q1: {6} Q3: {7} ", boxAndWhiskerToolTipGenerator0.getLabelFormat());
      assertNotNull(boxAndWhiskerToolTipGenerator0);
      
      BoxAndWhiskerToolTipGenerator boxAndWhiskerToolTipGenerator1 = (BoxAndWhiskerToolTipGenerator)boxAndWhiskerToolTipGenerator0.clone();
      assertNotSame(boxAndWhiskerToolTipGenerator0, boxAndWhiskerToolTipGenerator1);
      assertNotSame(boxAndWhiskerToolTipGenerator1, boxAndWhiskerToolTipGenerator0);
      assertEquals("X: {1} Mean: {2} Median: {3} Min: {4} Max: {5} Q1: {6} Q3: {7} ", boxAndWhiskerToolTipGenerator0.getLabelFormat());
      assertEquals("X: {1} Mean: {2} Median: {3} Min: {4} Max: {5} Q1: {6} Q3: {7} ", boxAndWhiskerToolTipGenerator1.getLabelFormat());
      assertTrue(boxAndWhiskerToolTipGenerator1.equals((Object)boxAndWhiskerToolTipGenerator0));
      assertNotNull(boxAndWhiskerToolTipGenerator1);
      
      boolean boolean0 = boxAndWhiskerToolTipGenerator0.equals(boxAndWhiskerToolTipGenerator1);
      assertNotSame(boxAndWhiskerToolTipGenerator0, boxAndWhiskerToolTipGenerator1);
      assertNotSame(boxAndWhiskerToolTipGenerator1, boxAndWhiskerToolTipGenerator0);
      assertTrue(boolean0);
      assertEquals("X: {1} Mean: {2} Median: {3} Min: {4} Max: {5} Q1: {6} Q3: {7} ", boxAndWhiskerToolTipGenerator0.getLabelFormat());
      assertEquals("X: {1} Mean: {2} Median: {3} Min: {4} Max: {5} Q1: {6} Q3: {7} ", boxAndWhiskerToolTipGenerator1.getLabelFormat());
      assertTrue(boxAndWhiskerToolTipGenerator0.equals((Object)boxAndWhiskerToolTipGenerator1));
      assertTrue(boxAndWhiskerToolTipGenerator1.equals((Object)boxAndWhiskerToolTipGenerator0));
      
      CategoryDataset categoryDataset0 = mock(CategoryDataset.class, new ViolatedAssumptionAnswer());
      doReturn("X: {1} Mean: {2} Median: {3} Min: {4} Max: {5} Q1: {6} Q3: {7} ").when(categoryDataset0).getColumnKey(anyInt());
      NumberFormat numberFormat0 = mock(NumberFormat.class, new ViolatedAssumptionAnswer());
      BoxAndWhiskerToolTipGenerator boxAndWhiskerToolTipGenerator2 = new BoxAndWhiskerToolTipGenerator("X: {1} Mean: {2} Median: {3} Min: {4} Max: {5} Q1: {6} Q3: {7} ", numberFormat0);
      boxAndWhiskerToolTipGenerator0.equals(boxAndWhiskerToolTipGenerator2);
      boxAndWhiskerToolTipGenerator0.generateColumnLabel(categoryDataset0, 5);
      boxAndWhiskerToolTipGenerator0.equals(boxAndWhiskerToolTipGenerator0);
      boxAndWhiskerToolTipGenerator0.equals(boxAndWhiskerToolTipGenerator1);
      boxAndWhiskerToolTipGenerator0.equals("java.lang.String@0000000003");
      boxAndWhiskerToolTipGenerator0.equals("java.lang.String@0000000003");
      CategoryDataset categoryDataset1 = null;
      // Undeclared exception!
      try { 
        boxAndWhiskerToolTipGenerator2.createItemArray((CategoryDataset) null, 5, 5);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.labels.BoxAndWhiskerToolTipGenerator", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      DecimalFormat decimalFormat0 = new DecimalFormat();
      assertEquals("", decimalFormat0.getNegativeSuffix());
      assertEquals(3, decimalFormat0.getGroupingSize());
      assertEquals(RoundingMode.HALF_EVEN, decimalFormat0.getRoundingMode());
      assertFalse(decimalFormat0.isDecimalSeparatorAlwaysShown());
      assertEquals("#,##0.###", decimalFormat0.toPattern());
      assertEquals(1, decimalFormat0.getMinimumIntegerDigits());
      assertEquals(0, decimalFormat0.getMinimumFractionDigits());
      assertFalse(decimalFormat0.isParseBigDecimal());
      assertEquals("", decimalFormat0.getPositiveSuffix());
      assertFalse(decimalFormat0.isParseIntegerOnly());
      assertTrue(decimalFormat0.isGroupingUsed());
      assertEquals("#,##0.###", decimalFormat0.toLocalizedPattern());
      assertEquals("-", decimalFormat0.getNegativePrefix());
      assertEquals(3, decimalFormat0.getMaximumFractionDigits());
      assertEquals(1, decimalFormat0.getMultiplier());
      assertEquals(Integer.MAX_VALUE, decimalFormat0.getMaximumIntegerDigits());
      assertEquals("", decimalFormat0.getPositivePrefix());
      assertNotNull(decimalFormat0);
      
      BoxAndWhiskerToolTipGenerator boxAndWhiskerToolTipGenerator0 = new BoxAndWhiskerToolTipGenerator("", decimalFormat0);
      assertEquals("", decimalFormat0.getNegativeSuffix());
      assertEquals(3, decimalFormat0.getGroupingSize());
      assertEquals(RoundingMode.HALF_EVEN, decimalFormat0.getRoundingMode());
      assertFalse(decimalFormat0.isDecimalSeparatorAlwaysShown());
      assertEquals("#,##0.###", decimalFormat0.toPattern());
      assertEquals(1, decimalFormat0.getMinimumIntegerDigits());
      assertEquals(0, decimalFormat0.getMinimumFractionDigits());
      assertFalse(decimalFormat0.isParseBigDecimal());
      assertEquals("", decimalFormat0.getPositiveSuffix());
      assertFalse(decimalFormat0.isParseIntegerOnly());
      assertTrue(decimalFormat0.isGroupingUsed());
      assertEquals("#,##0.###", decimalFormat0.toLocalizedPattern());
      assertEquals("-", decimalFormat0.getNegativePrefix());
      assertEquals(3, decimalFormat0.getMaximumFractionDigits());
      assertEquals(1, decimalFormat0.getMultiplier());
      assertEquals(Integer.MAX_VALUE, decimalFormat0.getMaximumIntegerDigits());
      assertEquals("", decimalFormat0.getPositivePrefix());
      assertEquals("", boxAndWhiskerToolTipGenerator0.getLabelFormat());
      assertNotNull(boxAndWhiskerToolTipGenerator0);
      
      double[][] doubleArray0 = new double[8][6];
      double[] doubleArray1 = new double[1];
      doubleArray1[0] = (-1709.6);
      doubleArray0[0] = doubleArray1;
      double[] doubleArray2 = new double[9];
      assertFalse(doubleArray2.equals((Object)doubleArray1));
      
      doubleArray2[0] = 0.0;
      doubleArray2[1] = 3.3;
      doubleArray2[2] = (-1709.6);
      doubleArray2[3] = (-1709.6);
      doubleArray2[4] = (-1709.6);
      doubleArray2[5] = (-1709.6);
      doubleArray2[6] = (-1709.6);
      doubleArray2[7] = (-1709.6);
      doubleArray2[8] = (-1709.6);
      doubleArray0[1] = doubleArray2;
      double[] doubleArray3 = new double[5];
      assertFalse(doubleArray3.equals((Object)doubleArray1));
      assertFalse(doubleArray3.equals((Object)doubleArray2));
      
      doubleArray3[0] = (-1709.6);
      doubleArray3[1] = (-1709.6);
      doubleArray3[2] = 0.0;
      doubleArray3[3] = 3.3;
      doubleArray3[4] = 3.3;
      doubleArray0[2] = doubleArray3;
      double[] doubleArray4 = new double[3];
      assertFalse(doubleArray4.equals((Object)doubleArray3));
      assertFalse(doubleArray4.equals((Object)doubleArray1));
      assertFalse(doubleArray4.equals((Object)doubleArray2));
      
      doubleArray4[0] = 3.3;
      doubleArray4[1] = (-1709.6);
      doubleArray4[2] = (-1709.6);
      doubleArray0[3] = doubleArray4;
      double[] doubleArray5 = new double[7];
      assertFalse(doubleArray5.equals((Object)doubleArray3));
      assertFalse(doubleArray5.equals((Object)doubleArray1));
      assertFalse(doubleArray5.equals((Object)doubleArray2));
      assertFalse(doubleArray5.equals((Object)doubleArray4));
      
      doubleArray5[0] = 0.0;
      doubleArray5[1] = 0.0;
      doubleArray5[2] = 0.0;
      doubleArray5[3] = 0.0;
      doubleArray5[4] = (-1709.6);
      doubleArray5[5] = (-1709.6);
      doubleArray5[6] = 0.0;
      doubleArray0[4] = doubleArray5;
      double[] doubleArray6 = new double[5];
      assertFalse(doubleArray6.equals((Object)doubleArray3));
      assertFalse(doubleArray6.equals((Object)doubleArray5));
      assertFalse(doubleArray6.equals((Object)doubleArray2));
      assertFalse(doubleArray6.equals((Object)doubleArray4));
      assertFalse(doubleArray6.equals((Object)doubleArray1));
      
      doubleArray6[0] = 0.0;
      doubleArray6[1] = (-1709.6);
      doubleArray6[2] = 0.0;
      doubleArray6[3] = 3.3;
      doubleArray6[4] = 3.3;
      doubleArray0[5] = doubleArray6;
      double[] doubleArray7 = new double[5];
      assertFalse(doubleArray7.equals((Object)doubleArray4));
      assertFalse(doubleArray7.equals((Object)doubleArray6));
      assertFalse(doubleArray7.equals((Object)doubleArray2));
      assertFalse(doubleArray7.equals((Object)doubleArray5));
      assertFalse(doubleArray7.equals((Object)doubleArray1));
      assertFalse(doubleArray7.equals((Object)doubleArray3));
      
      doubleArray7[0] = 0.0;
      doubleArray7[1] = 0.0;
      doubleArray7[2] = 0.0;
      doubleArray7[3] = (-1709.6);
      doubleArray7[4] = (-1709.6);
      doubleArray0[6] = doubleArray7;
      double[] doubleArray8 = new double[3];
      assertFalse(doubleArray8.equals((Object)doubleArray6));
      assertFalse(doubleArray8.equals((Object)doubleArray1));
      assertFalse(doubleArray8.equals((Object)doubleArray4));
      assertFalse(doubleArray8.equals((Object)doubleArray3));
      assertFalse(doubleArray8.equals((Object)doubleArray7));
      assertFalse(doubleArray8.equals((Object)doubleArray5));
      assertFalse(doubleArray8.equals((Object)doubleArray2));
      
      doubleArray8[0] = 0.0;
      doubleArray8[1] = 0.0;
      doubleArray8[2] = 3.3;
      doubleArray0[7] = doubleArray8;
      DefaultIntervalCategoryDataset defaultIntervalCategoryDataset0 = new DefaultIntervalCategoryDataset(doubleArray0, doubleArray0);
      assertTrue(defaultIntervalCategoryDataset0.getNotify());
      assertEquals(1, defaultIntervalCategoryDataset0.getCategoryCount());
      assertEquals(8, defaultIntervalCategoryDataset0.getRowCount());
      assertEquals(1, defaultIntervalCategoryDataset0.getColumnCount());
      assertEquals(8, defaultIntervalCategoryDataset0.getSeriesCount());
      assertEquals(8, doubleArray0.length);
      assertNotNull(defaultIntervalCategoryDataset0);
      
      // Undeclared exception!
      try { 
        boxAndWhiskerToolTipGenerator0.createItemArray(defaultIntervalCategoryDataset0, 1510, 1510);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The 'row' argument is out of bounds.
         //
         verifyException("org.jfree.data.category.DefaultIntervalCategoryDataset", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      BoxAndWhiskerToolTipGenerator boxAndWhiskerToolTipGenerator0 = new BoxAndWhiskerToolTipGenerator();
      assertEquals("X: {1} Mean: {2} Median: {3} Min: {4} Max: {5} Q1: {6} Q3: {7} ", boxAndWhiskerToolTipGenerator0.getLabelFormat());
      assertNotNull(boxAndWhiskerToolTipGenerator0);
      
      CategoryDataset categoryDataset0 = mock(CategoryDataset.class, new ViolatedAssumptionAnswer());
      doReturn("X: {1} Mean: {2} Median: {3} Min: {4} Max: {5} Q1: {6} Q3: {7} ").when(categoryDataset0).getRowKey(anyInt());
      int int0 = 0;
      String string0 = boxAndWhiskerToolTipGenerator0.generateRowLabel(categoryDataset0, 0);
      assertEquals("X: {1} Mean: {2} Median: {3} Min: {4} Max: {5} Q1: {6} Q3: {7} ", boxAndWhiskerToolTipGenerator0.getLabelFormat());
      assertNotNull(string0);
      
      TaskSeriesCollection taskSeriesCollection0 = new TaskSeriesCollection();
      assertEquals(0, taskSeriesCollection0.getRowCount());
      assertTrue(taskSeriesCollection0.getNotify());
      assertEquals(0, taskSeriesCollection0.getSeriesCount());
      assertEquals(0, taskSeriesCollection0.getColumnCount());
      assertNotNull(taskSeriesCollection0);
      
      XYTaskDataset xYTaskDataset0 = new XYTaskDataset(taskSeriesCollection0);
      assertEquals(0, taskSeriesCollection0.getRowCount());
      assertTrue(taskSeriesCollection0.getNotify());
      assertEquals(0, taskSeriesCollection0.getSeriesCount());
      assertEquals(0, taskSeriesCollection0.getColumnCount());
      assertEquals(0.8, xYTaskDataset0.getSeriesWidth(), 0.01);
      assertTrue(xYTaskDataset0.getNotify());
      assertEquals(0, xYTaskDataset0.getSeriesCount());
      assertFalse(xYTaskDataset0.isTransposed());
      assertNotNull(xYTaskDataset0);
      
      TaskSeriesCollection taskSeriesCollection1 = xYTaskDataset0.getTasks();
      assertSame(taskSeriesCollection0, taskSeriesCollection1);
      assertSame(taskSeriesCollection1, taskSeriesCollection0);
      assertEquals(0, taskSeriesCollection0.getRowCount());
      assertTrue(taskSeriesCollection0.getNotify());
      assertEquals(0, taskSeriesCollection0.getSeriesCount());
      assertEquals(0, taskSeriesCollection0.getColumnCount());
      assertEquals(0.8, xYTaskDataset0.getSeriesWidth(), 0.01);
      assertTrue(xYTaskDataset0.getNotify());
      assertEquals(0, xYTaskDataset0.getSeriesCount());
      assertFalse(xYTaskDataset0.isTransposed());
      assertTrue(taskSeriesCollection1.getNotify());
      assertEquals(0, taskSeriesCollection1.getRowCount());
      assertEquals(0, taskSeriesCollection1.getColumnCount());
      assertEquals(0, taskSeriesCollection1.getSeriesCount());
      assertNotNull(taskSeriesCollection1);
      
      SlidingGanttCategoryDataset slidingGanttCategoryDataset0 = new SlidingGanttCategoryDataset(taskSeriesCollection1, (-552), (-552));
      assertEquals(0, taskSeriesCollection0.getRowCount());
      assertTrue(taskSeriesCollection0.getNotify());
      assertEquals(0, taskSeriesCollection0.getSeriesCount());
      assertEquals(0, taskSeriesCollection0.getColumnCount());
      assertEquals(0.8, xYTaskDataset0.getSeriesWidth(), 0.01);
      assertTrue(xYTaskDataset0.getNotify());
      assertEquals(0, xYTaskDataset0.getSeriesCount());
      assertFalse(xYTaskDataset0.isTransposed());
      assertTrue(taskSeriesCollection1.getNotify());
      assertEquals(0, taskSeriesCollection1.getRowCount());
      assertEquals(0, taskSeriesCollection1.getColumnCount());
      assertEquals(0, taskSeriesCollection1.getSeriesCount());
      assertTrue(slidingGanttCategoryDataset0.getNotify());
      assertEquals((-552), slidingGanttCategoryDataset0.getMaximumCategoryCount());
      assertEquals((-552), slidingGanttCategoryDataset0.getFirstCategoryIndex());
      assertNotNull(slidingGanttCategoryDataset0);
      
      TaskSeriesCollection taskSeriesCollection2 = (TaskSeriesCollection)slidingGanttCategoryDataset0.getUnderlyingDataset();
      assertSame(taskSeriesCollection0, taskSeriesCollection1);
      assertSame(taskSeriesCollection0, taskSeriesCollection2);
      assertSame(taskSeriesCollection1, taskSeriesCollection0);
      assertSame(taskSeriesCollection1, taskSeriesCollection2);
      assertSame(taskSeriesCollection2, taskSeriesCollection0);
      assertSame(taskSeriesCollection2, taskSeriesCollection1);
      assertEquals(0, taskSeriesCollection0.getRowCount());
      assertTrue(taskSeriesCollection0.getNotify());
      assertEquals(0, taskSeriesCollection0.getSeriesCount());
      assertEquals(0, taskSeriesCollection0.getColumnCount());
      assertEquals(0.8, xYTaskDataset0.getSeriesWidth(), 0.01);
      assertTrue(xYTaskDataset0.getNotify());
      assertEquals(0, xYTaskDataset0.getSeriesCount());
      assertFalse(xYTaskDataset0.isTransposed());
      assertTrue(taskSeriesCollection1.getNotify());
      assertEquals(0, taskSeriesCollection1.getRowCount());
      assertEquals(0, taskSeriesCollection1.getColumnCount());
      assertEquals(0, taskSeriesCollection1.getSeriesCount());
      assertTrue(slidingGanttCategoryDataset0.getNotify());
      assertEquals((-552), slidingGanttCategoryDataset0.getMaximumCategoryCount());
      assertEquals((-552), slidingGanttCategoryDataset0.getFirstCategoryIndex());
      assertEquals(0, taskSeriesCollection2.getColumnCount());
      assertEquals(0, taskSeriesCollection2.getSeriesCount());
      assertEquals(0, taskSeriesCollection2.getRowCount());
      assertTrue(taskSeriesCollection2.getNotify());
      assertNotNull(taskSeriesCollection2);
      
      // Undeclared exception!
      try { 
        boxAndWhiskerToolTipGenerator0.createItemArray(taskSeriesCollection2, 0, 0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 0, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      StringBuffer stringBuffer0 = new StringBuffer(817);
      assertEquals(0, stringBuffer0.length());
      assertEquals("", stringBuffer0.toString());
      assertNotNull(stringBuffer0);
      
      NumberFormat numberFormat0 = mock(NumberFormat.class, new ViolatedAssumptionAnswer());
      BoxAndWhiskerToolTipGenerator boxAndWhiskerToolTipGenerator0 = new BoxAndWhiskerToolTipGenerator("hY^", numberFormat0);
      assertEquals("hY^", boxAndWhiskerToolTipGenerator0.getLabelFormat());
      assertNotNull(boxAndWhiskerToolTipGenerator0);
      
      Connection connection0 = mock(Connection.class, new ViolatedAssumptionAnswer());
      JDBCCategoryDataset jDBCCategoryDataset0 = new JDBCCategoryDataset(connection0);
      assertTrue(jDBCCategoryDataset0.getNotify());
      assertTrue(jDBCCategoryDataset0.getTranspose());
      assertNotNull(jDBCCategoryDataset0);
      
      // Undeclared exception!
      try { 
        boxAndWhiskerToolTipGenerator0.createItemArray(jDBCCategoryDataset0, (-260), 1);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      BoxAndWhiskerToolTipGenerator boxAndWhiskerToolTipGenerator0 = new BoxAndWhiskerToolTipGenerator();
      assertEquals("X: {1} Mean: {2} Median: {3} Min: {4} Max: {5} Q1: {6} Q3: {7} ", boxAndWhiskerToolTipGenerator0.getLabelFormat());
      assertNotNull(boxAndWhiskerToolTipGenerator0);
      
      BoxAndWhiskerToolTipGenerator boxAndWhiskerToolTipGenerator1 = (BoxAndWhiskerToolTipGenerator)boxAndWhiskerToolTipGenerator0.clone();
      assertNotSame(boxAndWhiskerToolTipGenerator0, boxAndWhiskerToolTipGenerator1);
      assertNotSame(boxAndWhiskerToolTipGenerator1, boxAndWhiskerToolTipGenerator0);
      assertEquals("X: {1} Mean: {2} Median: {3} Min: {4} Max: {5} Q1: {6} Q3: {7} ", boxAndWhiskerToolTipGenerator0.getLabelFormat());
      assertEquals("X: {1} Mean: {2} Median: {3} Min: {4} Max: {5} Q1: {6} Q3: {7} ", boxAndWhiskerToolTipGenerator1.getLabelFormat());
      assertTrue(boxAndWhiskerToolTipGenerator1.equals((Object)boxAndWhiskerToolTipGenerator0));
      assertNotNull(boxAndWhiskerToolTipGenerator1);
      
      boolean boolean0 = boxAndWhiskerToolTipGenerator0.equals(boxAndWhiskerToolTipGenerator1);
      assertNotSame(boxAndWhiskerToolTipGenerator0, boxAndWhiskerToolTipGenerator1);
      assertNotSame(boxAndWhiskerToolTipGenerator1, boxAndWhiskerToolTipGenerator0);
      assertTrue(boolean0);
      assertEquals("X: {1} Mean: {2} Median: {3} Min: {4} Max: {5} Q1: {6} Q3: {7} ", boxAndWhiskerToolTipGenerator0.getLabelFormat());
      assertEquals("X: {1} Mean: {2} Median: {3} Min: {4} Max: {5} Q1: {6} Q3: {7} ", boxAndWhiskerToolTipGenerator1.getLabelFormat());
      assertTrue(boxAndWhiskerToolTipGenerator0.equals((Object)boxAndWhiskerToolTipGenerator1));
      assertTrue(boxAndWhiskerToolTipGenerator1.equals((Object)boxAndWhiskerToolTipGenerator0));
      
      Byte byte0 = new Byte((byte) (-93));
      assertEquals((byte) (-93), (byte)byte0);
      assertNotNull(byte0);
      
      CategoryDataset categoryDataset0 = mock(CategoryDataset.class, new ViolatedAssumptionAnswer());
      doReturn("X: {1} Mean: {2} Median: {3} Min: {4} Max: {5} Q1: {6} Q3: {7} ").when(categoryDataset0).getRowKey(anyInt());
      doReturn(byte0).when(categoryDataset0).getValue(anyInt() , anyInt());
      Object[] objectArray0 = boxAndWhiskerToolTipGenerator0.createItemArray(categoryDataset0, 7, 0);
      assertNotSame(boxAndWhiskerToolTipGenerator0, boxAndWhiskerToolTipGenerator1);
      assertEquals("X: {1} Mean: {2} Median: {3} Min: {4} Max: {5} Q1: {6} Q3: {7} ", boxAndWhiskerToolTipGenerator0.getLabelFormat());
      assertTrue(boxAndWhiskerToolTipGenerator0.equals((Object)boxAndWhiskerToolTipGenerator1));
      assertEquals(8, objectArray0.length);
      assertNotNull(objectArray0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      NumberFormat numberFormat0 = null;
      BoxAndWhiskerToolTipGenerator boxAndWhiskerToolTipGenerator0 = null;
      try {
        boxAndWhiskerToolTipGenerator0 = new BoxAndWhiskerToolTipGenerator("o", (NumberFormat) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'formatter' argument.
         //
         verifyException("org.jfree.chart.util.Args", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      NumberFormat numberFormat0 = mock(NumberFormat.class, new ViolatedAssumptionAnswer());
      doReturn((StringBuffer) null).when(numberFormat0).format(any() , any(java.lang.StringBuffer.class) , any(java.text.FieldPosition.class));
      BoxAndWhiskerToolTipGenerator boxAndWhiskerToolTipGenerator0 = new BoxAndWhiskerToolTipGenerator("u!T4.(jxYVS", numberFormat0);
      assertEquals("u!T4.(jxYVS", boxAndWhiskerToolTipGenerator0.getLabelFormat());
      assertNotNull(boxAndWhiskerToolTipGenerator0);
      
      CategoryDataset categoryDataset0 = mock(CategoryDataset.class, new ViolatedAssumptionAnswer());
      doReturn((Comparable) null).when(categoryDataset0).getRowKey(anyInt());
      doReturn((Number) null).when(categoryDataset0).getValue(anyInt() , anyInt());
      int int0 = 0;
      // Undeclared exception!
      try { 
        boxAndWhiskerToolTipGenerator0.createItemArray(categoryDataset0, 0, 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.text.Format", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      BoxAndWhiskerToolTipGenerator boxAndWhiskerToolTipGenerator0 = new BoxAndWhiskerToolTipGenerator();
      assertEquals("X: {1} Mean: {2} Median: {3} Min: {4} Max: {5} Q1: {6} Q3: {7} ", boxAndWhiskerToolTipGenerator0.getLabelFormat());
      assertNotNull(boxAndWhiskerToolTipGenerator0);
      
      CategoryDataset categoryDataset0 = mock(CategoryDataset.class, new ViolatedAssumptionAnswer());
      CategoryDataset categoryDataset1 = mock(CategoryDataset.class, new ViolatedAssumptionAnswer());
      doReturn((Comparable) null).when(categoryDataset1).getRowKey(anyInt());
      doReturn((Number) null).when(categoryDataset1).getValue(anyInt() , anyInt());
      int int0 = 0;
      // Undeclared exception!
      try { 
        boxAndWhiskerToolTipGenerator0.createItemArray(categoryDataset1, 0, 0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Cannot format given Object as a Number
         //
         verifyException("java.text.DecimalFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      DecimalFormat decimalFormat0 = (DecimalFormat)NumberFormat.getCurrencyInstance();
      assertEquals("\u00A4#,##0.00", decimalFormat0.toPattern());
      assertEquals("\u00A4", decimalFormat0.getPositivePrefix());
      assertEquals("", decimalFormat0.getNegativeSuffix());
      assertEquals(2, decimalFormat0.getMaximumFractionDigits());
      assertFalse(decimalFormat0.isParseBigDecimal());
      assertEquals("-\u00A4", decimalFormat0.getNegativePrefix());
      assertFalse(decimalFormat0.isDecimalSeparatorAlwaysShown());
      assertFalse(decimalFormat0.isParseIntegerOnly());
      assertTrue(decimalFormat0.isGroupingUsed());
      assertEquals("", decimalFormat0.getPositiveSuffix());
      assertEquals(2, decimalFormat0.getMinimumFractionDigits());
      assertEquals(1, decimalFormat0.getMinimumIntegerDigits());
      assertEquals("\u00A4#,##0.00", decimalFormat0.toLocalizedPattern());
      assertEquals(Integer.MAX_VALUE, decimalFormat0.getMaximumIntegerDigits());
      assertEquals(RoundingMode.HALF_EVEN, decimalFormat0.getRoundingMode());
      assertEquals(3, decimalFormat0.getGroupingSize());
      assertEquals(1, decimalFormat0.getMultiplier());
      assertNotNull(decimalFormat0);
      
      BoxAndWhiskerToolTipGenerator boxAndWhiskerToolTipGenerator0 = new BoxAndWhiskerToolTipGenerator("The 'data' array must contain three arrays all having the same length.", decimalFormat0);
      assertEquals("\u00A4#,##0.00", decimalFormat0.toPattern());
      assertEquals("\u00A4", decimalFormat0.getPositivePrefix());
      assertEquals("", decimalFormat0.getNegativeSuffix());
      assertEquals(2, decimalFormat0.getMaximumFractionDigits());
      assertFalse(decimalFormat0.isParseBigDecimal());
      assertEquals("-\u00A4", decimalFormat0.getNegativePrefix());
      assertFalse(decimalFormat0.isDecimalSeparatorAlwaysShown());
      assertFalse(decimalFormat0.isParseIntegerOnly());
      assertTrue(decimalFormat0.isGroupingUsed());
      assertEquals("", decimalFormat0.getPositiveSuffix());
      assertEquals(2, decimalFormat0.getMinimumFractionDigits());
      assertEquals(1, decimalFormat0.getMinimumIntegerDigits());
      assertEquals("\u00A4#,##0.00", decimalFormat0.toLocalizedPattern());
      assertEquals(Integer.MAX_VALUE, decimalFormat0.getMaximumIntegerDigits());
      assertEquals(RoundingMode.HALF_EVEN, decimalFormat0.getRoundingMode());
      assertEquals(3, decimalFormat0.getGroupingSize());
      assertEquals(1, decimalFormat0.getMultiplier());
      assertEquals("The 'data' array must contain three arrays all having the same length.", boxAndWhiskerToolTipGenerator0.getLabelFormat());
      assertNotNull(boxAndWhiskerToolTipGenerator0);
      
      JPasswordField jPasswordField0 = new JPasswordField(4936);
      assertTrue(jPasswordField0.getFocusTraversalKeysEnabled());
      assertFalse(jPasswordField0.getIgnoreRepaint());
      assertFalse(jPasswordField0.isFocusTraversalPolicySet());
      assertFalse(jPasswordField0.isFocusCycleRoot());
      assertFalse(jPasswordField0.isFocusTraversalPolicyProvider());
      assertNotNull(jPasswordField0);
      
      boolean boolean0 = boxAndWhiskerToolTipGenerator0.equals(jPasswordField0);
      assertFalse(boolean0);
      assertEquals("\u00A4#,##0.00", decimalFormat0.toPattern());
      assertEquals("\u00A4", decimalFormat0.getPositivePrefix());
      assertEquals("", decimalFormat0.getNegativeSuffix());
      assertEquals(2, decimalFormat0.getMaximumFractionDigits());
      assertFalse(decimalFormat0.isParseBigDecimal());
      assertEquals("-\u00A4", decimalFormat0.getNegativePrefix());
      assertFalse(decimalFormat0.isDecimalSeparatorAlwaysShown());
      assertFalse(decimalFormat0.isParseIntegerOnly());
      assertTrue(decimalFormat0.isGroupingUsed());
      assertEquals("", decimalFormat0.getPositiveSuffix());
      assertEquals(2, decimalFormat0.getMinimumFractionDigits());
      assertEquals(1, decimalFormat0.getMinimumIntegerDigits());
      assertEquals("\u00A4#,##0.00", decimalFormat0.toLocalizedPattern());
      assertEquals(Integer.MAX_VALUE, decimalFormat0.getMaximumIntegerDigits());
      assertEquals(RoundingMode.HALF_EVEN, decimalFormat0.getRoundingMode());
      assertEquals(3, decimalFormat0.getGroupingSize());
      assertEquals(1, decimalFormat0.getMultiplier());
      assertEquals("The 'data' array must contain three arrays all having the same length.", boxAndWhiskerToolTipGenerator0.getLabelFormat());
      assertTrue(jPasswordField0.getFocusTraversalKeysEnabled());
      assertFalse(jPasswordField0.getIgnoreRepaint());
      assertFalse(jPasswordField0.isFocusTraversalPolicySet());
      assertFalse(jPasswordField0.isFocusCycleRoot());
      assertFalse(jPasswordField0.isFocusTraversalPolicyProvider());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      BoxAndWhiskerToolTipGenerator boxAndWhiskerToolTipGenerator0 = new BoxAndWhiskerToolTipGenerator();
      assertEquals("X: {1} Mean: {2} Median: {3} Min: {4} Max: {5} Q1: {6} Q3: {7} ", boxAndWhiskerToolTipGenerator0.getLabelFormat());
      assertNotNull(boxAndWhiskerToolTipGenerator0);
      
      TaskSeriesCollection taskSeriesCollection0 = new TaskSeriesCollection();
      assertEquals(0, taskSeriesCollection0.getRowCount());
      assertTrue(taskSeriesCollection0.getNotify());
      assertEquals(0, taskSeriesCollection0.getColumnCount());
      assertEquals(0, taskSeriesCollection0.getSeriesCount());
      assertNotNull(taskSeriesCollection0);
      
      XYTaskDataset xYTaskDataset0 = new XYTaskDataset(taskSeriesCollection0);
      assertEquals(0, taskSeriesCollection0.getRowCount());
      assertTrue(taskSeriesCollection0.getNotify());
      assertEquals(0, taskSeriesCollection0.getColumnCount());
      assertEquals(0, taskSeriesCollection0.getSeriesCount());
      assertEquals(0.8, xYTaskDataset0.getSeriesWidth(), 0.01);
      assertFalse(xYTaskDataset0.isTransposed());
      assertTrue(xYTaskDataset0.getNotify());
      assertEquals(0, xYTaskDataset0.getSeriesCount());
      assertNotNull(xYTaskDataset0);
      
      TaskSeriesCollection taskSeriesCollection1 = xYTaskDataset0.getTasks();
      assertSame(taskSeriesCollection0, taskSeriesCollection1);
      assertSame(taskSeriesCollection1, taskSeriesCollection0);
      assertEquals(0, taskSeriesCollection0.getRowCount());
      assertTrue(taskSeriesCollection0.getNotify());
      assertEquals(0, taskSeriesCollection0.getColumnCount());
      assertEquals(0, taskSeriesCollection0.getSeriesCount());
      assertEquals(0.8, xYTaskDataset0.getSeriesWidth(), 0.01);
      assertFalse(xYTaskDataset0.isTransposed());
      assertTrue(xYTaskDataset0.getNotify());
      assertEquals(0, xYTaskDataset0.getSeriesCount());
      assertEquals(0, taskSeriesCollection1.getSeriesCount());
      assertEquals(0, taskSeriesCollection1.getColumnCount());
      assertTrue(taskSeriesCollection1.getNotify());
      assertEquals(0, taskSeriesCollection1.getRowCount());
      assertNotNull(taskSeriesCollection1);
      
      xYTaskDataset0.setSeriesWidth(553.233);
      assertSame(taskSeriesCollection0, taskSeriesCollection1);
      assertEquals(0, taskSeriesCollection0.getRowCount());
      assertTrue(taskSeriesCollection0.getNotify());
      assertEquals(0, taskSeriesCollection0.getColumnCount());
      assertEquals(0, taskSeriesCollection0.getSeriesCount());
      assertEquals(553.233, xYTaskDataset0.getSeriesWidth(), 0.01);
      assertFalse(xYTaskDataset0.isTransposed());
      assertTrue(xYTaskDataset0.getNotify());
      assertEquals(0, xYTaskDataset0.getSeriesCount());
      
      // Undeclared exception!
      try { 
        taskSeriesCollection0.getSubIntervalCount(1956, 1956);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 1956, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      BoxAndWhiskerToolTipGenerator boxAndWhiskerToolTipGenerator0 = new BoxAndWhiskerToolTipGenerator();
      assertEquals("X: {1} Mean: {2} Median: {3} Min: {4} Max: {5} Q1: {6} Q3: {7} ", boxAndWhiskerToolTipGenerator0.getLabelFormat());
      assertNotNull(boxAndWhiskerToolTipGenerator0);
      
      CategoryDataset categoryDataset0 = mock(CategoryDataset.class, new ViolatedAssumptionAnswer());
      doReturn((Comparable) null).when(categoryDataset0).getRowKey(anyInt());
      doReturn((Number) null).when(categoryDataset0).getValue(anyInt() , anyInt());
      // Undeclared exception!
      try { 
        boxAndWhiskerToolTipGenerator0.createItemArray(categoryDataset0, 0, (-93));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Cannot format given Object as a Number
         //
         verifyException("java.text.DecimalFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      String string0 = "";
      StringBuffer stringBuffer0 = new StringBuffer();
      assertEquals(0, stringBuffer0.length());
      assertEquals("", stringBuffer0.toString());
      assertNotNull(stringBuffer0);
      
      NumberFormat numberFormat0 = mock(NumberFormat.class, new ViolatedAssumptionAnswer());
      doReturn(stringBuffer0).when(numberFormat0).format(any() , any(java.lang.StringBuffer.class) , any(java.text.FieldPosition.class));
      BoxAndWhiskerToolTipGenerator boxAndWhiskerToolTipGenerator0 = new BoxAndWhiskerToolTipGenerator("", numberFormat0);
      assertEquals(0, stringBuffer0.length());
      assertEquals("", stringBuffer0.toString());
      assertEquals("", boxAndWhiskerToolTipGenerator0.getLabelFormat());
      assertNotNull(boxAndWhiskerToolTipGenerator0);
      
      CategoryDataset categoryDataset0 = mock(CategoryDataset.class, new ViolatedAssumptionAnswer());
      boolean boolean0 = boxAndWhiskerToolTipGenerator0.equals("");
      assertFalse(boolean0);
      assertEquals(0, stringBuffer0.length());
      assertEquals("", stringBuffer0.toString());
      assertEquals("", boxAndWhiskerToolTipGenerator0.getLabelFormat());
      
      int int0 = 0;
      int int1 = 2221;
      CategoryDataset categoryDataset1 = mock(CategoryDataset.class, new ViolatedAssumptionAnswer());
      doReturn("").when(categoryDataset1).getRowKey(anyInt());
      doReturn((Number) null).when(categoryDataset1).getValue(anyInt() , anyInt());
      Object[] objectArray0 = boxAndWhiskerToolTipGenerator0.createItemArray(categoryDataset1, 0, 2);
      assertEquals(0, stringBuffer0.length());
      assertEquals("", stringBuffer0.toString());
      assertEquals("", boxAndWhiskerToolTipGenerator0.getLabelFormat());
      assertEquals(8, objectArray0.length);
      assertNotNull(objectArray0);
      
      CategoryDataset categoryDataset2 = mock(CategoryDataset.class, new ViolatedAssumptionAnswer());
      doReturn((Comparable) null).when(categoryDataset2).getRowKey(anyInt());
      // Undeclared exception!
      try { 
        boxAndWhiskerToolTipGenerator0.generateRowLabel(categoryDataset2, 5);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.System", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      BoxAndWhiskerToolTipGenerator boxAndWhiskerToolTipGenerator0 = new BoxAndWhiskerToolTipGenerator();
      Object object0 = boxAndWhiskerToolTipGenerator0.clone();
      boxAndWhiskerToolTipGenerator0.equals(object0);
      Object object1 = boxAndWhiskerToolTipGenerator0.clone();
      CategoryDataset categoryDataset0 = mock(CategoryDataset.class, new ViolatedAssumptionAnswer());
      doReturn("({0}, {1}) = {2}").when(categoryDataset0).getColumnKey(anyInt());
      NumberFormat numberFormat0 = mock(NumberFormat.class, new ViolatedAssumptionAnswer());
      BoxAndWhiskerToolTipGenerator boxAndWhiskerToolTipGenerator1 = new BoxAndWhiskerToolTipGenerator("X: {1} Mean: {2} Median: {3} Min: {4} Max: {5} Q1: {6} Q3: {7} ", numberFormat0);
      boxAndWhiskerToolTipGenerator0.equals(boxAndWhiskerToolTipGenerator1);
      boxAndWhiskerToolTipGenerator0.generateColumnLabel(categoryDataset0, 5);
      boxAndWhiskerToolTipGenerator0.equals(object1);
      boxAndWhiskerToolTipGenerator0.equals(object1);
      boxAndWhiskerToolTipGenerator0.equals("java.lang.String@0000000003");
      boxAndWhiskerToolTipGenerator0.equals("java.lang.String@0000000003");
      CategoryDataset categoryDataset1 = null;
      // Undeclared exception!
      try { 
        boxAndWhiskerToolTipGenerator1.createItemArray((CategoryDataset) null, 5, 5);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.labels.BoxAndWhiskerToolTipGenerator", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter(1693);
      StringBuffer stringBuffer0 = stringWriter0.getBuffer();
      NumberFormat numberFormat0 = mock(NumberFormat.class, new ViolatedAssumptionAnswer());
      doReturn(stringBuffer0).when(numberFormat0).format(any() , any(java.lang.StringBuffer.class) , any(java.text.FieldPosition.class));
      BoxAndWhiskerToolTipGenerator boxAndWhiskerToolTipGenerator0 = new BoxAndWhiskerToolTipGenerator("", numberFormat0);
      Long long0 = new Long(1693);
      CategoryDataset categoryDataset0 = mock(CategoryDataset.class, new ViolatedAssumptionAnswer());
      doReturn("({0}, {1}) = {2}").when(categoryDataset0).getRowKey(anyInt());
      doReturn(long0).when(categoryDataset0).getValue(anyInt() , anyInt());
      JPasswordField jPasswordField0 = new JPasswordField("");
      boolean boolean0 = boxAndWhiskerToolTipGenerator0.equals(jPasswordField0);
      assertFalse(boolean0);
      
      stringWriter0.write("");
      Object[] objectArray0 = boxAndWhiskerToolTipGenerator0.createItemArray(categoryDataset0, (-551), 0);
      assertEquals(8, objectArray0.length);
  }
}
