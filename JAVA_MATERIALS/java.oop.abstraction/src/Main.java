import com.example.abstrct.cls.Cat;
import com.example.intrface.Apple;
import com.example.intrface.Eatable;
import com.example.intrface.Squeezable;

public class Main {
    public static void main(String[] args) {
        Apple apple = new Apple();
        apple.taste();
        apple.eat();
        apple.squeeze();

    }
}