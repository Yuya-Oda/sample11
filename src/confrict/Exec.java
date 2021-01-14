package confrict;

//追加スレッドの定義
class AddThread extends Thread {

	// スレッド内での処理
	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println("Thread：" + i);
			// HttpConnectionクラス
			HttpConnection httpConn = new HttpConnection();
			// GETリクエストの実行
			httpConn.sendGet();
		}
	}

}

public class Exec {

	public static void main(String[] args) {
		//別スレッドの開始
		Thread th = new AddThread();
		th.start(); // run() ではなく、start() を実行

		// メインスレッド内の処理
		for (int i = 0; i < 100; i++) {
			System.out.println("Main：" + i);
			// HttpConnectionクラス
			HttpConnection httpConn = new HttpConnection();
			// GETリクエストの実行
			httpConn.sendGet();
		}

	}

}
