package com.greenwheel.vehicle;
public class ElectricScooter extends ElectricVehicle{
	private int vehicleId;
	private String model;
	private float batteryLevel,baseRatePerHour;

	public ElectricScooter(int vehicleId,String model, float batteryLevel,float baseRatePerHour){
		super(vehicleId,model,batteryLevel,baseRatePerHour)
	}
	public void showVehicleStatus(){
		super.showVehicleStatus();
	}
}