package org.tnsif.hierarchicalinheritance;
//derived class child class 2
public class SnowCone extends Android {
	
	//data menebe
	private int version;
	
	
//getters and setterd
	public int getVersion() {
		return version;
	}

	public void setVersion(int version) {
		this.version = version;
	}

	@Override
	public String toString() {
		return "SnowCone0; [version=" + version + ", toString()=" + super.toString() + "]";
	}

	
//parameterized constructor
	public SnowCone(String brandName, String slotType,int version) {
		super(brandName, slotType);
		// TODO Auto-generated constructor stub
		this.version=version;
	}

	
	
	

}
