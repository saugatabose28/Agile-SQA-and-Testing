/*
 * This file was automatically generated by EvoSuite
 * Tue May 16 06:46:40 GMT 2023
 */

package org.jfree.chart.block;

import org.junit.Test;
import static org.junit.Assert.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jfree.chart.block.LengthConstraintType;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class LengthConstraintType_ESTest extends LengthConstraintType_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      LengthConstraintType lengthConstraintType0 = LengthConstraintType.FIXED;
      LengthConstraintType lengthConstraintType1 = LengthConstraintType.RANGE;
      boolean boolean0 = lengthConstraintType0.equals(lengthConstraintType1);
      assertFalse(boolean0);
      assertFalse(lengthConstraintType1.equals((Object)lengthConstraintType0));
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      LengthConstraintType lengthConstraintType0 = LengthConstraintType.FIXED;
      String string0 = lengthConstraintType0.toString();
      assertEquals("LengthConstraintType.FIXED", string0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      LengthConstraintType lengthConstraintType0 = LengthConstraintType.FIXED;
      Object object0 = new Object();
      boolean boolean0 = lengthConstraintType0.equals(object0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      LengthConstraintType lengthConstraintType0 = LengthConstraintType.FIXED;
      boolean boolean0 = lengthConstraintType0.equals(lengthConstraintType0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      LengthConstraintType lengthConstraintType0 = LengthConstraintType.RANGE;
      lengthConstraintType0.hashCode();
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      LengthConstraintType lengthConstraintType0 = LengthConstraintType.FIXED;
      LengthConstraintType lengthConstraintType1 = LengthConstraintType.NONE;
      boolean boolean0 = lengthConstraintType0.equals(lengthConstraintType1);
      assertFalse(boolean0);
      assertFalse(lengthConstraintType1.equals((Object)lengthConstraintType0));
  }
}
