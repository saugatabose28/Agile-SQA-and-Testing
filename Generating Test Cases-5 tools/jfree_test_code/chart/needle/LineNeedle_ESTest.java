/*
 * This file was automatically generated by EvoSuite
 * Tue May 16 05:45:31 GMT 2023
 */

package org.jfree.chart.needle;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import java.awt.Graphics2D;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.jfree.chart.needle.LineNeedle;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class LineNeedle_ESTest extends LineNeedle_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      LineNeedle lineNeedle0 = new LineNeedle();
      Graphics2D graphics2D0 = mock(Graphics2D.class, new ViolatedAssumptionAnswer());
      Rectangle2D rectangle2D0 = mock(Rectangle2D.class, new ViolatedAssumptionAnswer());
      doReturn(0.0).when(rectangle2D0).getMaxY();
      doReturn(0.0).when(rectangle2D0).getMinX();
      doReturn(0.0).when(rectangle2D0).getMinY();
      doReturn(0.0).when(rectangle2D0).getWidth();
      Point2D point2D0 = mock(Point2D.class, new ViolatedAssumptionAnswer());
      doReturn(0.0).when(point2D0).getX();
      doReturn(0.0).when(point2D0).getY();
      lineNeedle0.drawNeedle(graphics2D0, rectangle2D0, point2D0, 2418.74781300066);
      assertEquals(0.5, lineNeedle0.getRotateY(), 0.01);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      LineNeedle lineNeedle0 = new LineNeedle();
      boolean boolean0 = lineNeedle0.equals(lineNeedle0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      LineNeedle lineNeedle0 = new LineNeedle();
      boolean boolean0 = lineNeedle0.equals("m[9,/3/CaLfNu<");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      LineNeedle lineNeedle0 = new LineNeedle();
      Graphics2D graphics2D0 = mock(Graphics2D.class, new ViolatedAssumptionAnswer());
      Rectangle2D rectangle2D0 = mock(Rectangle2D.class, new ViolatedAssumptionAnswer());
      doReturn(427.7863617447913).when(rectangle2D0).getMaxY();
      doReturn(427.7863617447913).when(rectangle2D0).getMinX();
      doReturn(427.7863617447913).when(rectangle2D0).getMinY();
      doReturn((-0.017453292519943295)).when(rectangle2D0).getWidth();
      Point2D point2D0 = mock(Point2D.class, new ViolatedAssumptionAnswer());
      lineNeedle0.drawNeedle(graphics2D0, rectangle2D0, point2D0, 0.0);
      assertEquals(0.5, lineNeedle0.getRotateY(), 0.01);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      LineNeedle lineNeedle0 = new LineNeedle();
      Rectangle2D rectangle2D0 = mock(Rectangle2D.class, new ViolatedAssumptionAnswer());
      doReturn(0.0).when(rectangle2D0).getMaxY();
      doReturn(0.0).when(rectangle2D0).getMinX();
      doReturn(0.0).when(rectangle2D0).getMinY();
      doReturn(0.0).when(rectangle2D0).getWidth();
      Point2D point2D0 = mock(Point2D.class, new ViolatedAssumptionAnswer());
      doReturn(0.0).when(point2D0).getX();
      doReturn(0.0).when(point2D0).getY();
      lineNeedle0.drawNeedle((Graphics2D) null, rectangle2D0, point2D0, (-1209.0413999143734));
      assertEquals(0.5, lineNeedle0.getRotateY(), 0.01);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      LineNeedle lineNeedle0 = new LineNeedle();
      Object object0 = lineNeedle0.clone();
      boolean boolean0 = lineNeedle0.equals(object0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      LineNeedle lineNeedle0 = new LineNeedle();
      lineNeedle0.hashCode();
  }
}
