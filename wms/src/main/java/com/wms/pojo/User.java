package com.wms.pojo;

import com.baomidou.mybatisplus.annotation.TableField;
import lombok.Data;

@Data
public class User {
    private Integer id;
    private String no;
    private String name;
    private String password;
    private int sex;
    private int roleId;
    private String phone;
    @TableField("isvalid")
    private String isValid;
}
