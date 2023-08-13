package org.tnsif.hierarchicalinheritance;

public class Teramesu extends Android{
	
	private int version;

	public int getVersion() {
		return version;
	}

	public void setVersion(int version) {
		this.version = version;
	}

	@Override
	public String toString() {
		return "Teramesu [version=" + version + ", toString()=" + super.toString() + "]";
	}

	

	public Teramesu(String brandName, String slotType,int version) {
		super(brandName, slotType);
		// TODO Auto-generated constructor stub
		this.version=version;
	}
	
	
	
	
	

}
