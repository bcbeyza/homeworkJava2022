package fieldAttribute;

public class Main {

	public static void main(String[] args) {
		

		
		Product product=new Product();
		product.setName("Laptop");
		product.setId(1);
		product.setDescription("Asus Laptop");
		product.setStockAmount(3);
		product.setPrice(5000);
		
		System.out.println(product.getName());
		System.out.println(product.getKod());
		
		ProductManager productManager=new ProductManager();
		productManager.add(product);
	}

}
