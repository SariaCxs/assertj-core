/*
 * Created on Sep 30, 2010
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 * 
 * Copyright @2010-2011 the original author or authors.
 */
package org.fest.assertions.api;

import static junit.framework.Assert.assertSame;
import static org.mockito.Mockito.verify;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

/**
 * Tests for <code>{@link AbstractIterableAssert#containsAll(Iterable)}</code>.
 * 
 * @author Joel Costigliola
 */
public class IterableAssert_containsAll_Test extends AbstractTest_for_IterableAssert {

  @Test
  public void should_verify_that_actual_contains_given_values() {
    List<Object> list = new ArrayList<Object>();
    list.add("Yoda");
    list.add("Luke");
    assertions.containsAll(list);
    verify(iterables).assertContainsAll(assertions.info, assertions.actual, list);
  }

  @Test
  public void should_return_this() {
    ConcreteIterableAssert<Object> returned = assertions.contains("Luke");
    assertSame(assertions, returned);
  }
}
