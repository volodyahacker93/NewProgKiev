package Module_1.HW.Task_3;

import java.io.*;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

public class Serialize {

    public static void serialize(String path, Object obj) {

        try (OutputStream stream = new FileOutputStream(path);
             DataOutputStream output = new DataOutputStream(stream)) {

            Class<?> csl = obj.getClass();
            Field[] fields = csl.getDeclaredFields();

            for (Field field : fields) {
                if (field.isAnnotationPresent(Save.class)) {
                    if (Modifier.isPrivate(field.getModifiers())) {
                        field.setAccessible(true);
                    }

                    Class<?> type = field.getType();
                    if (type == String.class) {
                        output.writeUTF((String) field.get(obj));
                    } else if (type == int.class) {
                        output.writeInt(field.getInt(obj));
                    } else if (type == double.class) {
                        output.writeDouble(field.getDouble(obj));
                    } else if (type == long.class) {
                        output.writeLong(field.getLong(obj));
                    } else if (type == boolean.class) {
                        output.writeBoolean(field.getBoolean(obj));
                    }
                }
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public static Object deserialize(String path, Class<?> cls) throws
            IllegalAccessException, InstantiationException {

        Object obj = cls.newInstance();

        try (InputStream stream = new FileInputStream(path);
             DataInputStream input = new DataInputStream(stream)) {

            Field[] fields = cls.getDeclaredFields();

            for (Field field : fields) {
                if (field.isAnnotationPresent(Save.class)) {
                    if (Modifier.isPrivate(field.getModifiers())) {
                        field.setAccessible(true);
                    }

                    Class<?> type = field.getType();
                    if (type == String.class) {
                        field.set(obj, input.readUTF());
                    } else if (type == int.class) {
                        field.setInt(obj, input.readInt());
                    } else if (type == double.class) {
                        field.setDouble(obj, input.readDouble());
                    } else if (type == long.class) {
                        field.setLong(obj, input.readLong());
                    } else if (type == boolean.class) {
                        field.set(obj, input.readBoolean());
                    }
                }
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        return obj;
    }
}
