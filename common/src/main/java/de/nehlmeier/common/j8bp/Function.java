/**
 * Copyright 2014 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package de.nehlmeier.common.j8bp;

import com.google.common.annotations.GwtCompatible;

/**
 * <p>Backport of Java 8 Function interface.</p>
 *
 * <p>Represents a function that accepts one argument and produces a result.</p>
 *
 * @param <I> the type of the input
 * @param <O> the type of the output
 */
@GwtCompatible
public interface Function<I, O> {

  /**
   * Applies this function to the given argument.
   *
   * @param input the input argument
   * @return the function result
   */
  O apply(I input);
}
