/*
 * This file was automatically generated by EvoSuite
 * Tue May 16 05:17:39 GMT 2023
 */

package org.jfree.data.json;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.Writer;
import java.util.List;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.jfree.data.KeyedValues;
import org.jfree.data.KeyedValues2D;
import org.jfree.data.json.JSONUtils;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class JSONUtils_ESTest extends JSONUtils_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      KeyedValues2D keyedValues2D0 = mock(KeyedValues2D.class, new ViolatedAssumptionAnswer());
      doReturn((List) null).when(keyedValues2D0).getColumnKeys();
      doReturn((List) null).when(keyedValues2D0).getRowKeys();
      // Undeclared exception!
      try { 
        JSONUtils.writeKeyedValues2D(keyedValues2D0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      KeyedValues<String> keyedValues0 = (KeyedValues<String>) mock(KeyedValues.class, new ViolatedAssumptionAnswer());
      doReturn((List<String>) null).when(keyedValues0).getKeys();
      Writer writer0 = mock(Writer.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        JSONUtils.writeKeyedValues(keyedValues0, writer0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.data.json.JSONUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      JSONUtils jSONUtils0 = new JSONUtils();
      KeyedValues2D keyedValues2D0 = mock(KeyedValues2D.class, new ViolatedAssumptionAnswer());
      doReturn((List) null).when(keyedValues2D0).getColumnKeys();
      doReturn((List) null).when(keyedValues2D0).getRowKeys();
      Writer writer0 = mock(Writer.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        JSONUtils.writeKeyedValues2D(keyedValues2D0, writer0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      List<String> list0 = null;
      KeyedValues<String> keyedValues0 = (KeyedValues<String>) mock(KeyedValues.class, new ViolatedAssumptionAnswer());
      doReturn((List<String>) null).when(keyedValues0).getKeys();
      // Undeclared exception!
      try { 
        JSONUtils.writeKeyedValues(keyedValues0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.data.json.JSONUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      KeyedValues2D keyedValues2D0 = mock(KeyedValues2D.class, new ViolatedAssumptionAnswer());
      doReturn((List) null).when(keyedValues2D0).getColumnKeys();
      doReturn((List) null).when(keyedValues2D0).getRowKeys();
      // Undeclared exception!
      try { 
        JSONUtils.writeKeyedValues2D(keyedValues2D0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      KeyedValues2D keyedValues2D0 = mock(KeyedValues2D.class, new ViolatedAssumptionAnswer());
      doReturn((List) null).when(keyedValues2D0).getColumnKeys();
      doReturn((List) null).when(keyedValues2D0).getRowKeys();
      // Undeclared exception!
      try { 
        JSONUtils.writeKeyedValues2D(keyedValues2D0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      JSONUtils jSONUtils0 = new JSONUtils();
      KeyedValues2D keyedValues2D0 = mock(KeyedValues2D.class, new ViolatedAssumptionAnswer());
      doReturn((List) null).when(keyedValues2D0).getColumnKeys();
      doReturn((List) null).when(keyedValues2D0).getRowKeys();
      // Undeclared exception!
      try { 
        JSONUtils.writeKeyedValues2D(keyedValues2D0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      KeyedValues2D keyedValues2D0 = mock(KeyedValues2D.class, new ViolatedAssumptionAnswer());
      doReturn((List) null).when(keyedValues2D0).getColumnKeys();
      doReturn((List) null).when(keyedValues2D0).getRowKeys();
      String string0 = JSONUtils.writeKeyedValues2D(keyedValues2D0);
      assertEquals("{}", string0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      KeyedValues<Integer> keyedValues0 = (KeyedValues<Integer>) mock(KeyedValues.class, new ViolatedAssumptionAnswer());
      doReturn((List) null).when(keyedValues0).getKeys();
      // Undeclared exception!
      try { 
        JSONUtils.writeKeyedValues(keyedValues0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.data.json.JSONUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      KeyedValues<String> keyedValues0 = (KeyedValues<String>) mock(KeyedValues.class, new ViolatedAssumptionAnswer());
      doReturn((List) null).when(keyedValues0).getKeys();
      Writer writer0 = mock(Writer.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        JSONUtils.writeKeyedValues(keyedValues0, writer0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.data.json.JSONUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Writer writer0 = mock(Writer.class, new ViolatedAssumptionAnswer());
      KeyedValues2D keyedValues2D0 = mock(KeyedValues2D.class, new ViolatedAssumptionAnswer());
      doReturn((List) null).when(keyedValues2D0).getColumnKeys();
      doReturn((List) null).when(keyedValues2D0).getRowKeys();
      // Undeclared exception!
      try { 
        JSONUtils.writeKeyedValues2D(keyedValues2D0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }
}
