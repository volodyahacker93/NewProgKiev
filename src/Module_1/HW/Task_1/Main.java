package Module_1.HW.Task_1;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {

    @Test(a = 2, b = 5)
    static void Sum(int a, int b) {
        System.out.println("a + b = " + (a + b));
    }

    static void Sub(int a, int b) {
        System.out.println("a - b = " + (a - b));
    }

    @Test(a = 2, b = 5)
    static void Mul(int a, int b) {
        System.out.println("a * b = " + (a * b));
    }

    @Test(a = 2, b = 5)
    static void Div(int a, int b) {
        System.out.println("a / b = " + (a / b));
    }

    public static void main(String[] args) throws IllegalAccessException, InvocationTargetException{

        Class<?> cls = Main.class;

        Method[] methods = cls.getDeclaredMethods();
        for (Method method : methods) {
            if (method.isAnnotationPresent(Test.class)) {
                Test test = method.getAnnotation(Test.class);
                method.invoke(null, test.a(), test.b());
            }
        }
    }
}
