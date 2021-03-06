/*
 * Copyright 2010 Google Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
/*
 * This code was generated by https://github.com/google/apis-client-generator/
 * (build: 2017-09-26 19:19:48 UTC)
 * on 2017-10-23 at 22:53:17 UTC 
 * Modify at your own risk.
 */

package com.cloudaware.cloudmine.appengine.model.cloudtasks;

/**
 * App Engine HTTP target.
 * <p>
 * The task will be delivered to the App Engine application hostname specified by its
 * AppEngineHttpTarget and AppEngineHttpRequest. The documentation for AppEngineHttpRequest explains
 * how the task's host URL is constructed.
 * <p>
 * Using AppEngineHttpTarget requires [`appengine.applications.get`](/appengine/docs/admin-api
 * /access-control) Google IAM permission for the project and the following scope:
 * <p>
 * `https://www.googleapis.com/auth/cloud-platform`
 * <p>
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Tasks API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class AppEngineHttpTarget {

    /**
     * Overrides for the task-level app_engine_routing.
     * <p>
     * If set, AppEngineHttpTarget.app_engine_routing_override is used for all tasks in the queue, no
     * matter what the setting is for the task-level app_engine_routing.
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private AppEngineRouting appEngineRoutingOverride;

    /**
     * Overrides for the task-level app_engine_routing.
     * <p>
     * If set, AppEngineHttpTarget.app_engine_routing_override is used for all tasks in the queue, no
     * matter what the setting is for the task-level app_engine_routing.
     *
     * @return value or {@code null} for none
     */
    public AppEngineRouting getAppEngineRoutingOverride() {
        return appEngineRoutingOverride;
    }

    /**
     * Overrides for the task-level app_engine_routing.
     * <p>
     * If set, AppEngineHttpTarget.app_engine_routing_override is used for all tasks in the queue, no
     * matter what the setting is for the task-level app_engine_routing.
     *
     * @param appEngineRoutingOverride appEngineRoutingOverride or {@code null} for none
     */
    public AppEngineHttpTarget setAppEngineRoutingOverride(AppEngineRouting appEngineRoutingOverride) {
        this.appEngineRoutingOverride = appEngineRoutingOverride;
        return this;
    }

}
