package pack;

import pack.a.User;

public class PackageMain3 {
    public static void main(String[] args) {
        User userA = new User();
        pack.b.User userB = new pack.b.User(); // 이미 a를 임포트 했기 때문에 b는 직접 다 써줘야함

    }
}
