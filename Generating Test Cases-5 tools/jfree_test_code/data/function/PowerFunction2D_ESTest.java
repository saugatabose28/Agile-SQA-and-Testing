/*
 * This file was automatically generated by EvoSuite
 * Tue May 16 06:26:49 GMT 2023
 */

package org.jfree.data.function;

import org.junit.Test;
import static org.junit.Assert.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jfree.data.function.PowerFunction2D;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class PowerFunction2D_ESTest extends PowerFunction2D_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      PowerFunction2D powerFunction2D0 = new PowerFunction2D(1.0, 1.0);
      PowerFunction2D powerFunction2D1 = new PowerFunction2D(1.0, 0.0);
      boolean boolean0 = powerFunction2D0.equals(powerFunction2D1);
      assertFalse(boolean0);
      assertEquals(1.0, powerFunction2D1.getA(), 0.01);
      assertEquals(1.0, powerFunction2D0.getB(), 0.01);
      assertFalse(powerFunction2D1.equals((Object)powerFunction2D0));
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      PowerFunction2D powerFunction2D0 = new PowerFunction2D((-1265.0), (-1265.0));
      PowerFunction2D powerFunction2D1 = new PowerFunction2D((-1.0), (-1265.0));
      boolean boolean0 = powerFunction2D0.equals(powerFunction2D1);
      assertEquals((-1265.0), powerFunction2D1.getB(), 0.01);
      assertEquals((-1.0), powerFunction2D1.getA(), 0.01);
      assertFalse(boolean0);
      assertFalse(powerFunction2D1.equals((Object)powerFunction2D0));
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      PowerFunction2D powerFunction2D0 = new PowerFunction2D(0.0, 0.0);
      double double0 = powerFunction2D0.getValue((-2952.7268971503713));
      assertEquals(0.0, double0, 0.01);
      assertEquals(0.0, powerFunction2D0.getB(), 0.01);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      PowerFunction2D powerFunction2D0 = new PowerFunction2D(1.0, 1.0);
      double double0 = powerFunction2D0.getValue(1.0);
      assertEquals(1.0, powerFunction2D0.getB(), 0.01);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      PowerFunction2D powerFunction2D0 = new PowerFunction2D(0.0, 0.0);
      double double0 = powerFunction2D0.getB();
      assertEquals(0.0, powerFunction2D0.getA(), 0.01);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      PowerFunction2D powerFunction2D0 = new PowerFunction2D(1.0, 1.0);
      double double0 = powerFunction2D0.getB();
      assertEquals(1.0, powerFunction2D0.getA(), 0.01);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      PowerFunction2D powerFunction2D0 = new PowerFunction2D(0.0, (-1848.94));
      double double0 = powerFunction2D0.getA();
      assertEquals(0.0, double0, 0.01);
      assertEquals((-1848.94), powerFunction2D0.getB(), 0.01);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      PowerFunction2D powerFunction2D0 = new PowerFunction2D(1.0, 1.0);
      double double0 = powerFunction2D0.getA();
      assertEquals(1.0, double0, 0.01);
      assertEquals(1.0, powerFunction2D0.getB(), 0.01);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      PowerFunction2D powerFunction2D0 = new PowerFunction2D(0.0, (-1848.94));
      PowerFunction2D powerFunction2D1 = new PowerFunction2D(0.0, 0.0);
      boolean boolean0 = powerFunction2D0.equals(powerFunction2D1);
      assertFalse(powerFunction2D1.equals((Object)powerFunction2D0));
      assertEquals(0.0, powerFunction2D1.getB(), 0.01);
      assertFalse(boolean0);
      assertEquals(0.0, powerFunction2D0.getA(), 0.01);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      PowerFunction2D powerFunction2D0 = new PowerFunction2D(0.0, (-1848.94));
      PowerFunction2D powerFunction2D1 = new PowerFunction2D((-1.0), 0.0);
      boolean boolean0 = powerFunction2D0.equals(powerFunction2D1);
      assertEquals(0.0, powerFunction2D1.getB(), 0.01);
      assertFalse(boolean0);
      assertEquals((-1.0), powerFunction2D1.getA(), 0.01);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      PowerFunction2D powerFunction2D0 = new PowerFunction2D(0.0, (-1848.94));
      boolean boolean0 = powerFunction2D0.equals("ROA>{fE");
      assertEquals((-1848.94), powerFunction2D0.getB(), 0.01);
      assertFalse(boolean0);
      assertEquals(0.0, powerFunction2D0.getA(), 0.01);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      PowerFunction2D powerFunction2D0 = new PowerFunction2D(0.0, (-1848.94));
      boolean boolean0 = powerFunction2D0.equals(powerFunction2D0);
      assertEquals((-1848.94), powerFunction2D0.getB(), 0.01);
      assertTrue(boolean0);
      assertEquals(0.0, powerFunction2D0.getA(), 0.01);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      PowerFunction2D powerFunction2D0 = new PowerFunction2D((-1167.451935453919), (-1167.451935453919));
      double double0 = powerFunction2D0.getB();
      assertEquals((-1167.451935453919), double0, 0.01);
      assertEquals((-1167.451935453919), powerFunction2D0.getA(), 0.01);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      PowerFunction2D powerFunction2D0 = new PowerFunction2D((-1167.451935453919), (-1167.451935453919));
      double double0 = powerFunction2D0.getValue(0.0);
      assertEquals(Double.NEGATIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      PowerFunction2D powerFunction2D0 = new PowerFunction2D((-1167.451935453919), (-1167.451935453919));
      powerFunction2D0.hashCode();
      assertEquals((-1167.451935453919), powerFunction2D0.getA(), 0.01);
      assertEquals((-1167.451935453919), powerFunction2D0.getB(), 0.01);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      PowerFunction2D powerFunction2D0 = new PowerFunction2D((-1167.451935453919), (-1167.451935453919));
      double double0 = powerFunction2D0.getA();
      assertEquals((-1167.451935453919), double0, 0.01);
      assertEquals((-1167.451935453919), powerFunction2D0.getB(), 0.01);
  }
}
