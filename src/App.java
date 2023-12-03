import user.domain.User;
import user.domain.UserDao;

public class App {

    public static void main(String[] args) throws Exception {
        UserDao dao = new UserDao();

        User user = new User();
        user.setId("1");
        user.setName("이승헌");
        user.setPassword("1234");

        dao.addUser(user);

        System.out.println("등록 성공!!" + user.getId());

        User user2 = dao.getUser("1");
        System.out.println("user2 name= " + user2.getName());
        System.out.println("user2.getPassword() = " + user2.getPassword());
        System.out.println("조회 성공!!!" + user2.getId());
    }
}
