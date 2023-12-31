/*
 * This file was automatically generated by EvoSuite
 * Tue May 16 05:52:54 GMT 2023
 */

package org.jfree.chart.labels;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.text.NumberFormat;
import java.util.Locale;
import javax.swing.JComponent;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jfree.chart.labels.StandardPieToolTipGenerator;
import org.jfree.chart.util.TableOrder;
import org.jfree.data.category.CategoryToPieDataset;
import org.jfree.data.gantt.TaskSeriesCollection;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.data.general.PieDataset;
import org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class StandardPieToolTipGenerator_ESTest extends StandardPieToolTipGenerator_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Locale locale0 = Locale.UK;
      StandardPieToolTipGenerator standardPieToolTipGenerator0 = new StandardPieToolTipGenerator(locale0);
      String string0 = standardPieToolTipGenerator0.generateToolTip((PieDataset) null, "United Kingdom");
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Locale locale0 = Locale.UK;
      StandardPieToolTipGenerator standardPieToolTipGenerator0 = new StandardPieToolTipGenerator(locale0);
      DefaultPieDataset<String> defaultPieDataset0 = new DefaultPieDataset<String>();
      // Undeclared exception!
      try { 
        standardPieToolTipGenerator0.generateToolTip(defaultPieDataset0, (Comparable) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.System", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      StandardPieToolTipGenerator standardPieToolTipGenerator0 = null;
      try {
        standardPieToolTipGenerator0 = new StandardPieToolTipGenerator((Locale) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      StandardPieToolTipGenerator standardPieToolTipGenerator0 = null;
      try {
        standardPieToolTipGenerator0 = new StandardPieToolTipGenerator("Yi/m>5&p0],$", (Locale) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Locale locale0 = new Locale("");
      StandardPieToolTipGenerator standardPieToolTipGenerator0 = null;
      try {
        standardPieToolTipGenerator0 = new StandardPieToolTipGenerator((String) null, locale0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'labelFormat' argument.
         //
         verifyException("org.jfree.chart.util.Args", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      StandardPieToolTipGenerator standardPieToolTipGenerator0 = null;
      try {
        standardPieToolTipGenerator0 = new StandardPieToolTipGenerator("A", (NumberFormat) null, (NumberFormat) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'numberFormat' argument.
         //
         verifyException("org.jfree.chart.util.Args", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      StandardPieToolTipGenerator standardPieToolTipGenerator0 = null;
      try {
        standardPieToolTipGenerator0 = new StandardPieToolTipGenerator((String) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'labelFormat' argument.
         //
         verifyException("org.jfree.chart.util.Args", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      StandardPieToolTipGenerator standardPieToolTipGenerator0 = new StandardPieToolTipGenerator("The 'data' array must have length == 6.");
      assertEquals("The 'data' array must have length == 6.", standardPieToolTipGenerator0.getLabelFormat());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      NumberFormat numberFormat0 = NumberFormat.getNumberInstance();
      StandardPieToolTipGenerator standardPieToolTipGenerator0 = new StandardPieToolTipGenerator("", numberFormat0, numberFormat0);
      assertEquals("", standardPieToolTipGenerator0.getLabelFormat());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Locale locale0 = JComponent.getDefaultLocale();
      StandardPieToolTipGenerator standardPieToolTipGenerator0 = new StandardPieToolTipGenerator("", locale0);
      DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new DefaultBoxAndWhiskerCategoryDataset();
      TableOrder tableOrder0 = TableOrder.BY_ROW;
      CategoryToPieDataset categoryToPieDataset0 = new CategoryToPieDataset(defaultBoxAndWhiskerCategoryDataset0, tableOrder0, (-1450));
      String string0 = standardPieToolTipGenerator0.generateToolTip(categoryToPieDataset0, "");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      StandardPieToolTipGenerator standardPieToolTipGenerator0 = new StandardPieToolTipGenerator();
      TaskSeriesCollection taskSeriesCollection0 = new TaskSeriesCollection();
      TableOrder tableOrder0 = TableOrder.BY_COLUMN;
      CategoryToPieDataset categoryToPieDataset0 = new CategoryToPieDataset(taskSeriesCollection0, tableOrder0, 0);
      String string0 = standardPieToolTipGenerator0.generateToolTip(categoryToPieDataset0, tableOrder0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Locale locale0 = Locale.ITALIAN;
      StandardPieToolTipGenerator standardPieToolTipGenerator0 = new StandardPieToolTipGenerator(locale0);
      Object object0 = standardPieToolTipGenerator0.clone();
      assertTrue(object0.equals((Object)standardPieToolTipGenerator0));
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Locale locale0 = Locale.ITALIAN;
      StandardPieToolTipGenerator standardPieToolTipGenerator0 = new StandardPieToolTipGenerator(locale0);
      DefaultPieDataset<Integer> defaultPieDataset0 = new DefaultPieDataset<Integer>();
      Integer integer0 = Integer.getInteger("{0}: ({1}, {2})", 0);
      // Undeclared exception!
      try { 
        standardPieToolTipGenerator0.generateToolTip(defaultPieDataset0, integer0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Key not found: 0
         //
         verifyException("org.jfree.data.DefaultKeyedValues", e);
      }
  }
}
