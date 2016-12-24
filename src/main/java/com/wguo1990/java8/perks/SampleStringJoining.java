package com.wguo1990.java8.perks;

import com.google.common.collect.Collections2;

import java.awt.datatransfer.StringSelection;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by wguo on 12/23/2016.
 */
public class SampleStringJoining {


    public String flatRequestParameters(Map<String, String> parameters) {

        StringBuffer sb = new StringBuffer();
        boolean first = true;
        for (Map.Entry<String, String> entry : parameters.entrySet()) {
            if (first) {
                first = false;
            } else {
                sb.append("&");
            }
            sb.append(entry.getKey()).append("=").append(entry.getValue());
        }
        return sb.toString();
    }

    public String flatRequestParameters8(Map<String, String> parameters) {
        return parameters.entrySet().stream()
                .map(entry -> String.join("=", entry.getKey(), entry.getValue()))
                .collect(Collectors.joining("&"));
    }


    public String joinList(List<String> props){
        StringBuilder sb = new StringBuilder();
        for (String s : props) {
            sb.append(s).append(",");
        }
        String result= sb.toString();
        return result.substring(0, result.length() - 1);
    }

    public String joinList8(List<String> props){
        return props.stream().collect(Collectors.joining(","));
    }
    public String joinArray8(String[] values){
        return Stream.of(values).collect(Collectors.joining(","));
    }


}
