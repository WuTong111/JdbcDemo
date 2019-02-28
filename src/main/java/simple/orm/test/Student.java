/**
 * $Id: Student.java,v 1.0 2019/2/28 10:23 G Exp $
 * <p>
 * Copyright 2018 Asiainfo Technologies(China),Inc. All rights reserved.
 */
package simple.orm.test;

import simple.orm.core.Column;
import simple.orm.core.Id;
import simple.orm.core.Table;

import java.util.Calendar;

/**
 * @Description: 开发了关联两者的注解，实现表和类的关联。
 * @author Wuguang
 * @version $Id: Student.java,v 1.1 2019/2/28 10:23 G Exp $
 * Created on 2019/2/28 10:23
 */
@Table(name = "student")
public class Student {
    @Id(name = "student_id")
    private int studentNo;
    @Column(name = "name")
    private String name;
    @Column(name = "age",type = "int")
    private int age;
    @Column(name = "birthday",type = "Calendar")
    private Calendar birthday;

    public Student() {
        super();
    }

    public Student(int studentNo, String name, int age) {
        this.studentNo = studentNo;
        this.name = name;
        this.age = age;
    }

    public int getStudentNo() {
        return studentNo;
    }

    public void setStudentNo(int studentNo) {
        this.studentNo = studentNo;
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
}