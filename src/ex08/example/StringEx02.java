package ex08.example;

public class StringEx02 {
    public static void main(String[] args) {
        // 문서
        // ? 뒤를 쿼리스트링이라고 한다.
        // 쿼리스트링은 키=값 형태의 데이터의 집합이다.
        // 키=값이 여러개일때는 &로 구분한다.
        String url = "http://www.naver.com?username=ssar&password=1234";

        // username값과, password값 찾아보기
        String username;
        String password;
        String parse[] = url.split("\\?");
        String parse1[]=parse[1].split("&");
        String parse2[]=parse1[0].split("=");
        username=parse2[1];
        String parse3[]=parse1[1].split("=");
        password=parse3[1];
        System.out.println(username);
        System.out.println(password);
//        int nameFirstIndex=url.indexOf("=");
//        int nameLastIndex=url.lastIndexOf("&");
//        username=url.substring(nameFirstIndex+1,nameLastIndex);
//        System.out.println(username);
//        int pwFirstIndex=url.lastIndexOf("=");
//        password=url.substring(pwFirstIndex+1,url.length());
//        System.out.println(password);
    }
}
