/*
 * This file was automatically generated by EvoSuite
 * Tue May 16 06:16:51 GMT 2023
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
import org.jfree.chart.entity.TitleEntity;
import org.jfree.chart.title.Title;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class TitleEntity_ESTest extends TitleEntity_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Shape shape0 = mock(Shape.class, new ViolatedAssumptionAnswer());
      TitleEntity titleEntity0 = null;
      try {
        titleEntity0 = new TitleEntity(shape0, (Title) null, "", "rzq >v");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'title' argument.
         //
         verifyException("org.jfree.chart.util.Args", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Shape shape0 = mock(Shape.class, new ViolatedAssumptionAnswer());
      TitleEntity titleEntity0 = null;
      try {
        titleEntity0 = new TitleEntity(shape0, (Title) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'title' argument.
         //
         verifyException("org.jfree.chart.util.Args", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Shape shape0 = mock(Shape.class, new ViolatedAssumptionAnswer());
      Title title0 = mock(Title.class, new ViolatedAssumptionAnswer());
      TitleEntity titleEntity0 = new TitleEntity(shape0, title0, "");
      assertEquals("", titleEntity0.getToolTipText());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Shape shape0 = mock(Shape.class, new ViolatedAssumptionAnswer());
      Title title0 = mock(Title.class, new ViolatedAssumptionAnswer());
      TitleEntity titleEntity0 = new TitleEntity(shape0, title0, "GmY*ibi+", "G&N+_`] +$q2F\"F7fe");
      Object object0 = titleEntity0.clone();
      assertTrue(object0.equals((Object)titleEntity0));
      
      titleEntity0.setURLText("GmY*ibi+");
      boolean boolean0 = titleEntity0.equals(object0);
      assertFalse(object0.equals((Object)titleEntity0));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Shape shape0 = mock(Shape.class, new ViolatedAssumptionAnswer());
      Title title0 = mock(Title.class, new ViolatedAssumptionAnswer());
      TitleEntity titleEntity0 = new TitleEntity(shape0, title0);
      Object object0 = titleEntity0.clone();
      assertTrue(object0.equals((Object)titleEntity0));
      
      titleEntity0.setToolTipText("$B[Hjv");
      boolean boolean0 = titleEntity0.equals(object0);
      assertFalse(object0.equals((Object)titleEntity0));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Shape shape0 = mock(Shape.class, new ViolatedAssumptionAnswer());
      Title title0 = mock(Title.class, new ViolatedAssumptionAnswer());
      TitleEntity titleEntity0 = new TitleEntity(shape0, title0);
      Object object0 = titleEntity0.clone();
      Shape shape1 = mock(Shape.class, new ViolatedAssumptionAnswer());
      titleEntity0.setArea(shape1);
      boolean boolean0 = titleEntity0.equals(object0);
      assertFalse(object0.equals((Object)titleEntity0));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Shape shape0 = mock(Shape.class, new ViolatedAssumptionAnswer());
      Title title0 = mock(Title.class, new ViolatedAssumptionAnswer());
      TitleEntity titleEntity0 = new TitleEntity(shape0, title0, "GmY*ibi+", "G&N+_`] +$q2F\"F7fe");
      boolean boolean0 = titleEntity0.equals(titleEntity0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Shape shape0 = mock(Shape.class, new ViolatedAssumptionAnswer());
      Title title0 = mock(Title.class, new ViolatedAssumptionAnswer());
      TitleEntity titleEntity0 = new TitleEntity(shape0, title0, "GmY*ibi+", "G&N+_`] +$q2F\"F7fe");
      boolean boolean0 = titleEntity0.equals("G&N+_`] +$q2F\"F7fe");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Shape shape0 = mock(Shape.class, new ViolatedAssumptionAnswer());
      Title title0 = mock(Title.class, new ViolatedAssumptionAnswer());
      TitleEntity titleEntity0 = new TitleEntity(shape0, title0, "GmY*ibi+", "G&N+_`] +$q2F\"F7fe");
      Object object0 = titleEntity0.clone();
      boolean boolean0 = titleEntity0.equals(object0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Shape shape0 = mock(Shape.class, new ViolatedAssumptionAnswer());
      Title title0 = mock(Title.class, new ViolatedAssumptionAnswer());
      TitleEntity titleEntity0 = new TitleEntity(shape0, title0, "GmY*ibi+", "G&N+_`] +$q2F\"F7fe");
      String string0 = titleEntity0.toString();
      assertEquals("TitleEntity: tooltip = GmY*ibi+", string0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Shape shape0 = mock(Shape.class, new ViolatedAssumptionAnswer());
      Title title0 = mock(Title.class, new ViolatedAssumptionAnswer());
      TitleEntity titleEntity0 = new TitleEntity(shape0, title0);
      titleEntity0.hashCode();
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Shape shape0 = mock(Shape.class, new ViolatedAssumptionAnswer());
      Title title0 = mock(Title.class, new ViolatedAssumptionAnswer());
      doReturn("Require '").when(title0).toString();
      TitleEntity titleEntity0 = new TitleEntity(shape0, title0);
      Title title1 = titleEntity0.getTitle();
      assertFalse(title1.visible);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Shape shape0 = mock(Shape.class, new ViolatedAssumptionAnswer());
      TitleEntity titleEntity0 = null;
      try {
        titleEntity0 = new TitleEntity(shape0, (Title) null, "TitleEntity: ");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'title' argument.
         //
         verifyException("org.jfree.chart.util.Args", e);
      }
  }
}
