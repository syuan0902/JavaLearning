package com.syuan.t01;

public class TropicalFish extends SeaFish implements Exhibition{

	@Override
	public void eat() {
		System.out.println("熱帶魚吃食物");
		
	}

	@Override
	public void changColor() {
		this.color = "白色和橘色條紋";

	}

	@Override
	public void show() {
		System.out.println("展示熱帶魚");

	}

}
