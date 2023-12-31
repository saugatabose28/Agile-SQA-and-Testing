/*
 * This file was automatically generated by EvoSuite
 * Tue May 16 06:21:14 GMT 2023
 */

package org.jfree.chart.urls;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.function.Predicate;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.jfree.chart.urls.CustomXYURLGenerator;
import org.jfree.data.xy.XYDataset;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class CustomXYURLGenerator_ESTest extends CustomXYURLGenerator_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      CustomXYURLGenerator customXYURLGenerator0 = new CustomXYURLGenerator();
      customXYURLGenerator0.getListCount();
      LinkedList<Object> linkedList0 = new LinkedList<Object>();
      linkedList0.add((Object) "The 'data' array must contain two arrays with equal length.");
      customXYURLGenerator0.addURLSeries(linkedList0);
      CustomXYURLGenerator customXYURLGenerator1 = new CustomXYURLGenerator();
      LinkedList<String> linkedList1 = new LinkedList<String>();
      LinkedList<Object> linkedList2 = new LinkedList<Object>();
      linkedList2.add((Object) linkedList1);
      linkedList2.set(0, "G6y");
      customXYURLGenerator1.addURLSeries(linkedList2);
      customXYURLGenerator0.equals(customXYURLGenerator1);
      Object object0 = customXYURLGenerator1.clone();
      customXYURLGenerator1.equals(object0);
      customXYURLGenerator1.addURLSeries(linkedList1);
      customXYURLGenerator1.addURLSeries(linkedList1);
      customXYURLGenerator0.clone();
      customXYURLGenerator0.addURLSeries(linkedList0);
      Integer integer0 = new Integer(0);
      customXYURLGenerator0.equals(integer0);
      customXYURLGenerator0.getURLCount(0);
      customXYURLGenerator1.clone();
      customXYURLGenerator1.getURLCount(0);
      XYDataset xYDataset0 = mock(XYDataset.class, new ViolatedAssumptionAnswer());
      int int0 = (-552);
      // Undeclared exception!
      try { 
        customXYURLGenerator1.generateURL(xYDataset0, 1, (-552));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      CustomXYURLGenerator customXYURLGenerator0 = new CustomXYURLGenerator();
      LinkedList<String> linkedList0 = new LinkedList<String>();
      customXYURLGenerator0.clone();
      linkedList0.add((String) null);
      customXYURLGenerator0.addURLSeries(linkedList0);
      linkedList0.spliterator();
      linkedList0.add("(dYQ@V:o-");
      Predicate<Object> predicate0 = (Predicate<Object>) mock(Predicate.class, new ViolatedAssumptionAnswer());
      doReturn(false, false).when(predicate0).test(any());
      linkedList0.removeIf(predicate0);
      LinkedList<Object> linkedList1 = new LinkedList<Object>();
      linkedList1.add((Object) null);
      customXYURLGenerator0.addURLSeries(linkedList1);
      customXYURLGenerator0.clone();
      customXYURLGenerator0.getListCount();
      customXYURLGenerator0.clone();
      customXYURLGenerator0.getListCount();
      customXYURLGenerator0.clone();
      linkedList0.add("EJJ3)0,%tM|Z'(,");
      XYDataset xYDataset0 = mock(XYDataset.class, new ViolatedAssumptionAnswer());
      customXYURLGenerator0.generateURL(xYDataset0, 2, 2);
      customXYURLGenerator0.addURLSeries(linkedList0);
      customXYURLGenerator0.addURLSeries(linkedList0);
      customXYURLGenerator0.addURLSeries(linkedList0);
      Integer integer0 = new Integer(2);
      customXYURLGenerator0.equals(integer0);
      customXYURLGenerator0.getURL(2, 2);
      customXYURLGenerator0.getURLCount(2);
      XYDataset xYDataset1 = mock(XYDataset.class, new ViolatedAssumptionAnswer());
      customXYURLGenerator0.generateURL(xYDataset1, 268, 0);
      customXYURLGenerator0.getListCount();
      customXYURLGenerator0.getURL(5, (-3807));
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      CustomXYURLGenerator customXYURLGenerator0 = new CustomXYURLGenerator();
      customXYURLGenerator0.getListCount();
      LinkedList<Object> linkedList0 = new LinkedList<Object>();
      linkedList0.add((Object) "The 'data' array must contain two arrays with equal length.");
      customXYURLGenerator0.addURLSeries(linkedList0);
      CustomXYURLGenerator customXYURLGenerator1 = new CustomXYURLGenerator();
      LinkedList<String> linkedList1 = new LinkedList<String>();
      customXYURLGenerator1.addURLSeries(linkedList1);
      LinkedList<Object> linkedList2 = new LinkedList<Object>();
      linkedList2.add((Object) linkedList1);
      linkedList2.set(0, "G6y");
      customXYURLGenerator1.addURLSeries(linkedList2);
      customXYURLGenerator0.equals(customXYURLGenerator1);
      Object object0 = customXYURLGenerator1.clone();
      customXYURLGenerator1.equals(object0);
      customXYURLGenerator1.addURLSeries(linkedList1);
      customXYURLGenerator1.addURLSeries(linkedList1);
      customXYURLGenerator1.getURL(0, 0);
      customXYURLGenerator0.clone();
      customXYURLGenerator0.addURLSeries(linkedList0);
      Integer integer0 = new Integer(0);
      customXYURLGenerator0.equals(integer0);
      customXYURLGenerator0.getURLCount(0);
      customXYURLGenerator1.clone();
      customXYURLGenerator1.getURLCount(0);
      XYDataset xYDataset0 = mock(XYDataset.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        customXYURLGenerator1.generateURL(xYDataset0, 1, (-552));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      CustomXYURLGenerator customXYURLGenerator0 = new CustomXYURLGenerator();
      customXYURLGenerator0.clone();
      customXYURLGenerator0.clone();
      customXYURLGenerator0.getListCount();
      LinkedList<String> linkedList0 = new LinkedList<String>();
      customXYURLGenerator0.clone();
      customXYURLGenerator0.clone();
      customXYURLGenerator0.addURLSeries(linkedList0);
      XYDataset xYDataset0 = mock(XYDataset.class, new ViolatedAssumptionAnswer());
      customXYURLGenerator0.generateURL(xYDataset0, 0, 0);
      LinkedList<Object> linkedList1 = new LinkedList<Object>();
      Object object0 = customXYURLGenerator0.clone();
      linkedList1.add(object0);
      CustomXYURLGenerator customXYURLGenerator1 = new CustomXYURLGenerator();
      linkedList1.add((Object) customXYURLGenerator1);
      linkedList1.removeFirstOccurrence(object0);
      customXYURLGenerator0.addURLSeries(linkedList1);
      CustomXYURLGenerator customXYURLGenerator2 = new CustomXYURLGenerator();
      customXYURLGenerator1.equals(customXYURLGenerator2);
      customXYURLGenerator1.clone();
      // Undeclared exception!
      try { 
        customXYURLGenerator0.getURL(0, (-2792));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      CustomXYURLGenerator customXYURLGenerator0 = new CustomXYURLGenerator();
      LinkedList<String> linkedList0 = new LinkedList<String>();
      linkedList0.add(".2kP(r+DT56}(H;pR");
      customXYURLGenerator0.addURLSeries(linkedList0);
      LinkedList<Object> linkedList1 = new LinkedList<Object>();
      customXYURLGenerator0.clone();
      linkedList1.addAll(0, (Collection<?>) linkedList0);
      Object object0 = customXYURLGenerator0.clone();
      linkedList1.offerFirst(object0);
      linkedList1.add((Object) null);
      customXYURLGenerator0.addURLSeries(linkedList1);
      XYDataset xYDataset0 = mock(XYDataset.class, new ViolatedAssumptionAnswer());
      customXYURLGenerator0.clone();
      customXYURLGenerator0.generateURL(xYDataset0, 0, 0);
      customXYURLGenerator0.getListCount();
      customXYURLGenerator0.clone();
      XYDataset xYDataset1 = mock(XYDataset.class, new ViolatedAssumptionAnswer());
      int int0 = 0;
      int int1 = (-185);
      // Undeclared exception!
      try { 
        customXYURLGenerator0.generateURL(xYDataset1, 0, (-185));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      CustomXYURLGenerator customXYURLGenerator0 = new CustomXYURLGenerator();
      LinkedList<Object> linkedList0 = new LinkedList<Object>();
      Integer integer0 = new Integer(0);
      linkedList0.add((Object) integer0);
      customXYURLGenerator0.addURLSeries(linkedList0);
      customXYURLGenerator0.clone();
      customXYURLGenerator0.clone();
      customXYURLGenerator0.addURLSeries(linkedList0);
      customXYURLGenerator0.equals("WZP#SE#kt!k6:n[0");
      customXYURLGenerator0.getListCount();
      customXYURLGenerator0.getListCount();
      customXYURLGenerator0.equals(integer0);
      // Undeclared exception!
      try { 
        customXYURLGenerator0.generateURL((XYDataset) null, 0, 0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.lang.Integer cannot be cast to java.lang.String
         //
         verifyException("org.jfree.chart.urls.CustomXYURLGenerator", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      CustomXYURLGenerator customXYURLGenerator0 = new CustomXYURLGenerator();
      LinkedList<Integer> linkedList0 = new LinkedList<Integer>();
      customXYURLGenerator0.clone();
      linkedList0.pollLast();
      customXYURLGenerator0.addURLSeries(linkedList0);
      customXYURLGenerator0.clone();
      Integer integer0 = new Integer((-1));
      linkedList0.add(integer0);
      customXYURLGenerator0.clone();
      customXYURLGenerator0.equals(linkedList0);
      customXYURLGenerator0.equals(linkedList0);
      CustomXYURLGenerator customXYURLGenerator1 = new CustomXYURLGenerator();
      customXYURLGenerator1.addURLSeries(linkedList0);
      customXYURLGenerator0.equals(customXYURLGenerator1);
      customXYURLGenerator1.clone();
      customXYURLGenerator0.addURLSeries(linkedList0);
      customXYURLGenerator0.getListCount();
      linkedList0.add(integer0);
      XYDataset xYDataset0 = mock(XYDataset.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        customXYURLGenerator0.generateURL(xYDataset0, (-2270), (-2270));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      CustomXYURLGenerator customXYURLGenerator0 = new CustomXYURLGenerator();
      customXYURLGenerator0.clone();
      LinkedList<Object> linkedList0 = new LinkedList<Object>();
      customXYURLGenerator0.addURLSeries(linkedList0);
      customXYURLGenerator0.clone();
      customXYURLGenerator0.clone();
      Object object0 = customXYURLGenerator0.clone();
      Integer integer0 = new Integer(0);
      linkedList0.add((Object) integer0);
      customXYURLGenerator0.equals(object0);
      customXYURLGenerator0.clone();
      customXYURLGenerator0.getURLCount(0);
      customXYURLGenerator0.addURLSeries(linkedList0);
      customXYURLGenerator0.clone();
      customXYURLGenerator0.getListCount();
      Object object1 = customXYURLGenerator0.clone();
      // Undeclared exception!
      try { 
        customXYURLGenerator0.equals(object1);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.lang.Integer cannot be cast to java.lang.String
         //
         verifyException("org.jfree.chart.urls.CustomXYURLGenerator", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      CustomXYURLGenerator customXYURLGenerator0 = new CustomXYURLGenerator();
      CustomXYURLGenerator customXYURLGenerator1 = new CustomXYURLGenerator();
      Object object0 = customXYURLGenerator1.clone();
      customXYURLGenerator0.equals(customXYURLGenerator1);
      customXYURLGenerator0.getListCount();
      LinkedList<Object> linkedList0 = new LinkedList<Object>();
      LinkedList<Object> linkedList1 = new LinkedList<Object>();
      linkedList0.removeAll(linkedList1);
      linkedList0.addFirst(linkedList1);
      linkedList0.add(object0);
      linkedList0.add((Object) linkedList1);
      customXYURLGenerator1.addURLSeries(linkedList0);
      // Undeclared exception!
      try { 
        customXYURLGenerator1.getURL(0, 0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.util.LinkedList cannot be cast to java.lang.String
         //
         verifyException("org.jfree.chart.urls.CustomXYURLGenerator", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      CustomXYURLGenerator customXYURLGenerator0 = new CustomXYURLGenerator();
      LinkedList<String> linkedList0 = new LinkedList<String>();
      linkedList0.add("`W)N%JtJls$NOVfk?");
      linkedList0.push("");
      linkedList0.add("");
      linkedList0.offerLast("org.jfree.data.xy.XYSeriesCollection");
      customXYURLGenerator0.addURLSeries(linkedList0);
      customXYURLGenerator0.clone();
      customXYURLGenerator0.generateURL((XYDataset) null, 0, 0);
      Integer integer0 = new Integer(4245);
      customXYURLGenerator0.equals(integer0);
      customXYURLGenerator0.generateURL((XYDataset) null, 0, 0);
      customXYURLGenerator0.getListCount();
      // Undeclared exception!
      try { 
        customXYURLGenerator0.getURLCount(812);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 812, Size: 1
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      CustomXYURLGenerator customXYURLGenerator0 = new CustomXYURLGenerator();
      customXYURLGenerator0.clone();
      customXYURLGenerator0.clone();
      customXYURLGenerator0.clone();
      customXYURLGenerator0.getListCount();
      customXYURLGenerator0.getListCount();
      customXYURLGenerator0.clone();
      customXYURLGenerator0.addURLSeries((List) null);
      customXYURLGenerator0.addURLSeries((List) null);
      customXYURLGenerator0.getURL(0, 0);
      customXYURLGenerator0.clone();
      customXYURLGenerator0.getURLCount(0);
      customXYURLGenerator0.getListCount();
      customXYURLGenerator0.getURLCount(0);
      customXYURLGenerator0.clone();
      // Undeclared exception!
      try { 
        customXYURLGenerator0.getURL((-147), 1798);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      CustomXYURLGenerator customXYURLGenerator0 = new CustomXYURLGenerator();
      customXYURLGenerator0.clone();
      customXYURLGenerator0.clone();
      customXYURLGenerator0.clone();
      customXYURLGenerator0.clone();
      customXYURLGenerator0.addURLSeries((List) null);
      customXYURLGenerator0.addURLSeries((List) null);
      customXYURLGenerator0.addURLSeries((List) null);
      XYDataset xYDataset0 = mock(XYDataset.class, new ViolatedAssumptionAnswer());
      customXYURLGenerator0.generateURL(xYDataset0, 0, 0);
      customXYURLGenerator0.clone();
      customXYURLGenerator0.getURLCount(0);
      customXYURLGenerator0.addURLSeries((List) null);
      customXYURLGenerator0.getURLCount(0);
      customXYURLGenerator0.getURLCount(0);
      customXYURLGenerator0.getListCount();
      XYDataset xYDataset1 = mock(XYDataset.class, new ViolatedAssumptionAnswer());
      customXYURLGenerator0.generateURL(xYDataset1, 0, 4);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      CustomXYURLGenerator customXYURLGenerator0 = new CustomXYURLGenerator();
      LinkedList<String> linkedList0 = new LinkedList<String>();
      linkedList0.add("x");
      LinkedList<String> linkedList1 = new LinkedList<String>(linkedList0);
      customXYURLGenerator0.addURLSeries(linkedList1);
      Object object0 = customXYURLGenerator0.clone();
      customXYURLGenerator0.clone();
      customXYURLGenerator0.equals(object0);
      customXYURLGenerator0.clone();
      customXYURLGenerator0.getURLCount(0);
      customXYURLGenerator0.clone();
      customXYURLGenerator0.getURL(1, 0);
      customXYURLGenerator0.getURLCount(0);
      // Undeclared exception!
      try { 
        customXYURLGenerator0.getURLCount(1);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 1, Size: 1
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      CustomXYURLGenerator customXYURLGenerator0 = new CustomXYURLGenerator();
      List<Object> list0 = null;
      LinkedList<String> linkedList0 = new LinkedList<String>();
      customXYURLGenerator0.addURLSeries(linkedList0);
      linkedList0.removeFirstOccurrence((Object) null);
      customXYURLGenerator0.addURLSeries(linkedList0);
      customXYURLGenerator0.addURLSeries((List) null);
      customXYURLGenerator0.getURLCount(1);
      customXYURLGenerator0.getListCount();
      customXYURLGenerator0.getURLCount(0);
      LinkedList<Integer> linkedList1 = new LinkedList<Integer>();
      linkedList1.iterator();
      Integer integer0 = new Integer(0);
      linkedList1.add(integer0);
      customXYURLGenerator0.addURLSeries(linkedList1);
      // Undeclared exception!
      try { 
        customXYURLGenerator0.getURLCount((-1846));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      CustomXYURLGenerator customXYURLGenerator0 = new CustomXYURLGenerator();
      customXYURLGenerator0.clone();
      LinkedList<String> linkedList0 = new LinkedList<String>();
      linkedList0.add("%Gz,");
      linkedList0.removeFirstOccurrence(customXYURLGenerator0);
      customXYURLGenerator0.addURLSeries(linkedList0);
      customXYURLGenerator0.getURLCount(0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      CustomXYURLGenerator customXYURLGenerator0 = new CustomXYURLGenerator();
      customXYURLGenerator0.equals("");
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      CustomXYURLGenerator customXYURLGenerator0 = new CustomXYURLGenerator();
      LinkedList<Object> linkedList0 = new LinkedList<Object>();
      int int0 = 5;
      Integer integer0 = new Integer(5);
      linkedList0.add((Object) integer0);
      linkedList0.removeFirstOccurrence(integer0);
      linkedList0.parallelStream();
      customXYURLGenerator0.addURLSeries(linkedList0);
      Object object0 = customXYURLGenerator0.clone();
      CustomXYURLGenerator customXYURLGenerator1 = new CustomXYURLGenerator();
      customXYURLGenerator1.clone();
      customXYURLGenerator0.equals(customXYURLGenerator1);
      customXYURLGenerator1.addURLSeries(linkedList0);
      customXYURLGenerator0.equals(object0);
      customXYURLGenerator1.getListCount();
      customXYURLGenerator0.clone();
      XYDataset xYDataset0 = null;
      customXYURLGenerator1.addURLSeries(linkedList0);
      customXYURLGenerator0.generateURL((XYDataset) null, 0, 1);
      // Undeclared exception!
      try { 
        customXYURLGenerator1.getURLCount(5);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 5, Size: 2
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      CustomXYURLGenerator customXYURLGenerator0 = new CustomXYURLGenerator();
      customXYURLGenerator0.clone();
      Object object0 = customXYURLGenerator0.clone();
      customXYURLGenerator0.clone();
      customXYURLGenerator0.clone();
      LinkedList<String> linkedList0 = new LinkedList<String>();
      linkedList0.toArray();
      customXYURLGenerator0.addURLSeries(linkedList0);
      customXYURLGenerator0.equals(object0);
      customXYURLGenerator0.addURLSeries((List) null);
      customXYURLGenerator0.clone();
      customXYURLGenerator0.clone();
      // Undeclared exception!
      try { 
        customXYURLGenerator0.getURLCount((-475));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      CustomXYURLGenerator customXYURLGenerator0 = new CustomXYURLGenerator();
      customXYURLGenerator0.getListCount();
      LinkedList<Object> linkedList0 = new LinkedList<Object>();
      customXYURLGenerator0.addURLSeries(linkedList0);
      customXYURLGenerator0.clone();
      XYDataset xYDataset0 = mock(XYDataset.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        customXYURLGenerator0.generateURL(xYDataset0, (-757), 0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      CustomXYURLGenerator customXYURLGenerator0 = new CustomXYURLGenerator();
      LinkedList<Object> linkedList0 = new LinkedList<Object>();
      customXYURLGenerator0.addURLSeries(linkedList0);
      customXYURLGenerator0.clone();
      XYDataset xYDataset0 = mock(XYDataset.class, new ViolatedAssumptionAnswer());
      customXYURLGenerator0.clone();
      customXYURLGenerator0.generateURL(xYDataset0, 0, 0);
      // Undeclared exception!
      try { 
        customXYURLGenerator0.getURLCount((-17));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      CustomXYURLGenerator customXYURLGenerator0 = new CustomXYURLGenerator();
      customXYURLGenerator0.getURL(2810, 2810);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      CustomXYURLGenerator customXYURLGenerator0 = new CustomXYURLGenerator();
      customXYURLGenerator0.addURLSeries((List) null);
      // Undeclared exception!
      try { 
        customXYURLGenerator0.getURL((-1397), (-1397));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      CustomXYURLGenerator customXYURLGenerator0 = new CustomXYURLGenerator();
      CustomXYURLGenerator customXYURLGenerator1 = (CustomXYURLGenerator)customXYURLGenerator0.clone();
      LinkedList<Integer> linkedList0 = new LinkedList<Integer>();
      customXYURLGenerator1.addURLSeries(linkedList0);
      customXYURLGenerator0.equals(customXYURLGenerator1);
      customXYURLGenerator1.getListCount();
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      CustomXYURLGenerator customXYURLGenerator0 = new CustomXYURLGenerator();
      XYDataset xYDataset0 = mock(XYDataset.class, new ViolatedAssumptionAnswer());
      LinkedList<String> linkedList0 = new LinkedList<String>();
      customXYURLGenerator0.clone();
      customXYURLGenerator0.addURLSeries(linkedList0);
      linkedList0.add("");
      customXYURLGenerator0.clone();
      customXYURLGenerator0.clone();
      customXYURLGenerator0.generateURL(xYDataset0, 2416, 5);
      // Undeclared exception!
      try { 
        customXYURLGenerator0.getURLCount(5);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 5, Size: 1
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      CustomXYURLGenerator customXYURLGenerator0 = new CustomXYURLGenerator();
      LinkedList<CustomXYURLGenerator> linkedList0 = new LinkedList<CustomXYURLGenerator>();
      linkedList0.poll();
      customXYURLGenerator0.addURLSeries(linkedList0);
      // Undeclared exception!
      try { 
        customXYURLGenerator0.getURL(0, (-293));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      CustomXYURLGenerator customXYURLGenerator0 = new CustomXYURLGenerator();
      LinkedList<Integer> linkedList0 = new LinkedList<Integer>();
      Integer integer0 = new Integer(0);
      linkedList0.add(integer0);
      customXYURLGenerator0.addURLSeries(linkedList0);
      Object object0 = customXYURLGenerator0.clone();
      // Undeclared exception!
      try { 
        customXYURLGenerator0.equals(object0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.lang.Integer cannot be cast to java.lang.String
         //
         verifyException("org.jfree.chart.urls.CustomXYURLGenerator", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      CustomXYURLGenerator customXYURLGenerator0 = new CustomXYURLGenerator();
      LinkedList<String> linkedList0 = new LinkedList<String>();
      customXYURLGenerator0.clone();
      customXYURLGenerator0.addURLSeries(linkedList0);
      customXYURLGenerator0.clone();
      customXYURLGenerator0.clone();
      Object object0 = customXYURLGenerator0.clone();
      customXYURLGenerator0.equals(object0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      CustomXYURLGenerator customXYURLGenerator0 = new CustomXYURLGenerator();
      customXYURLGenerator0.clone();
      customXYURLGenerator0.clone();
      // Undeclared exception!
      try { 
        customXYURLGenerator0.getURLCount((-1));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      CustomXYURLGenerator customXYURLGenerator0 = new CustomXYURLGenerator();
      customXYURLGenerator0.generateURL((XYDataset) null, 0, (-1));
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      CustomXYURLGenerator customXYURLGenerator0 = new CustomXYURLGenerator();
      LinkedList<Object> linkedList0 = new LinkedList<Object>();
      customXYURLGenerator0.addURLSeries(linkedList0);
      customXYURLGenerator0.getURL(0, 0);
      customXYURLGenerator0.clone();
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      CustomXYURLGenerator customXYURLGenerator0 = new CustomXYURLGenerator();
      // Undeclared exception!
      try { 
        customXYURLGenerator0.getURL((-3662), (-3662));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      CustomXYURLGenerator customXYURLGenerator0 = new CustomXYURLGenerator();
      Object object0 = customXYURLGenerator0.clone();
      customXYURLGenerator0.equals(object0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      CustomXYURLGenerator customXYURLGenerator0 = new CustomXYURLGenerator();
      LinkedList<Integer> linkedList0 = new LinkedList<Integer>();
      linkedList0.add((Integer) null);
      Integer integer0 = new Integer((-3410));
      linkedList0.add(integer0);
      customXYURLGenerator0.addURLSeries(linkedList0);
      Object object0 = customXYURLGenerator0.clone();
      customXYURLGenerator0.getListCount();
      CustomXYURLGenerator customXYURLGenerator1 = new CustomXYURLGenerator();
      customXYURLGenerator1.clone();
      LinkedList<CustomXYURLGenerator> linkedList1 = new LinkedList<CustomXYURLGenerator>();
      customXYURLGenerator1.addURLSeries(linkedList1);
      customXYURLGenerator1.clone();
      customXYURLGenerator0.equals(customXYURLGenerator1);
      customXYURLGenerator0.clone();
      // Undeclared exception!
      try { 
        customXYURLGenerator0.equals(object0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.lang.Integer cannot be cast to java.lang.String
         //
         verifyException("org.jfree.chart.urls.CustomXYURLGenerator", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      CustomXYURLGenerator customXYURLGenerator0 = new CustomXYURLGenerator();
      LinkedList<Integer> linkedList0 = new LinkedList<Integer>();
      linkedList0.add((Integer) null);
      customXYURLGenerator0.addURLSeries(linkedList0);
      Object object0 = customXYURLGenerator0.clone();
      customXYURLGenerator0.getListCount();
      CustomXYURLGenerator customXYURLGenerator1 = new CustomXYURLGenerator();
      customXYURLGenerator1.clone();
      customXYURLGenerator1.clone();
      customXYURLGenerator0.equals(customXYURLGenerator1);
      customXYURLGenerator0.clone();
      customXYURLGenerator0.equals(object0);
      customXYURLGenerator0.getListCount();
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      CustomXYURLGenerator customXYURLGenerator0 = new CustomXYURLGenerator();
      LinkedList<String> linkedList0 = new LinkedList<String>();
      customXYURLGenerator0.addURLSeries(linkedList0);
      CustomXYURLGenerator customXYURLGenerator1 = new CustomXYURLGenerator();
      customXYURLGenerator0.clone();
      customXYURLGenerator0.equals(customXYURLGenerator1);
      CustomXYURLGenerator customXYURLGenerator2 = new CustomXYURLGenerator();
      customXYURLGenerator0.getURLCount(0);
      customXYURLGenerator0.clone();
      customXYURLGenerator0.getURL(0, 0);
      Integer integer0 = new Integer(0);
      Integer integer1 = new Integer(0);
      customXYURLGenerator0.equals(integer1);
      // Undeclared exception!
      try { 
        customXYURLGenerator0.getURLCount(3);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 3, Size: 1
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      CustomXYURLGenerator customXYURLGenerator0 = new CustomXYURLGenerator();
      LinkedList<String> linkedList0 = new LinkedList<String>();
      linkedList0.add("x");
      linkedList0.addFirst("x");
      LinkedList<String> linkedList1 = new LinkedList<String>(linkedList0);
      customXYURLGenerator0.addURLSeries(linkedList1);
      Object object0 = customXYURLGenerator0.clone();
      customXYURLGenerator0.equals(object0);
      customXYURLGenerator0.clone();
      customXYURLGenerator0.getURLCount(0);
      customXYURLGenerator0.clone();
      customXYURLGenerator0.getURL(2, 0);
      // Undeclared exception!
      try { 
        customXYURLGenerator0.getURLCount(2);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 2, Size: 1
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      LinkedList<CustomXYURLGenerator> linkedList0 = new LinkedList<CustomXYURLGenerator>();
      CustomXYURLGenerator customXYURLGenerator0 = new CustomXYURLGenerator();
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      CustomXYURLGenerator customXYURLGenerator0 = new CustomXYURLGenerator();
      customXYURLGenerator0.getListCount();
      customXYURLGenerator0.addURLSeries((List) null);
      customXYURLGenerator0.equals(customXYURLGenerator0);
      CustomXYURLGenerator customXYURLGenerator1 = (CustomXYURLGenerator)customXYURLGenerator0.clone();
      customXYURLGenerator1.addURLSeries((List) null);
      LinkedList<Integer> linkedList0 = new LinkedList<Integer>();
      Integer integer0 = new Integer(0);
      linkedList0.add(integer0);
      linkedList0.pop();
      customXYURLGenerator0.addURLSeries(linkedList0);
      XYDataset xYDataset0 = mock(XYDataset.class, new ViolatedAssumptionAnswer());
      customXYURLGenerator0.clone();
      customXYURLGenerator0.generateURL(xYDataset0, 0, 0);
      CustomXYURLGenerator customXYURLGenerator2 = (CustomXYURLGenerator)customXYURLGenerator0.clone();
      customXYURLGenerator2.getListCount();
      customXYURLGenerator0.getURL(0, 0);
      customXYURLGenerator0.getURLCount(0);
      XYDataset xYDataset1 = mock(XYDataset.class, new ViolatedAssumptionAnswer());
      customXYURLGenerator0.getURL(0, 2858);
      // Undeclared exception!
      try { 
        customXYURLGenerator0.getURLCount(2943);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 2943, Size: 2
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      CustomXYURLGenerator customXYURLGenerator0 = new CustomXYURLGenerator();
      customXYURLGenerator0.getListCount();
      LinkedList<Object> linkedList0 = new LinkedList<Object>();
      linkedList0.add((Object) "~6y");
      customXYURLGenerator0.addURLSeries(linkedList0);
      CustomXYURLGenerator customXYURLGenerator1 = new CustomXYURLGenerator();
      LinkedList<Object> linkedList1 = new LinkedList<Object>();
      linkedList1.add((Object) customXYURLGenerator0);
      linkedList1.set(0, "G6y");
      customXYURLGenerator1.addURLSeries(linkedList1);
      customXYURLGenerator0.equals(customXYURLGenerator1);
      customXYURLGenerator1.equals(customXYURLGenerator0);
      customXYURLGenerator1.getURL(0, 0);
      CustomXYURLGenerator customXYURLGenerator2 = (CustomXYURLGenerator)customXYURLGenerator0.clone();
      customXYURLGenerator2.clone();
      customXYURLGenerator0.addURLSeries(linkedList0);
      customXYURLGenerator1.getURLCount(0);
      XYDataset xYDataset0 = mock(XYDataset.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        customXYURLGenerator1.generateURL(xYDataset0, 0, (-2229));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }
}
