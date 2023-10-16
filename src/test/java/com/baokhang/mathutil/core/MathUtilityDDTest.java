/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.baokhang.mathutil.core;

import org.junit.jupiter.api.Assertions;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

/**
 *
 * @author khang pro vjp
 */
public class MathUtilityDDTest {
    public static Object[][] initData(){
        Object [][] dataSet = {{0,1},{1,1},{2,2},{3,6},{4,24},{5,120}};
        return dataSet;
    }
    @ParameterizedTest
    @MethodSource("initData")
    public void verifyFactorialGivenRightArgumentReturnOK(int n,long expected){
        
        assertEquals(expected ,MathUtility.getFactorial(n));
    }
}
