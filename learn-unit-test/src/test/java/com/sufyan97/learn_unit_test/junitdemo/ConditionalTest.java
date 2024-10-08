package com.sufyan97.learn_unit_test.junitdemo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.EnabledForJreRange;
import org.junit.jupiter.api.condition.EnabledIfEnvironmentVariable;
import org.junit.jupiter.api.condition.EnabledIfSystemProperties;
import org.junit.jupiter.api.condition.EnabledIfSystemProperty;
import org.junit.jupiter.api.condition.EnabledOnJre;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.JRE;
import org.junit.jupiter.api.condition.OS;

@DisplayNameGeneration(ReplaceCamelCase.class)
class ConditionalTest {

	@Test
	@Disabled("don't run until redmine #xxx")
	void basicTest() {
		//
	}
	
	@Test
	@EnabledOnOs(OS.WINDOWS)
	void testForWindowsOnly() {
		
	}
	
	@Test
	@EnabledOnOs(OS.MAC)
	void testForMacOnly() {
		
	}
	
	@Test
	@EnabledOnOs({OS.WINDOWS, OS.MAC})
	void testForMacAndWindowsOnly() {
		
	}
	
	@Test
	@EnabledOnOs(OS.LINUX)
	void testForLinuxOnly() {
		
	}
	
	@Test
	@EnabledOnJre(JRE.JAVA_17)
	void testForOnlyJava17() {
		
	}
	
	@Test
	@EnabledOnJre(JRE.JAVA_13)
	void testForOnlyJava13() {
		
	}
	
	@Test
	@EnabledForJreRange(min = JRE.JAVA_13, max = JRE.JAVA_18)
	void testForJavaRange13And18() {
		
	}
	
	@Test
	@EnabledForJreRange(min = JRE.JAVA_11)
	void testForJavaRangeMin11() {
		
	}
	
	@Test
	@EnabledIfEnvironmentVariable(named = "LOL_ENV", matches = "DEV")
	void testOnlyForDevEnv() {
		
	}
	
	@Test
	@EnabledIfSystemProperty(named = "LOL_SYS_PROP", matches = "CI_CD_DEPLOY")
	void testOnlyForCiCdSys() {
		
	}
}
