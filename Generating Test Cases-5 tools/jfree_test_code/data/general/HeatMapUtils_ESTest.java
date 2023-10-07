/*
 * This file was automatically generated by EvoSuite
 * Tue May 16 06:01:29 GMT 2023
 */

package org.jfree.data.general;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.Paint;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.jfree.chart.renderer.PaintScale;
import org.jfree.data.general.HeatMapDataset;
import org.jfree.data.general.HeatMapUtils;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class HeatMapUtils_ESTest extends HeatMapUtils_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Comparable<Object> comparable0 = (Comparable<Object>) mock(Comparable.class, new ViolatedAssumptionAnswer());
      HeatMapDataset heatMapDataset0 = mock(HeatMapDataset.class, new ViolatedAssumptionAnswer());
      doReturn(Integer.MAX_VALUE).when(heatMapDataset0).getXSampleCount();
      doReturn(1457).when(heatMapDataset0).getYSampleCount();
      PaintScale paintScale0 = mock(PaintScale.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      HeatMapUtils.createHeatMapImage(heatMapDataset0, paintScale0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      HeatMapDataset heatMapDataset0 = mock(HeatMapDataset.class, new ViolatedAssumptionAnswer());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      int int0 = 1664;
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      HeatMapDataset heatMapDataset0 = mock(HeatMapDataset.class, new ViolatedAssumptionAnswer());
      doReturn(164).when(heatMapDataset0).getXSampleCount();
      doReturn(164).when(heatMapDataset0).getYSampleCount();
      doReturn(0.0, 0.0, 0.0, 0.0, 0.0).when(heatMapDataset0).getZValue(anyInt() , anyInt());
      PaintScale paintScale0 = mock(PaintScale.class, new ViolatedAssumptionAnswer());
      doReturn((Paint) null, (Paint) null, (Paint) null, (Paint) null, (Paint) null).when(paintScale0).getPaint(anyDouble());
      HeatMapDataset heatMapDataset1 = mock(HeatMapDataset.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(heatMapDataset1).getXSampleCount();
      Comparable<Object> comparable0 = (Comparable<Object>) mock(Comparable.class, new ViolatedAssumptionAnswer());
      HeatMapUtils.extractRowFromHeatMapDataset(heatMapDataset1, 525, comparable0);
      // Undeclared exception!
      HeatMapUtils.createHeatMapImage(heatMapDataset0, paintScale0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      HeatMapDataset heatMapDataset0 = mock(HeatMapDataset.class, new ViolatedAssumptionAnswer());
      doReturn((-1)).when(heatMapDataset0).getXSampleCount();
      Comparable<Object> comparable0 = (Comparable<Object>) mock(Comparable.class, new ViolatedAssumptionAnswer());
      HeatMapUtils.extractRowFromHeatMapDataset(heatMapDataset0, 392, comparable0);
      int int0 = 1319;
      HeatMapDataset heatMapDataset1 = mock(HeatMapDataset.class, new ViolatedAssumptionAnswer());
      doReturn(1319).when(heatMapDataset1).getXSampleCount();
      doReturn(0.0, 0.0, 0.0, 0.0, 0.0).when(heatMapDataset1).getXValue(anyInt());
      doReturn(0.0, 0.0, 0.0, 0.0, 0.0).when(heatMapDataset1).getZValue(anyInt() , anyInt());
      // Undeclared exception!
      HeatMapUtils.extractRowFromHeatMapDataset(heatMapDataset1, 392, 392);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      HeatMapDataset heatMapDataset0 = mock(HeatMapDataset.class, new ViolatedAssumptionAnswer());
      doReturn((-1259)).when(heatMapDataset0).getXSampleCount();
      Comparable<Object> comparable0 = (Comparable<Object>) mock(Comparable.class, new ViolatedAssumptionAnswer());
      HeatMapUtils.extractRowFromHeatMapDataset(heatMapDataset0, 255, comparable0);
      HeatMapDataset heatMapDataset1 = mock(HeatMapDataset.class, new ViolatedAssumptionAnswer());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      HeatMapDataset heatMapDataset0 = mock(HeatMapDataset.class, new ViolatedAssumptionAnswer());
      doReturn((-1730)).when(heatMapDataset0).getYSampleCount();
      Comparable<Object> comparable0 = (Comparable<Object>) mock(Comparable.class, new ViolatedAssumptionAnswer());
      HeatMapUtils.extractColumnFromHeatMapDataset(heatMapDataset0, (-1730), comparable0);
      HeatMapDataset heatMapDataset1 = mock(HeatMapDataset.class, new ViolatedAssumptionAnswer());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      HeatMapDataset heatMapDataset0 = mock(HeatMapDataset.class, new ViolatedAssumptionAnswer());
      doReturn(2).when(heatMapDataset0).getYSampleCount();
      doReturn(0.0, 0.0).when(heatMapDataset0).getYValue(anyInt());
      doReturn(0.0, 0.0).when(heatMapDataset0).getZValue(anyInt() , anyInt());
      Comparable<Object> comparable0 = (Comparable<Object>) mock(Comparable.class, new ViolatedAssumptionAnswer());
      HeatMapUtils.extractColumnFromHeatMapDataset(heatMapDataset0, 27, comparable0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      HeatMapDataset heatMapDataset0 = mock(HeatMapDataset.class, new ViolatedAssumptionAnswer());
      Comparable<String> comparable0 = (Comparable<String>) mock(Comparable.class, new ViolatedAssumptionAnswer());
      HeatMapDataset heatMapDataset1 = mock(HeatMapDataset.class, new ViolatedAssumptionAnswer());
      doReturn(10).when(heatMapDataset1).getXSampleCount();
      doReturn(0.0, 0.0, 0.0, 0.0, 0.0).when(heatMapDataset1).getXValue(anyInt());
      doReturn(0.0, 0.0, 0.0, 0.0, 0.0).when(heatMapDataset1).getZValue(anyInt() , anyInt());
      Comparable<Object> comparable1 = (Comparable<Object>) mock(Comparable.class, new ViolatedAssumptionAnswer());
      HeatMapUtils.extractRowFromHeatMapDataset(heatMapDataset1, 0, comparable1);
      Comparable<Object> comparable2 = (Comparable<Object>) mock(Comparable.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        HeatMapUtils.extractColumnFromHeatMapDataset((HeatMapDataset) null, 0, comparable2);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.data.general.HeatMapUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      HeatMapDataset heatMapDataset0 = mock(HeatMapDataset.class, new ViolatedAssumptionAnswer());
      HeatMapDataset heatMapDataset1 = mock(HeatMapDataset.class, new ViolatedAssumptionAnswer());
      doReturn(1).when(heatMapDataset1).getXSampleCount();
      doReturn(20).when(heatMapDataset1).getYSampleCount();
      doReturn(0.0, 0.0, 0.0, 0.0, 0.0).when(heatMapDataset1).getZValue(anyInt() , anyInt());
      PaintScale paintScale0 = mock(PaintScale.class, new ViolatedAssumptionAnswer());
      doReturn((Paint) null, (Paint) null, (Paint) null, (Paint) null, (Paint) null).when(paintScale0).getPaint(anyDouble());
      HeatMapUtils.createHeatMapImage(heatMapDataset1, paintScale0);
      HeatMapDataset heatMapDataset2 = mock(HeatMapDataset.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(heatMapDataset2).getXSampleCount();
      doReturn(0).when(heatMapDataset2).getYSampleCount();
      PaintScale paintScale1 = mock(PaintScale.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        HeatMapUtils.createHeatMapImage(heatMapDataset2, paintScale1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Width (0) and height (0) cannot be <= 0
         //
         verifyException("java.awt.image.DirectColorModel", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      HeatMapDataset heatMapDataset0 = mock(HeatMapDataset.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(heatMapDataset0).getYSampleCount();
      Comparable<Object> comparable0 = (Comparable<Object>) mock(Comparable.class, new ViolatedAssumptionAnswer());
      HeatMapUtils.extractColumnFromHeatMapDataset(heatMapDataset0, 0, comparable0);
      HeatMapDataset heatMapDataset1 = mock(HeatMapDataset.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(heatMapDataset1).getXSampleCount();
      Comparable<Object> comparable1 = (Comparable<Object>) mock(Comparable.class, new ViolatedAssumptionAnswer());
      HeatMapUtils.extractRowFromHeatMapDataset(heatMapDataset1, 0, comparable1);
      HeatMapDataset heatMapDataset2 = mock(HeatMapDataset.class, new ViolatedAssumptionAnswer());
      Comparable<String> comparable2 = null;
      // Undeclared exception!
      try { 
        HeatMapUtils.extractRowFromHeatMapDataset(heatMapDataset2, 3251, (Comparable) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'key' argument.
         //
         verifyException("org.jfree.chart.util.Args", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      HeatMapDataset heatMapDataset0 = mock(HeatMapDataset.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(heatMapDataset0).getYSampleCount();
      int int0 = 1;
      Comparable<Object> comparable0 = (Comparable<Object>) mock(Comparable.class, new ViolatedAssumptionAnswer());
      HeatMapUtils.extractColumnFromHeatMapDataset(heatMapDataset0, 1, comparable0);
      HeatMapDataset heatMapDataset1 = mock(HeatMapDataset.class, new ViolatedAssumptionAnswer());
      int int1 = 0;
      Comparable<String> comparable1 = null;
      // Undeclared exception!
      try { 
        HeatMapUtils.extractColumnFromHeatMapDataset(heatMapDataset1, 0, (Comparable) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'key' argument.
         //
         verifyException("org.jfree.chart.util.Args", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      HeatMapDataset heatMapDataset0 = null;
      int int0 = 4417;
      // Undeclared exception!
      try { 
        HeatMapUtils.extractRowFromHeatMapDataset((HeatMapDataset) null, 4417, 4417);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.data.general.HeatMapUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      HeatMapDataset heatMapDataset0 = mock(HeatMapDataset.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(heatMapDataset0).getYSampleCount();
      Comparable<String> comparable0 = (Comparable<String>) mock(Comparable.class, new ViolatedAssumptionAnswer());
      HeatMapUtils.extractColumnFromHeatMapDataset(heatMapDataset0, 1, comparable0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      HeatMapDataset heatMapDataset0 = mock(HeatMapDataset.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(heatMapDataset0).getXSampleCount();
      doReturn(0).when(heatMapDataset0).getYSampleCount();
      PaintScale paintScale0 = mock(PaintScale.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        HeatMapUtils.createHeatMapImage(heatMapDataset0, paintScale0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Width (0) and height (0) cannot be <= 0
         //
         verifyException("java.awt.image.DirectColorModel", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      HeatMapDataset heatMapDataset0 = null;
      int int0 = (-582);
      Comparable<Object> comparable0 = (Comparable<Object>) mock(Comparable.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        HeatMapUtils.extractColumnFromHeatMapDataset((HeatMapDataset) null, (-582), comparable0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.data.general.HeatMapUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      HeatMapDataset heatMapDataset0 = null;
      PaintScale paintScale0 = mock(PaintScale.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        HeatMapUtils.createHeatMapImage((HeatMapDataset) null, paintScale0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'dataset' argument.
         //
         verifyException("org.jfree.chart.util.Args", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      HeatMapDataset heatMapDataset0 = mock(HeatMapDataset.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(heatMapDataset0).getXSampleCount();
      HeatMapUtils.extractRowFromHeatMapDataset(heatMapDataset0, (-1), (-1));
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      HeatMapDataset heatMapDataset0 = mock(HeatMapDataset.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(heatMapDataset0).getYSampleCount();
      HeatMapUtils.extractColumnFromHeatMapDataset(heatMapDataset0, 3163, 3163);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      HeatMapDataset heatMapDataset0 = null;
      int int0 = 1189;
      Comparable<Integer> comparable0 = null;
      // Undeclared exception!
      try { 
        HeatMapUtils.extractColumnFromHeatMapDataset((HeatMapDataset) null, 1189, (Comparable) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'key' argument.
         //
         verifyException("org.jfree.chart.util.Args", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      HeatMapDataset heatMapDataset0 = mock(HeatMapDataset.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        HeatMapUtils.createHeatMapImage(heatMapDataset0, (PaintScale) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'paintScale' argument.
         //
         verifyException("org.jfree.chart.util.Args", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      HeatMapDataset heatMapDataset0 = mock(HeatMapDataset.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(heatMapDataset0).getYSampleCount();
      Comparable<String> comparable0 = (Comparable<String>) mock(Comparable.class, new ViolatedAssumptionAnswer());
      HeatMapUtils.extractColumnFromHeatMapDataset(heatMapDataset0, (-4045), comparable0);
      HeatMapDataset heatMapDataset1 = null;
      Comparable<Object> comparable1 = (Comparable<Object>) mock(Comparable.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        HeatMapUtils.extractRowFromHeatMapDataset((HeatMapDataset) null, (-4045), comparable1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.data.general.HeatMapUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      HeatMapDataset heatMapDataset0 = null;
      int int0 = 0;
      Comparable<Object> comparable0 = (Comparable<Object>) mock(Comparable.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        HeatMapUtils.extractColumnFromHeatMapDataset((HeatMapDataset) null, 0, comparable0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.data.general.HeatMapUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      HeatMapDataset heatMapDataset0 = mock(HeatMapDataset.class, new ViolatedAssumptionAnswer());
      doReturn(2).when(heatMapDataset0).getXSampleCount();
      doReturn(0.0, 0.0).when(heatMapDataset0).getXValue(anyInt());
      doReturn(0.0, 0.0).when(heatMapDataset0).getZValue(anyInt() , anyInt());
      HeatMapUtils.extractRowFromHeatMapDataset(heatMapDataset0, 413, 413);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      int int0 = 150;
      HeatMapDataset heatMapDataset0 = mock(HeatMapDataset.class, new ViolatedAssumptionAnswer());
      Paint paint0 = mock(Paint.class, new ViolatedAssumptionAnswer());
      HeatMapDataset heatMapDataset1 = mock(HeatMapDataset.class, new ViolatedAssumptionAnswer());
      doReturn(58).when(heatMapDataset1).getYSampleCount();
      doReturn(0.0, 0.0, 0.0, 0.0, 0.0).when(heatMapDataset1).getYValue(anyInt());
      doReturn(0.0, 0.0, 0.0, 0.0, 0.0).when(heatMapDataset1).getZValue(anyInt() , anyInt());
      int int1 = (-1339);
      Comparable<String> comparable0 = (Comparable<String>) mock(Comparable.class, new ViolatedAssumptionAnswer());
      HeatMapUtils.extractColumnFromHeatMapDataset(heatMapDataset1, (-1339), comparable0);
      HeatMapDataset heatMapDataset2 = mock(HeatMapDataset.class, new ViolatedAssumptionAnswer());
      doReturn(58).when(heatMapDataset2).getXSampleCount();
      doReturn(150).when(heatMapDataset2).getYSampleCount();
      doReturn(0.0, 0.0, 0.0, 0.0, 0.0).when(heatMapDataset2).getZValue(anyInt() , anyInt());
      PaintScale paintScale0 = mock(PaintScale.class, new ViolatedAssumptionAnswer());
      doReturn((Paint) null, (Paint) null, (Paint) null, (Paint) null, (Paint) null).when(paintScale0).getPaint(anyDouble());
      HeatMapUtils.createHeatMapImage(heatMapDataset2, paintScale0);
      HeatMapDataset heatMapDataset3 = mock(HeatMapDataset.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(heatMapDataset3).getXSampleCount();
      doReturn(0).when(heatMapDataset3).getYSampleCount();
      PaintScale paintScale1 = mock(PaintScale.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        HeatMapUtils.createHeatMapImage(heatMapDataset3, paintScale1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Width (0) and height (0) cannot be <= 0
         //
         verifyException("java.awt.image.DirectColorModel", e);
      }
  }
}
