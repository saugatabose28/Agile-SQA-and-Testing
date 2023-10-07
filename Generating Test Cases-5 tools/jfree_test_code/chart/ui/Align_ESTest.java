/*
 * This file was automatically generated by EvoSuite
 * Tue May 16 05:54:32 GMT 2023
 */

package org.jfree.chart.ui;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.geom.Rectangle2D;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.jfree.chart.ui.Align;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Align_ESTest extends Align_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Rectangle2D rectangle2D0 = mock(Rectangle2D.class, new ViolatedAssumptionAnswer());
      doReturn(0.0).when(rectangle2D0).getCenterX();
      doReturn((-2882.7912495463597)).when(rectangle2D0).getCenterY();
      doReturn((-397.5462403181113), (-11.197)).when(rectangle2D0).getHeight();
      doReturn((-397.5462403181113)).when(rectangle2D0).getMaxX();
      doReturn(0.0, (-11.197)).when(rectangle2D0).getWidth();
      Align.align(rectangle2D0, rectangle2D0, (-152));
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Rectangle2D rectangle2D0 = mock(Rectangle2D.class, new ViolatedAssumptionAnswer());
      doReturn(0.0).when(rectangle2D0).getCenterX();
      doReturn(0.0).when(rectangle2D0).getCenterY();
      doReturn(236.4372808600694, (-1477.1594087886)).when(rectangle2D0).getHeight();
      doReturn(0.0).when(rectangle2D0).getMaxY();
      doReturn((-1477.1594087886), (-1477.1594087886)).when(rectangle2D0).getWidth();
      Align.align(rectangle2D0, rectangle2D0, (-2094));
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Rectangle2D rectangle2D0 = mock(Rectangle2D.class, new ViolatedAssumptionAnswer());
      doReturn(2374.94964).when(rectangle2D0).getCenterX();
      doReturn((-2817.971)).when(rectangle2D0).getCenterY();
      doReturn((-2817.971), 1.0, 0.0).when(rectangle2D0).getHeight();
      doReturn((double)(-2940)).when(rectangle2D0).getMaxX();
      doReturn((-2817.971)).when(rectangle2D0).getMaxY();
      doReturn((-246.5)).when(rectangle2D0).getMinY();
      doReturn((-246.5), (-246.5), (-2679.44934)).when(rectangle2D0).getWidth();
      doReturn((-2679.44934)).when(rectangle2D0).getX();
      Align.align(rectangle2D0, rectangle2D0, (-1));
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Rectangle2D rectangle2D0 = mock(Rectangle2D.class, new ViolatedAssumptionAnswer());
      doReturn(0.0, 0.0).when(rectangle2D0).getHeight();
      doReturn(0.0, 0.0).when(rectangle2D0).getWidth();
      Rectangle2D rectangle2D1 = mock(Rectangle2D.class, new ViolatedAssumptionAnswer());
      doReturn(0.0).when(rectangle2D1).getCenterX();
      doReturn(0.0).when(rectangle2D1).getCenterY();
      doReturn(0.0).when(rectangle2D1).getHeight();
      doReturn(0.0).when(rectangle2D1).getMaxX();
      doReturn(0.0).when(rectangle2D1).getMaxY();
      doReturn(0.0).when(rectangle2D1).getMinY();
      doReturn(0.0).when(rectangle2D1).getWidth();
      doReturn(0.0).when(rectangle2D1).getX();
      Align.align(rectangle2D0, rectangle2D1, (-2545));
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      // Undeclared exception!
      try { 
        Align.align((Rectangle2D) null, (Rectangle2D) null, 659);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.ui.Align", e);
      }
  }
}
