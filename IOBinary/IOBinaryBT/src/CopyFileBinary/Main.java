package CopyFileBinary;

import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            File sourceFile = new File("D:\\codegym\\module-02\\IOBinary\\IOBinaryBT\\src\\CopyFileBinary\\File");
            File destFile = new File("D:\\codegym\\module-02\\IOBinary\\IOBinaryBT\\src\\CopyFileBinary\\CopyFile");
            CopyFileBinary.copyFile(sourceFile, destFile);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
