package com.mycompany.productapi.repository;

import com.mycompany.productapi.model.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

public interface ProductRepository extends ElasticsearchRepository<Product, String> {

    Page<Product> findByReferenceOrNameOrDescription(String name, String reference, String description, Pageable pageable);

}
