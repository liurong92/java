package com.liurong.train;

import org.junit.Test;


import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class GraphMapperMapperControlTest {

    @Test
    public void whenGivenABShouldReturnDistanceIs5() {
        GraphMapperControl graphMapperControl = new GraphMapperControl();
        GraphMapper graphMapper = graphMapperControl.getMapper("AB5, BC4, CD8, DC8, DE6, AD5, CE2, EB3, AE7");
        assertThat(graphMapperControl.getTotalDistance(graphMapper, "AB"), is("5"));
        assertThat(graphMapperControl.getTotalDistance(graphMapper, "AD"), is("5"));
    }
}