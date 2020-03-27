package com.qyd.play.Bean.Validation.JSR303;

/**
 * @Auther: qiuyd
 * @Date: 2020/3/27 14:31
 * @Description:
 */

public class User {
    @SameTenant(message = "uid验证空")
    private String uid;


    @NotEmpty(message = "{cyd.NotEmpty.message}")
    private String name;

    @SameTenant(message = "age必须大于20")
    private int age;

    @SameTenant
    private String context;



    public String getUid() {
        return uid;
    }


    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "uid='" + uid + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
