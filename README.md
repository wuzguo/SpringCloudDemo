## SpringCloud Demo Project

### 1、这是一个Spring Cloud Demo 项目，以下是各个模块的说明：

- config-cloud : 项目的各个模块的配置文件。
- demo-config：配置中心服务，主要用于给其他服务提供提供配置项的更新。
- demo-config-client：配置中心的消费服务，测试用的。
- demo-eureka：服务治理服务，提供服务的注册发现服务。
- demo-feign：feign的使用demo，调用demo-hello的服务。。
- demo-hello：一个实例服务demo，生产者。
- demo-hystrix-dashboard：hystrix 的控制台。
- demo-ribbon：ribbon的使用demo，调用demo-hello的服务。
- demo-turbine：turbine 的控制台。
- demo-zuul：网关服务，主要过滤无效请求，经过过滤后的请求分发到demo-feign服务和demo-ribbon服务。

### 2、配置说明

- 项目依赖rabbit-mq，需要先安装rabbit-mq，安装方式请自行百度。安装完成后将rabbit-mq的用户名、密码及监听端口配置在demo-config 模块的 application.xml文件中即可：

```yaml
## ...
	## 开启消息跟踪
    bus:
      enabled: true
      trace:
        enabled: true
  rabbitmq:
    host: localhost
    port: 5672
    username: guest
    password: guest
    
## ...
```
### 3、待续....