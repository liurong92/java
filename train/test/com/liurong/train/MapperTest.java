package com.liurong.train;

import org.junit.Test;


import static org.junit.Assert.assertEquals;

public class MapperTest {

    @Test
    public void shouldSplitInput() {
        Mapper mapper = new Mapper();
        String[] array = mapper.splitInput("AB5, BC4, CD8, DC8, DE6, AD5, CE2, EB3, AE7");
        assertEquals(array, new String[]{"AB5", "BC4","CD8","DC8","DE6","AD5","CE2","EB3","AE7"});
    }
}