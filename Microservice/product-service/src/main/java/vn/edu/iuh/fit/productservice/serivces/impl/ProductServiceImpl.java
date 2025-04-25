/**
 * @ (#) ProductServiceImpl.java      4/12/2025
 * <p>
 * Copyright (c) 2025 IUH. All rights reserved
 */

package vn.edu.iuh.fit.productservice.serivces.impl;

import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.stereotype.Service;
import vn.edu.iuh.fit.productservice.entities.Product;
import vn.edu.iuh.fit.productservice.repositories.ProductRepository;
import vn.edu.iuh.fit.productservice.serivces.ProductService;

import java.util.List;

/*
 * @description:
 * @author: NguyenTan Thai Duong
 * @date: 4/12/2025
 */
@Service
public class ProductServiceImpl implements ProductService {

    private final ProductRepository productRepository;

    @Autowired
    public ProductServiceImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Transactional
    @Modifying
    @Override
    public Product save(Product product) {
        return productRepository.save(product);
    }

    @Override
    public Product findById(Long id) {
        return productRepository.findById(id).orElseThrow(() -> new RuntimeException("Product not found"));
    }

    @Override
    public List<Product> findAll() {
        return productRepository.findAll();
    }
}
