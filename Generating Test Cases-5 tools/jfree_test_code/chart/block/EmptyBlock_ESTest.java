/*
 * This file was automatically generated by EvoSuite
 * Tue May 16 05:20:47 GMT 2023
 */

package org.jfree.chart.block;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.jfree.chart.block.EmptyBlock;
import org.jfree.chart.block.RectangleConstraint;
import org.jfree.chart.ui.Size2D;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class EmptyBlock_ESTest extends EmptyBlock_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      EmptyBlock emptyBlock0 = new EmptyBlock(0.0, 0.0);
      BufferedImage bufferedImage0 = new BufferedImage(1, 1, 1);
      Graphics2D graphics2D0 = bufferedImage0.createGraphics();
      RectangleConstraint rectangleConstraint0 = RectangleConstraint.NONE;
      emptyBlock0.arrange(graphics2D0, rectangleConstraint0);
      assertEquals(0.0, emptyBlock0.getWidth(), 0.01);
      assertEquals(0.0, emptyBlock0.getHeight(), 0.01);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      EmptyBlock emptyBlock0 = new EmptyBlock(Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY);
      RectangleConstraint rectangleConstraint0 = new RectangleConstraint(2.0, 4326.906687896158);
      emptyBlock0.arrange((Graphics2D) null, rectangleConstraint0);
      assertEquals(Double.POSITIVE_INFINITY, emptyBlock0.getWidth(), 0.01);
      assertEquals(Double.POSITIVE_INFINITY, emptyBlock0.getHeight(), 0.01);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      EmptyBlock emptyBlock0 = new EmptyBlock((-691.1844669658468), (-691.1844669658468));
      RectangleConstraint rectangleConstraint0 = RectangleConstraint.NONE;
      Size2D size2D0 = emptyBlock0.arrange((Graphics2D) null, rectangleConstraint0);
      assertEquals((-691.1844669658468), size2D0.height, 0.01);
      assertEquals((-691.1844669658468), size2D0.width, 0.01);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      EmptyBlock emptyBlock0 = new EmptyBlock((-1619.86271046415), 0.0);
      Rectangle2D.Double rectangle2D_Double0 = new Rectangle2D.Double((-1619.86271046415), (-4516.9174363), 0.0, 328.275855823916);
      // Undeclared exception!
      try { 
        emptyBlock0.draw((Graphics2D) null, (Rectangle2D) rectangle2D_Double0, (Object) emptyBlock0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.block.BlockBorder", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      EmptyBlock emptyBlock0 = new EmptyBlock(Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY);
      Point point0 = mock(Point.class, new ViolatedAssumptionAnswer());
      Rectangle rectangle0 = new Rectangle(point0);
      // Undeclared exception!
      try { 
        emptyBlock0.draw((Graphics2D) null, (Rectangle2D) rectangle0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.block.BlockBorder", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      EmptyBlock emptyBlock0 = new EmptyBlock(0.0, 0.0);
      BufferedImage bufferedImage0 = new BufferedImage(1, 1, 2);
      Graphics2D graphics2D0 = bufferedImage0.createGraphics();
      Rectangle2D rectangle2D0 = emptyBlock0.getBounds();
      emptyBlock0.draw(graphics2D0, rectangle2D0);
      assertEquals(0.0, emptyBlock0.getHeight(), 0.01);
      assertEquals(0.0, emptyBlock0.getWidth(), 0.01);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      EmptyBlock emptyBlock0 = new EmptyBlock(0.0, 0.0);
      BufferedImage bufferedImage0 = new BufferedImage(1, 1, 2);
      Graphics2D graphics2D0 = bufferedImage0.createGraphics();
      Rectangle2D rectangle2D0 = emptyBlock0.getBounds();
      emptyBlock0.draw(graphics2D0, rectangle2D0, (Object) rectangle2D0);
      assertEquals(0.0, emptyBlock0.getHeight(), 0.01);
      assertEquals(0.0, emptyBlock0.getWidth(), 0.01);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      EmptyBlock emptyBlock0 = new EmptyBlock(0.0, 0.0);
      BufferedImage bufferedImage0 = new BufferedImage(1, 1, 2);
      Graphics2D graphics2D0 = bufferedImage0.createGraphics();
      // Undeclared exception!
      try { 
        emptyBlock0.arrange(graphics2D0, (RectangleConstraint) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.block.EmptyBlock", e);
      }
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      EmptyBlock emptyBlock0 = new EmptyBlock((-1619.86271046415), 0.0);
      EmptyBlock emptyBlock1 = (EmptyBlock)emptyBlock0.clone();
      assertEquals(0.0, emptyBlock1.getHeight(), 0.01);
      assertEquals((-1619.86271046415), emptyBlock1.getWidth(), 0.01);
  }
}
