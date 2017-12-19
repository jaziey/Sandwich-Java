
public class Sandwich {
	
	private String bread;
	private String meat;
	private double price;
	private boolean toasted;
	 
	
	 public boolean isToasted() {
		return toasted;
	}


	public void setToasted(boolean toasted) {
		this.toasted = toasted;
	}


	Sandwich()
	{
		toasted = true;
	}


	public String getBread() {
		return bread;
	}


	public void setBread(String bread) {
		this.bread = bread;
	}


	public String getMeat() {
		return meat;
	}
	
	


	public void setMeat(String meat) {
		this.meat = meat;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}
	
	
	 

	
	
}
