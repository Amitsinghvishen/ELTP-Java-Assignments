package com.psl.training.assignments.AbcShopInventoryManagement;

public interface ISoftware {

	public int getVersion();
	public void setVersion(int version);
	public String getOS();
	public void setOS(String oS);
	public int getMemory();
	public void setMemory(int memory);
	public boolean isLicenseKeyReq();
	public void setLicenseKeyReq(boolean licenseKeyReq);
	public int getSpace();
	public void setSpace(int space);
}
