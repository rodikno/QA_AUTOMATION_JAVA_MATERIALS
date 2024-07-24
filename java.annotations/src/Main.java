import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.file.Paths;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {


        Cat myCat = new Cat("George");

        if (myCat.getClass().isAnnotationPresent(VeryImportant.class)) {
            System.out.println("This is a very important cat!");
        } else {
            System.out.println("This cat is nice, but not that important!");
        }

        for (Method method : myCat.getClass().getDeclaredMethods()) {
            if (method.isAnnotationPresent(RunImmediately.class)) {
                method.invoke(myCat);
            }
        }


    }
}