package com.Abood.XML;

import com.Abood.Annotation.XMLElement;
import com.Abood.Annotation.XMLSerializable;
import java.lang.reflect.Field;

@SuppressWarnings("unused")
public class XML {
    public static String getXMLString(Object object) throws IllegalAccessException {
        Class<?> clazz = object.getClass();
        StringBuilder str =new StringBuilder();

        for (Field field  :clazz.getDeclaredFields()) {
            field.setAccessible(true);
            if (field.isAnnotationPresent(XMLElement.class)) {
                String fieldTag = getTag(field);

                str.append("\t<").append(fieldTag).append(">")
                        .append(field.get(object).toString())
                        .append("</").append(fieldTag).append(">\n");


            } else {
                throw new IllegalArgumentException("XML annotation not present !");
            }

        }
        String classTag = getTag(clazz);
        return "<"+classTag+">\n"+str+"</" +classTag+">";
    }

    public static String getTag(Field field) {
        String value = field.getAnnotation(XMLElement.class).tag();

        return value.isEmpty() ? field.getName() :value;
    }

    public static String getTag(Class<?> clazz) {
        String value = clazz.getAnnotation(XMLSerializable.class).tag();

        return value.isEmpty() ? clazz.getSimpleName():value;
    }
}
