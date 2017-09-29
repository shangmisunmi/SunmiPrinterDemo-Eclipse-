/**
* JIUI V5 IYmodemSPI 用于打印机升级应用开发者调用无效
* Version: 1.0
*/

package woyou.aidlservice.jiuiv5;

interface IYmodemSPI {
	
	/**
	 * 一个指令的发送进度
	 * @param percent 发送百分比
	 */
	void sendPercent(float percent);	
	
	/**
	 * 一个指令发送完成
	 * @param count 发送的总包数
	 */
	void sendFinish(int count);
	
	/**
	 * ymodem 下载是否成功
	 * @param flag			是否成功
	 * @param msg			描述
	 */
	void onFinishYmodemDownload(boolean flag, String msg);
	
}