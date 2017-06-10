package com.yoyo007.junittestingexample.util;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 *
 * @author derrek
 */
public class CalcUtilTest {

    @Test
    public void calcTriangleCSide(){
        int aSide = 3;
        int bSide = 4;
        double cSide = CalcUtil.calculateTriangleLastSideLength(aSide, bSide);
        assertEquals(5.0d, cSide, 0.00005);
    }
    
    @Test(expected = ArithmeticException.class)
    public void calcTriangleCSideNegative(){
        int aSide = -3;
        int bSide = 4;
        double cSide = CalcUtil.calculateTriangleLastSideLength(aSide, bSide);
    }
}