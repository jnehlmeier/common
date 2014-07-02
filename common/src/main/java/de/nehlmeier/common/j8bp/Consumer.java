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
 * <p>Backport of Java 8 Consumer interface.</p>
 *
 * <p>Represents an operation that accepts a single input argument
 * and returns no result.</p>
 *
 * @param <I> the type of the input
 */
@GwtCompatible
public interface Consumer<I> {

  /**
   * Performs this operation on the given argument.
   *
   * @param input the input argument
   */
  void accept(I input);
}
