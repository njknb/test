package com.hy.demo.common;



/**
 * @author: 何志权27629
 * @description:
 * @date: 2021/3/1 12:13
 */
public class PathVo extends PersonnelInfo {

    /** id */
    private String id;

    /** 有效性 */
    private String flag;

    /** 类型 */
    private String type;

    /** 路径类型 */
    private String pathType;

    /** 路径 */
    private String path;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getPathType() {
        return pathType;
    }

    public void setPathType(String pathType) {
        this.pathType = pathType;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }
}
