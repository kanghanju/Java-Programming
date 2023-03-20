package lesson8;

import java.util.Scanner;

public class Scheduler {
	
	public Event [] events = new Event[100];

	public void processCommand() {

		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.print("$ ");
			String command = sc.next();
			if(command.equals("addevent")) {

			}
			else if(command.equals("list")) {

			}
			else if(command.equals("show")) {

			}
			else if(command.equals("exit")) {
				break;
			}
		}
		sc.close();
	}

	public static void main(String[] args) {
		Scheduler app = new Scheduler();
		app.processCommand();
	}

}
