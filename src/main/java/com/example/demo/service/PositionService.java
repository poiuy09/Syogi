package com.example.demo.service;

import javax.persistence.EntityManagerFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import com.example.demo.controller.Board;
import com.example.demo.model.Position;
import com.example.demo.repository.PositionRepository;

@Service
public class PositionService {
	@Autowired
	PositionRepository positionRepository;

	@Autowired
	private EntityManagerFactory factory;

	@Autowired
	private JdbcTemplate jdbcTemplate;

	public int booleantoint(boolean a) {
		if(a) {
			return 1;
		}else {
			return 0;
		}
	}

	public Position makegameboard(int a) {
//		positionRepository.save();
//
//		long positionsum = positionRepository.count();
		return positionRepository.findById(a);
	}

//	public void updateBoard(Board board) {
//
//		StringBuilder sql = new StringBuilder();
//		sql.append("update position set ");
//		sql.append("board");
//		sql.append(board.getFrom_rank());
//		sql.append(board.getFrom_file());
//		sql.append(" =?,");
//		sql.append("board");
//		sql.append(board.getTo_rank());
//		sql.append(board.getTo_file());
//		sql.append(" =? ");
//		sql.append("where id=?");
//
//
//        jdbcTemplate.update(sql.toString(), 0, board.getBoard(),1);
//        jdbcTemplate.update(sql.toString(), 0, board.getBoard(),2);
//
//        System.out.println(sql.toString());
//	}

	public void updateBoard1(Board board) {

		StringBuilder sql = new StringBuilder();
		sql.append("update position set ");
		sql.append("capture");
		sql.append(board.getCapturex());
		sql.append(board.getCapturey());
		sql.append(" =?,");
		sql.append("board");
		sql.append(board.getTo_rank());
		sql.append(board.getTo_file());
		sql.append(" =? ,");
		sql.append("fuflg");
		sql.append(board.getFuflgx());
		sql.append(board.getFuflgy());
		sql.append(" =? ,");
		sql.append("teban");
		sql.append(" =? ");
		sql.append("where id=?");


        //jdbcTemplate.update(sql.toString(), board.getCapture(), board.getBoard(),board.getFuflg(),board.getTurn(),1);
		jdbcTemplate.update(sql.toString(), board.getCapture(), board.getBoard(),booleantoint(Boolean.valueOf(board.getFuflg())),booleantoint(Boolean.valueOf(board.getTurn())),1);
        //jdbcTemplate.update(sql.toString(), board.getCapture(), board.getBoard(),board.getFuflg(),board.getTurn(),2);
		jdbcTemplate.update(sql.toString(), board.getCapture(), board.getBoard(),booleantoint(Boolean.valueOf(board.getFuflg())),booleantoint(Boolean.valueOf(board.getTurn())),2);

        System.out.println(sql.toString());
	}

	public void updateBoard2(Board board) {

		StringBuilder sql = new StringBuilder();
		sql.append("update position set ");
		sql.append("board");
		sql.append(board.getFrom_rank());
		sql.append(board.getFrom_file());
		sql.append(" =?,");
		sql.append("board");
		sql.append(board.getTo_rank());
		sql.append(board.getTo_file());
		sql.append(" =?,");
		sql.append("capture");
		sql.append(board.getCapturex());
		sql.append(board.getCapturey());
		sql.append(" =? ,");
		sql.append("fuflg1");
		sql.append(board.getTo_file());
		sql.append(" =? ,");
		sql.append("fuflg0");
		sql.append(board.getTo_file());
		sql.append(" =? ,");
		sql.append("brank");
		sql.append(" =? ,");
		sql.append("bfile");
		sql.append(" =? ,");
		sql.append("wrank");
		sql.append(" =? ,");
		sql.append("wfile");
		sql.append(" =?, ");
		sql.append("teban");
		sql.append(" =? ");
		sql.append("where id=?");


        //jdbcTemplate.update(sql.toString(), 0, board.getBoard(),board.getCapture(),board.getFuflg1movetofile(),board.getFuflg0movetofile(),board.getBlackkingposrank(),board.getBlackkingposfile(),board.getWhitekingposrank(),board.getWhitekingposfile(),board.getTurn(),1);
		jdbcTemplate.update(sql.toString(), 0, board.getBoard(),board.getCapture(),booleantoint(Boolean.valueOf(board.getFuflg1movetofile())),booleantoint(Boolean.valueOf(board.getFuflg0movetofile())),board.getBlackkingposrank(),board.getBlackkingposfile(),board.getWhitekingposrank(),board.getWhitekingposfile(),booleantoint(Boolean.valueOf(board.getTurn())),1);
        //jdbcTemplate.update(sql.toString(), 0, board.getBoard(),board.getCapture(),board.getFuflg1movetofile(),board.getFuflg0movetofile(),board.getBlackkingposrank(),board.getBlackkingposfile(),board.getWhitekingposrank(),board.getWhitekingposfile(),board.getTurn(),2);
		jdbcTemplate.update(sql.toString(), 0, board.getBoard(),board.getCapture(),booleantoint(Boolean.valueOf(board.getFuflg1movetofile())),booleantoint(Boolean.valueOf(board.getFuflg0movetofile())),board.getBlackkingposrank(),board.getBlackkingposfile(),board.getWhitekingposrank(),board.getWhitekingposfile(),booleantoint(Boolean.valueOf(board.getTurn())),2);

        System.out.println(sql.toString());
	}

	public void updateBoard3(Board board) {

		StringBuilder sql = new StringBuilder();
		sql.append("update position set ");
//		sql.append("board");
//		sql.append(board.getFrom_rank());
//		sql.append(board.getFrom_file());
//		sql.append(" =?,");
		sql.append("board");
		sql.append(board.getTo_rank());
		sql.append(board.getTo_file());
		sql.append(" =?, ");
		sql.append("capture");
		sql.append(board.getCapturex());
		sql.append(board.getCapturey());
		sql.append(" =?, ");
		sql.append("fuflg");
		sql.append(board.getFuflgx());
		sql.append(board.getFuflgy());
		sql.append(" =?, ");
		sql.append("teban");
		sql.append(" =? ");
		sql.append("where id=?");


		//jdbcTemplate.update(sql.toString(), board.getBoardfrom(), board.getBoard(),board.getCapture(),board.getFuflg(),board.getTurn(),1);
//		jdbcTemplate.update(sql.toString(), board.getBoardfrom(), board.getBoard(),board.getCapture(),booleantoint(Boolean.valueOf(board.getFuflg())),booleantoint(Boolean.valueOf(board.getTurn())),1);
		jdbcTemplate.update(sql.toString(), board.getBoard(),board.getCapture(),booleantoint(Boolean.valueOf(board.getFuflg())),booleantoint(Boolean.valueOf(board.getTurn())),1);
		//jdbcTemplate.update(sql.toString(), board.getBoardfrom(), board.getBoard(),board.getCapture(),board.getFuflg(),board.getTurn(),2);
//		jdbcTemplate.update(sql.toString(), board.getBoardfrom(), board.getBoard(),board.getCapture(),booleantoint(Boolean.valueOf(board.getFuflg())),booleantoint(Boolean.valueOf(board.getTurn())),2);
		jdbcTemplate.update(sql.toString(), board.getBoard(),board.getCapture(),booleantoint(Boolean.valueOf(board.getFuflg())),booleantoint(Boolean.valueOf(board.getTurn())),2);

        System.out.println(sql.toString());
	}

	public void updateBoard4(Board board) {

		StringBuilder sql = new StringBuilder();
		sql.append("update position set ");
		sql.append("board");
		sql.append(board.getFrom_rank());
		sql.append(board.getFrom_file());
		sql.append(" =?,");
		sql.append("board");
		sql.append(board.getTo_rank());
		sql.append(board.getTo_file());
		sql.append(" =?, ");
		sql.append("capture");
		sql.append(board.getCapturex());
		sql.append(board.getCapturey());
		sql.append(" =?, ");
//		sql.append("fuflg1");
//		sql.append(board.getTo_file());
//		sql.append(" =?, ");
//		sql.append("fuflg0");
//		sql.append(board.getTo_file());
//		sql.append(" =?, ");
		sql.append("brank");
		sql.append(" =?, ");
		sql.append("bfile");
		sql.append(" =?, ");
		sql.append("wrank");
		sql.append(" =?, ");
		sql.append("wfile");
		sql.append(" =?, ");
		sql.append("teban");
		sql.append(" =?, ");
		sql.append("fuflg01");
		sql.append(" =?,");
		sql.append("fuflg02");
		sql.append(" =?,");
		sql.append("fuflg03");
		sql.append(" =?,");
		sql.append("fuflg04");
		sql.append(" =?,");
		sql.append("fuflg05");
		sql.append(" =?,");
		sql.append("fuflg06");
		sql.append(" =?,");
		sql.append("fuflg07");
		sql.append(" =?,");
		sql.append("fuflg08");
		sql.append(" =?,");
		sql.append("fuflg09");
		sql.append(" =?,");
		sql.append("fuflg11");
		sql.append(" =?,");
		sql.append("fuflg12");
		sql.append(" =?,");
		sql.append("fuflg13");
		sql.append(" =?,");
		sql.append("fuflg14");
		sql.append(" =?,");
		sql.append("fuflg15");
		sql.append(" =?,");
		sql.append("fuflg16");
		sql.append(" =?,");
		sql.append("fuflg17");
		sql.append(" =?,");
		sql.append("fuflg18");
		sql.append(" =?,");
		sql.append("fuflg19");
		sql.append(" =? ");
		sql.append("where id=?");

		//booleantoint(Boolean.valueOf(board.getFuflg1movetofile()))
        //jdbcTemplate.update(sql.toString(), board.getBoardfrom(), board.getBoard(),board.getCapture(),board.getFuflg1movetofile(),board.getFuflg0movetofile(),board.getBlackkingposrank(),board.getBlackkingposfile(),board.getWhitekingposrank(),board.getWhitekingposfile(),board.getTurn(),1);
        jdbcTemplate.update(sql.toString(), board.getBoardfrom(), board.getBoard(),board.getCapture(),board.getBlackkingposrank(),board.getBlackkingposfile(),board.getWhitekingposrank(),board.getWhitekingposfile(),booleantoint(Boolean.valueOf(board.getTurn())),
        		booleantoint(Boolean.valueOf(board.getFuflg01())),booleantoint(Boolean.valueOf(board.getFuflg02())),booleantoint(Boolean.valueOf(board.getFuflg03())),booleantoint(Boolean.valueOf(board.getFuflg04())),booleantoint(Boolean.valueOf(board.getFuflg05())),booleantoint(Boolean.valueOf(board.getFuflg06())),booleantoint(Boolean.valueOf(board.getFuflg07())),booleantoint(Boolean.valueOf(board.getFuflg08())),booleantoint(Boolean.valueOf(board.getFuflg09())),
        		booleantoint(Boolean.valueOf(board.getFuflg11())),booleantoint(Boolean.valueOf(board.getFuflg12())),booleantoint(Boolean.valueOf(board.getFuflg13())),booleantoint(Boolean.valueOf(board.getFuflg14())),booleantoint(Boolean.valueOf(board.getFuflg15())),booleantoint(Boolean.valueOf(board.getFuflg16())),booleantoint(Boolean.valueOf(board.getFuflg17())),booleantoint(Boolean.valueOf(board.getFuflg18())),booleantoint(Boolean.valueOf(board.getFuflg19())),
        		1);
        //jdbcTemplate.update(sql.toString(), board.getBoardfrom(), board.getBoard(),board.getCapture(),board.getFuflg1movetofile(),board.getFuflg0movetofile(),board.getBlackkingposrank(),board.getBlackkingposfile(),board.getWhitekingposrank(),board.getWhitekingposfile(),board.getTurn(),2);
        jdbcTemplate.update(sql.toString(), board.getBoardfrom(), board.getBoard(),board.getCapture(),board.getBlackkingposrank(),board.getBlackkingposfile(),board.getWhitekingposrank(),board.getWhitekingposfile(),booleantoint(Boolean.valueOf(board.getTurn())),
        		booleantoint(Boolean.valueOf(board.getFuflg01())),booleantoint(Boolean.valueOf(board.getFuflg02())),booleantoint(Boolean.valueOf(board.getFuflg03())),booleantoint(Boolean.valueOf(board.getFuflg04())),booleantoint(Boolean.valueOf(board.getFuflg05())),booleantoint(Boolean.valueOf(board.getFuflg06())),booleantoint(Boolean.valueOf(board.getFuflg07())),booleantoint(Boolean.valueOf(board.getFuflg08())),booleantoint(Boolean.valueOf(board.getFuflg09())),
        		booleantoint(Boolean.valueOf(board.getFuflg11())),booleantoint(Boolean.valueOf(board.getFuflg12())),booleantoint(Boolean.valueOf(board.getFuflg13())),booleantoint(Boolean.valueOf(board.getFuflg14())),booleantoint(Boolean.valueOf(board.getFuflg15())),booleantoint(Boolean.valueOf(board.getFuflg16())),booleantoint(Boolean.valueOf(board.getFuflg17())),booleantoint(Boolean.valueOf(board.getFuflg18())),booleantoint(Boolean.valueOf(board.getFuflg19())),
        		2);

        System.out.println(sql.toString());
	}
}

