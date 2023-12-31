/*
 * This file was automatically generated by EvoSuite
 * Tue May 16 06:26:24 GMT 2023
 */

package org.jfree.chart.encoders;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.image.BufferedImage;
import java.io.OutputStream;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.mock.java.io.MockPrintStream;
import org.jfree.chart.encoders.SunPNGEncoderAdapter;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class SunPNGEncoderAdapter_ESTest extends SunPNGEncoderAdapter_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      SunPNGEncoderAdapter sunPNGEncoderAdapter0 = new SunPNGEncoderAdapter();
      BufferedImage bufferedImage0 = new BufferedImage(1, 1, 1);
      MockFile mockFile0 = new MockFile("?V|$g5<YNm^voy><", "?V|$g5<YNm^voy><");
      MockPrintStream mockPrintStream0 = new MockPrintStream(mockFile0);
      sunPNGEncoderAdapter0.encode(bufferedImage0, (OutputStream) mockPrintStream0);
      assertEquals(69L, mockFile0.length());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      SunPNGEncoderAdapter sunPNGEncoderAdapter0 = new SunPNGEncoderAdapter();
      BufferedImage bufferedImage0 = new BufferedImage(1, 1, 1);
      byte[] byteArray0 = sunPNGEncoderAdapter0.encode(bufferedImage0);
      assertEquals(69, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      SunPNGEncoderAdapter sunPNGEncoderAdapter0 = new SunPNGEncoderAdapter();
      sunPNGEncoderAdapter0.setQuality(0.0F);
      assertFalse(sunPNGEncoderAdapter0.isEncodingAlpha());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      SunPNGEncoderAdapter sunPNGEncoderAdapter0 = new SunPNGEncoderAdapter();
      sunPNGEncoderAdapter0.setEncodingAlpha(true);
      assertFalse(sunPNGEncoderAdapter0.isEncodingAlpha());
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      SunPNGEncoderAdapter sunPNGEncoderAdapter0 = new SunPNGEncoderAdapter();
      // Undeclared exception!
      try { 
        sunPNGEncoderAdapter0.encode((BufferedImage) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'bufferedImage' argument.
         //
         verifyException("org.jfree.chart.util.Args", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      SunPNGEncoderAdapter sunPNGEncoderAdapter0 = new SunPNGEncoderAdapter();
      // Undeclared exception!
      try { 
        sunPNGEncoderAdapter0.encode((BufferedImage) null, (OutputStream) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'bufferedImage' argument.
         //
         verifyException("org.jfree.chart.util.Args", e);
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      SunPNGEncoderAdapter sunPNGEncoderAdapter0 = new SunPNGEncoderAdapter();
      float float0 = sunPNGEncoderAdapter0.getQuality();
      assertEquals(0.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      SunPNGEncoderAdapter sunPNGEncoderAdapter0 = new SunPNGEncoderAdapter();
      boolean boolean0 = sunPNGEncoderAdapter0.isEncodingAlpha();
      assertFalse(boolean0);
  }
}
