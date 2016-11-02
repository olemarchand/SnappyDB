/*
 * Copyright (C) 2013 Nabil HACHICHA.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.snappydb;

/**
 * Exception thrown when a 'get' operation is performed but the provided key does not exist in the
 * database.
 *
 * @see DB#exists(String) to check for a key's existence.
 */
public class KeyNotFoundException extends SnappydbException {

  private static final long serialVersionUID = 1L;

  private final String key;

  public KeyNotFoundException(String key) {
    super("Requested key '" + key + "' does not exist");
    this.key = key;
  }

  public String getKey() {
    return key;
  }
}
