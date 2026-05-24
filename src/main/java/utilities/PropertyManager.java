package utilities;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Properties;

public class PropertyManager {
    private static String url, validEmail, validPassword, invalidEmail, invalidPassword;
    private static PropertyManager instance;

    public static PropertyManager getInstance() {
        if(instance == null){
            instance = new PropertyManager();
            instance.loadData();
        }
        System.out.println(instance);
        return instance;
    }
    private void loadData(){
        Properties properties = new Properties();
        try {
            FileInputStream fi = new FileInputStream("src/main/resources/configuration.properties");
            properties.load(fi);
        } catch (Exception exception) {
            exception.printStackTrace();
        }
        url = properties.getProperty("url");
        validPassword = properties.getProperty("validPassword");
        validEmail = properties.getProperty("validEmail");
        invalidEmail = properties.getProperty("invalidEmail");
        invalidPassword = properties.getProperty("invalidPassword");
    }
    public static void changeProperty(String key, String value){
        Properties properties = new Properties();
        try{
            FileInputStream fi = new FileInputStream("src/main/resources/configuration.properties");
            properties.load(fi);
            properties.setProperty(key, value);
            properties.store(new FileOutputStream("src/main/resources/configuration.properties"),null);
            instance = null;
        }catch(Exception exception){
            exception.printStackTrace();
        }
    }
    public String getUrl(){
        return url;
    }
    public String getValidEmail() {
        return validEmail;
    }
    public String getValidPassword() {
        return validPassword;
    }
    public String getInvalidEmail() {
        return invalidEmail;
    }
    public String getInvalidPassword() {
        return invalidPassword;
    }
}