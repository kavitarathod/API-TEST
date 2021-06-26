import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

public class ApiTest {

    @Test
    public void getCategories(){

        String endpoint = "http://localhost/api_testing/product/read.php";
        var response = given().when().get(endpoint).then();
    }

    @Test
    public void getProduct(){
        String endpoint = "http://localhost/api_testing/product/read_one.php";


    }
}
