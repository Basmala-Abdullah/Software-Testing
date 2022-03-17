import org.junit.Test;

import static org.junit.Assert.*;

public class testingYoungphysTest {
    testingYoungphys test = new testingYoungphys();
    int [][] arr1 = { { 4, 1, 7 }, { -2, 4, -1 },{ 1, -5, -3 } };
    int [][] arr2 = { { 3, -1, 7 }, { -5, 2, -4 },{ 2, -1, -3 } };
    int [][] arr3 = { { 21, 32, -46 }, { 43, -35, 21 },{ 42, 2, -50 },{ 22 ,40 ,20},{ -27 ,-9, 38},{ -4 ,1 ,1},{ -40 ,6 ,-31} ,{ -13, -2, 34},{-21, 34, -12 },{-32 ,-29, 41 }};
    int [][] arr4 = { {25, -33, 43 },
            {-27 ,-42, 28 },{ -35 ,-20, 19 },{ 41 ,-42 ,-1},
            {49 ,-39, -4},{ -49, -22, 7},{ -19, 29, 41} ,
            { 8, -27, -43},{8 ,34, 9 },{-11 ,-3 ,33 }};
    int [][] arr5 = { {-6 ,21, 18 },
            {20 ,-11, -8 },{ 37, -11, 41 },{ -5 ,8, 33},
            {29 ,23, 32},{ 30, -33, -11},{ 39, -49, -36} ,
            {28 ,34, -49},{22, 29, -34 },{-18, -6, 7}};
    int [][] arr6 = { {3 ,28 ,-35 },
            {-32, -44, -17 },{9 ,-25, -6 },{ -42 ,-22, 20},
            {-19 ,15, 38},{-21 ,38, 48},{ -1 ,-37, -28} ,
            {-10, -13, -50},{-5 ,21 ,29 },{34, 28 ,50},
            {50, 11, -49},{34, 0, 0 }};
    @Test
    public void checkVectors(){

        assertEquals("NO", test.checkVectors(3 ,arr1));
        assertEquals("YES", test.checkVectors(3 ,arr2));
        assertEquals("NO", test.checkVectors(10 ,arr3));
        assertEquals("NO", test.checkVectors(10 ,arr4));
        assertEquals("NO", test.checkVectors(10,arr5));
        assertEquals("YES", test.checkVectors(12 ,arr6));
    }
}