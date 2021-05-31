package utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Objects;
import java.util.Properties;

public class PropertyReader {

    public static String readProperty(String key){
        FileInputStream fileInputStream=null;
        try {
            fileInputStream = new FileInputStream(System.getProperty("user.dir") + "/src/main/resources/config.properties");
        }
        catch (FileNotFoundException e){
            e.printStackTrace();
            System.out.println("config.properties file not found at the specified path");
        }
        Properties properties = new Properties();
        try {
            properties.load(fileInputStream);
        }catch (IOException i){
            i.printStackTrace();
            System.out.println("file not found");
        }
        String value = properties.getProperty(key);
        if (Objects.isNull(value)) {
            try {
                throw new NullPointerException();
            }catch (NullPointerException n){
                n.printStackTrace();
                System.out.println("Invalid key:"+key+" specified");
            }
        }return value;
    }
}
