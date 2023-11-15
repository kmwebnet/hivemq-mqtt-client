/*
 * Copyright 2018-present HiveMQ and the HiveMQ Community
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.hivemq.client2.internal.mqtt.handler.publish.outgoing;

import com.hivemq.client2.internal.collections.NodeList;
import org.jetbrains.annotations.NotNull;

/**
 * @author Silvio Giebl
 */
abstract class MqttPubOrRelWithFlow extends NodeList.Node<MqttPubOrRelWithFlow> {

    private final @NotNull MqttAckFlow ackFlow;
    int packetIdentifier;

    MqttPubOrRelWithFlow(final @NotNull MqttAckFlow ackFlow) {
        this.ackFlow = ackFlow;
    }

    @NotNull MqttAckFlow getAckFlow() {
        return ackFlow;
    }
}
