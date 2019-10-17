import com.czp.service.UserService;
import com.czp.service.impl.UserServiceImpl;

public class Test_Mabits {
    public static void main(String[] args) {
        UserService userService = new UserServiceImpl();
        userService.selectById(1);
    }
}
