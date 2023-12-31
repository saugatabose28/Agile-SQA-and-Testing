/*
 * This file was automatically generated by EvoSuite
 * Tue May 16 06:53:31 GMT 2023
 */

package org.jfree.data;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.jfree.data.KeyedObject;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class KeyedObject_ESTest extends KeyedObject_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      KeyedObject keyedObject0 = new KeyedObject((Comparable) null, (Object) null);
      Object object0 = keyedObject0.getObject();
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      KeyedObject keyedObject0 = new KeyedObject((Comparable) null, (Object) null);
      Comparable comparable0 = keyedObject0.getKey();
      assertNull(comparable0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Comparable<KeyedObject> comparable0 = (Comparable<KeyedObject>) mock(Comparable.class, new ViolatedAssumptionAnswer());
      KeyedObject keyedObject0 = new KeyedObject(comparable0, "z|ZXt(gvT]a8");
      boolean boolean0 = keyedObject0.equals((Object) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Comparable<KeyedObject> comparable0 = (Comparable<KeyedObject>) mock(Comparable.class, new ViolatedAssumptionAnswer());
      KeyedObject keyedObject0 = new KeyedObject(comparable0, "z|ZXt(gvT]a8");
      KeyedObject keyedObject1 = new KeyedObject("z|ZXt(gvT]a8", "st{+}*>j");
      boolean boolean0 = keyedObject0.equals(keyedObject1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Comparable<KeyedObject> comparable0 = (Comparable<KeyedObject>) mock(Comparable.class, new ViolatedAssumptionAnswer());
      KeyedObject keyedObject0 = new KeyedObject(comparable0, "z|ZXt(gvT]a8");
      boolean boolean0 = keyedObject0.equals(keyedObject0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Comparable<KeyedObject> comparable0 = (Comparable<KeyedObject>) mock(Comparable.class, new ViolatedAssumptionAnswer());
      KeyedObject keyedObject0 = new KeyedObject(comparable0, "z|ZXt(gvT]a8");
      KeyedObject keyedObject1 = new KeyedObject(comparable0, keyedObject0);
      boolean boolean0 = keyedObject1.equals(keyedObject0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Comparable<KeyedObject> comparable0 = (Comparable<KeyedObject>) mock(Comparable.class, new ViolatedAssumptionAnswer());
      KeyedObject keyedObject0 = new KeyedObject(comparable0, "z|ZXt(gvT]a8");
      KeyedObject keyedObject1 = new KeyedObject(comparable0, keyedObject0);
      Object object0 = keyedObject1.clone();
      assertNotSame(object0, keyedObject1);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Comparable<KeyedObject> comparable0 = (Comparable<KeyedObject>) mock(Comparable.class, new ViolatedAssumptionAnswer());
      KeyedObject keyedObject0 = new KeyedObject(comparable0, "z|ZXt(gvT]a8");
      Object object0 = keyedObject0.clone();
      boolean boolean0 = keyedObject0.equals(object0);
      assertNotSame(object0, keyedObject0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Comparable<KeyedObject> comparable0 = (Comparable<KeyedObject>) mock(Comparable.class, new ViolatedAssumptionAnswer());
      KeyedObject keyedObject0 = new KeyedObject(comparable0, "z|ZXt(gvT]a8");
      keyedObject0.setObject(keyedObject0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Comparable<KeyedObject> comparable0 = (Comparable<KeyedObject>) mock(Comparable.class, new ViolatedAssumptionAnswer());
      KeyedObject keyedObject0 = new KeyedObject(comparable0, "z|ZXt(gvT]a8");
      Object object0 = keyedObject0.getObject();
      assertEquals("z|ZXt(gvT]a8", object0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Comparable<KeyedObject> comparable0 = (Comparable<KeyedObject>) mock(Comparable.class, new ViolatedAssumptionAnswer());
      doReturn("").when(comparable0).toString();
      KeyedObject keyedObject0 = new KeyedObject(comparable0, "z|ZXt(gvT]a8");
      Comparable comparable1 = keyedObject0.getKey();
      assertNotNull(comparable1);
  }
}
