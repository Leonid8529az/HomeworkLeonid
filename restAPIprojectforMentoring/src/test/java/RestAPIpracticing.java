import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class RestAPIpracticing {

    public String baseURL = RestAssured.baseURI = "http://dummy.restapiexample.com/api/v1/";
    public String employees = "employees";
    public String employeeUniq = "employee/";


    public void getEmployees(){
        Response response = given().when().get(employees).then().extract().response();
        System.out.println("Response is " + response.asString());
        JsonPath path = new JsonPath(response.asString());
        System.out.println(path.get("employee_name"));
    }
    @Test
    public void getUniqueEmployee(){
        Response response = given().when().get(employeeUniq+4366).then().extract().response();
        System.out.println(response.asString());
    }
}
