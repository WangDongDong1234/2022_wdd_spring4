package autoConfig;

import autoConfig.cd.SgtPeppers;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author: WangDongDong
 * @version: v1.0
 * @create: 2021-07-26 00:05
 * @description  ，@ComponentScan默认会扫描与配置类相同的包
 **/
@Configuration
@ComponentScan(basePackages = {"autoConfig.cd"})
//@ComponentScan(basePackageClasses = {SgtPeppers.class})
public class CDPlayerConfig {
}
