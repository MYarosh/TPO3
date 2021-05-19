import com.google.gson.Gson;

import java.io.*;

public class Reader {
    Gson json = new Gson();
    Properties properties;

    public Reader(){
        try{
            File file;
            if (isWindows()){
                file = new File(System.getProperty("user.dir") + "\\src\\main\\resources\\properties.json");
            }else {
                file = new File(System.getProperty("user.dir") + "/src/main/resources/properties.json");
            }
            FileReader fr = new FileReader(file);
            /*BufferedReader reader = new BufferedReader(fr);
            StringBuilder line = new StringBuilder(reader.readLine());
            while (reader.readLine() != null) {
                line.append(reader.readLine());
            }
            String data = new String(line);*/
            properties = json.fromJson(fr, Properties.class);
        } catch (FileNotFoundException e) {
            System.out.println("[ERROR] File with config not found!");
            System.exit(1);
        } /*catch (IOException e) {
            System.out.println("[ERROR] Can't read file!");
            System.exit(1);
        }*/ catch (Exception e){
            System.exit(-1);
        }
    }

    private static boolean isWindows(){

        String os = System.getProperty("os.name").toLowerCase();
        return (os.contains("win"));

    }

    public Properties getProperties() {
        return properties;
    }
}
