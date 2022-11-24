package com.syuan.t01;

public class RibbonFish extends SeaFish {

	@Override
	public void eat() {
		System.out.println("帶魚吃食物");
	}

	@Override
	public void changColor() {
		this.color = "銀白色";
	}


}
