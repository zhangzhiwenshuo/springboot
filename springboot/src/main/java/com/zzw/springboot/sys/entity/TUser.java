package com.zzw.springboot.sys.entity;

import lombok.Data;
/**
 * <p>
 * 
 * </p>
 *
 * @author zhangzw
 * @since 2021-04-15
 */
@Data
public class TUser {

    private static final long serialVersionUID = 1L;

    private String username;

    private String email;

    private Boolean emailVerified;

    private String nickname;

    private String avatar;

    private String backgroundImage;

    private String password;

    private String homePage;

    private String description;

    private Long score;

    private Long status;

    private Long topicCount;

    private Long commentCount;

    private String roles;

    private Long type;

    private Long forbiddenEndTime;

    private Long createTime;

    private Long updateTime;


}
