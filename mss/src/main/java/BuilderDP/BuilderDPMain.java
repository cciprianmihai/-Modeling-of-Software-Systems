package BuilderDP;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class BuilderDPMain {
    public static void main(String[] args) {
        Student ciprian = Student.builder()
                .pin("1232412837198273912")
                .firstname("Ciprian")
                .lastname("Mihai")
                .id("205")
                .age(12)
                .build();
        System.out.println(ciprian);
    }
}
