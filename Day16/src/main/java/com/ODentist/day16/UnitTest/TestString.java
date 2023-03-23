package com.ODentist.day16.UnitTest;

import org.junit.Assert;
import org.junit.Test;

public class TestString {

    @Test
    public void testLength(){
        StringUtil.printLength("asdadwa");
    }

    @Test
    public  void testGetIndex(){
        int index = StringUtil.getIndex("asdwadsada");
        Assert.assertEquals("this program has problem",9,index);

    }

}
