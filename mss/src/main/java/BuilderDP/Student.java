package BuilderDP;

import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@Builder
@EqualsAndHashCode @ToString
class Student {
    private String firstname;
    private String lastname;
    private String id;
    private int age;
    private String pin;
}