package challenge;

import java.util.ArrayList;
import java.util.List;

public class Supervisor implements Faculty {
    private final String name;
    private final String department;
    private final List<Faculty> faculty;

    public Supervisor(String name, String department) {
        this.name = name;
        this.department = department;
        this.faculty = new ArrayList<>();
    }

    void add(Faculty faculty) {
        this.faculty.add(faculty);
    }

    void remove(Faculty faculty) {
        this.faculty.remove(faculty);
    }

    public List<Faculty> getFaculty() {
        return faculty;
    }

    @Override
    public String getDetails() {
        return name + " is the " + department;
    }
}
