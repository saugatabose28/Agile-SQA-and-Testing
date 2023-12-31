/*
 * This file was automatically generated by EvoSuite
 * Tue May 16 05:25:40 GMT 2023
 */

package org.jfree.chart.event;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.jfree.chart.annotations.Annotation;
import org.jfree.chart.event.AnnotationChangeEvent;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class AnnotationChangeEvent_ESTest extends AnnotationChangeEvent_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      AnnotationChangeEvent annotationChangeEvent0 = null;
      try {
        annotationChangeEvent0 = new AnnotationChangeEvent("dfzDZqD6{zpS}", (Annotation) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'annotation' argument.
         //
         verifyException("org.jfree.chart.util.Args", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Annotation annotation0 = mock(Annotation.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(annotation0).toString();
      AnnotationChangeEvent annotationChangeEvent0 = new AnnotationChangeEvent("", annotation0);
      Annotation annotation1 = annotationChangeEvent0.getAnnotation();
      assertSame(annotation1, annotation0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Annotation annotation0 = mock(Annotation.class, new ViolatedAssumptionAnswer());
      AnnotationChangeEvent annotationChangeEvent0 = null;
      try {
        annotationChangeEvent0 = new AnnotationChangeEvent((Object) null, annotation0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // null source
         //
         verifyException("java.util.EventObject", e);
      }
  }
}
