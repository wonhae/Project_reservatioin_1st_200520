package com.naver;

import java.util.Scanner;

import a.InsertCommand;
import b.selectCommand;
import c.UpdateCommand;
import d.DeleteCommand;
import kr.co.ca.Command;

public class Process {
	public Process() {
		Command[] commds = {new InsertCommand(),
							new selectCommand(),
							new UpdateCommand(),
							new DeleteCommand()};
		
		boolean isTrue = true;
		int menu = -1;
		
		Scanner sc = new Scanner(System.in);
		
		while (isTrue) {
			System.out.println("메뉴를 입력하세요");
			System.out.println("0 입력, 1 조회, 3 수정, 4 삭제");
			menu = sc.nextInt();
			sc.nextLine();
			
			if(menu < commds.length) {
				commds[menu].execute(sc);
			} else {
				isTrue = false;
			}
			
		} 
		
		
		sc.close();
	}
}
