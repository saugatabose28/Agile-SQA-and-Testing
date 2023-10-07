/*
 * This file was automatically generated by EvoSuite
 * Tue May 16 06:20:20 GMT 2023
 */

package org.jfree.data.time;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.beans.PropertyChangeListener;
import java.beans.VetoableChangeListener;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.jfree.data.general.SeriesChangeListener;
import org.jfree.data.time.TimePeriod;
import org.jfree.data.time.TimePeriodValue;
import org.jfree.data.time.TimePeriodValues;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class TimePeriodValues_ESTest extends TimePeriodValues_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      TimePeriodValues timePeriodValues0 = new TimePeriodValues("");
      Object object0 = timePeriodValues0.clone();
      timePeriodValues0.equals(object0);
      timePeriodValues0.equals("");
      TimePeriodValues timePeriodValues1 = (TimePeriodValues)timePeriodValues0.clone();
      // Undeclared exception!
      try { 
        timePeriodValues1.update((-3475), (Number) null);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      TimePeriodValues timePeriodValues0 = new TimePeriodValues("");
      timePeriodValues0.setDescription("");
      timePeriodValues0.getMinStartIndex();
      timePeriodValues0.equals(timePeriodValues0);
      timePeriodValues0.equals("");
      // Undeclared exception!
      try { 
        timePeriodValues0.getDataItem((-1));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      TimePeriodValues timePeriodValues0 = new TimePeriodValues("J@Zv0AIR2-", "J@Zv0AIR2-", (String) null);
      timePeriodValues0.getRangeDescription();
      String string0 = TimePeriodValues.DEFAULT_RANGE_DESCRIPTION;
      timePeriodValues0.setKey("Value");
      // Undeclared exception!
      try { 
        timePeriodValues0.getDataItem(893);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 893, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      TimePeriodValues timePeriodValues0 = new TimePeriodValues("4&x+C^-9bJPX~G");
      timePeriodValues0.getRangeDescription();
      timePeriodValues0.clone();
      timePeriodValues0.equals("4&x+C^-9bJPX~G");
      timePeriodValues0.getDomainDescription();
      int int0 = 0;
      // Undeclared exception!
      try { 
        timePeriodValues0.add((TimePeriod) null, (Number) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'period' argument.
         //
         verifyException("org.jfree.chart.util.Args", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      TimePeriodValues timePeriodValues0 = new TimePeriodValues("", "", "");
      TimePeriodValues timePeriodValues1 = timePeriodValues0.createCopy(0, 0);
      timePeriodValues1.setRangeDescription("");
      timePeriodValues1.getDomainDescription();
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      TimePeriodValues timePeriodValues0 = new TimePeriodValues("aHw9$hS9zR\"");
      SeriesChangeListener seriesChangeListener0 = mock(SeriesChangeListener.class, new ViolatedAssumptionAnswer());
      TimePeriodValues timePeriodValues1 = timePeriodValues0.createCopy(542, 542);
      PropertyChangeListener propertyChangeListener0 = mock(PropertyChangeListener.class, new ViolatedAssumptionAnswer());
      SeriesChangeListener seriesChangeListener1 = mock(SeriesChangeListener.class, new ViolatedAssumptionAnswer());
      timePeriodValues0.removeChangeListener(seriesChangeListener1);
      timePeriodValues1.removePropertyChangeListener(propertyChangeListener0);
      timePeriodValues0.addChangeListener(seriesChangeListener0);
      timePeriodValues1.setDomainDescription((String) null);
      timePeriodValues0.getItemCount();
      timePeriodValues1.getDomainDescription();
      timePeriodValues0.getRangeDescription();
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      TimePeriodValues timePeriodValues0 = new TimePeriodValues("6o=]qeb5nm2)5=oi-", "v{ru]*5KG;", "1G4i%`)#\"3TJp`D");
      int int0 = 1;
      timePeriodValues0.setNotify(false);
      timePeriodValues0.setRangeDescription("A)1uFBJ^>i");
      TimePeriodValues timePeriodValues1 = timePeriodValues0.createCopy(1, 1);
      timePeriodValues1.fireSeriesChanged();
      PropertyChangeListener propertyChangeListener0 = mock(PropertyChangeListener.class, new ViolatedAssumptionAnswer());
      timePeriodValues1.setNotify(false);
      timePeriodValues1.removePropertyChangeListener(propertyChangeListener0);
      PropertyChangeListener propertyChangeListener1 = mock(PropertyChangeListener.class, new ViolatedAssumptionAnswer());
      timePeriodValues1.addPropertyChangeListener(propertyChangeListener1);
      timePeriodValues1.getDomainDescription();
      // Undeclared exception!
      try { 
        timePeriodValues0.getDataItem(0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 0, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      TimePeriodValues timePeriodValues0 = new TimePeriodValues("", "", "");
      timePeriodValues0.hashCode();
      timePeriodValues0.getRangeDescription();
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      TimePeriodValues timePeriodValues0 = new TimePeriodValues("");
      TimePeriodValues timePeriodValues1 = new TimePeriodValues("", "'H ", "'H ");
      timePeriodValues1.removePropertyChangeListener((PropertyChangeListener) null);
      VetoableChangeListener vetoableChangeListener0 = mock(VetoableChangeListener.class, new ViolatedAssumptionAnswer());
      timePeriodValues0.addVetoableChangeListener(vetoableChangeListener0);
      timePeriodValues0.equals(timePeriodValues1);
      // Undeclared exception!
      try { 
        timePeriodValues0.getTimePeriod(0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 0, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      TimePeriodValues timePeriodValues0 = new TimePeriodValues("", "O(7:w:LVP3Rz}s", (String) null);
      TimePeriodValues timePeriodValues1 = timePeriodValues0.createCopy(2016, (-1002));
      timePeriodValues0.setDescription("IW");
      PropertyChangeListener propertyChangeListener0 = mock(PropertyChangeListener.class, new ViolatedAssumptionAnswer());
      SeriesChangeListener seriesChangeListener0 = mock(SeriesChangeListener.class, new ViolatedAssumptionAnswer());
      timePeriodValues0.addChangeListener(seriesChangeListener0);
      timePeriodValues1.setKey("");
      timePeriodValues0.addPropertyChangeListener(propertyChangeListener0);
      PropertyChangeListener propertyChangeListener1 = mock(PropertyChangeListener.class, new ViolatedAssumptionAnswer());
      timePeriodValues1.removePropertyChangeListener(propertyChangeListener1);
      timePeriodValues0.addVetoableChangeListener((VetoableChangeListener) null);
      timePeriodValues0.hashCode();
      // Undeclared exception!
      try { 
        timePeriodValues0.getTimePeriod(1124);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 1124, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      String string0 = "OE";
      TimePeriodValues timePeriodValues0 = new TimePeriodValues("OE");
      timePeriodValues0.setRangeDescription((String) null);
      timePeriodValues0.addChangeListener((SeriesChangeListener) null);
      timePeriodValues0.hashCode();
      // Undeclared exception!
      try { 
        timePeriodValues0.add((TimePeriod) null, 1.0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'period' argument.
         //
         verifyException("org.jfree.chart.util.Args", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      TimePeriodValues timePeriodValues0 = new TimePeriodValues("eh_!!K", "eh_!!K", "W,f");
      TimePeriodValue timePeriodValue0 = null;
      // Undeclared exception!
      try { 
        timePeriodValues0.add((TimePeriodValue) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'item' argument.
         //
         verifyException("org.jfree.chart.util.Args", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      TimePeriodValues timePeriodValues0 = new TimePeriodValues("]6}y2X y", "r{9q1^{d", "s2");
      TimePeriodValues timePeriodValues1 = new TimePeriodValues("s2", "", "]6}y2X y");
      SeriesChangeListener seriesChangeListener0 = mock(SeriesChangeListener.class, new ViolatedAssumptionAnswer());
      timePeriodValues1.removeChangeListener(seriesChangeListener0);
      timePeriodValues0.equals(timePeriodValues1);
      int int0 = 0;
      VetoableChangeListener vetoableChangeListener0 = mock(VetoableChangeListener.class, new ViolatedAssumptionAnswer());
      timePeriodValues0.removeVetoableChangeListener(vetoableChangeListener0);
      int int1 = 3888;
      // Undeclared exception!
      try { 
        timePeriodValues0.delete(0, 3888);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 0, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      TimePeriodValues timePeriodValues0 = new TimePeriodValues("");
      timePeriodValues0.setNotify(true);
      timePeriodValues0.getMaxEndIndex();
      TimePeriodValues timePeriodValues1 = timePeriodValues0.createCopy(3050, 3050);
      timePeriodValues1.getMaxMiddleIndex();
      timePeriodValues0.getMaxStartIndex();
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      String string0 = "WL`4!O\\H8/@]`O'}";
      String string1 = "";
      TimePeriodValues timePeriodValues0 = new TimePeriodValues("WL`4!OH8/@]`O'}", "", "L#,N%56=rZ)eR)%");
      String string2 = "DomainOrder.DESCENDING";
      TimePeriodValues timePeriodValues1 = new TimePeriodValues("DomainOrder.DESCENDING", "L#,N%56=rZ)eR)%", "org.jfree.data.time.TimeSeriesTableModel");
      // Undeclared exception!
      try { 
        timePeriodValues1.delete((-2721), (-2721));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      TimePeriodValues timePeriodValues0 = new TimePeriodValues("", "", "");
      int int0 = (-645);
      // Undeclared exception!
      try { 
        timePeriodValues0.getTimePeriod((-645));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      TimePeriodValues timePeriodValues0 = new TimePeriodValues("SG3d}(L5m]ciB'So:S", "x", "UjaZ;-eKacva.");
      // Undeclared exception!
      try { 
        timePeriodValues0.getDataItem(0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 0, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      String string0 = "Ra.yRq;9Qh&#kcHQ";
      TimePeriodValues timePeriodValues0 = new TimePeriodValues("Ra.yRq;9Qh&#kcHQ", "Ra.yRq;9Qh&#kcHQ", "Failed to add cloned item.");
      timePeriodValues0.getMinEndIndex();
      timePeriodValues0.equals("Failed to add cloned item.");
      int int0 = (-1761);
      // Undeclared exception!
      try { 
        timePeriodValues0.getValue((-2343));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      TimePeriodValues timePeriodValues0 = new TimePeriodValues("Domain");
      timePeriodValues0.getMinEndIndex();
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      TimePeriodValues timePeriodValues0 = new TimePeriodValues("qS 2VE.IrrACJ", "qS 2VE.IrrACJ", "qS 2VE.IrrACJ");
      int int0 = (-729);
      timePeriodValues0.setDomainDescription("A test");
      int int1 = (-1661);
      TimePeriodValues timePeriodValues1 = timePeriodValues0.createCopy((-729), (-1661));
      timePeriodValues1.clone();
      timePeriodValues1.setRangeDescription("qS 2VE.IrrACJ");
      timePeriodValues1.getMaxMiddleIndex();
      // Undeclared exception!
      try { 
        timePeriodValues0.getDataItem((-3133));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      TimePeriodValues timePeriodValues0 = new TimePeriodValues("PO)H]B s", "PO)H]B s", (String) null);
      timePeriodValues0.getMaxStartIndex();
      timePeriodValues0.getMaxMiddleIndex();
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      TimePeriodValues timePeriodValues0 = new TimePeriodValues("Requires 'w' > 0.0.", "Requires 'w' > 0.0.", "Requires 'w' > 0.0.");
      TimePeriodValues timePeriodValues1 = timePeriodValues0.createCopy(0, 102000);
      // Undeclared exception!
      try { 
        timePeriodValues1.update(0, (Number) null);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 0, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      TimePeriodValues timePeriodValues0 = new TimePeriodValues("");
      // Undeclared exception!
      try { 
        timePeriodValues0.add((TimePeriod) null, 2797.64902);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'period' argument.
         //
         verifyException("org.jfree.chart.util.Args", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      String string0 = "";
      TimePeriodValues timePeriodValues0 = new TimePeriodValues("");
      TimePeriodValues timePeriodValues1 = timePeriodValues0.createCopy(1, 1);
      // Undeclared exception!
      try { 
        timePeriodValues1.getTimePeriod(1);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 1, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      String string0 = "|E9]%~k_.yg+zS73";
      TimePeriodValues timePeriodValues0 = new TimePeriodValues("|E9]%~k_.yg+zS73");
      SeriesChangeListener seriesChangeListener0 = mock(SeriesChangeListener.class, new ViolatedAssumptionAnswer());
      timePeriodValues0.addChangeListener(seriesChangeListener0);
      timePeriodValues0.clone();
      PropertyChangeListener propertyChangeListener0 = mock(PropertyChangeListener.class, new ViolatedAssumptionAnswer());
      timePeriodValues0.createCopy(0, 0);
      timePeriodValues0.removePropertyChangeListener(propertyChangeListener0);
      TimePeriodValues timePeriodValues1 = timePeriodValues0.createCopy(0, 0);
      // Undeclared exception!
      try { 
        timePeriodValues1.delete(0, 0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 0, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      TimePeriodValues timePeriodValues0 = new TimePeriodValues("!$y$[5", "!$y$[5", "TDlP;9s4A\"D");
      timePeriodValues0.clone();
      timePeriodValues0.setDescription("Value");
      VetoableChangeListener vetoableChangeListener0 = mock(VetoableChangeListener.class, new ViolatedAssumptionAnswer());
      timePeriodValues0.clone();
      timePeriodValues0.addVetoableChangeListener(vetoableChangeListener0);
      timePeriodValues0.setRangeDescription("");
      timePeriodValues0.getItemCount();
      timePeriodValues0.setDomainDescription("TDlP;9s4A\"D");
      timePeriodValues0.setRangeDescription("S.%+LME*I");
      VetoableChangeListener vetoableChangeListener1 = mock(VetoableChangeListener.class, new ViolatedAssumptionAnswer());
      timePeriodValues0.addVetoableChangeListener(vetoableChangeListener1);
      timePeriodValues0.getMinMiddleIndex();
      timePeriodValues0.hashCode();
      timePeriodValues0.hashCode();
      timePeriodValues0.getDomainDescription();
      int int0 = 2912;
      // Undeclared exception!
      try { 
        timePeriodValues0.getValue(2912);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 2912, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      String string0 = null;
      TimePeriodValues timePeriodValues0 = null;
      try {
        timePeriodValues0 = new TimePeriodValues((String) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'key' argument.
         //
         verifyException("org.jfree.chart.util.Args", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      TimePeriodValues timePeriodValues0 = new TimePeriodValues("org.jfree.data.time.TimePeriodValues");
      int int0 = 3027;
      int int1 = 404;
      // Undeclared exception!
      try { 
        timePeriodValues0.delete(6, 404);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 6, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      TimePeriodValues timePeriodValues0 = new TimePeriodValues("9^HZnT|", "", "");
      timePeriodValues0.delete(1, 0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      TimePeriodValues timePeriodValues0 = new TimePeriodValues("s");
      timePeriodValues0.setDomainDescription("wb784~");
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      TimePeriodValues timePeriodValues0 = null;
      try {
        timePeriodValues0 = new TimePeriodValues((String) null, (String) null, (String) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'key' argument.
         //
         verifyException("org.jfree.chart.util.Args", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      TimePeriodValues timePeriodValues0 = new TimePeriodValues("Can't evaluate the year.", "", "");
      // Undeclared exception!
      try { 
        timePeriodValues0.add((TimePeriodValue) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'item' argument.
         //
         verifyException("org.jfree.chart.util.Args", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      TimePeriodValues timePeriodValues0 = new TimePeriodValues("bin width", "bin width", "");
      int int0 = 5648;
      timePeriodValues0.fireSeriesChanged();
      timePeriodValues0.delete(5648, (-1643));
      int int1 = (-1734);
      Number number0 = null;
      // Undeclared exception!
      try { 
        timePeriodValues0.update(2505, (Number) null);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 2505, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      TimePeriodValues timePeriodValues0 = new TimePeriodValues(";VC", ";VC", "tW:sDYtg]^aO");
      // Undeclared exception!
      try { 
        timePeriodValues0.getValue(1584);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 1584, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      String string0 = "0\\$O-!?!]lr>";
      TimePeriodValues timePeriodValues0 = new TimePeriodValues("0$O-!?!]lr>");
      timePeriodValues0.addVetoableChangeListener((VetoableChangeListener) null);
      timePeriodValues0.setDomainDescription("0$O-!?!]lr>");
      int int0 = (-2456);
      String string1 = "DomainOrder.NONE";
      // Undeclared exception!
      try { 
        timePeriodValues0.delete((-2456), (-1563));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      String string0 = "OE";
      TimePeriodValues timePeriodValues0 = new TimePeriodValues("OE");
      // Undeclared exception!
      try { 
        timePeriodValues0.add((TimePeriod) null, 1.0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'period' argument.
         //
         verifyException("org.jfree.chart.util.Args", e);
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      String string0 = "k,N#b*HgC*S";
      TimePeriodValues timePeriodValues0 = new TimePeriodValues("k,N#b*HgC*S", ">H?b'", "1+8M,h;S}rah9~P(l");
      int int0 = (-1118);
      TimePeriodValues timePeriodValues1 = timePeriodValues0.createCopy((-1273), (-1118));
      VetoableChangeListener vetoableChangeListener0 = mock(VetoableChangeListener.class, new ViolatedAssumptionAnswer());
      timePeriodValues0.addVetoableChangeListener(vetoableChangeListener0);
      timePeriodValues1.setRangeDescription("");
      timePeriodValues0.getMinMiddleIndex();
      timePeriodValues0.getRangeDescription();
      int int1 = 33;
      TimePeriodValues timePeriodValues2 = timePeriodValues0.createCopy(33, (-1));
      timePeriodValues2.clone();
      // Undeclared exception!
      try { 
        timePeriodValues2.getTimePeriod((-1118));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      TimePeriodValues timePeriodValues0 = new TimePeriodValues("", "", "/E)c>u?!('3^;-@~l>+");
      timePeriodValues0.setDescription("");
      timePeriodValues0.getMinStartIndex();
      timePeriodValues0.hashCode();
      Object object0 = timePeriodValues0.clone();
      timePeriodValues0.equals(object0);
      timePeriodValues0.equals("");
      // Undeclared exception!
      try { 
        timePeriodValues0.getDataItem(1);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 1, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      TimePeriodValues timePeriodValues0 = new TimePeriodValues("");
      Object object0 = timePeriodValues0.clone();
      timePeriodValues0.equals(object0);
      timePeriodValues0.equals("");
      timePeriodValues0.clone();
      timePeriodValues0.fireSeriesChanged();
      SeriesChangeListener seriesChangeListener0 = mock(SeriesChangeListener.class, new ViolatedAssumptionAnswer());
      timePeriodValues0.addChangeListener(seriesChangeListener0);
      int int0 = (-171);
      TimePeriodValues timePeriodValues1 = timePeriodValues0.createCopy((-171), (-132));
      TimePeriodValues timePeriodValues2 = timePeriodValues1.createCopy((-171), (-171));
      SeriesChangeListener seriesChangeListener1 = mock(SeriesChangeListener.class, new ViolatedAssumptionAnswer());
      timePeriodValues2.removeChangeListener(seriesChangeListener1);
      // Undeclared exception!
      try { 
        timePeriodValues0.getTimePeriod(842);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 842, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      TimePeriodValues timePeriodValues0 = new TimePeriodValues("org.jfree.data.time.TimePeriodValuesCollection", "org.jfree.data.time.TimePeriodValuesCollection", "org.jfree.data.time.TimePeriodValuesCollection");
      PropertyChangeListener propertyChangeListener0 = mock(PropertyChangeListener.class, new ViolatedAssumptionAnswer());
      timePeriodValues0.removePropertyChangeListener(propertyChangeListener0);
      TimePeriodValues timePeriodValues1 = timePeriodValues0.createCopy((-752), (-752));
      int int0 = timePeriodValues1.getMinMiddleIndex();
      timePeriodValues0.getItemCount();
      VetoableChangeListener vetoableChangeListener0 = mock(VetoableChangeListener.class, new ViolatedAssumptionAnswer());
      timePeriodValues1.addVetoableChangeListener(vetoableChangeListener0);
      int int1 = timePeriodValues1.hashCode();
      assertFalse(int1 == int0);
      
      timePeriodValues0.delete(0, (-1));
      int int2 = timePeriodValues1.getMaxStartIndex();
      int int3 = timePeriodValues0.getMaxEndIndex();
      assertTrue(int3 == int2);
      
      int int4 = timePeriodValues1.getMinEndIndex();
      assertEquals((-1), timePeriodValues0.getMaxMiddleIndex());
      assertEquals((-1), timePeriodValues0.getMinStartIndex());
      assertEquals((-1), timePeriodValues1.getMaxEndIndex());
      assertEquals((-1), timePeriodValues0.getMinMiddleIndex());
      assertNotSame(timePeriodValues1, timePeriodValues0);
      assertEquals((-1), timePeriodValues0.getMaxStartIndex());
      assertEquals((-1), int4);
      assertEquals("org.jfree.data.time.TimePeriodValuesCollection", timePeriodValues1.getRangeDescription());
  }
}
