/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
 
import findminmax.FindMinMax;
import org.junit.Test;
import static org.junit.Assert.*;
 
/**
 *
 * @author Tisanai.Cha
 */
public class MyArrayTest {
 
    private int[] score = {100, 30, 60, 20, 80};
 
    public MyArrayTest() {
    }
 
    @Test
    public void checkScoreArrayOutBound() { //0-100
        int[] score = {10, 101, 0, -1};
        int[] result = FindMinMax.findMinMax(score);
        assertNull(result);
    }
 
    @Test
    public void minInArray() { // min check
        int expectResult = 20;
        int[] result = FindMinMax.findMinMax(score);
        assertEquals(expectResult, result[0]);
    }
 
    @Test
    public void maxInArray() { // max check
        int expectResult = 100;
        int[] result = FindMinMax.findMinMax(score);
        assertEquals(expectResult, result[1]);
    }
 
    @Test
    public void arrayLength() { //min an max
        int expectResult = 2;
        int result = FindMinMax.findMinMax(score).length;
        assertEquals(expectResult, result);
    }
 
}