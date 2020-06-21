package com.MultiThreadingPractice.program;

// wait should be called inside the synchronized block or method after locking the objcet
public class WaitMethodCallOuthsideSyncBlock extends Thread{

	static WaitMethodCallOuthsideSyncBlock instance;
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		
		try {
			instance.wait();
			synchronized (instance) {
				
			}
		}
		catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		instance =new WaitMethodCallOuthsideSyncBlock();
		instance.start();
		
	}

}
