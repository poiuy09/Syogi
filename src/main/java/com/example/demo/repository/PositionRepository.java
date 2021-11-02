package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Position;

public interface PositionRepository extends JpaRepository<Position, Integer> {
//	@Query(value="insert into position(board11,board12,board13,board14,board15,board16,board17,board18,board19,"
//	+ "board21,board22,board23,board24,board25,board26,board27,board28,board29,"
//	+ "board31,board32,board33,board34,board35,board36,board37,board38,board39,"
//	+ "board41,board42,board43,board44,board45,board46,board47,board48,board49,"
//	+ "board51,board52.board53,board54,board55,board56,board57,board58,board59,"
//	+ "board61,board62,board63,board64,board65,board66,board67,board68,board69,"
//	+ "board71,board72,board73,board74,board75,board76,board77,board78,board79,"
//	+ "board81,board82,board83,board84,board85,board86,board87,board88,board89,"
//	+ "board91,board92,board93,board94,board95,board96,board97,board98,board99)" さらに続く
//	+ "values (18,19,20,21,24,21,20,19,18,"
//	+ "0,23,0,0,0,0,0,22,0,"
//	+ "17,17,17,17,17,17,17,17,17,"
//	+ "0,0,0,0,0,0,0,0,0,"
//	+ "0,0,0,0,0,0,0,0,0,"
//	+ "0,0,0,0,0,0,0,0,0,"
//	+ "1,1,1,1,1,1,1,1,1,"
//	+ "0,6,0,0,0,0,0,7,0,"
//	+ "2,3,4,5,8,5,4,3,2)" , nativeQuery = true)
//public void save();
//
//@Query(value="select count(id) from game", nativeQuery = true)
//public long count();
//
//public Position findById(int gamesum);

public Position findById(int a);


}
