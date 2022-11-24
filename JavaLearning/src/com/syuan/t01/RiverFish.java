package com.syuan.t01;

public class RiverFish implements Fish {

	@Override
	public void eat() {
		System.out.println("河魚吃麵包屑");
		System.out.println("一次不能吃超過" + MAX_FOOD + FOOD_UNIT);
	}

}
