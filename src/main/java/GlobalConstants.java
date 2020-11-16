import io.restassured.RestAssured;

import java.util.ArrayList;

public class GlobalConstants {

    static void CountriesBaseUri(){
        RestAssured.baseURI = "https://restcountries.eu/";
    }
    static ArrayList<String> countryList = new ArrayList<String>();
}
