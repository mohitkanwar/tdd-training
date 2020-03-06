import com.xebia.calculator.Button;
import com.xebia.calculator.Calculator;
import com.xebia.calculator.Display;
import org.junit.Test;

public class CalculatorTest {
    @Test
    public void we_should_have_a_calculator(){
        new Calculator();
    }
    @Test
    public void calculator_should_have_a_display(){
        Calculator calculator = new Calculator();
        Display display = calculator.getDisplay();
    }
    @Test
    public void calculator_should_have_number_buttons(){
        Calculator calculator = new Calculator();
        calculator.press(new Button(0));
        calculator.press(new Button(1));
        calculator.press(new Button(2));
        calculator.press(new Button(3));
        calculator.press(new Button(4));
        calculator.press(new Button(5));
        calculator.press(new Button(6));
        calculator.press(new Button(7));
        calculator.press(new Button(8));
        calculator.press(new Button(9));
    }
}
