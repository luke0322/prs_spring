package prs.domain.lineitem;

import org.springframework.data.repository.CrudRepository;


public interface LineItemRepository extends CrudRepository<PurchaseRequestLineItem, Integer> {
}
