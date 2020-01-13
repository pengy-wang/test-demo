package wpy.bean;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @auther: User
 * @Date: 2020/1/11 22:09
 * @Description:
 */
@Data
public class Student {

    private String name;
    private String pwd;

    void initSay() {
        System.out.println("############ init student");
    }
    void destorySay() {
        System.out.println("############ destory student");
    }
}
