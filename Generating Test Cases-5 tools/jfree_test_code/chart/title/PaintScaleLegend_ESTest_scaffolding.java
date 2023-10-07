/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Tue May 16 05:56:35 GMT 2023
 */

package org.jfree.chart.title;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

import static org.evosuite.shaded.org.mockito.Mockito.*;
@EvoSuiteClassExclude
public class PaintScaleLegend_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "org.jfree.chart.title.PaintScaleLegend"; 
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
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(PaintScaleLegend_ESTest_scaffolding.class.getClassLoader() ,
      "org.jfree.chart.entity.AxisEntity",
      "org.jfree.chart.event.TitleChangeListener",
      "org.jfree.chart.text.TextMeasurer",
      "org.jfree.chart.LegendItemSource",
      "org.jfree.chart.axis.AxisState",
      "org.jfree.chart.axis.AxisLabelLocation",
      "org.jfree.data.general.DatasetChangeListener",
      "org.jfree.chart.block.RectangleConstraint",
      "org.jfree.chart.title.Title",
      "org.jfree.chart.event.TitleChangeEvent",
      "org.jfree.chart.axis.AxisSpace",
      "org.jfree.chart.util.ShapeUtils",
      "org.jfree.chart.axis.TickUnitSource",
      "org.jfree.chart.ui.RectangleEdge",
      "org.jfree.chart.event.AnnotationChangeListener",
      "org.jfree.chart.block.AbstractBlock",
      "org.jfree.chart.event.ChartChangeEventType",
      "org.jfree.chart.ui.Drawable",
      "org.jfree.chart.entity.ChartEntity",
      "org.jfree.chart.event.MarkerChangeListener",
      "org.jfree.chart.plot.Plot",
      "org.jfree.chart.ui.HorizontalAlignment",
      "org.jfree.chart.event.AxisChangeEvent",
      "org.jfree.chart.plot.PlotRenderingInfo",
      "org.jfree.chart.ui.TextAnchor",
      "org.jfree.chart.plot.PlotOrientation",
      "org.jfree.chart.block.Block",
      "org.jfree.chart.axis.Tick",
      "org.jfree.chart.event.PlotChangeListener",
      "org.jfree.chart.util.ObjectUtils",
      "org.jfree.chart.title.PaintScaleLegend",
      "org.jfree.chart.axis.Axis",
      "org.jfree.chart.axis.ValueTick",
      "org.jfree.chart.JFreeChart",
      "org.jfree.chart.util.PaintUtils",
      "org.jfree.chart.block.BlockBorder",
      "org.jfree.chart.plot.DrawingSupplier",
      "org.jfree.chart.ui.VerticalAlignment",
      "org.jfree.chart.util.UnitType",
      "org.jfree.chart.ui.Size2D",
      "org.jfree.chart.renderer.PaintScale",
      "org.jfree.chart.axis.AxisLocation",
      "org.jfree.chart.util.Args",
      "org.jfree.chart.axis.ValueAxis",
      "org.jfree.chart.util.PublicCloneable",
      "org.jfree.chart.event.ChartChangeEvent",
      "org.jfree.chart.block.LengthConstraintType",
      "org.jfree.chart.ui.RectangleInsets",
      "org.jfree.chart.block.BlockFrame",
      "org.jfree.chart.event.AxisChangeListener",
      "org.jfree.data.Range",
      "org.jfree.chart.entity.PlotEntity"
    );
  } 
  private static void initMocksToAvoidTimeoutsInTheTests() throws ClassNotFoundException { 
    mock(Class.forName("java.awt.Graphics2D", false, PaintScaleLegend_ESTest_scaffolding.class.getClassLoader()));
    mock(Class.forName("org.jfree.chart.axis.Axis", false, PaintScaleLegend_ESTest_scaffolding.class.getClassLoader()));
    mock(Class.forName("org.jfree.chart.axis.AxisSpace", false, PaintScaleLegend_ESTest_scaffolding.class.getClassLoader()));
    mock(Class.forName("org.jfree.chart.axis.ValueAxis", false, PaintScaleLegend_ESTest_scaffolding.class.getClassLoader()));
    mock(Class.forName("org.jfree.chart.block.LengthConstraintType", false, PaintScaleLegend_ESTest_scaffolding.class.getClassLoader()));
    mock(Class.forName("org.jfree.chart.block.RectangleConstraint", false, PaintScaleLegend_ESTest_scaffolding.class.getClassLoader()));
    mock(Class.forName("org.jfree.chart.event.AxisChangeEvent", false, PaintScaleLegend_ESTest_scaffolding.class.getClassLoader()));
    mock(Class.forName("org.jfree.chart.event.TitleChangeEvent", false, PaintScaleLegend_ESTest_scaffolding.class.getClassLoader()));
    mock(Class.forName("org.jfree.chart.event.TitleChangeListener", false, PaintScaleLegend_ESTest_scaffolding.class.getClassLoader()));
    mock(Class.forName("org.jfree.chart.renderer.PaintScale", false, PaintScaleLegend_ESTest_scaffolding.class.getClassLoader()));
    mock(Class.forName("org.jfree.data.Range", false, PaintScaleLegend_ESTest_scaffolding.class.getClassLoader()));
  }

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(PaintScaleLegend_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "org.jfree.chart.block.AbstractBlock",
      "org.jfree.chart.ui.RectangleEdge",
      "org.jfree.chart.ui.HorizontalAlignment",
      "org.jfree.chart.ui.VerticalAlignment",
      "org.jfree.chart.util.UnitType",
      "org.jfree.chart.ui.RectangleInsets",
      "org.jfree.chart.title.Title",
      "org.jfree.chart.title.PaintScaleLegend",
      "org.jfree.chart.axis.AxisLocation",
      "org.jfree.chart.block.LengthConstraintType",
      "org.jfree.chart.plot.PlotOrientation",
      "org.jfree.chart.axis.Axis",
      "org.jfree.data.Range",
      "org.jfree.chart.axis.ValueAxis",
      "org.jfree.chart.util.Args",
      "org.jfree.chart.block.BlockBorder",
      "org.jfree.chart.util.ShapeUtils",
      "org.jfree.chart.util.ObjectUtils",
      "org.jfree.chart.event.ChartChangeEvent",
      "org.jfree.chart.event.TitleChangeEvent",
      "org.jfree.chart.event.ChartChangeEventType",
      "org.jfree.chart.event.AxisChangeEvent",
      "org.jfree.chart.block.RectangleConstraint",
      "org.jfree.chart.ui.Size2D",
      "org.jfree.chart.util.PaintUtils",
      "org.jfree.chart.plot.Plot",
      "org.jfree.chart.axis.AxisSpace",
      "org.jfree.chart.axis.AxisState"
    );
  }
}
