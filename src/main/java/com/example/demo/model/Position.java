package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Position {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column
	private int board11;
	private int board12;
	private int board13;
	private int board14;
	private int board15;
	private int board16;
	private int board17;
	private int board18;
	private int board19;
	private int board21;
	private int board22;
	private int board23;
	private int board24;
	private int board25;
	private int board26;
	private int board27;
	private int board28;
	private int board29;
	private int board31;
	private int board32;
	private int board33;
	private int board34;
	private int board35;
	private int board36;
	private int board37;
	private int board38;
	private int board39;
	private int board41;
	private int board42;
	private int board43;
	private int board44;
	private int board45;
	private int board46;
	private int board47;
	private int board48;
	private int board49;
	private int board51;
	private int board52;
	private int board53;
	private int board54;
	private int board55;
	private int board56;
	private int board57;
	private int board58;
	private int board59;
	private int board61;
	private int board62;
	private int board63;
	private int board64;
	private int board65;
	private int board66;
	private int board67;
	private int board68;
	private int board69;
	private int board71;
	private int board72;
	private int board73;
	private int board74;
	private int board75;
	private int board76;
	private int board77;
	private int board78;
	private int board79;
	private int board81;
	private int board82;
	private int board83;
	private int board84;
	private int board85;
	private int board86;
	private int board87;
	private int board88;
	private int board89;
	private int board91;
	private int board92;
	private int board93;
	private int board94;
	private int board95;
	private int board96;
	private int board97;
	private int board98;
	private int board99;

	private int capture00;
	private int capture01;
	private int capture02;
	private int capture03;
	private int capture04;
	private int capture05;
	private int capture06;
	private int capture07;
	private int capture10;
	private int capture11;
	private int capture12;
	private int capture13;
	private int capture14;
	private int capture15;
	private int capture16;
	private int capture17;

	private boolean fuflg01;
	private boolean fuflg02;
	private boolean fuflg03;
	private boolean fuflg04;
	private boolean fuflg05;
	private boolean fuflg06;
	private boolean fuflg07;
	private boolean fuflg08;
	private boolean fuflg09;
	private boolean fuflg11;
	private boolean fuflg12;
	private boolean fuflg13;
	private boolean fuflg14;
	private boolean fuflg15;
	private boolean fuflg16;
	private boolean fuflg17;
	private boolean fuflg18;
	private boolean fuflg19;

	private boolean teban;

	private int brank;
	private int bfile;
	private int wrank;
	private int wfile;
}
