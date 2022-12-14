package cc.lexur.repository.generator;

import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.config.DataSourceConfig;
import com.baomidou.mybatisplus.generator.config.GlobalConfig;
import com.baomidou.mybatisplus.generator.config.PackageConfig;
import com.baomidou.mybatisplus.generator.config.StrategyConfig;
import com.baomidou.mybatisplus.generator.config.converts.MySqlTypeConvert;
import com.baomidou.mybatisplus.generator.config.rules.DbColumnType;
import com.baomidou.mybatisplus.generator.config.rules.DbType;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;

import java.io.File;

/**
 * @Description: 代码生成器，使用MybatisPlus自动生成代码
 * @Auther: lexur
 * @Date: 2022/9/10
 */
public class MPGenerator {
    /**
     * MySQL 生成演示, 使用时有三处需要改成自己的信息
     */
    public static void main(String[] args) {
        AutoGenerator mpg = new AutoGenerator();

        // 全局配置
        GlobalConfig gc = new GlobalConfig();

        //文件输出路径
        gc.setOutputDir((new File("mybatis-repository")).getAbsolutePath()+"/src/main/java");
        gc.setFileOverride(true);
        gc.setActiveRecord(true);
        gc.setEnableCache(false);// XML 二级缓存
        gc.setBaseResultMap(true);// XML ResultMap
        gc.setBaseColumnList(false);// XML columList
        //作者
        gc.setAuthor("lexur");
        mpg.setGlobalConfig(gc);

        // 数据源配置
        DataSourceConfig dsc = new DataSourceConfig();
        dsc.setDbType(DbType.MYSQL);
        dsc.setTypeConvert(new MySqlTypeConvert() {
            // 自定义数据库表字段类型转换【可选】
            @Override
            public DbColumnType processTypeConvert(String fieldType) {
                System.out.println("转换类型：" + fieldType);
                return super.processTypeConvert(fieldType);
            }
        });
        // 修改成自己的数据库
        dsc.setDriverName("com.mysql.jdbc.Driver");
        dsc.setUsername("root");
        dsc.setPassword("root");
        dsc.setUrl("jdbc:mysql://127.0.0.1:3306/MybatisTest?useUnicode=false&autoReconnect=true&characterEncoding=utf-8");
        mpg.setDataSource(dsc);

        // 策略配置
        StrategyConfig strategy = new StrategyConfig();
        strategy.setNaming(NamingStrategy.underline_to_camel);// 表名生成策略,下划线转驼峰
        // 修改成自己需要的表
        strategy.setInclude(new String[]{"person", "dept"}); // 需要生成的表,多个表逗号隔开
        mpg.setStrategy(strategy);

        // 包配置
        PackageConfig pc = new PackageConfig();
        // 修改成自己项目的包名
        pc.setParent("cc.lexur");
        pc.setModuleName("repository");
        pc.setEntity("entity");
        pc.setMapper("mapper");
        pc.setXml("mapper.impl");
        pc.setService("service");
        pc.setServiceImpl("service.impl");
        pc.setController("controller");
        mpg.setPackageInfo(pc);

        mpg.execute();
        System.out.println("生成完毕");
    }
}