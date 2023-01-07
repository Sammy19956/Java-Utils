import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/*A better way to create custom annotations because the retention policy(where the annotation runs)
and the taraet (on what type of code the annotation can be used, can be defined
*/

@Retention(RetentionPolicy.CLASS)
@Target(ElementType.FIELD)
@SuppressWarnings("Unchecked")
public @interface  Test {
    String output = "Completed";
}
