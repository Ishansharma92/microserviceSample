import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.annotations.DataProvider;

import java.util.ArrayList;
import java.util.Arrays;

public class ApiExecutor extends GlobalConstants{

    public static Response getAllCountriesExecutor() {
        Response response = RestAssured.get("rest/v2/all");
        if(response.getStatusCode()==200) {
            countryList = response.getBody().jsonPath().get("name");
            System.out.println(countryList);
            countryProvider();
        }
        return response;
    }

    @DataProvider(name = "country-name")
    public static Object[] countryProvider() {
        Object[] objArray = countryList.stream()
                .map(String -> new Object[] { String })
                .toArray(Object[]::new);
        System.out.println(Arrays.toString(objArray));
        return objArray;
    }

    public static Response getByCountryName(String countryName) {
        Response response = RestAssured.get("rest/v2/name/" + countryName);
        return response;
    }
}
