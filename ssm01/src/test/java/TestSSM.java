import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.lzh.dao.UserDao;
import com.lzh.entity.User;
import com.lzh.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class TestSSM {

    @Autowired
    private UserDao userDao;

    @Autowired
    private UserService userService;

    @Test
    public void test1(){
        List<User>users=userDao.queryUsers();
        for (User user : users) {
            System.out.println(user);
        }
    }
    @Test
    public void test2(){
        User user=userDao.queryUserById(27);
        System.out.println(user);
    }
    @Test
    public void test3(){
        User user=new User(1,"lzh10","123456",true,new Date());
        Integer rows=userDao.updateUser(user);
        System.out.println(rows);
    }
    @Test
    public void test4(){
        User user=new User(22,"lzh20","202020",false,new Date());
        Integer rows=userDao.insertUser(user);
        System.out.println(rows);
    }
    @Test
    public void test5(){
        Integer id=10;
        Integer rows=userDao.deleteUser(id);
        System.out.println(rows);
    }
    @Test
    public void test6(){
        List<User> users= Arrays.asList(new User(null,"lzh098","jifejf",true,new Date()),
                                        new User(null,"lzh352","afde32",true,new Date()),
                                        new User(null,"lzh987","ut84hf",false,new Date()),
                                        new User(null,"lzhy83","8327401",true,new Date()));
        Integer rows=userDao.insertManyUsers(users);
        System.out.println(rows);
    }
    @Test
    public void test7(){
        List<Integer> ids=Arrays.asList(33,34);
        Integer rows=userDao.deleteManyUsers(ids);
        System.out.println(rows);
    }
    @Test
    public void test8(){
        List<User> users=userService.queryUsers();
        for (User user : users) {
            System.out.println(user);
        }
        PageInfo<User> pageInfo=new PageInfo(users);
        for (User user : pageInfo.getList()) {
            System.out.println(user);
        }
    }
    @Test
    public void test9(){
        User user=userService.queryUserById(27);
        System.out.println(user);
    }
    @Test
    public void test10(){
        Integer total=userDao.getTotal();
        System.out.println(total);
    }
}
