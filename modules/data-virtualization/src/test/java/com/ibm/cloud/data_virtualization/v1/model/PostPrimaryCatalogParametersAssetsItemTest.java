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

import com.ibm.cloud.data_virtualization.v1.model.PostPrimaryCatalogParametersAssetsItem;
import com.ibm.cloud.data_virtualization.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the PostPrimaryCatalogParametersAssetsItem model.
 */
public class PostPrimaryCatalogParametersAssetsItemTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testPostPrimaryCatalogParametersAssetsItem() throws Throwable {
    PostPrimaryCatalogParametersAssetsItem postPrimaryCatalogParametersAssetsItemModel = new PostPrimaryCatalogParametersAssetsItem.Builder()
      .schema("db2inst1")
      .table("EMPLOYEE")
      .build();
    assertEquals(postPrimaryCatalogParametersAssetsItemModel.schema(), "db2inst1");
    assertEquals(postPrimaryCatalogParametersAssetsItemModel.table(), "EMPLOYEE");

    String json = TestUtilities.serialize(postPrimaryCatalogParametersAssetsItemModel);

    PostPrimaryCatalogParametersAssetsItem postPrimaryCatalogParametersAssetsItemModelNew = TestUtilities.deserialize(json, PostPrimaryCatalogParametersAssetsItem.class);
    assertTrue(postPrimaryCatalogParametersAssetsItemModelNew instanceof PostPrimaryCatalogParametersAssetsItem);
    assertEquals(postPrimaryCatalogParametersAssetsItemModelNew.schema(), "db2inst1");
    assertEquals(postPrimaryCatalogParametersAssetsItemModelNew.table(), "EMPLOYEE");
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testPostPrimaryCatalogParametersAssetsItemError() throws Throwable {
    new PostPrimaryCatalogParametersAssetsItem.Builder().build();
  }

}