package com.zyf.hessian.config;

import javax.annotation.Resource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.remoting.caucho.HessianServiceExporter;

import com.zyf.hessian.service.SayHelloHessian;

/**
 * <用于配置发布hessian接口>
 * <这里只是做了最简单的配置，还可以设置超时时间，密码这些安全参数>
 * @author zyf
 * @version 2020-5-14 15:36:29
 * @see [相关类/方法] (可选)
 **/
@Configuration //标记为spring 配置类
public class HessionServiceConfig {

    @Resource
    private SayHelloHessian sayHelloHessian;

    /**
     * 1. HessianServiceExporter是由Spring.web框架提供的Hessian工具类，能够将bean转化为Hessian服务 <br/>
     * 2. @Bean(name = "/helloHessian.do")加斜杠方式会被spring暴露服务路径,发布服务。
     * @return
     */
    @Bean("/helloHessian.do")
    public HessianServiceExporter exportHelloHessian()
    {
        HessianServiceExporter exporter = new HessianServiceExporter();
        exporter.setService(sayHelloHessian);
        exporter.setServiceInterface(SayHelloHessian.class);
        return exporter;
    }
}