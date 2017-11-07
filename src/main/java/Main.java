import com.alibaba.fastjson.JSON;
import store.Company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        String pathToJsonFile = "filesJsons/json";
        Lines lines = JSON.parseObject(scan(pathToJsonFile), Lines.class);
        System.out.println(lines);
        pathToJsonFile = "filesJsons/stores";
        Company company = JSON.parseObject(scan(pathToJsonFile), Company.class);
        System.out.println();
        System.out.println(company);;
    }
    public static String scan(String pathToFile) throws FileNotFoundException{

        File file = new File(pathToFile);

        Scanner scanner = new Scanner(file);

        String json = scanner.useDelimiter("\\Z").next();
    return json;
    }
}
