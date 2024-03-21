package main;


public class Food {
	
	protected String foodName;
	
	protected Double price;
	
	public Food()
	{
	
	}
	
	public Food(String foodName, Double price)
	{
		this.foodName = foodName;
		this.price = price;
	}
	
	 public String getFoodName() {
		return foodName;
	}
	public void setFoodName(String foodName) {
		this.foodName = foodName;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double Price) {
		this.price = price;
	}
}
