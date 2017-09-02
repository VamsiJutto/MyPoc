package org.vj.shopcart.repository;

import java.util.List;

import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import org.vj.shopcart.document.SCProduct;

@Repository
public interface SCProductRepository extends MongoRepository<SCProduct, String> {

	
	
}
