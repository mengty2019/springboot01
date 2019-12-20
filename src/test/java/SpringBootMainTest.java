import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.stereotype.Component;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.asit.SpringBootMain;
import com.asit.bean.Person;
@RunWith(SpringRunner.class)
//@SpringBootTest
//@RunWith(SpringJUnit4ClassRunner.class)
@Component //依赖注入用
@SpringBootTest(classes = SpringBootMain.class) //app为主程序入口类
public class SpringBootMainTest {
	@Resource
	private Person person;
    @Test
    void contextLoads() {
        System.out.println(person);
        
    }
}
