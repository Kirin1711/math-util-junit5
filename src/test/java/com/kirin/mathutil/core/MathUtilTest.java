/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.kirin.mathutil.core;

import static com.kirin.mathutil.core.MathUtil.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.function.Executable;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

/**
 *
 * @author ASUS
 */
public class MathUtilTest {
//    @Test
//    public void testGetFactorialGivenRightArgReturnWell(){
//        assertEquals(24, getFactorial(4)); 
//    }
//    
    @Test
    public void testGetFactorialGivenWrongArgThrowException(){
//        Executable exObject = new Executable() {
//            @Override
//            public void execute() throws Throwable {
//                getFactorial(-5);
//            }
//        };

        //Executable exObject = () -> {getFactorial(-5);};
        assertThrows(IllegalArgumentException.class, () -> getFactorial(-5));
    }
    
    //DDT
    //Cb data
    public static Object[][] initData(){
        return new Integer[][]{
            {1,1},
            {2,2},
            {5,120},
            {6,520}
        };
    }
    @ParameterizedTest
    @MethodSource(value = "initData")
    public void testGetFactorialGivenRightArgReturnWell(int input,long expected){
        assertEquals(expected, getFactorial(input)); 
    }
}
