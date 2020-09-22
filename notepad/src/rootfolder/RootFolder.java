package rootfolder;

import java.io.File;
import java.util.Arrays;
import java.util.Scanner;

public class RootFolder {
    int diskNumber = 0;
    File [] files;
    double gb = Math.pow(1024, 3);  //1024*1024*1024;
    Scanner scanner;

    public RootFolder() {
        disksName(); // გამოაქვს დისკების სახელები
        System.out.print("Enter disk number: ");
        scanner = new Scanner(System.in);
        diskNumber = scanner.nextInt();
        System.out.println(makeRootFolder());
    }

    boolean makeRootFolder(){
        File file = null;
        boolean makeFolder = false;
        try{
            String folderPath = files[diskNumber-1].toString()+"\\notepad";
            file = new File(folderPath);
            if(file.mkdir()) {
                return file.mkdir();
            }else{
                System.out.println("This folder already exist");
            }
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Folder does not make");
        }finally {
            file = null;
        }
        System.out.println(Arrays.toString(files));
        return false;
    }

    public void setDiskNumber(int diskNumber) {
        this.diskNumber = diskNumber;
    }

    void disksName(){
        files =  File.listRoots();
//        System.out.println(Arrays.toString(files));
        int i = 1;
        for (File disk:files){
            System.out.println("Disk number "+i+" DiskName "+disk+" Free space "+(disk.getUsableSpace()/gb)+" GB");
            i++;
        }
    }
}
