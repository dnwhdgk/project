package com.bbs.vo;

public class Qna {

	private int qna_id;
	private String qna_tit;
	private String qna_con;
	private String qna_date;
	
	public Qna() {}

	public Qna(int qna_id, String qna_tit, String qna_con, String qna_date) {
		super();
		this.qna_id = qna_id;
		this.qna_tit = qna_tit;
		this.qna_con = qna_con;
		this.qna_date = qna_date;
	}

	public int getQna_id() {
		return qna_id;
	}

	public void setQna_id(int qna_id) {
		this.qna_id = qna_id;
	}

	public String getQna_tit() {
		return qna_tit;
	}

	public void setQna_tit(String qna_tit) {
		this.qna_tit = qna_tit;
	}

	public String getQna_con() {
		return qna_con;
	}

	public void setQna_con(String qna_con) {
		this.qna_con = qna_con;
	}

	public String getQna_date() {
		return qna_date;
	}

	public void setQna_date(String qna_date) {
		this.qna_date = qna_date;
	}
	
	
}
