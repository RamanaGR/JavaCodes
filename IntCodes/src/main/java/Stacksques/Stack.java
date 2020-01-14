package Stacksques;


	import java.util.Queue;
	import java.util.concurrent.LinkedBlockingDeque;
	public class Stack {
		
		Queue queue1;
		Queue queue2;
		
		public Stack() {
			
			queue1 = new LinkedBlockingDeque();
			queue2 = new LinkedBlockingDeque();
		}
		
		Queues queues = new Queues();
		
		public void push(Object e) {
			queues.enQueue(queue1, queue2, e);
		}
		
		public void pop() {
			queues.deQueue(queue1, queue2);
		}
	}

	class Queues {
		
		// adding elements to queue
		public void enQueue(Queue queue1, Queue queue2, Object e) {
			
			if(queue1.isEmpty()) {
				queue2.add(e);
				System.out.println("Pushed item ="+ e);
			}else {
				queue1.add(e);
				System.out.println("Pushed item ="+ e);
			}
		}
		
		// retrieving elements from queue
		public void deQueue(Queue queue1, Queue queue2) {
			Object e;
			if(queue1.isEmpty()) {
				if(queue2.isEmpty()) {
					System.out.println("Stack is empty");
					return;
				}else {
					while(queue2.size()!=1) {
						e = queue2.poll();
						queue1.add(e);
					}
					e = queue2.poll();
					System.out.println("Popped item ="+e);
				}
			}else {
				while(queue1.size()!=1) {
					e = queue1.poll();
					queue2.add(e);
				}
				e = queue1.poll();
				System.out.println("Popped item ="+e);
			}
			
		}
	
	}

