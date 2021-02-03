package org.chrischopin;

import static org.junit.Assert.assertTrue;

import org.chrischopin.bigdata.utils.IPParser;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class IPTest
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void testIP() {
        IPParser.RegionInfo regionInfo = IPParser.getInstance().analyseIp("123.116.60.97");
        System.out.println(regionInfo.getCountry());
        System.out.println(regionInfo.getProvince());
        System.out.println(regionInfo.getCity());
    }
}
