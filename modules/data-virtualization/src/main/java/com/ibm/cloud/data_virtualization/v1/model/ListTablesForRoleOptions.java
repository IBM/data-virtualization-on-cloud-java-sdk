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
 * The listTablesForRole options.
 */
public class ListTablesForRoleOptions extends GenericModel {

  protected String rolename;

  /**
   * Builder.
   */
  public static class Builder {
    private String rolename;

    private Builder(ListTablesForRoleOptions listTablesForRoleOptions) {
      this.rolename = listTablesForRoleOptions.rolename;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param rolename the rolename
     */
    public Builder(String rolename) {
      this.rolename = rolename;
    }

    /**
     * Builds a ListTablesForRoleOptions.
     *
     * @return the new ListTablesForRoleOptions instance
     */
    public ListTablesForRoleOptions build() {
      return new ListTablesForRoleOptions(this);
    }

    /**
     * Set the rolename.
     *
     * @param rolename the rolename
     * @return the ListTablesForRoleOptions builder
     */
    public Builder rolename(String rolename) {
      this.rolename = rolename;
      return this;
    }
  }

  protected ListTablesForRoleOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.rolename,
      "rolename cannot be null");
    rolename = builder.rolename;
  }

  /**
   * New builder.
   *
   * @return a ListTablesForRoleOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the rolename.
   *
   * Data Virtualization has four roles: MANAGER, STEWARD, ENGINEER and USER The value of rolename should be one of
   * them.
   *
   * @return the rolename
   */
  public String rolename() {
    return rolename;
  }
}

