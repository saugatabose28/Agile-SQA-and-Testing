/*
 * This file was automatically generated by EvoSuite
 * Tue May 16 06:59:30 GMT 2023
 */

package org.jfree.chart.entity;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.Shape;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.jfree.chart.entity.LegendItemEntity;
import org.jfree.data.general.Dataset;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class LegendItemEntity_ESTest extends LegendItemEntity_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      LegendItemEntity legendItemEntity0 = null;
      try {
        legendItemEntity0 = new LegendItemEntity((Shape) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'area' argument.
         //
         verifyException("org.jfree.chart.util.Args", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Shape shape0 = mock(Shape.class, new ViolatedAssumptionAnswer());
      LegendItemEntity legendItemEntity0 = new LegendItemEntity(shape0);
      Object object0 = legendItemEntity0.clone();
      Comparable<Object> comparable0 = (Comparable<Object>) mock(Comparable.class, new ViolatedAssumptionAnswer());
      legendItemEntity0.setSeriesKey(comparable0);
      boolean boolean0 = legendItemEntity0.equals(object0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Shape shape0 = mock(Shape.class, new ViolatedAssumptionAnswer());
      LegendItemEntity legendItemEntity0 = new LegendItemEntity(shape0);
      boolean boolean0 = legendItemEntity0.equals(legendItemEntity0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Shape shape0 = mock(Shape.class, new ViolatedAssumptionAnswer());
      LegendItemEntity legendItemEntity0 = new LegendItemEntity(shape0);
      boolean boolean0 = legendItemEntity0.equals((Object) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Shape shape0 = mock(Shape.class, new ViolatedAssumptionAnswer());
      LegendItemEntity legendItemEntity0 = new LegendItemEntity(shape0);
      String string0 = legendItemEntity0.toString();
      assertEquals("LegendItemEntity: seriesKey=null, dataset=null", string0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Shape shape0 = mock(Shape.class, new ViolatedAssumptionAnswer());
      LegendItemEntity legendItemEntity0 = new LegendItemEntity(shape0);
      Comparable comparable0 = legendItemEntity0.getSeriesKey();
      assertNull(comparable0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      Shape shape0 = mock(Shape.class, new ViolatedAssumptionAnswer());
      LegendItemEntity legendItemEntity0 = new LegendItemEntity(shape0);
      legendItemEntity0.setSeriesKey("LegendItemEntity: seriesKey=null, dataset=null");
      Comparable comparable0 = legendItemEntity0.getSeriesKey();
      assertEquals("LegendItemEntity: seriesKey=null, dataset=null", comparable0);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      Shape shape0 = mock(Shape.class, new ViolatedAssumptionAnswer());
      LegendItemEntity legendItemEntity0 = new LegendItemEntity(shape0);
      Object object0 = legendItemEntity0.clone();
      boolean boolean0 = legendItemEntity0.equals(object0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      Shape shape0 = mock(Shape.class, new ViolatedAssumptionAnswer());
      LegendItemEntity legendItemEntity0 = new LegendItemEntity(shape0);
      Dataset dataset0 = legendItemEntity0.getDataset();
      assertNull(dataset0);
  }

  @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      Shape shape0 = mock(Shape.class, new ViolatedAssumptionAnswer());
      LegendItemEntity legendItemEntity0 = new LegendItemEntity(shape0);
      legendItemEntity0.setDataset((Dataset) null);
      assertEquals("poly", legendItemEntity0.getShapeType());
  }
}
