package fmpp.test;

import java.io.File;
import java.net.MalformedURLException;

import org.apache.tools.ant.Project;

import fmpp.tools.AntTask;

public class AntTaskTest {

	/**
	 * @param args
	 * @throws MalformedURLException 
	 */
	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub

		
		AntTask task = new AntTask();
		// task.setConfiguration(new File("E:/Work/coupon/branches/branch111205/src/main/webapp/WEB-INF/fmpp.cfg"));

		Project project = new Project();
		project.setName("main");
		project.setBasedir("E:/Work/coupon/branches/branch111205/src/main/webapp/WEB-INF");
		
		task.setProject(project);
		
		task.setSourceRoot(new File("E:/Work/coupon/branches/branch111205/src/main/webapp/WEB-INF"));
		task.setIncludes("tmpl/sample.ftl");

		task.setOutputRoot(new File("E:/Work/coupon/branches/branch111205/src/test/mock/tpl"));
		task.setReplaceExtension("ftl,html");
		//		task.setSourceFile(new File("E:/Work/coupon/branches/branch111205/src/main/webapp/WEB-INF/tmpl/sample.ftl"));
//		task.setOutputFile(new File("E:/Work/coupon/branches/branch111205/src/test/mock/tpl/tmpl/sample.html"));
		
		task.setData("tdd(E:/Work/coupon/branches/branch111205/src/test/mock/tdd/oglobal.tdd),tdd(E:/Work/coupon/branches/branch111205/src/test/mock/tdd/sample.tdd)");
		
		task.execute();
		
//		URL url = TemplateEnvironment.class.getClassLoader().getResource("fmpp.properties");
//		
//		//System.out.println(url.getFile());
//
//		Log log = LogFactory.getLog(AntTaskTest.class);
//		log.debug(url.getFile());
	}

}
