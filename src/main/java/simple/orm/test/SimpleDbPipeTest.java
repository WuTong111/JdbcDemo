/**
 * $Id: SimpleDbPipeTest.java,v 1.0 2019/2/28 12:44 G Exp $
 * <p>
 * Copyright 2018 Asiainfo Technologies(China),Inc. All rights reserved.
 */
package simple.orm.test;

import org.junit.Test;
import simple.orm.core.SimpleDbPipe;

/**
 * @Description: 单元测试类
 * @author Wuguang
 * @version $Id: SimpleDbPipeTest.java,v 1.1 2019/2/28 12:44 G Exp $
 * Created on 2019/2/28 12:44
 */
public class SimpleDbPipeTest {
    private static SimpleDbPipe<Student> dbPipe = new SimpleDbPipe<Student>();

    @Test
    public void addTest(){
        Student student = null;
        for (int i = 0; i < 10; i++) {
            student = new Student(i, "zhouzhou_" + i, i * 2);
            dbPipe.add(student);
        }
    }

    @Test
    public void updateTest(){
        Student student = null;
        // 更新id为1001的记录
        for (int i = 0; i < 10; i++) {
            student = new Student(i, "new_zhouzhou_" + i, i * 2);
            // 更新数据库中的记录
            dbPipe.update(student);
        }

    }

}