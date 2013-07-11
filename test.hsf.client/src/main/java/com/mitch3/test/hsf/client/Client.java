package com.mitch3.test.hsf.client;

import java.io.File;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mitch3.test.hsf.api.IHSFTestInterface;
import com.taobao.hsf.standalone.HSFEasyStarter;

/**
 * 测试客户端，需要指定hsfSarDir系统参数。
 * 即指定JVM的参数：-DhsfSarDir，值为taobao_hsf.sar的父目录地址
 * @author guolin.pangl
 *
 */
public class Client {
	
	public static final String HSF_SAR_DIR = "hsfSarDir";
	
	public static void main(String[] args) throws Exception{
		
		String sarDir = System.getProperty(HSF_SAR_DIR);
		if (sarDir == null) {
			System.err.println("Must set system parameter hsfSarDir to parent directory path of 'taobao_hsf.sar'");
			System.err.println("You can set this by jvm param -DhsfSarDir.");
			System.err.println("System now exist.");
			System.exit(-1);
		}
		String applicationContextFile = "applicationContext.xml";
		String beanName = "hsfTestBean";
		
		HSFEasyStarter.startFromPath(sarDir);
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(applicationContextFile);
		
		IHSFTestInterface test = (IHSFTestInterface) context.getBean(beanName);
		String hello = test.hello("mic");
		System.out.println(hello);
		System.exit(1);
	}

}
