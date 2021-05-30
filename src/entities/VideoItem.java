package entities;

import java.util.ArrayList;

public class VideoItem {
    private String title;
    private String videoPath;
    private int videoID;
    private int popularity;
    private int duration;
    private int calorie;
    private int difficulty;
    private ArrayList<String> comments;
    private ArrayList<String> bodyFocus;
    private ArrayList<String> equipment;
    private boolean isPremium = false;

    public VideoItem(String title, String videoPath, int videoID, int popularity, int duration, int calorie, int difficulty, ArrayList<String> comments, ArrayList<String> bodyFocus, ArrayList<String> equipment, boolean isPremium) {
        this.title = title;
        this.videoPath = videoPath;
        this.videoID = videoID;
        this.popularity = popularity;
        this.duration = duration;
        this.calorie = calorie;
        this.difficulty = difficulty;
        this.comments = comments;
        this.bodyFocus = bodyFocus;
        this.equipment = equipment;
        this.isPremium = isPremium;
    }

    public String getTitle() {
        return title;
    }

    public String getVideoPath() {
        return videoPath;
    }

    public int getVideoID() {
        return videoID;
    }

    public int getPopularity() {
        return popularity;
    }

    public int getDuration() {
        return duration;
    }

    public int getCalorie() {
        return calorie;
    }

    public int getDifficulty() {
        return difficulty;
    }

    public ArrayList<String> getComments() {
        return comments;
    }

    public ArrayList<String> getBodyFocus() {
        return bodyFocus;
    }

    public ArrayList<String> getEquipment() {
        return equipment;
    }

    public boolean isPremium() {
        return isPremium;
    }
}
