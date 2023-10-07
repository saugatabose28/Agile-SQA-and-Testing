/*
 * This file was automatically generated by EvoSuite
 * Tue May 16 05:29:03 GMT 2023
 */

package org.jfree.data.statistics;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jfree.data.statistics.HistogramBin;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class HistogramBin_ESTest extends HistogramBin_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      HistogramBin histogramBin0 = new HistogramBin((-1.0), 0.0);
      assertEquals((-1.0), histogramBin0.getStartBoundary(), 0.01);
      assertEquals(0, histogramBin0.getCount());
      assertEquals(0.0, histogramBin0.getEndBoundary(), 0.01);
      assertEquals(1.0, histogramBin0.getBinWidth(), 0.01);
      assertNotNull(histogramBin0);
      
      HistogramBin histogramBin1 = (HistogramBin)histogramBin0.clone();
      assertEquals((-1.0), histogramBin0.getStartBoundary(), 0.01);
      assertEquals(0, histogramBin0.getCount());
      assertEquals(0.0, histogramBin0.getEndBoundary(), 0.01);
      assertEquals(1.0, histogramBin0.getBinWidth(), 0.01);
      assertEquals(1.0, histogramBin1.getBinWidth(), 0.01);
      assertEquals((-1.0), histogramBin1.getStartBoundary(), 0.01);
      assertEquals(0.0, histogramBin1.getEndBoundary(), 0.01);
      assertEquals(0, histogramBin1.getCount());
      assertNotNull(histogramBin1);
      assertTrue(histogramBin1.equals((Object)histogramBin0));
      assertNotSame(histogramBin0, histogramBin1);
      assertNotSame(histogramBin1, histogramBin0);
      
      histogramBin0.incrementCount();
      assertEquals(1, histogramBin0.getCount());
      assertEquals((-1.0), histogramBin0.getStartBoundary(), 0.01);
      assertEquals(0.0, histogramBin0.getEndBoundary(), 0.01);
      assertEquals(1.0, histogramBin0.getBinWidth(), 0.01);
      assertFalse(histogramBin0.equals((Object)histogramBin1));
      assertNotSame(histogramBin0, histogramBin1);
      
      boolean boolean0 = histogramBin1.equals(histogramBin0);
      assertEquals(1, histogramBin0.getCount());
      assertEquals((-1.0), histogramBin0.getStartBoundary(), 0.01);
      assertEquals(0.0, histogramBin0.getEndBoundary(), 0.01);
      assertEquals(1.0, histogramBin0.getBinWidth(), 0.01);
      assertEquals(1.0, histogramBin1.getBinWidth(), 0.01);
      assertEquals((-1.0), histogramBin1.getStartBoundary(), 0.01);
      assertEquals(0.0, histogramBin1.getEndBoundary(), 0.01);
      assertEquals(0, histogramBin1.getCount());
      assertFalse(histogramBin0.equals((Object)histogramBin1));
      assertFalse(histogramBin1.equals((Object)histogramBin0));
      assertNotSame(histogramBin0, histogramBin1);
      assertNotSame(histogramBin1, histogramBin0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      HistogramBin histogramBin0 = new HistogramBin(0.0, 0.0);
      assertEquals(0.0, histogramBin0.getEndBoundary(), 0.01);
      assertEquals(0, histogramBin0.getCount());
      assertEquals(0.0, histogramBin0.getStartBoundary(), 0.01);
      assertEquals(0.0, histogramBin0.getBinWidth(), 0.01);
      assertNotNull(histogramBin0);
      
      HistogramBin histogramBin1 = new HistogramBin(2968.226, 2968.226);
      assertEquals(2968.226, histogramBin1.getStartBoundary(), 0.01);
      assertEquals(0, histogramBin1.getCount());
      assertEquals(2968.226, histogramBin1.getEndBoundary(), 0.01);
      assertEquals(0.0, histogramBin1.getBinWidth(), 0.01);
      assertNotNull(histogramBin1);
      assertFalse(histogramBin1.equals((Object)histogramBin0));
      
      boolean boolean0 = histogramBin0.equals(histogramBin1);
      assertEquals(0.0, histogramBin0.getEndBoundary(), 0.01);
      assertEquals(0, histogramBin0.getCount());
      assertEquals(0.0, histogramBin0.getStartBoundary(), 0.01);
      assertEquals(0.0, histogramBin0.getBinWidth(), 0.01);
      assertEquals(2968.226, histogramBin1.getStartBoundary(), 0.01);
      assertEquals(0, histogramBin1.getCount());
      assertEquals(2968.226, histogramBin1.getEndBoundary(), 0.01);
      assertEquals(0.0, histogramBin1.getBinWidth(), 0.01);
      assertFalse(histogramBin0.equals((Object)histogramBin1));
      assertFalse(histogramBin1.equals((Object)histogramBin0));
      assertNotSame(histogramBin0, histogramBin1);
      assertNotSame(histogramBin1, histogramBin0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      HistogramBin histogramBin0 = new HistogramBin(0.0, 0.0);
      assertEquals(0.0, histogramBin0.getStartBoundary(), 0.01);
      assertEquals(0.0, histogramBin0.getBinWidth(), 0.01);
      assertEquals(0, histogramBin0.getCount());
      assertEquals(0.0, histogramBin0.getEndBoundary(), 0.01);
      assertNotNull(histogramBin0);
      
      double double0 = histogramBin0.getStartBoundary();
      assertEquals(0.0, histogramBin0.getStartBoundary(), 0.01);
      assertEquals(0.0, histogramBin0.getBinWidth(), 0.01);
      assertEquals(0, histogramBin0.getCount());
      assertEquals(0.0, histogramBin0.getEndBoundary(), 0.01);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      HistogramBin histogramBin0 = new HistogramBin((-2942.10975406), 0.0);
      assertEquals(2942.10975406, histogramBin0.getBinWidth(), 0.01);
      assertEquals(0.0, histogramBin0.getEndBoundary(), 0.01);
      assertEquals((-2942.10975406), histogramBin0.getStartBoundary(), 0.01);
      assertEquals(0, histogramBin0.getCount());
      assertNotNull(histogramBin0);
      
      double double0 = histogramBin0.getStartBoundary();
      assertEquals(2942.10975406, histogramBin0.getBinWidth(), 0.01);
      assertEquals(0.0, histogramBin0.getEndBoundary(), 0.01);
      assertEquals((-2942.10975406), histogramBin0.getStartBoundary(), 0.01);
      assertEquals(0, histogramBin0.getCount());
      assertEquals((-2942.10975406), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      HistogramBin histogramBin0 = new HistogramBin(0.0, 0.0);
      assertEquals(0.0, histogramBin0.getBinWidth(), 0.01);
      assertEquals(0, histogramBin0.getCount());
      assertEquals(0.0, histogramBin0.getEndBoundary(), 0.01);
      assertEquals(0.0, histogramBin0.getStartBoundary(), 0.01);
      assertNotNull(histogramBin0);
      
      double double0 = histogramBin0.getEndBoundary();
      assertEquals(0.0, histogramBin0.getBinWidth(), 0.01);
      assertEquals(0, histogramBin0.getCount());
      assertEquals(0.0, histogramBin0.getEndBoundary(), 0.01);
      assertEquals(0.0, histogramBin0.getStartBoundary(), 0.01);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      HistogramBin histogramBin0 = new HistogramBin(597.1537, 597.1537);
      assertEquals(0.0, histogramBin0.getBinWidth(), 0.01);
      assertEquals(597.1537, histogramBin0.getStartBoundary(), 0.01);
      assertEquals(597.1537, histogramBin0.getEndBoundary(), 0.01);
      assertEquals(0, histogramBin0.getCount());
      assertNotNull(histogramBin0);
      
      double double0 = histogramBin0.getEndBoundary();
      assertEquals(0.0, histogramBin0.getBinWidth(), 0.01);
      assertEquals(597.1537, histogramBin0.getStartBoundary(), 0.01);
      assertEquals(597.1537, histogramBin0.getEndBoundary(), 0.01);
      assertEquals(0, histogramBin0.getCount());
      assertEquals(597.1537, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      HistogramBin histogramBin0 = new HistogramBin((-69.17), (-69.17));
      assertEquals(0, histogramBin0.getCount());
      assertEquals((-69.17), histogramBin0.getEndBoundary(), 0.01);
      assertEquals(0.0, histogramBin0.getBinWidth(), 0.01);
      assertEquals((-69.17), histogramBin0.getStartBoundary(), 0.01);
      assertNotNull(histogramBin0);
      
      histogramBin0.incrementCount();
      assertEquals(1, histogramBin0.getCount());
      assertEquals((-69.17), histogramBin0.getEndBoundary(), 0.01);
      assertEquals(0.0, histogramBin0.getBinWidth(), 0.01);
      assertEquals((-69.17), histogramBin0.getStartBoundary(), 0.01);
      
      int int0 = histogramBin0.getCount();
      assertEquals(1, histogramBin0.getCount());
      assertEquals((-69.17), histogramBin0.getEndBoundary(), 0.01);
      assertEquals(0.0, histogramBin0.getBinWidth(), 0.01);
      assertEquals((-69.17), histogramBin0.getStartBoundary(), 0.01);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      HistogramBin histogramBin0 = new HistogramBin((-2942.10975406), 0.0);
      assertEquals(2942.10975406, histogramBin0.getBinWidth(), 0.01);
      assertEquals(0.0, histogramBin0.getEndBoundary(), 0.01);
      assertEquals((-2942.10975406), histogramBin0.getStartBoundary(), 0.01);
      assertEquals(0, histogramBin0.getCount());
      assertNotNull(histogramBin0);
      
      double double0 = histogramBin0.getBinWidth();
      assertEquals(2942.10975406, histogramBin0.getBinWidth(), 0.01);
      assertEquals(0.0, histogramBin0.getEndBoundary(), 0.01);
      assertEquals((-2942.10975406), histogramBin0.getStartBoundary(), 0.01);
      assertEquals(0, histogramBin0.getCount());
      assertEquals(2942.10975406, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      HistogramBin histogramBin0 = new HistogramBin(3646.441355657717, 3646.441355657717);
      assertEquals(3646.441355657717, histogramBin0.getEndBoundary(), 0.01);
      assertEquals(3646.441355657717, histogramBin0.getStartBoundary(), 0.01);
      assertEquals(0, histogramBin0.getCount());
      assertEquals(0.0, histogramBin0.getBinWidth(), 0.01);
      assertNotNull(histogramBin0);
      
      HistogramBin histogramBin1 = new HistogramBin(3646.441355657717, 3646.441355657717);
      assertEquals(3646.441355657717, histogramBin1.getEndBoundary(), 0.01);
      assertEquals(0.0, histogramBin1.getBinWidth(), 0.01);
      assertEquals(0, histogramBin1.getCount());
      assertEquals(3646.441355657717, histogramBin1.getStartBoundary(), 0.01);
      assertNotNull(histogramBin1);
      assertTrue(histogramBin1.equals((Object)histogramBin0));
      
      boolean boolean0 = histogramBin0.equals(histogramBin1);
      assertEquals(3646.441355657717, histogramBin0.getEndBoundary(), 0.01);
      assertEquals(3646.441355657717, histogramBin0.getStartBoundary(), 0.01);
      assertEquals(0, histogramBin0.getCount());
      assertEquals(0.0, histogramBin0.getBinWidth(), 0.01);
      assertEquals(3646.441355657717, histogramBin1.getEndBoundary(), 0.01);
      assertEquals(0.0, histogramBin1.getBinWidth(), 0.01);
      assertEquals(0, histogramBin1.getCount());
      assertEquals(3646.441355657717, histogramBin1.getStartBoundary(), 0.01);
      assertTrue(histogramBin0.equals((Object)histogramBin1));
      assertTrue(histogramBin1.equals((Object)histogramBin0));
      assertNotSame(histogramBin0, histogramBin1);
      assertNotSame(histogramBin1, histogramBin0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      HistogramBin histogramBin0 = new HistogramBin((-69.17), (-69.17));
      assertEquals(0, histogramBin0.getCount());
      assertEquals((-69.17), histogramBin0.getStartBoundary(), 0.01);
      assertEquals((-69.17), histogramBin0.getEndBoundary(), 0.01);
      assertEquals(0.0, histogramBin0.getBinWidth(), 0.01);
      assertNotNull(histogramBin0);
      
      HistogramBin histogramBin1 = new HistogramBin((-69.17), (-0.6383894325049251));
      assertEquals((-0.6383894325049251), histogramBin1.getEndBoundary(), 0.01);
      assertEquals(0, histogramBin1.getCount());
      assertEquals((-69.17), histogramBin1.getStartBoundary(), 0.01);
      assertEquals(68.53161056749508, histogramBin1.getBinWidth(), 0.01);
      assertNotNull(histogramBin1);
      assertFalse(histogramBin1.equals((Object)histogramBin0));
      
      boolean boolean0 = histogramBin0.equals(histogramBin1);
      assertEquals(0, histogramBin0.getCount());
      assertEquals((-69.17), histogramBin0.getStartBoundary(), 0.01);
      assertEquals((-69.17), histogramBin0.getEndBoundary(), 0.01);
      assertEquals(0.0, histogramBin0.getBinWidth(), 0.01);
      assertEquals((-0.6383894325049251), histogramBin1.getEndBoundary(), 0.01);
      assertEquals(0, histogramBin1.getCount());
      assertEquals((-69.17), histogramBin1.getStartBoundary(), 0.01);
      assertEquals(68.53161056749508, histogramBin1.getBinWidth(), 0.01);
      assertFalse(histogramBin0.equals((Object)histogramBin1));
      assertFalse(histogramBin1.equals((Object)histogramBin0));
      assertNotSame(histogramBin0, histogramBin1);
      assertNotSame(histogramBin1, histogramBin0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      HistogramBin histogramBin0 = new HistogramBin(3646.441355657717, 3646.441355657717);
      assertEquals(3646.441355657717, histogramBin0.getStartBoundary(), 0.01);
      assertEquals(3646.441355657717, histogramBin0.getEndBoundary(), 0.01);
      assertEquals(0, histogramBin0.getCount());
      assertEquals(0.0, histogramBin0.getBinWidth(), 0.01);
      assertNotNull(histogramBin0);
      
      HistogramBin histogramBin1 = new HistogramBin(1392.0, 2320.571);
      assertEquals(1392.0, histogramBin1.getStartBoundary(), 0.01);
      assertEquals(2320.571, histogramBin1.getEndBoundary(), 0.01);
      assertEquals(928.5709999999999, histogramBin1.getBinWidth(), 0.01);
      assertEquals(0, histogramBin1.getCount());
      assertNotNull(histogramBin1);
      assertFalse(histogramBin1.equals((Object)histogramBin0));
      
      boolean boolean0 = histogramBin0.equals(histogramBin1);
      assertEquals(3646.441355657717, histogramBin0.getStartBoundary(), 0.01);
      assertEquals(3646.441355657717, histogramBin0.getEndBoundary(), 0.01);
      assertEquals(0, histogramBin0.getCount());
      assertEquals(0.0, histogramBin0.getBinWidth(), 0.01);
      assertEquals(1392.0, histogramBin1.getStartBoundary(), 0.01);
      assertEquals(2320.571, histogramBin1.getEndBoundary(), 0.01);
      assertEquals(928.5709999999999, histogramBin1.getBinWidth(), 0.01);
      assertEquals(0, histogramBin1.getCount());
      assertFalse(histogramBin0.equals((Object)histogramBin1));
      assertFalse(histogramBin1.equals((Object)histogramBin0));
      assertNotSame(histogramBin0, histogramBin1);
      assertNotSame(histogramBin1, histogramBin0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      HistogramBin histogramBin0 = new HistogramBin(3646.441355657717, 3646.441355657717);
      assertEquals(3646.441355657717, histogramBin0.getStartBoundary(), 0.01);
      assertEquals(0, histogramBin0.getCount());
      assertEquals(3646.441355657717, histogramBin0.getEndBoundary(), 0.01);
      assertEquals(0.0, histogramBin0.getBinWidth(), 0.01);
      assertNotNull(histogramBin0);
      
      boolean boolean0 = histogramBin0.equals("u'2N;>gRFPj7A,zJ|w'");
      assertEquals(3646.441355657717, histogramBin0.getStartBoundary(), 0.01);
      assertEquals(0, histogramBin0.getCount());
      assertEquals(3646.441355657717, histogramBin0.getEndBoundary(), 0.01);
      assertEquals(0.0, histogramBin0.getBinWidth(), 0.01);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      HistogramBin histogramBin0 = new HistogramBin((-3149.2), (-3149.2));
      boolean boolean0 = histogramBin0.equals((Object) null);
      assertFalse(boolean0);
      assertEquals(0.0, histogramBin0.getBinWidth(), 0.01);
      assertEquals(0, histogramBin0.getCount());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      HistogramBin histogramBin0 = new HistogramBin((-69.17), (-69.17));
      boolean boolean0 = histogramBin0.equals(histogramBin0);
      assertEquals(0.0, histogramBin0.getBinWidth(), 0.01);
      assertTrue(boolean0);
      assertEquals(0, histogramBin0.getCount());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      HistogramBin histogramBin0 = null;
      try {
        histogramBin0 = new HistogramBin(24.541280704515245, 1.0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // HistogramBin():  startBoundary > endBoundary.
         //
         verifyException("org.jfree.data.statistics.HistogramBin", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      HistogramBin histogramBin0 = new HistogramBin((-69.17), (-69.17));
      double double0 = histogramBin0.getEndBoundary();
      assertEquals((-69.17), double0, 0.01);
      assertEquals(0, histogramBin0.getCount());
      assertEquals((-69.17), histogramBin0.getStartBoundary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      HistogramBin histogramBin0 = new HistogramBin(3646.441355657717, 3646.441355657717);
      double double0 = histogramBin0.getBinWidth();
      assertEquals(0.0, double0, 0.01);
      assertEquals(0, histogramBin0.getCount());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      HistogramBin histogramBin0 = new HistogramBin(3646.441355657717, 3646.441355657717);
      double double0 = histogramBin0.getStartBoundary();
      assertEquals(3646.441355657717, histogramBin0.getEndBoundary(), 0.01);
      assertEquals(3646.441355657717, double0, 0.01);
      assertEquals(0, histogramBin0.getCount());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      HistogramBin histogramBin0 = new HistogramBin((-69.17), (-69.17));
      histogramBin0.incrementCount();
      HistogramBin histogramBin1 = new HistogramBin((-69.17), (-69.17));
      boolean boolean0 = histogramBin0.equals(histogramBin1);
      assertEquals(1, histogramBin0.getCount());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      HistogramBin histogramBin0 = new HistogramBin((-69.17), (-69.17));
      int int0 = histogramBin0.getCount();
      assertEquals(0, int0);
      assertEquals(0.0, histogramBin0.getBinWidth(), 0.01);
  }
}
