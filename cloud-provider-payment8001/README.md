
#cloud-privider-payment服务提供者

##配置文件说明
启动方式：
```
1.开发：配置RunConfiguration的program arguments为 --spring.profiles.active=xxxx
2.部署：java -jar  xxx.jar  --spring.profiles.active=xxx
```
各文件说明
```
application-8001.yml: 注册eureka服务集群，8001端口
application-8002.yml: 注册eureka服务集群，8002端口
application-8003.yml: 注册consul服务集群，8003端口
```
##服务注册中心的切换
在切换使用Eureka和Consul作为注册中心时需要修改的地方：
```
1.POM文件修改依赖，将另一个服务注册中心的依赖注掉
2.主启动类修改注解，Eureka使用@EnableEurekaClient注解; Consul不需要多余的注解
3.根据需要使用不同的配置文件启动
```

