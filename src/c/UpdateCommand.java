package c;

import java.util.Scanner;

import com.naver.MovieTestDAO;
import com.naver.MovieTestDTO;

import kr.co.ca.Command;

public class UpdateCommand implements Command{
	@Override
	public void execute(Scanner sc) {
		System.out.println("아이디를 입력하세요");
		String id = sc.nextLine();
		
		System.out.println("이름을 입력하세요");
		String name = sc.nextLine();
		
		System.out.println("영화 제목을 입력하세요");
		String title = sc.nextLine();
		
		System.out.println("영화관을 입력하세요");
		String theater = sc.nextLine();
		
		System.out.println("날짜를 입력하세요");
		String day = sc.nextLine();
		
		System.out.println("사람수를 입력하세요");
		int howMany = sc.nextInt();
		sc.nextLine();
		
		System.out.println("가격을 입력하세요");
		int cost = sc.nextInt();
		sc.nextLine();
		
		System.out.println("좌석번호를 입력하세요");
		String seatNumber = sc.nextLine();
		
		MovieTestDAO dao = new MovieTestDAO();
		MovieTestDTO dto = new MovieTestDTO(id, name, title, theater, day, howMany, cost, seatNumber);
		dao.insert(dto);
		
		
	}
}
