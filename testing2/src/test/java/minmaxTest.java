import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class minmaxTest {
    minmax x;
    double[] arr;
    double[] result;

    @BeforeEach
    public void init(){
        x=new minmax();
    }

    @Test
    @DisplayName("empty array")
    public void empty(){
        arr = new double[0];boolean check = true;
        if (result != null )
            check = false;
        assertTrue(check);
    }

    @Test
    @DisplayName("array with one element {1}")
    public void oneElement(){
        arr = new double[] { 1 };
        boolean check = true;
        result =x.minMax(arr);
        if (result[0] != 1 || result[1]!=1)
            check = false;
        assertTrue(check);    }

    @AfterEach
    public void clean(){
        x=null ;
    }

    @Nested
    class differentValues{
        @BeforeEach
        public void init(){
            x=new minmax();
        }

        @Test
        @DisplayName("arr1 = { 1 , 0.5 , -1 , 2 , 6 }")
        public void arr1(){
            arr = new double[] { 1 , 0.5 , -1 , 2 , 6 };
            result =x.minMax(arr);
            boolean check = true;
            if (result[0] != -1 || result[1]!=6)
                check = false;
            assertTrue(check);
        }

        @Test
        @DisplayName("arr2 = { -200 , 50 , 66 , 1000 , -5000}")
        public void arr2(){
            arr = new double[] { -200 , 50 , 66 , 1000 , -5000};
            boolean check = true;
            result =x.minMax(arr);
            if (result[0] != -5000 || result[1]!=1000)
                check = false;
            assertTrue(check);        }

        @Test
        @DisplayName("arr3 = { 0.9 , 0.5 , -0.1 , -0.9 }")
        public void arr3(){
            arr = new double[] { 0.9 , 0.5 , -0.1 , -0.9};
            result =x.minMax(arr);
            boolean check = true;
            if (result[0] != -0.9 || result[1] != 0.9)
                check = false;
            assertTrue(check);        }

        @AfterEach
        public void clean(){
            x=null ;
        }
    }
}