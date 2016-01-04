package com.springapp.mvc.model.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

/**
 * @author a2driano
 * @version 2.0
 * @since 02.01.2016
 */
@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name = "increment", strategy = "increment")
    @Column(name = "id")
    private Integer id;

    @Column(name = "nickname")
    private String nickName;

    @Column(name = "passworduser")
    private String passwordUser;

    @Column(name = "usingnickname")
    private Boolean usingnickname;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getPasswordUser() {
        return passwordUser;
    }

    public void setPasswordUser(String passwordUser) {
        this.passwordUser = passwordUser;
    }
}
