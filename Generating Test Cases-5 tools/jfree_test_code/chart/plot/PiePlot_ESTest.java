/*
 * This file was automatically generated by EvoSuite
 * Tue May 16 06:15:30 GMT 2023
 */

package org.jfree.chart.plot;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.Composite;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.RadialGradientPaint;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;
import java.util.PropertyResourceBundle;
import java.util.ResourceBundle;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.jfree.chart.PaintMap;
import org.jfree.chart.labels.PieSectionLabelGenerator;
import org.jfree.chart.plot.AbstractPieLabelDistributor;
import org.jfree.chart.plot.DrawingSupplier;
import org.jfree.chart.plot.PiePlot;
import org.jfree.chart.plot.PiePlotState;
import org.jfree.chart.plot.PlotRenderingInfo;
import org.jfree.chart.plot.PlotState;
import org.jfree.chart.text.TextUtils;
import org.jfree.chart.urls.StandardPieURLGenerator;
import org.jfree.chart.util.Rotation;
import org.jfree.chart.util.ShadowGenerator;
import org.jfree.data.KeyedValues;
import org.jfree.data.general.DatasetChangeEvent;
import org.jfree.data.general.PieDataset;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class PiePlot_ESTest extends PiePlot_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      PiePlot<Byte> piePlot0 = new PiePlot<Byte>();
      piePlot0.getDataset();
      Font font0 = PiePlot.DEFAULT_LABEL_FONT;
      piePlot0.setNoDataMessageFont(font0);
      TextUtils.setDrawStringsWithFontAttributes(true);
      PiePlot<Byte> piePlot1 = new PiePlot<Byte>((PieDataset<Byte>) null);
      piePlot1.getPlotType();
      Graphics2D graphics2D0 = mock(Graphics2D.class, new ViolatedAssumptionAnswer());
      PieDataset<Float> pieDataset0 = (PieDataset<Float>) mock(PieDataset.class, new ViolatedAssumptionAnswer());
      PiePlot<Float> piePlot2 = new PiePlot<Float>(pieDataset0);
      Rectangle2D rectangle2D0 = mock(Rectangle2D.class, new ViolatedAssumptionAnswer());
      doReturn(0.0, 0.0, 0.0).when(rectangle2D0).getHeight();
      doReturn(0.0, 0.0, 0.0).when(rectangle2D0).getWidth();
      doReturn(0.0, 0.0, 0.0).when(rectangle2D0).getX();
      doReturn(0.0, 0.0, 0.0).when(rectangle2D0).getY();
      Rectangle2D rectangle2D1 = piePlot2.getArcBounds(rectangle2D0, rectangle2D0, 0.0, 1.0E-5, 0.4);
      piePlot0.drawBackgroundImage(graphics2D0, rectangle2D1);
      piePlot1.clearSectionOutlinePaints(false);
      piePlot0.getAutoPopulateSectionPaint();
      piePlot0.getLegendLabelToolTipGenerator();
      // Undeclared exception!
      try { 
        piePlot0.setLegendLabelGenerator((PieSectionLabelGenerator) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'generator' argument.
         //
         verifyException("org.jfree.chart.util.Args", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      PiePlot<Byte> piePlot0 = new PiePlot<Byte>();
      piePlot0.handleMouseWheelRotation(1743);
      piePlot0.clearSectionOutlineStrokes(true);
      piePlot0.getDataset();
      Graphics2D graphics2D0 = null;
      PieDataset<Float> pieDataset0 = (PieDataset<Float>) mock(PieDataset.class, new ViolatedAssumptionAnswer());
      PiePlot<Float> piePlot1 = new PiePlot<Float>(pieDataset0);
      Rectangle2D rectangle2D0 = mock(Rectangle2D.class, new ViolatedAssumptionAnswer());
      doReturn(0.0, 0.0, 0.0).when(rectangle2D0).getHeight();
      doReturn(0.0, 0.0, 0.0).when(rectangle2D0).getWidth();
      doReturn(0.0, 0.0, 0.0).when(rectangle2D0).getX();
      doReturn(0.0, 0.0, 0.0).when(rectangle2D0).getY();
      piePlot1.handleMouseWheelRotation(10);
      Rectangle2D rectangle2D1 = piePlot1.getArcBounds(rectangle2D0, rectangle2D0, 1743, 1903.57729252, 1743);
      // Undeclared exception!
      try { 
        piePlot0.drawRightLabels((KeyedValues<Byte>) null, (Graphics2D) null, rectangle2D1, rectangle2D1, 3.0F, (PiePlotState) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.plot.PiePlot", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      PiePlot<Byte> piePlot0 = new PiePlot<Byte>();
      Graphics2D graphics2D0 = mock(Graphics2D.class, new ViolatedAssumptionAnswer());
      doReturn((Composite) null).when(graphics2D0).getComposite();
      PiePlot<Float> piePlot1 = new PiePlot<Float>((PieDataset<Float>) null);
      Rectangle2D rectangle2D0 = mock(Rectangle2D.class, new ViolatedAssumptionAnswer());
      doReturn(0.0, 0.0, 0.0).when(rectangle2D0).getHeight();
      doReturn(0.0, 0.0, 0.0).when(rectangle2D0).getWidth();
      doReturn(0.0, 0.0, 0.0).when(rectangle2D0).getX();
      doReturn(0.0, 0.0, 0.0).when(rectangle2D0).getY();
      Rectangle2D rectangle2D1 = piePlot1.getArcBounds(rectangle2D0, rectangle2D0, 0.0, 499.99498334458127, 518.130323927);
      piePlot0.fillBackground(graphics2D0, rectangle2D1);
      piePlot0.setBackgroundImageAlpha(1.0F);
      piePlot0.getDataset();
      PiePlot<Byte> piePlot2 = new PiePlot<Byte>((PieDataset<Byte>) null);
      piePlot2.getDataset();
      piePlot2.getLabelOutlineStroke();
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      PiePlot<Byte> piePlot0 = new PiePlot<Byte>();
      piePlot0.setMinimumArcAngleToDraw(0.4);
      Comparable<PaintMap> comparable0 = (Comparable<PaintMap>) mock(Comparable.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(comparable0).compareTo(any(org.jfree.chart.PaintMap.class));
      piePlot0.setAutoPopulateSectionPaint(true);
      piePlot0.lookupSectionOutlineStroke(comparable0, true);
      piePlot0.getPieIndex();
      piePlot0.getLabelShadowPaint();
      Comparable<StandardPieURLGenerator> comparable1 = (Comparable<StandardPieURLGenerator>) mock(Comparable.class, new ViolatedAssumptionAnswer());
      piePlot0.lookupSectionOutlinePaint(comparable1, true);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      PiePlot<Byte> piePlot0 = new PiePlot<Byte>();
      Comparable<RadialGradientPaint> comparable0 = (Comparable<RadialGradientPaint>) mock(Comparable.class, new ViolatedAssumptionAnswer());
      AbstractPieLabelDistributor abstractPieLabelDistributor0 = piePlot0.getLabelDistributor();
      piePlot0.setLabelDistributor(abstractPieLabelDistributor0);
      piePlot0.getSectionPaint(comparable0);
      piePlot0.getLegendLabelGenerator();
      Byte byte0 = new Byte((byte)10);
      piePlot0.getExplodePercent(byte0);
      piePlot0.getSectionKey((byte)10);
      Graphics2D graphics2D0 = mock(Graphics2D.class, new ViolatedAssumptionAnswer());
      PiePlot<Float> piePlot1 = new PiePlot<Float>();
      Rectangle2D rectangle2D0 = mock(Rectangle2D.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(rectangle2D0).toString();
      piePlot1.datasetChanged((DatasetChangeEvent) null);
      Rectangle2D rectangle2D1 = piePlot1.getArcBounds(rectangle2D0, rectangle2D0, (-2169.96), (-2512.53146092), 0.0);
      PlotRenderingInfo plotRenderingInfo0 = mock(PlotRenderingInfo.class, new ViolatedAssumptionAnswer());
      PiePlotState piePlotState0 = piePlot0.initialise(graphics2D0, rectangle2D1, piePlot1, (Integer) 10, plotRenderingInfo0);
      // Undeclared exception!
      try { 
        piePlot0.drawItem(graphics2D0, 0, rectangle2D1, piePlotState0, (-244));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.plot.PiePlot", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      PiePlot<Byte> piePlot0 = new PiePlot<Byte>();
      PropertyResourceBundle propertyResourceBundle0 = (PropertyResourceBundle)PiePlot.localizationResources;
      PiePlot.localizationResources = (ResourceBundle) propertyResourceBundle0;
      piePlot0.getShadowYOffset();
      piePlot0.getLabelShadowPaint();
      piePlot0.getLegendItems();
      piePlot0.setMinimumArcAngleToDraw(7.0);
      PieSectionLabelGenerator pieSectionLabelGenerator0 = piePlot0.getLegendLabelGenerator();
      piePlot0.setLabelGenerator(pieSectionLabelGenerator0);
      Graphics2D graphics2D0 = mock(Graphics2D.class, new ViolatedAssumptionAnswer());
      PieDataset<Float> pieDataset0 = (PieDataset<Float>) mock(PieDataset.class, new ViolatedAssumptionAnswer());
      PiePlot<Float> piePlot1 = new PiePlot<Float>(pieDataset0);
      piePlot1.getArcBounds((Rectangle2D) null, (Rectangle2D) null, 0.0, 0.08, 0.0);
      PlotRenderingInfo plotRenderingInfo0 = mock(PlotRenderingInfo.class, new ViolatedAssumptionAnswer());
      PiePlotState piePlotState0 = piePlot0.initialise((Graphics2D) null, (Rectangle2D) null, piePlot1, (Integer) 10, plotRenderingInfo0);
      Byte byte0 = new Byte((byte) (-68));
      Point2D point2D0 = piePlot0.getArcCenter(piePlotState0, byte0);
      PlotState plotState0 = mock(PlotState.class, new ViolatedAssumptionAnswer());
      PlotRenderingInfo plotRenderingInfo1 = mock(PlotRenderingInfo.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        piePlot0.draw(graphics2D0, (Rectangle2D) null, point2D0, plotState0, plotRenderingInfo1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.ui.RectangleInsets", e);
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      PiePlot<Short> piePlot0 = new PiePlot<Short>();
      Graphics2D graphics2D0 = mock(Graphics2D.class, new ViolatedAssumptionAnswer());
      piePlot0.drawBackgroundImage(graphics2D0, (Rectangle2D) null);
      piePlot0.setSimpleLabels(true);
      PiePlot<Double> piePlot1 = new PiePlot<Double>();
      piePlot1.getDataset();
      PiePlot<Double> piePlot2 = new PiePlot<Double>((PieDataset<Double>) null);
      piePlot2.setDefaultSectionPaint(piePlot1.DEFAULT_LABEL_OUTLINE_PAINT);
      piePlot2.getLabelPaint();
      PieDataset<Float> pieDataset0 = (PieDataset<Float>) mock(PieDataset.class, new ViolatedAssumptionAnswer());
      PiePlot<Float> piePlot3 = new PiePlot<Float>(pieDataset0);
      piePlot3.getLabelOutlinePaint();
      PiePlot<Integer> piePlot4 = new PiePlot<Integer>();
      piePlot4.setShadowGenerator((ShadowGenerator) null);
      PiePlot<Long> piePlot5 = new PiePlot<Long>();
      DrawingSupplier drawingSupplier0 = piePlot5.getDrawingSupplier();
      piePlot4.setDrawingSupplier(drawingSupplier0, true);
      piePlot4.setStartAngle(0.18);
      piePlot0.getToolTipGenerator();
      piePlot3.clearSectionPaints(true);
      piePlot0.setDefaultSectionOutlineStroke(piePlot1.DEFAULT_OUTLINE_STROKE);
      piePlot3.setShadowXOffset(0.0);
  }
}
