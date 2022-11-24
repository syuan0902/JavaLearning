package com.syuan.t01;

public class RiverFish extends Fish {

	@Override
	public void eat() {
		System.out.println("河魚吃麵包屑");
		System.out.println("一次不能吃超過" + MAX_FOOD + FOOD_UNIT);
	}

	@Override
	public void changColor() {
		this.color = "藍色";
	}

	@Override
	public void bubble() {
		System.out.println("河魚吐中泡泡");		
	}

}
