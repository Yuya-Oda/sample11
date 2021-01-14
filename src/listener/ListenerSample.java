package listener;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class ListenerSample implements ServletContextListener {
	public void contextInitialized(ServletContextEvent arg0) {
		// 訪問回数を表すIntegerインスタンスを新規作成し
		// アプリケーションスコープに保存
		ServletContext context = arg0.getServletContext();
		Integer count = 0;
		context.setAttribute("count", count);
	}

	@Override
	public void contextDestroyed(ServletContextEvent arg0) {

	}

}
