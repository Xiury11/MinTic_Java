package views;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

public class Files{

    public static void main(String[] args) {

        try {
            
            InputStream ins = new FileInputStream("./data/data.properties");
            Properties prop = new Properties();
            prop.load(ins);
            System.out.println(prop.getProperty("58"));

        } catch (Exception e) {
            //TODO: handle exception
        }

        // try {

        //     OutputStream ous = new FileOutputStream("./data/data.properties");

        //     Properties  prop = new Properties();

        //     //prop.setProperty("nombre", "Xiury");
        //     //prop.setProperty("edad", "25");

        //     for (int i = 1; i <= 100; i++){
        //         prop.setProperty(i+"", (i*3)+"");
        //     }

        //     prop.store(ous, null);

        //     System.out.println(prop);


            
        // } catch (Exception e) {
        //     //TODO: handle exception
        // }
    
    }

}