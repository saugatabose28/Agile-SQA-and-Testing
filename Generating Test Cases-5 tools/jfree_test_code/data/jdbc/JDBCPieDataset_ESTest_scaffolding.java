/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Tue May 16 05:35:22 GMT 2023
 */

package org.jfree.data.jdbc;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

import static org.evosuite.shaded.org.mockito.Mockito.*;
@EvoSuiteClassExclude
public class JDBCPieDataset_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "org.jfree.data.jdbc.JDBCPieDataset"; 
    org.evosuite.runtime.GuiSupport.initialize(); 
    org.evosuite.runtime.RuntimeSettings.maxNumberOfThreads = 100; 
    org.evosuite.runtime.RuntimeSettings.maxNumberOfIterationsPerLoop = 10000; 
    org.evosuite.runtime.RuntimeSettings.mockSystemIn = true; 
    org.evosuite.runtime.RuntimeSettings.sandboxMode = org.evosuite.runtime.sandbox.Sandbox.SandboxMode.RECOMMENDED; 
    org.evosuite.runtime.sandbox.Sandbox.initializeSecurityManagerForSUT(); 
    org.evosuite.runtime.classhandling.JDKClassResetter.init();
    setSystemProperties();
    initializeClasses();
    org.evosuite.runtime.Runtime.getInstance().resetRuntime(); 
    try { initMocksToAvoidTimeoutsInTheTests(); } catch(ClassNotFoundException e) {} 
  } 

  @AfterClass 
  public static void clearEvoSuiteFramework(){ 
    Sandbox.resetDefaultSecurityManager(); 
    java.lang.System.setProperties((java.util.Properties) defaultProperties.clone()); 
  } 

  @Before 
  public void initTestCase(){ 
    threadStopper.storeCurrentThreads();
    threadStopper.startRecordingTime();
    org.evosuite.runtime.jvm.ShutdownHookHandler.getInstance().initHandler(); 
    org.evosuite.runtime.sandbox.Sandbox.goingToExecuteSUTCode(); 
    setSystemProperties(); 
    org.evosuite.runtime.GuiSupport.setHeadless(); 
    org.evosuite.runtime.Runtime.getInstance().resetRuntime(); 
    org.evosuite.runtime.agent.InstrumentingAgent.activate(); 
  } 

  @After 
  public void doneWithTestCase(){ 
    threadStopper.killAndJoinClientThreads();
    org.evosuite.runtime.jvm.ShutdownHookHandler.getInstance().safeExecuteAddedHooks(); 
    org.evosuite.runtime.classhandling.JDKClassResetter.reset(); 
    resetClasses(); 
    org.evosuite.runtime.sandbox.Sandbox.doneWithExecutingSUTCode(); 
    org.evosuite.runtime.agent.InstrumentingAgent.deactivate(); 
    org.evosuite.runtime.GuiSupport.restoreHeadlessMode(); 
  } 

  public static void setSystemProperties() {
 
    java.lang.System.setProperties((java.util.Properties) defaultProperties.clone()); 
    java.lang.System.setProperty("file.encoding", "UTF-8"); 
    java.lang.System.setProperty("java.awt.headless", "true"); 
    java.lang.System.setProperty("java.io.tmpdir", "/var/folders/cn/p_3wvv_s13bcscy_x6n4hrxr0000gn/T/"); 
    java.lang.System.setProperty("user.country", "AU"); 
    java.lang.System.setProperty("user.dir", "/Users/niru/Downloads/jfreechart-1.5.2"); 
    java.lang.System.setProperty("user.home", "/Users/niru"); 
    java.lang.System.setProperty("user.language", "en"); 
    java.lang.System.setProperty("user.name", "niru"); 
    java.lang.System.setProperty("user.timezone", "Australia/Sydney"); 
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(JDBCPieDataset_ESTest_scaffolding.class.getClassLoader() ,
      "org.jfree.data.general.Dataset",
      "org.hsqldb.lib.Iterator",
      "org.jfree.chart.util.SortOrder",
      "org.hsqldb.map.ValuePoolHashMap",
      "org.hsqldb.jdbc.JDBCDriver",
      "org.hsqldb.map.BaseHashMap",
      "org.jfree.data.general.DatasetChangeListener",
      "org.jfree.data.general.AbstractDataset",
      "org.jfree.data.DefaultKeyedValues",
      "org.jfree.data.jdbc.JDBCPieDataset",
      "org.jfree.data.general.PieDataset",
      "org.hsqldb.jdbc.JDBCDriver$1",
      "org.hsqldb.map.ValuePool",
      "org.jfree.data.general.DatasetGroup",
      "org.jfree.chart.util.Args",
      "org.jfree.data.general.DefaultPieDataset",
      "org.jfree.chart.util.PublicCloneable",
      "org.hsqldb.lib.FileAccess",
      "org.hsqldb.DatabaseURL",
      "org.jfree.data.Values",
      "org.hsqldb.map.HashIndex",
      "org.jfree.data.KeyedValues",
      "org.hsqldb.persist.HsqlProperties",
      "org.jfree.data.UnknownKeyException",
      "org.jfree.data.general.DatasetChangeEvent"
    );
  } 
  private static void initMocksToAvoidTimeoutsInTheTests() throws ClassNotFoundException { 
    mock(Class.forName("java.sql.Connection", false, JDBCPieDataset_ESTest_scaffolding.class.getClassLoader()));
    mock(Class.forName("java.sql.ResultSet", false, JDBCPieDataset_ESTest_scaffolding.class.getClassLoader()));
    mock(Class.forName("java.sql.ResultSetMetaData", false, JDBCPieDataset_ESTest_scaffolding.class.getClassLoader()));
    mock(Class.forName("java.sql.Statement", false, JDBCPieDataset_ESTest_scaffolding.class.getClassLoader()));
  }

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(JDBCPieDataset_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "org.jfree.data.general.AbstractDataset",
      "org.jfree.data.general.DefaultPieDataset",
      "org.jfree.data.jdbc.JDBCPieDataset",
      "org.jfree.data.general.DatasetGroup",
      "org.jfree.data.DefaultKeyedValues",
      "org.jfree.chart.util.Args",
      "org.hsqldb.jdbc.JDBCDriver",
      "org.hsqldb.DatabaseURL",
      "org.hsqldb.persist.HsqlProperties",
      "org.hsqldb.map.BaseHashMap",
      "org.hsqldb.map.ValuePoolHashMap",
      "org.hsqldb.map.HashIndex",
      "org.hsqldb.map.ValuePool",
      "org.jfree.data.KeyedValueComparator",
      "org.jfree.data.KeyedValueComparatorType",
      "org.jfree.data.general.DatasetChangeEvent",
      "org.jfree.data.general.DefaultPieDatasetTest",
      "org.jfree.data.UnknownKeyException"
    );
  }
}
