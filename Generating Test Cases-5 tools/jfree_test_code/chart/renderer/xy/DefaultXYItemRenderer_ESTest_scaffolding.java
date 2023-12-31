/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Tue May 16 06:54:20 GMT 2023
 */

package org.jfree.chart.renderer.xy;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class DefaultXYItemRenderer_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "org.jfree.chart.renderer.xy.DefaultXYItemRenderer"; 
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
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(DefaultXYItemRenderer_ESTest_scaffolding.class.getClassLoader() ,
      "org.jfree.chart.renderer.xy.AbstractXYItemRenderer",
      "org.jfree.chart.labels.XYSeriesLabelGenerator",
      "org.jfree.chart.plot.CrosshairState",
      "org.jfree.chart.LegendItemSource",
      "org.jfree.chart.renderer.AbstractRenderer",
      "org.jfree.chart.ChartHints$Key",
      "org.jfree.data.general.DatasetChangeListener",
      "org.jfree.chart.util.StrokeList",
      "org.jfree.chart.plot.Zoomable",
      "org.jfree.chart.ui.Layer",
      "org.jfree.chart.LegendItemCollection",
      "org.jfree.chart.renderer.xy.XYItemRenderer",
      "org.jfree.chart.renderer.RendererState",
      "org.jfree.chart.event.AnnotationChangeListener",
      "org.jfree.chart.plot.XYPlot",
      "org.jfree.chart.labels.StandardXYSeriesLabelGenerator",
      "org.jfree.chart.entity.ChartEntity",
      "org.jfree.chart.labels.ItemLabelPosition",
      "org.jfree.data.general.SeriesDataset",
      "org.jfree.chart.plot.Pannable",
      "org.jfree.chart.event.MarkerChangeListener",
      "org.jfree.data.xy.XYDataset",
      "org.jfree.chart.renderer.xy.XYLineAndShapeRenderer$State",
      "org.jfree.chart.plot.Plot",
      "org.jfree.chart.plot.ValueAxisPlot",
      "org.jfree.chart.util.PaintList",
      "org.jfree.chart.labels.ItemLabelAnchor",
      "org.jfree.chart.labels.XYToolTipGenerator",
      "org.jfree.chart.annotations.Annotation",
      "org.jfree.chart.LegendItem",
      "org.jfree.chart.event.RendererChangeEvent",
      "org.jfree.data.ItemKey",
      "org.jfree.chart.renderer.xy.DefaultXYItemRenderer",
      "org.jfree.data.general.Dataset",
      "org.jfree.chart.event.AnnotationChangeEvent",
      "org.jfree.chart.ui.TextAnchor",
      "org.jfree.chart.plot.PlotRenderingInfo",
      "org.jfree.chart.renderer.xy.XYItemRendererState",
      "org.jfree.chart.axis.Axis",
      "org.jfree.chart.labels.XYItemLabelGenerator",
      "org.jfree.chart.plot.Marker",
      "org.jfree.chart.util.ShapeList",
      "org.jfree.chart.plot.DrawingSupplier",
      "org.jfree.chart.util.BooleanList",
      "org.jfree.chart.urls.XYURLGenerator",
      "org.jfree.chart.util.AbstractObjectList",
      "org.jfree.chart.renderer.xy.XYLineAndShapeRenderer",
      "org.jfree.chart.util.Args",
      "org.jfree.chart.annotations.XYAnnotation",
      "org.jfree.chart.axis.ValueAxis",
      "org.jfree.chart.util.PublicCloneable",
      "org.jfree.chart.event.ChartChangeEvent",
      "org.jfree.chart.event.AxisChangeListener",
      "org.jfree.data.Range",
      "org.jfree.chart.event.RendererChangeListener",
      "org.jfree.chart.entity.XYItemEntity"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(DefaultXYItemRenderer_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "org.jfree.chart.renderer.AbstractRenderer",
      "org.jfree.chart.renderer.xy.AbstractXYItemRenderer",
      "org.jfree.chart.renderer.xy.XYLineAndShapeRenderer",
      "org.jfree.chart.renderer.xy.DefaultXYItemRenderer",
      "org.jfree.chart.util.AbstractObjectList",
      "org.jfree.chart.util.BooleanList",
      "org.jfree.chart.util.PaintList",
      "org.jfree.chart.util.StrokeList",
      "org.jfree.chart.util.ShapeList",
      "org.jfree.chart.labels.ItemLabelPosition",
      "org.jfree.chart.labels.ItemLabelAnchor",
      "org.jfree.chart.ui.TextAnchor",
      "org.jfree.chart.util.Args",
      "org.jfree.chart.labels.StandardXYSeriesLabelGenerator",
      "org.jfree.chart.event.ChartChangeEvent",
      "org.jfree.chart.event.RendererChangeEvent",
      "org.jfree.chart.event.ChartChangeEventType",
      "org.jfree.chart.util.UnitType",
      "org.jfree.chart.ui.RectangleInsets",
      "org.jfree.chart.axis.Axis",
      "org.jfree.data.Range",
      "org.jfree.chart.axis.ValueAxis",
      "org.jfree.chart.plot.Plot",
      "org.jfree.chart.util.ResourceBundleWrapper",
      "org.jfree.chart.plot.XYPlot",
      "org.jfree.chart.LegendItemCollection",
      "org.jfree.chart.plot.PlotRenderingInfo",
      "org.jfree.chart.renderer.RendererState",
      "org.jfree.chart.renderer.xy.XYItemRendererState",
      "org.jfree.chart.renderer.xy.XYLineAndShapeRenderer$State",
      "org.jfree.chart.plot.CrosshairState",
      "org.jfree.data.general.DatasetUtils",
      "org.jfree.chart.entity.ChartEntity",
      "org.jfree.chart.entity.XYItemEntity",
      "org.jfree.chart.event.AnnotationChangeEvent",
      "org.jfree.chart.plot.Marker",
      "org.jfree.chart.util.ObjectUtils",
      "org.jfree.chart.util.PaintUtils",
      "org.jfree.chart.util.ShapeUtils",
      "org.jfree.data.xy.XYItemKey",
      "org.jfree.chart.ChartHints$Key",
      "org.jfree.chart.ChartHints",
      "org.jfree.chart.plot.PlotOrientation",
      "org.jfree.chart.axis.TickUnit",
      "org.jfree.chart.axis.NumberTickUnit",
      "org.jfree.chart.axis.NumberAxis",
      "org.jfree.chart.axis.NumberTickUnitSource",
      "org.jfree.chart.axis.AxisLabelLocation",
      "org.jfree.data.RangeType",
      "org.jfree.chart.renderer.xy.CandlestickRenderer",
      "org.jfree.chart.labels.HighLowItemLabelGenerator",
      "org.jfree.chart.ChartRenderingInfo",
      "org.jfree.chart.entity.StandardEntityCollection",
      "org.jfree.data.general.AbstractDataset",
      "org.jfree.data.general.AbstractSeriesDataset",
      "org.jfree.data.xy.AbstractXYDataset",
      "org.jfree.data.jdbc.JDBCXYDataset",
      "org.jfree.data.general.DatasetGroup",
      "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer",
      "org.jfree.chart.renderer.category.AreaRenderer",
      "org.jfree.chart.labels.StandardCategorySeriesLabelGenerator",
      "org.jfree.chart.renderer.AreaRendererEndType",
      "org.jfree.chart.block.AbstractBlock",
      "org.jfree.chart.ui.RectangleEdge",
      "org.jfree.chart.ui.HorizontalAlignment",
      "org.jfree.chart.ui.VerticalAlignment",
      "org.jfree.chart.title.Title",
      "org.jfree.chart.title.TextTitle",
      "org.jfree.chart.block.BlockBorder",
      "org.jfree.chart.annotations.AbstractAnnotation",
      "org.jfree.chart.annotations.AbstractXYAnnotation",
      "org.jfree.chart.annotations.XYTitleAnnotation",
      "org.jfree.chart.util.XYCoordinateType",
      "org.jfree.data.xy.AbstractXYZDataset",
      "org.jfree.data.xy.DefaultXYZDataset",
      "org.jfree.chart.renderer.DefaultPolarItemRenderer",
      "org.jfree.chart.util.ObjectList",
      "org.jfree.chart.plot.PolarPlot",
      "org.jfree.chart.ChartColor",
      "org.jfree.chart.plot.DefaultDrawingSupplier",
      "org.jfree.chart.plot.PolarAxisLocation",
      "org.jfree.data.xy.AbstractIntervalXYDataset",
      "org.jfree.data.xy.DefaultTableXYDataset",
      "org.jfree.data.xy.IntervalXYDelegate",
      "org.jfree.chart.annotations.XYBoxAnnotation",
      "org.jfree.data.time.TimeTableXYDataset",
      "org.jfree.data.DefaultKeyedValues2D",
      "org.jfree.data.time.TimePeriodAnchor",
      "org.jfree.chart.renderer.xy.DeviationRenderer",
      "org.jfree.chart.renderer.xy.DeviationStepRenderer",
      "org.jfree.data.general.DefaultValueDataset",
      "org.jfree.chart.plot.CompassPlot",
      "org.jfree.chart.needle.MeterNeedle",
      "org.jfree.chart.needle.ArrowNeedle",
      "org.jfree.chart.event.PlotChangeEvent",
      "org.jfree.chart.JFreeChart$1",
      "org.jfree.chart.JFreeChart",
      "org.jfree.chart.title.LegendTitle",
      "org.jfree.chart.block.FlowArrangement",
      "org.jfree.chart.block.ColumnArrangement",
      "org.jfree.chart.block.BlockContainer",
      "org.jfree.chart.util.SortOrder",
      "org.jfree.chart.event.TitleChangeEvent",
      "org.jfree.chart.renderer.xy.GradientXYBarPainter",
      "org.jfree.chart.renderer.xy.XYBarRenderer",
      "org.jfree.chart.renderer.xy.StackedXYBarRenderer",
      "org.jfree.chart.ui.StandardGradientPaintTransformer",
      "org.jfree.chart.ui.GradientPaintTransformType",
      "org.jfree.chart.annotations.XYDrawableAnnotation"
    );
  }
}
