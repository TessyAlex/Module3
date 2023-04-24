/**
 * 
 */
/**
 * @author Administrator
 *
 */
module ioc {
	exports com.ust.ioc;
	exports com.ust.ioc2;
	requires spring.core;
	requires spring.beans;
	requires java.sql;
	requires spring.context;
	exports com.ust.iocautowiring;
	requires java.annotation;
	exports com.ust.javaconfig;
	
	opens com.ust.javaconfig to spring.core;
	
}