package views;

import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.Properties;

public class Files{

    public static void main(String[] args) {

        try {

            OutputStream ous = new FileOutputStream("./data/data.properties");

            Properties  prop = new Properties();

            prop.setProperty("nombre", "Xiury");
            prop.setProperty("edad", "25");

            prop.store(ous, null);

            System.out.println(prop);


            
        } catch (Exception e) {
            //TODO: handle exception
        }
    
    }

}