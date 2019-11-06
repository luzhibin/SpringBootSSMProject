package com.lzb.pojo;

import lombok.Data;
import tk.mybatis.mapper.annotation.KeySql;

import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

/**
 * Created by luzhibin on 2019/11/5 17:02
 */
@Data
@Table(name = "tb_hero")    /*作用：建立实体类和数据库表之间的对应关系。
默认规则：实体类类名首字母小写作为表名。Employee 类→employee 表。
用法：在@Table 注解的 name 属性中指定目标数据库表的表名
*/
public class Hero {

        @Id //使用@Id 主键明确标记和数据库表中主键字段对应的实体类字段
        @KeySql(useGeneratedKeys = true)   //自动生成主键
        private Integer id;
        private String username;
        private String profession;
        //@Transient //用于标记不与数据库表字段对应的实体类字段。
        private String phone;
        private String email;
        private Date onlinetime;
}
