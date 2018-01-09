package com.yz.entity;

public class GoodsType {
    private Integer id;

    private String name;

    private Integer sorts;

    private String isAuth;

    private String isRegist;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getSorts() {
        return sorts;
    }

    public void setSorts(Integer sorts) {
        this.sorts = sorts;
    }

    public String getIsAuth() {
        return isAuth;
    }

    public void setIsAuth(String isAuth) {
        this.isAuth = isAuth == null ? null : isAuth.trim();
    }

    public String getIsRegist() {
        return isRegist;
    }

    public void setIsRegist(String isRegist) {
        this.isRegist = isRegist == null ? null : isRegist.trim();
    }
}