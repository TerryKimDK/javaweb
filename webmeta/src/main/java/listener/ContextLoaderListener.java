package listener;

import javax.naming.InitialContext;
import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

import context.ApplicationContext;


@WebListener
public class ContextLoaderListener implements ServletContextListener {
	static ApplicationContext applicationContext;
	
	public void contextInitialized(ServletContextEvent event) {
		// 서버가 켜지면 자동 로딩
		try {
			ServletContext sc = event.getServletContext();
			InitialContext initialContext = new InitialContext();
			
			String propertiesPath = sc.getRealPath(
					sc.getInitParameter("contextConfigLocation"));
			applicationContext = new ApplicationContext(propertiesPath);
			
		}catch(Throwable e) {
			e.printStackTrace();
		}
	}
	public static ApplicationContext getApplicationContext() {
		return applicationContext;
	}
	public void contextDestroyed(ServletContextEvent evnet) {
		
	}
}
