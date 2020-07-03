package b;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.naver.MovieTestDAO;
import com.naver.MovieTestDTO;

import kr.co.ca.Command;

public class selectCommand implements Command{
	@Override
	public void execute(Scanner sc) {
		MovieTestDAO dao = new MovieTestDAO();
		List<MovieTestDTO> dto = new ArrayList<MovieTestDTO>();
		
		for(int i = 0; i < dto.size(); i ++) {
			System.out.println(dto.get(i));
		}
		
		
		
	}
}
