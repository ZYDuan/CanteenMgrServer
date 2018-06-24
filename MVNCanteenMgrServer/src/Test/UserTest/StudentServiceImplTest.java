package UserTest;

import com.ready.ResponseVo.StudentResponse;
import com.ready.service.StudentService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath*:config/spring/spring-*.xml","classpath*:config/mybatis/SqlMapConfig.xml"})
public class StudentServiceImplTest {
    @Autowired
    private StudentService studentServiceImpl;

    @Test
    public void getStudentInfo() throws Exception {
        List<StudentResponse> responses = studentServiceImpl.getStudentInfo(0, 4);
        for(StudentResponse response : responses){
            System.out.println(response.getClassName());
            System.out.println(response.getStuName());
            System.out.println(response.getGrade());
        }
    }

}