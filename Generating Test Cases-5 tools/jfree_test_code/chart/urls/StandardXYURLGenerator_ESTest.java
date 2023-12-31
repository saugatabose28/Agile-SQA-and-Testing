/*
 * This file was automatically generated by EvoSuite
 * Tue May 16 06:43:36 GMT 2023
 */

package org.jfree.chart.urls;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jfree.chart.urls.StandardXYURLGenerator;
import org.jfree.data.xy.DefaultTableXYDataset;
import org.jfree.data.xy.DefaultXYDataset;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class StandardXYURLGenerator_ESTest extends StandardXYURLGenerator_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      StandardXYURLGenerator standardXYURLGenerator0 = new StandardXYURLGenerator();
      standardXYURLGenerator0.hashCode();
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      StandardXYURLGenerator standardXYURLGenerator0 = new StandardXYURLGenerator("", "yp!c(NdyH`", "yp!c(NdyH`");
      DefaultXYDataset defaultXYDataset0 = new DefaultXYDataset();
      String string0 = standardXYURLGenerator0.generateURL(defaultXYDataset0, 193, 193);
      assertEquals("?yp!c(NdyH`=193&amp;yp!c(NdyH`=193", string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      StandardXYURLGenerator standardXYURLGenerator0 = null;
      try {
        standardXYURLGenerator0 = new StandardXYURLGenerator((String) null, "/U_<}{'F]ObR", "{wuf6e<");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'prefix' argument.
         //
         verifyException("org.jfree.chart.util.Args", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      StandardXYURLGenerator standardXYURLGenerator0 = null;
      try {
        standardXYURLGenerator0 = new StandardXYURLGenerator((String) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'prefix' argument.
         //
         verifyException("org.jfree.chart.util.Args", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      StandardXYURLGenerator standardXYURLGenerator0 = new StandardXYURLGenerator("", "yp!c(NdyH`", "yp!c(NdyH`");
      StandardXYURLGenerator standardXYURLGenerator1 = new StandardXYURLGenerator("", "yp!c(NdyH`", "index.html");
      boolean boolean0 = standardXYURLGenerator0.equals(standardXYURLGenerator1);
      assertFalse(standardXYURLGenerator1.equals((Object)standardXYURLGenerator0));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      StandardXYURLGenerator standardXYURLGenerator0 = new StandardXYURLGenerator("", "yp!c(NdyH`", "yp!c(NdyH`");
      StandardXYURLGenerator standardXYURLGenerator1 = new StandardXYURLGenerator("", "", "index.html");
      boolean boolean0 = standardXYURLGenerator0.equals(standardXYURLGenerator1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      StandardXYURLGenerator standardXYURLGenerator0 = new StandardXYURLGenerator();
      StandardXYURLGenerator standardXYURLGenerator1 = new StandardXYURLGenerator();
      boolean boolean0 = standardXYURLGenerator0.equals(standardXYURLGenerator1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      StandardXYURLGenerator standardXYURLGenerator0 = new StandardXYURLGenerator();
      StandardXYURLGenerator standardXYURLGenerator1 = new StandardXYURLGenerator("index.html?series=3675&amp;item=7");
      boolean boolean0 = standardXYURLGenerator0.equals(standardXYURLGenerator1);
      assertFalse(standardXYURLGenerator1.equals((Object)standardXYURLGenerator0));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      StandardXYURLGenerator standardXYURLGenerator0 = new StandardXYURLGenerator();
      boolean boolean0 = standardXYURLGenerator0.equals(standardXYURLGenerator0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      StandardXYURLGenerator standardXYURLGenerator0 = new StandardXYURLGenerator();
      boolean boolean0 = standardXYURLGenerator0.equals((Object) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      StandardXYURLGenerator standardXYURLGenerator0 = new StandardXYURLGenerator("index.html?series=3675&amp;item=7");
      DefaultTableXYDataset defaultTableXYDataset0 = new DefaultTableXYDataset();
      String string0 = standardXYURLGenerator0.generateURL(defaultTableXYDataset0, 3675, 0);
      assertEquals("index.html?series=3675&amp;item=7&amp;series=3675&amp;item=0", string0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      StandardXYURLGenerator standardXYURLGenerator0 = new StandardXYURLGenerator("", "yp!c(NdyH`", "yp!c(NdyH`");
      standardXYURLGenerator0.hashCode();
  }
}
