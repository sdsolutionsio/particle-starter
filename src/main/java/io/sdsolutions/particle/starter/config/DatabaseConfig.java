package io.sdsolutions.particle.starter.config;

import io.sdsolutions.particle.database.config.JooqDatabaseConfiguration;
import org.jooq.SQLDialect;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DatabaseConfig extends JooqDatabaseConfiguration {

	@Value(value = "${spring.datasource.dbType}")
	private String dbType;

	@Override
	public SQLDialect getSQLDialect() {
		if("postgres".equalsIgnoreCase(dbType)) {
			return SQLDialect.POSTGRES;
		}

		throw new RuntimeException("Database Not Supported");
	}

}
