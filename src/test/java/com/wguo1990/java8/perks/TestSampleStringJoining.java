package com.wguo1990.java8.perks;

import org.junit.Test;

import javax.xml.soap.SAAJMetaFactory;
import java.util.*;

import static org.junit.Assert.assertTrue;

/**
 * Created by wguo on 12/23/2016.
 */
public class TestSampleStringJoining {

    @Test
    public void testFlatRequestParameters(){

        Map<String, String> parameters = new HashMap<>();
        parameters.put("pageSize", "100");
        parameters.put("startTime", "12234334");
        parameters.put("endTime", "122233356");
        parameters.put("foo", "foovalue");

        SampleStringJoining sample = new SampleStringJoining();
        String flatted = sample.flatRequestParameters(parameters);
        String flatted8 = sample.flatRequestParameters8(parameters);

        System.out.println(flatted);
        System.out.println(flatted8);

        assertTrue(flatted.equals(flatted8));
    }

    @Test
    public void testJoinList(){
        List<String> props = Arrays.asList("foo", "bar", "hi", "world");
        SampleStringJoining sample = new SampleStringJoining();

        String joined = sample.joinList(props);
        String joined8 = sample.joinList8(props);
        System.out.println(joined);
        System.out.println(joined8);

        assertTrue(joined.equals(joined8));
    }

    @Test
    public void testJoinArray8(){
        String[] values = {"foo", "bar", "hello", "world"};
        SampleStringJoining sample = new SampleStringJoining();
        System.out.println(sample.joinArray8(values));
    }
}

