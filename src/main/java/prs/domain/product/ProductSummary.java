package prs.domain.product;

import java.util.List;

import prs.domain.vendor.Vendor;


public class ProductSummary {
	private Product product;
	private List<Vendor> vendor;
	
	public ProductSummary(){
		
	}
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	public List<Vendor> getVendor() {
		return vendor;
	}
	public void setVendor(List<Vendor> vendor) {
		this.vendor = vendor;
	}
}
