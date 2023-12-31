/*
 * This file was automatically generated by EvoSuite
 * Tue May 16 05:12:22 GMT 2023
 */

package org.jfree.chart.util;

import org.junit.Test;
import static org.junit.Assert.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jfree.chart.util.UnitType;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class UnitType_ESTest extends UnitType_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      UnitType[] unitTypeArray0 = UnitType.values();
      assertEquals(2, unitTypeArray0.length);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      UnitType unitType0 = UnitType.valueOf("ABSOLUTE");
      assertEquals(UnitType.ABSOLUTE, unitType0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      UnitType unitType0 = UnitType.RELATIVE;
      String string0 = unitType0.toString();
      assertEquals("UnitType.RELATIVE", string0);
  }
}
