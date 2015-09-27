package com.liurong.model;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;


public class ProductTest {

    @Test
    public void testCreateProduct() {
        Product product = new Product();
        product.setId(1);
        product.setProductName("苹果");
        product.setProductPrice(4.00f);

        assertThat(product.getId(),is(1));
        assertThat(product.getProductName(),is("苹果"));
        assertThat(product.getProductPrice(),is(4.00f));
    }
}
