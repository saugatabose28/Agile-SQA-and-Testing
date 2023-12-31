/*
 * This file was automatically generated by EvoSuite
 * Tue May 16 06:30:24 GMT 2023
 */

package org.jfree.chart.ui;

import org.junit.Test;
import static org.junit.Assert.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jfree.chart.ui.HorizontalAlignment;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class HorizontalAlignment_ESTest extends HorizontalAlignment_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      HorizontalAlignment horizontalAlignment0 = HorizontalAlignment.CENTER;
      HorizontalAlignment horizontalAlignment1 = HorizontalAlignment.LEFT;
      boolean boolean0 = horizontalAlignment1.equals(horizontalAlignment0);
      assertFalse(horizontalAlignment0.equals((Object)horizontalAlignment1));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      HorizontalAlignment horizontalAlignment0 = HorizontalAlignment.CENTER;
      boolean boolean0 = horizontalAlignment0.equals("HorizontalAlignment.LEFT");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      HorizontalAlignment horizontalAlignment0 = HorizontalAlignment.LEFT;
      boolean boolean0 = horizontalAlignment0.equals(horizontalAlignment0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      HorizontalAlignment horizontalAlignment0 = HorizontalAlignment.CENTER;
      HorizontalAlignment horizontalAlignment1 = HorizontalAlignment.LEFT;
      boolean boolean0 = horizontalAlignment0.equals(horizontalAlignment1);
      assertFalse(boolean0);
      assertFalse(horizontalAlignment1.equals((Object)horizontalAlignment0));
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      HorizontalAlignment horizontalAlignment0 = HorizontalAlignment.CENTER;
      String string0 = horizontalAlignment0.toString();
      assertEquals("HorizontalAlignment.CENTER", string0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      HorizontalAlignment horizontalAlignment0 = HorizontalAlignment.LEFT;
      horizontalAlignment0.hashCode();
  }
}
