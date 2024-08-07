package Splitmate.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan("Splitmate.mapper")
public class MyBatisConfig {
}