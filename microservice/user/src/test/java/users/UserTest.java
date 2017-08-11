package users;

import com.tluo.lala.microservice.users.Application;
import com.tluo.lala.microservice.users.dao.UserDao;
import com.tluo.lala.microservice.users.domain.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by edz on 2017/8/11.
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class)

public class UserTest {

    @Autowired
    private UserDao userDao;

    @Test
    public void testFindUser() {
        User user = userDao.findById(826920);
        if (user != null) {
            System.out.println(user.getId() + user.getUsername() + user.getMobile());
        } else {
            System.out.println("spring boot can not connection mysql and not find user");
        }
    }
}
