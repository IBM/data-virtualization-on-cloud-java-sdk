/*
 * (C) Copyright IBM Corp. 2021.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 */
package com.ibm.cloud.data_virtualization.v1.model;

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * Storage details of active caches.
 */
public class StorageDetailsEnabled extends GenericModel {

  protected Long size;
  protected Long count;

  /**
   * Gets the size.
   *
   * Total size of all active caches (in KB).
   *
   * @return the size
   */
  public Long getSize() {
    return size;
  }

  /**
   * Gets the count.
   *
   * Number of active caches.
   *
   * @return the count
   */
  public Long getCount() {
    return count;
  }
}

