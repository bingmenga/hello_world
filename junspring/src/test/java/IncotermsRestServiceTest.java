import com.alibaba.fastjson.JSON;
import com.java.study.jun.spring.ssm.entity.User;
import com.java.study.jun.spring.ssm.service.UserService;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import java.util.ArrayList;
import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
@WebAppConfiguration
public class IncotermsRestServiceTest {
    @Autowired
    private WebApplicationContext wac;
    private MockMvc mockMvc;


    @Autowired
    private UserService userService;

    @Before
    public void setup() {
        this.mockMvc = MockMvcBuilders.webAppContextSetup(this.wac).build();   //构造MockMvc
    }

    @Test
    public void addUser(){
        User user = new User();
        user.setUserName("藥");
        user.setPassword("123");
        userService.addUser(user);
        System.out.println(JSON.toJSONString(user));
    }


    @Test
    public void addBatchUser(){
        List<User> list = new ArrayList<>();
        User user = new User();
        user.setUserName("藥");
        user.setPassword("123");
        User user1 = new User();
        user1.setUserName("藥1");
        user1.setPassword("123");

        list.add(user);
        list.add(user1);
        userService.addBatchUser(list);
        System.out.println(JSON.toJSONString(list));
    }

    @Test
    public void updateUser(){
        User user = new User();
        user.setId(19);
        user.setPassword("1234");
        userService.updateUser(user);
        System.out.println(JSON.toJSONString(user));
    }

    @Test
    public void updateBatchUser(){
        List<User> list = new ArrayList<>();
        User user = new User();
        user.setId(20);
        user.setUserName("藥update");
        user.setPassword("1234");
        User user1 = new User();
        user1.setId(21);
        user1.setUserName("藥1update");
        user1.setPassword("12345");

        list.add(user);
        list.add(user1);
        userService.updateBatchUser(list);
        System.out.println(JSON.toJSONString(list));
    }

    @Test
    public void deleteUser(){
        userService.deleteUser(22);
    }

    @Test
    public void deleteBatchUser(){
        List<Integer> list = new ArrayList<>();
        list.add(23);
        list.add(24);
        userService.deleteBatchUser(list);
    }

}