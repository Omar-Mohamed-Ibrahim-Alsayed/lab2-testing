import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class evenOddTest {
    evenOdd x;

    @BeforeEach
    public void init(){
        x=new evenOdd();
    }

    @Test
    public void fivePointFive(){
        assertEquals(x.isEven(5.5F),"please enter a positive integers only");
    }

    public void negativefive(){
        assertEquals(x.isEven(-5),"please enter a positive integers only");
    }
    @AfterEach
    public void clean(){
        x=null ;
    }

    @Nested
    class even{
        @BeforeEach
        public void init(){
            x=new evenOdd();
        }

        @Test
        @DisplayName("small number")
        public void four(){
            assertEquals(x.isEven(4),"even");
        }

        @Test
        @DisplayName("big number")
        public void thousand(){
            assertEquals(x.isEven(1000),"even");

        }

        @Test
        public void zero(){
            assertEquals(x.isEven(0),"even");

        }

        @Test
        public void two(){
            assertEquals(x.isEven(2),"even");

        }

        @AfterEach
        public void clean(){
            x=null ;
        }
    }
    @Nested
    class odd{
        @BeforeEach
        public void init(){
            x=new evenOdd();
        }

        @Test
        @DisplayName("small number")
        public void three(){
            assertEquals(x.isEven(3),"odd");
        }

        @Test
        @DisplayName("big number")
        public void thousandandone(){
            assertEquals(x.isEven(1001),"odd");

        }

        @Test
        public void one(){
            assertEquals(x.isEven(1),"odd");

        }

        @AfterEach
        public void clean(){
            x=null ;
        }
    }
}

