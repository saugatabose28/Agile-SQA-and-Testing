/*
 * This file was automatically generated by EvoSuite
 * Tue May 16 05:22:46 GMT 2023
 */

package org.jfree.chart.renderer;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.geom.Point2D;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jfree.chart.renderer.Outlier;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Outlier_ESTest extends Outlier_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Outlier outlier0 = new Outlier(0.0, 0.0, 0.0);
      outlier0.setRadius(0.0);
      Point2D point2D0 = outlier0.getPoint();
      outlier0.setPoint(point2D0);
      outlier0.getPoint();
      outlier0.toString();
      Point2D point2D1 = outlier0.getPoint();
      Outlier outlier1 = new Outlier(0.0, (-1106.687), (-1106.687));
      outlier0.compareTo(outlier1);
      outlier1.compareTo(outlier0);
      outlier0.toString();
      outlier0.setPoint(point2D1);
      // Undeclared exception!
      try { 
        outlier1.compareTo((Object) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.renderer.Outlier", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Outlier outlier0 = new Outlier((-1261.434366365), (-2732.7715590119165), 1626.0670374501674);
      outlier0.setRadius((-3145.249309));
      Point2D point2D0 = outlier0.getPoint();
      outlier0.setPoint(point2D0);
      outlier0.setRadius(1.0);
      outlier0.getX();
      outlier0.toString();
      outlier0.toString();
      outlier0.equals(outlier0);
      outlier0.getY();
      outlier0.toString();
      outlier0.getX();
      Outlier outlier1 = new Outlier(0.0, 1626.0670374501674, (-4358.838596462084));
      outlier1.setPoint(point2D0);
      outlier1.setRadius((-1261.434366365));
      outlier0.compareTo(outlier1);
      outlier0.getRadius();
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Outlier outlier0 = new Outlier(1038.456790193825, 0.0, 1038.456790193825);
      outlier0.toString();
      outlier0.setRadius(0.0);
      outlier0.setRadius(1038.456790193825);
      Outlier outlier1 = new Outlier((-1867.2859), 2248.671, 2248.671);
      outlier1.setRadius(1038.456790193825);
      outlier0.setPoint((Point2D) null);
      outlier0.setRadius((-1867.2859));
      outlier0.setPoint((Point2D) null);
      // Undeclared exception!
      try { 
        outlier0.equals(outlier1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.renderer.Outlier", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Outlier outlier0 = new Outlier(3170.21627849263, 1.1, 1.0);
      Point2D point2D0 = outlier0.getPoint();
      outlier0.setPoint(point2D0);
      outlier0.setPoint(point2D0);
      Outlier outlier1 = new Outlier(1.1, 3170.21627849263, 1.0);
      outlier1.setPoint(point2D0);
      outlier0.setRadius((-3020.59));
      outlier1.setPoint(point2D0);
      outlier0.compareTo(outlier1);
      outlier1.getY();
      outlier1.getRadius();
      outlier0.equals(outlier1);
      outlier0.overlaps(outlier1);
      outlier1.getPoint();
      outlier0.toString();
      outlier1.setRadius(0.10000000000000009);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Outlier outlier0 = new Outlier((-1727.79), 1.0, 933.649864);
      outlier0.setPoint((Point2D) null);
      outlier0.getPoint();
      outlier0.setPoint((Point2D) null);
      outlier0.setRadius(0.0);
      // Undeclared exception!
      try { 
        outlier0.getX();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.renderer.Outlier", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Outlier outlier0 = new Outlier((-2490.091485), 1898.03401446, (-2490.091485));
      outlier0.setRadius(1898.03401446);
      outlier0.setRadius((-2490.091485));
      double double0 = 85.4766210783596;
      Outlier outlier1 = new Outlier(3228.0, 85.4766210783596, 1898.03401446);
      outlier0.compareTo(outlier1);
      outlier1.setPoint((Point2D) null);
      // Undeclared exception!
      try { 
        outlier1.getX();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.renderer.Outlier", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Outlier outlier0 = new Outlier(291.2, 291.2, 291.2);
      Outlier outlier1 = new Outlier(474.33434286992, 474.33434286992, 474.33434286992);
      outlier0.setRadius(291.2);
      Point2D point2D0 = outlier1.getPoint();
      outlier0.setPoint(point2D0);
      outlier1.overlaps(outlier0);
      Outlier outlier2 = new Outlier(474.33434286992, (-2731.853717557674), 291.2);
      outlier0.overlaps(outlier2);
      outlier0.getPoint();
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Outlier outlier0 = new Outlier(291.2, 291.2, 291.2);
      outlier0.overlaps(outlier0);
      Outlier outlier1 = new Outlier(474.33434286992, (-2731.853717557674), 291.2);
      outlier0.overlaps(outlier1);
      outlier0.getPoint();
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Outlier outlier0 = new Outlier((-1.0), (-1.0), 0.0);
      Outlier outlier1 = new Outlier((-1.0), (-1.0), (-1.0));
      Point2D point2D0 = outlier1.getPoint();
      outlier0.setRadius((-1.0));
      outlier1.setPoint(point2D0);
      outlier0.setPoint(point2D0);
      outlier0.setRadius(0.0);
      outlier0.setRadius((-1.0));
      outlier0.setRadius(0.0);
      outlier1.setRadius((-1598.857));
      outlier1.toString();
      outlier0.setRadius((-1598.857));
      outlier0.equals(outlier1);
      outlier0.setRadius(1375.400625);
      outlier0.toString();
      Point2D point2D1 = null;
      outlier0.setPoint((Point2D) null);
      outlier0.setPoint((Point2D) null);
      outlier0.getRadius();
      double double0 = 0.0;
      // Undeclared exception!
      try { 
        outlier0.toString();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.renderer.Outlier", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Outlier outlier0 = new Outlier(918.1, 918.1, 918.1);
      outlier0.toString();
      outlier0.setRadius(918.1);
      outlier0.setRadius(918.1);
      outlier0.equals((Object) null);
      outlier0.toString();
      Point2D point2D0 = outlier0.getPoint();
      outlier0.getRadius();
      outlier0.toString();
      outlier0.toString();
      outlier0.setPoint(point2D0);
      outlier0.setPoint(point2D0);
      outlier0.setPoint(point2D0);
      Outlier outlier1 = new Outlier(378.2085618702, 378.2085618702, 918.1);
      outlier1.setPoint(point2D0);
      outlier0.equals(outlier1);
      outlier1.setPoint(point2D0);
      outlier1.getX();
      outlier0.equals("{0.0,0.0}");
      outlier0.equals(point2D0);
      outlier1.getX();
      outlier0.getX();
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Outlier outlier0 = new Outlier(0.0, (-255.0), 0.0);
      outlier0.setRadius(0.0);
      Outlier outlier1 = new Outlier((-255.0), (-255.0), 0.0);
      Point2D point2D0 = outlier1.getPoint();
      outlier0.setPoint(point2D0);
      outlier0.setPoint(point2D0);
      outlier1.toString();
      outlier0.overlaps(outlier1);
      outlier1.getRadius();
      Outlier outlier2 = new Outlier(0.0, (-255.0), 1.0);
      outlier1.overlaps(outlier2);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Outlier outlier0 = new Outlier((-1.0), 0.0, 0.0);
      outlier0.setRadius(0.0);
      Point2D point2D0 = outlier0.getPoint();
      outlier0.setPoint(point2D0);
      Point2D point2D1 = outlier0.getPoint();
      outlier0.setPoint(point2D1);
      outlier0.getX();
      outlier0.getX();
      outlier0.getRadius();
      outlier0.setPoint(point2D1);
      outlier0.getRadius();
      outlier0.toString();
      outlier0.getRadius();
      outlier0.setRadius(839.7);
      outlier0.equals("{-1.0,0.0}");
      outlier0.setRadius(1.0);
      // Undeclared exception!
      try { 
        outlier0.overlaps((Outlier) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.renderer.Outlier", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Outlier outlier0 = new Outlier(0.0, 0.0, 2076.2017328416496);
      outlier0.setRadius(1605.13782);
      outlier0.getY();
      outlier0.getRadius();
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Outlier outlier0 = new Outlier((-1802.931), (-1802.931), 0.0);
      outlier0.toString();
      outlier0.getRadius();
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Outlier outlier0 = new Outlier(868.222868, 868.222868, (-3608.359826355826));
      outlier0.setRadius(868.222868);
      outlier0.equals("=n_{");
      outlier0.getY();
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Outlier outlier0 = new Outlier((-2944.0), (-2944.0), (-2944.0));
      outlier0.setRadius((-2944.0));
      Point2D point2D0 = outlier0.getPoint();
      outlier0.setPoint(point2D0);
      outlier0.setRadius((-2944.0));
      outlier0.getX();
      outlier0.getRadius();
      outlier0.getY();
      outlier0.getY();
      outlier0.setRadius(0.0);
      Outlier outlier1 = new Outlier(0.0, 163.437104, 1930.642789585256);
      outlier0.compareTo(outlier1);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Outlier outlier0 = new Outlier(1.0, 1.0, 1.0);
      outlier0.toString();
      Point2D point2D0 = null;
      outlier0.setPoint((Point2D) null);
      // Undeclared exception!
      try { 
        outlier0.getY();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.renderer.Outlier", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Outlier outlier0 = new Outlier((-249.793959), 0.0, (-383.92032786));
      outlier0.getX();
      // Undeclared exception!
      try { 
        outlier0.compareTo((Object) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.renderer.Outlier", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Outlier outlier0 = new Outlier(1.0, 1.0, (-1.0));
      outlier0.setRadius(0.0);
      Outlier outlier1 = new Outlier((-1.0), (-1.0), (-914.567531083846));
      outlier1.setRadius(1.1);
      outlier0.setRadius((-936.8327971548831));
      outlier0.overlaps(outlier1);
      outlier1.compareTo(outlier0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Outlier outlier0 = new Outlier(370.652983178, 370.652983178, (-1.0));
      Outlier outlier1 = new Outlier(370.652983178, 1976.254654931, 370.652983178);
      outlier0.overlaps(outlier1);
      Point2D point2D0 = outlier0.getPoint();
      outlier0.setPoint(point2D0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Outlier outlier0 = new Outlier((-1.0), (-2278.46869748), 3163.0);
      outlier0.toString();
      outlier0.getX();
      Outlier outlier1 = new Outlier((-3164.0), (-1.0), 3163.0);
      Point2D point2D0 = outlier1.getPoint();
      outlier1.setRadius(1358.8994419394);
      outlier1.setPoint(point2D0);
      outlier1.setRadius(3163.0);
      outlier1.toString();
      outlier0.compareTo(outlier1);
      outlier0.setPoint(point2D0);
      Point2D point2D1 = outlier0.getPoint();
      outlier0.setPoint(point2D1);
      outlier1.getPoint();
      outlier0.overlaps(outlier1);
      outlier0.toString();
      outlier1.toString();
      outlier1.equals("{-6327.0,-3164.0}");
      outlier0.getRadius();
      outlier1.equals(point2D0);
      outlier0.getRadius();
      outlier1.setRadius((-3164.0));
      // Undeclared exception!
      try { 
        outlier1.compareTo("{-6327.0,-3164.0}");
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.lang.String cannot be cast to org.jfree.chart.renderer.Outlier
         //
         verifyException("org.jfree.chart.renderer.Outlier", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Outlier outlier0 = new Outlier((-1.0), (-1.0), (-1.0));
      Outlier outlier1 = new Outlier((-1.0), (-1.0), 208.0);
      outlier0.equals(outlier1);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Outlier outlier0 = new Outlier(1.1, 1.0, 1.1);
      Outlier outlier1 = new Outlier(0.0, 1.1, 0.0);
      outlier0.compareTo(outlier1);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Outlier outlier0 = new Outlier(0.0, 0.0, 0.0);
      Outlier outlier1 = new Outlier(0.0, 0.0, 0.0);
      outlier0.compareTo(outlier1);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Outlier outlier0 = new Outlier(1.0, 1.0, 1.0);
      outlier0.getRadius();
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Outlier outlier0 = new Outlier(926.783938054953, 926.783938054953, 3211.61856569);
      Point2D point2D0 = outlier0.getPoint();
      outlier0.setPoint(point2D0);
      outlier0.toString();
      Outlier outlier1 = new Outlier(926.783938054953, 3211.61856569, 0.0);
      outlier1.setRadius(0.0);
      outlier0.overlaps(outlier1);
      outlier0.equals("{-2284.834627635047,-2284.834627635047}");
      outlier0.setRadius(0.0);
      outlier1.setPoint(point2D0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Outlier outlier0 = new Outlier(6491.865278492631, 0.0, 6491.865278492631);
      Outlier outlier1 = new Outlier(6491.865278492631, (-0.20634018046450794), (-1.0));
      outlier0.compareTo(outlier1);
      outlier0.toString();
      outlier1.toString();
      outlier0.getPoint();
      outlier1.getPoint();
      Point2D point2D0 = outlier1.getPoint();
      Outlier outlier2 = new Outlier(0.0, 0.0, 155.2212514722);
      outlier0.toString();
      outlier2.toString();
      outlier2.toString();
      outlier1.setRadius(155.2212514722);
      outlier1.setPoint(point2D0);
      outlier0.compareTo(outlier2);
      // Undeclared exception!
      try { 
        outlier2.compareTo("{6492.865278492631,0.793659819535492}");
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.lang.String cannot be cast to org.jfree.chart.renderer.Outlier
         //
         verifyException("org.jfree.chart.renderer.Outlier", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Outlier outlier0 = new Outlier(3108.600817949, 3108.600817949, 2057.6797478871);
      Point2D point2D0 = outlier0.getPoint();
      outlier0.setPoint(point2D0);
      outlier0.toString();
      Outlier outlier1 = new Outlier(2057.6797478871, 3108.600817949, (-2948.188));
      outlier0.setRadius((-1.0));
      outlier1.setPoint(point2D0);
      outlier0.equals(outlier1);
      outlier0.setRadius((-2948.188));
      outlier0.getPoint();
      outlier1.setPoint(point2D0);
      outlier0.toString();
      outlier1.getPoint();
      outlier0.equals("{1050.9210700619,1050.9210700619}");
      outlier1.getY();
      outlier0.getX();
      // Undeclared exception!
      try { 
        outlier1.compareTo(point2D0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.awt.geom.Point2D$Double cannot be cast to org.jfree.chart.renderer.Outlier
         //
         verifyException("org.jfree.chart.renderer.Outlier", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Outlier outlier0 = new Outlier(0.0, 0.0, (-39.1));
      outlier0.toString();
      Point2D point2D0 = outlier0.getPoint();
      outlier0.setRadius((-39.1));
      outlier0.toString();
      outlier0.setPoint(point2D0);
      outlier0.getY();
      outlier0.toString();
      outlier0.toString();
      outlier0.setPoint(point2D0);
      outlier0.setPoint(point2D0);
      outlier0.overlaps(outlier0);
      outlier0.getX();
      outlier0.compareTo(outlier0);
      outlier0.setRadius(3911.454);
      outlier0.toString();
      outlier0.equals(outlier0);
      outlier0.setPoint(point2D0);
      outlier0.getX();
      outlier0.setPoint(point2D0);
      outlier0.getRadius();
      outlier0.getRadius();
      outlier0.setPoint(point2D0);
      outlier0.getPoint();
      outlier0.getPoint();
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Outlier outlier0 = new Outlier((-501.97635062126), 1.0, 1.0);
      Outlier outlier1 = new Outlier((-691.684492451), 0.0, (-1584.979459));
      outlier0.overlaps(outlier1);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Outlier outlier0 = new Outlier(481.43, 0.0, 0.0);
      outlier0.toString();
      Outlier outlier1 = new Outlier(0.0, (-1567.5116560187), 0.0);
      Point2D point2D0 = outlier1.getPoint();
      outlier0.toString();
      outlier0.setPoint(point2D0);
      outlier1.setPoint(point2D0);
      outlier0.equals(outlier1);
      outlier1.overlaps(outlier0);
      outlier1.toString();
      outlier0.setPoint(point2D0);
      outlier1.getPoint();
      outlier1.toString();
      outlier1.getRadius();
      outlier1.overlaps(outlier0);
      Outlier outlier2 = new Outlier(481.43, (-1567.5116560187), 1492.358098);
      outlier0.overlaps(outlier2);
      Outlier outlier3 = new Outlier(481.43, 1492.358098, 0.0);
      outlier0.equals(outlier3);
      outlier1.equals("{481.43,0.0}");
      outlier0.equals("{481.43,0.0}");
      outlier0.setPoint(point2D0);
      // Undeclared exception!
      try { 
        outlier2.compareTo("&@^{+}aVNI");
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.lang.String cannot be cast to org.jfree.chart.renderer.Outlier
         //
         verifyException("org.jfree.chart.renderer.Outlier", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Outlier outlier0 = new Outlier((-2944.0), (-2944.0), (-2944.0));
      Point2D point2D0 = outlier0.getPoint();
      outlier0.setPoint(point2D0);
      outlier0.setRadius((-2944.0));
      outlier0.setPoint(point2D0);
      outlier0.setRadius((-2944.0));
      outlier0.getY();
      outlier0.getY();
      outlier0.setRadius(0.0);
      Outlier outlier1 = new Outlier(0.0, 163.437104, 1930.642789585256);
      outlier0.compareTo(outlier1);
      assertEquals(0.0, outlier0.getRadius(), 0.01);
      
      outlier1.toString();
      outlier1.getPoint();
      outlier1.getPoint();
      assertEquals((-1767.2056855852559), outlier1.getY(), 0.01);
  }
}
