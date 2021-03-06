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
 * App Engine Routing.
 * <p>
 * For more information about services, versions, and instances see [An Overview of App
 * Engine](/appengine/docs/python/an-overview-of-app-engine), [Microservices Architecture on Google
 * App Engine](/appengine/docs/python/microservices-on-app-engine), [App Engine Standard request
 * routing](/appengine/docs/standard/python/how-requests-are-routed), and [App Engine Flex request
 * routing](/appengine/docs/flexible/python/how-requests-are-routed).
 * <p>
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Tasks API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class AppEngineRouting {

    /**
     * Output only.
     * <p>
     * The host that the task is sent to. For more information, see [How Requests are
     * Routed](/appengine/docs/standard/python/how-requests-are-routed).
     * <p>
     * The host is constructed as:
     * <p>
     * * `host = [application_domain_name]`   `| [service] + '.' + [application_domain_name]`   `|
     * [version] + '.' + [application_domain_name]`   `| [version_dot_service]+ '.' +
     * [application_domain_name]`   `| [instance] + '.' + [application_domain_name]`   `|
     * [instance_dot_service] + '.' + [application_domain_name]`   `| [instance_dot_version] + '.' +
     * [application_domain_name]`   `| [instance_dot_version_dot_service] + '.' +
     * [application_domain_name]`
     * <p>
     * * `application_domain_name` = The domain name of the app, for   example .appspot.com, which is
     * associated with the   queue's project ID. Some tasks which were created using the App Engine
     * SDK use a custom domain name.
     * <p>
     * * `service =` AppEngineRouting.service
     * <p>
     * * `version =` AppEngineRouting.version
     * <p>
     * * `version_dot_service =`   AppEngineRouting.version `+ '.' +` AppEngineRouting.service
     * <p>
     * * `instance =` AppEngineRouting.instance
     * <p>
     * * `instance_dot_service =`   AppEngineRouting.instance `+ '.' +` AppEngineRouting.service
     * <p>
     * * `instance_dot_version =`   AppEngineRouting.instance `+ '.' +` AppEngineRouting.version
     * <p>
     * * `instance_dot_version_dot_service =`   AppEngineRouting.instance `+ '.' +`
     * AppEngineRouting.version `+ '.' +` AppEngineRouting.service
     * <p>
     * If AppEngineRouting.service is empty, then the task will be sent to the service which is the
     * default service when the task is attempted.
     * <p>
     * If AppEngineRouting.version is empty, then the task will be sent to the version which is the
     * default version when the task is attempted.
     * <p>
     * If AppEngineRouting.instance is empty, then the task will be sent to an instance which is
     * available when the task is attempted.
     * <p>
     * When AppEngineRouting.service is "default", AppEngineRouting.version is "default", and
     * AppEngineRouting.instance is empty, AppEngineRouting.host is shortened to just the
     * `application_domain_name`.
     * <p>
     * If AppEngineRouting.service, AppEngineRouting.version, or AppEngineRouting.instance is invalid,
     * then the task will be sent to the default version of the default service when the task is
     * attempted.
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private String host;

    /**
     * App instance.
     * <p>
     * By default, the task is sent to an instance which is available when the task is attempted.
     * <p>
     * Requests can only be sent to a specific instance if [manual scaling is used in App Engine
     * Standard](/appengine/docs/python/an-overview-of-app-
     * engine?hl=en_US#scaling_types_and_instance_classes). App Engine Flex does not support
     * instances. For more information, see [App Engine Standard request
     * routing](/appengine/docs/standard/python/how-requests-are-routed) and [App Engine Flex request
     * routing](/appengine/docs/flexible/python/how-requests-are-routed).
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private String instance;

    /**
     * App service.
     * <p>
     * By default, the task is sent to the service which is the default service when the task is
     * attempted ("default").
     * <p>
     * For some queues or tasks which were created using the App Engine Task Queue API,
     * AppEngineRouting.host is not parsable into AppEngineRouting.service, AppEngineRouting.version,
     * and AppEngineRouting.instance. For example, some tasks which were created using the App Engine
     * SDK use a custom domain name; custom domains are not parsed by Cloud Tasks. If
     * AppEngineRouting.host is not parsable, then AppEngineRouting.service, AppEngineRouting.version,
     * and AppEngineRouting.instance are the empty string.
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private String service;

    /**
     * App version.
     * <p>
     * By default, the task is sent to the version which is the default version when the task is
     * attempted ("default").
     * <p>
     * For some queues or tasks which were created using the App Engine Task Queue API,
     * AppEngineRouting.host is not parsable into AppEngineRouting.service, AppEngineRouting.version,
     * and AppEngineRouting.instance. For example, some tasks which were created using the App Engine
     * SDK use a custom domain name; custom domains are not parsed by Cloud Tasks. If
     * AppEngineRouting.host is not parsable, then AppEngineRouting.service, AppEngineRouting.version,
     * and AppEngineRouting.instance are the empty string.
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private String version;

    /**
     * Output only.
     * <p>
     * The host that the task is sent to. For more information, see [How Requests are
     * Routed](/appengine/docs/standard/python/how-requests-are-routed).
     * <p>
     * The host is constructed as:
     * <p>
     * * `host = [application_domain_name]`   `| [service] + '.' + [application_domain_name]`   `|
     * [version] + '.' + [application_domain_name]`   `| [version_dot_service]+ '.' +
     * [application_domain_name]`   `| [instance] + '.' + [application_domain_name]`   `|
     * [instance_dot_service] + '.' + [application_domain_name]`   `| [instance_dot_version] + '.' +
     * [application_domain_name]`   `| [instance_dot_version_dot_service] + '.' +
     * [application_domain_name]`
     * <p>
     * * `application_domain_name` = The domain name of the app, for   example .appspot.com, which is
     * associated with the   queue's project ID. Some tasks which were created using the App Engine
     * SDK use a custom domain name.
     * <p>
     * * `service =` AppEngineRouting.service
     * <p>
     * * `version =` AppEngineRouting.version
     * <p>
     * * `version_dot_service =`   AppEngineRouting.version `+ '.' +` AppEngineRouting.service
     * <p>
     * * `instance =` AppEngineRouting.instance
     * <p>
     * * `instance_dot_service =`   AppEngineRouting.instance `+ '.' +` AppEngineRouting.service
     * <p>
     * * `instance_dot_version =`   AppEngineRouting.instance `+ '.' +` AppEngineRouting.version
     * <p>
     * * `instance_dot_version_dot_service =`   AppEngineRouting.instance `+ '.' +`
     * AppEngineRouting.version `+ '.' +` AppEngineRouting.service
     * <p>
     * If AppEngineRouting.service is empty, then the task will be sent to the service which is the
     * default service when the task is attempted.
     * <p>
     * If AppEngineRouting.version is empty, then the task will be sent to the version which is the
     * default version when the task is attempted.
     * <p>
     * If AppEngineRouting.instance is empty, then the task will be sent to an instance which is
     * available when the task is attempted.
     * <p>
     * When AppEngineRouting.service is "default", AppEngineRouting.version is "default", and
     * AppEngineRouting.instance is empty, AppEngineRouting.host is shortened to just the
     * `application_domain_name`.
     * <p>
     * If AppEngineRouting.service, AppEngineRouting.version, or AppEngineRouting.instance is invalid,
     * then the task will be sent to the default version of the default service when the task is
     * attempted.
     *
     * @return value or {@code null} for none
     */
    public String getHost() {
        return host;
    }

    /**
     * Output only.
     * <p>
     * The host that the task is sent to. For more information, see [How Requests are
     * Routed](/appengine/docs/standard/python/how-requests-are-routed).
     * <p>
     * The host is constructed as:
     * <p>
     * * `host = [application_domain_name]`   `| [service] + '.' + [application_domain_name]`   `|
     * [version] + '.' + [application_domain_name]`   `| [version_dot_service]+ '.' +
     * [application_domain_name]`   `| [instance] + '.' + [application_domain_name]`   `|
     * [instance_dot_service] + '.' + [application_domain_name]`   `| [instance_dot_version] + '.' +
     * [application_domain_name]`   `| [instance_dot_version_dot_service] + '.' +
     * [application_domain_name]`
     * <p>
     * * `application_domain_name` = The domain name of the app, for   example .appspot.com, which is
     * associated with the   queue's project ID. Some tasks which were created using the App Engine
     * SDK use a custom domain name.
     * <p>
     * * `service =` AppEngineRouting.service
     * <p>
     * * `version =` AppEngineRouting.version
     * <p>
     * * `version_dot_service =`   AppEngineRouting.version `+ '.' +` AppEngineRouting.service
     * <p>
     * * `instance =` AppEngineRouting.instance
     * <p>
     * * `instance_dot_service =`   AppEngineRouting.instance `+ '.' +` AppEngineRouting.service
     * <p>
     * * `instance_dot_version =`   AppEngineRouting.instance `+ '.' +` AppEngineRouting.version
     * <p>
     * * `instance_dot_version_dot_service =`   AppEngineRouting.instance `+ '.' +`
     * AppEngineRouting.version `+ '.' +` AppEngineRouting.service
     * <p>
     * If AppEngineRouting.service is empty, then the task will be sent to the service which is the
     * default service when the task is attempted.
     * <p>
     * If AppEngineRouting.version is empty, then the task will be sent to the version which is the
     * default version when the task is attempted.
     * <p>
     * If AppEngineRouting.instance is empty, then the task will be sent to an instance which is
     * available when the task is attempted.
     * <p>
     * When AppEngineRouting.service is "default", AppEngineRouting.version is "default", and
     * AppEngineRouting.instance is empty, AppEngineRouting.host is shortened to just the
     * `application_domain_name`.
     * <p>
     * If AppEngineRouting.service, AppEngineRouting.version, or AppEngineRouting.instance is invalid,
     * then the task will be sent to the default version of the default service when the task is
     * attempted.
     *
     * @param host host or {@code null} for none
     */
    public AppEngineRouting setHost(String host) {
        this.host = host;
        return this;
    }

    /**
     * App instance.
     * <p>
     * By default, the task is sent to an instance which is available when the task is attempted.
     * <p>
     * Requests can only be sent to a specific instance if [manual scaling is used in App Engine
     * Standard](/appengine/docs/python/an-overview-of-app-
     * engine?hl=en_US#scaling_types_and_instance_classes). App Engine Flex does not support
     * instances. For more information, see [App Engine Standard request
     * routing](/appengine/docs/standard/python/how-requests-are-routed) and [App Engine Flex request
     * routing](/appengine/docs/flexible/python/how-requests-are-routed).
     *
     * @return value or {@code null} for none
     */
    public String getInstance() {
        return instance;
    }

    /**
     * App instance.
     * <p>
     * By default, the task is sent to an instance which is available when the task is attempted.
     * <p>
     * Requests can only be sent to a specific instance if [manual scaling is used in App Engine
     * Standard](/appengine/docs/python/an-overview-of-app-
     * engine?hl=en_US#scaling_types_and_instance_classes). App Engine Flex does not support
     * instances. For more information, see [App Engine Standard request
     * routing](/appengine/docs/standard/python/how-requests-are-routed) and [App Engine Flex request
     * routing](/appengine/docs/flexible/python/how-requests-are-routed).
     *
     * @param instance instance or {@code null} for none
     */
    public AppEngineRouting setInstance(String instance) {
        this.instance = instance;
        return this;
    }

    /**
     * App service.
     * <p>
     * By default, the task is sent to the service which is the default service when the task is
     * attempted ("default").
     * <p>
     * For some queues or tasks which were created using the App Engine Task Queue API,
     * AppEngineRouting.host is not parsable into AppEngineRouting.service, AppEngineRouting.version,
     * and AppEngineRouting.instance. For example, some tasks which were created using the App Engine
     * SDK use a custom domain name; custom domains are not parsed by Cloud Tasks. If
     * AppEngineRouting.host is not parsable, then AppEngineRouting.service, AppEngineRouting.version,
     * and AppEngineRouting.instance are the empty string.
     *
     * @return value or {@code null} for none
     */
    public String getService() {
        return service;
    }

    /**
     * App service.
     * <p>
     * By default, the task is sent to the service which is the default service when the task is
     * attempted ("default").
     * <p>
     * For some queues or tasks which were created using the App Engine Task Queue API,
     * AppEngineRouting.host is not parsable into AppEngineRouting.service, AppEngineRouting.version,
     * and AppEngineRouting.instance. For example, some tasks which were created using the App Engine
     * SDK use a custom domain name; custom domains are not parsed by Cloud Tasks. If
     * AppEngineRouting.host is not parsable, then AppEngineRouting.service, AppEngineRouting.version,
     * and AppEngineRouting.instance are the empty string.
     *
     * @param service service or {@code null} for none
     */
    public AppEngineRouting setService(String service) {
        this.service = service;
        return this;
    }

    /**
     * App version.
     * <p>
     * By default, the task is sent to the version which is the default version when the task is
     * attempted ("default").
     * <p>
     * For some queues or tasks which were created using the App Engine Task Queue API,
     * AppEngineRouting.host is not parsable into AppEngineRouting.service, AppEngineRouting.version,
     * and AppEngineRouting.instance. For example, some tasks which were created using the App Engine
     * SDK use a custom domain name; custom domains are not parsed by Cloud Tasks. If
     * AppEngineRouting.host is not parsable, then AppEngineRouting.service, AppEngineRouting.version,
     * and AppEngineRouting.instance are the empty string.
     *
     * @return value or {@code null} for none
     */
    public String getVersion() {
        return version;
    }

    /**
     * App version.
     * <p>
     * By default, the task is sent to the version which is the default version when the task is
     * attempted ("default").
     * <p>
     * For some queues or tasks which were created using the App Engine Task Queue API,
     * AppEngineRouting.host is not parsable into AppEngineRouting.service, AppEngineRouting.version,
     * and AppEngineRouting.instance. For example, some tasks which were created using the App Engine
     * SDK use a custom domain name; custom domains are not parsed by Cloud Tasks. If
     * AppEngineRouting.host is not parsable, then AppEngineRouting.service, AppEngineRouting.version,
     * and AppEngineRouting.instance are the empty string.
     *
     * @param version version or {@code null} for none
     */
    public AppEngineRouting setVersion(String version) {
        this.version = version;
        return this;
    }

}
