package com.example.model;

import net.csdn.annotation.NotMapping;
import net.csdn.annotation.Validate;
import net.csdn.jpa.model.Model;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import java.util.Map;

import static net.csdn.common.collections.WowCollections.newHashMap;
import static net.csdn.validate.ValidateHelper.*;


@Entity
public class Article extends Model {


    /*命名约定:[field_name]_[referenced primary key],比如这里是 blog_id*/
    @ManyToOne
    private Blog blog;

    @Validate
    private final static Map $content =
            newHashMap(
                    presence, newHashMap(message, "{}不能为空")
            );

}
