/*
 * This file was automatically generated by EvoSuite
 * Tue May 16 05:53:29 GMT 2023
 */

package org.jfree.data.xml;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.EmptyStackException;
import java.util.Stack;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jfree.data.xml.RootHandler;
import org.junit.runner.RunWith;
import org.xml.sax.helpers.DefaultHandler;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class RootHandler_ESTest extends RootHandler_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      RootHandler rootHandler0 = new RootHandler();
      assertNotNull(rootHandler0);
      
      DefaultHandler defaultHandler0 = new DefaultHandler();
      assertNotNull(defaultHandler0);
      
      rootHandler0.pushSubHandler(defaultHandler0);
      char[] charArray0 = new char[3];
      rootHandler0.characters(charArray0, (-1), 1323);
      assertArrayEquals(new char[] {'\u0000', '\u0000', '\u0000'}, charArray0);
      assertEquals(3, charArray0.length);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      RootHandler rootHandler0 = new RootHandler();
      assertNotNull(rootHandler0);
      
      rootHandler0.pushSubHandler(rootHandler0);
      Stack stack0 = rootHandler0.getSubHandlers();
      assertEquals(10, stack0.capacity());
      assertFalse(stack0.empty());
      assertFalse(stack0.isEmpty());
      assertEquals(1, stack0.size());
      assertNotNull(stack0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      DefaultHandler defaultHandler0 = new DefaultHandler();
      assertNotNull(defaultHandler0);
      
      // Undeclared exception!
      try { 
        ((RootHandler) defaultHandler0).getSubHandlers();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      DefaultHandler defaultHandler0 = new DefaultHandler();
      assertNotNull(defaultHandler0);
      
      // Undeclared exception!
      try { 
        ((RootHandler) defaultHandler0).getCurrentHandler();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      DefaultHandler defaultHandler0 = new DefaultHandler();
      assertNotNull(defaultHandler0);
      
      // Undeclared exception!
      try { 
        defaultHandler0.characters((char[]) null, 0, 0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      RootHandler rootHandler0 = new RootHandler();
      assertNotNull(rootHandler0);
      
      rootHandler0.pushSubHandler((DefaultHandler) null);
      rootHandler0.pushSubHandler(rootHandler0);
      DefaultHandler defaultHandler0 = rootHandler0.popSubHandler();
      assertSame(rootHandler0, defaultHandler0);
      assertSame(defaultHandler0, rootHandler0);
      assertNotNull(defaultHandler0);
      
      DefaultHandler defaultHandler1 = rootHandler0.getCurrentHandler();
      assertSame(rootHandler0, defaultHandler0);
      assertSame(rootHandler0, defaultHandler1);
      assertSame(defaultHandler1, rootHandler0);
      assertSame(defaultHandler1, defaultHandler0);
      assertNotNull(defaultHandler1);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      RootHandler rootHandler0 = new RootHandler();
      assertNotNull(rootHandler0);
      
      DefaultHandler defaultHandler0 = rootHandler0.getCurrentHandler();
      assertSame(rootHandler0, defaultHandler0);
      assertSame(defaultHandler0, rootHandler0);
      assertNotNull(defaultHandler0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      RootHandler rootHandler0 = new RootHandler();
      rootHandler0.pushSubHandler((DefaultHandler) null);
      rootHandler0.characters((char[]) null, (-3046), (-3046));
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      RootHandler rootHandler0 = new RootHandler();
      DefaultHandler defaultHandler0 = new DefaultHandler();
      rootHandler0.pushSubHandler(defaultHandler0);
      rootHandler0.pushSubHandler((DefaultHandler) null);
      rootHandler0.popSubHandler();
      rootHandler0.characters((char[]) null, (-3046), (-3046));
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      RootHandler rootHandler0 = new RootHandler();
      Stack stack0 = rootHandler0.getSubHandlers();
      assertEquals("[]", stack0.toString());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      RootHandler rootHandler0 = new RootHandler();
      // Undeclared exception!
      try { 
        rootHandler0.popSubHandler();
        fail("Expecting exception: EmptyStackException");
      
      } catch(EmptyStackException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.Stack", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      RootHandler rootHandler0 = new RootHandler();
      rootHandler0.pushSubHandler(rootHandler0);
      DefaultHandler defaultHandler0 = rootHandler0.getCurrentHandler();
      assertSame(rootHandler0, defaultHandler0);
  }
}
