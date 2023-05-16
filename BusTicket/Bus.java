package BusTicket;

public class Bus {
	
	int busNo;
	boolean ac;
	int capacity;
	
	public Bus(int no, boolean ac, int cap) {
		super();
		this.busNo = no;
		this.ac = ac;
		this.capacity = cap;
	}
	
	public int getCapacity(){
		return capacity;
	}
	
	public void setCapacity(int cap) {
		capacity=cap;
	}
	public boolean Ac() {
		return ac;
	}
	public void setAc(boolean val) {
		ac=val;
	}
	public int getBusNo() {
		return busNo;
	}
	
	public void displayBusInfo() {
		System.out.println("Bus No: "+busNo +" Ac: "+ac +" Total Capacity: "+capacity);
	}
}














