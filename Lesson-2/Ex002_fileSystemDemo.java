
import javax.imageio.IIOException;
import java.io.*;

public class Ex002_fileSystemDemo {
    public static void main(String[] args) throws IOException /*throws IOException*/ {
        BufferedReader bufferedReader = null; // reader
        try{
            File file = new File("C:\\Users\\tooly\\Desktop\\GB\\Java\\Java_Lessons\\test","newFile.txt");
            if(!file.exists())
                file.createNewFile();

            PrintWriter pw = new PrintWriter(file);
            pw.println("Everthing write");
            pw.println("Hello world!");
            pw.close();

            bufferedReader = new BufferedReader(new FileReader("C:\\Users\\tooly\\Desktop\\GB\\Java\\Java_Lessons\\test\\newFile.txt"));
            String line;
            while ((line=bufferedReader.readLine()) != null){
                System.out.println(line);
            }

        } catch (IOException e){
            System.out.println("Error: " + e);
        } finally {
            bufferedReader.close();
        }
//        String pathProject = System.getProperty("user.dir");
//        String pathFile = pathProject.concat("\\pathFile.txt");
//        File f3 = new File(pathFile);
//        if(!f3.exists())
//            f3.createNewFile();
//        System.out.println(f3.getAbsolutePath());
//
//        System.out.println(pathFile);
//        File f1 = new File("C:\\Users\\tooly\\Desktop\\GB\\Java\\Java_Lessons\\Lesson-2","111FileGGG.txt");
//        if(!f1.exists())
//            f1.createNewFile();
//        File f2 = new File("C:\\Users\\tooly\\Desktop\\GB\\Java\\Java_Lessons\\Lesson-2");
//        if(!f2.exists())
//            f2.createNewFile();
//        System.out.println(f1.getAbsolutePath());
//        System.out.println(f2.getAbsolutePath());
    }
}