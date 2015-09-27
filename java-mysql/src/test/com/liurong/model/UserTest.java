package com.liurong.model;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class UserTest {

    @Test
    public void testCreateUser() {
        User user = new User();
        user.setId(1);
        user.setUserName("liurong");
        user.setPassword("123");
        user.setTrueName("liurong");
        user.setUserAge(23);
        user.setEmail("liurong@qq.com");
        user.setAddress("xian");

        assertThat(user.getId(),is(1));
        assertThat(user.getUserName(),is("liurong"));
        assertThat(user.getPassword(),is("123"));
        assertThat(user.getUserAge(),is(23));
        assertThat(user.getTrueName(),is("liurong"));
        assertThat(user.getEmail(),is("liurong@qq.com"));
        assertThat(user.getAddress(),is("xian"));
    }
}
