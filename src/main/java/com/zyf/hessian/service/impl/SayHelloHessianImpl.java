package com.zyf.hessian.service.impl;

import org.springframework.stereotype.Service;

import com.zyf.hessian.service.SayHelloHessian;

@Service("sayHelloHessian")
public class SayHelloHessianImpl implements SayHelloHessian {

	@Override
	public String sayHello(String name) {
		System.out.println("-----------进入hessian方法,客户端发送的参数：" + name + "--------------");
		return "Hello! " + name + ",我是服务端！";
	}

}
