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
package de.nehlmeier.common.util;

import com.google.common.annotations.GwtCompatible;

import static com.google.common.base.Preconditions.checkArgument;

/**
 * A mutable counter.
 */
@GwtCompatible
public final class Counter {

  private int counter;

  /**
   * Creates a new counter with initial value of zero.
   */
  public Counter() {
    this(0);
  }

  /**
   * Creates a new counter with an initial value
   *
   * @param initial the initial value
   */
  public Counter(int initial) {
    counter = initial;
  }

  /**
   * Increases this counter by one
   */
  public void inc() {
    counter++;
  }

  /**
   * Increases this counter using the provided <code>amount</code>
   *
   * @param amount the amount argument
   * @throws java.lang.IllegalArgumentException if amount < 1
   */
  public void inc(int amount) {
    checkArgument(amount >= 1, "amount should be >= 1");
    counter += amount;
  }

  /**
   * Decreases this counter by one
   */
  public void dec() {
    counter--;
  }

  /**
   * Decreases this counter using the provided <code>amount</code>
   *
   * @param amount the amount argument
   * @throws java.lang.IllegalArgumentException if amount < 1
   */
  public void dec(int amount) {
    checkArgument(amount >= 1, "amount should be >= 1");
    counter -= amount;
  }

  /**
   * Returns the current value of this counter.
   *
   * @return the counter value
   */
  public int value() {
    return counter;
  }

  /**
   * Checks if this counter is zero.
   *
   * @return <code>true</code> if the counter is zero
   */
  public boolean isZero() {
    return counter == 0;
  }

}
