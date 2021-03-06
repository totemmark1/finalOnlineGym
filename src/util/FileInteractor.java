package util;

import com.google.gson.Gson;
import entities.Video;
import entities.Member;
import entities.SeniorMember;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class FileInteractor {
    private String videoDirName = "/data/video";
    private Gson gson;
    private String memberDirName = "/data/member";

    public FileInteractor(String dirName){
        videoDirName = dirName;
        gson = new Gson();
    }

    public FileInteractor(String videoDirName, String memberDirName) {
        this.videoDirName = videoDirName;
        this.gson = new Gson();
        this.memberDirName = memberDirName;
    }

    /**
     * get the list of all videos in our gym system
     * @return the list of video in our gym system
     */
    public ArrayList<Video> getAllVideos(){
        File dir = new File(videoDirName);
        File[] files = dir.listFiles(file -> file.getName().endsWith(".json"));

        Scanner reader;
        ArrayList<Video> videoList = new ArrayList<>();
        String videoJson = "";

        for(File file: files){
            try{
                reader = new Scanner(file);
                while(reader.hasNextLine()){
                    videoJson += reader.nextLine();
                }
                videoList.add(gson.fromJson(videoJson, Video.class));
                videoJson = "";
            }
            catch(FileNotFoundException e){
                System.out.println(file.getName() + "'s meta file cannot be found!");
            }
        }
        return videoList;
    }

    /**
     * store the member object in the memory into file
     * @param member the member you want to store
     * @throws IOException if IO error occurs(could not open the file, etc.)
     */
    public void storeMemberData(Member member) throws IOException {
        int id = member.getId();
        File dir = new File(memberDirName + "\\" + id);
        System.out.println(dir.getAbsolutePath());
        System.out.println(memberDirName);

        if(!dir.exists())
            dir.mkdirs();
        FileWriter writer = new FileWriter(memberDirName + "\\" + id + "\\info.json");
        String memberJson = gson.toJson(member);
        writer.write(memberJson);
        writer.close();
    }

    /**
     * get the member into memory by its id from the file
     * @param id the id for the member you want to get
     * @return the member object you get
     * @throws FileNotFoundException file for the member doesn't exits
     */
    public Member getMember(int id) throws FileNotFoundException{
        File file = new File(memberDirName + "\\" + id + "\\info.json");
        Scanner reader = new Scanner(file);
        String memberJson = reader.nextLine();
        Member member = gson.fromJson(memberJson, Member.class);
        return member;
    }

    public static void main(String[] args) {
        String HOME = new File("").getAbsolutePath();
        FileInteractor meta = new FileInteractor(HOME + "\\data\\video", HOME + "\\data\\member");
//        ArrayList<Video> videos = meta.getVideos();
        Member jack = new Member("Jack", 4, 20, "male", 349, "(+86)18810232343", new SeniorMember("VIP", LocalDate.of(2021, 11, 3)));
        try {
            meta.storeMemberData(jack);
            jack = meta.getMember(4);
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }
}
