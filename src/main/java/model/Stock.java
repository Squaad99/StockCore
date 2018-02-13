package model;

import java.util.ArrayList;
import java.util.List;

public class Stock {
	
	List<Double> closeList = new ArrayList<Double>();
	List<Double> openlList = new ArrayList<Double>();
	String stockName;

	public Stock() {
		super();
	}
	
	public void setCloseList(List<Double> list) {
		this.closeList = list;	
	}
	
	public void setOpenList(List<Double> list) {
		this.openlList = list;	
	}
	
	public List<Double> getCloseList() {
		return this.closeList;
	}
	
	public List<Double> getOpenList() {
		return this.openlList;
	}
	
	public String getStockName() {
		return stockName;
	}

	public void setStockName(String stockName) {
		this.stockName = stockName;
	}

}
