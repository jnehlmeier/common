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

/**
 * A mutable flag.
 */
@GwtCompatible
public final class Flag {

  private boolean state;

  /**
   * Creates a new flag that is false.
   */
  public Flag() {
    this(false);
  }

  /**
   * Creates a new flag with the given state.
   *
   * @param state the state of the new flag
   */
  public Flag(boolean state) {
    this.state = state;
  }

  /**
   * Sets this flag to true.
   */
  public void setTrue() {
    state = true;
  }

  /**
   * Sets this flag to false.
   */
  public void setFalse() {
    state = false;
  }

  /**
   * Toggles the state of this flag.
   */
  public void toggle() {
    state = !state;
  }

  /**
   * Checks if this flag is true.
   *
   * @return {@code true} if this flag is true
   */
  public boolean isTrue() {
    return state;
  }

  /**
   * Checks if this flag is false.
   *
   * @return {@code true} if this flag is false
   */
  public boolean isFalse() {
    return !state;
  }

}
