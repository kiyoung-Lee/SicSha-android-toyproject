package com.sicsha;

import org.junit.Test;

/**
 * Created by kiyoungLee on 2017-12-27.
 */

public class SampleTest {

    public class Sample{
        public boolean test;
    }

    @Test
    public void name() throws Exception {
        Sample sample = new Sample();
        System.out.println(sample.test);

    }
}
