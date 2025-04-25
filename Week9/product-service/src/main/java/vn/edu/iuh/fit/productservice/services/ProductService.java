/*
 * @ {#} ProductService.java   1.0     4/25/2025
 *
 * Copyright (c) 2025 IUH. All rights reserved.
 */

package vn.edu.iuh.fit.productservice.services;

import vn.edu.iuh.fit.productservice.models.Product;

/*
 * @description:
 * @author: Nguyen Tan Thai Duong
 * @date:   4/25/2025
 * @version:    1.0
 */
public interface ProductService {
    public Product findByID(Long id);

    public Product save(Product product);
}

