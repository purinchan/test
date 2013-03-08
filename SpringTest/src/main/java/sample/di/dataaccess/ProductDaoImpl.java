package sample.di.dataaccess;

import org.springframework.stereotype.Component;

import sample.di.business.domain.Product;
import sample.di.business.service.ProductDao;

@Component
public class ProductDaoImpl implements ProductDao {
	public Product findProduct(String name) {
		return new Product(name, 100);
	}

}
