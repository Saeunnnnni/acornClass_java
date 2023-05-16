package test.main;

import java.util.List;

import test.dao.DeptDao;

import test.dto.DeptDto;




public class MainClass18 {

	public static void main(String[] args) {
		//모든 회원의 정보를 불러오보고 싶다면 ?
		List<DeptDto> list = new DeptDao().getList();
		//얻어와서 뭘하지 ? 콘솔창에 출력
		for(DeptDto tmp:list) {
			System.out.println(tmp.getDeptno() + "|" +tmp.getDname()+ "|" + tmp.getLoc());
		}
	}

}
