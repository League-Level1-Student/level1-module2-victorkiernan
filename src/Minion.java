
public class Minion {
int eye;
String color;
String name;
String master;
	Minion(String name, int eye, String color, String master){
		this.eye=eye;	
		this.color=color;
		this.name=name;
		this.master=master;
	}
	int getEyes() {
		return eye;
	}
	String getColor() {
		return color;
	}
	String getName() {
		return name;
	}
	String getMaster() {
		return master;
	}
	void setMaster(String master) {
		this.master=master;
	}
	
	}


	
	
	

