
public class Goods {

	private String name;
	private int price;
	private int countStock;
	private int countSold;

	public void setName(String name) {
		this.name = name;
	}

	public void setPrice(int price) {
		if (price < 0) {
			price = 0;
		}
		else {
			this.price = price;
		}
	}
	
	public void setCountSold(int countSold){
		this.countSold = countSold;
	}
	
	public void setCountStock(int countStock){
		this.countStock = countStock;
	}

	public int getPrice() {
		return price;
	}
	
	@Override
	public String toString(){
		return "Goods [name=" + name + ", price=" + price +
				", countStock=" + countStock + ", countSold=" + countSold + "]";
	}
}
