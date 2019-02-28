package simple.orm.core;

import java.lang.annotation.*;

/**
 *  * function description.
 *  把表中的字段和类中的属性关联起来。在数据库中键，尤其是id，是有别于普通的字段的
 *  ，据此我们可以把字段分为两种类型：id和普通的字段。
 *  *
 *  * <p><h2>Descriptions</h2>
 *  * <h3>Project</h3> SpringJdbcDemo
 *  * <h3>Package</h3> simple.orm.core
 *  * </p>
 *  * <p><h2>Change History</h2>
 *  * 2019/2/28 10:15 | G | created
 *  * </p>
 *  *
 *  * @author Wuguang
 *  * @version 1.0.0
 *  
 */
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Id {
    //@Id注解包括四个方法，通过它们可以获得表中id的名称，id 的类型，
    // 以及id字段的长度，如果是id类型是int型的整数，可以获得自动增长量。
    String name();
    String type() default "int";
    int length() default 20;
}
