package com.torryharris.TrainProject;

public class Train {

    private int trainNo;
    private String trainName;
    private String source;
    private String dest;
    private double ticketPrice;
	
	
	
    public int getTrainNo() {
		return trainNo;
	}



	public void setTrainNo(int trainNo) {
		this.trainNo = trainNo;
	}



	public String getTrainName() {
		return trainName;
	}



	public void setTrainName(String trainName) {
		this.trainName = trainName;
	}



	public String getSource() {
		return source;
	}



	public void setSource(String source) {
		this.source = source;
	}



	public String getDest() {
		return dest;
	}



	public void setDest(String dest) {
		this.dest = dest;
	}



	public double getTicketPrice() {
		return ticketPrice;
	}



	public void setTicketPrice(double ticketPrice) {
		this.ticketPrice = ticketPrice;
	}



	@Override
	public String toString() {
		return "Train [trainNo=" + trainNo + ", trainName=" + trainName + ", source=" + source + ", dest=" + dest + ", ticketPrice= " + ticketPrice + "]";
	}
	
}





