package util;

import java.io.File;

public class FileSearcher {
    static String HOME;
    static String currentDir;
    static File currentFile;

    public static void printFiles(File[] files){
        System.out.println("==========");
        if (files != null) {
            for (File f : files) {
                //System.out.println(f);
                System.out.println("name:"+f.getName());
            }
        }
        System.out.println("==========");
    }

    public static File findFileByNameBFS(String dir,String name){
        File rtn = null;
        File f = new File(dir);
        if(f.isFile()){
            return null;
        }

        File[] listFiles = f.listFiles();
        //printFiles(homeDir);

        for(File file: listFiles){
            if(file.getName().equals(name)&&rtn==null){
                rtn = file;
            }
        }
        for (File file:listFiles){
            if(rtn==null){
                rtn = findFileByNameBFS(file.getAbsolutePath(),name);
            }
        }
        return rtn;
    }

    public static String findFileLocByNameBFS(String dir,String name){
        String rtn="";
        if(findDirByNameBFS(dir,name)!=null)
            rtn=findDirByNameBFS(dir,name).getAbsolutePath();
        System.out.println(rtn);
        return rtn;
    }

    public static File findDirByNameBFS(String dir,String name) {
        File rtn = null;
        File f = new File(dir);
        if (f.isFile()) {
            return null;
        }

        File[] listFiles = f.listFiles();
        //printFiles(homeDir);

        for (File file : listFiles) {
            if (file.getName().equals(name) && rtn == null && file.isDirectory()) {
                rtn = file;
            }
        }
        for (File file : listFiles) {
            if (rtn == null) {
                rtn = findFileByNameBFS(file.getAbsolutePath(), name);
            }
        }
        return rtn;
    }

    public static File findFileByNameDFS(String dir,String name){
        File rtn = null;
        File f = new File(dir);
        if(f.isFile()){
            return null;
        }

        File[] listFiles = f.listFiles();
        //printFiles(homeDir);

        for(File file: listFiles){
            if(rtn==null){
                rtn = findFileByNameDFS(file.getAbsolutePath(),name);
            }
            if(file.getName().equals(name)&&rtn==null){
                rtn = file;
            }
        }

        return rtn;
    }

    public static int findDirCountsInCurrentDir(String dir){
        int rtn = 0;
        File f = findDirByNameBFS(HOME,dir);
        if(f.isFile()){
            return 0;
        }

        File[] listFiles = f.listFiles();
        for (File file:listFiles){
            if(file.isDirectory()==true){
                rtn++;
            }
        }

        System.out.println("counts:"+rtn);
        return rtn;
    }

    public static void main(String[] args) {
        FileSearcher fs=new FileSearcher();
        fs.HOME=new File("").getAbsolutePath();
        long stime = System.currentTimeMillis();
      String testItem="1.mp4";
        File resultBFS =fs.findFileByNameDFS("video",testItem);
        if(resultBFS!=null){
            System.out.printf("finded!");
            System.out.println(resultBFS.getAbsolutePath());
        }
    }
}
