/*
 * This file was automatically generated by EvoSuite
 * Tue May 16 05:14:00 GMT 2023
 */

package org.jfree.chart.util;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GradientPaint;
import java.awt.Point;
import java.awt.Polygon;
import java.awt.Rectangle;
import java.awt.geom.Rectangle2D;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.jfree.chart.util.DirectionalGradientPaintTransformer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class DirectionalGradientPaintTransformer_ESTest extends DirectionalGradientPaintTransformer_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      DirectionalGradientPaintTransformer directionalGradientPaintTransformer0 = new DirectionalGradientPaintTransformer();
      Color color0 = Color.DARK_GRAY;
      GradientPaint gradientPaint0 = new GradientPaint((-2136.307F), 0.0F, color0, (-486.046F), 1184.2847F, color0);
      Point point0 = mock(Point.class, new ViolatedAssumptionAnswer());
      Dimension dimension0 = mock(Dimension.class, new ViolatedAssumptionAnswer());
      Rectangle rectangle0 = new Rectangle(point0, dimension0);
      rectangle0.setFrameFromDiagonal(0.0, (double) 0, 0.0, (-1.0));
      GradientPaint gradientPaint1 = directionalGradientPaintTransformer0.transform(gradientPaint0, rectangle0);
      int[] intArray0 = new int[5];
      intArray0[0] = (-1);
      Polygon polygon0 = new Polygon(intArray0, intArray0, 1);
      Rectangle2D rectangle2D0 = polygon0.getBounds2D();
      GradientPaint gradientPaint2 = directionalGradientPaintTransformer0.transform(gradientPaint1, rectangle2D0);
      assertNotSame(gradientPaint1, gradientPaint2);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      DirectionalGradientPaintTransformer directionalGradientPaintTransformer0 = new DirectionalGradientPaintTransformer();
      Color color0 = Color.BLACK;
      GradientPaint gradientPaint0 = new GradientPaint(1.0F, (-3857.06F), color0, (-1474.63F), 0.0F, color0, true);
      Rectangle rectangle0 = new Rectangle((-1152), 0);
      GradientPaint gradientPaint1 = directionalGradientPaintTransformer0.transform(gradientPaint0, rectangle0);
      Rectangle rectangle1 = new Rectangle(0, 1, 1, 0);
      GradientPaint gradientPaint2 = directionalGradientPaintTransformer0.transform(gradientPaint1, rectangle1);
      assertEquals(1, gradientPaint2.getTransparency());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      DirectionalGradientPaintTransformer directionalGradientPaintTransformer0 = new DirectionalGradientPaintTransformer();
      Color color0 = Color.DARK_GRAY;
      GradientPaint gradientPaint0 = new GradientPaint((-2136.307F), 0.0F, color0, (-486.046F), 1184.2847F, color0);
      Point point0 = mock(Point.class, new ViolatedAssumptionAnswer());
      Dimension dimension0 = mock(Dimension.class, new ViolatedAssumptionAnswer());
      Rectangle rectangle0 = new Rectangle(point0, dimension0);
      rectangle0.setFrameFromDiagonal(0.0, (double) 0, 0.0, (-1.0));
      GradientPaint gradientPaint1 = directionalGradientPaintTransformer0.transform(gradientPaint0, rectangle0);
      GradientPaint gradientPaint2 = directionalGradientPaintTransformer0.transform(gradientPaint1, rectangle0);
      GradientPaint gradientPaint3 = directionalGradientPaintTransformer0.transform(gradientPaint2, rectangle0);
      assertFalse(gradientPaint3.isCyclic());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      DirectionalGradientPaintTransformer directionalGradientPaintTransformer0 = new DirectionalGradientPaintTransformer();
      Polygon polygon0 = new Polygon();
      Rectangle rectangle0 = polygon0.getBounds();
      // Undeclared exception!
      try { 
        directionalGradientPaintTransformer0.transform((GradientPaint) null, rectangle0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.util.DirectionalGradientPaintTransformer", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      DirectionalGradientPaintTransformer directionalGradientPaintTransformer0 = new DirectionalGradientPaintTransformer();
      Color color0 = Color.orange;
      GradientPaint gradientPaint0 = new GradientPaint(0.0F, 0.0F, color0, 0.0F, 2.0F, color0);
      Dimension dimension0 = mock(Dimension.class, new ViolatedAssumptionAnswer());
      Rectangle rectangle0 = new Rectangle(dimension0);
      GradientPaint gradientPaint1 = directionalGradientPaintTransformer0.transform(gradientPaint0, rectangle0);
      assertFalse(gradientPaint1.equals((Object)gradientPaint0));
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      DirectionalGradientPaintTransformer directionalGradientPaintTransformer0 = new DirectionalGradientPaintTransformer();
      Color color0 = Color.BLACK;
      Rectangle rectangle0 = new Rectangle((-1152), 0);
      GradientPaint gradientPaint0 = new GradientPaint(0, 0.0F, color0, 0.0F, (-1152), color0, true);
      GradientPaint gradientPaint1 = directionalGradientPaintTransformer0.transform(gradientPaint0, rectangle0);
      assertFalse(gradientPaint1.equals((Object)gradientPaint0));
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      DirectionalGradientPaintTransformer directionalGradientPaintTransformer0 = new DirectionalGradientPaintTransformer();
      Color color0 = Color.BLUE;
      GradientPaint gradientPaint0 = new GradientPaint(0.0F, 0.0F, color0, 4.0F, 0.0F, color0, true);
      Polygon polygon0 = new Polygon();
      Rectangle2D rectangle2D0 = polygon0.getBounds2D();
      GradientPaint gradientPaint1 = directionalGradientPaintTransformer0.transform(gradientPaint0, rectangle2D0);
      assertTrue(gradientPaint1.isCyclic());
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      DirectionalGradientPaintTransformer directionalGradientPaintTransformer0 = new DirectionalGradientPaintTransformer();
      Color color0 = Color.blue;
      Rectangle rectangle0 = new Rectangle();
      GradientPaint gradientPaint0 = new GradientPaint(0, 0, color0, 1.0F, 0, color0, false);
      GradientPaint gradientPaint1 = directionalGradientPaintTransformer0.transform(gradientPaint0, rectangle0);
      assertNotSame(gradientPaint0, gradientPaint1);
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      DirectionalGradientPaintTransformer directionalGradientPaintTransformer0 = new DirectionalGradientPaintTransformer();
      Color color0 = Color.blue;
      Rectangle rectangle0 = new Rectangle();
      GradientPaint gradientPaint0 = new GradientPaint(0.0F, 1.0F, color0, 0.0F, (-1293.9F), color0);
      GradientPaint gradientPaint1 = directionalGradientPaintTransformer0.transform(gradientPaint0, rectangle0);
      assertEquals(1, gradientPaint1.getTransparency());
  }

  @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      DirectionalGradientPaintTransformer directionalGradientPaintTransformer0 = new DirectionalGradientPaintTransformer();
      Color color0 = Color.BLACK;
      GradientPaint gradientPaint0 = new GradientPaint(1.0F, (-3857.06F), color0, (-1474.63F), 0.0F, color0, true);
      Rectangle rectangle0 = new Rectangle((-1152), 0);
      GradientPaint gradientPaint1 = directionalGradientPaintTransformer0.transform(gradientPaint0, rectangle0);
      GradientPaint gradientPaint2 = directionalGradientPaintTransformer0.transform(gradientPaint1, rectangle0);
      assertFalse(gradientPaint2.equals((Object)gradientPaint0));
  }
}
