
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class task_5 {
    public static void main(String[] args) {
        String dir_path = ".";
        String log_name = "eror_log.txt";
        String filedir_name = "file.txt";
        try {
            writeToFile(stringsFiles(),filedir_name);
        } catch (Exception e){
            try {logErrors(log_name);} catch (Exception log_e){System.out.println((log_e));}
            System.out.println("Возникли ошибки");
            System.out.printf("Пробный был записан в файл в папке %s", log_name);
        }
    }

    public static String[] stringsFiles(){
        File file = new File("./test/");
        String[] list = file.list();
        return list;
    }

    private static void logErrors(String l_name) throws IOException{
        Logger logger = Logger.getLogger("mkdir");
        FileHandler fh = new FileHandler(l_name);
        logger.addHandler(fh);

        SimpleFormatter sFormat = new SimpleFormatter();
        fh.setFormatter(sFormat);

        //logger.setLevel(Level.INFO);
        logger.log(Level.WARNING, "Test for logging Warning-lvl");
        logger.info("Test logging INFO-lvl");
    }

    public static void writeToFile(String[] fileStrings,String filePath){
        try(FileWriter fileWriter = new FileWriter(filePath))
        {
            for (int i = 0; i < fileStrings.length; i++){
                fileWriter.append(fileStrings[i] + "\n");
                fileWriter.flush();
            }
            fileWriter.close();
        }
        catch (IOException ex){
            System.out.println(ex.getMessage());
        }
    }

    private static String joinSymbols(int num, char c1, char c2){
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i<num/2;i++){
            sb.append(c1).append(c2);
        }
        return sb.toString();
    }

}
