/**
 * $Id: Student.java,v 1.0 2019/2/28 10:06 G Exp $
 * <p>
 * Copyright 2018 Asiainfo Technologies(China),Inc. All rights reserved.
 */

import java.util.Calendar;

/**
 * @Description: 映射表的VO类
 * @author Wuguang
 * @version $Id: Student.java,v 1.1 2019/2/28 10:06 G Exp $
 * Created on 2019/2/28 10:06
 */
public class Student {
    private int studentNo;
    private String name;
    private int age;
    private Calendar birthday;

    public Student() {
        super();
    }

    public Student(int studentNo, String name, int age) {
        this.studentNo = studentNo;
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Calendar getBirthday() {
        return birthday;
    }

    public void setBirthday(Calendar birthday) {
        this.birthday = birthday;
    }

    public int getStudentNo() {
        return studentNo;
    }

    public void setStudentNo(int studentNo) {
        this.studentNo = studentNo;
    }
}
