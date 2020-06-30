
import java.io.*;
import java.util.Scanner;

public class CopyTextFile {
    public static void main(String[] args) {
        System.out.println("Please enter the original filepath:");
        Scanner scanner = new Scanner(System.in);
        String originalFilePath = scanner.nextLine();
        System.out.println("Please enter the destination filepath:");
        String destinationFilePath = scanner.nextLine();
        File originalFile = new File(originalFilePath);
        BufferedInputStream bis;
        try {
            bis = new BufferedInputStream(new FileInputStream(originalFile));
        } catch (FileNotFoundException e) {
            System.out.println("Can not find the original file!");
            return;
        } catch (Exception e) {
            e.printStackTrace();
        }
        File destinationFile = new File(destinationFilePath);
        BufferedOutputStream bos;
        if (destinationFile.exists()) {
            System.out.println("Destination file is exist. Do you want to overwrite it?");
            String answer = scanner.nextLine();
            if (!answer.equals("y") && !answer.equals("Y")) {
                return;
            } else {
                try {
                    FileWriter fw = new FileWriter(destinationFile);
                    fw.write("");
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        } else {
            try {
                bos = new BufferedOutputStream(new FileOutputStream(destinationFile));
            } catch (Exception e) {
                System.out.println("Illegal path.");
                return;
            }

        }
        try {
            bis = new BufferedInputStream(new FileInputStream(originalFile));
            bos = new BufferedOutputStream(new FileOutputStream(destinationFile));
            int i = 0;
            while ((i = bis.read()) != -1) {
                bos.write(i);
            }
            bis.close();
            bos.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }


}
