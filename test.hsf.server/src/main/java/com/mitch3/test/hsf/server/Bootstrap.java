package com.mitch3.test.hsf.server;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.taobao.hsf.standalone.HSFEasyStarter;


/**
 * 以standalone形式启动服务
 * 必须设置jvm系统参数:<em>hsfSarDir</em>, 其值为hsf_taobao.sar的父目录路径
 * @author guolin.pangl
 *
 */
public class Bootstrap {
	
	public static final String HSF_SAR_DIR = "hsfSarDir";
	
	public static void main(String[] args) {
		String sarDir = System.getProperty(HSF_SAR_DIR);
		if (sarDir == null) {
			System.err.println("Must set system parameter hsfSarDir to parent directory path of 'taobao_hsf.sar'");
			System.err.println("You can set this by jvm param -DhsfSarDir.");
			System.err.println("System now exist.");
			System.exit(-1);
		}
		String applicationContextFile = "conf/applicationContext.xml";
		
		HSFEasyStarter.startFromPath(sarDir);
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(applicationContextFile);
		context.start();
	}

}
