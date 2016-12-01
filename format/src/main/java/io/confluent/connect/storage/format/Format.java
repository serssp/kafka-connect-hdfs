/**
 * Copyright 2016 Confluent Inc.
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 **/

package io.confluent.connect.storage.format;

import org.apache.kafka.common.config.AbstractConfig;

import io.confluent.connect.storage.hive.HiveMetaStore;
import io.confluent.connect.storage.hive.HiveUtil;

public interface Format<T extends AbstractConfig, S, U extends HiveMetaStore> {
  RecordWriterProvider getRecordWriterProvider();

  SchemaFileReader getSchemaFileReader(S data);

  HiveUtil getHiveUtil(T config, S data, U hiveMetaStore);
}