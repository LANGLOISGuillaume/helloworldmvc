package helloworldmvc.model;


import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class DAOHelloWorld {


    private static String FileName = "helloworld.txt"; 
    private static DAOHelloWorld instance = null;
    private String helloWorldMessage = null;
    
    public DAOHelloWorld() {

    }

    private void readFile() throws IOException {
 
        FileReader fr = new FileReader(new File(FileName));
        String str = "";
        int i = 0;
        try {
            while((i = fr.read()) != -1)
                str += (char)i;
        }
        catch (IOException e) {
            e.printStackTrace();
        }
         this.setHelloWorldMessage(str);
    }
    public static void setInstance(DAOHelloWorld instance) {
        DAOHelloWorld.instance = instance;
    }
    public void setHelloWorldMessage(String helloWorldMessage) {
        this.helloWorldMessage = helloWorldMessage;
    }
    public static DAOHelloWorld getInstance() {
        return instance;
    }
    public String getHelloWorldMessage() {
        try {
            this.readFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return helloWorldMessage;
    }
}
