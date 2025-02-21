package calculator;

import io.cucumber.java.en.*;

public class CalculatorSteps {
    private int res = 0;
    private Calculator calculator;

    @Given("a Calculator")
    public void iHaveACalculator() {
        this.calculator = new Calculator();
    }

    @When("i add {int} and {int}")
    public void iAddAnd(int arg0, int arg1) {
        this.calculator.enter(arg0);
        this.calculator.enter(arg1);
        this.calculator.add();
    }

    @Then("the result should be {int}")
    public void theSumShouldBe(int arg0) {
        if (arg0 != this.calculator.getResult()) { // or using Junit's asserts
            throw new IllegalStateException();
        }
    }

    @When("i multiply {int} and {int}")
    public void iMultiplyAnd(int arg0, int arg1) {
        this.calculator.enter(arg0);
        this.calculator.enter(arg1);
        this.calculator.mul();
    }
}
