
public class GoodsTest {

	public static void main(String[] args) {
		Goods camera = new Goods();
		camera.setName("nikon");
		camera.setPrice(100000);
		camera.setCountSold(10);
		camera.setCountStock(200);
		
		System.out.println(camera);
	}
}