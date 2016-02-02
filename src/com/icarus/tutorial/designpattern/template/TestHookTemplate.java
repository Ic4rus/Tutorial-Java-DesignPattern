package com.icarus.tutorial.designpattern.template;

public class TestHookTemplate {
	
	public static void main(String[] args) {
		
		CookieHookRobot cookieHookRobot = new CookieHookRobot("Cookie Hook Robot");
		
		System.out.println(cookieHookRobot.getName() + ":");
		cookieHookRobot.go();
		
	}

}
