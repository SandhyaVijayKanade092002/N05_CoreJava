package org.tnsif.hierarchicalinheritance;

public class Android {
	
	//data members
private String brandName;
private String slotType;



//getters and setters
public String getBrandName() {
	return brandName;
}
public void setBrandName(String brandName) {
	this.brandName = brandName;
}
public String getSlotType() {
	return slotType;
}
public void setSlotType(String slotType) {
	this.slotType = slotType;
}

//to string
@Override
public String toString() {
	return "Android [brandName=" + brandName + ", slotType=" + slotType + "]";
}

//constructor default
public Android() {
	super();
	// TODO Auto-generated constructor stub
}

//parameterized
public Android(String brandName, String slotType) {
	super();
	this.brandName = brandName;
	this.slotType = slotType;
}





}
