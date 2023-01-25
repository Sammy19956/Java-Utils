import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

// A simple way to define custom annotations.
@Retention(RetentionPolicy.RUNTIME)
@interface Test2{
    String testVariable = "StringLiteralTestVariable";
}

@Test2
public class CustomAnnotation {

    String firstVar = "book";

}


