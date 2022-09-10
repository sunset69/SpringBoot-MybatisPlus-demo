package cc.lexur.repository.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * @Description: cc.lexur.repository.config
 * @Auther: lexur
 * @Date: 2022/9/10
 */
// @MapperScan所扫描的要换成自己需要的mapper
@MapperScan("cc.leuxr.repository.mapper*")
@Configuration
public class InitConfig {

}