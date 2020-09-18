package files;

import java.io.*;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class FileWorker {
    File file;
    public FileWorker() {
        readFromFile2();
//        writeToFile();
//        checkDisks();
//        crateFile();
    }

    public void writeToFile(){
        file = new File("d:/test.txt");
        Random random = new Random();
        try {
            FileWriter writer = new FileWriter(file);
            for(int i=0; i<20; i++){
                writer.append(Integer.toString(random.nextInt(50))+" ");
            }
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void readFromFile2(){
        file = new File("d:/test.txt");
        try {
            Scanner scanner = new Scanner(file);
            System.out.println(scanner.hasNext());
            int x = scanner.nextInt();
            System.out.println(x+23);
            int y = scanner.nextInt();
            System.out.println(y+23);
            scanner.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void readFromFile(){
        try {
            BufferedReader br = new BufferedReader(new FileReader("d:/test.txt"));
            String line = br.readLine();
            String [] numberArray = line.split(" ");
            System.out.println(line);
            System.out.println(Arrays.toString(numberArray));
            br.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void checkDisks(){
        File [] discs = File.listRoots();
        System.out.println(Arrays.toString(discs));
        File c = discs[0];
        System.out.println("GB = "+c.getFreeSpace()/(Math.pow(1024, 3)));
        System.out.println("GB = "+c.getTotalSpace()/(Math.pow(1024, 3)));
        System.out.println("GB = "+c.getUsableSpace()/(Math.pow(1024, 3)));
    }

    public void crateFile(){
        file = new File("d:/test.txt");
        try {
            System.out.println(file.createNewFile());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
