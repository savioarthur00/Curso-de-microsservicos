package com.estudosMS.hrapigatewayzuul.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.oauth2.provider.token.store.JwtAccessTokenConverter;
import org.springframework.security.oauth2.provider.token.store.JwtTokenStore;


@Configuration
public class AppConfig {
	
	//Converter o token
		@Bean
		public JwtAccessTokenConverter accessTokenConverter() {
			JwtAccessTokenConverter tokenConverter = new JwtAccessTokenConverter();
			tokenConverter.setSigningKey("MY-SECRET-KEY");
			return tokenConverter;
		}
		
		//Fazer a leitura do token
		@Bean
		public JwtTokenStore tokenStore() {
			return new JwtTokenStore(accessTokenConverter());
			
		}

}
