## Apache RocketMQ 
[![Build Status](https://travis-ci.org/apache/rocketmq.svg?branch=master)](https://travis-ci.org/apache/rocketmq) [![Coverage Status](https://coveralls.io/repos/github/apache/rocketmq/badge.svg?branch=master)](https://coveralls.io/github/apache/rocketmq?branch=master)
[![CodeCov](https://codecov.io/gh/apache/rocketmq/branch/master/graph/badge.svg)](https://codecov.io/gh/apache/rocketmq)
[![Maven Central](https://maven-badges.herokuapp.com/maven-central/org.apache.rocketmq/rocketmq-all/badge.svg)](http://search.maven.org/#search%7Cga%7C1%7Corg.apache.rocketmq)
[![GitHub release](https://img.shields.io/badge/release-download-orange.svg)](https://rocketmq.apache.org/dowloading/releases)
[![License](https://img.shields.io/badge/license-Apache%202-4EB1BA.svg)](https://www.apache.org/licenses/LICENSE-2.0.html)
[![Average time to resolve an issue](http://isitmaintained.com/badge/resolution/apache/rocketmq.svg)](http://isitmaintained.com/project/apache/rocketmq "Average time to resolve an issue")
[![Percentage of issues still open](http://isitmaintained.com/badge/open/apache/rocketmq.svg)](http://isitmaintained.com/project/apache/rocketmq "Percentage of issues still open")
![Twitter Follow](https://img.shields.io/twitter/follow/ApacheRocketMQ?style=social)

**[Apache RocketMQ](https://rocketmq.apache.org) is a distributed messaging and streaming platform with low latency, high performance and reliability, trillion-level capacity and flexible scalability.**

提供如下特性:

* 消息模式 包括 发布/订阅，请求相应和流模型
* 金融级事务消息
* 基于[DLedger](https://github.com/openmessaging/openmessaging-storage-dledger)内置容错和高可用配置选项
* 丰富的跨语言客户端，如Java, C/C++, Python, Go
* 可拔插的传输层协议，如TCP，SSL，AIO
* 内置消息跟踪功能，还支持开放式跟踪
* 多功能的大数据和流生态系统集成
* 按时间或者偏移量追索消息
* 同队列中可靠的先进先出和消息顺序性保证
* 高效的推拉消费模型
* 单队列中百万级消息堆积容量
* 多消息协议支持如JSM和OpenMessaging
* 灵活的分布式扩容部署架构
* 快如闪电的批量消息交换系统
* 各种消息过滤机制如SQL和Tag
* 用于隔离测试和云隔离群集的Docker镜像
* 功能丰富的后台管理界面用于配置，图表和监控
* 认证授权
* 免费的开源连接器，适用于源和接收器

----------

## Learn it & Contact us
* Mailing Lists: <https://rocketmq.apache.org/about/contact/>
* Home: <https://rocketmq.apache.org>
* Docs: <https://rocketmq.apache.org/docs/quick-start/>
* Issues: <https://github.com/apache/rocketmq/issues>
* Rips: <https://github.com/apache/rocketmq/wiki/RocketMQ-Improvement-Proposal>
* Ask: <https://stackoverflow.com/questions/tagged/rocketmq>
* Slack: <https://rocketmq-invite-automation.herokuapp.com/>
 

----------

## Apache RocketMQ Community
* [RocketMQ Community Projects](https://github.com/apache/rocketmq-externals)
----------

## Contributing
We always welcome new contributions, whether for trivial cleanups, [big new features](https://github.com/apache/rocketmq/wiki/RocketMQ-Improvement-Proposal) or other material rewards, more details see [here](http://rocketmq.apache.org/docs/how-to-contribute/).
 
----------
## License
[Apache License, Version 2.0](http://www.apache.org/licenses/LICENSE-2.0.html) Copyright (C) Apache Software Foundation


----------
## Export Control Notice
This distribution includes cryptographic software. The country in which you currently reside may have
restrictions on the import, possession, use, and/or re-export to another country, of encryption software.
BEFORE using any encryption software, please check your country's laws, regulations and policies concerning
the import, possession, or use, and re-export of encryption software, to see if this is permitted. See
<http://www.wassenaar.org/> for more information.

The U.S. Government Department of Commerce, Bureau of Industry and Security (BIS), has classified this
software as Export Commodity Control Number (ECCN) 5D002.C.1, which includes information security software
using or performing cryptographic functions with asymmetric algorithms. The form and manner of this Apache
Software Foundation distribution makes it eligible for export under the License Exception ENC Technology
Software Unrestricted (TSU) exception (see the BIS Export Administration Regulations, Section 740.13) for
both object code and source code.

The following provides more details on the included cryptographic software:

This software uses Apache Commons Crypto (https://commons.apache.org/proper/commons-crypto/) to
support authentication, and encryption and decryption of data sent across the network between
services.
