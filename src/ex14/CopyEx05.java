package ex14;

import java.time.LocalDateTime;
//Data Trans
class JoinDTO{
    private String username;
    private String password;
    private String email;

    public JoinDTO(String username, String password, String email) {
        this.username = username;
        this.password = password;
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }
}
class Member{ //멤버에 옮겼다 저장하는 이유는 pk키를 받기 위해서이다
    private int id; //강제로 id번호넣기
    private String username;
    private String password;
    private String email;
    private LocalDateTime createAt; //회원가입날짜 : 개인정보법 지키기 위해서.

    public Member(int id, JoinDTO dto) {
        this.id = id;
        this.username = dto.getUsername();
        this.password = dto.getPassword();
        this.email = dto.getEmail();
        this.createAt = LocalDateTime.now();
    }

    @Override
    public String toString() {
        return "Member{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                ", createAt=" + createAt +
                '}';
    }
}


public class CopyEx05 {
    public static void main(String[] args) {
        JoinDTO d1 = new JoinDTO("ssar","1234","ssar@nate.com");
        JoinDTO d2 = new JoinDTO("cos","1234","cos@nate.com");

        Member m1=new Member(1, d1);
        Member m2=new Member(2, d2);
        System.out.println(m1);

        LocalDateTime now = LocalDateTime.now();//OS시간에 맞춰준다
        now.plusDays(1);
        System.out.println(now);
    }
}
