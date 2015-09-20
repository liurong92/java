package com.liurong.train;

import org.junit.Test;


import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class GraphMapperMapperControlTest {

    @Test
    public void whenGivenSiteShouldReturnDistance() throws NoSuchRouteException {
        GraphMapperControl graphMapperControl = new GraphMapperControl();
        GraphMapper graphMapper = graphMapperControl.getMapper("AB5, BC4, CD8, DC8, DE6, AD5, CE2, EB3, AE7");
        assertThat(graphMapperControl.getTotalDistance(graphMapper, "AB"), is("5"));
        assertThat(graphMapperControl.getTotalDistance(graphMapper, "AD"), is("5"));
        assertThat(graphMapperControl.getTotalDistance(graphMapper, "ADC"), is("13"));
        assertThat(graphMapperControl.getTotalDistance(graphMapper, "ABC"), is("9"));
        assertThat(graphMapperControl.getTotalDistance(graphMapper, "AEBCD"), is("22"));
        assertThat(graphMapperControl.getTotalDistance(graphMapper, "AED"), is("No Such Route"));
    }

    @Test
    public void whenGivenSiteShouldReturnPathCount() {
        GraphMapperControl graphMapperControl = new GraphMapperControl();
        GraphMapper graphMapper = graphMapperControl.getMapper("AB5, BC4, CD8, DC8, DE6, AD5, CE2, EB3, AE7");
        int result1 = graphMapperControl.getPathCount(graphMapper, "C", "C", 3, false);
        int result2 = graphMapperControl.getPathCount(graphMapper, "A", "C", 4, true);

        assertThat(result1, is(2));
        assertThat(result2, is(3));
    }

    @Test
    public void whenGivenSiteShouldReturnShortDistance() {
        GraphMapperControl graphMapperControl = new GraphMapperControl();
        GraphMapper graphMapper = graphMapperControl.getMapper("AB5, BC4, CD8, DC8, DE6, AD5, CE2, EB3, AE7");

        assertThat(graphMapperControl.getShortDistance(graphMapper, "A", "C"), is("9"));
        assertThat(graphMapperControl.getShortDistance(graphMapper, "B", "B"), is("9"));
        assertThat(graphMapperControl.getShortDistance(graphMapper, "C", "B"), is("5"));
        assertThat(graphMapperControl.getShortDistance(graphMapper, "E", "A"), is("No Distance"));
    }

    @Test
    public void whenGivenSiteShouldReturnAllPathLessThanDistance() {
        GraphMapperControl graphMapperControl = new GraphMapperControl();
        GraphMapper graphMapper = graphMapperControl.getMapper("AB5, BC4, CD8, DC8, DE6, AD5, CE2, EB3, AE7");
        assertThat(graphMapperControl.getAllPathLessThanDistance(graphMapper, "C", "C", 30), is(7));
    }


}