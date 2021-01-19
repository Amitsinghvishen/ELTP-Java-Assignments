package com.psl.training.assignments.AbcShopInventoryManagement;

public  class Hardware extends Product implements IHardware{
	
	private String dimensions;
	private String brand;
	private int powerSupplyRequirement;
	
	private Hardware() {
		super();
		this.setProductType("Hardware");
	}
	
	public Hardware(int productId,String serialNo,String productName,String brand,String dimensions,int powerSupplyRequirement) {
		this();
		this.setProductId(productId);
		this.setBrand(brand);
		this.setDimensions(dimensions);
		this.setPowerSupplyRequirement(powerSupplyRequirement);
		this.setProductName(productName);
		this.setSerialNo(serialNo);
	}
	

	public String getDimensions() {
		return dimensions;
	}
	public void setDimensions(String dimensions) {
		this.dimensions = dimensions;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getPowerSupplyRequirement() {
		return powerSupplyRequirement;
	}
	public void setPowerSupplyRequirement(int powerSupplyRequirement) {
		this.powerSupplyRequirement = powerSupplyRequirement;
	}
	
	@Override
	public void displayDetails() {
		System.out.println("_____________________________________________");
		System.out.println("Product Name:"+this.getProductName());
		System.out.println("Product ID:"+this.getProductId());
		System.out.println("Serial Number:"+this.getSerialNo());
		System.out.println("Product Type:"+this.getProductType());
		System.out.println("Brand:"+this.getBrand());
		System.out.println("Dimensions:"+this.getPowerSupplyRequirement());
		System.out.println("Powersupply requirement:"+this.getPowerSupplyRequirement());
		}
}
