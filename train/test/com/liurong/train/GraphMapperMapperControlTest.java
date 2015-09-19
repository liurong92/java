package com.liurong.train;

import org.junit.Test;


import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

public class GraphMapperMapperControlTest {

    @Test
    public void shouldSplitInput() {
        GraphMapperControl graphMapperControl = new GraphMapperControl();
        String[] array = graphMapperControl.splitInput("AB5, BC4, CD8, DC8, DE6, AD5, CE2, EB3, AE7");
        assertEquals(array, new String[]{"AB5", "BC4","CD8","DC8","DE6","AD5","CE2","EB3","AE7"});
    }

    @Test
    public void whenGivenABShouldReturnDistanceIs5() {
        GraphMapperControl graphMapperControl = new GraphMapperControl();
        GraphMapper graphMapper = graphMapperControl.getMapper("AB5, BC4, CD8, DC8, DE6, AD5, CE2, EB3, AE7");
        assertThat(graphMapperControl.getTotalDistance(graphMapper, "AB"), is("5"));
    }
}