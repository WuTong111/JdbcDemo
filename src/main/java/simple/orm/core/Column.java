package simple.orm.core;

import java.lang.annotation.*;

/**
 *  * function description.
 *  *
 *  * <p><h2>Descriptions</h2>
 *  * <h3>Project</h3> SpringJdbcDemo
 *  * <h3>Package</h3> simple.orm.core
 *  * </p>
 *  * <p><h2>Change History</h2>
 *  * 2019/2/28 10:20 | G | created
 *  * </p>
 *  *
 *  * @author Wuguang
 *  * @version 1.0.0
 *  
 */
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Column {
    String name();
    String type() default "string";
    int length() default 20;
}
