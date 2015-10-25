package inner;
import static java.lang.System.out;
/**
 * Created by IT_School on 24.10.2015.
 */
public class Test {
    public String testfield = "(testfield!)";

    public static class Mynested {

            public String nested = "(nested!)";

        public void nesteddown() {
            out.println("Привет я вложеннй класс " + nested);}
        }
        public class Myinner {
            public String inner = "(inner!)";

            public void innershow() {
                out.println("Привет я влоеженнй класс " + inner);
            }

            public void show() {
                System.out.println("Привет я просто класс!" + testfield);
            }
        }

}

