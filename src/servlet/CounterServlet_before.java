package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * Servlet implementation class CounterServlet
 */
@WebServlet("/CounterServlet_before")
public class CounterServlet_before extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		/*
		 * ① 何らかのパラメーターを受け取って初期化処理をおこなう場合
		 * → パラメータありのinitメソッド
		 *
		 * ② 決まった初期化処理をおこなう場合
		 * → パラメータなしのinitメソッド
		 */
		super.init(config); // 制約あり（記述必須：教科書P.315）
//		super.init();		 // 記述の制約なし

		// 訪問回数を表すIntegerインスタンスを新規作成しアプリケーションスコープに保存
		Integer count = 0;

		ServletContext application = config.getServletContext();
//										↑ 引数のインスタンスでもOK
//										↓ 自身のインスタンスでもOK
//		ServletContext application = this.getServletContext();

		application.setAttribute("count", count);

		// init()が実行されているかの確認のためコンソールに表示
		System.out.println("init()が実行されました");
	}

	/**
	 * @see Servlet#destroy()
	 */


	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// アプリケーションスコープに保存された訪問回数を増加
		ServletContext application = this.getServletContext();

		Integer count = (Integer) application.getAttribute("count");
		count++;
		application.setAttribute("count", count);

		//HTML出力
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<head>");
		out.println("<title>訪問回数を表示</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<p>訪問回数：" + count + "</p>");
		out.println("<a href=\"/sample11/CounterServlet\">更新</a>");
		out.println("</body>");
		out.println("</html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

	public void destroy() {
		// destroy()が実行されているかの確認のためコンソールに表示
		System.out.println("destroy()が実行されました。");
	}

}
