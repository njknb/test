package com.hy.demo.common;

/**
 * @author: 何志权27629
 * @description: 状态码实体类
 */
public class StatusCode {

    /**成功*/
    public static final String OK = "0000";

    /**系统异常*/
    public static final String ERROR = "0001";

    /**用户名或密码错误*/
    public static final String LOGINERROR = "0002";

    /**权限不足*/
    public static final String ACCESSERROR = "0003";

    /**远程调用失败*/
    public static final String REMOTEERROR = "0004";

    /**重复操作*/
    public static final String REPERROR = "0005";

    /**退出账号*/
    public static final String LOGOUT = "0006";

    /**用户名错误*/
    public static final String LOGUSERNAME = "0007";

    /**密码错误*/
    public static final String LOGPASSWORD = "0008";

    /** 10 --> 草稿*/
    public static final String STATUS_10 = "10";

    /** 20 --> 未完成 */
    public static final String STATUS_20 = "20";

    /** 30 --> 完成 */
    public static final String STATUS_30 = "30";

}