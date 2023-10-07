/*
 * This file was automatically generated by EvoSuite
 * Tue May 16 05:58:11 GMT 2023
 */

package org.jfree.chart.imagemap;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jfree.chart.imagemap.DynamicDriveToolTipTagFragmentGenerator;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class DynamicDriveToolTipTagFragmentGenerator_ESTest extends DynamicDriveToolTipTagFragmentGenerator_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      DynamicDriveToolTipTagFragmentGenerator dynamicDriveToolTipTagFragmentGenerator0 = new DynamicDriveToolTipTagFragmentGenerator((String) null, 0);
      // Undeclared exception!
      try { 
        dynamicDriveToolTipTagFragmentGenerator0.generateToolTipFragment((String) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'input' argument.
         //
         verifyException("org.jfree.chart.util.Args", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      DynamicDriveToolTipTagFragmentGenerator dynamicDriveToolTipTagFragmentGenerator0 = new DynamicDriveToolTipTagFragmentGenerator();
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      DynamicDriveToolTipTagFragmentGenerator dynamicDriveToolTipTagFragmentGenerator0 = new DynamicDriveToolTipTagFragmentGenerator("CGi", 0);
      String string0 = dynamicDriveToolTipTagFragmentGenerator0.generateToolTipFragment("CGi");
      assertEquals(" onMouseOver=\"return stm(['CGi','CGi'],Style[0]);\" onMouseOut=\"return htm();\"", string0);
  }
}
