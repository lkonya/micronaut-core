/*
 * Copyright 2018 original authors
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.particleframework.discovery;

import org.particleframework.context.annotation.Primary;
import org.particleframework.context.annotation.Requires;

import javax.inject.Inject;
import javax.inject.Singleton;

import static org.particleframework.discovery.CompositeDiscoveryClient.SETTING_ENABLED;

/**
 * The default {@link CompositeDiscoveryClient} that is activated when caching is disabled
 *
 * @author Graeme Rocher
 * @since 1.0
 */
@Primary
@Singleton
@Requires(property = SETTING_ENABLED, value = "false", defaultValue = "true")
public class DefaultCompositeDiscoveryClient extends CompositeDiscoveryClient{
    @Inject
    public DefaultCompositeDiscoveryClient(DiscoveryClient[] discoveryClients) {
        super(discoveryClients);
    }
}