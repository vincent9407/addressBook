package io.github.langdonhjj.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by HJJ on 16/8/19.
 * 用户组别
 */
@Data
public class Group implements Serializable {

    private Long id;  //id

    private Long userId; //用户ID

    private String groupName;  //用户所在组别

    private String tag;  //每个用户的标签

    private Date createdAt;  //创建时间

    private Date updatedAt; //修改时间


}
