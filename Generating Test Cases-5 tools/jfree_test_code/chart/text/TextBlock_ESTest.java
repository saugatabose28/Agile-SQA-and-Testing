/*
 * This file was automatically generated by EvoSuite
 * Tue May 16 05:11:10 GMT 2023
 */

package org.jfree.chart.text;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics2D;
import java.awt.Paint;
import java.awt.Shape;
import java.awt.font.LineMetrics;
import java.awt.geom.Path2D;
import java.util.List;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.jfree.chart.text.TextBlock;
import org.jfree.chart.text.TextBlockAnchor;
import org.jfree.chart.text.TextLine;
import org.jfree.chart.ui.HorizontalAlignment;
import org.jfree.chart.ui.Size2D;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class TextBlock_ESTest extends TextBlock_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      TextBlock textBlock0 = new TextBlock();
      Graphics2D graphics2D0 = mock(Graphics2D.class, new ViolatedAssumptionAnswer());
      TextBlockAnchor textBlockAnchor0 = mock(TextBlockAnchor.class, new ViolatedAssumptionAnswer());
      Graphics2D graphics2D1 = mock(Graphics2D.class, new ViolatedAssumptionAnswer());
      float float0 = (-2613.5386F);
      FontMetrics fontMetrics0 = mock(FontMetrics.class, new ViolatedAssumptionAnswer());
      doReturn((-1)).when(fontMetrics0).getAscent();
      doReturn((-1330)).when(fontMetrics0).getHeight();
      doReturn((-1330)).when(fontMetrics0).stringWidth(anyString());
      LineMetrics lineMetrics0 = mock(LineMetrics.class, new ViolatedAssumptionAnswer());
      doReturn(0.0F).when(lineMetrics0).getAscent();
      FontMetrics fontMetrics1 = mock(FontMetrics.class, new ViolatedAssumptionAnswer());
      doReturn(800, 0).when(fontMetrics1).getAscent();
      doReturn(0, 0).when(fontMetrics1).getHeight();
      doReturn(lineMetrics0).when(fontMetrics1).getLineMetrics(anyString() , any(java.awt.Graphics.class));
      doReturn(4210, 4210).when(fontMetrics1).stringWidth(anyString());
      Graphics2D graphics2D2 = mock(Graphics2D.class, new ViolatedAssumptionAnswer());
      doReturn(fontMetrics0, fontMetrics1, fontMetrics1, fontMetrics1, (FontMetrics) null).when(graphics2D2).getFontMetrics(any(java.awt.Font.class));
      float float1 = (-1249.818F);
      TextBlockAnchor textBlockAnchor1 = mock(TextBlockAnchor.class, new ViolatedAssumptionAnswer());
      Font font0 = mock(Font.class, new ViolatedAssumptionAnswer());
      Paint paint0 = mock(Paint.class, new ViolatedAssumptionAnswer());
      textBlock0.addLine("Null 'alignment' argument.", font0, paint0);
      float float2 = 1.0F;
      // Undeclared exception!
      try { 
        textBlock0.draw(graphics2D2, (-1249.818F), (float) (-1), textBlockAnchor1, (-1249.818F), 1.0F, (double) (-1249.818F));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.text.TextUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      TextBlock textBlock0 = new TextBlock();
      Graphics2D graphics2D0 = mock(Graphics2D.class, new ViolatedAssumptionAnswer());
      Font font0 = mock(Font.class, new ViolatedAssumptionAnswer());
      Paint paint0 = mock(Paint.class, new ViolatedAssumptionAnswer());
      textBlock0.addLine("", font0, paint0);
      TextBlockAnchor textBlockAnchor0 = mock(TextBlockAnchor.class, new ViolatedAssumptionAnswer());
      Graphics2D graphics2D1 = mock(Graphics2D.class, new ViolatedAssumptionAnswer());
      float float0 = (-2613.5386F);
      LineMetrics lineMetrics0 = mock(LineMetrics.class, new ViolatedAssumptionAnswer());
      FontMetrics fontMetrics0 = mock(FontMetrics.class, new ViolatedAssumptionAnswer());
      doReturn(2833).when(fontMetrics0).getAscent();
      doReturn(2833).when(fontMetrics0).getHeight();
      doReturn(497).when(fontMetrics0).stringWidth(anyString());
      FontMetrics fontMetrics1 = mock(FontMetrics.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0, 0).when(fontMetrics1).getAscent();
      doReturn(0, 0, 0).when(fontMetrics1).getHeight();
      doReturn(0, 0, 0).when(fontMetrics1).stringWidth(anyString());
      Graphics2D graphics2D2 = mock(Graphics2D.class, new ViolatedAssumptionAnswer());
      doReturn(fontMetrics0, fontMetrics1, fontMetrics1, fontMetrics1, (FontMetrics) null).when(graphics2D2).getFontMetrics(any(java.awt.Font.class));
      float float1 = (-1249.818F);
      TextBlockAnchor textBlockAnchor1 = mock(TextBlockAnchor.class, new ViolatedAssumptionAnswer());
      textBlock0.getLines();
      Font font1 = mock(Font.class, new ViolatedAssumptionAnswer());
      Paint paint1 = mock(Paint.class, new ViolatedAssumptionAnswer());
      textBlock0.addLine("Null 'alignment' argument.", font1, paint1);
      float float2 = 1.0F;
      // Undeclared exception!
      try { 
        textBlock0.draw(graphics2D2, (-1249.818F), 1.0F, textBlockAnchor1, (-1249.818F), 1.0F, (double) (-1249.818F));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.text.TextFragment", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      TextBlock textBlock0 = new TextBlock();
      Graphics2D graphics2D0 = mock(Graphics2D.class, new ViolatedAssumptionAnswer());
      TextBlockAnchor textBlockAnchor0 = mock(TextBlockAnchor.class, new ViolatedAssumptionAnswer());
      Graphics2D graphics2D1 = mock(Graphics2D.class, new ViolatedAssumptionAnswer());
      float float0 = (-2613.5386F);
      textBlock0.getLines();
      LineMetrics lineMetrics0 = mock(LineMetrics.class, new ViolatedAssumptionAnswer());
      int int0 = 1;
      FontMetrics fontMetrics0 = mock(FontMetrics.class, new ViolatedAssumptionAnswer());
      doReturn(2566).when(fontMetrics0).getAscent();
      doReturn(10).when(fontMetrics0).getHeight();
      doReturn(1).when(fontMetrics0).stringWidth(anyString());
      FontMetrics fontMetrics1 = mock(FontMetrics.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0).when(fontMetrics1).getAscent();
      doReturn(0, 0).when(fontMetrics1).getHeight();
      doReturn((LineMetrics) null).when(fontMetrics1).getLineMetrics(anyString() , any(java.awt.Graphics.class));
      doReturn(0, 0).when(fontMetrics1).stringWidth(anyString());
      Graphics2D graphics2D2 = mock(Graphics2D.class, new ViolatedAssumptionAnswer());
      doReturn(fontMetrics0, fontMetrics1, fontMetrics1, fontMetrics1).when(graphics2D2).getFontMetrics(any(java.awt.Font.class));
      TextBlockAnchor textBlockAnchor1 = mock(TextBlockAnchor.class, new ViolatedAssumptionAnswer());
      Font font0 = mock(Font.class, new ViolatedAssumptionAnswer());
      Paint paint0 = mock(Paint.class, new ViolatedAssumptionAnswer());
      textBlock0.addLine("Null 'alignment' argument.", font0, paint0);
      float float1 = 1.0F;
      // Undeclared exception!
      try { 
        textBlock0.draw(graphics2D2, 0.0F, 1.0F, textBlockAnchor1, 0.0F, 1.0F, (double) 0.0F);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.text.TextFragment", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      TextBlock textBlock0 = new TextBlock();
      Graphics2D graphics2D0 = mock(Graphics2D.class, new ViolatedAssumptionAnswer());
      TextBlockAnchor textBlockAnchor0 = mock(TextBlockAnchor.class, new ViolatedAssumptionAnswer());
      Graphics2D graphics2D1 = mock(Graphics2D.class, new ViolatedAssumptionAnswer());
      float float0 = (-2613.5386F);
      LineMetrics lineMetrics0 = mock(LineMetrics.class, new ViolatedAssumptionAnswer());
      FontMetrics fontMetrics0 = mock(FontMetrics.class, new ViolatedAssumptionAnswer());
      doReturn(1).when(fontMetrics0).getAscent();
      doReturn(1).when(fontMetrics0).getHeight();
      doReturn(1).when(fontMetrics0).stringWidth(anyString());
      FontMetrics fontMetrics1 = mock(FontMetrics.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0).when(fontMetrics1).getAscent();
      doReturn(0, 0).when(fontMetrics1).getHeight();
      doReturn((LineMetrics) null).when(fontMetrics1).getLineMetrics(anyString() , any(java.awt.Graphics.class));
      doReturn(0, 0).when(fontMetrics1).stringWidth(anyString());
      Graphics2D graphics2D2 = mock(Graphics2D.class, new ViolatedAssumptionAnswer());
      doReturn(fontMetrics0, fontMetrics1, fontMetrics1, fontMetrics1).when(graphics2D2).getFontMetrics(any(java.awt.Font.class));
      float float1 = (-1249.818F);
      TextBlockAnchor textBlockAnchor1 = mock(TextBlockAnchor.class, new ViolatedAssumptionAnswer());
      Font font0 = mock(Font.class, new ViolatedAssumptionAnswer());
      Paint paint0 = mock(Paint.class, new ViolatedAssumptionAnswer());
      textBlock0.addLine("Null 'alignment' argument.", font0, paint0);
      float float2 = 1.0F;
      // Undeclared exception!
      try { 
        textBlock0.draw(graphics2D2, (-1249.818F), 1.0F, textBlockAnchor1, (-1249.818F), 1.0F, (double) (-1249.818F));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.text.TextFragment", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      TextBlock textBlock0 = new TextBlock();
      Graphics2D graphics2D0 = mock(Graphics2D.class, new ViolatedAssumptionAnswer());
      textBlock0.calculateDimensions(graphics2D0);
      textBlock0.getLines();
      Font font0 = mock(Font.class, new ViolatedAssumptionAnswer());
      Paint paint0 = mock(Paint.class, new ViolatedAssumptionAnswer());
      textBlock0.addLine("", font0, paint0);
      textBlock0.getLineAlignment();
      FontMetrics fontMetrics0 = mock(FontMetrics.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(fontMetrics0).getAscent();
      doReturn(0).when(fontMetrics0).getHeight();
      doReturn(0).when(fontMetrics0).stringWidth(anyString());
      Graphics2D graphics2D1 = mock(Graphics2D.class, new ViolatedAssumptionAnswer());
      doReturn(fontMetrics0, (FontMetrics) null).when(graphics2D1).getFontMetrics(any(java.awt.Font.class));
      TextBlockAnchor textBlockAnchor0 = mock(TextBlockAnchor.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        textBlock0.draw(graphics2D1, 0.0F, 0.0F, textBlockAnchor0, 0.0F, (-1.0F), (-736.864175));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.text.TextUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      TextBlock textBlock0 = new TextBlock();
      Graphics2D graphics2D0 = mock(Graphics2D.class, new ViolatedAssumptionAnswer());
      doReturn((FontMetrics) null).when(graphics2D0).getFontMetrics(any(java.awt.Font.class));
      Font font0 = mock(Font.class, new ViolatedAssumptionAnswer());
      Font font1 = mock(Font.class, new ViolatedAssumptionAnswer());
      Paint paint0 = mock(Paint.class, new ViolatedAssumptionAnswer());
      textBlock0.addLine("R*TV[A|3iqJ/", font1, paint0);
      Paint paint1 = mock(Paint.class, new ViolatedAssumptionAnswer());
      textBlock0.addLine("", font0, paint1);
      TextLine textLine0 = textBlock0.getLastLine();
      textBlock0.addLine(textLine0);
      TextBlockAnchor textBlockAnchor0 = mock(TextBlockAnchor.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        textBlock0.draw(graphics2D0, (-1349.31F), (-1349.31F), textBlockAnchor0, (-1349.31F), 1646.9F, (-1021.391199246));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.text.TextUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      TextBlock textBlock0 = new TextBlock();
      Graphics2D graphics2D0 = mock(Graphics2D.class, new ViolatedAssumptionAnswer());
      float float0 = (-649.49F);
      float float1 = (-3778.3264F);
      Graphics2D graphics2D1 = mock(Graphics2D.class, new ViolatedAssumptionAnswer());
      textBlock0.calculateDimensions(graphics2D1);
      TextBlockAnchor textBlockAnchor0 = mock(TextBlockAnchor.class, new ViolatedAssumptionAnswer());
      float float2 = (-1128.0F);
      textBlock0.getLastLine();
      textBlock0.addLine((TextLine) null);
      HorizontalAlignment horizontalAlignment0 = null;
      // Undeclared exception!
      try { 
        textBlock0.setLineAlignment((HorizontalAlignment) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'alignment' argument.
         //
         verifyException("org.jfree.chart.text.TextBlock", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      TextBlock textBlock0 = new TextBlock();
      Graphics2D graphics2D0 = mock(Graphics2D.class, new ViolatedAssumptionAnswer());
      textBlock0.calculateDimensions(graphics2D0);
      textBlock0.addLine((TextLine) null);
      // Undeclared exception!
      try { 
        textBlock0.setLineAlignment((HorizontalAlignment) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'alignment' argument.
         //
         verifyException("org.jfree.chart.text.TextBlock", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      TextBlock textBlock0 = new TextBlock();
      Graphics2D graphics2D0 = mock(Graphics2D.class, new ViolatedAssumptionAnswer());
      TextBlockAnchor textBlockAnchor0 = mock(TextBlockAnchor.class, new ViolatedAssumptionAnswer());
      textBlock0.calculateBounds(graphics2D0, 0.0F, 0.0F, textBlockAnchor0, 0.0F, (-1.0F), (-1.0F));
      textBlock0.getLines();
      Graphics2D graphics2D1 = mock(Graphics2D.class, new ViolatedAssumptionAnswer());
      TextBlockAnchor textBlockAnchor1 = mock(TextBlockAnchor.class, new ViolatedAssumptionAnswer());
      textBlock0.draw(graphics2D1, (-1745.0792F), (-1336.0F), textBlockAnchor1);
      Graphics2D graphics2D2 = mock(Graphics2D.class, new ViolatedAssumptionAnswer());
      float float0 = 2.0F;
      TextBlockAnchor textBlockAnchor2 = mock(TextBlockAnchor.class, new ViolatedAssumptionAnswer());
      textBlock0.calculateBounds(graphics2D2, (-1745.0792F), 2.0F, textBlockAnchor2, (-1336.0F), (-1336.0F), (-1745.0792F));
      HorizontalAlignment horizontalAlignment0 = textBlock0.getLineAlignment();
      textBlock0.setLineAlignment(horizontalAlignment0);
      Graphics2D graphics2D3 = null;
      TextBlockAnchor textBlockAnchor3 = mock(TextBlockAnchor.class, new ViolatedAssumptionAnswer());
      textBlock0.draw((Graphics2D) null, 0.0F, (-1336.0F), textBlockAnchor3);
      textBlock0.calculateDimensions((Graphics2D) null);
      textBlock0.getLastLine();
      textBlock0.addLine((TextLine) null);
      // Undeclared exception!
      try { 
        textBlock0.calculateDimensions((Graphics2D) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.text.TextBlock", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      TextBlock textBlock0 = new TextBlock();
      textBlock0.getLastLine();
      textBlock0.addLine((TextLine) null);
      Graphics2D graphics2D0 = mock(Graphics2D.class, new ViolatedAssumptionAnswer());
      TextBlockAnchor textBlockAnchor0 = mock(TextBlockAnchor.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        textBlock0.calculateBounds(graphics2D0, (-1.0F), 0.0F, textBlockAnchor0, 0.0F, (-868.09143F), 0.0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.text.TextBlock", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      TextBlock textBlock0 = new TextBlock();
      textBlock0.getLastLine();
      textBlock0.addLine((TextLine) null);
      textBlock0.addLine((TextLine) null);
      Graphics2D graphics2D0 = mock(Graphics2D.class, new ViolatedAssumptionAnswer());
      TextBlockAnchor textBlockAnchor0 = mock(TextBlockAnchor.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        textBlock0.draw(graphics2D0, 0.0F, 1.0F, textBlockAnchor0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.text.TextBlock", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      TextBlock textBlock0 = new TextBlock();
      TextBlock textBlock1 = new TextBlock();
      textBlock0.equals(textBlock1);
      TextBlockAnchor textBlockAnchor0 = mock(TextBlockAnchor.class, new ViolatedAssumptionAnswer());
      textBlock1.calculateBounds((Graphics2D) null, 0.0F, 0.0F, textBlockAnchor0, 3324.347F, 0.0F, 3324.347F);
      TextBlockAnchor textBlockAnchor1 = mock(TextBlockAnchor.class, new ViolatedAssumptionAnswer());
      textBlock0.draw((Graphics2D) null, 0.0F, 3324.347F, textBlockAnchor1);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      TextBlock textBlock0 = new TextBlock();
      textBlock0.getLastLine();
      textBlock0.addLine((TextLine) null);
      HorizontalAlignment horizontalAlignment0 = textBlock0.getLineAlignment();
      textBlock0.setLineAlignment(horizontalAlignment0);
      textBlock0.getLineAlignment();
      textBlock0.getLineAlignment();
      textBlock0.setLineAlignment(horizontalAlignment0);
      Graphics2D graphics2D0 = null;
      TextBlockAnchor textBlockAnchor0 = mock(TextBlockAnchor.class, new ViolatedAssumptionAnswer());
      float float0 = 2809.19F;
      // Undeclared exception!
      try { 
        textBlock0.draw((Graphics2D) null, 0.0F, (-1735.0F), textBlockAnchor0, 0.0F, 2809.19F, (double) 2809.19F);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.text.TextBlock", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      TextBlock textBlock0 = new TextBlock();
      Graphics2D graphics2D0 = mock(Graphics2D.class, new ViolatedAssumptionAnswer());
      TextBlockAnchor textBlockAnchor0 = mock(TextBlockAnchor.class, new ViolatedAssumptionAnswer());
      textBlock0.calculateBounds(graphics2D0, (-2059.43F), (-1.0F), textBlockAnchor0, (-1031.842F), (-1031.842F), (-1031.842F));
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      TextBlock textBlock0 = new TextBlock();
      Graphics2D graphics2D0 = mock(Graphics2D.class, new ViolatedAssumptionAnswer());
      TextBlockAnchor textBlockAnchor0 = mock(TextBlockAnchor.class, new ViolatedAssumptionAnswer());
      textBlock0.calculateBounds(graphics2D0, 891.0403F, 1704.8081F, textBlockAnchor0, 1704.8081F, 1.0F, 891.0403F);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      TextBlock textBlock0 = new TextBlock();
      Graphics2D graphics2D0 = mock(Graphics2D.class, new ViolatedAssumptionAnswer());
      Graphics2D graphics2D1 = mock(Graphics2D.class, new ViolatedAssumptionAnswer());
      Font font0 = mock(Font.class, new ViolatedAssumptionAnswer());
      Paint paint0 = mock(Paint.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        textBlock0.addLine((String) null, font0, paint0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'text' argument.
         //
         verifyException("org.jfree.chart.text.TextLine", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      TextBlock textBlock0 = new TextBlock();
      Graphics2D graphics2D0 = mock(Graphics2D.class, new ViolatedAssumptionAnswer());
      TextBlockAnchor textBlockAnchor0 = mock(TextBlockAnchor.class, new ViolatedAssumptionAnswer());
      textBlock0.calculateBounds(graphics2D0, 2068.6162F, (-1140.0F), textBlockAnchor0, 1064.1755F, (-1.0F), (-1140.0F));
      Graphics2D graphics2D1 = mock(Graphics2D.class, new ViolatedAssumptionAnswer());
      TextBlockAnchor textBlockAnchor1 = mock(TextBlockAnchor.class, new ViolatedAssumptionAnswer());
      textBlock0.draw(graphics2D1, (-1.0F), (-1.0F), textBlockAnchor1, 564.218F, 564.218F, 3467.43131760397);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      TextBlock textBlock0 = new TextBlock();
      assertNotNull(textBlock0);
      
      FontMetrics fontMetrics0 = mock(FontMetrics.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(fontMetrics0).getAscent();
      doReturn(0).when(fontMetrics0).getHeight();
      doReturn(0).when(fontMetrics0).stringWidth(anyString());
      Graphics2D graphics2D0 = mock(Graphics2D.class, new ViolatedAssumptionAnswer());
      doReturn(fontMetrics0, (FontMetrics) null).when(graphics2D0).getFontMetrics(any(java.awt.Font.class));
      Font font0 = mock(Font.class, new ViolatedAssumptionAnswer());
      Paint paint0 = mock(Paint.class, new ViolatedAssumptionAnswer());
      textBlock0.addLine("", font0, paint0);
      // Undeclared exception!
      try { 
        textBlock0.draw(graphics2D0, 0.0F, 0.0F, (TextBlockAnchor) null, 0.0F, 0.0F, 1383.89399);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.text.TextUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      TextBlock textBlock0 = new TextBlock();
      assertNotNull(textBlock0);
      
      Graphics2D graphics2D0 = mock(Graphics2D.class, new ViolatedAssumptionAnswer());
      TextBlockAnchor textBlockAnchor0 = mock(TextBlockAnchor.class, new ViolatedAssumptionAnswer());
      Graphics2D graphics2D1 = mock(Graphics2D.class, new ViolatedAssumptionAnswer());
      TextBlockAnchor textBlockAnchor1 = mock(TextBlockAnchor.class, new ViolatedAssumptionAnswer());
      Path2D.Double path2D_Double0 = (Path2D.Double)textBlock0.calculateBounds(graphics2D1, 1.0F, (-2029.0F), textBlockAnchor1, 1.0F, 1.0F, (-2029.0F));
      assertNotNull(path2D_Double0);
      assertEquals(1, path2D_Double0.getWindingRule());
      
      textBlock0.draw(graphics2D0, 766.1462F, 2.0F, textBlockAnchor0);
      HorizontalAlignment horizontalAlignment0 = textBlock0.getLineAlignment();
      assertNotNull(horizontalAlignment0);
      assertEquals("HorizontalAlignment.CENTER", horizontalAlignment0.toString());
      
      textBlock0.setLineAlignment(horizontalAlignment0);
      assertEquals("HorizontalAlignment.CENTER", horizontalAlignment0.toString());
      
      TextLine textLine0 = textBlock0.getLastLine();
      assertNull(textLine0);
      
      textBlock0.addLine((TextLine) null);
      TextLine textLine1 = textBlock0.getLastLine();
      assertNull(textLine1);
      
      textBlock0.addLine((TextLine) null);
      List list0 = textBlock0.getLines();
      assertNotNull(list0);
      assertFalse(list0.isEmpty());
      assertEquals(2, list0.size());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      TextBlock textBlock0 = new TextBlock();
      assertNotNull(textBlock0);
      
      textBlock0.hashCode();
      Graphics2D graphics2D0 = null;
      float float0 = 2177.4124F;
      TextBlockAnchor textBlockAnchor0 = mock(TextBlockAnchor.class, new ViolatedAssumptionAnswer());
      Path2D.Double path2D_Double0 = (Path2D.Double)textBlock0.calculateBounds((Graphics2D) null, 2177.4124F, 2177.4124F, textBlockAnchor0, 2177.4124F, (-2526.0F), (-2526.0F));
      assertNotNull(path2D_Double0);
      assertEquals(1, path2D_Double0.getWindingRule());
      
      TextLine textLine0 = textBlock0.getLastLine();
      assertNull(textLine0);
      
      HorizontalAlignment horizontalAlignment0 = textBlock0.getLineAlignment();
      assertNotNull(horizontalAlignment0);
      assertEquals("HorizontalAlignment.CENTER", horizontalAlignment0.toString());
      
      textBlock0.setLineAlignment(horizontalAlignment0);
      assertEquals("HorizontalAlignment.CENTER", horizontalAlignment0.toString());
      
      boolean boolean0 = textBlock0.equals(path2D_Double0);
      assertFalse(boolean0);
      assertEquals(1, path2D_Double0.getWindingRule());
      
      textBlock0.addLine((TextLine) null);
      textBlock0.setLineAlignment(horizontalAlignment0);
      assertEquals("HorizontalAlignment.CENTER", horizontalAlignment0.toString());
      
      Font font0 = mock(Font.class, new ViolatedAssumptionAnswer());
      Paint paint0 = mock(Paint.class, new ViolatedAssumptionAnswer());
      textBlock0.addLine("TextBlockAnchor.TOP_CENTER", font0, paint0);
      float float1 = 0.0F;
      TextBlockAnchor textBlockAnchor1 = mock(TextBlockAnchor.class, new ViolatedAssumptionAnswer());
      float float2 = 3386.0308F;
      TextBlockAnchor textBlockAnchor2 = mock(TextBlockAnchor.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        textBlock0.draw((Graphics2D) null, (-2526.0F), 3386.0308F, textBlockAnchor2);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.text.TextBlock", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      TextBlock textBlock0 = new TextBlock();
      assertNotNull(textBlock0);
      
      List list0 = textBlock0.getLines();
      assertNotNull(list0);
      assertEquals(0, list0.size());
      assertTrue(list0.isEmpty());
      
      HorizontalAlignment horizontalAlignment0 = textBlock0.getLineAlignment();
      assertNotNull(horizontalAlignment0);
      assertEquals("HorizontalAlignment.CENTER", horizontalAlignment0.toString());
      
      textBlock0.setLineAlignment(horizontalAlignment0);
      assertEquals("HorizontalAlignment.CENTER", horizontalAlignment0.toString());
      
      TextLine textLine0 = textBlock0.getLastLine();
      assertNull(textLine0);
      
      Graphics2D graphics2D0 = mock(Graphics2D.class, new ViolatedAssumptionAnswer());
      TextBlockAnchor textBlockAnchor0 = mock(TextBlockAnchor.class, new ViolatedAssumptionAnswer());
      textBlock0.draw(graphics2D0, (-1.0F), 378.401F, textBlockAnchor0, (-2594.6018F), (-1.0F), 4305.4632080380725);
      Graphics2D graphics2D1 = mock(Graphics2D.class, new ViolatedAssumptionAnswer());
      TextBlockAnchor textBlockAnchor1 = mock(TextBlockAnchor.class, new ViolatedAssumptionAnswer());
      textBlock0.draw(graphics2D1, 0.0F, 378.401F, textBlockAnchor1, 3758.0F, (-1.0F), 1.0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      TextBlock textBlock0 = new TextBlock();
      HorizontalAlignment horizontalAlignment0 = textBlock0.getLineAlignment();
      textBlock0.setLineAlignment(horizontalAlignment0);
      textBlock0.hashCode();
      Graphics2D graphics2D0 = mock(Graphics2D.class, new ViolatedAssumptionAnswer());
      TextBlockAnchor textBlockAnchor0 = mock(TextBlockAnchor.class, new ViolatedAssumptionAnswer());
      textBlock0.draw(graphics2D0, 0.0F, 0.0F, textBlockAnchor0);
      textBlock0.getLastLine();
      textBlock0.addLine((TextLine) null);
      textBlock0.getLastLine();
      textBlock0.addLine((TextLine) null);
      HorizontalAlignment horizontalAlignment1 = textBlock0.getLineAlignment();
      textBlock0.getLastLine();
      textBlock0.setLineAlignment(horizontalAlignment1);
      Graphics2D graphics2D1 = mock(Graphics2D.class, new ViolatedAssumptionAnswer());
      float float0 = (-1.0F);
      TextBlockAnchor textBlockAnchor1 = mock(TextBlockAnchor.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        textBlock0.draw(graphics2D1, 0.0F, (-1.0F), textBlockAnchor1, (-1.0F), (-551.57F), 0.0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.text.TextBlock", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      TextBlock textBlock0 = new TextBlock();
      Graphics2D graphics2D0 = mock(Graphics2D.class, new ViolatedAssumptionAnswer());
      TextBlockAnchor textBlockAnchor0 = mock(TextBlockAnchor.class, new ViolatedAssumptionAnswer());
      Graphics2D graphics2D1 = mock(Graphics2D.class, new ViolatedAssumptionAnswer());
      float float0 = (-2613.5386F);
      FontMetrics fontMetrics0 = mock(FontMetrics.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(fontMetrics0).getAscent();
      doReturn(0).when(fontMetrics0).getHeight();
      doReturn(0).when(fontMetrics0).stringWidth(anyString());
      Graphics2D graphics2D2 = mock(Graphics2D.class, new ViolatedAssumptionAnswer());
      doReturn(fontMetrics0, (FontMetrics) null).when(graphics2D2).getFontMetrics(any(java.awt.Font.class));
      float float1 = (-1249.818F);
      TextBlockAnchor textBlockAnchor1 = mock(TextBlockAnchor.class, new ViolatedAssumptionAnswer());
      Font font0 = mock(Font.class, new ViolatedAssumptionAnswer());
      Paint paint0 = mock(Paint.class, new ViolatedAssumptionAnswer());
      textBlock0.addLine("Null 'alignment' argument.", font0, paint0);
      float float2 = 1.0F;
      // Undeclared exception!
      try { 
        textBlock0.draw(graphics2D2, (-1249.818F), 1.0F, textBlockAnchor1, (-1249.818F), 1.0F, (double) (-1249.818F));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.text.TextUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      TextBlock textBlock0 = new TextBlock();
      TextBlock textBlock1 = new TextBlock();
      textBlock0.equals(textBlock1);
      TextBlockAnchor textBlockAnchor0 = mock(TextBlockAnchor.class, new ViolatedAssumptionAnswer());
      TextBlockAnchor textBlockAnchor1 = mock(TextBlockAnchor.class, new ViolatedAssumptionAnswer());
      textBlock0.draw((Graphics2D) null, 0.0F, 3324.347F, textBlockAnchor1);
      assertNotSame(textBlock0, textBlock1);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      TextBlock textBlock0 = new TextBlock();
      textBlock0.getLastLine();
      boolean boolean0 = textBlock0.equals((Object) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      TextBlock textBlock0 = new TextBlock();
      HorizontalAlignment horizontalAlignment0 = textBlock0.getLineAlignment();
      textBlock0.setLineAlignment(horizontalAlignment0);
      textBlock0.getLineAlignment();
      // Undeclared exception!
      try { 
        textBlock0.setLineAlignment((HorizontalAlignment) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'alignment' argument.
         //
         verifyException("org.jfree.chart.text.TextBlock", e);
      }
  }
}
