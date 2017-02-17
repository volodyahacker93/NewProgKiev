package Module_1.HW.Task_1;

import java.lang.annotation.*;

@Target(value = ElementType.METHOD)
@Retention(value = RetentionPolicy.RUNTIME)

@interface Test {

    int a();

    int b();
}
