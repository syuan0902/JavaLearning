package com.syuan.t01;

//Java是單繼承, 只能繼承一個父類, 但可以實作多個介面
public class GoldenFish extends Fish implements Exhibition{

	@Override
	public void eat() {
		System.out.println("金魚吃飼料");
		System.out.println("一次不能吃超過" + MAX_FOOD + FOOD_UNIT);
	}

	@Override
	public void changColor() {
		this.color = "金色";
	}

//	@Override
//	public void swim() {
//		System.out.println("金魚愛游泳");
//	}

	@Override
	public void bubble() {
		System.out.println("金魚吐小泡泡");

	}

	@Override
	public void show() {
		System.out.println("展示金魚");
		
	}
	
	

}
