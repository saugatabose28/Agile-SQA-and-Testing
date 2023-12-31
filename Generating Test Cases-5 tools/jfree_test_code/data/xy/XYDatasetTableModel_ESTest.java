/*
 * This file was automatically generated by EvoSuite
 * Tue May 16 05:57:26 GMT 2023
 */

package org.jfree.data.xy;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.jfree.data.general.DatasetChangeEvent;
import org.jfree.data.xy.TableXYDataset;
import org.jfree.data.xy.XYDatasetTableModel;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class XYDatasetTableModel_ESTest extends XYDatasetTableModel_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      TableXYDataset tableXYDataset0 = mock(TableXYDataset.class, new ViolatedAssumptionAnswer());
      doReturn((Number) null).when(tableXYDataset0).getY(anyInt() , anyInt());
      XYDatasetTableModel xYDatasetTableModel0 = new XYDatasetTableModel(tableXYDataset0);
      Object object0 = xYDatasetTableModel0.getValueAt(0, 673);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      TableXYDataset tableXYDataset0 = mock(TableXYDataset.class, new ViolatedAssumptionAnswer());
      doReturn(831).when(tableXYDataset0).getItemCount();
      XYDatasetTableModel xYDatasetTableModel0 = new XYDatasetTableModel(tableXYDataset0);
      int int0 = xYDatasetTableModel0.getRowCount();
      assertEquals(831, int0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      XYDatasetTableModel xYDatasetTableModel0 = new XYDatasetTableModel();
      TableXYDataset tableXYDataset0 = mock(TableXYDataset.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(tableXYDataset0).getItemCount();
      xYDatasetTableModel0.setModel(tableXYDataset0);
      int int0 = xYDatasetTableModel0.getRowCount();
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      XYDatasetTableModel xYDatasetTableModel0 = new XYDatasetTableModel();
      String string0 = xYDatasetTableModel0.getColumnName((-632));
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      TableXYDataset tableXYDataset0 = mock(TableXYDataset.class, new ViolatedAssumptionAnswer());
      doReturn((-790)).when(tableXYDataset0).getSeriesCount();
      XYDatasetTableModel xYDatasetTableModel0 = new XYDatasetTableModel(tableXYDataset0);
      int int0 = xYDatasetTableModel0.getColumnCount();
      assertEquals((-789), int0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      XYDatasetTableModel xYDatasetTableModel0 = new XYDatasetTableModel();
      // Undeclared exception!
      try { 
        xYDatasetTableModel0.setModel((TableXYDataset) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.data.xy.XYDatasetTableModel", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      XYDatasetTableModel xYDatasetTableModel0 = null;
      try {
        xYDatasetTableModel0 = new XYDatasetTableModel((TableXYDataset) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.data.xy.XYDatasetTableModel", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      XYDatasetTableModel xYDatasetTableModel0 = new XYDatasetTableModel();
      boolean boolean0 = xYDatasetTableModel0.isCellEditable((-1456), (-3012));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      XYDatasetTableModel xYDatasetTableModel0 = new XYDatasetTableModel();
      Object object0 = xYDatasetTableModel0.getValueAt((-1941), (-2117));
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      TableXYDataset tableXYDataset0 = mock(TableXYDataset.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(tableXYDataset0).getX(anyInt() , anyInt());
      XYDatasetTableModel xYDatasetTableModel0 = new XYDatasetTableModel(tableXYDataset0);
      Object object0 = xYDatasetTableModel0.getValueAt(10, (-3012));
      assertEquals(0, object0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      XYDatasetTableModel xYDatasetTableModel0 = new XYDatasetTableModel();
      TableXYDataset tableXYDataset0 = mock(TableXYDataset.class, new ViolatedAssumptionAnswer());
      doReturn((Comparable) null).when(tableXYDataset0).getSeriesKey(anyInt());
      xYDatasetTableModel0.setModel(tableXYDataset0);
      // Undeclared exception!
      try { 
        xYDatasetTableModel0.getColumnName(3388);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.System", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      XYDatasetTableModel xYDatasetTableModel0 = new XYDatasetTableModel();
      String string0 = xYDatasetTableModel0.getColumnName(0);
      assertEquals("A", string0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      TableXYDataset tableXYDataset0 = mock(TableXYDataset.class, new ViolatedAssumptionAnswer());
      XYDatasetTableModel xYDatasetTableModel0 = new XYDatasetTableModel(tableXYDataset0);
      String string0 = xYDatasetTableModel0.getColumnName((-1));
      assertEquals("X Value", string0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      XYDatasetTableModel xYDatasetTableModel0 = new XYDatasetTableModel();
      int int0 = xYDatasetTableModel0.getColumnCount();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      TableXYDataset tableXYDataset0 = mock(TableXYDataset.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(tableXYDataset0).getSeriesCount();
      XYDatasetTableModel xYDatasetTableModel0 = new XYDatasetTableModel(tableXYDataset0);
      int int0 = xYDatasetTableModel0.getColumnCount();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      XYDatasetTableModel xYDatasetTableModel0 = new XYDatasetTableModel();
      int int0 = xYDatasetTableModel0.getRowCount();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      TableXYDataset tableXYDataset0 = mock(TableXYDataset.class, new ViolatedAssumptionAnswer());
      XYDatasetTableModel xYDatasetTableModel0 = new XYDatasetTableModel(tableXYDataset0);
      DatasetChangeEvent datasetChangeEvent0 = mock(DatasetChangeEvent.class, new ViolatedAssumptionAnswer());
      xYDatasetTableModel0.datasetChanged(datasetChangeEvent0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      TableXYDataset tableXYDataset0 = mock(TableXYDataset.class, new ViolatedAssumptionAnswer());
      XYDatasetTableModel xYDatasetTableModel0 = new XYDatasetTableModel(tableXYDataset0);
      xYDatasetTableModel0.setValueAt((Object) null, 285, 1209);
  }
}
