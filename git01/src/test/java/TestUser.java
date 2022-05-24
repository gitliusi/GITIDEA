import com.sliu.spring.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestUser {
    @Test
    public void addTest(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean-jdbctemplate.xml");
        UserService userService = context.getBean("userService",UserService.class);
        userService.add();
    }
}
