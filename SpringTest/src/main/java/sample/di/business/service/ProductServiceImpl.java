package sample.di.business.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import sample.di.business.domain.Product;

@Component("ProductService")
public class ProductServiceImpl implements ProductService {
	@Autowired
	private ProductDao productDao;

	public Product findProduct() {
		return productDao.findProduct("name");
	}
}
