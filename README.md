# hessian-server
SpringBoot整合Hessian

Hessian是一个轻量级的remoting on http框架(远程调用框架)，采用的是Binary RPC协议（二进制远程调用协议），和我们在web工程中常用的webservice比较类似，不过是个比较轻量级的框架，还有一点不一样的是webserce服务端和客户端何意用不同的框架，例如服务端用CXF，客户端用Axis。Hessian不行，调用方和被调用方必须都是Hessian。Hessian可通过Servlet提供远程服务，需要将请求映射到Hessian服务。也可Spring框架整合。

SpringBoot整合Hessian和Spring整合的步骤差不多，不过因为boot提倡无xml，所以整合的时候boot是在@SpringBootApplication启动类中进行，传统spring是在xml和web.xml中进行，在自己搭建项目的时候可以互相参考看，可以参考此篇博文：https://my.oschina.net/pagecorrect/blog/745631。

## 测试请直接运行hessian-customer中HessianProxyFactoryUtil的main方法
