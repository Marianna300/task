package task1;

import lombok.Data;

import java.util.List;

@Data
public class User {
    private String username;
    private List<Group> groups;
    private Integer age;

}
