package org.example;

import org.junit.Test;


import static org.junit.Assert.assertEquals;


    public class SolutionTest{
        @Test
        public void basicTests(){
            assertEquals(1, Solution.solve(new int[] {1,1,1}));
            assertEquals(2, Solution.solve(new int[] {1,2,1}));
            assertEquals(2, Solution.solve(new int[] {4,1,1}));
            assertEquals(9, Solution.solve(new int[] {8,2,8}));
            assertEquals(5, Solution.solve(new int[] {8,1,4}));
            assertEquals(10, Solution.solve(new int[] {7,4,10}));
            assertEquals(18, Solution.solve(new int[] {12,12,12}));
            assertEquals(3, Solution.solve(new int[] {1,23,2}));
        }
    }