/*
 * This file was automatically generated by EvoSuite
 * Tue May 16 05:17:20 GMT 2023
 */

package org.jfree.data.xml;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.jfree.data.xml.ItemHandler;
import org.jfree.data.xml.RootHandler;
import org.jfree.data.xml.ValueHandler;
import org.junit.runner.RunWith;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ValueHandler_ESTest extends ValueHandler_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      RootHandler rootHandler0 = mock(RootHandler.class, new ViolatedAssumptionAnswer());
      ItemHandler itemHandler0 = mock(ItemHandler.class, new ViolatedAssumptionAnswer());
      ValueHandler valueHandler0 = new ValueHandler(rootHandler0, itemHandler0);
      Attributes attributes0 = mock(Attributes.class, new ViolatedAssumptionAnswer());
      try { 
        valueHandler0.startElement("Value", "Value", "l]Uk", attributes0);
        fail("Expecting exception: SAXException");
      
      } catch(SAXException e) {
         //
         // Expecting <Value> but found l]Uk
         //
         verifyException("org.jfree.data.xml.ValueHandler", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      RootHandler rootHandler0 = mock(RootHandler.class, new ViolatedAssumptionAnswer());
      ItemHandler itemHandler0 = mock(ItemHandler.class, new ViolatedAssumptionAnswer());
      ValueHandler valueHandler0 = new ValueHandler(rootHandler0, itemHandler0);
      char[] charArray0 = new char[6];
      valueHandler0.characters(charArray0, 0, 1);
      String string0 = valueHandler0.getCurrentText();
      assertEquals("\u0000", string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      RootHandler rootHandler0 = mock(RootHandler.class, new ViolatedAssumptionAnswer());
      ItemHandler itemHandler0 = mock(ItemHandler.class, new ViolatedAssumptionAnswer());
      ValueHandler valueHandler0 = new ValueHandler(rootHandler0, itemHandler0);
      Attributes attributes0 = mock(Attributes.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        valueHandler0.startElement("org.jfree.data.xml.KeyHandler", "org.jfree.data.xml.KeyHandler", (String) null, attributes0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      RootHandler rootHandler0 = mock(RootHandler.class, new ViolatedAssumptionAnswer());
      ItemHandler itemHandler0 = mock(ItemHandler.class, new ViolatedAssumptionAnswer());
      ValueHandler valueHandler0 = new ValueHandler(rootHandler0, itemHandler0);
      // Undeclared exception!
      try { 
        valueHandler0.endElement((String) null, (String) null, (String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      RootHandler rootHandler0 = mock(RootHandler.class, new ViolatedAssumptionAnswer());
      ItemHandler itemHandler0 = mock(ItemHandler.class, new ViolatedAssumptionAnswer());
      ValueHandler valueHandler0 = new ValueHandler(rootHandler0, itemHandler0);
      // Undeclared exception!
      try { 
        valueHandler0.characters((char[]) null, 214, 214);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      RootHandler rootHandler0 = mock(RootHandler.class, new ViolatedAssumptionAnswer());
      ItemHandler itemHandler0 = mock(ItemHandler.class, new ViolatedAssumptionAnswer());
      ValueHandler valueHandler0 = new ValueHandler(rootHandler0, itemHandler0);
      char[] charArray0 = new char[1];
      // Undeclared exception!
      try { 
        valueHandler0.characters(charArray0, 428, 428);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      RootHandler rootHandler0 = mock(RootHandler.class, new ViolatedAssumptionAnswer());
      doReturn((DefaultHandler) null).when(rootHandler0).popSubHandler();
      ItemHandler itemHandler0 = mock(ItemHandler.class, new ViolatedAssumptionAnswer());
      ValueHandler valueHandler0 = new ValueHandler(rootHandler0, itemHandler0);
      valueHandler0.endElement("Value", "", "Value");
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      RootHandler rootHandler0 = mock(RootHandler.class, new ViolatedAssumptionAnswer());
      ItemHandler itemHandler0 = mock(ItemHandler.class, new ViolatedAssumptionAnswer());
      ValueHandler valueHandler0 = new ValueHandler(rootHandler0, itemHandler0);
      try { 
        valueHandler0.endElement("", "v<m8JjXc6/}7rKa", "");
        fail("Expecting exception: SAXException");
      
      } catch(SAXException e) {
         //
         // Expecting </Value> but found 
         //
         verifyException("org.jfree.data.xml.ValueHandler", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      RootHandler rootHandler0 = mock(RootHandler.class, new ViolatedAssumptionAnswer());
      ItemHandler itemHandler0 = mock(ItemHandler.class, new ViolatedAssumptionAnswer());
      ValueHandler valueHandler0 = new ValueHandler(rootHandler0, itemHandler0);
      Attributes attributes0 = mock(Attributes.class, new ViolatedAssumptionAnswer());
      valueHandler0.startElement("Value", "Value", "Value", attributes0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      RootHandler rootHandler0 = mock(RootHandler.class, new ViolatedAssumptionAnswer());
      ItemHandler itemHandler0 = mock(ItemHandler.class, new ViolatedAssumptionAnswer());
      ValueHandler valueHandler0 = new ValueHandler(rootHandler0, itemHandler0);
      valueHandler0.clearCurrentText();
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      RootHandler rootHandler0 = mock(RootHandler.class, new ViolatedAssumptionAnswer());
      ItemHandler itemHandler0 = mock(ItemHandler.class, new ViolatedAssumptionAnswer());
      ValueHandler valueHandler0 = new ValueHandler(rootHandler0, itemHandler0);
      String string0 = valueHandler0.getCurrentText();
      assertEquals("", string0);
  }
}
