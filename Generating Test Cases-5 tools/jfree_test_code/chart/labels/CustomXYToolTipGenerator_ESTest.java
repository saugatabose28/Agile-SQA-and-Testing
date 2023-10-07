/*
 * This file was automatically generated by EvoSuite
 * Tue May 16 06:44:38 GMT 2023
 */

package org.jfree.chart.labels;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.List;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.jfree.chart.labels.CustomXYToolTipGenerator;
import org.jfree.data.xy.XYDataset;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class CustomXYToolTipGenerator_ESTest extends CustomXYToolTipGenerator_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      CustomXYToolTipGenerator customXYToolTipGenerator0 = new CustomXYToolTipGenerator();
      XYDataset xYDataset0 = mock(XYDataset.class, new ViolatedAssumptionAnswer());
      customXYToolTipGenerator0.generateToolTip(xYDataset0, 0, 5);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      CustomXYToolTipGenerator customXYToolTipGenerator0 = new CustomXYToolTipGenerator();
      customXYToolTipGenerator0.addToolTipSeries((List) null);
      customXYToolTipGenerator0.addToolTipSeries((List) null);
      CustomXYToolTipGenerator customXYToolTipGenerator1 = new CustomXYToolTipGenerator();
      customXYToolTipGenerator0.equals(customXYToolTipGenerator1);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      CustomXYToolTipGenerator customXYToolTipGenerator0 = new CustomXYToolTipGenerator();
      customXYToolTipGenerator0.addToolTipSeries((List) null);
      customXYToolTipGenerator0.getListCount();
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      CustomXYToolTipGenerator customXYToolTipGenerator0 = new CustomXYToolTipGenerator();
      // Undeclared exception!
      try { 
        customXYToolTipGenerator0.getToolTipText((-2669), 1);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      CustomXYToolTipGenerator customXYToolTipGenerator0 = new CustomXYToolTipGenerator();
      // Undeclared exception!
      try { 
        customXYToolTipGenerator0.getToolTipCount(1);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 1, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      CustomXYToolTipGenerator customXYToolTipGenerator0 = new CustomXYToolTipGenerator();
      // Undeclared exception!
      try { 
        customXYToolTipGenerator0.getToolTipCount((-387));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      CustomXYToolTipGenerator customXYToolTipGenerator0 = new CustomXYToolTipGenerator();
      XYDataset xYDataset0 = mock(XYDataset.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        customXYToolTipGenerator0.generateToolTip(xYDataset0, (-1690), (-1690));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      CustomXYToolTipGenerator customXYToolTipGenerator0 = new CustomXYToolTipGenerator();
      customXYToolTipGenerator0.getToolTipText(1756, 0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      CustomXYToolTipGenerator customXYToolTipGenerator0 = new CustomXYToolTipGenerator();
      customXYToolTipGenerator0.getListCount();
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      CustomXYToolTipGenerator customXYToolTipGenerator0 = new CustomXYToolTipGenerator();
      customXYToolTipGenerator0.addToolTipSeries((List) null);
      Object object0 = customXYToolTipGenerator0.clone();
      boolean boolean0 = customXYToolTipGenerator0.equals(object0);
      assertNotSame(object0, customXYToolTipGenerator0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      CustomXYToolTipGenerator customXYToolTipGenerator0 = new CustomXYToolTipGenerator();
      boolean boolean0 = customXYToolTipGenerator0.equals(customXYToolTipGenerator0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      CustomXYToolTipGenerator customXYToolTipGenerator0 = new CustomXYToolTipGenerator();
      boolean boolean0 = customXYToolTipGenerator0.equals((Object) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      CustomXYToolTipGenerator customXYToolTipGenerator0 = new CustomXYToolTipGenerator();
      customXYToolTipGenerator0.addToolTipSeries((List) null);
      String string0 = customXYToolTipGenerator0.getToolTipText(0, 0);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      CustomXYToolTipGenerator customXYToolTipGenerator0 = new CustomXYToolTipGenerator();
      customXYToolTipGenerator0.addToolTipSeries((List) null);
      int int0 = customXYToolTipGenerator0.getToolTipCount(0);
      assertEquals(0, int0);
  }
}
