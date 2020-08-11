import Steps.BDDstyle;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class MyStepdefs {
    @Given("^I perform Get operation$")
    public void iPerformGetOperation() throws Throwable {

    }

    @When("^I perform Get operation on user with Id number (\\d+)$")
    public void iPerformGetOperationOnUserWithIdNumber(String idNumber) throws Throwable {
        System.out.println("idNumber is" + idNumber);
        BDDstyle.simpleGetMethod(idNumber);

    }


    @Then("^I should get the first name as \"([^\"]*)\"$")
    public void iShouldGetTheFirstNameAs(String arg0) throws Throwable {

    }

    @Then("I should get the user names")
    public void iShouldGetTheUserNames() {
        BDDstyle.performContainCollection();
    }
}
