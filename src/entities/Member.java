package entities;

public class Member {
    private String name;
    private int id;
    private int age;
    private String gender;
    private int balance;
    private String phone;
    private Ability ability;
    private SeniorMember senior;

    public Member(String name, int id, int age, String gender, int balance, String phone, Ability ability, SeniorMember senior) {
        this.name = name;
        this.id = id;
        this.age = age;
        this.gender = gender;
        this.balance = balance;
        this.phone = phone;
        this.ability = ability;
        this.senior = senior;
    }

    public Member(String name, int id, int age, String gender, int balance, String phone) {
        this(name, id, age, gender, balance, phone, new Ability(), null);
    }

    public Member(String name, int id, int age, String gender, int balance, String phone, SeniorMember senior) {
        this(name, id, age, gender, balance, phone, new Ability(), senior);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Ability getAbility() {
        return ability;
    }

    public void setAbility(Ability ability) {
        this.ability = ability;
    }

    public SeniorMember getSenior() {
        return senior;
    }

    public void setSenior(SeniorMember senior) {
        this.senior = senior;
    }

}
