/*
 * This file was automatically generated by EvoSuite
 * Tue May 16 06:28:24 GMT 2023
 */

package org.jfree.chart.block;

import org.junit.Test;
import static org.junit.Assert.*;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jfree.chart.block.BlockResult;
import org.jfree.chart.entity.ChartEntity;
import org.jfree.chart.entity.EntityCollection;
import org.jfree.chart.entity.StandardEntityCollection;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class BlockResult_ESTest extends BlockResult_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      BlockResult blockResult0 = new BlockResult();
      StandardEntityCollection standardEntityCollection0 = new StandardEntityCollection();
      blockResult0.setEntityCollection(standardEntityCollection0);
      EntityCollection entityCollection0 = blockResult0.getEntityCollection();
      assertSame(entityCollection0, standardEntityCollection0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      BlockResult blockResult0 = new BlockResult();
      StandardEntityCollection standardEntityCollection0 = new StandardEntityCollection();
      Point2D.Double point2D_Double0 = new Point2D.Double(0.0, (-790.6576358841256));
      Line2D.Float line2D_Float0 = new Line2D.Float(point2D_Double0, point2D_Double0);
      ChartEntity chartEntity0 = new ChartEntity(line2D_Float0, "Z");
      standardEntityCollection0.add(chartEntity0);
      blockResult0.setEntityCollection(standardEntityCollection0);
      EntityCollection entityCollection0 = blockResult0.getEntityCollection();
      assertEquals(1, entityCollection0.getEntityCount());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      BlockResult blockResult0 = new BlockResult();
      EntityCollection entityCollection0 = blockResult0.getEntityCollection();
      assertNull(entityCollection0);
  }
}
