package com.corejavaprojects;

public class GetProcessors {

	public static void main(String[] args) {

		System.out.println("Available processors on my PC : "+Runtime.getRuntime().availableProcessors());
		System.out.println("Available free Memory on my PC : "+Runtime.getRuntime().freeMemory());
		System.out.println("Available Max Memory on my PC : "+Runtime.getRuntime().maxMemory());
		System.out.println("Available Total Memory on my PC : "+Runtime.getRuntime().totalMemory());
		System.out.println("Available Version on my PC : "+Runtime.getRuntime().version());


	}

}
