package com.kh.step4;

public class CountingThread implements Runnable {
	int i;
	InputThreadTest2 process;
	
	CountingThread(InputThreadTest2 process){
		this.process = process;
	}
	
	@Override
	public void run() {
		for (i = 10; i > 0; i--) {
			if(process.inputCheck) break;
			try {
				System.out.println(i);
				Thread.sleep(1000);
			} catch (InterruptedException e) {}

			if(!process.inputCheck) {
				System.out.println("시간이 초과 되었습니다.");
				System.exit(0);
			}
				
			
		}

	}

}
