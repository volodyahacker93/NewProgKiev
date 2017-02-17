package Module_1.HW.Task_2;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(value = RetentionPolicy.RUNTIME)
@interface SaveTo {
    String path();
}

