/*
 * This file was automatically generated by EvoSuite
 * Tue May 16 06:39:47 GMT 2023
 */

package org.jfree.data;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jfree.data.KeyedValues2DItemKey;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class KeyedValues2DItemKey_ESTest extends KeyedValues2DItemKey_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Integer integer0 = new Integer(372);
      KeyedValues2DItemKey<String, Integer> keyedValues2DItemKey0 = null;
      try {
        keyedValues2DItemKey0 = new KeyedValues2DItemKey<String, Integer>((String) null, integer0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'rowKey' argument.
         //
         verifyException("org.jfree.chart.util.Args", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Integer integer0 = new Integer(372);
      KeyedValues2DItemKey<Integer, String> keyedValues2DItemKey0 = new KeyedValues2DItemKey<Integer, String>(integer0, "");
      boolean boolean0 = keyedValues2DItemKey0.equals("");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Integer integer0 = new Integer(372);
      KeyedValues2DItemKey<Integer, String> keyedValues2DItemKey0 = new KeyedValues2DItemKey<Integer, String>(integer0, "");
      int int0 = keyedValues2DItemKey0.compareTo(keyedValues2DItemKey0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      KeyedValues2DItemKey<String, String> keyedValues2DItemKey0 = new KeyedValues2DItemKey<String, String>("", "YH>+C'n^#d4*");
      KeyedValues2DItemKey<String, String> keyedValues2DItemKey1 = new KeyedValues2DItemKey<String, String>("&59J)G", "YH>+C'n^#d4*");
      int int0 = keyedValues2DItemKey0.compareTo(keyedValues2DItemKey1);
      assertEquals((-6), int0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      KeyedValues2DItemKey<String, String> keyedValues2DItemKey0 = new KeyedValues2DItemKey<String, String>("", "YH>+C'n^#d4*");
      keyedValues2DItemKey0.hashCode();
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      KeyedValues2DItemKey<String, String> keyedValues2DItemKey0 = new KeyedValues2DItemKey<String, String>("", "YH>+C'n^#d4*");
      String string0 = keyedValues2DItemKey0.toJSONString();
      assertNotNull(string0);
  }
}
