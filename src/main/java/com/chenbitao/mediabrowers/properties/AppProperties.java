package com.chenbitao.mediabrowers.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;

@Order(0)
@Component
@ConfigurationProperties(prefix = "media-browers")
public class AppProperties {

	@Getter
	@Setter
	private String path;

	@Getter
	@Setter
	private String tempPath;
}
