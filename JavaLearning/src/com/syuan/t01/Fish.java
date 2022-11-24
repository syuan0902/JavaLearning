package com.syuan.t01;

//一個類可以實作多個介面
public abstract class Fish implements Food, Breath{
	
	protected String color = "白色";
	
	public abstract void changColor();
	
	
	public void swim() {
		System.out.println("魚會游泳");
	}
}
