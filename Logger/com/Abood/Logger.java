package com.Abood;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

@SuppressWarnings("unused")
public class Logger {

    public static void logExceptionToFile(String filePath, Exception exception) {
        try (PrintWriter printWriter =new PrintWriter(new FileWriter(filePath,true))) {

            printWriter.println("Exception message: " + exception.getMessage());
            printWriter.println("Stack trace:");
            exception.printStackTrace(printWriter);
            printWriter.println();

            System.err.println("Exception logged to " + filePath);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
    public static void logStackTraceToFile(String filepath , Exception exception) {

        try (PrintWriter printWriter = new PrintWriter(
                new FileWriter(filepath , true))) {
            exception.printStackTrace(printWriter);
            printWriter.println();
        }catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
