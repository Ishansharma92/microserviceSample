import io.restassured.response.Response;
import org.testng.Assert;

public class ResponseValidator {

    public static void getAllCountriesValidator(Response response){
        Assert.assertEquals(response.getStatusCode(),200);
    }

    public static void getByCountryNameValidator(Response response) {
        Assert.assertEquals(response.getStatusCode(),200);
    }
}
