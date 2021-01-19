package com.psl.training.assignments.AbcShopInventoryManagement;

public  class Software extends Product implements ISoftware{
	public int getVersion() {
		return version;
	}
	
	
	public void setVersion(int version) {
		this.version = version;
	}
	public String getOS() {
		return OS;
	}
	

	public void setOS(String oS) {
		OS = oS;
	}
	public int getMemory() {
		return memory;
	}
	public void setMemory(int memory) {
		this.memory = memory;
	}
	public boolean isLicenseKeyReq() {
		return licenseKeyReq;
	}
	public void setLicenseKeyReq(boolean licenseKeyReq) {
		this.licenseKeyReq = licenseKeyReq;
	}
	public int getSpace() {
		return space;
	}
	public void setSpace(int space) {
		this.space = space;
	}
	private int version;
	private String OS;
	private int memory;
	private int space;
	
	private boolean licenseKeyReq;
	
	private Software() {
		super();
		this.setProductType("Software");
	}
	
	public Software(int productId,String serialNo,String productName,int version,String os,int space,int memory,boolean licenseKeyReq) {
		this();
		this.setLicenseKeyReq(licenseKeyReq);
		this.setMemory(memory);
		this.setOS(os);
		this.setProductId(productId);
		this.setProductName(productName);
		this.setSerialNo(serialNo);
		this.setSpace(space);
		this.setVersion(version);
	}
	

	@Override
	public void displayDetails() {
		System.out.println("_____________________________________________");
		System.out.println("Product Name:"+this.getProductName());
		System.out.println("Product ID:"+this.getProductId());
		System.out.println("Serial Number:"+this.getSerialNo());
		System.out.println("Product Type:"+this.getProductType());
		System.out.println("Version:"+this.getVersion());
		System.out.println("OS required:"+this.getOS());
		System.out.println("Space required:"+this.getSpace());
		System.out.println("Memory required:"+this.getMemory());
		System.out.println("License Key reuired:"+this.isLicenseKeyReq());
	}



}
