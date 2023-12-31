/*
 * This file was automatically generated by EvoSuite
 * Tue May 16 05:05:11 GMT 2023
 */

package org.jfree.data.jdbc;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.jfree.data.Range;
import org.jfree.data.general.DatasetChangeListener;
import org.jfree.data.general.DatasetGroup;
import org.jfree.data.general.SeriesChangeEvent;
import org.jfree.data.jdbc.JDBCXYDataset;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class JDBCXYDataset_ESTest extends JDBCXYDataset_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Connection connection0 = mock(Connection.class, new ViolatedAssumptionAnswer());
      JDBCXYDataset jDBCXYDataset0 = new JDBCXYDataset(connection0);
      ResultSet resultSet0 = mock(ResultSet.class, new ViolatedAssumptionAnswer());
      doReturn((ResultSetMetaData) null).when(resultSet0).getMetaData();
      Statement statement0 = mock(Statement.class, new ViolatedAssumptionAnswer());
      doReturn(resultSet0).when(statement0).executeQuery(anyString());
      Connection connection1 = mock(Connection.class, new ViolatedAssumptionAnswer());
      doReturn(statement0).when(connection1).createStatement();
      boolean boolean0 = true;
      jDBCXYDataset0.getRangeBounds(true);
      // Undeclared exception!
      try { 
        jDBCXYDataset0.executeQuery(connection1, "org.jfree.data.general.DatasetGroup");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.data.jdbc.JDBCXYDataset", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ResultSet resultSet0 = mock(ResultSet.class, new ViolatedAssumptionAnswer());
      doReturn((ResultSetMetaData) null).when(resultSet0).getMetaData();
      Statement statement0 = mock(Statement.class, new ViolatedAssumptionAnswer());
      doReturn(resultSet0).when(statement0).executeQuery(anyString());
      Connection connection0 = mock(Connection.class, new ViolatedAssumptionAnswer());
      doReturn(statement0).when(connection0).createStatement();
      int int0 = 7;
      Connection connection1 = mock(Connection.class, new ViolatedAssumptionAnswer());
      JDBCXYDataset jDBCXYDataset0 = null;
      try {
        jDBCXYDataset0 = new JDBCXYDataset(connection0, "");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.data.jdbc.JDBCXYDataset", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Connection connection0 = mock(Connection.class, new ViolatedAssumptionAnswer());
      JDBCXYDataset jDBCXYDataset0 = new JDBCXYDataset(connection0);
      Statement statement0 = mock(Statement.class, new ViolatedAssumptionAnswer());
      doReturn((ResultSet) null).when(statement0).executeQuery(anyString());
      Connection connection1 = mock(Connection.class, new ViolatedAssumptionAnswer());
      doReturn(statement0).when(connection1).createStatement();
      // Undeclared exception!
      try { 
        jDBCXYDataset0.executeQuery(connection1, "N00c2sw=@");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.data.jdbc.JDBCXYDataset", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      JDBCXYDataset jDBCXYDataset0 = new JDBCXYDataset((Connection) null);
      DatasetChangeListener datasetChangeListener0 = mock(DatasetChangeListener.class, new ViolatedAssumptionAnswer());
      try { 
        jDBCXYDataset0.executeQuery("");
        fail("Expecting exception: SQLException");
      
      } catch(SQLException e) {
         //
         // There is no database to execute the query.
         //
         verifyException("org.jfree.data.jdbc.JDBCXYDataset", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      JDBCXYDataset jDBCXYDataset0 = null;
      try {
        jDBCXYDataset0 = new JDBCXYDataset("org.jfree.data.jdbc.JDBCXYDataset", "org.jfree.data.jdbc.JDBCXYDataset", "M4dciFf\"OF2Kz>0`", "_");
        fail("Expecting exception: SQLException");
      
      } catch(Throwable e) {
         //
         // No suitable driver found for org.jfree.data.jdbc.JDBCXYDataset
         //
         verifyException("java.sql.DriverManager", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Connection connection0 = mock(Connection.class, new ViolatedAssumptionAnswer());
      JDBCXYDataset jDBCXYDataset0 = new JDBCXYDataset(connection0);
      jDBCXYDataset0.validateObject();
      int int0 = (-625);
      // Undeclared exception!
      try { 
        jDBCXYDataset0.getY(3043, (-625));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      JDBCXYDataset jDBCXYDataset0 = null;
      try {
        jDBCXYDataset0 = new JDBCXYDataset("NOID", "org.jfree.data.general.DatasetChangeEvent", "org.jfree.data.general.DatasetChangeEvent", "\\ HEv; I");
        fail("Expecting exception: SQLException");
      
      } catch(Throwable e) {
         //
         // No suitable driver found for NOID
         //
         verifyException("java.sql.DriverManager", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Connection connection0 = mock(Connection.class, new ViolatedAssumptionAnswer());
      JDBCXYDataset jDBCXYDataset0 = new JDBCXYDataset(connection0);
      jDBCXYDataset0.getRangeUpperBound(true);
      DatasetGroup datasetGroup0 = jDBCXYDataset0.getGroup();
      jDBCXYDataset0.setGroup(datasetGroup0);
      jDBCXYDataset0.getRangeBounds(true);
      boolean boolean0 = false;
      jDBCXYDataset0.getRangeUpperBound(false);
      jDBCXYDataset0.getRangeLowerBound(true);
      jDBCXYDataset0.getSeriesCount();
      jDBCXYDataset0.getSeriesCount();
      jDBCXYDataset0.close();
      // Undeclared exception!
      try { 
        jDBCXYDataset0.getY((-7), 0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 0, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Connection connection0 = mock(Connection.class, new ViolatedAssumptionAnswer());
      JDBCXYDataset jDBCXYDataset0 = new JDBCXYDataset(connection0);
      jDBCXYDataset0.setTimeSeries(true);
      // Undeclared exception!
      try { 
        jDBCXYDataset0.getY((-291), (-201));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Connection connection0 = mock(Connection.class, new ViolatedAssumptionAnswer());
      JDBCXYDataset jDBCXYDataset0 = new JDBCXYDataset(connection0);
      // Undeclared exception!
      try { 
        jDBCXYDataset0.getY((-2217), (-2217));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Connection connection0 = mock(Connection.class, new ViolatedAssumptionAnswer());
      JDBCXYDataset jDBCXYDataset0 = new JDBCXYDataset(connection0);
      jDBCXYDataset0.getSeriesCount();
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Connection connection0 = mock(Connection.class, new ViolatedAssumptionAnswer());
      JDBCXYDataset jDBCXYDataset0 = new JDBCXYDataset(connection0);
      jDBCXYDataset0.getRangeUpperBound(false);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Connection connection0 = mock(Connection.class, new ViolatedAssumptionAnswer());
      JDBCXYDataset jDBCXYDataset0 = new JDBCXYDataset(connection0);
      jDBCXYDataset0.close();
      // Undeclared exception!
      try { 
        jDBCXYDataset0.getX(5359, 5359);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 5359, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Connection connection0 = null;
      JDBCXYDataset jDBCXYDataset0 = new JDBCXYDataset((Connection) null);
      boolean boolean0 = true;
      jDBCXYDataset0.setNotify(true);
      jDBCXYDataset0.close();
      try { 
        jDBCXYDataset0.executeQuery((Connection) null, "");
        fail("Expecting exception: SQLException");
      
      } catch(SQLException e) {
         //
         // There is no database to execute the query.
         //
         verifyException("org.jfree.data.jdbc.JDBCXYDataset", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Connection connection0 = mock(Connection.class, new ViolatedAssumptionAnswer());
      JDBCXYDataset jDBCXYDataset0 = new JDBCXYDataset(connection0);
      int int0 = (-769);
      // Undeclared exception!
      try { 
        jDBCXYDataset0.getSeriesKey((-769));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -769
         //
         verifyException("org.jfree.data.jdbc.JDBCXYDataset", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Connection connection0 = mock(Connection.class, new ViolatedAssumptionAnswer());
      JDBCXYDataset jDBCXYDataset0 = new JDBCXYDataset(connection0);
      // Undeclared exception!
      try { 
        jDBCXYDataset0.getSeriesKey((-1950));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1950
         //
         verifyException("org.jfree.data.jdbc.JDBCXYDataset", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      JDBCXYDataset jDBCXYDataset0 = new JDBCXYDataset((Connection) null);
      jDBCXYDataset0.getSeriesKey(0);
      jDBCXYDataset0.getRangeBounds(false);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Connection connection0 = mock(Connection.class, new ViolatedAssumptionAnswer());
      JDBCXYDataset jDBCXYDataset0 = new JDBCXYDataset(connection0);
      DatasetChangeListener datasetChangeListener0 = mock(DatasetChangeListener.class, new ViolatedAssumptionAnswer());
      jDBCXYDataset0.removeChangeListener(datasetChangeListener0);
      jDBCXYDataset0.getItemCount(0);
      // Undeclared exception!
      try { 
        jDBCXYDataset0.getX(0, 0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 0, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      JDBCXYDataset jDBCXYDataset0 = new JDBCXYDataset((Connection) null);
      jDBCXYDataset0.getSeriesKey(7);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Connection connection0 = null;
      String string0 = "T_?`#$_VD*%_";
      JDBCXYDataset jDBCXYDataset0 = null;
      try {
        jDBCXYDataset0 = new JDBCXYDataset((Connection) null, "T_?`#$_VD*%_");
        fail("Expecting exception: SQLException");
      
      } catch(Throwable e) {
         //
         // There is no database to execute the query.
         //
         verifyException("org.jfree.data.jdbc.JDBCXYDataset", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Connection connection0 = mock(Connection.class, new ViolatedAssumptionAnswer());
      JDBCXYDataset jDBCXYDataset0 = new JDBCXYDataset(connection0);
      jDBCXYDataset0.setTimeSeries(true);
      int int0 = (-1934);
      // Undeclared exception!
      try { 
        jDBCXYDataset0.getX((-7), (-1934));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      JDBCXYDataset jDBCXYDataset0 = null;
      try {
        jDBCXYDataset0 = new JDBCXYDataset("", (String) null, "I", "I");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Connection connection0 = mock(Connection.class, new ViolatedAssumptionAnswer());
      doReturn((Statement) null).when(connection0).createStatement();
      JDBCXYDataset jDBCXYDataset0 = new JDBCXYDataset(connection0);
      String string0 = "There is no database to execute the query.";
      jDBCXYDataset0.clone();
      // Undeclared exception!
      try { 
        jDBCXYDataset0.executeQuery("There is no database to execute the query.");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.data.jdbc.JDBCXYDataset", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Connection connection0 = mock(Connection.class, new ViolatedAssumptionAnswer());
      JDBCXYDataset jDBCXYDataset0 = new JDBCXYDataset(connection0);
      jDBCXYDataset0.isTimeSeries();
      jDBCXYDataset0.clone();
      Connection connection1 = null;
      try { 
        jDBCXYDataset0.executeQuery((Connection) null, "");
        fail("Expecting exception: SQLException");
      
      } catch(SQLException e) {
         //
         // There is no database to execute the query.
         //
         verifyException("org.jfree.data.jdbc.JDBCXYDataset", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      JDBCXYDataset jDBCXYDataset0 = null;
      try {
        jDBCXYDataset0 = new JDBCXYDataset("}*R", "<p", "?&3?CB", "}*R");
        fail("Expecting exception: ClassNotFoundException");
      
      } catch(Throwable e) {
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Connection connection0 = mock(Connection.class, new ViolatedAssumptionAnswer());
      JDBCXYDataset jDBCXYDataset0 = new JDBCXYDataset(connection0);
      Connection connection1 = mock(Connection.class, new ViolatedAssumptionAnswer());
      doReturn((Statement) null).when(connection1).createStatement();
      // Undeclared exception!
      try { 
        jDBCXYDataset0.executeQuery(connection1, (String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.data.jdbc.JDBCXYDataset", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Connection connection0 = mock(Connection.class, new ViolatedAssumptionAnswer());
      doReturn((Statement) null).when(connection0).createStatement();
      JDBCXYDataset jDBCXYDataset0 = null;
      try {
        jDBCXYDataset0 = new JDBCXYDataset(connection0, "");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.data.jdbc.JDBCXYDataset", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Connection connection0 = mock(Connection.class, new ViolatedAssumptionAnswer());
      JDBCXYDataset jDBCXYDataset0 = new JDBCXYDataset(connection0);
      Comparable<Object> comparable0 = (Comparable<Object>) mock(Comparable.class, new ViolatedAssumptionAnswer());
      jDBCXYDataset0.indexOf(comparable0);
      jDBCXYDataset0.validateObject();
      jDBCXYDataset0.setTimeSeries(true);
      jDBCXYDataset0.isTimeSeries();
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Connection connection0 = null;
      String string0 = "";
      JDBCXYDataset jDBCXYDataset0 = null;
      try {
        jDBCXYDataset0 = new JDBCXYDataset((Connection) null, "");
        fail("Expecting exception: SQLException");
      
      } catch(Throwable e) {
         //
         // There is no database to execute the query.
         //
         verifyException("org.jfree.data.jdbc.JDBCXYDataset", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      ResultSetMetaData resultSetMetaData0 = mock(ResultSetMetaData.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(resultSetMetaData0).getColumnCount();
      ResultSet resultSet0 = mock(ResultSet.class, new ViolatedAssumptionAnswer());
      doReturn(resultSetMetaData0).when(resultSet0).getMetaData();
      Statement statement0 = mock(Statement.class, new ViolatedAssumptionAnswer());
      doReturn(resultSet0).when(statement0).executeQuery(anyString());
      Connection connection0 = mock(Connection.class, new ViolatedAssumptionAnswer());
      doReturn(statement0).when(connection0).createStatement();
      Connection connection1 = mock(Connection.class, new ViolatedAssumptionAnswer());
      JDBCXYDataset jDBCXYDataset0 = new JDBCXYDataset(connection1);
      jDBCXYDataset0.getRangeBounds(true);
      jDBCXYDataset0.getRangeUpperBound(true);
      JDBCXYDataset jDBCXYDataset1 = null;
      try {
        jDBCXYDataset1 = new JDBCXYDataset(connection0, "");
        fail("Expecting exception: SQLException");
      
      } catch(Throwable e) {
         //
         // Not enough valid columns where generated by query.
         //
         verifyException("org.jfree.data.jdbc.JDBCXYDataset", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Connection connection0 = mock(Connection.class, new ViolatedAssumptionAnswer());
      JDBCXYDataset jDBCXYDataset0 = new JDBCXYDataset(connection0);
      // Undeclared exception!
      try { 
        jDBCXYDataset0.getXValue((-924), 91);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 91, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Connection connection0 = mock(Connection.class, new ViolatedAssumptionAnswer());
      JDBCXYDataset jDBCXYDataset0 = new JDBCXYDataset(connection0);
      assertEquals(0, jDBCXYDataset0.getItemCount());
      assertTrue(jDBCXYDataset0.getNotify());
      assertFalse(jDBCXYDataset0.isTimeSeries());
      assertEquals(0, jDBCXYDataset0.getSeriesCount());
      assertNotNull(jDBCXYDataset0);
      
      DatasetChangeListener datasetChangeListener0 = mock(DatasetChangeListener.class, new ViolatedAssumptionAnswer());
      jDBCXYDataset0.removeChangeListener(datasetChangeListener0);
      assertEquals(0, jDBCXYDataset0.getItemCount());
      assertTrue(jDBCXYDataset0.getNotify());
      assertFalse(jDBCXYDataset0.isTimeSeries());
      assertEquals(0, jDBCXYDataset0.getSeriesCount());
      
      JDBCXYDataset jDBCXYDataset1 = (JDBCXYDataset)jDBCXYDataset0.clone();
      assertNotSame(jDBCXYDataset0, jDBCXYDataset1);
      assertNotSame(jDBCXYDataset1, jDBCXYDataset0);
      assertFalse(jDBCXYDataset1.equals((Object)jDBCXYDataset0));
      assertEquals(0, jDBCXYDataset0.getItemCount());
      assertTrue(jDBCXYDataset0.getNotify());
      assertFalse(jDBCXYDataset0.isTimeSeries());
      assertEquals(0, jDBCXYDataset0.getSeriesCount());
      assertEquals(0, jDBCXYDataset1.getItemCount());
      assertTrue(jDBCXYDataset1.getNotify());
      assertFalse(jDBCXYDataset1.isTimeSeries());
      assertEquals(0, jDBCXYDataset1.getSeriesCount());
      assertNotNull(jDBCXYDataset1);
      
      DatasetChangeListener datasetChangeListener1 = mock(DatasetChangeListener.class, new ViolatedAssumptionAnswer());
      jDBCXYDataset0.removeChangeListener(datasetChangeListener1);
      assertNotSame(jDBCXYDataset0, jDBCXYDataset1);
      assertFalse(jDBCXYDataset0.equals((Object)jDBCXYDataset1));
      assertEquals(0, jDBCXYDataset0.getItemCount());
      assertTrue(jDBCXYDataset0.getNotify());
      assertFalse(jDBCXYDataset0.isTimeSeries());
      assertEquals(0, jDBCXYDataset0.getSeriesCount());
      
      jDBCXYDataset0.setTimeSeries(false);
      assertNotSame(jDBCXYDataset0, jDBCXYDataset1);
      assertFalse(jDBCXYDataset0.equals((Object)jDBCXYDataset1));
      assertEquals(0, jDBCXYDataset0.getItemCount());
      assertTrue(jDBCXYDataset0.getNotify());
      assertFalse(jDBCXYDataset0.isTimeSeries());
      assertEquals(0, jDBCXYDataset0.getSeriesCount());
      
      DatasetGroup datasetGroup0 = jDBCXYDataset0.getGroup();
      assertNotSame(jDBCXYDataset0, jDBCXYDataset1);
      assertFalse(jDBCXYDataset0.equals((Object)jDBCXYDataset1));
      assertEquals(0, jDBCXYDataset0.getItemCount());
      assertTrue(jDBCXYDataset0.getNotify());
      assertFalse(jDBCXYDataset0.isTimeSeries());
      assertEquals(0, jDBCXYDataset0.getSeriesCount());
      assertEquals("NOID", datasetGroup0.getID());
      assertNotNull(datasetGroup0);
      
      jDBCXYDataset0.validateObject();
      assertNotSame(jDBCXYDataset0, jDBCXYDataset1);
      assertFalse(jDBCXYDataset0.equals((Object)jDBCXYDataset1));
      assertEquals(0, jDBCXYDataset0.getItemCount());
      assertTrue(jDBCXYDataset0.getNotify());
      assertFalse(jDBCXYDataset0.isTimeSeries());
      assertEquals(0, jDBCXYDataset0.getSeriesCount());
      
      jDBCXYDataset0.setGroup(datasetGroup0);
      assertNotSame(jDBCXYDataset0, jDBCXYDataset1);
      assertFalse(jDBCXYDataset0.equals((Object)jDBCXYDataset1));
      assertEquals(0, jDBCXYDataset0.getItemCount());
      assertTrue(jDBCXYDataset0.getNotify());
      assertFalse(jDBCXYDataset0.isTimeSeries());
      assertEquals(0, jDBCXYDataset0.getSeriesCount());
      assertEquals("NOID", datasetGroup0.getID());
      
      SeriesChangeEvent seriesChangeEvent0 = mock(SeriesChangeEvent.class, new ViolatedAssumptionAnswer());
      jDBCXYDataset0.seriesChanged(seriesChangeEvent0);
      assertNotSame(jDBCXYDataset0, jDBCXYDataset1);
      assertFalse(jDBCXYDataset0.equals((Object)jDBCXYDataset1));
      assertEquals(0, jDBCXYDataset0.getItemCount());
      assertTrue(jDBCXYDataset0.getNotify());
      assertFalse(jDBCXYDataset0.isTimeSeries());
      assertEquals(0, jDBCXYDataset0.getSeriesCount());
      
      double double0 = jDBCXYDataset0.getRangeLowerBound(true);
      assertNotSame(jDBCXYDataset0, jDBCXYDataset1);
      assertEquals(0.0, double0, 0.01);
      assertFalse(jDBCXYDataset0.equals((Object)jDBCXYDataset1));
      assertEquals(0, jDBCXYDataset0.getItemCount());
      assertTrue(jDBCXYDataset0.getNotify());
      assertFalse(jDBCXYDataset0.isTimeSeries());
      assertEquals(0, jDBCXYDataset0.getSeriesCount());
      
      int int0 = jDBCXYDataset0.getItemCount();
      assertNotSame(jDBCXYDataset0, jDBCXYDataset1);
      assertEquals(0, int0);
      assertFalse(jDBCXYDataset0.equals((Object)jDBCXYDataset1));
      assertEquals(0, jDBCXYDataset0.getItemCount());
      assertTrue(jDBCXYDataset0.getNotify());
      assertFalse(jDBCXYDataset0.isTimeSeries());
      assertEquals(0, jDBCXYDataset0.getSeriesCount());
      
      Connection connection1 = mock(Connection.class, new ViolatedAssumptionAnswer());
      doReturn((Statement) null).when(connection1).createStatement();
      // Undeclared exception!
      try { 
        jDBCXYDataset0.executeQuery(connection1, "");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.data.jdbc.JDBCXYDataset", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Connection connection0 = mock(Connection.class, new ViolatedAssumptionAnswer());
      JDBCXYDataset jDBCXYDataset0 = new JDBCXYDataset(connection0);
      assertEquals(0, jDBCXYDataset0.getItemCount());
      assertFalse(jDBCXYDataset0.isTimeSeries());
      assertEquals(0, jDBCXYDataset0.getSeriesCount());
      assertTrue(jDBCXYDataset0.getNotify());
      assertNotNull(jDBCXYDataset0);
      
      boolean boolean0 = true;
      Range range0 = jDBCXYDataset0.getRangeBounds(true);
      assertEquals(0, jDBCXYDataset0.getItemCount());
      assertFalse(jDBCXYDataset0.isTimeSeries());
      assertEquals(0, jDBCXYDataset0.getSeriesCount());
      assertTrue(jDBCXYDataset0.getNotify());
      assertFalse(range0.isNaNRange());
      assertEquals(0.0, range0.getLength(), 0.01);
      assertEquals(0.0, range0.getLowerBound(), 0.01);
      assertEquals(0.0, range0.getUpperBound(), 0.01);
      assertEquals(0.0, range0.getCentralValue(), 0.01);
      assertNotNull(range0);
      
      // Undeclared exception!
      try { 
        jDBCXYDataset0.setGroup((DatasetGroup) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'group' argument.
         //
         verifyException("org.jfree.chart.util.Args", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Connection connection0 = mock(Connection.class, new ViolatedAssumptionAnswer());
      JDBCXYDataset jDBCXYDataset0 = new JDBCXYDataset(connection0);
      jDBCXYDataset0.getRangeUpperBound(true);
      DatasetGroup datasetGroup0 = jDBCXYDataset0.getGroup();
      jDBCXYDataset0.setGroup(datasetGroup0);
      jDBCXYDataset0.getRangeBounds(true);
      boolean boolean0 = false;
      jDBCXYDataset0.getRangeUpperBound(false);
      jDBCXYDataset0.getRangeLowerBound(true);
      jDBCXYDataset0.getSeriesCount();
      jDBCXYDataset0.close();
      // Undeclared exception!
      try { 
        jDBCXYDataset0.getY((-7), 0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 0, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      JDBCXYDataset jDBCXYDataset0 = null;
      try {
        jDBCXYDataset0 = new JDBCXYDataset("JdbcXYDataset: swallowing exception.", "Not enough valid columns where generated by query.", "JdbcXYDataset: swallowing exception.", "JdbcXYDataset: swallowing exception.");
        fail("Expecting exception: ClassNotFoundException");
      
      } catch(Throwable e) {
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Connection connection0 = mock(Connection.class, new ViolatedAssumptionAnswer());
      JDBCXYDataset jDBCXYDataset0 = new JDBCXYDataset(connection0);
      jDBCXYDataset0.close();
      jDBCXYDataset0.getSeriesCount();
      Connection connection1 = mock(Connection.class, new ViolatedAssumptionAnswer());
      doReturn((Statement) null).when(connection1).createStatement();
      JDBCXYDataset jDBCXYDataset1 = (JDBCXYDataset)jDBCXYDataset0.clone();
      jDBCXYDataset1.getSeriesKey(0);
      jDBCXYDataset0.getSeriesKey(0);
      // Undeclared exception!
      try { 
        jDBCXYDataset0.executeQuery(connection1, "%QAs[&qH#py%%QX");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.data.jdbc.JDBCXYDataset", e);
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      JDBCXYDataset jDBCXYDataset0 = null;
      try {
        jDBCXYDataset0 = new JDBCXYDataset("", "", "Bw1o}FpP1{/", "");
        fail("Expecting exception: ClassNotFoundException");
      
      } catch(Throwable e) {
      }
  }
}
