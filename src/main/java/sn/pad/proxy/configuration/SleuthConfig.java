package sn.pad.proxy.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import brave.sampler.Sampler;

@Configuration
public class SleuthConfig {
	
	@Bean
	public Sampler defaultSampler(){
        return Sampler.ALWAYS_SAMPLE;
    }
}

