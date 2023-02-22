import java.io.File;

public class Ex0034_getProperty {
    public static void main(String[] args) {
        String pathProject = System.getProperty("user.dir");
        String pathDir = pathProject.concat("\\files");
        File dir = new File(pathDir);
        System.out.println(dir.getAbsolutePath());
        if (dir.mkdir()){
            System.out.println("+");
        } else {
            System.out.println("-");
        }
        for (String file_name : dir.list()){
            System.out.println(file_name);
        }

    }
}
