package day04;

import java.util.HashMap;
import java.util.Scanner;

public class UserDAO {
    static Scanner sc = new Scanner(System.in);
    static HashMap<String, String> map = new HashMap<String, String>();
    static User user = new User();
    static boolean isLoggedIn = false;

    public static void main(String[] args) {
        play();
    }

    public static void play() {
        while (true) {
            System.out.println("메뉴를 선택하세요 : 1) 회원가입 2) 로그인 3) 정보수정 4) 회원탈퇴 5)로그아웃 0) 종료");
            int menu = sc.nextInt();
            switch (menu) {
                case 1:
                    signUp();
                    break;
                case 2:
                    signIn();
                    break;
                case 3:
                    modifyInfo();
                    break;
                case 4:
                    deleteInfo();
                    break;
                case 5:
                    signOut();
                    break;
                case 0:
                    return;
            }
        }
    }



    public static void enroll() {
        while (true) {
            System.out.println("아이디를 입력해주세요 0) 뒤로가기");
            String id = sc.next();
            if (id.equals("0")) {
                return;
            }
            // DB에 해당 아이디가 있는지 확인
            if (map.containsKey(id)) {
                System.out.println("이미 존재하는 아이디입니다");
                continue;
            } else {
                System.out.println("비밀번호를 입력해주세요");
                String password = sc.next();
                map.put(id, password);
                return;
            }
        }
    }
    public static boolean checkOut(boolean isLoggedIn){
        System.out.println("아이디를 입력해주세요");
        String id = sc.next();
        System.out.println("비밀번호를 입력해주세요");
        String password = sc.next();
        if (map.containsKey(id)) {
            if (map.get(id).equals(password)) {
                user.setId(id);
                user.setPassword(password);
                isLoggedIn = true;
                System.out.println("로그인 성공!");
                return true;
            }
            System.out.println("비밀번호가 일치하지 않습니다.");
            return false;
        }
        System.out.println("해당 아이디가 존재하지 않습니다.");
        return false;
    }

    public static void updateProfile() {
        String id = user.getId();
        System.out.println("변경할 비밀번호를 입력해주세요.");
        String password = sc.next();
        map.replace(id, map.get(id), password);
        System.out.println("비밀번호가 변경되었습니다.");
    }



    public static void deleteProfile() {
        String id = user.getId();
        while (true) {
            System.out.println("정말로 지우시겠습니까? 1:확인 0:취소");
            int cmd = sc.nextInt();
            switch (cmd) {
                case 1:
                    map.remove(id);
                    isLoggedIn = false;
                    System.out.println("삭제 완료.");
                    return;
                case 0:
                    return;
                default:
                    System.out.println("제대로 입력하세요!");
            }
        }
    }

    private static void logout() {
        isLoggedIn = false;
        System.out.println("로그아웃 성공.");
    }

    public static void signUp() {
        if (isLoggedIn) {
            System.out.println("이미 로그인 되어있습니다.");
            return;
        } else {
            enroll();

        }
    }


    public static void signIn() {
        if (isLoggedIn){
            System.out.println("이미 로그인 되어있습니다.");
            return;
        }
        isLoggedIn = checkOut(isLoggedIn);
    }

    public static void modifyInfo() {
        if (!isLoggedIn) {
            System.out.println("먼저 로그인을 해주세요.");
            return;
        } else {
            updateProfile();
        }
    }

    public static void deleteInfo() {
        deleteProfile();
    }

    private static void signOut() {
        if(isLoggedIn){
            logout();
        }else{
            System.out.println("로그인 되어있지 않습니다.");
        }
    }



}

class User {
    private String id;
    private String password;

    public void setId(String id) {
        this.id = id;
    }

    public void setPassword(String id) {
        this.password = password;
    }

    public String getId() {
        return id;
    }

    public String getPassword() {
        return password;
    }
}

