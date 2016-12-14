/**
 * Copyright 2016 IBM Corp. All Rights Reserved.
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

package com.ibm.watson.developer_cloud.discovery.v1.model.configuration;

import static com.ibm.watson.developer_cloud.discovery.v1.model.configuration.ConfigurationManager.*;

import com.google.gson.annotations.SerializedName;
import com.ibm.watson.developer_cloud.service.model.GenericModel;

import java.util.List;

/**
 * Response from {@link GetConfigurationsRequest}
 *
 */
public class GetConfigurationsResponse extends GenericModel {
    @SerializedName(CONFIGURATIONS)
    private List<Configuration> configurations;

    public List<Configuration> getConfigurations() {
        return configurations;
    }
}
