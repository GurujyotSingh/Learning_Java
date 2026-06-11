package com.greenwheel.vehicle;
public abstract class ElectricVehicle{
	private int vehicleId;
	private String model;
	private float batteryLevel,baseRatePerHour;

	public ElectricVehicle(int vehicleId,String model, float batteryLevel,float baseRatePerHour){
		this.vehicleId=vehicleId;
		this.model = model;
		this.batteryLevel=batteryLevel;
		this.baseRatePerHour=baseRatePerHour;
	}
	public final void showVehicleStatus(){
		System.out.println(vehicleId+" "+model+" "+batteryLevel+" "+baseRatePerHour);
	}
	public abstract int calculateRentalCost(int hours);
}