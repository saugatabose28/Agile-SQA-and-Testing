/*
 * This file was automatically generated by EvoSuite
 * Tue May 16 05:07:49 GMT 2023
 */

package org.jfree.chart.labels;

import org.junit.Test;
import static org.junit.Assert.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jfree.chart.labels.ItemLabelAnchor;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ItemLabelAnchor_ESTest extends ItemLabelAnchor_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ItemLabelAnchor itemLabelAnchor0 = ItemLabelAnchor.INSIDE2;
      ItemLabelAnchor itemLabelAnchor1 = ItemLabelAnchor.OUTSIDE5;
      boolean boolean0 = itemLabelAnchor0.equals(itemLabelAnchor1);
      assertFalse(boolean0);
      assertFalse(itemLabelAnchor1.equals((Object)itemLabelAnchor0));
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ItemLabelAnchor itemLabelAnchor0 = ItemLabelAnchor.OUTSIDE6;
      String string0 = itemLabelAnchor0.toString();
      assertEquals("ItemLabelAnchor.OUTSIDE6", string0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      ItemLabelAnchor itemLabelAnchor0 = ItemLabelAnchor.OUTSIDE6;
      boolean boolean0 = itemLabelAnchor0.equals("ItemLabelAnchor.OUTSIDE6");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      ItemLabelAnchor itemLabelAnchor0 = ItemLabelAnchor.OUTSIDE6;
      boolean boolean0 = itemLabelAnchor0.equals(itemLabelAnchor0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      ItemLabelAnchor itemLabelAnchor0 = ItemLabelAnchor.INSIDE8;
      ItemLabelAnchor itemLabelAnchor1 = ItemLabelAnchor.INSIDE9;
      boolean boolean0 = itemLabelAnchor1.equals(itemLabelAnchor0);
      assertFalse(boolean0);
      assertFalse(itemLabelAnchor0.equals((Object)itemLabelAnchor1));
  }
}
