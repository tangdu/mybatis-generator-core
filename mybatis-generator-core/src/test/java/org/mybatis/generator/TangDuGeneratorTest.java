package org.mybatis.generator;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.internal.DefaultShellCallback;

/**
 * 生成测试类-->generator_tangdu.xml
 * 
 * @author tangdu
 *
 */
public class TangDuGeneratorTest {

	@Test
	public void testGenerateMyBatis3() throws Exception {
		List<String> warnings = new ArrayList<String>();
		ConfigurationParser cp = new ConfigurationParser(warnings);
		Configuration config = cp
				.parseConfiguration(this.getClass().getClassLoader().getResourceAsStream("generator_tangdu.xml"));

		DefaultShellCallback shellCallback = new DefaultShellCallback(true);

		try {
			MyBatisGenerator myBatisGenerator = new MyBatisGenerator(config, shellCallback, warnings);
			myBatisGenerator.generate(null);
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}
}
