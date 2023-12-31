/*
 * This file was automatically generated by EvoSuite
 * Tue May 16 05:50:50 GMT 2023
 */

package org.jfree.chart.plot;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.Color;
import java.awt.Paint;
import java.awt.Stroke;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.jfree.chart.plot.CategoryMarker;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class CategoryMarker_ESTest extends CategoryMarker_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Comparable<CategoryMarker> comparable0 = (Comparable<CategoryMarker>) mock(Comparable.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(comparable0).toString();
      Paint paint0 = mock(Paint.class, new ViolatedAssumptionAnswer());
      Stroke stroke0 = mock(Stroke.class, new ViolatedAssumptionAnswer());
      CategoryMarker categoryMarker0 = new CategoryMarker(comparable0, paint0, stroke0, paint0, stroke0, 0.9F);
      categoryMarker0.getKey();
      assertFalse(categoryMarker0.getDrawAsLine());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Comparable<Integer> comparable0 = (Comparable<Integer>) mock(Comparable.class, new ViolatedAssumptionAnswer());
      CategoryMarker categoryMarker0 = new CategoryMarker(comparable0);
      assertFalse(categoryMarker0.getDrawAsLine());
      
      categoryMarker0.setDrawAsLine(true);
      boolean boolean0 = categoryMarker0.getDrawAsLine();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Comparable<CategoryMarker> comparable0 = (Comparable<CategoryMarker>) mock(Comparable.class, new ViolatedAssumptionAnswer());
      CategoryMarker categoryMarker0 = new CategoryMarker(comparable0);
      // Undeclared exception!
      try { 
        categoryMarker0.setKey((Comparable) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'key' argument.
         //
         verifyException("org.jfree.chart.util.Args", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      CategoryMarker categoryMarker0 = new CategoryMarker((Comparable) null);
      // Undeclared exception!
      try { 
        categoryMarker0.equals(categoryMarker0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.plot.CategoryMarker", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Comparable<CategoryMarker> comparable0 = (Comparable<CategoryMarker>) mock(Comparable.class, new ViolatedAssumptionAnswer());
      Paint paint0 = mock(Paint.class, new ViolatedAssumptionAnswer());
      Stroke stroke0 = mock(Stroke.class, new ViolatedAssumptionAnswer());
      CategoryMarker categoryMarker0 = null;
      try {
        categoryMarker0 = new CategoryMarker(comparable0, paint0, stroke0, paint0, stroke0, 2592.5964F);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The 'alpha' value must be in the range 0.0f to 1.0f
         //
         verifyException("org.jfree.chart.plot.Marker", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Comparable<Object> comparable0 = (Comparable<Object>) mock(Comparable.class, new ViolatedAssumptionAnswer());
      Stroke stroke0 = mock(Stroke.class, new ViolatedAssumptionAnswer());
      CategoryMarker categoryMarker0 = null;
      try {
        categoryMarker0 = new CategoryMarker(comparable0, (Paint) null, stroke0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'paint' argument.
         //
         verifyException("org.jfree.chart.util.Args", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Comparable<CategoryMarker> comparable0 = (Comparable<CategoryMarker>) mock(Comparable.class, new ViolatedAssumptionAnswer());
      Paint paint0 = mock(Paint.class, new ViolatedAssumptionAnswer());
      Stroke stroke0 = mock(Stroke.class, new ViolatedAssumptionAnswer());
      CategoryMarker categoryMarker0 = new CategoryMarker(comparable0, paint0, stroke0, paint0, stroke0, 0.9F);
      CategoryMarker categoryMarker1 = (CategoryMarker)categoryMarker0.clone();
      categoryMarker1.setDrawAsLine(true);
      boolean boolean0 = categoryMarker0.equals(categoryMarker1);
      assertTrue(categoryMarker1.getDrawAsLine());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Comparable<CategoryMarker> comparable0 = (Comparable<CategoryMarker>) mock(Comparable.class, new ViolatedAssumptionAnswer());
      CategoryMarker categoryMarker0 = new CategoryMarker(comparable0);
      CategoryMarker categoryMarker1 = new CategoryMarker((Comparable) null);
      boolean boolean0 = categoryMarker0.equals(categoryMarker1);
      assertFalse(boolean0);
      assertFalse(categoryMarker1.getDrawAsLine());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Comparable<CategoryMarker> comparable0 = (Comparable<CategoryMarker>) mock(Comparable.class, new ViolatedAssumptionAnswer());
      Paint paint0 = mock(Paint.class, new ViolatedAssumptionAnswer());
      Stroke stroke0 = mock(Stroke.class, new ViolatedAssumptionAnswer());
      CategoryMarker categoryMarker0 = new CategoryMarker(comparable0, paint0, stroke0, paint0, stroke0, 0.9F);
      Color color0 = categoryMarker0.getLabelBackgroundColor();
      Stroke stroke1 = mock(Stroke.class, new ViolatedAssumptionAnswer());
      CategoryMarker categoryMarker1 = new CategoryMarker(comparable0, color0, stroke1);
      boolean boolean0 = categoryMarker1.equals(categoryMarker0);
      assertFalse(boolean0);
      assertFalse(categoryMarker1.getDrawAsLine());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Comparable<CategoryMarker> comparable0 = (Comparable<CategoryMarker>) mock(Comparable.class, new ViolatedAssumptionAnswer());
      Paint paint0 = mock(Paint.class, new ViolatedAssumptionAnswer());
      Stroke stroke0 = mock(Stroke.class, new ViolatedAssumptionAnswer());
      CategoryMarker categoryMarker0 = new CategoryMarker(comparable0, paint0, stroke0, paint0, stroke0, 0.9F);
      Color color0 = categoryMarker0.getLabelBackgroundColor();
      boolean boolean0 = categoryMarker0.equals(color0);
      assertFalse(categoryMarker0.getDrawAsLine());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      CategoryMarker categoryMarker0 = new CategoryMarker((Comparable) null);
      boolean boolean0 = categoryMarker0.equals((Object) null);
      assertFalse(boolean0);
      assertFalse(categoryMarker0.getDrawAsLine());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Comparable<CategoryMarker> comparable0 = (Comparable<CategoryMarker>) mock(Comparable.class, new ViolatedAssumptionAnswer());
      Paint paint0 = mock(Paint.class, new ViolatedAssumptionAnswer());
      Stroke stroke0 = mock(Stroke.class, new ViolatedAssumptionAnswer());
      CategoryMarker categoryMarker0 = new CategoryMarker(comparable0, paint0, stroke0, paint0, stroke0, 0.9F);
      boolean boolean0 = categoryMarker0.equals(categoryMarker0);
      assertFalse(categoryMarker0.getDrawAsLine());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Comparable<CategoryMarker> comparable0 = (Comparable<CategoryMarker>) mock(Comparable.class, new ViolatedAssumptionAnswer());
      Paint paint0 = mock(Paint.class, new ViolatedAssumptionAnswer());
      Stroke stroke0 = mock(Stroke.class, new ViolatedAssumptionAnswer());
      CategoryMarker categoryMarker0 = new CategoryMarker(comparable0, paint0, stroke0, paint0, stroke0, 0.9F);
      categoryMarker0.setKey("}2F+]jxhKB'+~~K");
      assertFalse(categoryMarker0.getDrawAsLine());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      CategoryMarker categoryMarker0 = new CategoryMarker((Comparable) null);
      categoryMarker0.getKey();
      assertFalse(categoryMarker0.getDrawAsLine());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      CategoryMarker categoryMarker0 = new CategoryMarker((Comparable) null);
      boolean boolean0 = categoryMarker0.getDrawAsLine();
      assertFalse(boolean0);
  }
}
