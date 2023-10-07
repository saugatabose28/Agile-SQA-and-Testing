/*
 * This file was automatically generated by EvoSuite
 * Tue May 16 06:49:13 GMT 2023
 */

package org.jfree.chart.axis;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.jfree.chart.axis.CategoryLabelPosition;
import org.jfree.chart.axis.CategoryLabelWidthType;
import org.jfree.chart.text.TextBlockAnchor;
import org.jfree.chart.ui.RectangleAnchor;
import org.jfree.chart.ui.TextAnchor;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class CategoryLabelPosition_ESTest extends CategoryLabelPosition_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      RectangleAnchor rectangleAnchor0 = RectangleAnchor.TOP;
      TextBlockAnchor textBlockAnchor0 = mock(TextBlockAnchor.class, new ViolatedAssumptionAnswer());
      doReturn(">b@L-Lka", "rotationAnchor", "gm=", (String) null).when(textBlockAnchor0).toString();
      TextAnchor textAnchor0 = mock(TextAnchor.class, new ViolatedAssumptionAnswer());
      doReturn("rotationAnchor").when(textAnchor0).toString();
      CategoryLabelWidthType categoryLabelWidthType0 = mock(CategoryLabelWidthType.class, new ViolatedAssumptionAnswer());
      doReturn("gm=", (String) null, "gm=", "rotationAnchor").when(categoryLabelWidthType0).toString();
      CategoryLabelPosition categoryLabelPosition0 = new CategoryLabelPosition(rectangleAnchor0, textBlockAnchor0, textAnchor0, (-2703.406952761989), categoryLabelWidthType0, 1082.0F);
      TextBlockAnchor textBlockAnchor1 = categoryLabelPosition0.getLabelAnchor();
      categoryLabelPosition0.equals("feh^]upfk}t");
      categoryLabelPosition0.equals(textBlockAnchor1);
      categoryLabelPosition0.hashCode();
      categoryLabelPosition0.hashCode();
      categoryLabelPosition0.getWidthType();
      categoryLabelPosition0.equals("feh^]upfk}t");
      categoryLabelPosition0.getLabelAnchor();
      categoryLabelPosition0.getLabelAnchor();
      categoryLabelPosition0.getWidthType();
      TextAnchor textAnchor1 = categoryLabelPosition0.getRotationAnchor();
      CategoryLabelWidthType categoryLabelWidthType1 = categoryLabelPosition0.getWidthType();
      CategoryLabelPosition categoryLabelPosition1 = new CategoryLabelPosition(rectangleAnchor0, textBlockAnchor1, textAnchor1, 1082.0F, categoryLabelWidthType1, (-2461.5396F));
      categoryLabelPosition1.equals(categoryLabelPosition0);
      categoryLabelPosition0.equals(categoryLabelPosition1);
      categoryLabelPosition1.getWidthType();
      categoryLabelPosition0.getLabelAnchor();
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      CategoryLabelPosition categoryLabelPosition0 = new CategoryLabelPosition();
      categoryLabelPosition0.hashCode();
      categoryLabelPosition0.equals(categoryLabelPosition0);
      categoryLabelPosition0.equals(categoryLabelPosition0);
      RectangleAnchor rectangleAnchor0 = RectangleAnchor.RIGHT;
      TextAnchor textAnchor0 = mock(TextAnchor.class, new ViolatedAssumptionAnswer());
      CategoryLabelWidthType categoryLabelWidthType0 = mock(CategoryLabelWidthType.class, new ViolatedAssumptionAnswer());
      categoryLabelPosition0.equals("");
      CategoryLabelPosition categoryLabelPosition1 = null;
      try {
        categoryLabelPosition1 = new CategoryLabelPosition(rectangleAnchor0, (TextBlockAnchor) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'labelAnchor' argument.
         //
         verifyException("org.jfree.chart.util.Args", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      CategoryLabelPosition categoryLabelPosition0 = new CategoryLabelPosition();
      categoryLabelPosition0.getWidthRatio();
      categoryLabelPosition0.hashCode();
      categoryLabelPosition0.hashCode();
      categoryLabelPosition0.getCategoryAnchor();
      categoryLabelPosition0.hashCode();
      categoryLabelPosition0.hashCode();
      categoryLabelPosition0.getAngle();
      categoryLabelPosition0.hashCode();
      categoryLabelPosition0.hashCode();
      categoryLabelPosition0.hashCode();
      RectangleAnchor rectangleAnchor0 = categoryLabelPosition0.getCategoryAnchor();
      categoryLabelPosition0.hashCode();
      categoryLabelPosition0.equals("");
      categoryLabelPosition0.getRotationAnchor();
      CategoryLabelWidthType categoryLabelWidthType0 = categoryLabelPosition0.getWidthType();
      categoryLabelPosition0.getWidthRatio();
      categoryLabelPosition0.getAngle();
      categoryLabelPosition0.getRotationAnchor();
      categoryLabelPosition0.hashCode();
      categoryLabelPosition0.getWidthType();
      categoryLabelPosition0.getAngle();
      categoryLabelPosition0.equals(rectangleAnchor0);
      TextBlockAnchor textBlockAnchor0 = categoryLabelPosition0.getLabelAnchor();
      categoryLabelPosition0.equals(rectangleAnchor0);
      categoryLabelPosition0.getLabelAnchor();
      categoryLabelPosition0.getWidthType();
      categoryLabelPosition0.hashCode();
      categoryLabelPosition0.getCategoryAnchor();
      categoryLabelPosition0.getWidthRatio();
      categoryLabelPosition0.getAngle();
      CategoryLabelPosition categoryLabelPosition1 = new CategoryLabelPosition(rectangleAnchor0, textBlockAnchor0, categoryLabelWidthType0, 0.0F);
      categoryLabelPosition0.equals(categoryLabelPosition1);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      CategoryLabelPosition categoryLabelPosition0 = new CategoryLabelPosition();
      categoryLabelPosition0.hashCode();
      categoryLabelPosition0.hashCode();
      categoryLabelPosition0.equals("");
      categoryLabelPosition0.equals("");
      categoryLabelPosition0.equals("");
      categoryLabelPosition0.hashCode();
      RectangleAnchor rectangleAnchor0 = RectangleAnchor.CENTER;
      categoryLabelPosition0.hashCode();
      TextBlockAnchor textBlockAnchor0 = mock(TextBlockAnchor.class, new ViolatedAssumptionAnswer());
      CategoryLabelPosition categoryLabelPosition1 = new CategoryLabelPosition(rectangleAnchor0, textBlockAnchor0);
      categoryLabelPosition0.equals(categoryLabelPosition1);
      categoryLabelPosition0.getWidthRatio();
      TextBlockAnchor textBlockAnchor1 = categoryLabelPosition0.getLabelAnchor();
      categoryLabelPosition0.getRotationAnchor();
      categoryLabelPosition0.getCategoryAnchor();
      CategoryLabelPosition categoryLabelPosition2 = new CategoryLabelPosition();
      categoryLabelPosition2.hashCode();
      CategoryLabelWidthType categoryLabelWidthType0 = mock(CategoryLabelWidthType.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(categoryLabelWidthType0).toString();
      CategoryLabelPosition categoryLabelPosition3 = new CategoryLabelPosition(rectangleAnchor0, textBlockAnchor1, categoryLabelWidthType0, 0.95F);
      categoryLabelPosition2.equals(categoryLabelPosition3);
      categoryLabelPosition1.hashCode();
      categoryLabelPosition0.equals(categoryLabelPosition2);
      categoryLabelPosition2.getWidthType();
      categoryLabelPosition1.getCategoryAnchor();
      categoryLabelPosition1.getWidthRatio();
      categoryLabelPosition1.hashCode();
      categoryLabelPosition1.getWidthType();
      categoryLabelPosition0.getAngle();
      categoryLabelPosition0.getCategoryAnchor();
      categoryLabelPosition1.getWidthType();
      categoryLabelPosition2.getAngle();
      categoryLabelPosition3.getRotationAnchor();
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      CategoryLabelPosition categoryLabelPosition0 = new CategoryLabelPosition();
      categoryLabelPosition0.hashCode();
      categoryLabelPosition0.getRotationAnchor();
      CategoryLabelPosition categoryLabelPosition1 = new CategoryLabelPosition();
      categoryLabelPosition0.equals("");
      categoryLabelPosition1.equals("TextAnchor.TOP_LEFT");
      categoryLabelPosition1.hashCode();
      categoryLabelPosition0.equals(categoryLabelPosition1);
      categoryLabelPosition1.equals((Object) null);
      categoryLabelPosition1.getCategoryAnchor();
      categoryLabelPosition1.getLabelAnchor();
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      RectangleAnchor rectangleAnchor0 = RectangleAnchor.TOP_RIGHT;
      TextBlockAnchor textBlockAnchor0 = mock(TextBlockAnchor.class, new ViolatedAssumptionAnswer());
      CategoryLabelPosition categoryLabelPosition0 = new CategoryLabelPosition(rectangleAnchor0, textBlockAnchor0);
      TextBlockAnchor textBlockAnchor1 = mock(TextBlockAnchor.class, new ViolatedAssumptionAnswer());
      TextAnchor textAnchor0 = mock(TextAnchor.class, new ViolatedAssumptionAnswer());
      CategoryLabelWidthType categoryLabelWidthType0 = mock(CategoryLabelWidthType.class, new ViolatedAssumptionAnswer());
      CategoryLabelPosition categoryLabelPosition1 = new CategoryLabelPosition(rectangleAnchor0, textBlockAnchor1, textAnchor0, 1.0, categoryLabelWidthType0, (-2706.0F));
      categoryLabelPosition1.hashCode();
      categoryLabelPosition0.equals(categoryLabelPosition1);
      categoryLabelPosition0.getAngle();
      categoryLabelPosition1.getAngle();
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      RectangleAnchor rectangleAnchor0 = RectangleAnchor.BOTTOM;
      TextBlockAnchor textBlockAnchor0 = null;
      CategoryLabelPosition categoryLabelPosition0 = null;
      try {
        categoryLabelPosition0 = new CategoryLabelPosition(rectangleAnchor0, (TextBlockAnchor) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'labelAnchor' argument.
         //
         verifyException("org.jfree.chart.util.Args", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      RectangleAnchor rectangleAnchor0 = RectangleAnchor.CENTER;
      TextBlockAnchor textBlockAnchor0 = mock(TextBlockAnchor.class, new ViolatedAssumptionAnswer());
      CategoryLabelWidthType categoryLabelWidthType0 = mock(CategoryLabelWidthType.class, new ViolatedAssumptionAnswer());
      CategoryLabelPosition categoryLabelPosition0 = new CategoryLabelPosition(rectangleAnchor0, textBlockAnchor0, categoryLabelWidthType0, 0.0F);
      categoryLabelPosition0.hashCode();
      categoryLabelPosition0.equals(rectangleAnchor0);
      categoryLabelPosition0.hashCode();
      categoryLabelPosition0.getCategoryAnchor();
      categoryLabelPosition0.getWidthRatio();
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      RectangleAnchor rectangleAnchor0 = RectangleAnchor.TOP;
      TextBlockAnchor textBlockAnchor0 = mock(TextBlockAnchor.class, new ViolatedAssumptionAnswer());
      TextAnchor textAnchor0 = mock(TextAnchor.class, new ViolatedAssumptionAnswer());
      CategoryLabelWidthType categoryLabelWidthType0 = mock(CategoryLabelWidthType.class, new ViolatedAssumptionAnswer());
      CategoryLabelPosition categoryLabelPosition0 = new CategoryLabelPosition(rectangleAnchor0, textBlockAnchor0, textAnchor0, (-2824.07422), categoryLabelWidthType0, 1791.4474F);
      categoryLabelPosition0.getAngle();
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      RectangleAnchor rectangleAnchor0 = RectangleAnchor.BOTTOM_LEFT;
      TextBlockAnchor textBlockAnchor0 = mock(TextBlockAnchor.class, new ViolatedAssumptionAnswer());
      CategoryLabelWidthType categoryLabelWidthType0 = null;
      CategoryLabelPosition categoryLabelPosition0 = null;
      try {
        categoryLabelPosition0 = new CategoryLabelPosition(rectangleAnchor0, textBlockAnchor0, (CategoryLabelWidthType) null, (-1.0F));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'widthType' argument.
         //
         verifyException("org.jfree.chart.util.Args", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      CategoryLabelPosition categoryLabelPosition0 = new CategoryLabelPosition();
      RectangleAnchor rectangleAnchor0 = RectangleAnchor.TOP_RIGHT;
      TextBlockAnchor textBlockAnchor0 = mock(TextBlockAnchor.class, new ViolatedAssumptionAnswer());
      TextAnchor textAnchor0 = mock(TextAnchor.class, new ViolatedAssumptionAnswer());
      CategoryLabelWidthType categoryLabelWidthType0 = mock(CategoryLabelWidthType.class, new ViolatedAssumptionAnswer());
      CategoryLabelPosition categoryLabelPosition1 = new CategoryLabelPosition(rectangleAnchor0, textBlockAnchor0, textAnchor0, 0.0, categoryLabelWidthType0, (-575.0F));
      categoryLabelPosition1.equals(rectangleAnchor0);
      categoryLabelPosition0.equals(categoryLabelPosition1);
      TextBlockAnchor textBlockAnchor1 = categoryLabelPosition0.getLabelAnchor();
      categoryLabelPosition1.equals(textBlockAnchor1);
      categoryLabelPosition1.getWidthRatio();
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      CategoryLabelPosition categoryLabelPosition0 = new CategoryLabelPosition();
      categoryLabelPosition0.hashCode();
      categoryLabelPosition0.equals("");
      categoryLabelPosition0.getLabelAnchor();
      categoryLabelPosition0.getWidthType();
      categoryLabelPosition0.hashCode();
      categoryLabelPosition0.getWidthType();
      categoryLabelPosition0.getWidthRatio();
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      CategoryLabelPosition categoryLabelPosition0 = new CategoryLabelPosition();
      categoryLabelPosition0.equals((Object) null);
      categoryLabelPosition0.getLabelAnchor();
      categoryLabelPosition0.hashCode();
      categoryLabelPosition0.getCategoryAnchor();
      categoryLabelPosition0.getWidthRatio();
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      RectangleAnchor rectangleAnchor0 = RectangleAnchor.CENTER;
      TextAnchor textAnchor0 = mock(TextAnchor.class, new ViolatedAssumptionAnswer());
      CategoryLabelWidthType categoryLabelWidthType0 = mock(CategoryLabelWidthType.class, new ViolatedAssumptionAnswer());
      CategoryLabelPosition categoryLabelPosition0 = null;
      try {
        categoryLabelPosition0 = new CategoryLabelPosition(rectangleAnchor0, (TextBlockAnchor) null, textAnchor0, 0.0, categoryLabelWidthType0, 1.0F);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'labelAnchor' argument.
         //
         verifyException("org.jfree.chart.util.Args", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      CategoryLabelPosition categoryLabelPosition0 = new CategoryLabelPosition();
      RectangleAnchor rectangleAnchor0 = categoryLabelPosition0.getCategoryAnchor();
      categoryLabelPosition0.hashCode();
      categoryLabelPosition0.hashCode();
      categoryLabelPosition0.hashCode();
      categoryLabelPosition0.getAngle();
      categoryLabelPosition0.getWidthRatio();
      categoryLabelPosition0.hashCode();
      categoryLabelPosition0.equals(rectangleAnchor0);
      categoryLabelPosition0.getWidthRatio();
      TextAnchor textAnchor0 = categoryLabelPosition0.getRotationAnchor();
      categoryLabelPosition0.getLabelAnchor();
      categoryLabelPosition0.equals(textAnchor0);
      TextAnchor textAnchor1 = categoryLabelPosition0.getRotationAnchor();
      categoryLabelPosition0.getLabelAnchor();
      categoryLabelPosition0.getWidthType();
      categoryLabelPosition0.getAngle();
      TextBlockAnchor textBlockAnchor0 = categoryLabelPosition0.getLabelAnchor();
      categoryLabelPosition0.hashCode();
      categoryLabelPosition0.equals(textAnchor1);
      categoryLabelPosition0.getLabelAnchor();
      categoryLabelPosition0.getAngle();
      categoryLabelPosition0.equals("");
      categoryLabelPosition0.getCategoryAnchor();
      RectangleAnchor rectangleAnchor1 = RectangleAnchor.LEFT;
      CategoryLabelPosition categoryLabelPosition1 = new CategoryLabelPosition(rectangleAnchor1, textBlockAnchor0);
      categoryLabelPosition0.equals(categoryLabelPosition1);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      CategoryLabelPosition categoryLabelPosition0 = new CategoryLabelPosition();
      RectangleAnchor rectangleAnchor0 = RectangleAnchor.CENTER;
      TextBlockAnchor textBlockAnchor0 = mock(TextBlockAnchor.class, new ViolatedAssumptionAnswer());
      CategoryLabelPosition categoryLabelPosition1 = new CategoryLabelPosition(rectangleAnchor0, textBlockAnchor0);
      categoryLabelPosition0.equals(categoryLabelPosition1);
      categoryLabelPosition0.equals((Object) null);
      categoryLabelPosition0.equals("qby2)pJGzP?V_/0X");
      categoryLabelPosition0.getAngle();
      categoryLabelPosition0.getWidthRatio();
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      RectangleAnchor rectangleAnchor0 = RectangleAnchor.TOP;
      TextBlockAnchor textBlockAnchor0 = mock(TextBlockAnchor.class, new ViolatedAssumptionAnswer());
      doReturn((String) null, (String) null, (String) null).when(textBlockAnchor0).toString();
      TextAnchor textAnchor0 = mock(TextAnchor.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(textAnchor0).toString();
      CategoryLabelWidthType categoryLabelWidthType0 = mock(CategoryLabelWidthType.class, new ViolatedAssumptionAnswer());
      doReturn((String) null, (String) null, (String) null, (String) null).when(categoryLabelWidthType0).toString();
      CategoryLabelPosition categoryLabelPosition0 = new CategoryLabelPosition(rectangleAnchor0, textBlockAnchor0, textAnchor0, (-2703.406952761989), categoryLabelWidthType0, 1082.0F);
      TextBlockAnchor textBlockAnchor1 = categoryLabelPosition0.getLabelAnchor();
      categoryLabelPosition0.equals("feh^]upfk}t");
      categoryLabelPosition0.equals(textBlockAnchor1);
      categoryLabelPosition0.hashCode();
      categoryLabelPosition0.hashCode();
      categoryLabelPosition0.getWidthType();
      categoryLabelPosition0.equals("feh^]upfk}t");
      categoryLabelPosition0.getLabelAnchor();
      categoryLabelPosition0.getLabelAnchor();
      categoryLabelPosition0.getWidthType();
      TextAnchor textAnchor1 = categoryLabelPosition0.getRotationAnchor();
      CategoryLabelWidthType categoryLabelWidthType1 = categoryLabelPosition0.getWidthType();
      CategoryLabelPosition categoryLabelPosition1 = new CategoryLabelPosition(rectangleAnchor0, textBlockAnchor1, textAnchor1, 1082.0F, categoryLabelWidthType1, (-2461.5396F));
      categoryLabelPosition0.equals(categoryLabelPosition1);
      categoryLabelPosition1.getWidthType();
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      CategoryLabelPosition categoryLabelPosition0 = new CategoryLabelPosition();
      categoryLabelPosition0.getWidthRatio();
      categoryLabelPosition0.getRotationAnchor();
      categoryLabelPosition0.hashCode();
      categoryLabelPosition0.getWidthRatio();
      categoryLabelPosition0.hashCode();
      categoryLabelPosition0.getRotationAnchor();
      categoryLabelPosition0.hashCode();
      categoryLabelPosition0.hashCode();
      categoryLabelPosition0.getCategoryAnchor();
      categoryLabelPosition0.getWidthRatio();
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      RectangleAnchor rectangleAnchor0 = RectangleAnchor.BOTTOM_LEFT;
      TextBlockAnchor textBlockAnchor0 = mock(TextBlockAnchor.class, new ViolatedAssumptionAnswer());
      doReturn("").when(textBlockAnchor0).toString();
      CategoryLabelWidthType categoryLabelWidthType0 = mock(CategoryLabelWidthType.class, new ViolatedAssumptionAnswer());
      doReturn("", "", "").when(categoryLabelWidthType0).toString();
      CategoryLabelPosition categoryLabelPosition0 = new CategoryLabelPosition(rectangleAnchor0, textBlockAnchor0, categoryLabelWidthType0, (-0.20382065F));
      categoryLabelPosition0.hashCode();
      categoryLabelPosition0.hashCode();
      categoryLabelPosition0.hashCode();
      categoryLabelPosition0.hashCode();
      categoryLabelPosition0.getWidthType();
      categoryLabelPosition0.hashCode();
      TextBlockAnchor textBlockAnchor1 = mock(TextBlockAnchor.class, new ViolatedAssumptionAnswer());
      categoryLabelPosition0.equals(categoryLabelPosition0);
      TextBlockAnchor textBlockAnchor2 = categoryLabelPosition0.getLabelAnchor();
      categoryLabelPosition0.hashCode();
      categoryLabelPosition0.getAngle();
      categoryLabelPosition0.equals(textBlockAnchor2);
      categoryLabelPosition0.hashCode();
      categoryLabelPosition0.getWidthType();
      categoryLabelPosition0.hashCode();
      categoryLabelPosition0.getAngle();
      categoryLabelPosition0.hashCode();
      categoryLabelPosition0.getCategoryAnchor();
      categoryLabelPosition0.getCategoryAnchor();
      categoryLabelPosition0.getAngle();
      categoryLabelPosition0.getWidthType();
      categoryLabelPosition0.hashCode();
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      RectangleAnchor rectangleAnchor0 = RectangleAnchor.TOP_RIGHT;
      TextBlockAnchor textBlockAnchor0 = mock(TextBlockAnchor.class, new ViolatedAssumptionAnswer());
      doReturn((String) null, (String) null, (String) null, (String) null).when(textBlockAnchor0).toString();
      TextAnchor textAnchor0 = mock(TextAnchor.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(textAnchor0).toString();
      CategoryLabelWidthType categoryLabelWidthType0 = mock(CategoryLabelWidthType.class, new ViolatedAssumptionAnswer());
      doReturn((String) null, (String) null, (String) null, (String) null).when(categoryLabelWidthType0).toString();
      CategoryLabelPosition categoryLabelPosition0 = new CategoryLabelPosition(rectangleAnchor0, textBlockAnchor0, textAnchor0, 1913.1, categoryLabelWidthType0, 1.0F);
      categoryLabelPosition0.equals(rectangleAnchor0);
      categoryLabelPosition0.hashCode();
      categoryLabelPosition0.equals(rectangleAnchor0);
      categoryLabelPosition0.equals(rectangleAnchor0);
      TextBlockAnchor textBlockAnchor1 = categoryLabelPosition0.getLabelAnchor();
      categoryLabelPosition0.getWidthRatio();
      TextBlockAnchor textBlockAnchor2 = categoryLabelPosition0.getLabelAnchor();
      CategoryLabelWidthType categoryLabelWidthType1 = categoryLabelPosition0.getWidthType();
      categoryLabelPosition0.equals(textBlockAnchor2);
      CategoryLabelPosition categoryLabelPosition1 = new CategoryLabelPosition(rectangleAnchor0, textBlockAnchor1, categoryLabelWidthType1, 1.0F);
      categoryLabelPosition0.equals(categoryLabelPosition1);
      categoryLabelPosition0.hashCode();
      categoryLabelPosition0.getLabelAnchor();
      categoryLabelPosition1.equals("");
      categoryLabelPosition0.getCategoryAnchor();
      categoryLabelPosition0.equals(textBlockAnchor2);
      categoryLabelPosition0.getWidthType();
      categoryLabelPosition0.getWidthRatio();
      categoryLabelPosition0.hashCode();
      categoryLabelPosition0.getCategoryAnchor();
      categoryLabelPosition0.getWidthType();
      categoryLabelPosition1.getRotationAnchor();
      categoryLabelPosition0.getRotationAnchor();
      categoryLabelPosition1.getWidthType();
      categoryLabelPosition1.getLabelAnchor();
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      RectangleAnchor rectangleAnchor0 = RectangleAnchor.LEFT;
      TextBlockAnchor textBlockAnchor0 = mock(TextBlockAnchor.class, new ViolatedAssumptionAnswer());
      doReturn("widthType").when(textBlockAnchor0).toString();
      TextAnchor textAnchor0 = mock(TextAnchor.class, new ViolatedAssumptionAnswer());
      doReturn("widthType", "widthType").when(textAnchor0).toString();
      CategoryLabelWidthType categoryLabelWidthType0 = mock(CategoryLabelWidthType.class, new ViolatedAssumptionAnswer());
      CategoryLabelPosition categoryLabelPosition0 = new CategoryLabelPosition(rectangleAnchor0, textBlockAnchor0, textAnchor0, (-487.9510899221933), categoryLabelWidthType0, (-2558.0F));
      categoryLabelPosition0.getWidthRatio();
      RectangleAnchor rectangleAnchor1 = RectangleAnchor.TOP;
      TextBlockAnchor textBlockAnchor1 = mock(TextBlockAnchor.class, new ViolatedAssumptionAnswer());
      CategoryLabelPosition categoryLabelPosition1 = new CategoryLabelPosition(rectangleAnchor1, textBlockAnchor1);
      categoryLabelPosition0.equals(categoryLabelPosition1);
      categoryLabelPosition0.hashCode();
      categoryLabelPosition0.getRotationAnchor();
      categoryLabelPosition0.hashCode();
      categoryLabelPosition0.getLabelAnchor();
      categoryLabelPosition0.getRotationAnchor();
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      CategoryLabelPosition categoryLabelPosition0 = new CategoryLabelPosition();
      categoryLabelPosition0.hashCode();
      categoryLabelPosition0.getCategoryAnchor();
      CategoryLabelPosition categoryLabelPosition1 = new CategoryLabelPosition();
      categoryLabelPosition1.hashCode();
      categoryLabelPosition1.equals(categoryLabelPosition0);
      categoryLabelPosition1.equals(categoryLabelPosition0);
      categoryLabelPosition0.equals(categoryLabelPosition1);
      RectangleAnchor rectangleAnchor0 = RectangleAnchor.RIGHT;
      TextBlockAnchor textBlockAnchor0 = null;
      TextAnchor textAnchor0 = mock(TextAnchor.class, new ViolatedAssumptionAnswer());
      CategoryLabelWidthType categoryLabelWidthType0 = mock(CategoryLabelWidthType.class, new ViolatedAssumptionAnswer());
      categoryLabelPosition0.equals("");
      CategoryLabelPosition categoryLabelPosition2 = null;
      try {
        categoryLabelPosition2 = new CategoryLabelPosition(rectangleAnchor0, (TextBlockAnchor) null, textAnchor0, (-1.0), categoryLabelWidthType0, (-1747.7421F));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'labelAnchor' argument.
         //
         verifyException("org.jfree.chart.util.Args", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      RectangleAnchor rectangleAnchor0 = RectangleAnchor.CENTER;
      TextBlockAnchor textBlockAnchor0 = mock(TextBlockAnchor.class, new ViolatedAssumptionAnswer());
      CategoryLabelWidthType categoryLabelWidthType0 = mock(CategoryLabelWidthType.class, new ViolatedAssumptionAnswer());
      CategoryLabelPosition categoryLabelPosition0 = new CategoryLabelPosition(rectangleAnchor0, textBlockAnchor0, categoryLabelWidthType0, 0.0F);
      categoryLabelPosition0.hashCode();
      categoryLabelPosition0.equals(rectangleAnchor0);
      categoryLabelPosition0.hashCode();
      categoryLabelPosition0.hashCode();
      categoryLabelPosition0.equals(rectangleAnchor0);
      categoryLabelPosition0.hashCode();
      categoryLabelPosition0.hashCode();
      categoryLabelPosition0.getAngle();
      categoryLabelPosition0.getRotationAnchor();
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      TextBlockAnchor textBlockAnchor0 = mock(TextBlockAnchor.class, new ViolatedAssumptionAnswer());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      RectangleAnchor rectangleAnchor0 = RectangleAnchor.TOP;
      TextBlockAnchor textBlockAnchor0 = mock(TextBlockAnchor.class, new ViolatedAssumptionAnswer());
      doReturn("`xq=Dtj0&Gzf#Lsa", "", "").when(textBlockAnchor0).toString();
      CategoryLabelPosition categoryLabelPosition0 = new CategoryLabelPosition(rectangleAnchor0, textBlockAnchor0);
      categoryLabelPosition0.getWidthRatio();
      boolean boolean0 = categoryLabelPosition0.equals(rectangleAnchor0);
      categoryLabelPosition0.equals(rectangleAnchor0);
      categoryLabelPosition0.getRotationAnchor();
      categoryLabelPosition0.getAngle();
      categoryLabelPosition0.hashCode();
      categoryLabelPosition0.getRotationAnchor();
      categoryLabelPosition0.hashCode();
      categoryLabelPosition0.getWidthRatio();
      categoryLabelPosition0.getAngle();
      categoryLabelPosition0.getWidthRatio();
      categoryLabelPosition0.getAngle();
      TextBlockAnchor textBlockAnchor1 = mock(TextBlockAnchor.class, new ViolatedAssumptionAnswer());
      CategoryLabelPosition categoryLabelPosition1 = new CategoryLabelPosition(rectangleAnchor0, textBlockAnchor1);
      boolean boolean1 = categoryLabelPosition0.equals(categoryLabelPosition1);
      assertFalse(boolean1);
      
      TextBlockAnchor textBlockAnchor2 = categoryLabelPosition0.getLabelAnchor();
      CategoryLabelWidthType categoryLabelWidthType0 = mock(CategoryLabelWidthType.class, new ViolatedAssumptionAnswer());
      doReturn("", "`xq=Dtj0&Gzf#Lsa", "").when(categoryLabelWidthType0).toString();
      categoryLabelPosition0.hashCode();
      CategoryLabelPosition categoryLabelPosition2 = new CategoryLabelPosition(rectangleAnchor0, textBlockAnchor2, categoryLabelWidthType0, 0.0F);
      categoryLabelPosition2.equals(textBlockAnchor2);
      categoryLabelPosition2.hashCode();
      categoryLabelPosition2.equals(rectangleAnchor0);
      categoryLabelPosition0.equals(categoryLabelPosition2);
      categoryLabelPosition0.hashCode();
      categoryLabelPosition2.equals(categoryLabelPosition0);
      categoryLabelPosition0.equals(categoryLabelPosition2);
      categoryLabelPosition0.hashCode();
      categoryLabelPosition0.getAngle();
      float float0 = categoryLabelPosition0.getWidthRatio();
      assertEquals(0.95F, float0, 0.01F);
      
      categoryLabelPosition0.getCategoryAnchor();
      categoryLabelPosition2.getLabelAnchor();
      double double0 = categoryLabelPosition0.getAngle();
      assertEquals(0.0, double0, 0.01);
      
      boolean boolean2 = categoryLabelPosition0.equals(categoryLabelPosition2);
      assertTrue(boolean2 == boolean0);
      
      categoryLabelPosition0.getCategoryAnchor();
      categoryLabelPosition2.getLabelAnchor();
      assertEquals(0.0, categoryLabelPosition0.getAngle(), 0.01);
  }
}
