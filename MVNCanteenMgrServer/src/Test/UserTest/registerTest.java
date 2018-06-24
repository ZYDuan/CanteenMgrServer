package UserTest;

import com.ready.dao.UserInfoMapper;
import com.ready.pojo.UserInfo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @program: MVNCanteenMgr
 * @author: zyd
 * @description: 添加user的测试用例
 * @create: 2018-06-15 16:46
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:config/spring/spring-mvc.xml", "classpath:config/spring/spring-mybatis.xml", "classpath:config/mybatis/SqlMapConfig.xml"})
public class registerTest {

    @Autowired
    private UserInfoMapper userInfoMapper;

    @Test
    public void test() {
        UserInfo userInfo = new UserInfo();
        userInfo.setUserAuz(1);
        userInfo.setUserPassword("134");
        userInfo.setUserAccount("421");
        userInfoMapper.insert(userInfo);
    }

    public static void main(String[] args) {
        System.out.println("args = [ 1 2" + args + "]");
    }
}
