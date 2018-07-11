# 数据库配置
spring.datasource.type=com.alibaba.druid.pool.DruidDataSource
spring.datasource.driver-class-name=com.mysql.jdbc.Driver
spring.datasource.url=jdbc:mysql://${dbIp}:${dbPort}/${dbName}?useUnicode=true&characterEncoding=utf8&useSSL=false
spring.datasource.username=${username}
spring.datasource.password=${password}