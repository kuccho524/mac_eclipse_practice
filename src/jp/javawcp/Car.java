package jp.javawcp;

public class Car {

	// 燃費（km/l）
	private double fuelCost;
	
	// 残量（l）
	private double fuelAmount;
	
	// コンストラクタを作成
	public Car(double fuelCost, double fuelAmount) {
		this.fuelCost = fuelCost;
		this.fuelAmount = fuelAmount;
	}
	
	// moveメソッドを定義
	public void move(int km) {
		System.out.println(km + "km 走ります");
		this.fuelAmount -= (km / fuelCost);
	}
	
	// getFuelAmountメソッドを定義
	public double getFuelAmount() {
		return this.fuelAmount;
	}
}
