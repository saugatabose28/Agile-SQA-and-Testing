/*
 * This file was automatically generated by EvoSuite
 * Tue May 16 06:22:11 GMT 2023
 */

package org.jfree.chart.renderer.category;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.Graphics2D;
import java.awt.Paint;
import java.awt.Stroke;
import java.awt.geom.RectangularShape;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.jfree.chart.renderer.category.BarRenderer;
import org.jfree.chart.renderer.category.GradientBarPainter;
import org.jfree.chart.ui.RectangleEdge;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class GradientBarPainter_ESTest extends GradientBarPainter_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      GradientBarPainter gradientBarPainter0 = new GradientBarPainter();
      gradientBarPainter0.equals(gradientBarPainter0);
      GradientBarPainter gradientBarPainter1 = new GradientBarPainter();
      gradientBarPainter0.equals(gradientBarPainter1);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      GradientBarPainter gradientBarPainter0 = new GradientBarPainter(1.0, 1.0, 1.0);
      GradientBarPainter gradientBarPainter1 = new GradientBarPainter(1.0, (-1058.48), (-1058.48));
      gradientBarPainter0.equals(gradientBarPainter1);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      GradientBarPainter gradientBarPainter0 = new GradientBarPainter(0.1, 0.8, 0.1);
      Graphics2D graphics2D0 = mock(Graphics2D.class, new ViolatedAssumptionAnswer());
      BarRenderer barRenderer0 = mock(BarRenderer.class, new ViolatedAssumptionAnswer());
      RectangularShape rectangularShape0 = mock(RectangularShape.class, new ViolatedAssumptionAnswer());
      Graphics2D graphics2D1 = mock(Graphics2D.class, new ViolatedAssumptionAnswer());
      BarRenderer barRenderer1 = mock(BarRenderer.class, new ViolatedAssumptionAnswer());
      doReturn(barRenderer0.DEFAULT_OUTLINE_PAINT).when(barRenderer1).getItemPaint(anyInt() , anyInt());
      doReturn(barRenderer0.DEFAULT_VALUE_LABEL_PAINT).when(barRenderer1).getShadowPaint();
      doReturn(1868.532904).when(barRenderer1).getShadowXOffset();
      doReturn((-2982.886)).when(barRenderer1).getShadowYOffset();
      RectangularShape rectangularShape1 = mock(RectangularShape.class, new ViolatedAssumptionAnswer());
      doReturn(0.1).when(rectangularShape1).getMaxX();
      doReturn(0.1).when(rectangularShape1).getMaxY();
      doReturn(1.0).when(rectangularShape1).getMinX();
      doReturn((-2253.9164543689694)).when(rectangularShape1).getMinY();
      gradientBarPainter0.paintBarShadow(graphics2D1, barRenderer1, 0, 0, rectangularShape1, (RectangleEdge) null, false);
      RectangleEdge rectangleEdge0 = mock(RectangleEdge.class, new ViolatedAssumptionAnswer());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      GradientBarPainter gradientBarPainter0 = new GradientBarPainter(535.687, 535.687, (-3050.7));
      Graphics2D graphics2D0 = mock(Graphics2D.class, new ViolatedAssumptionAnswer());
      Paint paint0 = mock(Paint.class, new ViolatedAssumptionAnswer());
      BarRenderer barRenderer0 = mock(BarRenderer.class, new ViolatedAssumptionAnswer());
      doReturn(paint0).when(barRenderer0).getItemPaint(anyInt() , anyInt());
      doReturn(paint0).when(barRenderer0).getShadowPaint();
      doReturn(535.687).when(barRenderer0).getShadowXOffset();
      doReturn(535.687).when(barRenderer0).getShadowYOffset();
      RectangularShape rectangularShape0 = mock(RectangularShape.class, new ViolatedAssumptionAnswer());
      doReturn(535.687).when(rectangularShape0).getMaxX();
      doReturn(0.2).when(rectangularShape0).getMaxY();
      doReturn(0.0).when(rectangularShape0).getMinX();
      doReturn(0.0).when(rectangularShape0).getMinY();
      gradientBarPainter0.paintBarShadow(graphics2D0, barRenderer0, (-701), (-701), rectangularShape0, (RectangleEdge) null, true);
      gradientBarPainter0.hashCode();
      gradientBarPainter0.hashCode();
      gradientBarPainter0.hashCode();
      gradientBarPainter0.hashCode();
      Graphics2D graphics2D1 = mock(Graphics2D.class, new ViolatedAssumptionAnswer());
      BarRenderer barRenderer1 = mock(BarRenderer.class, new ViolatedAssumptionAnswer());
      doReturn((Paint) null).when(barRenderer1).getItemOutlinePaint(anyInt() , anyInt());
      doReturn((Stroke) null).when(barRenderer1).getItemOutlineStroke(anyInt() , anyInt());
      doReturn(barRenderer0.DEFAULT_PAINT).when(barRenderer1).getItemPaint(anyInt() , anyInt());
      doReturn(true).when(barRenderer1).isDrawBarOutline();
      gradientBarPainter0.paintBar(graphics2D1, barRenderer1, (-1453), (-1262), (RectangularShape) null, (RectangleEdge) null);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      GradientBarPainter gradientBarPainter0 = new GradientBarPainter(0.0, 0.0, 0.0);
      GradientBarPainter gradientBarPainter1 = new GradientBarPainter();
      gradientBarPainter1.hashCode();
      gradientBarPainter0.equals(gradientBarPainter1);
      gradientBarPainter1.hashCode();
      Graphics2D graphics2D0 = mock(Graphics2D.class, new ViolatedAssumptionAnswer());
      BarRenderer barRenderer0 = mock(BarRenderer.class, new ViolatedAssumptionAnswer());
      doReturn((Paint) null).when(barRenderer0).getItemPaint(anyInt() , anyInt());
      doReturn(false).when(barRenderer0).isDrawBarOutline();
      RectangularShape rectangularShape0 = mock(RectangularShape.class, new ViolatedAssumptionAnswer());
      RectangleEdge rectangleEdge0 = mock(RectangleEdge.class, new ViolatedAssumptionAnswer());
      gradientBarPainter1.paintBar(graphics2D0, barRenderer0, 4, (-5276), rectangularShape0, rectangleEdge0);
      Graphics2D graphics2D1 = mock(Graphics2D.class, new ViolatedAssumptionAnswer());
      BarRenderer barRenderer1 = mock(BarRenderer.class, new ViolatedAssumptionAnswer());
      doReturn((Paint) null).when(barRenderer1).getItemPaint(anyInt() , anyInt());
      doReturn(false).when(barRenderer1).isDrawBarOutline();
      gradientBarPainter1.hashCode();
      RectangularShape rectangularShape1 = mock(RectangularShape.class, new ViolatedAssumptionAnswer());
      RectangleEdge rectangleEdge1 = mock(RectangleEdge.class, new ViolatedAssumptionAnswer());
      gradientBarPainter1.paintBar(graphics2D1, barRenderer1, (-2312), 0, rectangularShape1, rectangleEdge1);
      GradientBarPainter gradientBarPainter2 = new GradientBarPainter();
      gradientBarPainter0.equals(gradientBarPainter2);
      gradientBarPainter1.hashCode();
      GradientBarPainter gradientBarPainter3 = new GradientBarPainter(0.0, 3.0, 3.0);
      gradientBarPainter3.hashCode();
      gradientBarPainter0.equals(gradientBarPainter3);
      gradientBarPainter2.hashCode();
      gradientBarPainter0.equals(gradientBarPainter2);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      GradientBarPainter gradientBarPainter0 = new GradientBarPainter(1.0, 0.0, 0.0);
      GradientBarPainter gradientBarPainter1 = new GradientBarPainter(0.0, (-1058.48), (-1058.48));
      gradientBarPainter0.equals(gradientBarPainter1);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      GradientBarPainter gradientBarPainter0 = new GradientBarPainter((-1131.03), (-1131.03), (-1004.0));
      gradientBarPainter0.hashCode();
      gradientBarPainter0.equals("Wif");
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      GradientBarPainter gradientBarPainter0 = new GradientBarPainter(0.0, 0.0, 925.58635251085);
      GradientBarPainter gradientBarPainter1 = new GradientBarPainter();
      gradientBarPainter0.equals(gradientBarPainter1);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      GradientBarPainter gradientBarPainter0 = new GradientBarPainter();
      Graphics2D graphics2D0 = mock(Graphics2D.class, new ViolatedAssumptionAnswer());
      BarRenderer barRenderer0 = mock(BarRenderer.class, new ViolatedAssumptionAnswer());
      doReturn((Paint) null).when(barRenderer0).getItemPaint(anyInt() , anyInt());
      doReturn(false).when(barRenderer0).isDrawBarOutline();
      RectangularShape rectangularShape0 = mock(RectangularShape.class, new ViolatedAssumptionAnswer());
      RectangleEdge rectangleEdge0 = mock(RectangleEdge.class, new ViolatedAssumptionAnswer());
      gradientBarPainter0.paintBar(graphics2D0, barRenderer0, (-1), 0, rectangularShape0, rectangleEdge0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      GradientBarPainter gradientBarPainter0 = new GradientBarPainter();
      Graphics2D graphics2D0 = mock(Graphics2D.class, new ViolatedAssumptionAnswer());
      BarRenderer barRenderer0 = null;
      int int0 = 193;
      gradientBarPainter0.hashCode();
      RectangularShape rectangularShape0 = mock(RectangularShape.class, new ViolatedAssumptionAnswer());
      RectangleEdge rectangleEdge0 = mock(RectangleEdge.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        gradientBarPainter0.paintBar(graphics2D0, (BarRenderer) null, 193, 193, rectangularShape0, rectangleEdge0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.renderer.category.GradientBarPainter", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      GradientBarPainter gradientBarPainter0 = new GradientBarPainter((-4.0), (-4.0), 1315.7);
      Graphics2D graphics2D0 = mock(Graphics2D.class, new ViolatedAssumptionAnswer());
      BarRenderer barRenderer0 = mock(BarRenderer.class, new ViolatedAssumptionAnswer());
      doReturn((Paint) null).when(barRenderer0).getItemPaint(anyInt() , anyInt());
      doReturn(false).when(barRenderer0).isDrawBarOutline();
      Graphics2D graphics2D1 = mock(Graphics2D.class, new ViolatedAssumptionAnswer());
      BarRenderer barRenderer1 = mock(BarRenderer.class, new ViolatedAssumptionAnswer());
      doReturn((Paint) null).when(barRenderer1).getItemPaint(anyInt() , anyInt());
      doReturn((Paint) null).when(barRenderer1).getShadowPaint();
      doReturn(0.0).when(barRenderer1).getShadowXOffset();
      doReturn(0.0).when(barRenderer1).getShadowYOffset();
      RectangularShape rectangularShape0 = mock(RectangularShape.class, new ViolatedAssumptionAnswer());
      doReturn(0.0).when(rectangularShape0).getMaxX();
      doReturn(0.0).when(rectangularShape0).getMaxY();
      doReturn(0.0).when(rectangularShape0).getMinX();
      doReturn(0.0).when(rectangularShape0).getMinY();
      RectangleEdge rectangleEdge0 = mock(RectangleEdge.class, new ViolatedAssumptionAnswer());
      gradientBarPainter0.paintBarShadow(graphics2D1, barRenderer1, (-4049), 0, rectangularShape0, rectangleEdge0, true);
      RectangularShape rectangularShape1 = mock(RectangularShape.class, new ViolatedAssumptionAnswer());
      RectangleEdge rectangleEdge1 = mock(RectangleEdge.class, new ViolatedAssumptionAnswer());
      gradientBarPainter0.paintBar(graphics2D0, barRenderer0, (-2020), (-2020), rectangularShape1, rectangleEdge1);
      Graphics2D graphics2D2 = mock(Graphics2D.class, new ViolatedAssumptionAnswer());
      BarRenderer barRenderer2 = null;
      RectangularShape rectangularShape2 = mock(RectangularShape.class, new ViolatedAssumptionAnswer());
      RectangleEdge rectangleEdge2 = mock(RectangleEdge.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        gradientBarPainter0.paintBarShadow(graphics2D2, (BarRenderer) null, 201, 201, rectangularShape2, rectangleEdge2, false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.renderer.category.GradientBarPainter", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      GradientBarPainter gradientBarPainter0 = new GradientBarPainter();
      Graphics2D graphics2D0 = mock(Graphics2D.class, new ViolatedAssumptionAnswer());
      BarRenderer barRenderer0 = mock(BarRenderer.class, new ViolatedAssumptionAnswer());
      doReturn((Paint) null).when(barRenderer0).getItemPaint(anyInt() , anyInt());
      doReturn(false).when(barRenderer0).isDrawBarOutline();
      RectangularShape rectangularShape0 = mock(RectangularShape.class, new ViolatedAssumptionAnswer());
      RectangleEdge rectangleEdge0 = mock(RectangleEdge.class, new ViolatedAssumptionAnswer());
      gradientBarPainter0.paintBar(graphics2D0, barRenderer0, (-104), (-104), rectangularShape0, rectangleEdge0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      GradientBarPainter gradientBarPainter0 = new GradientBarPainter();
      gradientBarPainter0.hashCode();
      Graphics2D graphics2D0 = mock(Graphics2D.class, new ViolatedAssumptionAnswer());
      BarRenderer barRenderer0 = null;
      int int0 = 10;
      int int1 = 736;
      RectangularShape rectangularShape0 = mock(RectangularShape.class, new ViolatedAssumptionAnswer());
      RectangleEdge rectangleEdge0 = mock(RectangleEdge.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        gradientBarPainter0.paintBar(graphics2D0, (BarRenderer) null, 10, 736, rectangularShape0, rectangleEdge0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.renderer.category.GradientBarPainter", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      GradientBarPainter gradientBarPainter0 = new GradientBarPainter();
      Graphics2D graphics2D0 = mock(Graphics2D.class, new ViolatedAssumptionAnswer());
      Paint paint0 = mock(Paint.class, new ViolatedAssumptionAnswer());
      BarRenderer barRenderer0 = mock(BarRenderer.class, new ViolatedAssumptionAnswer());
      doReturn(paint0).when(barRenderer0).getItemPaint(anyInt() , anyInt());
      doReturn(paint0).when(barRenderer0).getShadowPaint();
      doReturn((-1589.0)).when(barRenderer0).getShadowXOffset();
      doReturn(10.0).when(barRenderer0).getShadowYOffset();
      RectangularShape rectangularShape0 = mock(RectangularShape.class, new ViolatedAssumptionAnswer());
      doReturn(957.0).when(rectangularShape0).getMaxX();
      doReturn((double)10).when(rectangularShape0).getMaxY();
      doReturn((-3639.0)).when(rectangularShape0).getMinX();
      doReturn((double)10).when(rectangularShape0).getMinY();
      RectangleEdge rectangleEdge0 = mock(RectangleEdge.class, new ViolatedAssumptionAnswer());
      gradientBarPainter0.paintBarShadow(graphics2D0, barRenderer0, 10, 0, rectangularShape0, rectangleEdge0, true);
      gradientBarPainter0.hashCode();
      gradientBarPainter0.hashCode();
      gradientBarPainter0.equals("A");
      GradientBarPainter gradientBarPainter1 = new GradientBarPainter();
      gradientBarPainter0.equals(gradientBarPainter1);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      GradientBarPainter gradientBarPainter0 = new GradientBarPainter(1.0, (-2276.98707059035), 1.0);
      Graphics2D graphics2D0 = mock(Graphics2D.class, new ViolatedAssumptionAnswer());
      BarRenderer barRenderer0 = mock(BarRenderer.class, new ViolatedAssumptionAnswer());
      doReturn((Paint) null).when(barRenderer0).getItemPaint(anyInt() , anyInt());
      doReturn(false).when(barRenderer0).isDrawBarOutline();
      gradientBarPainter0.hashCode();
      RectangularShape rectangularShape0 = mock(RectangularShape.class, new ViolatedAssumptionAnswer());
      RectangleEdge rectangleEdge0 = mock(RectangleEdge.class, new ViolatedAssumptionAnswer());
      gradientBarPainter0.paintBar((Graphics2D) null, barRenderer0, 3, 2146260094, rectangularShape0, rectangleEdge0);
      Paint paint0 = mock(Paint.class, new ViolatedAssumptionAnswer());
      BarRenderer barRenderer1 = mock(BarRenderer.class, new ViolatedAssumptionAnswer());
      doReturn(paint0).when(barRenderer1).getItemPaint(anyInt() , anyInt());
      doReturn(false).when(barRenderer1).isDrawBarOutline();
      RectangularShape rectangularShape1 = mock(RectangularShape.class, new ViolatedAssumptionAnswer());
      RectangleEdge rectangleEdge1 = mock(RectangleEdge.class, new ViolatedAssumptionAnswer());
      gradientBarPainter0.paintBar(graphics2D0, barRenderer1, 0, 0, rectangularShape1, rectangleEdge1);
      gradientBarPainter0.hashCode();
      gradientBarPainter0.hashCode();
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      GradientBarPainter gradientBarPainter0 = new GradientBarPainter(0.0, 129.67, 129.67);
      gradientBarPainter0.hashCode();
      Graphics2D graphics2D0 = mock(Graphics2D.class, new ViolatedAssumptionAnswer());
      Paint paint0 = mock(Paint.class, new ViolatedAssumptionAnswer());
      BarRenderer barRenderer0 = mock(BarRenderer.class, new ViolatedAssumptionAnswer());
      doReturn(paint0).when(barRenderer0).getItemPaint(anyInt() , anyInt());
      doReturn(false).when(barRenderer0).isDrawBarOutline();
      Graphics2D graphics2D1 = mock(Graphics2D.class, new ViolatedAssumptionAnswer());
      BarRenderer barRenderer1 = mock(BarRenderer.class, new ViolatedAssumptionAnswer());
      doReturn(barRenderer0.DEFAULT_PAINT).when(barRenderer1).getItemPaint(anyInt() , anyInt());
      doReturn(false).when(barRenderer1).isDrawBarOutline();
      Graphics2D graphics2D2 = mock(Graphics2D.class, new ViolatedAssumptionAnswer());
      Paint paint1 = mock(Paint.class, new ViolatedAssumptionAnswer());
      BarRenderer barRenderer2 = mock(BarRenderer.class, new ViolatedAssumptionAnswer());
      doReturn(paint1).when(barRenderer2).getItemPaint(anyInt() , anyInt());
      doReturn(barRenderer1.DEFAULT_PAINT).when(barRenderer2).getShadowPaint();
      doReturn(0.2).when(barRenderer2).getShadowXOffset();
      doReturn(129.67).when(barRenderer2).getShadowYOffset();
      RectangularShape rectangularShape0 = mock(RectangularShape.class, new ViolatedAssumptionAnswer());
      doReturn(0.1).when(rectangularShape0).getMaxX();
      doReturn((-1657.99801229)).when(rectangularShape0).getMaxY();
      doReturn(179.7594438896).when(rectangularShape0).getMinX();
      doReturn(barRenderer0.ZERO).when(rectangularShape0).getMinY();
      RectangleEdge rectangleEdge0 = mock(RectangleEdge.class, new ViolatedAssumptionAnswer());
      gradientBarPainter0.hashCode();
      Graphics2D graphics2D3 = mock(Graphics2D.class, new ViolatedAssumptionAnswer());
      BarRenderer barRenderer3 = mock(BarRenderer.class, new ViolatedAssumptionAnswer());
      doReturn(barRenderer2.DEFAULT_PAINT).when(barRenderer3).getItemPaint(anyInt() , anyInt());
      doReturn(false).when(barRenderer3).isDrawBarOutline();
      RectangularShape rectangularShape1 = mock(RectangularShape.class, new ViolatedAssumptionAnswer());
      RectangleEdge rectangleEdge1 = mock(RectangleEdge.class, new ViolatedAssumptionAnswer());
      gradientBarPainter0.paintBar(graphics2D3, barRenderer3, 0, (-663), rectangularShape1, rectangleEdge1);
      gradientBarPainter0.paintBarShadow(graphics2D2, barRenderer2, (-943), (-2449), rectangularShape0, rectangleEdge0, false);
      RectangularShape rectangularShape2 = mock(RectangularShape.class, new ViolatedAssumptionAnswer());
      RectangleEdge rectangleEdge2 = mock(RectangleEdge.class, new ViolatedAssumptionAnswer());
      gradientBarPainter0.paintBar(graphics2D1, barRenderer1, 12, 1737, rectangularShape2, rectangleEdge2);
      RectangularShape rectangularShape3 = mock(RectangularShape.class, new ViolatedAssumptionAnswer());
      gradientBarPainter0.hashCode();
      gradientBarPainter0.paintBar(graphics2D0, barRenderer0, 2576, 347, rectangularShape3, (RectangleEdge) null);
      Graphics2D graphics2D4 = mock(Graphics2D.class, new ViolatedAssumptionAnswer());
      BarRenderer barRenderer4 = mock(BarRenderer.class, new ViolatedAssumptionAnswer());
      doReturn(barRenderer3.DEFAULT_PAINT).when(barRenderer4).getItemPaint(anyInt() , anyInt());
      doReturn(barRenderer3.DEFAULT_VALUE_LABEL_PAINT).when(barRenderer4).getShadowPaint();
      doReturn((-1.0)).when(barRenderer4).getShadowXOffset();
      doReturn((double)(-943)).when(barRenderer4).getShadowYOffset();
      RectangularShape rectangularShape4 = mock(RectangularShape.class, new ViolatedAssumptionAnswer());
      doReturn(362.683).when(rectangularShape4).getMaxX();
      doReturn((double)0).when(rectangularShape4).getMaxY();
      doReturn((double)2576).when(rectangularShape4).getMinX();
      doReturn((double)1737).when(rectangularShape4).getMinY();
      gradientBarPainter0.paintBarShadow(graphics2D4, barRenderer4, 2576, 2576, rectangularShape4, (RectangleEdge) null, false);
      gradientBarPainter0.equals((Object) null);
      gradientBarPainter0.equals((Object) null);
      GradientBarPainter gradientBarPainter1 = new GradientBarPainter(12, 0.2, 0.0);
      gradientBarPainter0.equals(gradientBarPainter1);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      GradientBarPainter gradientBarPainter0 = new GradientBarPainter();
      gradientBarPainter0.hashCode();
      gradientBarPainter0.hashCode();
      Graphics2D graphics2D0 = mock(Graphics2D.class, new ViolatedAssumptionAnswer());
      Stroke stroke0 = mock(Stroke.class, new ViolatedAssumptionAnswer());
      BarRenderer barRenderer0 = mock(BarRenderer.class, new ViolatedAssumptionAnswer());
      doReturn((Paint) null).when(barRenderer0).getItemOutlinePaint(anyInt() , anyInt());
      doReturn(stroke0).when(barRenderer0).getItemOutlineStroke(anyInt() , anyInt());
      doReturn((Paint) null).when(barRenderer0).getItemPaint(anyInt() , anyInt());
      doReturn(true).when(barRenderer0).isDrawBarOutline();
      RectangularShape rectangularShape0 = mock(RectangularShape.class, new ViolatedAssumptionAnswer());
      RectangleEdge rectangleEdge0 = mock(RectangleEdge.class, new ViolatedAssumptionAnswer());
      gradientBarPainter0.paintBar(graphics2D0, barRenderer0, 0, (-1672), rectangularShape0, rectangleEdge0);
      GradientBarPainter gradientBarPainter1 = new GradientBarPainter(1849.568628144, (-655.1), 0.0);
      gradientBarPainter0.equals(gradientBarPainter1);
      Graphics2D graphics2D1 = mock(Graphics2D.class, new ViolatedAssumptionAnswer());
      Graphics2D graphics2D2 = mock(Graphics2D.class, new ViolatedAssumptionAnswer());
      BarRenderer barRenderer1 = mock(BarRenderer.class, new ViolatedAssumptionAnswer());
      doReturn(barRenderer0.DEFAULT_VALUE_LABEL_PAINT).when(barRenderer1).getItemOutlinePaint(anyInt() , anyInt());
      doReturn(barRenderer0.DEFAULT_OUTLINE_STROKE).when(barRenderer1).getItemOutlineStroke(anyInt() , anyInt());
      doReturn(barRenderer0.DEFAULT_OUTLINE_PAINT).when(barRenderer1).getItemPaint(anyInt() , anyInt());
      doReturn(true).when(barRenderer1).isDrawBarOutline();
      RectangularShape rectangularShape1 = mock(RectangularShape.class, new ViolatedAssumptionAnswer());
      gradientBarPainter1.paintBar(graphics2D2, barRenderer1, 0, 1367, rectangularShape1, (RectangleEdge) null);
      BarRenderer barRenderer2 = mock(BarRenderer.class, new ViolatedAssumptionAnswer());
      doReturn((Paint) null).when(barRenderer2).getItemOutlinePaint(anyInt() , anyInt());
      doReturn(barRenderer1.DEFAULT_OUTLINE_STROKE).when(barRenderer2).getItemOutlineStroke(anyInt() , anyInt());
      doReturn(barRenderer1.DEFAULT_PAINT).when(barRenderer2).getItemPaint(anyInt() , anyInt());
      doReturn(true).when(barRenderer2).isDrawBarOutline();
      RectangularShape rectangularShape2 = mock(RectangularShape.class, new ViolatedAssumptionAnswer());
      RectangleEdge rectangleEdge1 = mock(RectangleEdge.class, new ViolatedAssumptionAnswer());
      gradientBarPainter1.paintBar(graphics2D1, barRenderer2, 2, 1317, rectangularShape2, rectangleEdge1);
      gradientBarPainter1.equals("O$wX");
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      GradientBarPainter gradientBarPainter0 = new GradientBarPainter((-380.09823941968), (-285.16468), (-285.16468));
      Graphics2D graphics2D0 = mock(Graphics2D.class, new ViolatedAssumptionAnswer());
      BarRenderer barRenderer0 = mock(BarRenderer.class, new ViolatedAssumptionAnswer());
      doReturn((Paint) null).when(barRenderer0).getItemPaint(anyInt() , anyInt());
      doReturn(0.0).when(barRenderer0).getShadowXOffset();
      doReturn(0.0).when(barRenderer0).getShadowYOffset();
      int int0 = (-2655);
      RectangularShape rectangularShape0 = null;
      RectangleEdge rectangleEdge0 = mock(RectangleEdge.class, new ViolatedAssumptionAnswer());
      boolean boolean0 = false;
      // Undeclared exception!
      try { 
        gradientBarPainter0.paintBarShadow(graphics2D0, barRenderer0, 0, (-2655), (RectangularShape) null, rectangleEdge0, false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.renderer.category.GradientBarPainter", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      GradientBarPainter gradientBarPainter0 = new GradientBarPainter();
      Graphics2D graphics2D0 = null;
      Paint paint0 = mock(Paint.class, new ViolatedAssumptionAnswer());
      BarRenderer barRenderer0 = mock(BarRenderer.class, new ViolatedAssumptionAnswer());
      doReturn((Paint) null).when(barRenderer0).getItemOutlinePaint(anyInt() , anyInt());
      doReturn((Stroke) null).when(barRenderer0).getItemOutlineStroke(anyInt() , anyInt());
      doReturn(paint0).when(barRenderer0).getItemPaint(anyInt() , anyInt());
      doReturn(true).when(barRenderer0).isDrawBarOutline();
      RectangularShape rectangularShape0 = mock(RectangularShape.class, new ViolatedAssumptionAnswer());
      RectangleEdge rectangleEdge0 = mock(RectangleEdge.class, new ViolatedAssumptionAnswer());
      gradientBarPainter0.paintBar((Graphics2D) null, barRenderer0, 193, 193, rectangularShape0, rectangleEdge0);
      BarRenderer barRenderer1 = null;
      int int0 = 2044;
      RectangularShape rectangularShape1 = mock(RectangularShape.class, new ViolatedAssumptionAnswer());
      RectangleEdge rectangleEdge1 = mock(RectangleEdge.class, new ViolatedAssumptionAnswer());
      boolean boolean0 = true;
      gradientBarPainter0.hashCode();
      RectangularShape rectangularShape2 = mock(RectangularShape.class, new ViolatedAssumptionAnswer());
      GradientBarPainter gradientBarPainter1 = new GradientBarPainter();
      gradientBarPainter0.equals(gradientBarPainter1);
      // Undeclared exception!
      try { 
        gradientBarPainter0.paintBarShadow((Graphics2D) null, (BarRenderer) null, 1897, 0, rectangularShape2, (RectangleEdge) null, true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.renderer.category.GradientBarPainter", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      GradientBarPainter gradientBarPainter0 = new GradientBarPainter();
      Graphics2D graphics2D0 = mock(Graphics2D.class, new ViolatedAssumptionAnswer());
      Paint paint0 = mock(Paint.class, new ViolatedAssumptionAnswer());
      BarRenderer barRenderer0 = mock(BarRenderer.class, new ViolatedAssumptionAnswer());
      doReturn(paint0).when(barRenderer0).getItemPaint(anyInt() , anyInt());
      doReturn(false).when(barRenderer0).isDrawBarOutline();
      RectangularShape rectangularShape0 = mock(RectangularShape.class, new ViolatedAssumptionAnswer());
      RectangleEdge rectangleEdge0 = mock(RectangleEdge.class, new ViolatedAssumptionAnswer());
      gradientBarPainter0.paintBar(graphics2D0, barRenderer0, 1935, 1935, rectangularShape0, rectangleEdge0);
      Graphics2D graphics2D1 = mock(Graphics2D.class, new ViolatedAssumptionAnswer());
      BarRenderer barRenderer1 = mock(BarRenderer.class, new ViolatedAssumptionAnswer());
      doReturn(barRenderer0.DEFAULT_OUTLINE_PAINT).when(barRenderer1).getItemPaint(anyInt() , anyInt());
      doReturn(barRenderer0.DEFAULT_OUTLINE_PAINT).when(barRenderer1).getShadowPaint();
      doReturn((-2443.5588550590564)).when(barRenderer1).getShadowXOffset();
      doReturn((-1058.48)).when(barRenderer1).getShadowYOffset();
      RectangularShape rectangularShape1 = mock(RectangularShape.class, new ViolatedAssumptionAnswer());
      doReturn(Double.POSITIVE_INFINITY).when(rectangularShape1).getMaxX();
      doReturn(Double.POSITIVE_INFINITY).when(rectangularShape1).getMaxY();
      doReturn((-1540.134)).when(rectangularShape1).getMinX();
      doReturn(1849.568628144).when(rectangularShape1).getMinY();
      gradientBarPainter0.hashCode();
      RectangleEdge rectangleEdge1 = mock(RectangleEdge.class, new ViolatedAssumptionAnswer());
      gradientBarPainter0.paintBarShadow(graphics2D1, barRenderer1, 2992, 2992, rectangularShape1, rectangleEdge1, false);
      gradientBarPainter0.hashCode();
      gradientBarPainter0.hashCode();
      Graphics2D graphics2D2 = mock(Graphics2D.class, new ViolatedAssumptionAnswer());
      BarRenderer barRenderer2 = mock(BarRenderer.class, new ViolatedAssumptionAnswer());
      doReturn(barRenderer1.DEFAULT_PAINT).when(barRenderer2).getItemPaint(anyInt() , anyInt());
      doReturn(false).when(barRenderer2).isDrawBarOutline();
      RectangularShape rectangularShape2 = mock(RectangularShape.class, new ViolatedAssumptionAnswer());
      RectangleEdge rectangleEdge2 = mock(RectangleEdge.class, new ViolatedAssumptionAnswer());
      gradientBarPainter0.paintBar(graphics2D2, barRenderer2, 2992, 2992, rectangularShape2, rectangleEdge2);
      gradientBarPainter0.equals((Object) null);
      gradientBarPainter0.hashCode();
      Graphics2D graphics2D3 = mock(Graphics2D.class, new ViolatedAssumptionAnswer());
      BarRenderer barRenderer3 = mock(BarRenderer.class, new ViolatedAssumptionAnswer());
      doReturn((Paint) null).when(barRenderer3).getItemOutlinePaint(anyInt() , anyInt());
      doReturn((Stroke) null).when(barRenderer3).getItemOutlineStroke(anyInt() , anyInt());
      doReturn(barRenderer0.DEFAULT_VALUE_LABEL_PAINT).when(barRenderer3).getItemPaint(anyInt() , anyInt());
      doReturn(true).when(barRenderer3).isDrawBarOutline();
      RectangleEdge rectangleEdge3 = mock(RectangleEdge.class, new ViolatedAssumptionAnswer());
      gradientBarPainter0.paintBar(graphics2D3, barRenderer3, 37, 0, (RectangularShape) null, rectangleEdge3);
  }
}
