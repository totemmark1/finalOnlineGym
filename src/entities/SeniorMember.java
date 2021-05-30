package entities;

import java.time.LocalDate;

public class SeniorMember{
    private String type;
    private LocalDate expireDate;

    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }

    public LocalDate getExpireDate() {
        return expireDate;
    }
    public void setExpireDate(LocalDate expireDate) {
        this.expireDate = expireDate;
    }

    public SeniorMember(String type, LocalDate expireDate) {
        this.type = type;
        this.expireDate = expireDate;
    }
}
