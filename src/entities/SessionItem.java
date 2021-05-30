package entities;

public class SessionItem {
    private String genre;
    private String type;
    private String status;
    private String rate;
    private int timeStamp;
    private int duration;
    private int calories;
    private int PercentageHR1;
    private int PercentageHR2;
    private int PercentageHR3;
    private int PercentageHR4;
    private int PercentageHR5;

    public SessionItem(String genre, String type, String status, String rate, int timeStamp, int duration, int calories, int percentageHR1, int percentageHR2, int percentageHR3, int percentageHR4, int percentageHR5) {
        this.genre = genre;
        this.type = type;
        this.status = status;
        this.rate = rate;
        this.timeStamp = timeStamp;
        this.duration = duration;
        this.calories = calories;
        PercentageHR1 = percentageHR1;
        PercentageHR2 = percentageHR2;
        PercentageHR3 = percentageHR3;
        PercentageHR4 = percentageHR4;
        PercentageHR5 = percentageHR5;
    }

    public SessionItem(String genre, String type, String status, int timeStamp) {
        this.genre = genre;
        this.type = type;
        this.status = status;
        this.timeStamp = timeStamp;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getRate() {
        return rate;
    }

    public void setRate(String rate) {
        this.rate = rate;
    }

    public int getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(int timeStamp) {
        this.timeStamp = timeStamp;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    public int getPercentageHR1() {
        return PercentageHR1;
    }

    public void setPercentageHR1(int percentageHR1) {
        PercentageHR1 = percentageHR1;
    }

    public int getPercentageHR2() {
        return PercentageHR2;
    }

    public void setPercentageHR2(int percentageHR2) {
        PercentageHR2 = percentageHR2;
    }

    public int getPercentageHR3() {
        return PercentageHR3;
    }

    public void setPercentageHR3(int percentageHR3) {
        PercentageHR3 = percentageHR3;
    }

    public int getPercentageHR4() {
        return PercentageHR4;
    }

    public void setPercentageHR4(int percentageHR4) {
        PercentageHR4 = percentageHR4;
    }

    public int getPercentageHR5() {
        return PercentageHR5;
    }

    public void setPercentageHR5(int percentageHR5) {
        PercentageHR5 = percentageHR5;
    }
}
