package com.kh.loop;

import java.util.Scanner;

class LoopPractice {
	 
	Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		LoopPractice p = new LoopPractice();
		//p.method1();
		//p.method2();
		//p.method3();
		//p.method4();
		//p.method5();
		p.method6();
		
	}
	
	
    /*
        사용자로부터 숫자(1~100) 1개가 입력되었을 때 카운트다운 출력하시오.
        사용자 입력 : 5
        5
        4
        3
        2
        1
     */
    public void method1() {
    	
    	int num = 0;
    	
    	System.out.println("사용자 입력 : ");
    	num = sc.nextInt();
    	
    	for(int i = 0; num > i; num--) {
    		System.out.println(num);
    	}
    }

    // 1+(-2)+3+(-4)+...과 같은 식으로 계속 더해나갔을 때, 몇까지 더해야 총합이 100 이상 되는지 출력하시오.
    public void method2() {
    	int num = 1;
    	//int minus = 0;
    	int sum  = 0;
    	
    	while(true) {
    		
    		if(num % 2 == 0) {
    			//minus = -count;
    			sum -= num;
    			
    		} else sum += num;
    		if(sum >= 100) break;
    		
    		num++;
    	}
    	System.out.println(num + "회 더해야 100이상이 됩니다.");
    	
    	
    	
    }

    /*
        사용자로부터 문자열을 입력 받고 문자열에서 검색될 문자를 입력 받아 해당 문자열에 그 문자가 몇 개 있는지 개수를 출력하세요. 
​
        문자열 : banana
        문자 : a
        banana 안에 포함된 a 개수 : 3
​
    */
    public void method3() {
    	
    	String str = "";
    	char index;
    	int ch_Same = 0;
    	
    	System.out.print("문자열 : ");
    	str = sc.nextLine();
    	
    	System.out.print("문자 : ");
    	String index_Input = sc.nextLine();
    	index = index_Input.charAt(0);
    	
    	for(int i = 0; i < str.length(); i++) {
    		if(str.charAt(i) == index) {
    			ch_Same++;
    		}else continue;
    	}
    	
    	System.out.printf("%s 안에 포함된 %c 개수 : %d개", str, index, ch_Same);
    	
    }

    /*
        0이 나올 때까지 숫자를 출력하시오. (random 사용!)
        7
        3
        4
        2
        3
        4
        0
     */
    public void method4() {
    	
    	while(true) {
    		int random = (int)(Math.random() * 10);
    		System.out.println(random);
    		if(random == 0) break;
    		else continue;
    		
    	}
    }

    /*
     * 
        주사위를 10번 굴렸을 때 각 눈의 수가 몇 번 나왔는지 출력하세요. (random 사용!)
​
        1 : 3
        2 : 2
        3 : 1
        4 : 0
        5 : 4
        6 : 0
​
     */
    public void method5() {
    	int random = 0;
    	int d1 = 0, d2 = 0, d3 = 0, d4 = 0, d5 = 0, d6 = 0;
    	
    	for(int i = 0; i < 10; i++) {
    		
    		random = (int)(Math.random() * 6) + 1;
    		
    		switch(random) {
    			case 1: 
    				d1++;
    				break;
    			case 2: 
    				d2++;
    				break;
    			case 3: 
    				d3++;
    				break;
    			case 4: 
    				d4++;
    				break;
    			case 5: 
    				d5++;
    				break;
    			case 6: 
    				d6++;
    				break;
    				
    		}
    	
    	}
    	System.out.printf("1 : %d\n" + "2 : %d\n" + "3 : %d\n" + "4 : %d\n" + "5 : %d\n" + "6 : %d", 
    						d1, d2, d3, d4, d5, d6);
    }

    /*
        사용자의 이름을 입력하고 컴퓨터와 가위바위보를 하세요. 
        컴퓨터가 가위인지 보인지 주먹인지는 랜덤한 수를 통해서 결정하도록 하고, 사용자에게는 직접 가위바위보를 받으세요.
        사용자가 이겼을 때 반복을 멈추고 몇 번 이기고 몇 번 비기고 몇 번 졌는지 출력하세요.
​
​
        당신의 이름을 입력해주세요 : 
        가위바위보 : 가위
        컴퓨터 : 가위
        박신우 : 가위
        비겼습니다.
​
        가위바위보 : 가위 
        컴퓨터 : 바위
        박신우 : 가위
        졌습니다 ㅠㅠ
​
        가위바위보 : 보
        컴퓨터 : 바위
        박신우 : 보
        이겼습니다 !
    */
    public void method6() {
    	
    	boolean win = false;
    	
    	
    	String name = "";
    	String player = "";
    	String com = "";
    	
    	int count;
    	
    	int win_C = 0;
    	int lose_C = 0;
    	int draw_C = 0;
    	
    	
    	System.out.print("당신의 이름을 입력해주세요 : ");
    	name = sc.nextLine();
    	
    	for(count = 1; win == false; count++) {
    		
    		int random = (int)(Math.random() * 3) + 1;
    		
    		
    		System.out.print("가위바위보 : ");
    		player = sc.nextLine();
    		
    		
    		
    		
    		
    		switch(random) {
    			case 1 :
    				com = "가위";
    				break;
    			case 2 :
    				com = "바위";
    				break;
    			case 3 :
    				com = "보";
    				break;
    		}
    		
    		System.out.printf("%s : %s\n" + "컴퓨터 : %s\n", name, player, com);
    		
    		if(player.equals("가위") || player.equals("바위") || player.equals("보")) {
    			
    			if(player.equals(com)) {
    				System.out.println("비겼습니다.\n");
    				draw_C++;
    			}
    			else if(player.equals("가위") && com.equals("보")) {
    				System.out.println("이겼습니다!!\n");
    				win_C++;
    				
    				break;
    				
    			} else if(player.equals("바위") && com.equals("가위")) {
    				System.out.println("이겼습니다!!\n");
    				win_C++;
    				
    				break;
    				
    			} else if(player.equals("보") && com.equals("바위")) {
    				System.out.println("이겼습니다!!\n");
    				win_C++;
    				
    				break;
    				
    			} else if(player.equals("가위") && com.equals("바위")) {
    				System.out.println("졌습니다 ㅠㅠ\n");
    				lose_C++;
    				
    			} else if(player.equals("바위") && com.equals("보")) {
    				System.out.println("졌습니다 ㅠㅠ\n");
    				lose_C++;
    				
    			} else if(player.equals("보") && com.equals("가위")) {
    				System.out.println("졌습니다 ㅠㅠ\n");
    				lose_C++;
    				
    			}

    		} else {
    			
    			System.out.println("가위, 바위, 보 중 하나만 내주세요.\n");
    			count--;
    			
    		}
    		
    	}
    	System.out.printf("시도한 횟수는 %d번이고, 승리한 횟수 %d번, 패배한 횟수 %d번, 무승부한 횟수 %d번입니다.", count, win_C, lose_C, draw_C);
    	
    }

}