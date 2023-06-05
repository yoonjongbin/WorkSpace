package com.kh.list;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.Vector;

public class B_Other {

	public static void main(String[] args) {
		B_Other b = new B_Other();
//		b.method1();
//		b.method2();
		b.method3();
	}
	
	
	// Vector 기본적으로 지정된 값의 2배로 크기가 지정된다.
	// - 동기화된(synchronized) 메서드로 구성
	public void method1() {
		Vector v = new Vector();
		
		v.add(0);
		v.add(1);
		
		v.trimToSize(); // 사이즈가 맞춰짐
		
		v.add(3);
		v.add(4);
		v.ensureCapacity(5); // 수용량 지정
		
		v.setSize(10);
		
		v.clear();
		
		System.out.println(v);
		System.out.println("size는 : " + v.size());
		System.out.println("capacity는 : " + v.capacity()); // 공간 출력
	}
	
	
	//스택(Stack)
	// - 마지막에 저장한 것을 제일 먼저 꺼내는 LIFO(Last In First Out) 구조
	
	public void method2() {
		
		Stack s = new Stack();
		s.push(0);
		s.push(1);
		s.push(2);
		s.push(3);
		s.pop(); 	// 3 빠져나감
		s.push(4);
		s.pop(); 	// 4 빠져나감
		s.push(5);
		s.push(6);
		s.push(7);
		s.pop();	// 7 빠져나감
		
		System.out.println(s); // [0, 1, 2, 5, 6]
		
	}

	// 큐(Queue) : 처음에 저장한 것을 제일 먼저 꺼내는 FIFO(First In First Out) 구조 
	public void method3() {
		Queue q = new LinkedList();
		
		q.offer(0);
		q.offer(1);
		q.offer(2);
		q.offer(3);
		q.poll(); // 0이 빠져나감
		q.add(4);
		q.remove(); // 1이 빠져나감
		q.add(5);
		q.add(6);
		q.add(7);
		q.remove(); // 2가 빠져나감
		
		System.out.println(q);
	}
}
