package prs.domain.vendor;


import java.util.List;

import org.springframework.data.repository.CrudRepository;

import prs.domain.product.Product;

public interface VendorRepository extends CrudRepository<Vendor, Integer> {
	List<Product> findAllByVendorID(int id);
}
