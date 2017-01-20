package pl.info.rkluszczynski.pmf.core;

import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(value = {"pl.info.rkluszczynski.pmf.core"})
@EnableConfigurationProperties(value = {GridFieldProperties.class})
public class GridFieldAutoConfiguration {
}
