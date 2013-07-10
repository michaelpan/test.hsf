package com.mitch3.test.hsf.client;

import java.io.File;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mitch3.test.hsf.api.IHSFTestInterface;
import com.taobao.hsf.standalone.HSFEasyStarter;


public class Client {
	
	public static void main(String[] args) throws Exception{
		File root = new File(Client.class.getResource("/").getFile());
		File hsfSarPath = new File(root, "ext");
		String applicationContextFile = "applicationContext.xml";
		String beanName = "hsfTestBean";
		
		HSFEasyStarter.startFromPath(hsfSarPath.getAbsolutePath());
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(applicationContextFile);
		
		IHSFTestInterface test = (IHSFTestInterface) context.getBean(beanName);
		String hello = test.hello("mic");
		System.out.println(hello);
		System.exit(1);
	}

}
