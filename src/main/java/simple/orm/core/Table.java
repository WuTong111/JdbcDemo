package simple.orm.core; /**
 * $Id: simple.orm.core.Table.java,v 1.0 2019/2/28 10:09 G Exp $
 * <p>
 * Copyright 2018 Asiainfo Technologies(China),Inc. All rights reserved.
 */

import java.lang.annotation.*;

/**
 * @Description: 关联表和类--注解
 * 这个注解将实现类名和表名的一一对应的关系
 * @author Wuguang
 * @version $Id: simple.orm.core.Table.java,v 1.1 2019/2/28 10:09 G Exp $
 * Created on 2019/2/28 10:09
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Table {
    String name();
}