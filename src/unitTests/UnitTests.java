package unitTests;

import com.cokreates.designpattern.buildpattern.User; //BuildPattern
import com.cokreates.designpattern.memoization.FibonacciMemo; //Memoization
import com.cokreates.designpattern.strategypattern.AddOperation;
import com.cokreates.designpattern.strategypattern.Context; //Strategy
import com.cokreates.designpattern.strategypattern.MultiplyOperation;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class UnitTests {
    @Test
    public void testCreatedUser() {
        User user1 = new User.UserBuilder("Eimran", "Eimon")
                .age(30)
                .Build();

        assertEquals("Eimon", user1.getLastName());
    }

    @Test
    public void testMemoizationPattern(){
        FibonacciMemo fibAlgo = new FibonacciMemo();
        assertEquals(55, fibAlgo.fibMemo(10));
    }

    @Test
    public void testStrategyPatternAdd(){
        Context contextAdd = new Context(new AddOperation());
        assertEquals(15,contextAdd.exec(5,10));
    }

    @Test
    public void testStrategyPatternMultiply(){
        Context contextMultiply = new Context(new MultiplyOperation());
        assertEquals(50,contextMultiply.exec(5,10));
    }


}
