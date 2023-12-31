/*
 * This file was automatically generated by EvoSuite
 * Tue May 16 06:23:06 GMT 2023
 */

package org.jfree.chart.axis;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jfree.chart.axis.CategoryLabelPosition;
import org.jfree.chart.axis.CategoryLabelPositions;
import org.jfree.chart.axis.CategoryLabelWidthType;
import org.jfree.chart.text.TextBlockAnchor;
import org.jfree.chart.ui.RectangleAnchor;
import org.jfree.chart.ui.RectangleEdge;
import org.jfree.chart.ui.TextAnchor;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class CategoryLabelPositions_ESTest extends CategoryLabelPositions_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      CategoryLabelPositions categoryLabelPositions0 = CategoryLabelPositions.STANDARD;
      RectangleAnchor rectangleAnchor0 = RectangleAnchor.TOP_RIGHT;
      TextBlockAnchor textBlockAnchor0 = TextBlockAnchor.BOTTOM_LEFT;
      CategoryLabelPosition categoryLabelPosition0 = new CategoryLabelPosition(rectangleAnchor0, textBlockAnchor0);
      CategoryLabelPositions categoryLabelPositions1 = CategoryLabelPositions.replaceBottomPosition(categoryLabelPositions0, categoryLabelPosition0);
      Object object0 = new Object();
      categoryLabelPositions0.equals(object0);
      CategoryLabelPositions categoryLabelPositions2 = CategoryLabelPositions.replaceLeftPosition(categoryLabelPositions1, categoryLabelPosition0);
      CategoryLabelPositions.replaceBottomPosition(categoryLabelPositions2, categoryLabelPosition0);
      categoryLabelPositions1.hashCode();
      categoryLabelPositions1.STANDARD.equals(categoryLabelPositions0);
      categoryLabelPositions1.DOWN_45.hashCode();
      Object object1 = new Object();
      CategoryLabelPositions categoryLabelPositions3 = CategoryLabelPositions.createUpRotationLabelPositions(728.7);
      categoryLabelPositions0.equals(object1);
      RectangleEdge rectangleEdge0 = RectangleEdge.LEFT;
      CategoryLabelPosition categoryLabelPosition1 = categoryLabelPositions1.getLabelPosition(rectangleEdge0);
      CategoryLabelPositions categoryLabelPositions4 = CategoryLabelPositions.createDownRotationLabelPositions(0.0);
      CategoryLabelPositions categoryLabelPositions5 = CategoryLabelPositions.replaceBottomPosition(categoryLabelPositions3, categoryLabelPosition0);
      CategoryLabelPositions categoryLabelPositions6 = CategoryLabelPositions.createDownRotationLabelPositions(728.7);
      CategoryLabelPositions.replaceRightPosition(categoryLabelPositions4, categoryLabelPosition0);
      CategoryLabelPositions.replaceBottomPosition(categoryLabelPositions6, categoryLabelPosition1);
      CategoryLabelPositions.replaceRightPosition(categoryLabelPositions6, categoryLabelPosition0);
      CategoryLabelPositions.replaceBottomPosition(categoryLabelPositions2, categoryLabelPosition1);
      CategoryLabelPositions.replaceRightPosition(categoryLabelPositions5, categoryLabelPosition1);
      CategoryLabelPositions.replaceLeftPosition(categoryLabelPositions6, categoryLabelPosition0);
      CategoryLabelPositions.createUpRotationLabelPositions(0.0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      CategoryLabelPositions categoryLabelPositions0 = CategoryLabelPositions.STANDARD;
      RectangleAnchor rectangleAnchor0 = RectangleAnchor.BOTTOM_LEFT;
      TextBlockAnchor textBlockAnchor0 = TextBlockAnchor.TOP_RIGHT;
      TextAnchor textAnchor0 = TextAnchor.BOTTOM_CENTER;
      CategoryLabelPositions categoryLabelPositions1 = CategoryLabelPositions.createDownRotationLabelPositions(0.0);
      CategoryLabelWidthType categoryLabelWidthType0 = CategoryLabelWidthType.RANGE;
      CategoryLabelPosition categoryLabelPosition0 = new CategoryLabelPosition(rectangleAnchor0, textBlockAnchor0, textAnchor0, (-1.0), categoryLabelWidthType0, 328.0F);
      CategoryLabelPositions categoryLabelPositions2 = CategoryLabelPositions.replaceTopPosition(categoryLabelPositions0, categoryLabelPosition0);
      categoryLabelPositions1.hashCode();
      CategoryLabelPositions categoryLabelPositions3 = new CategoryLabelPositions(categoryLabelPosition0, categoryLabelPosition0, categoryLabelPosition0, categoryLabelPosition0);
      CategoryLabelPositions categoryLabelPositions4 = CategoryLabelPositions.replaceRightPosition(categoryLabelPositions3, categoryLabelPosition0);
      categoryLabelPositions4.STANDARD.hashCode();
      CategoryLabelPositions categoryLabelPositions5 = CategoryLabelPositions.UP_90;
      CategoryLabelPositions.replaceRightPosition(categoryLabelPositions5, categoryLabelPosition0);
      CategoryLabelPositions categoryLabelPositions6 = CategoryLabelPositions.replaceTopPosition(categoryLabelPositions3, categoryLabelPosition0);
      CategoryLabelPositions categoryLabelPositions7 = CategoryLabelPositions.createDownRotationLabelPositions(0.0);
      categoryLabelPositions2.equals(categoryLabelPositions6);
      CategoryLabelPositions.replaceTopPosition(categoryLabelPositions2, categoryLabelPosition0);
      CategoryLabelPositions.createDownRotationLabelPositions(0.0);
      CategoryLabelPositions.replaceBottomPosition(categoryLabelPositions7, categoryLabelPosition0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      CategoryLabelPosition categoryLabelPosition0 = new CategoryLabelPosition();
      RectangleAnchor rectangleAnchor0 = RectangleAnchor.BOTTOM_RIGHT;
      TextBlockAnchor textBlockAnchor0 = TextBlockAnchor.BOTTOM_CENTER;
      TextAnchor textAnchor0 = TextAnchor.TOP_CENTER;
      CategoryLabelWidthType categoryLabelWidthType0 = CategoryLabelWidthType.CATEGORY;
      CategoryLabelPosition categoryLabelPosition1 = new CategoryLabelPosition(rectangleAnchor0, textBlockAnchor0, textAnchor0, 2.0, categoryLabelWidthType0, 3555.9326F);
      CategoryLabelPositions categoryLabelPositions0 = new CategoryLabelPositions(categoryLabelPosition0, categoryLabelPosition0, categoryLabelPosition1, categoryLabelPosition1);
      CategoryLabelPositions categoryLabelPositions1 = CategoryLabelPositions.replaceLeftPosition(categoryLabelPositions0, categoryLabelPosition0);
      categoryLabelPositions1.equals(categoryLabelPositions0);
      CategoryLabelPositions categoryLabelPositions2 = CategoryLabelPositions.replaceLeftPosition(categoryLabelPositions0, categoryLabelPosition1);
      Object object0 = new Object();
      categoryLabelPositions2.DOWN_90.equals(object0);
      CategoryLabelPositions.replaceTopPosition(categoryLabelPositions2, categoryLabelPosition1);
      CategoryLabelPositions.createUpRotationLabelPositions(2856.121605692);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      CategoryLabelPosition categoryLabelPosition0 = null;
      CategoryLabelPositions categoryLabelPositions0 = null;
      try {
        categoryLabelPositions0 = new CategoryLabelPositions((CategoryLabelPosition) null, (CategoryLabelPosition) null, (CategoryLabelPosition) null, (CategoryLabelPosition) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'top' argument.
         //
         verifyException("org.jfree.chart.util.Args", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      RectangleAnchor rectangleAnchor0 = RectangleAnchor.LEFT;
      TextBlockAnchor textBlockAnchor0 = TextBlockAnchor.CENTER;
      TextAnchor textAnchor0 = TextAnchor.BOTTOM_CENTER;
      CategoryLabelWidthType categoryLabelWidthType0 = CategoryLabelWidthType.RANGE;
      CategoryLabelPosition categoryLabelPosition0 = new CategoryLabelPosition(rectangleAnchor0, textBlockAnchor0, textAnchor0, (-1494.47446279743), categoryLabelWidthType0, (-2025.0F));
      CategoryLabelPositions categoryLabelPositions0 = new CategoryLabelPositions(categoryLabelPosition0, categoryLabelPosition0, categoryLabelPosition0, categoryLabelPosition0);
      CategoryLabelPositions categoryLabelPositions1 = CategoryLabelPositions.replaceTopPosition(categoryLabelPositions0, categoryLabelPosition0);
      RectangleEdge rectangleEdge0 = RectangleEdge.LEFT;
      CategoryLabelPositions categoryLabelPositions2 = CategoryLabelPositions.replaceLeftPosition(categoryLabelPositions0, categoryLabelPosition0);
      categoryLabelPositions1.DOWN_90.equals(textAnchor0);
      CategoryLabelPositions.replaceBottomPosition(categoryLabelPositions0, categoryLabelPosition0);
      CategoryLabelPosition categoryLabelPosition1 = categoryLabelPositions0.getLabelPosition(rectangleEdge0);
      Object object0 = new Object();
      categoryLabelPosition0.equals(object0);
      CategoryLabelPositions.replaceBottomPosition(categoryLabelPositions0, categoryLabelPosition1);
      CategoryLabelPositions.createDownRotationLabelPositions((-2025.0F));
      CategoryLabelPositions.replaceTopPosition(categoryLabelPositions0, categoryLabelPosition1);
      categoryLabelPositions2.hashCode();
      CategoryLabelPositions.replaceLeftPosition(categoryLabelPositions1, categoryLabelPosition1);
      categoryLabelPositions2.getLabelPosition(rectangleEdge0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      CategoryLabelPositions categoryLabelPositions0 = CategoryLabelPositions.DOWN_90;
      RectangleEdge rectangleEdge0 = RectangleEdge.LEFT;
      CategoryLabelPositions.createDownRotationLabelPositions((-532.41));
      categoryLabelPositions0.getLabelPosition(rectangleEdge0);
      RectangleEdge rectangleEdge1 = RectangleEdge.TOP;
      categoryLabelPositions0.getLabelPosition(rectangleEdge1);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      CategoryLabelPositions categoryLabelPositions0 = CategoryLabelPositions.STANDARD;
      RectangleAnchor rectangleAnchor0 = RectangleAnchor.CENTER;
      TextBlockAnchor textBlockAnchor0 = TextBlockAnchor.CENTER_RIGHT;
      TextAnchor textAnchor0 = TextAnchor.BOTTOM_RIGHT;
      CategoryLabelWidthType categoryLabelWidthType0 = CategoryLabelWidthType.CATEGORY;
      CategoryLabelPosition categoryLabelPosition0 = new CategoryLabelPosition(rectangleAnchor0, textBlockAnchor0, textAnchor0, 155.023, categoryLabelWidthType0, 0.0F);
      CategoryLabelPositions categoryLabelPositions1 = CategoryLabelPositions.replaceTopPosition(categoryLabelPositions0, categoryLabelPosition0);
      CategoryLabelPositions categoryLabelPositions2 = CategoryLabelPositions.replaceBottomPosition(categoryLabelPositions1, categoryLabelPosition0);
      CategoryLabelPositions categoryLabelPositions3 = CategoryLabelPositions.replaceTopPosition(categoryLabelPositions2, categoryLabelPosition0);
      CategoryLabelPositions categoryLabelPositions4 = CategoryLabelPositions.replaceBottomPosition(categoryLabelPositions2, categoryLabelPosition0);
      CategoryLabelPositions.replaceRightPosition(categoryLabelPositions1, categoryLabelPosition0);
      CategoryLabelPositions.replaceLeftPosition(categoryLabelPositions3, categoryLabelPosition0);
      RectangleEdge rectangleEdge0 = RectangleEdge.BOTTOM;
      categoryLabelPositions3.getLabelPosition(rectangleEdge0);
      categoryLabelPositions4.getLabelPosition(rectangleEdge0);
      CategoryLabelPositions.createDownRotationLabelPositions((-1099.313102));
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      CategoryLabelPositions categoryLabelPositions0 = CategoryLabelPositions.createUpRotationLabelPositions((-4303.4753));
      RectangleEdge rectangleEdge0 = RectangleEdge.BOTTOM;
      RectangleEdge rectangleEdge1 = RectangleEdge.opposite(rectangleEdge0);
      categoryLabelPositions0.getLabelPosition(rectangleEdge1);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      RectangleAnchor rectangleAnchor0 = RectangleAnchor.CENTER;
      TextBlockAnchor textBlockAnchor0 = TextBlockAnchor.TOP_LEFT;
      TextAnchor textAnchor0 = TextAnchor.HALF_ASCENT_RIGHT;
      CategoryLabelWidthType categoryLabelWidthType0 = CategoryLabelWidthType.CATEGORY;
      CategoryLabelPosition categoryLabelPosition0 = new CategoryLabelPosition(rectangleAnchor0, textBlockAnchor0, textAnchor0, 0.7853981633974483, categoryLabelWidthType0, 1070.394F);
      // Undeclared exception!
      try { 
        CategoryLabelPositions.replaceBottomPosition((CategoryLabelPositions) null, categoryLabelPosition0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'base' argument.
         //
         verifyException("org.jfree.chart.util.Args", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      CategoryLabelPositions categoryLabelPositions0 = CategoryLabelPositions.UP_45;
      RectangleAnchor rectangleAnchor0 = RectangleAnchor.LEFT;
      TextBlockAnchor textBlockAnchor0 = TextBlockAnchor.CENTER;
      CategoryLabelWidthType categoryLabelWidthType0 = CategoryLabelWidthType.RANGE;
      CategoryLabelPosition categoryLabelPosition0 = new CategoryLabelPosition(rectangleAnchor0, textBlockAnchor0, categoryLabelWidthType0, 1.0F);
      CategoryLabelPositions categoryLabelPositions1 = CategoryLabelPositions.replaceLeftPosition(categoryLabelPositions0, categoryLabelPosition0);
      CategoryLabelPositions categoryLabelPositions2 = CategoryLabelPositions.replaceTopPosition(categoryLabelPositions1, categoryLabelPosition0);
      CategoryLabelPositions.replaceTopPosition(categoryLabelPositions0, categoryLabelPosition0);
      CategoryLabelPositions categoryLabelPositions3 = CategoryLabelPositions.createDownRotationLabelPositions((-822.363971047255));
      CategoryLabelPositions.createUpRotationLabelPositions((-822.363971047255));
      CategoryLabelPositions categoryLabelPositions4 = CategoryLabelPositions.replaceRightPosition(categoryLabelPositions0, categoryLabelPosition0);
      categoryLabelPositions4.hashCode();
      CategoryLabelPositions categoryLabelPositions5 = CategoryLabelPositions.replaceBottomPosition(categoryLabelPositions4, categoryLabelPosition0);
      CategoryLabelPositions.replaceRightPosition(categoryLabelPositions3, categoryLabelPosition0);
      RectangleEdge rectangleEdge0 = RectangleEdge.TOP;
      CategoryLabelPosition categoryLabelPosition1 = categoryLabelPositions2.getLabelPosition(rectangleEdge0);
      categoryLabelPositions1.hashCode();
      CategoryLabelPositions.replaceLeftPosition(categoryLabelPositions5, categoryLabelPosition1);
      // Undeclared exception!
      try { 
        CategoryLabelPositions.replaceLeftPosition(categoryLabelPositions1, (CategoryLabelPosition) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'left' argument.
         //
         verifyException("org.jfree.chart.util.Args", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      CategoryLabelPositions categoryLabelPositions0 = CategoryLabelPositions.UP_90;
      CategoryLabelPosition categoryLabelPosition0 = new CategoryLabelPosition();
      CategoryLabelPositions categoryLabelPositions1 = CategoryLabelPositions.replaceRightPosition(categoryLabelPositions0, categoryLabelPosition0);
      CategoryLabelPositions.replaceLeftPosition(categoryLabelPositions0, categoryLabelPosition0);
      CategoryLabelPositions categoryLabelPositions2 = CategoryLabelPositions.replaceBottomPosition(categoryLabelPositions0, categoryLabelPosition0);
      CategoryLabelPositions categoryLabelPositions3 = CategoryLabelPositions.createDownRotationLabelPositions((-742.0));
      CategoryLabelPositions categoryLabelPositions4 = CategoryLabelPositions.replaceRightPosition(categoryLabelPositions1, categoryLabelPosition0);
      categoryLabelPositions4.equals(categoryLabelPositions0);
      CategoryLabelPositions categoryLabelPositions5 = CategoryLabelPositions.createDownRotationLabelPositions(0.0);
      CategoryLabelPositions categoryLabelPositions6 = CategoryLabelPositions.createDownRotationLabelPositions(0.0);
      categoryLabelPositions5.UP_90.hashCode();
      categoryLabelPositions0.equals("");
      CategoryLabelPositions.createDownRotationLabelPositions(0.0);
      CategoryLabelPositions.replaceLeftPosition(categoryLabelPositions2, categoryLabelPosition0);
      CategoryLabelPositions.createUpRotationLabelPositions((-1.5707963267948966));
      categoryLabelPositions3.getLabelPosition((RectangleEdge) null);
      CategoryLabelPositions.createUpRotationLabelPositions((-742.0));
      CategoryLabelPositions.createUpRotationLabelPositions((-225.3579247220166));
      // Undeclared exception!
      try { 
        CategoryLabelPositions.replaceTopPosition(categoryLabelPositions6, (CategoryLabelPosition) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'top' argument.
         //
         verifyException("org.jfree.chart.util.Args", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      CategoryLabelPositions categoryLabelPositions0 = CategoryLabelPositions.createDownRotationLabelPositions(1.0);
      RectangleAnchor rectangleAnchor0 = RectangleAnchor.TOP;
      TextBlockAnchor textBlockAnchor0 = TextBlockAnchor.CENTER_RIGHT;
      CategoryLabelPosition categoryLabelPosition0 = new CategoryLabelPosition(rectangleAnchor0, textBlockAnchor0);
      CategoryLabelPositions categoryLabelPositions1 = CategoryLabelPositions.replaceTopPosition(categoryLabelPositions0, categoryLabelPosition0);
      CategoryLabelPositions categoryLabelPositions2 = CategoryLabelPositions.replaceRightPosition(categoryLabelPositions0, categoryLabelPosition0);
      CategoryLabelPositions categoryLabelPositions3 = CategoryLabelPositions.replaceLeftPosition(categoryLabelPositions2, categoryLabelPosition0);
      CategoryLabelPositions.replaceBottomPosition(categoryLabelPositions3, categoryLabelPosition0);
      CategoryLabelPositions categoryLabelPositions4 = CategoryLabelPositions.replaceTopPosition(categoryLabelPositions2, categoryLabelPosition0);
      CategoryLabelPositions.replaceRightPosition(categoryLabelPositions4, categoryLabelPosition0);
      CategoryLabelPositions.createUpRotationLabelPositions(1.0);
      CategoryLabelPositions categoryLabelPositions5 = CategoryLabelPositions.createDownRotationLabelPositions((-1.0));
      categoryLabelPositions5.STANDARD.hashCode();
      CategoryLabelPositions.replaceBottomPosition(categoryLabelPositions4, categoryLabelPosition0);
      categoryLabelPositions4.equals(categoryLabelPositions1);
      CategoryLabelPositions.replaceBottomPosition(categoryLabelPositions5, categoryLabelPosition0);
      CategoryLabelPositions.replaceTopPosition(categoryLabelPositions2, categoryLabelPosition0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      CategoryLabelPositions categoryLabelPositions0 = new CategoryLabelPositions();
      RectangleEdge rectangleEdge0 = RectangleEdge.BOTTOM;
      CategoryLabelPosition categoryLabelPosition0 = categoryLabelPositions0.getLabelPosition(rectangleEdge0);
      CategoryLabelPositions categoryLabelPositions1 = CategoryLabelPositions.replaceTopPosition(categoryLabelPositions0, categoryLabelPosition0);
      CategoryLabelPositions categoryLabelPositions2 = CategoryLabelPositions.createDownRotationLabelPositions((-1.0));
      categoryLabelPositions0.equals(categoryLabelPositions1);
      categoryLabelPositions1.hashCode();
      Object object0 = new Object();
      categoryLabelPositions0.equals(object0);
      CategoryLabelPositions.createDownRotationLabelPositions(0.0);
      categoryLabelPositions2.hashCode();
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      CategoryLabelPositions categoryLabelPositions0 = CategoryLabelPositions.UP_90;
      CategoryLabelPositions categoryLabelPositions1 = new CategoryLabelPositions();
      categoryLabelPositions0.DOWN_45.equals(categoryLabelPositions1);
      categoryLabelPositions0.hashCode();
      CategoryLabelPosition categoryLabelPosition0 = new CategoryLabelPosition();
      CategoryLabelPositions.replaceTopPosition(categoryLabelPositions0, categoryLabelPosition0);
      categoryLabelPositions1.equals("@.+. ");
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      RectangleAnchor rectangleAnchor0 = RectangleAnchor.RIGHT;
      TextBlockAnchor textBlockAnchor0 = TextBlockAnchor.TOP_LEFT;
      CategoryLabelPosition categoryLabelPosition0 = new CategoryLabelPosition(rectangleAnchor0, textBlockAnchor0);
      CategoryLabelPositions categoryLabelPositions0 = new CategoryLabelPositions(categoryLabelPosition0, categoryLabelPosition0, categoryLabelPosition0, categoryLabelPosition0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      CategoryLabelPositions categoryLabelPositions0 = null;
      try {
        categoryLabelPositions0 = new CategoryLabelPositions((CategoryLabelPosition) null, (CategoryLabelPosition) null, (CategoryLabelPosition) null, (CategoryLabelPosition) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'top' argument.
         //
         verifyException("org.jfree.chart.util.Args", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      CategoryLabelPositions categoryLabelPositions0 = CategoryLabelPositions.UP_90;
      categoryLabelPositions0.DOWN_45.hashCode();
      RectangleEdge rectangleEdge0 = RectangleEdge.TOP;
      categoryLabelPositions0.getLabelPosition(rectangleEdge0);
      categoryLabelPositions0.UP_90.equals((Object) null);
      categoryLabelPositions0.getLabelPosition(rectangleEdge0);
      categoryLabelPositions0.equals(rectangleEdge0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      CategoryLabelPositions categoryLabelPositions0 = CategoryLabelPositions.UP_45;
      RectangleAnchor rectangleAnchor0 = RectangleAnchor.LEFT;
      TextBlockAnchor textBlockAnchor0 = TextBlockAnchor.CENTER_RIGHT;
      TextAnchor textAnchor0 = TextAnchor.TOP_CENTER;
      CategoryLabelWidthType categoryLabelWidthType0 = CategoryLabelWidthType.CATEGORY;
      CategoryLabelPosition categoryLabelPosition0 = new CategoryLabelPosition(rectangleAnchor0, textBlockAnchor0, textAnchor0, 727.9204867, categoryLabelWidthType0, 1300.451F);
      CategoryLabelPositions.replaceLeftPosition(categoryLabelPositions0, categoryLabelPosition0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      CategoryLabelPositions categoryLabelPositions0 = CategoryLabelPositions.createUpRotationLabelPositions(1522.33796);
      CategoryLabelPosition categoryLabelPosition0 = new CategoryLabelPosition();
      CategoryLabelPositions.replaceRightPosition(categoryLabelPositions0, categoryLabelPosition0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      CategoryLabelPositions categoryLabelPositions0 = CategoryLabelPositions.DOWN_45;
      CategoryLabelPosition categoryLabelPosition0 = new CategoryLabelPosition();
      CategoryLabelPositions categoryLabelPositions1 = CategoryLabelPositions.replaceTopPosition(categoryLabelPositions0, categoryLabelPosition0);
      categoryLabelPositions0.UP_45.hashCode();
      categoryLabelPositions1.DOWN_90.equals(categoryLabelPosition0);
      RectangleEdge rectangleEdge0 = RectangleEdge.BOTTOM;
      categoryLabelPositions0.getLabelPosition(rectangleEdge0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      RectangleAnchor rectangleAnchor0 = RectangleAnchor.BOTTOM;
      TextBlockAnchor textBlockAnchor0 = TextBlockAnchor.TOP_RIGHT;
      CategoryLabelWidthType categoryLabelWidthType0 = CategoryLabelWidthType.RANGE;
      float float0 = 1.0F;
      CategoryLabelPosition categoryLabelPosition0 = new CategoryLabelPosition(rectangleAnchor0, textBlockAnchor0, categoryLabelWidthType0, 1.0F);
      // Undeclared exception!
      try { 
        CategoryLabelPositions.replaceRightPosition((CategoryLabelPositions) null, categoryLabelPosition0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'base' argument.
         //
         verifyException("org.jfree.chart.util.Args", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      CategoryLabelPositions categoryLabelPositions0 = CategoryLabelPositions.createUpRotationLabelPositions((-425.5188421835364));
      categoryLabelPositions0.equals((Object) null);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      CategoryLabelPositions categoryLabelPositions0 = new CategoryLabelPositions();
      RectangleEdge rectangleEdge0 = RectangleEdge.LEFT;
      RectangleEdge rectangleEdge1 = RectangleEdge.opposite(rectangleEdge0);
      CategoryLabelPosition categoryLabelPosition0 = categoryLabelPositions0.getLabelPosition(rectangleEdge1);
      CategoryLabelPositions.replaceLeftPosition(categoryLabelPositions0, categoryLabelPosition0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      CategoryLabelPositions categoryLabelPositions0 = CategoryLabelPositions.createUpRotationLabelPositions(0.7853981633974483);
      // Undeclared exception!
      try { 
        CategoryLabelPositions.replaceLeftPosition(categoryLabelPositions0, (CategoryLabelPosition) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'left' argument.
         //
         verifyException("org.jfree.chart.util.Args", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      CategoryLabelPositions categoryLabelPositions0 = CategoryLabelPositions.STANDARD;
      CategoryLabelPositions.createDownRotationLabelPositions(0.0);
      CategoryLabelPosition categoryLabelPosition0 = new CategoryLabelPosition();
      CategoryLabelPositions.replaceTopPosition(categoryLabelPositions0, categoryLabelPosition0);
      categoryLabelPositions0.hashCode();
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      CategoryLabelPositions categoryLabelPositions0 = CategoryLabelPositions.UP_45;
      CategoryLabelPosition categoryLabelPosition0 = new CategoryLabelPosition();
      CategoryLabelPositions categoryLabelPositions1 = CategoryLabelPositions.replaceRightPosition(categoryLabelPositions0, categoryLabelPosition0);
      CategoryLabelPositions.replaceBottomPosition(categoryLabelPositions1, categoryLabelPosition0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      CategoryLabelPositions.createDownRotationLabelPositions((-1.0));
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      CategoryLabelPositions.createUpRotationLabelPositions((-1156.383488));
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      CategoryLabelPositions categoryLabelPositions0 = CategoryLabelPositions.STANDARD;
      RectangleAnchor rectangleAnchor0 = RectangleAnchor.TOP_RIGHT;
      TextBlockAnchor textBlockAnchor0 = TextBlockAnchor.BOTTOM_LEFT;
      CategoryLabelPosition categoryLabelPosition0 = new CategoryLabelPosition(rectangleAnchor0, textBlockAnchor0);
      CategoryLabelPositions categoryLabelPositions1 = CategoryLabelPositions.replaceBottomPosition(categoryLabelPositions0, categoryLabelPosition0);
      Object object0 = new Object();
      categoryLabelPositions0.equals(object0);
      CategoryLabelPositions categoryLabelPositions2 = CategoryLabelPositions.replaceLeftPosition(categoryLabelPositions1, categoryLabelPosition0);
      CategoryLabelPositions.replaceBottomPosition(categoryLabelPositions2, categoryLabelPosition0);
      categoryLabelPositions1.hashCode();
      categoryLabelPositions1.STANDARD.equals(categoryLabelPositions0);
      categoryLabelPositions1.DOWN_45.hashCode();
      Object object1 = new Object();
      CategoryLabelPositions.createUpRotationLabelPositions((-1.0));
      CategoryLabelPositions categoryLabelPositions3 = CategoryLabelPositions.createUpRotationLabelPositions(728.7);
      categoryLabelPositions0.equals(object1);
      RectangleEdge rectangleEdge0 = RectangleEdge.LEFT;
      CategoryLabelPosition categoryLabelPosition1 = categoryLabelPositions1.getLabelPosition(rectangleEdge0);
      CategoryLabelPositions categoryLabelPositions4 = CategoryLabelPositions.createDownRotationLabelPositions(0.0);
      CategoryLabelPositions categoryLabelPositions5 = CategoryLabelPositions.replaceBottomPosition(categoryLabelPositions3, categoryLabelPosition0);
      CategoryLabelPositions categoryLabelPositions6 = CategoryLabelPositions.createDownRotationLabelPositions(728.7);
      CategoryLabelPositions.replaceRightPosition(categoryLabelPositions4, categoryLabelPosition0);
      CategoryLabelPositions.replaceBottomPosition(categoryLabelPositions3, categoryLabelPosition1);
      CategoryLabelPositions.replaceRightPosition(categoryLabelPositions6, categoryLabelPosition0);
      CategoryLabelPositions.replaceBottomPosition(categoryLabelPositions2, categoryLabelPosition1);
      CategoryLabelPositions.replaceRightPosition(categoryLabelPositions5, categoryLabelPosition1);
      CategoryLabelPositions.replaceLeftPosition(categoryLabelPositions6, categoryLabelPosition0);
      CategoryLabelPositions.createUpRotationLabelPositions(0.0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      CategoryLabelPositions categoryLabelPositions0 = CategoryLabelPositions.STANDARD;
      RectangleAnchor rectangleAnchor0 = RectangleAnchor.BOTTOM_LEFT;
      TextBlockAnchor textBlockAnchor0 = TextBlockAnchor.TOP_RIGHT;
      TextAnchor textAnchor0 = TextAnchor.BOTTOM_CENTER;
      CategoryLabelPositions categoryLabelPositions1 = CategoryLabelPositions.createDownRotationLabelPositions(0.0);
      CategoryLabelWidthType categoryLabelWidthType0 = CategoryLabelWidthType.RANGE;
      CategoryLabelPosition categoryLabelPosition0 = new CategoryLabelPosition(rectangleAnchor0, textBlockAnchor0, textAnchor0, (-1.0), categoryLabelWidthType0, 328.0F);
      CategoryLabelPositions categoryLabelPositions2 = CategoryLabelPositions.replaceTopPosition(categoryLabelPositions0, categoryLabelPosition0);
      categoryLabelPositions1.hashCode();
      CategoryLabelPositions categoryLabelPositions3 = new CategoryLabelPositions(categoryLabelPosition0, categoryLabelPosition0, categoryLabelPosition0, categoryLabelPosition0);
      CategoryLabelPositions categoryLabelPositions4 = CategoryLabelPositions.replaceRightPosition(categoryLabelPositions3, categoryLabelPosition0);
      categoryLabelPositions4.STANDARD.hashCode();
      CategoryLabelPositions categoryLabelPositions5 = CategoryLabelPositions.UP_90;
      CategoryLabelPositions categoryLabelPositions6 = CategoryLabelPositions.UP_45;
      CategoryLabelPositions categoryLabelPositions7 = CategoryLabelPositions.replaceTopPosition(categoryLabelPositions3, categoryLabelPosition0);
      CategoryLabelPositions categoryLabelPositions8 = CategoryLabelPositions.createDownRotationLabelPositions((-1.0));
      categoryLabelPositions2.equals(categoryLabelPositions7);
      CategoryLabelPositions.replaceTopPosition(categoryLabelPositions2, categoryLabelPosition0);
      CategoryLabelPositions.createDownRotationLabelPositions(0.0);
      CategoryLabelPositions.replaceBottomPosition(categoryLabelPositions8, categoryLabelPosition0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      CategoryLabelPositions categoryLabelPositions0 = CategoryLabelPositions.UP_90;
      TextBlockAnchor textBlockAnchor0 = TextBlockAnchor.TOP_RIGHT;
      TextAnchor textAnchor0 = TextAnchor.HALF_ASCENT_CENTER;
      CategoryLabelWidthType categoryLabelWidthType0 = CategoryLabelWidthType.RANGE;
      RectangleAnchor rectangleAnchor0 = RectangleAnchor.LEFT;
      TextBlockAnchor textBlockAnchor1 = TextBlockAnchor.CENTER_RIGHT;
      CategoryLabelPosition categoryLabelPosition0 = new CategoryLabelPosition(rectangleAnchor0, textBlockAnchor1);
      CategoryLabelPositions.replaceBottomPosition(categoryLabelPositions0, categoryLabelPosition0);
      CategoryLabelPositions.replaceLeftPosition(categoryLabelPositions0, categoryLabelPosition0);
      CategoryLabelPositions.replaceTopPosition(categoryLabelPositions0, categoryLabelPosition0);
      categoryLabelPositions0.getLabelPosition((RectangleEdge) null);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      RectangleAnchor rectangleAnchor0 = RectangleAnchor.TOP;
      TextBlockAnchor textBlockAnchor0 = TextBlockAnchor.TOP_LEFT;
      TextAnchor textAnchor0 = TextAnchor.HALF_ASCENT_CENTER;
      CategoryLabelWidthType categoryLabelWidthType0 = CategoryLabelWidthType.CATEGORY;
      CategoryLabelPosition categoryLabelPosition0 = new CategoryLabelPosition(rectangleAnchor0, textBlockAnchor0, textAnchor0, 1514.369387, categoryLabelWidthType0, 1241.0F);
      CategoryLabelPositions categoryLabelPositions0 = new CategoryLabelPositions(categoryLabelPosition0, categoryLabelPosition0, categoryLabelPosition0, categoryLabelPosition0);
      CategoryLabelPositions categoryLabelPositions1 = CategoryLabelPositions.replaceTopPosition(categoryLabelPositions0, categoryLabelPosition0);
      CategoryLabelPositions categoryLabelPositions2 = CategoryLabelPositions.UP_45;
      categoryLabelPositions2.DOWN_90.equals(categoryLabelPositions1);
      TextBlockAnchor textBlockAnchor1 = TextBlockAnchor.CENTER_LEFT;
      CategoryLabelPosition categoryLabelPosition1 = new CategoryLabelPosition(rectangleAnchor0, textBlockAnchor1);
      CategoryLabelPositions.replaceBottomPosition(categoryLabelPositions1, categoryLabelPosition1);
      CategoryLabelPositions categoryLabelPositions3 = CategoryLabelPositions.replaceTopPosition(categoryLabelPositions2, categoryLabelPosition0);
      CategoryLabelPositions categoryLabelPositions4 = CategoryLabelPositions.STANDARD;
      CategoryLabelPositions categoryLabelPositions5 = CategoryLabelPositions.DOWN_45;
      CategoryLabelPosition categoryLabelPosition2 = new CategoryLabelPosition(rectangleAnchor0, textBlockAnchor0, textAnchor0, 1514.369387, categoryLabelWidthType0, (-1.0F));
      CategoryLabelPositions.replaceBottomPosition(categoryLabelPositions5, categoryLabelPosition2);
      categoryLabelPositions1.equals("left");
      CategoryLabelPositions.replaceRightPosition(categoryLabelPositions1, categoryLabelPosition0);
      CategoryLabelPositions categoryLabelPositions6 = CategoryLabelPositions.replaceRightPosition(categoryLabelPositions1, categoryLabelPosition0);
      CategoryLabelPositions.replaceTopPosition(categoryLabelPositions6, categoryLabelPosition0);
      CategoryLabelPositions.replaceRightPosition(categoryLabelPositions1, categoryLabelPosition2);
      CategoryLabelPositions.createUpRotationLabelPositions(1514.369387);
      categoryLabelPositions0.equals(categoryLabelPositions1);
      CategoryLabelPositions categoryLabelPositions7 = CategoryLabelPositions.STANDARD;
      categoryLabelPositions5.hashCode();
      CategoryLabelPositions.createUpRotationLabelPositions(1241.0F);
      CategoryLabelPositions.replaceTopPosition(categoryLabelPositions4, categoryLabelPosition1);
      CategoryLabelPositions.createDownRotationLabelPositions(0.0);
      CategoryLabelPositions.createDownRotationLabelPositions(1514.369387);
      categoryLabelPositions3.hashCode();
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      CategoryLabelPositions categoryLabelPositions0 = CategoryLabelPositions.createDownRotationLabelPositions(1.0);
      RectangleAnchor rectangleAnchor0 = RectangleAnchor.TOP;
      TextBlockAnchor textBlockAnchor0 = TextBlockAnchor.CENTER_RIGHT;
      CategoryLabelPosition categoryLabelPosition0 = new CategoryLabelPosition(rectangleAnchor0, textBlockAnchor0);
      CategoryLabelPositions categoryLabelPositions1 = CategoryLabelPositions.replaceTopPosition(categoryLabelPositions0, categoryLabelPosition0);
      CategoryLabelPositions categoryLabelPositions2 = CategoryLabelPositions.replaceRightPosition(categoryLabelPositions0, categoryLabelPosition0);
      CategoryLabelPositions categoryLabelPositions3 = CategoryLabelPositions.replaceTopPosition(categoryLabelPositions1, categoryLabelPosition0);
      CategoryLabelPositions.replaceBottomPosition(categoryLabelPositions3, categoryLabelPosition0);
      CategoryLabelPositions categoryLabelPositions4 = CategoryLabelPositions.replaceTopPosition(categoryLabelPositions2, categoryLabelPosition0);
      CategoryLabelPositions categoryLabelPositions5 = CategoryLabelPositions.replaceRightPosition(categoryLabelPositions4, categoryLabelPosition0);
      CategoryLabelPositions.createUpRotationLabelPositions(1.0);
      CategoryLabelPositions categoryLabelPositions6 = CategoryLabelPositions.createDownRotationLabelPositions((-1.0));
      categoryLabelPositions6.STANDARD.hashCode();
      CategoryLabelPositions categoryLabelPositions7 = CategoryLabelPositions.replaceBottomPosition(categoryLabelPositions4, categoryLabelPosition0);
      boolean boolean0 = categoryLabelPositions4.equals(categoryLabelPositions1);
      assertFalse(boolean0);
      
      CategoryLabelPositions categoryLabelPositions8 = CategoryLabelPositions.STANDARD;
      CategoryLabelPositions categoryLabelPositions9 = CategoryLabelPositions.replaceTopPosition(categoryLabelPositions2, categoryLabelPosition0);
      assertTrue(categoryLabelPositions9.equals((Object)categoryLabelPositions5));
      assertFalse(categoryLabelPositions2.equals((Object)categoryLabelPositions4));
      assertFalse(categoryLabelPositions9.equals((Object)categoryLabelPositions7));
  }
}
