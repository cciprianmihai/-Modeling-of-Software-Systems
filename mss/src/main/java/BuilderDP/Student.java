package BuilderDP;

import lombok.*;

@Builder
@EqualsAndHashCode @ToString
@Setter
class Student {
    private String firstname;
    private String lastname;
    private String id;
    private int age;
    private String pin;
}

