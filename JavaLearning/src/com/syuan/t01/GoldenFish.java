package com.syuan.t01;

public class GoldenFish implements Fish {

	@Override
	public void eat() {
		System.out.println("金魚吃飼料");
		System.out.println("一次不能吃超過" + MAX_FOOD + FOOD_UNIT);
	}

}
