package com.test.printertestdemo;

import woyou.aidlservice.jiuiv5.ICallback;
import woyou.aidlservice.jiuiv5.IWoyouService;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.RemoteException;

public class WoyouPrinter {
	
	private static final WoyouPrinter printer = new WoyouPrinter();
	private  IWoyouService woyouService = null;
	
	private ServiceConnection connService = new ServiceConnection() {

		@Override
		public void onServiceDisconnected(ComponentName name) {
			woyouService = null;
		}		
		@Override
		public void onServiceConnected(ComponentName name, IBinder service) {
			woyouService = IWoyouService.Stub.asInterface(service);
		}
	};

	private WoyouPrinter(){}
	
	
	public static WoyouPrinter getInstance() {
		return printer;
	}
	
	public void initPrinter(Context context){
		Intent intent=new Intent();
		intent.setPackage("woyou.aidlservice.jiuiv5");
		intent.setAction("woyou.aidlservice.jiuiv5.IWoyouService");
		context.startService(intent);
		context.bindService(intent, connService, Context.BIND_AUTO_CREATE);		
	}
	
	public void print(String msg, ICallback callback){
		if(woyouService != null){
			try {
				woyouService.printText(msg, callback);
			} catch (RemoteException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
