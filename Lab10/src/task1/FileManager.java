package task1;

import java.io.*;

public class FileManager {
    private static String value = System.getProperty("user.dir");
    private static File file = new File(value);

    public static void execCommand(String command) {
        String[] arr = command.split(" ");
        String func = arr[0];
        String dir = arr[1];
        switch (func) {
            case "ls":
                ls(dir);
                break;
            case "cat":
                cat(dir);
                break;
            case "cd":
                cd(dir);
                break;
            case "rm":
                rm(dir);
                break;
            case "mkdir":
                mkdir(dir);
                break;
            case "rmdir":
                rmdir(dir);
                break;
            case "find":
                find(dir);
                break;
            default:
                System.out.println("Error!");
        }
    }

    private static void ls(String dir) {
        System.out.println("Текущая директория: " + value);
        if (!dir.equals("all")) {
            File file = new File(dir);
            String[] paths = file.list();

            for (String path : paths) {
                System.out.println(path);
            }
        } else {
            String[] paths = file.list();

            for (String path : paths) {
                System.out.println(path);
            }
        }
    }

    private static void cat(String dir) {
        /*File file = new File(dir);
        System.out.println("File name: " + file.getName());
        System.out.println("Parent folder: " + file.getParent());
        if (file.exists())
            System.out.println("File exists");
        else
            System.out.println("File not found");

        System.out.println("File size: " + file.length());
        if (file.canRead())
            System.out.println("File can be read");
        else
            System.out.println("File can not be read");

        if (file.canWrite())
            System.out.println("File can be written");
        else
            System.out.println("File can not be written");*/

        try {
            File file = new File("file.txt");
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }

            bufferedReader.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void touch(String name, String[] list){
        try {
            File file = new File(name);
            FileWriter fileReader = new FileWriter(file);
            BufferedWriter bufferedWriter = new BufferedWriter(fileReader);

            for(String s : list) {
                bufferedWriter.write(s + "\n");
            }

            bufferedWriter.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void cd(String dir) {
        file = new File(dir);
        value = file.getAbsolutePath();
        System.out.println("Текущая директория: " + value);
    }

    private static void rm(String dir) {
        if (dir.contains(":"))
            new File(dir).delete();
        else
            new File(value.substring(0, 2) + dir).delete();
    }

    private static void mkdir(String dir) {
        if (dir.contains(":"))
            new File(dir).mkdir();
        else
            new File(value.substring(0, 2) + dir).mkdir();
    }

    private static void rmdir(String dir) {
        if (dir.contains(":"))
            new File(dir).delete();
        else
            new File(value.substring(0, 2) + dir).delete();
    }

    private static void find(String name) {
        String[] paths = file.list();

        for (String path : paths) {
            if (path.equals(name))
                System.out.println(path);
        }
    }
}
