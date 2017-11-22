package practice14.ptra14;

import practice14.common.DBCourse;
import practice14.common.JavaCourse;

public class Main {
	public static void main(String[] args) {

		//chk
		JavaCourse javaCourse = new JavaCourse();
		DBCourse dbCourse = new DBCourse();

		System.out.println(javaCourse.getCourseName());

		for(String courseUnit: javaCourse.getCourseUnit()) {
			System.out.println(courseUnit);
		}
		System.out.println("");

		System.out.println(dbCourse.getCourseName());

		for(String courseUnit: dbCourse.getCourseUnit()) {
			System.out.println(courseUnit);
		}

	}
}
