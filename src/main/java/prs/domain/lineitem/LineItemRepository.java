package prs.domain.lineitem;

import java.util.List;

import org.springframework.data.repository.CrudRepository;


public interface LineItemRepository extends CrudRepository<PurchaseRequestLineItem, Integer> {
	List<PurchaseRequestLineItem> findAllByPurchaseRequestId(int purchaseRequestId);
}
