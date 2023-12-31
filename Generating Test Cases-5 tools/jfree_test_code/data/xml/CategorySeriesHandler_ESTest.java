/*
 * This file was automatically generated by EvoSuite
 * Tue May 16 05:31:19 GMT 2023
 */

package org.jfree.data.xml;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.EmptyStackException;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.jfree.data.xml.CategoryDatasetHandler;
import org.jfree.data.xml.CategorySeriesHandler;
import org.jfree.data.xml.RootHandler;
import org.junit.runner.RunWith;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.AttributesImpl;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class CategorySeriesHandler_ESTest extends CategorySeriesHandler_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      RootHandler rootHandler0 = mock(RootHandler.class, new ViolatedAssumptionAnswer());
      CategorySeriesHandler categorySeriesHandler0 = new CategorySeriesHandler(rootHandler0);
      Attributes attributes0 = mock(Attributes.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        categorySeriesHandler0.startElement("!b5QiNLO<@n5", "!b5QiNLO<@n5", (String) null, attributes0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      RootHandler rootHandler0 = mock(RootHandler.class, new ViolatedAssumptionAnswer());
      CategorySeriesHandler categorySeriesHandler0 = new CategorySeriesHandler(rootHandler0);
      // Undeclared exception!
      try { 
        categorySeriesHandler0.addItem((Comparable) null, (Number) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'key' argument.
         //
         verifyException("org.jfree.chart.util.Args", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      CategoryDatasetHandler categoryDatasetHandler0 = new CategoryDatasetHandler();
      CategorySeriesHandler categorySeriesHandler0 = new CategorySeriesHandler(categoryDatasetHandler0);
      // Undeclared exception!
      try { 
        categorySeriesHandler0.endElement("org.jfree.data.category.DefaultCategoryDataset", "~~U5ebmu*w~+QD2Q", "~~U5ebmu*w~+QD2Q");
        fail("Expecting exception: EmptyStackException");
      
      } catch(EmptyStackException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.Stack", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      RootHandler rootHandler0 = mock(RootHandler.class, new ViolatedAssumptionAnswer());
      CategorySeriesHandler categorySeriesHandler0 = new CategorySeriesHandler(rootHandler0);
      categorySeriesHandler0.endElement("", ">Z7(4Q", "org.jfree.data.xml.RootHandler");
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      RootHandler rootHandler0 = mock(RootHandler.class, new ViolatedAssumptionAnswer());
      CategorySeriesHandler categorySeriesHandler0 = new CategorySeriesHandler(rootHandler0);
      Attributes attributes0 = mock(Attributes.class, new ViolatedAssumptionAnswer());
      categorySeriesHandler0.startElement("}|", "P*..#w5fBE)X", "Item", attributes0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      RootHandler rootHandler0 = mock(RootHandler.class, new ViolatedAssumptionAnswer());
      CategorySeriesHandler categorySeriesHandler0 = new CategorySeriesHandler(rootHandler0);
      Attributes attributes0 = mock(Attributes.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(attributes0).getValue(anyString());
      categorySeriesHandler0.startElement("", "", "Series", attributes0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      RootHandler rootHandler0 = mock(RootHandler.class, new ViolatedAssumptionAnswer());
      CategorySeriesHandler categorySeriesHandler0 = new CategorySeriesHandler(rootHandler0);
      AttributesImpl attributesImpl0 = new AttributesImpl();
      try { 
        categorySeriesHandler0.startElement((String) null, "", "fGslhH", attributesImpl0);
        fail("Expecting exception: SAXException");
      
      } catch(SAXException e) {
         //
         // Expecting <Series> or <Item> tag...found fGslhH
         //
         verifyException("org.jfree.data.xml.CategorySeriesHandler", e);
      }
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      CategoryDatasetHandler categoryDatasetHandler0 = new CategoryDatasetHandler();
      CategorySeriesHandler categorySeriesHandler0 = new CategorySeriesHandler(categoryDatasetHandler0);
      Comparable<Object> comparable0 = (Comparable<Object>) mock(Comparable.class, new ViolatedAssumptionAnswer());
      Double double0 = Double.valueOf(0.0);
      categorySeriesHandler0.addItem(comparable0, double0);
      // Undeclared exception!
      try { 
        categorySeriesHandler0.endElement("org.jfree.data.category.DefaultCategoryDataset", "~~U5ebmu*w~+QD2Q", "~~U5ebmu*w~+QD2Q");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.data.xml.CategoryDatasetHandler", e);
      }
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      RootHandler rootHandler0 = mock(RootHandler.class, new ViolatedAssumptionAnswer());
      CategorySeriesHandler categorySeriesHandler0 = new CategorySeriesHandler(rootHandler0);
      Comparable<Object> comparable0 = (Comparable<Object>) mock(Comparable.class, new ViolatedAssumptionAnswer());
      categorySeriesHandler0.setSeriesKey(comparable0);
  }
}
