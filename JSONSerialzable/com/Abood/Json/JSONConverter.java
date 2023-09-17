package com.Abood.Json;

import com.Abood.Annotation.JSONElement;


import java.io.PrintWriter;
import java.lang.reflect.Field;


public class JSONConverter {
    private String file ;


    public JSONConverter(String file){
        this.file=file;
    }

    public JSONConverter(){

    }
    public String objectAsJson(Object object) throws IllegalAccessException {
      if (object ==null) throw new IllegalArgumentException("object is null !");


      Class<?> clazz = object.getClass();

      Field []f = clazz.getDeclaredFields();

        int counter = f.length-1;
      StringBuilder builder =new StringBuilder();

      for (Field field : clazz.getDeclaredFields()) {
          field.setAccessible(true);

          if (field.isAnnotationPresent(JSONElement.class)){
              String fieldTag = getTag(field);
              if (counter>=1) {
                  builder.append("\"").append(fieldTag).append("\": ")
                          .append("\"").append(field.get(object).toString()).append("\",").append("\n");
                  counter--;
              }else if (counter<=0) {
                  builder.append("\"").append(fieldTag).append("\": ")
                          .append("\"").append(field.get(object).toString()).append("\"").append("\n");
              }

          } else {
              throw new IllegalArgumentException("JSONElement Annotation not Present !!");
          }
      }

      return "{\n" +builder+"}" ;
  }



  public void objectAsJsonFile(Object object) {
        if (file == null) {
            throw new IllegalArgumentException("File is null");
        }

        try {
            String a = objectAsJson(object);

            PrintWriter pr =new PrintWriter(file);

            pr.println(a);
            pr.flush();

            pr.close();

        }catch (Exception e){
            e.printStackTrace();
        }
  }

    private String getTag(Field field) {
      String f = field.getAnnotation(JSONElement.class).tag();
      return f.isEmpty() ?field.getName():f;
  }


}
