/**
 * 
 */
package ca.tvos.demo01;

import ca.tvos.app.Application;
import ca.tvos.base.SysIO;

/**
 * Quick 'HelloWorld' example
 * @version 1.0
 */
public class HelloWorld extends Application {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		deploy( new HelloWorld(), args );
	}

	@Override
	public void run() {
		SysIO.println("Hello, world!");
	}

}
