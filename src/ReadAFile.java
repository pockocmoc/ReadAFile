import java.io.*;

public class ReadAFile {
    public static void main(String[] args) {
         try {
             File myFile = new File("/home/marat/Загрузки/text1.txt");
             FileReader fileReader = new FileReader(myFile);

             BufferedReader reader = new BufferedReader(fileReader);

             String line = null;
              while ((line = reader.readLine()) != null) {
                  System.out.println(line);
              }
              reader.close();
         } catch (FileNotFoundException e) {
             throw new RuntimeException(e);
         } catch (IOException e) {
             throw new RuntimeException(e);
         }
    }
}
