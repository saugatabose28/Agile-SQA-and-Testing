/*
 * This file was automatically generated by EvoSuite
 * Tue May 16 06:55:12 GMT 2023
 */

package org.jfree.data.xy;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.jfree.data.ComparableObjectItem;
import org.jfree.data.xy.VectorDataItem;
import org.jfree.data.xy.VectorSeries;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class VectorSeries_ESTest extends VectorSeries_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      VectorDataItem vectorDataItem0 = mock(VectorDataItem.class, new ViolatedAssumptionAnswer());
      VectorSeries vectorSeries0 = new VectorSeries(vectorDataItem0, false, false);
      vectorSeries0.add((double) 0, (-4709.35461151865), (-4709.35461151865), 1.0E-10);
      ComparableObjectItem comparableObjectItem0 = vectorSeries0.remove(0);
      assertFalse(comparableObjectItem0.equals((Object)vectorDataItem0));
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      VectorDataItem vectorDataItem0 = mock(VectorDataItem.class, new ViolatedAssumptionAnswer());
      VectorSeries vectorSeries0 = new VectorSeries(vectorDataItem0, false, false);
      vectorSeries0.add((double) 0, (double) 0, (double) 0, 12.085311394983648);
      double double0 = vectorSeries0.getYValue(0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      VectorDataItem vectorDataItem0 = mock(VectorDataItem.class, new ViolatedAssumptionAnswer());
      VectorSeries vectorSeries0 = new VectorSeries(vectorDataItem0, false, false);
      vectorSeries0.add((double) 0, 2173.288194094631, (double) 0, 0.0);
      double double0 = vectorSeries0.getYValue(0);
      assertEquals(2173.288194094631, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      VectorDataItem vectorDataItem0 = mock(VectorDataItem.class, new ViolatedAssumptionAnswer());
      VectorSeries vectorSeries0 = new VectorSeries(vectorDataItem0, false, false);
      vectorSeries0.add((double) 0, (-211.832434151), (double) 0, (-0.24680279833706872));
      double double0 = vectorSeries0.getYValue(0);
      assertEquals((-211.832434151), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      VectorDataItem vectorDataItem0 = mock(VectorDataItem.class, new ViolatedAssumptionAnswer());
      VectorSeries vectorSeries0 = new VectorSeries(vectorDataItem0, true, true);
      vectorSeries0.add((double) 0, (-211.832434151), (double) 0, (-211.832434151));
      double double0 = vectorSeries0.getXValue(0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      VectorDataItem vectorDataItem0 = mock(VectorDataItem.class, new ViolatedAssumptionAnswer());
      VectorSeries vectorSeries0 = new VectorSeries(vectorDataItem0, false, false);
      vectorSeries0.add((double) 5, 2173.288194094631, (double) 5, 0.0);
      double double0 = vectorSeries0.getXValue(0);
      assertEquals(5.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      VectorDataItem vectorDataItem0 = mock(VectorDataItem.class, new ViolatedAssumptionAnswer());
      VectorSeries vectorSeries0 = new VectorSeries(vectorDataItem0, false, false);
      vectorSeries0.add((double) 0, (-211.832434151), (double) 0, 0.0);
      double double0 = vectorSeries0.getVectorYValue(0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      VectorDataItem vectorDataItem0 = mock(VectorDataItem.class, new ViolatedAssumptionAnswer());
      VectorSeries vectorSeries0 = new VectorSeries(vectorDataItem0, false, false);
      vectorSeries0.add((double) 0, (double) 0, (double) 0, 12.085311394983648);
      double double0 = vectorSeries0.getVectorYValue(0);
      assertEquals(12.085311394983648, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      VectorDataItem vectorDataItem0 = mock(VectorDataItem.class, new ViolatedAssumptionAnswer());
      VectorSeries vectorSeries0 = new VectorSeries(vectorDataItem0, true, true);
      VectorDataItem vectorDataItem1 = mock(VectorDataItem.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(vectorDataItem1).toString();
      doReturn(0.0).when(vectorDataItem1).getVectorX();
      vectorSeries0.add(vectorDataItem1, true);
      double double0 = vectorSeries0.getVectorXValue(0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      VectorDataItem vectorDataItem0 = mock(VectorDataItem.class, new ViolatedAssumptionAnswer());
      VectorSeries vectorSeries0 = new VectorSeries(vectorDataItem0, true, true);
      vectorSeries0.add((double) 5, (-194.18769514790134), (double) 5, 0.0);
      double double0 = vectorSeries0.getVectorXValue(0);
      assertEquals(5.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      VectorDataItem vectorDataItem0 = mock(VectorDataItem.class, new ViolatedAssumptionAnswer());
      VectorSeries vectorSeries0 = new VectorSeries(vectorDataItem0, false, false);
      vectorSeries0.add((double) 0, 2173.288194094631, (double) 0, 0.0);
      ComparableObjectItem comparableObjectItem0 = vectorSeries0.getDataItem(0);
      assertFalse(comparableObjectItem0.equals((Object)vectorDataItem0));
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      VectorDataItem vectorDataItem0 = mock(VectorDataItem.class, new ViolatedAssumptionAnswer());
      VectorSeries vectorSeries0 = new VectorSeries(vectorDataItem0, true, true);
      // Undeclared exception!
      try { 
        vectorSeries0.remove((-1682));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      VectorDataItem vectorDataItem0 = mock(VectorDataItem.class, new ViolatedAssumptionAnswer());
      VectorSeries vectorSeries0 = new VectorSeries(vectorDataItem0, true, true);
      // Undeclared exception!
      try { 
        vectorSeries0.getYValue((-1));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      VectorDataItem vectorDataItem0 = mock(VectorDataItem.class, new ViolatedAssumptionAnswer());
      VectorSeries vectorSeries0 = new VectorSeries(vectorDataItem0, true, true);
      // Undeclared exception!
      try { 
        vectorSeries0.getXValue((-2));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      VectorDataItem vectorDataItem0 = mock(VectorDataItem.class, new ViolatedAssumptionAnswer());
      VectorSeries vectorSeries0 = new VectorSeries(vectorDataItem0, true, true);
      // Undeclared exception!
      try { 
        vectorSeries0.getVectorYValue((-1));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      VectorDataItem vectorDataItem0 = mock(VectorDataItem.class, new ViolatedAssumptionAnswer());
      VectorSeries vectorSeries0 = new VectorSeries(vectorDataItem0, false, false);
      // Undeclared exception!
      try { 
        vectorSeries0.getVectorXValue((-4418));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      VectorDataItem vectorDataItem0 = mock(VectorDataItem.class, new ViolatedAssumptionAnswer());
      VectorSeries vectorSeries0 = new VectorSeries(vectorDataItem0);
      // Undeclared exception!
      try { 
        vectorSeries0.getDataItem((-206));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      VectorDataItem vectorDataItem0 = mock(VectorDataItem.class, new ViolatedAssumptionAnswer());
      VectorSeries vectorSeries0 = new VectorSeries(vectorDataItem0, true, true);
      VectorDataItem vectorDataItem1 = mock(VectorDataItem.class, new ViolatedAssumptionAnswer());
      vectorSeries0.add((double) 5, 2173.288194094631, (double) 5, 0.0);
      // Undeclared exception!
      try { 
        vectorSeries0.add(vectorDataItem1, false);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Incomparable object.
         //
         verifyException("org.jfree.data.xy.XYCoordinate", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      VectorDataItem vectorDataItem0 = mock(VectorDataItem.class, new ViolatedAssumptionAnswer());
      VectorSeries vectorSeries0 = new VectorSeries(vectorDataItem0, false, false);
      VectorDataItem vectorDataItem1 = mock(VectorDataItem.class, new ViolatedAssumptionAnswer());
      vectorSeries0.add(vectorDataItem1, true);
      // Undeclared exception!
      try { 
        vectorSeries0.add((double) 5, 2173.288194094631, (double) 5, 0.0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.data.ComparableObjectSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      VectorSeries vectorSeries0 = null;
      try {
        vectorSeries0 = new VectorSeries((Comparable) null, false, false);
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
      VectorSeries vectorSeries0 = null;
      try {
        vectorSeries0 = new VectorSeries((Comparable) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'key' argument.
         //
         verifyException("org.jfree.chart.util.Args", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      VectorDataItem vectorDataItem0 = mock(VectorDataItem.class, new ViolatedAssumptionAnswer());
      VectorSeries vectorSeries0 = new VectorSeries(vectorDataItem0, false, false);
      // Undeclared exception!
      try { 
        vectorSeries0.getDataItem(0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 0, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      VectorDataItem vectorDataItem0 = mock(VectorDataItem.class, new ViolatedAssumptionAnswer());
      VectorSeries vectorSeries0 = new VectorSeries(vectorDataItem0, false, false);
      // Undeclared exception!
      try { 
        vectorSeries0.remove(841);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 841, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      VectorDataItem vectorDataItem0 = mock(VectorDataItem.class, new ViolatedAssumptionAnswer());
      VectorSeries vectorSeries0 = new VectorSeries(vectorDataItem0, false, false);
      // Undeclared exception!
      try { 
        vectorSeries0.getYValue(0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 0, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      VectorDataItem vectorDataItem0 = mock(VectorDataItem.class, new ViolatedAssumptionAnswer());
      VectorSeries vectorSeries0 = new VectorSeries(vectorDataItem0, true, true);
      // Undeclared exception!
      try { 
        vectorSeries0.getXValue(0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 0, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      VectorDataItem vectorDataItem0 = mock(VectorDataItem.class, new ViolatedAssumptionAnswer());
      VectorSeries vectorSeries0 = new VectorSeries(vectorDataItem0, false, false);
      // Undeclared exception!
      try { 
        vectorSeries0.getVectorYValue(0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 0, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      VectorDataItem vectorDataItem0 = mock(VectorDataItem.class, new ViolatedAssumptionAnswer());
      VectorSeries vectorSeries0 = new VectorSeries(vectorDataItem0, false, false);
      vectorSeries0.add((double) 0, (-211.832434151), (double) 0, (-0.24680279833706872));
      double double0 = vectorSeries0.getVectorYValue(0);
      assertEquals((-0.24680279833706872), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      VectorDataItem vectorDataItem0 = mock(VectorDataItem.class, new ViolatedAssumptionAnswer());
      VectorSeries vectorSeries0 = new VectorSeries(vectorDataItem0);
      // Undeclared exception!
      try { 
        vectorSeries0.getVectorXValue(0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 0, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }
}
