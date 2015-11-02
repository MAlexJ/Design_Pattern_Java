package Template_Method;

import Template_Method.classic.AbstractClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Matchers.anyObject;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;


public class AbstractClassTest {

    Object algorithmInput_1 = null;
    Object algorithmInput_4 = null;
    boolean flag = false;

    @Test
    public void test() {

        //given
        AbstractClass abstractClass = new AbstractClass() {
            @Override
            protected void algorithm_2(Object input) {
                algorithmInput_1 = input;
            }

            @Override
            protected void algorithm_3() {
                flag = true;
            }

            @Override
            protected Object algorithm_4(Object input) {
                algorithmInput_4 = input;
                return "stub";
            }
        };

        //when
        Object result = abstractClass.templateMethod("some_data");

        //then
        assertEquals("default_algorithm plus stub", result);
        assertEquals("some_data", algorithmInput_1);
        assertEquals("some_data", algorithmInput_4);
        assertTrue(flag);

    }

    @Test
    public void testWithMockito(){
        //given
        AbstractClass mock = mock(AbstractClass.class);
        when(mock.templateMethod(anyObject())).thenReturn("data");




    }

}
