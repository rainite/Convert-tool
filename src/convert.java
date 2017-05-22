import java.io.IOException;
import java.nio.charset.StandardCharsets;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Celestial on 5/21/17.
 */
public class convert {

    public static void main(String arg[]) throws IOException {
        Path filePath = Paths.get("/Users/Celestial/Desktop/ml-10M100K/ratings.dat");
        List<String> fileContent = null;

        fileContent = new ArrayList<>(Files.readAllLines(filePath, StandardCharsets.UTF_8));

        for (int i = 0; i < fileContent.size(); i++) {
            String temp = fileContent.get(i);
            temp = temp.replaceAll("::", ",");

            fileContent.set(i, temp);
        }



        Files.write(filePath, fileContent, StandardCharsets.UTF_8);



    }


}
