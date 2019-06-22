package com.aoba.test;

import org.activiti.engine.ProcessEngine;
import org.activiti.engine.ProcessEngineConfiguration;
import org.junit.Test;

public class ActivitiTest {

    @Test
    public void testGenTable(){
        //创建ProcessEngineConfiguration
        ProcessEngineConfiguration configuration=ProcessEngineConfiguration.
                createProcessEngineConfigurationFromResource("activiti.cfg.xml");
        //创建ProcesEngine对象
        ProcessEngine processEngine=configuration.buildProcessEngine();

        //输出processEngine对象
        System.out.println(processEngine);
    }

}
