import transport.ValidationUtils;

import java.time.LocalDate;

public class Human {

    private static final String DEFAULT_STRING_VALUE = "Информация не указана";
    String name;
    private String town;
    private int yearOfBirth;
    String job;

    public Human(String name, String town, int yearOfBirth, String job) {
        setName(name);
        setTown(town);
        setYearOfBirth(yearOfBirth);
        setJob(job);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = ValidationUtils.validOrDefault(name, DEFAULT_STRING_VALUE);
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        this.town = ValidationUtils.validOrDefault(town, DEFAULT_STRING_VALUE);
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = Math.max(yearOfBirth, 0);
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = ValidationUtils.validOrDefault(job, DEFAULT_STRING_VALUE);
    }

    private int getAgeInYears() {
        int currentYear = LocalDate.now().getYear();
        return currentYear - this.yearOfBirth;

    }
    public String toString() {
        return "Привет! Меня зовут " + name + ". Я из города " + town + ". Я родился в "
                + getAgeInYears() + " году. Я работаю на должности " + job + ". Будем знакомы!";
    }
}