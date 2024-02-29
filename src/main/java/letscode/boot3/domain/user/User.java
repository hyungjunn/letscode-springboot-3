package letscode.boot3.domain.user;

public class User {
    private String name;
    private Integer age;

    public User(String name, Integer age) { // 유저를 만들때 생성자를 이용해서 값을 넣어줌
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException(String.format("잘못된 name(%s)이 들어왔습니다.", name));
        }
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }
}
