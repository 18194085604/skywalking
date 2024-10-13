package cn.bugstack.xfg.frame;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * -javaagent:/Users/fuzhengwei/1024/KnowledgePlanet/road-map/skywalking/docs/skywalking-agent/skywalking-agent.jar -Dskywalking.agent.service_name=skywalking-app -Dskywalking.collector.backend_service=127.0.0.1:11800
 */
@SpringBootApplication
@Configurable
public class Application {

    @Value("${spring.config.name}")
    public static String appName;

    public static void main(String[] args){
        System.out.println(appName);
        SpringApplication.run(Application.class);
    }

}
