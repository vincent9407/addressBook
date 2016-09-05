package io.github.langdonhjj.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by HJJ on 16/8/19.
 * 用户基础类
 */
@Data
public class Users implements Serializable {

    private Long id;  //id

    private String userName;  //用户姓名

    private String pwd;  //用户密码

    private String company; //用户所在公司

    private String img; //用户头像

    private String sex;  //用户性别

    private String phoneNumber;  //用户电话号码

    private String address;  //用户住址

    private Date birthday; //用户生日

    private String email;  //用户电子邮件

    private Date createdAt;  //创建时间

    private Date updatedAt;  //修改时间

}
