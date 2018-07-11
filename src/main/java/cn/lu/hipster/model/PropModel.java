package cn.lu.hipster.model;

import cn.lu.hipster.consts.ProjectType;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * application.properties信息
 *
 * @author lutiehua
 * @date 2017/11/10
 */
@Getter
@Setter
@NoArgsConstructor
public class PropModel extends DataModel {

    /**
     * 服务名称 spring.application.name
     */
    private String serviceName;

    /**
     * 服务端口 server.port
     */
    private int servicePort;

    /**
     * 数据库用户名 spring.datasource.password
     */
    private String username;


    /**
     * 数据库密码 spring.datasource.password
     */
    private String password;

    /**
     * 数据库ip spring.datasource.url
     */
    private String dbIp;


    /**
     * 数据库端口 spring.datasource.url
     */
    private int dbPort;


    /**
     * 监控端口
     */
    private int managePort;

    /**
     * 数据库名 spring.datasource.url
     */
    private String dbName;

    /**
     * 实体类包名 mybatis.type-aliases-package
     */
    private String entityPackage;

    /**
     * 项目类型
     */
    private String projectType = ProjectType.PROJECT_TYPE_BOOT;

}
