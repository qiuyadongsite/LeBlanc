package com.qyd.play.designModel.singleton.register;

/**
 * @Auther: qiuyd
 * @Date: 2020/2/27 08:45
 * @Description:
 * 优点：解决了静态内部类等以上，需要解决反射破坏的问题，同时也优雅了
 * 缺点：恶汉式，因为也
 */
public enum  RegisterEnumSingleton {
    Instance;
    private Object object;
    public Object getObject() {
        return object;
    }
    public void setObject(Object object) {
        this.object = object;
    }
}
