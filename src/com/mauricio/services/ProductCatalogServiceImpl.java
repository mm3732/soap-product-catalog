package com.mauricio.services;

import java.util.ArrayList;
import java.util.List;

public class ProductCatalogServiceImpl {

	private static List<Product> productCatalog;

	public ProductCatalogServiceImpl() {
		initilizeProductCatalog();
	}
	
	public Product searchById(int id) throws Exception {
		for (Product product : productCatalog) {
			if (product.getId() == id) {
				return product;
			}
		} throw new Exception("Nenhum produto encontrado com o id" + id);
	}
	
	public Product[] getAllProducts() {
		Product[] products = new Product[productCatalog.size()];
		int i = 0;
		
		for (Product product : productCatalog) {
			products[i] = product;
			i++;
		}
		return products;
	}
	
	public void insertProduct(Product product) {
		productCatalog.add(product);
	}

	private void initilizeProductCatalog() {

		if (productCatalog == null) {
			productCatalog = new ArrayList<>();
			productCatalog.add(new Product(1, "XBox One", "Video Game", Double.valueOf("1250.00")));
			productCatalog.add(new Product(2, "Playstation 4", "Video Game", Double.valueOf("2250.00")));
			productCatalog.add(new Product(3, "Samsung Galaxy S9", "Smartphone", Double.valueOf("3250.00")));
			productCatalog.add(new Product(4, "Motorola Z3", "Smartphone", Double.valueOf("1300.00")));
			productCatalog.add(new Product(5, "TV LG 42 Polegadas", "Smart TV", Double.valueOf("4250.00")));

		}
	}

}
