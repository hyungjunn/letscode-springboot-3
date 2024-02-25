package letscode.boot3.dto.user.response;

import letscode.boot3.domain.user.User;

public class UserResponse {
    private  final long id;
    private final String name;
    private final Integer age;

    public UserResponse(long id, User user) {
        this.id = id;
        this.name = user.getName();
        this.age = user.getAge();
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

}
