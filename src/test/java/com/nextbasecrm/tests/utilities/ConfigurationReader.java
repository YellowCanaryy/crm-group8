package com.nextbasecrm.tests.utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationReader {

<<<<<<< HEAD
    //1- Create the object of Properties
    private static Properties properties = new Properties();

    static{

        try {

            //2- We need to open the file in java memory: FileInputStream
=======
    // 1- Create the object of Properties
   private static Properties properties=new Properties();

    static {

        try {
            // 2- We need to open the file in java memory: FileInputStream
>>>>>>> origin/master
            FileInputStream file = new FileInputStream("configuration.properties");

            //3- Load the properties object using FileInputStream object
            properties.load(file);
<<<<<<< HEAD

            //close the file
            file.close();


=======
            // close the file
            file.close();
>>>>>>> origin/master
        } catch (IOException e) {
            System.out.println("File not found in the ConfigurationReader class.");
            e.printStackTrace();
        }

    }
    public static String getProperty(String keyword){
        return properties.getProperty(keyword);
    }

<<<<<<< HEAD
=======

>>>>>>> origin/master
}
