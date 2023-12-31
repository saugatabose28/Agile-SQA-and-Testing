/*
 * This file was automatically generated by EvoSuite
 * Tue May 16 06:11:57 GMT 2023
 */

package org.jfree.chart.ui;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.Rectangle;
import java.awt.geom.Rectangle2D;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jfree.chart.ui.RectangleEdge;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class RectangleEdge_ESTest extends RectangleEdge_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      RectangleEdge rectangleEdge0 = RectangleEdge.BOTTOM;
      RectangleEdge rectangleEdge1 = RectangleEdge.opposite(rectangleEdge0);
      assertNotNull(rectangleEdge1);
      
      boolean boolean0 = rectangleEdge1.equals(rectangleEdge0);
      assertFalse(rectangleEdge0.equals((Object)rectangleEdge1));
      assertFalse(boolean0);
      assertEquals("RectangleEdge.TOP", rectangleEdge1.toString());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      RectangleEdge rectangleEdge0 = RectangleEdge.RIGHT;
      Rectangle rectangle0 = new Rectangle(951, (-115), (-115), (-4209));
      double double0 = RectangleEdge.coordinate(rectangle0, rectangleEdge0);
      assertEquals(836.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      RectangleEdge rectangleEdge0 = RectangleEdge.TOP;
      // Undeclared exception!
      try { 
        RectangleEdge.coordinate((Rectangle2D) null, rectangleEdge0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.ui.RectangleEdge", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      RectangleEdge rectangleEdge0 = RectangleEdge.RIGHT;
      Rectangle2D.Float rectangle2D_Float0 = new Rectangle2D.Float((-5605.351F), 0.0F, 0.0F, 1.0F);
      double double0 = RectangleEdge.coordinate(rectangle2D_Float0, rectangleEdge0);
      assertEquals((-5605.35107421875), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      RectangleEdge rectangleEdge0 = RectangleEdge.RIGHT;
      Rectangle2D.Float rectangle2D_Float0 = new Rectangle2D.Float((-5605.351F), 0.0F, 0.0F, 1.0F);
      RectangleEdge rectangleEdge1 = RectangleEdge.opposite(rectangleEdge0);
      double double0 = RectangleEdge.coordinate(rectangle2D_Float0, rectangleEdge1);
      assertEquals("RectangleEdge.LEFT", rectangleEdge1.toString());
      assertEquals((-5605.35107421875), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Rectangle2D.Float rectangle2D_Float0 = new Rectangle2D.Float();
      double double0 = RectangleEdge.coordinate(rectangle2D_Float0, (RectangleEdge) null);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      RectangleEdge rectangleEdge0 = RectangleEdge.BOTTOM;
      Rectangle2D.Float rectangle2D_Float0 = new Rectangle2D.Float();
      double double0 = RectangleEdge.coordinate(rectangle2D_Float0, rectangleEdge0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      RectangleEdge rectangleEdge0 = RectangleEdge.LEFT;
      RectangleEdge rectangleEdge1 = RectangleEdge.opposite(rectangleEdge0);
      assertEquals("RectangleEdge.RIGHT", rectangleEdge1.toString());
      assertNotNull(rectangleEdge1);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      RectangleEdge rectangleEdge0 = RectangleEdge.TOP;
      RectangleEdge rectangleEdge1 = RectangleEdge.opposite(rectangleEdge0);
      RectangleEdge rectangleEdge2 = RectangleEdge.opposite(rectangleEdge1);
      assertEquals("RectangleEdge.TOP", rectangleEdge2.toString());
      assertNotSame(rectangleEdge1, rectangleEdge0);
      assertNotNull(rectangleEdge2);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      RectangleEdge rectangleEdge0 = RectangleEdge.opposite((RectangleEdge) null);
      assertNull(rectangleEdge0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      RectangleEdge rectangleEdge0 = RectangleEdge.TOP;
      boolean boolean0 = RectangleEdge.isLeftOrRight(rectangleEdge0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      RectangleEdge rectangleEdge0 = RectangleEdge.RIGHT;
      boolean boolean0 = RectangleEdge.isLeftOrRight(rectangleEdge0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      RectangleEdge rectangleEdge0 = RectangleEdge.LEFT;
      boolean boolean0 = RectangleEdge.isLeftOrRight(rectangleEdge0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      RectangleEdge rectangleEdge0 = RectangleEdge.BOTTOM;
      boolean boolean0 = RectangleEdge.isTopOrBottom(rectangleEdge0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      RectangleEdge rectangleEdge0 = RectangleEdge.LEFT;
      boolean boolean0 = RectangleEdge.isTopOrBottom(rectangleEdge0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      RectangleEdge rectangleEdge0 = RectangleEdge.TOP;
      boolean boolean0 = RectangleEdge.isTopOrBottom(rectangleEdge0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      RectangleEdge rectangleEdge0 = RectangleEdge.RIGHT;
      boolean boolean0 = rectangleEdge0.equals("RectangleEdge.RIGHT");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      RectangleEdge rectangleEdge0 = RectangleEdge.BOTTOM;
      boolean boolean0 = rectangleEdge0.equals(rectangleEdge0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      RectangleEdge rectangleEdge0 = RectangleEdge.TOP;
      RectangleEdge rectangleEdge1 = RectangleEdge.opposite(rectangleEdge0);
      assertNotNull(rectangleEdge1);
      
      boolean boolean0 = rectangleEdge1.equals(rectangleEdge0);
      assertFalse(boolean0);
      assertFalse(rectangleEdge0.equals((Object)rectangleEdge1));
      assertEquals("RectangleEdge.BOTTOM", rectangleEdge1.toString());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      RectangleEdge rectangleEdge0 = RectangleEdge.BOTTOM;
      String string0 = rectangleEdge0.toString();
      assertEquals("RectangleEdge.BOTTOM", string0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      RectangleEdge rectangleEdge0 = RectangleEdge.BOTTOM;
      rectangleEdge0.hashCode();
  }
}
