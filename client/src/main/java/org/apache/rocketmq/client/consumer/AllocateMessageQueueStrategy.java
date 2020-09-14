/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.rocketmq.client.consumer;

import java.util.List;
import org.apache.rocketmq.common.message.MessageQueue;

/**
 * 消费者之间分分配消息算法
 */
public interface AllocateMessageQueueStrategy {

    /**
     * 分配消费者
     *
     * @param consumerGroup 消费者
     * @param currentCID 当前消费者ID
     * @param mqAll 当前Topic中消息数量
     * @param cidAll 消费组中消费者数量
     * @return The allocate result of given strategy
     */
    List<MessageQueue> allocate(
        final String consumerGroup,
        final String currentCID,
        final List<MessageQueue> mqAll,
        final List<String> cidAll
    );

    /**
     * Algorithm name
     *
     * @return The strategy name
     */
    String getName();
}
