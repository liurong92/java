package com.liurong.model;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class OrderTest {

    @Test
    public void testCreateNewOrder(){
        Order order = new Order();
        order.setId(1);
        order.setOrderName("苹果");
        order.setOrderPrice("4.00");
        order.setUser_id(1);

        assertThat(order.getId(), is(1));
        assertThat(order.getOrderName(), is("苹果"));
        assertThat(order.getOrderPrice(), is("4.00"));
        assertThat(order.getUser_id(), is(1));
    }


}
