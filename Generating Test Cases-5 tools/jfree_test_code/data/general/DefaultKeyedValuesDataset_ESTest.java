/*
 * This file was automatically generated by EvoSuite
 * Tue May 16 06:54:53 GMT 2023
 */

package org.jfree.data.general;

import org.junit.Test;
import static org.junit.Assert.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jfree.data.general.DefaultKeyedValuesDataset;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class DefaultKeyedValuesDataset_ESTest extends DefaultKeyedValuesDataset_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      DefaultKeyedValuesDataset defaultKeyedValuesDataset0 = new DefaultKeyedValuesDataset();
      assertTrue(defaultKeyedValuesDataset0.getNotify());
  }
}
