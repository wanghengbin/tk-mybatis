package com.wanghb.test.mybatis.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "sandbox")
public class Sandbox {
    @Id
    @GeneratedValue(generator = "JDBC")
    private Long id;

    /**
     * uid
     */
    private String uid;

    /**
     * hw表示嗨玩
     */
    @Column(name = "app_name")
    private String appName;

    /**
     * 沙盒用户状态，1:启用，2:禁用
     */
    @Column(name = "user_status")
    private Integer userStatus;

    /**
     * 新增时间
     */
    @Column(name = "insert_time")
    private Date insertTime;

    /**
     * 新增用户
     */
    @Column(name = "insert_user")
    private String insertUser;

    /**
     * 最后修改时间
     */
    @Column(name = "update_time")
    private Date updateTime;

    /**
     * 最后修改用户
     */
    @Column(name = "update_user")
    private String updateUser;

    /**
     * @return id
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 获取uid
     *
     * @return uid - uid
     */
    public String getUid() {
        return uid;
    }

    /**
     * 设置uid
     *
     * @param uid uid
     */
    public void setUid(String uid) {
        this.uid = uid;
    }

    /**
     * 获取hw表示嗨玩
     *
     * @return app_name - hw表示嗨玩
     */
    public String getAppName() {
        return appName;
    }

    /**
     * 设置hw表示嗨玩
     *
     * @param appName hw表示嗨玩
     */
    public void setAppName(String appName) {
        this.appName = appName;
    }

    /**
     * 获取沙盒用户状态，1:启用，2:禁用
     *
     * @return user_status - 沙盒用户状态，1:启用，2:禁用
     */
    public Integer getUserStatus() {
        return userStatus;
    }

    /**
     * 设置沙盒用户状态，1:启用，2:禁用
     *
     * @param userStatus 沙盒用户状态，1:启用，2:禁用
     */
    public void setUserStatus(Integer userStatus) {
        this.userStatus = userStatus;
    }

    /**
     * 获取新增时间
     *
     * @return insert_time - 新增时间
     */
    public Date getInsertTime() {
        return insertTime;
    }

    /**
     * 设置新增时间
     *
     * @param insertTime 新增时间
     */
    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }

    /**
     * 获取新增用户
     *
     * @return insert_user - 新增用户
     */
    public String getInsertUser() {
        return insertUser;
    }

    /**
     * 设置新增用户
     *
     * @param insertUser 新增用户
     */
    public void setInsertUser(String insertUser) {
        this.insertUser = insertUser;
    }

    /**
     * 获取最后修改时间
     *
     * @return update_time - 最后修改时间
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * 设置最后修改时间
     *
     * @param updateTime 最后修改时间
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * 获取最后修改用户
     *
     * @return update_user - 最后修改用户
     */
    public String getUpdateUser() {
        return updateUser;
    }

    /**
     * 设置最后修改用户
     *
     * @param updateUser 最后修改用户
     */
    public void setUpdateUser(String updateUser) {
        this.updateUser = updateUser;
    }
}