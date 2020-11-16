import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;

public class App extends GlobalConstants{

    @Test
    void allCountries() {
        GlobalConstants.CountriesBaseUri();
        Response response = ApiExecutor.getAllCountriesExecutor();
        ResponseValidator.getAllCountriesValidator(response);
    }

    @Test(dataProviderClass = ApiExecutor.class, dataProvider = "country-name")
    void getDetailsByCountryName(String country){
        GlobalConstants.CountriesBaseUri();
        Response response = ApiExecutor.getByCountryName(country);
        ResponseValidator.getByCountryNameValidator(response);
    }
}
