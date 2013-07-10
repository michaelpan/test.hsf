package com.mitch3.test.hsf.server;

import com.mitch3.test.hsf.api.IHSFTestInterface;

/**
 * test implementation
 * @author guolin.pangl
 *
 */
public class HSFTestImpl implements IHSFTestInterface{

	public String hello(String who) {
		return "Hello " + who + "!";
	}

}
