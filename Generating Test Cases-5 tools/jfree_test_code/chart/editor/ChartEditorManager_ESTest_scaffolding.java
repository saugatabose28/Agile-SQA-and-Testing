/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Tue May 16 05:01:06 GMT 2023
 */

package org.jfree.chart.editor;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

import static org.evosuite.shaded.org.mockito.Mockito.*;
@EvoSuiteClassExclude
public class ChartEditorManager_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "org.jfree.chart.editor.ChartEditorManager"; 
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
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(ChartEditorManager_ESTest_scaffolding.class.getClassLoader() ,
      "org.jfree.chart.event.TitleChangeListener",
      "org.jfree.chart.event.ChartProgressListener",
      "org.jfree.chart.text.TextMeasurer",
      "org.jfree.chart.plot.PlotState",
      "org.jfree.chart.LegendItemSource",
      "org.jfree.chart.editor.ChartEditorManager",
      "org.jfree.chart.ui.StrokeSample",
      "org.jfree.chart.util.SortOrder",
      "org.jfree.chart.block.ColumnArrangement",
      "org.jfree.data.general.DatasetChangeListener",
      "org.jfree.chart.ChartHints$Key",
      "org.jfree.chart.title.Title",
      "org.jfree.chart.plot.Zoomable",
      "org.jfree.chart.editor.DefaultChartEditorFactory",
      "org.jfree.chart.event.TitleChangeEvent",
      "org.jfree.chart.LegendItemCollection",
      "org.jfree.chart.ui.PaintSample",
      "org.jfree.chart.axis.CategoryAxis",
      "org.jfree.chart.plot.PolarPlot",
      "org.jfree.chart.editor.ChartEditor",
      "org.jfree.data.general.DatasetGroup",
      "org.jfree.chart.event.AnnotationChangeListener",
      "org.jfree.chart.ui.RectangleEdge",
      "org.jfree.chart.block.AbstractBlock",
      "org.jfree.chart.event.ChartChangeEventType",
      "org.jfree.chart.plot.XYPlot",
      "org.jfree.chart.editor.DefaultNumberAxisEditor",
      "org.jfree.chart.ui.Drawable",
      "org.jfree.chart.entity.ChartEntity",
      "org.jfree.chart.entity.EntityCollection",
      "org.jfree.chart.plot.Pannable",
      "org.jfree.chart.plot.CategoryPlot",
      "org.jfree.chart.event.MarkerChangeListener",
      "org.jfree.chart.block.Arrangement",
      "org.jfree.chart.editor.DefaultValueAxisEditor",
      "org.jfree.chart.plot.Plot",
      "org.jfree.chart.event.PlotChangeEvent",
      "org.jfree.chart.editor.DefaultAxisEditor",
      "org.jfree.chart.plot.ValueAxisPlot",
      "org.jfree.data.general.DatasetChangeEvent",
      "org.jfree.chart.editor.DefaultChartEditor",
      "org.jfree.chart.editor.DefaultPlotEditor",
      "org.jfree.chart.ui.HorizontalAlignment",
      "org.jfree.chart.event.AxisChangeEvent",
      "org.jfree.chart.entity.TitleEntity",
      "org.jfree.chart.event.AnnotationChangeEvent",
      "org.jfree.chart.plot.PlotRenderingInfo",
      "org.jfree.chart.plot.PlotOrientation",
      "org.jfree.chart.block.Block",
      "org.jfree.chart.ui.FontDisplayField",
      "org.jfree.chart.event.PlotChangeListener",
      "org.jfree.chart.editor.ChartEditorFactory",
      "org.jfree.chart.axis.Axis",
      "org.jfree.chart.block.BlockContainer",
      "org.jfree.chart.ui.LCBLayout",
      "org.jfree.chart.JFreeChart",
      "org.jfree.chart.plot.DrawingSupplier",
      "org.jfree.chart.title.TextTitle",
      "org.jfree.chart.block.BlockBorder",
      "org.jfree.chart.title.LegendTitle",
      "org.jfree.chart.ui.VerticalAlignment",
      "org.jfree.chart.util.UnitType",
      "org.jfree.chart.entity.JFreeChartEntity",
      "org.jfree.chart.axis.AxisLocation",
      "org.jfree.chart.editor.DefaultPolarPlotEditor",
      "org.jfree.chart.ui.RectangleAnchor",
      "org.jfree.chart.JFreeChart$1",
      "org.jfree.chart.util.Args",
      "org.jfree.chart.ChartRenderingInfo",
      "org.jfree.chart.axis.ValueAxis",
      "org.jfree.chart.util.PublicCloneable",
      "org.jfree.chart.event.ChartChangeEvent",
      "org.jfree.chart.event.MarkerChangeEvent",
      "org.jfree.chart.ui.RectangleInsets",
      "org.jfree.chart.block.BlockFrame",
      "org.jfree.chart.event.AxisChangeListener",
      "org.jfree.chart.event.RendererChangeListener",
      "org.jfree.chart.block.FlowArrangement",
      "org.jfree.chart.util.ResourceBundleWrapper",
      "org.jfree.chart.event.ChartChangeListener",
      "org.jfree.chart.editor.DefaultLogAxisEditor",
      "org.jfree.chart.entity.PlotEntity",
      "org.jfree.chart.editor.DefaultTitleEditor"
    );
  } 
  private static void initMocksToAvoidTimeoutsInTheTests() throws ClassNotFoundException { 
    mock(Class.forName("org.jfree.chart.plot.Plot", false, ChartEditorManager_ESTest_scaffolding.class.getClassLoader()));
  }

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(ChartEditorManager_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "org.jfree.chart.editor.DefaultChartEditorFactory",
      "org.jfree.chart.editor.ChartEditorManager",
      "org.jfree.chart.util.Args",
      "org.jfree.chart.JFreeChart$1",
      "org.jfree.chart.JFreeChart",
      "org.jfree.chart.util.UnitType",
      "org.jfree.chart.ui.RectangleInsets",
      "org.jfree.chart.plot.Plot",
      "org.jfree.chart.block.AbstractBlock",
      "org.jfree.chart.ui.RectangleEdge",
      "org.jfree.chart.ui.HorizontalAlignment",
      "org.jfree.chart.ui.VerticalAlignment",
      "org.jfree.chart.title.Title",
      "org.jfree.chart.title.LegendTitle",
      "org.jfree.chart.block.FlowArrangement",
      "org.jfree.chart.block.ColumnArrangement",
      "org.jfree.chart.block.BlockBorder",
      "org.jfree.chart.block.BlockContainer",
      "org.jfree.chart.ui.RectangleAnchor",
      "org.jfree.chart.util.SortOrder",
      "org.jfree.chart.event.ChartChangeEvent",
      "org.jfree.chart.event.TitleChangeEvent",
      "org.jfree.chart.event.ChartChangeEventType",
      "org.jfree.chart.title.TextTitle",
      "org.jfree.chart.util.ResourceBundleWrapper",
      "org.jfree.chart.editor.DefaultChartEditor",
      "org.jfree.chart.ui.LCBLayout",
      "org.jfree.chart.event.PlotChangeEvent",
      "org.jfree.chart.event.ChartProgressEvent",
      "org.jfree.chart.ui.PaintSample",
      "org.jfree.chart.editor.DefaultTitleEditor",
      "org.jfree.chart.ui.FontDisplayField",
      "org.jfree.chart.editor.DefaultPlotEditor",
      "org.jfree.chart.ui.StrokeSample",
      "org.jfree.chart.editor.DefaultAxisEditor"
    );
  }
}
