package ReadFile;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class ReadFile {
    public static void main(String[] args) {
        ArrayList<Country> countryList = readFile("D:\\codegym\\module-02\\TextFile\\TextFileBT\\src\\ReadFile\\Cts.csv");

        for (Country country : countryList) {
            System.out.println(country);
        }
    }
    private static ArrayList<Country> readFile(String filePath) {
        ArrayList<Country> countryList = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length == 3) {
                    int id = Integer.parseInt(parts[0]);
                    String code = parts[1];
                    String name = parts[2];
                    Country country = new Country(id, code, name);
                    countryList.add(country);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return countryList;
    }
}