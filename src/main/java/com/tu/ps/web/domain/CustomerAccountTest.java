package com.mf.web.domain;

import junit.framework.TestCase;

public class CustomerAccountTest extends TestCase {
	private CustomerAccount customerAccount;

    protected void setUp() throws Exception {
    	customerAccount = new CustomerAccount();
    }

    public void testSetAndGetDescription() {
        String testDescription = "aDescription";
        /*assertNull(product.getDescription());
        product.setDescription(testDescription);
        assertEquals(testDescription, product.getDescription());*/
    }

    public void testSetAndGetPrice() {
        double testPrice = 100.00;
        /*assertEquals(0, 0, 0);
        product.setPrice(testPrice);
        assertEquals(testPrice, product.getPrice(), 0);*/
    }
}
