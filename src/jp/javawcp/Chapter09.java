package jp.javawcp;

public class Chapter09 {
	public static void main(String[] args) {
		
		// 燃費（km/l）
        double fuelCost = 12.5;
        
        // 残量（l）
        double fuelAmount = 55.0;

        Car car = new Car(fuelCost, fuelAmount);

        car.move(20);
        System.out.println("残量は、" + car.getFuelAmount() + "です");
	}
}
