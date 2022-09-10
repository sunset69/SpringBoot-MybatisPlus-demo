# Spring Boot & Mybatis Plus

> 参考：https://www.jianshu.com/p/61fd47955696
>
>注意：使用SpringBoot2.7会出现循环依赖，在主程序的Spring配置文件中添加以下配置取消报错
>`spring.main.allow-circular-references=true`

此项目为SpringBoot整合MybatisPlus的demo。
## 项目结构
```text
SpringBoot-MybatisPlus-demo: 父项目，提供依赖
    |_ mybatis-api: 主程序
        |_controller: 对外接口
        |_MybatisApiApplication: 主程序
    |_ mybatis-repository: 访问数据库模块，由Mybaits自动生成
        |_generator
            |_MPGenerator: Mybatis代码生成
        |_resources
            |_datasource-dev.properties: 开发环境数据源配置
    |_ mybatis-service: 服务层，可以在Mybatis生成代码基础上增加额外代码
        |_extService
            |_PersonExtService: 自定义service