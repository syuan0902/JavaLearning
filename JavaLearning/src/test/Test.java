package test;

import com.syuan.t01.*;

public class Test {

	public static void main(String[] args) {
		
		//介面可以聲明變量
//		Breath b = new RibbonFish();
//		b.bubble();
	
//		Fish f = new GoldenFish();
//		f.swim();
		
		//強制轉換型別
//		Exhibition ex = (Exhibition)f;
//		ex.show();
//	
//		Food food = (Food)f;
//		food.eat();
		
		Fish f = new TropicalFish();
		f.bubble();
		((Exhibition)f).show();;
		
		
		
		
	}

}
