package d;

import java.util.Scanner;


import com.naver.MovieTestDAO;

import kr.co.ca.Command;

public class DeleteCommand	implements Command {
	@Override
	public void execute(Scanner sc) {
		System.out.println("삭제할 아이디 입력");
		String id = sc.nextLine();
		
		MovieTestDAO dao = new MovieTestDAO();
		dao.delete(id);
		
	}
}
