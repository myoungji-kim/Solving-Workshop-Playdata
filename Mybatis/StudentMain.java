import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import org.apache.ibatis.session.RowBounds;

import workshop.dto.Student;
import workshop.service.StudentService;
import workshop.service.StudentServiceImpl;

public class StudentMain {

	public static void main(String[] args) {
		while(true) {
			System.out.println("+--------------------------+");
			System.out.println("[학생 정보 관리 메뉴]");
			System.out.println("1. 전체 학생 목록");
			System.out.println("2. 학생 이름 검색");
			System.out.println("3. 학생 입학년도 범위 검색 (예> 2000부터 2003년까지)");
			System.out.println("4. 학생 학번으로 다중 검색 (쉼표 구분자)");
			System.out.println("5. 학생 휴학 일괄수정");
			System.out.println("6. 학과 정원 일괄수정");
			System.out.println("7. 학생 학점 검색");
			System.out.println("8. 전체 학생 목록 - 페이징");
			System.out.println("0. 종료");
			System.out.println("+--------------------------+");

			Scanner scan = new Scanner(System.in);
			System.out.println("메뉴 입력 ==>");
			int n = scan.nextInt();
			if (n == 1) {
				StudentService service = new StudentServiceImpl();
				List<Student> list = service.selectAll();
				System.out.println("=============================================");
				System.out.println("학번    이름      주민번호        주소            입학년도           휴학여부");
				int cnt = 0;
				for (Student student : list) {
					System.out.println(student);
				}
				
				System.out.println("총인원: "+list.size() + "명");
				
			} else if (n == 2) {
				System.out.println("검색할 학생 이름을 입력하세요");
				String stuName = scan.next();
				StudentService service = new StudentServiceImpl();
				List<Student> list = service.selectByStuName(stuName);
				for (Student student : list) {
					System.out.println(student);
				}
				System.out.println("총인원: "+list.size() + "명");
				
			} else if (n == 3) {
				System.out.println("시작 입학년도 입력 =>");
				String beginEnt = scan.next();
				System.out.println("끝 입학년도 입력 =>");
				String endEnt = scan.next();
				HashMap <String, String> entrances = new HashMap<String, String>(){{
					put("beginEnt", beginEnt);
					put("endEnt", endEnt);
				}};
				
				StudentService service = new StudentServiceImpl();
				List<Student> list = service.selectByEntrance(entrances);
				for (Student student : list) {
					System.out.println(student);
				}
				System.out.println("총인원: "+list.size() + "명");
				
			} else if (n == 4) {
				System.out.println("검색할 학생의 학번 => ");
				String studentsNo = scan.next();
				String[] temp = studentsNo.split(",");
				ArrayList<String> stuNo = new ArrayList<String>(Arrays.asList(temp));
				StudentService service = new StudentServiceImpl();
				List<Student> list = service.selectByStuNo(stuNo);
				
				for (Student student : list) {
					System.out.println(student);
				}
				System.out.println("총인원: "+list.size() + "명");
				// A674033,A656014
				
			} else if (n == 5) {
				System.out.println("수정할 학생의 학번을 입력하시오");
				String studentsNo = scan.next();
				String[] temp = studentsNo.split(",");
				ArrayList<String> stuNo = new ArrayList<String>(Arrays.asList(temp));
				StudentService service = new StudentServiceImpl();
				service.updateStuAbs(stuNo);
				
				System.out.println("총 변경된 학생 수 : "+stuNo.size()+"명");
				// 9556017,9732111,9747034
				
			} else if (n == 6) {
				StudentService service = new StudentServiceImpl();
				int num = service.capacityChange();
				System.out.println("총 변경된 학생 수 : "+num+"명");
				
			} else if (n == 7) {
				System.out.println("학생의 학번을 입력하시오 =>");
				String stuNo = scan.next();
				StudentService service = new StudentServiceImpl();
				List<HashMap<String, String>> list = service.gradeSearch(stuNo);
				
				System.out.println("=================================");
				System.out.println("학기       학번        이름       과목명                점수      학점");
				System.out.println("=================================");
				for (HashMap<String, String> s: list) {
					System.out.println(s.values());
				}
				// 9556017
			} else if (n == 8) {
				System.out.println("페이지당 보여줄 레코드 갯수를 입력하시오 =>");
				int contentNum = scan.nextInt();
				int pageNum = 1;
				String option = "";
				
				StudentService service = new StudentServiceImpl();
				int allContentNum = service.countAll();
				int allPage = (int) Math.ceil(allContentNum / contentNum);
				
				while (true) {
					List<Student> list = service.selectByPage(contentNum, pageNum);
					System.out.println("=================================");
					System.out.println("학기       학번        이름       과목명                점수      학점");
					System.out.println("=================================");
					for (Student student : list) {
						System.out.println(student);
					}
					System.out.println(pageNum+"/"+allPage);
					System.out.println("N: 다음페이지  B: 이전 페이지  Q: 메인 화면");
					
					option = scan.next();
					if (option.equals("N")) {
						if (pageNum != allPage) pageNum++;
					} else if (option.equals("B")) {
						if (pageNum != 1) pageNum--;
					} else if (option.equals("Q")) {
						break;
					} 
				}
				
				
			} else if (n == 0) {
				System.out.println("프로그램이 종료되었습니다");
				System.exit(0);
			}
		}
	} // end main
} // end class