package labs.lab1;

import java.util.Objects;

/**
 * Клас {@code Group} представляє академічну групу з інформацією про її номер,
 * рік створення, кафедру, до якої вона належить, та куратора.
 *
 * @version 1.0
 * @since 2024-11-02
 */
public class Group {

    private String groupNumber;
    private int creationYear;
    private String department;
    private String curatorFirstName;
    private String curatorLastName;

    public Group(String groupNumber, int creationYear, String department, String curatorFirstName, String curatorLastName) {
        this.groupNumber = groupNumber;
        this.creationYear = creationYear;
        this.department = department;
        this.curatorFirstName = curatorFirstName;
        this.curatorLastName = curatorLastName;
    }

    public String getGroupNumber() {
        return groupNumber;
    }

    public int getCreationYear() {
        return creationYear;
    }

    public String getDepartment() {
        return department;
    }

    public String getCuratorFirstName() {
        return curatorFirstName;
    }

    public String getCuratorLastName() {
        return curatorLastName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Group group = (Group) o;
        return creationYear == group.creationYear && groupNumber.equals(group.groupNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(groupNumber, creationYear);
    }

    @Override
    public String toString() {
        return "Group{" +
                "groupNumber='" + groupNumber + '\'' +
                ", creationYear=" + creationYear +
                ", department='" + department + '\'' +
                ", curator='" + curatorFirstName + " " + curatorLastName + '\'' +
                '}';
    }
}
