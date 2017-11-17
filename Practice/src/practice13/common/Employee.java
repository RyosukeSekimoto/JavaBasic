package practice13.common;

/*
 * ★ common.Personクラスを継承して、common.Employeeクラスを作成してください
 *
 * フィールド
 * 		departmentNm（部署名）		:	String
 * 		departmentCnt（部署人数）	:	int
 * メソッド
 * 		各フィールドのアクセサ
 */

public class Employee extends Person{

	//フィールド
	String depertmentNm;
	int departmentCnt;

	//アクセサ

	//getter
	public String getDepertmentNm() {
		return this.depertmentNm;
	}

	public int getDepartmentCnt() {
		return this.departmentCnt;
	}

	//setter
	public void setDepertmentNm(String depertmentNm) {
		this.depertmentNm = depertmentNm;
	}

	public void setDepartmentCnt(int depertmentCnt) {
		this.departmentCnt = depertmentCnt;
	}

}
