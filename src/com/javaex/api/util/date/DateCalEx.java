package com.javaex.api.util.date;


import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;  // --> Ctrl + Shift + O : import 단축키

// --> : 추가적인 나의 설명
public class DateCalEx {   // 실체 클래스

	public static void main(String[] args) {
//		dateEx();
     	calenderEx();
	}
	
	
	private static void calenderEx() {
		// 캘린더 불러오기
		Calendar now = Calendar.getInstance();
		Calendar custom = Calendar.getInstance();
		// 주의: 월정보는 0부터
		custom.set(1999, 11 , 31);  // 1999년 12월 31일
		
		System.out.println("현재:" + now);
		System.out.println("사용자 정의:" + custom);
		
		// 캘린더에서 현재 년도, 월, 일
		// 캘린더 상수 사용
		int year = now.get(Calendar.YEAR);
		int month = now.get(Calendar.MONTH) + 1;
		int date = now.get(Calendar.DATE);
		
		System.out.printf("오늘은 %d년 %d월 %d일 입니다.%n", year, month, date);
		
		
		// 100일 후로 이동
		Calendar future = Calendar.getInstance(); 
		// --> Calendear.getInstance(): 대신 인스턴스하여 future에 대입함 
		future.add(Calendar.DATE, 100);  
		System.out.printf("100일 후: %d년 %d월 %d일%n1", 
				future.get(Calendar.YEAR),
				future.get(Calendar.MONTH) + 1, // 주의
				future.get(Calendar.DATE));
		
		// 이 날은 무슨 요일?
		int dow = future.get(Calendar.DAY_OF_WEEK);  // 요일(일요일 1 ~  토요일 7)
		System.out.println(dow);
		String dowStr;
		
		switch(dow) {
		case Calendar.SUNDAY:
			dowStr = "일요일";
			break;
		case Calendar.MONDAY:
			dowStr = "월요일";
			break;
		case Calendar.TUESDAY:
			dowStr = "화요일";
			break;
		case Calendar.WEDNESDAY:
			dowStr = "수요일";
			break;
		case Calendar.THURSDAY:
			dowStr = "목요일";
			break;
		case Calendar.FRIDAY:
			dowStr = "금요일";
			break;
		case Calendar.SATURDAY:
			dowStr = "토요일";
			break;
		default:
			dowStr = "?";					
		}
		System.out.println("100일 후는 " + dowStr);
	}
	
	private static void dateEx() {
		// 날짜를 얻어옴
		Date now = new Date();  // 현재 날짜와 시간
		System.out.println("현재:" + now);
		
		// 포매터: 형식화 출력
		// 종류: FULL, LONG, MEDIUM, SHORT
		DateFormat df = DateFormat.getDateInstance(DateFormat.FULL);  // --> DateFormat으로 now을 출력
		System.out.println("Full:" + df.format(now));
		df = DateFormat.getDateInstance(DateFormat.LONG);
		System.out.println("LONG:" + df.format(now));
		
		DateFormat df2 = DateFormat.getDateInstance(DateFormat.MEDIUM);
		System.out.println("MEDIUM:" + df2.format(now));
		
		DateFormat df3 = DateFormat.getDateInstance(DateFormat.SHORT);
		System.out.println("SHORT:" + df3.format(now));	
		//TODO: DateFormat을 MEDIUM, SHORT로 바꿔서 출력 포맷을 확인해 봅시다. 
		
		// SimpleDateFormat
		// --> 2021-07-28 10:23:18을 출력해보자
		// --> 출력:yyyy-MM-dd HH:mm:ss
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"); 
		System.out.println("SDF:" + sdf.format(now));
		// TODO: Time Format을 바꿔가며 출력을 확인해 봅시다.
		
		// --> 21-7-28 xx:xx:xx
		// --> yy, M , a 형식 변경
		// 연도: 두글자, 월: 한글자, a:오전/오후로 출력되게 지정.
		SimpleDateFormat sdf2 = new SimpleDateFormat("yy-M-dd HH:mm:ss a");
		System.out.println("SDF2:" + sdf2.format(now));	
	}

}
