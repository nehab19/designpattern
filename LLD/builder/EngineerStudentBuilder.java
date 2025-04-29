package guru.springframework.spring5webapp.designpattern.LLD.builder;

import java.util.ArrayList;
import java.util.List;

public class EngineerStudentBuilder extends StudentBuilder {
    @Override
    public StudentBuilder setSubjects() {
        List<String> subject = new ArrayList<>();
        subject.add("Computer Science");
        subject.add("DSA");
        subject.add("Computer Architecture");
        this.subjects=subject;
        return this;
    }
}
