package com.tnsf.Encapsul;

public class car {
	   private String carName;
	   private String carColour;
	   
	   public void setcarName(String carName) {
		   this.carName=carName;
	}
	   public void getcarName() {
		   return;
	   }
	   public void setcarColour(String carColour) {
		   this.carColour=carColour;
	   }
	   public void getcarColour() {
		   return;
	
	}
	@Override
	public String toString() {
		return "car [carName=" + carName + ", carColour=" + carColour + "]";
	}
	  
}
