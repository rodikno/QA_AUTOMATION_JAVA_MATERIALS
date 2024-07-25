import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;


public class Main {
    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {


        Cat myCat = new Cat("Mars");

        Class<? extends Cat> aClass = myCat.getClass();


        if (myCat.getClass().isAnnotationPresent(VeryImportant.class)) {
            System.out.println("This is a very important cat!");
        } else {
            System.out.println("This cat is nice, but not that important!");
        }

        for (Method method : myCat.getClass().getDeclaredMethods()) {
            if (method.isAnnotationPresent(RunImmediately.class)) {
                RunImmediately annotation = method.getAnnotation(RunImmediately.class);
                for (int i = 0; i < annotation.times(); i++) {
                    method.invoke(myCat);
                }
            }
        }


    }
}