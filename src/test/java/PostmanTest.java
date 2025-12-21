import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.when;
import io.restassured.response.Response;
import static org.hamcrest.Matchers.equalTo;

public class PostmanTest {

    @Test()
    public void testSimple() {

        given()
                .baseUri("https://postman-echo.com")
                .when()
                .get("/cookies")
                .then()
                .assertThat()
                .statusCode(200);
    }
    @Test()
    public void testGet() {

                given().baseUri("https://postman-echo.com")
                        .param("foo1","bar1")
                        .param("foo2", "bar2")
                .when()
                .get("/get")
                .then()
                .log()
                .body()
                .assertThat().statusCode(200)
                .and().body("args.foo1", equalTo("bar1"))
                        .and().body("args.foo2", equalTo("bar2"));
    }

    @Test
    public void testPost() {

               given().baseUri("https://postman-echo.com")
                .header("Content-Type", "application/json") // Устанавливаем заголовок
                       .body("{\"Vasya\":\"Ivanov\"}") // Тело запроса в формате JSON
                       .when()
                       .post("/post")
                       .then()
                       .log()
                       .body()
                       .statusCode(200)
                       .body("data.Vasya", equalTo("Ivanov"));
    }
    @Test
    public void testPostFormData() {

        given().baseUri("https://postman-echo.com")
                .formParam("foo1", "bar1")
                .formParam("foo2", "bar2")
                .contentType("application/x-www-form-urlencoded")
                .when()
                .post("/post")
                .then()
                .log()
                .body()
                .statusCode(200)
                .body("form.foo1", equalTo("bar1"))
                .body("form.foo2", equalTo("bar2"));
    }
    @Test
    public void testPut() {

        given().baseUri("https://postman-echo.com")
                .header("Content-Type", "application/json") // Устанавливаем заголовок
                .body("{\"Vasya\":\"Ivanov1\"}") // Тело запроса в формате JSON
                .when()
                .put("/put")
                .then()
                .log()
                .body()
                .statusCode(200)
                .body("data.Vasya", equalTo("Ivanov1"));
    }
    @Test
    public void testPatch() {

        given().baseUri("https://postman-echo.com")
                .header("Content-Type", "application/json") // Устанавливаем заголовок
                .body("{\"Vasya\":\"Ivanov2\"}") // Тело запроса в формате JSON
                .when()
                .patch("/patch")
                .then()
                .log()
                .body()
                .statusCode(200)
                .body("data.Vasya", equalTo("Ivanov2"));
    }
    @Test
    public void testDelete() {

        given().baseUri("https://postman-echo.com")
                .header("Content-Type", "application/json") // Устанавливаем заголовок
                .body("{\"Vasya\":\"Ivanov3\"}") // Тело запроса в формате JSON
                .when()
                .delete("/delete")
                .then()
                .log()
                .body()
                .statusCode(200)
                .body("data.Vasya", equalTo("Ivanov3"));
    }
}
