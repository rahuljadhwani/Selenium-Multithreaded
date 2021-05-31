package utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;

public class PropertyReader {

    private static FileInputStream fileInputStream;
    private static Properties properties;
    private static final HashMap<String,String> configMap = new HashMap<>();

    private PropertyReader(){

    }

    static {
        try {
            fileInputStream = new FileInputStream(System.getProperty("user.dir") + "/src/main/resources/config.properties");
        }
        catch (FileNotFoundException e){
            e.printStackTrace();
            System.err.println("config.properties file not found at the specified path");
        }
        properties = new Properties();
        try {
            properties.load(fileInputStream);
        }catch (IOException i){
            i.printStackTrace();
            System.err.println("file not found");
        }

        for (Map.Entry<Object, Object> currentEntry:properties.entrySet()){
            configMap.put(String.valueOf(currentEntry.getKey()),String.valueOf(currentEntry.getValue()));
        }
    }


    public static String readProperty(String key){

        String value = configMap.get(key);
        if (Objects.isNull(key) || Objects.isNull(value)) {
            try {
                throw new NullPointerException();
            }catch (NullPointerException n){
                n.printStackTrace();
                System.err.println("Invalid key:"+key+" specified");
            }
        }return value;
    }
}
