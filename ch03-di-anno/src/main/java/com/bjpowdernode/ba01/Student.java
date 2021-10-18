package com.bjpowdernode.ba01;

import org.springframework.stereotype.Component;

/**
 * @author gjd
 * @create 2021/10/3  13:33:48
 */

/**
 *  这个注解是用来创建对象的，等同于bean标签
 *  属性:value 就是对象的名称，也就是bean的id值，
 *      value的值是唯一的，创建的对象在整个spring容器中就一个。
 *  位置：在类的上面
 *
 *  @Component(value = "student") 等同于 <bean id ="student" class="com.bjpowdernode.ba01.Student/>
 *
 *
 *  spring中，和@Companent功能一样的注解还有：
 *   1. @Repository(用在持久层):放在dao实现类上面，表示创建dao对象，dao对象是能访问数据库的。
 *   2.@Service(放在业务类的上面):放在service的是实现类上面，创建service对象，service对象是做业务处理，可以有事务等功能的。
 *   3.@Controller(用在控制器上)：放在控制器类的上面，创建控制器对象的。控制器对象，能够接收用户提交的数据，显示请求的处理数据。
 *
 *   以上三个注解的使用语法和Companent一样，都是创建对象，但是这三个还有额外的功能。
 *   这三个注解是给项目的对象分层的。
 */
//方式1.使用value指定对象名称
//@Component(value = "student")
//方式2.省略value
//@Component("student")
//方式3,不指定对象名称，由spring提供默认名称：类名，但是首字母小写
@Component
public class Student {

    private String name;
    private int age;

    Student(){
        System.out.println("Student无参构造方法被调用了！！！");
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
