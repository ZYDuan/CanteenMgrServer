package UserTest;

import com.ready.pojo.UserInfo;
import com.ready.util.JsonUtil;
import org.junit.Test;

import java.util.HashMap;

public class JsonUtilTest {

    @Test
    public void parseJsonTest(){
        UserInfo userInfo = new UserInfo();
        userInfo.setUserAccount("123");
        userInfo.setUserAccount("23");
        userInfo.setUserAuz(1);
        userInfo.setUserId(1);
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("userinfo", "12");
        System.out.println(JsonUtil.parseToJson(hashMap));
    }
}