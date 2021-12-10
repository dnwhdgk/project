package com.bbs.vo;

public class Reply {

	private int re_id;
	private String re_con;
	private String re_date;
	private int qna_id;
	
	public Reply() {}

	public Reply(int re_id, String re_con, String re_date, int qna_id) {
		super();
		this.re_id = re_id;
		this.re_con = re_con;
		this.re_date = re_date;
		this.qna_id = qna_id;
	}

	public int getRe_id() {
		return re_id;
	}

	public void setRe_id(int re_id) {
		this.re_id = re_id;
	}

	public String getRe_con() {
		return re_con;
	}

	public void setRe_con(String re_con) {
		this.re_con = re_con;
	}

	public String getRe_date() {
		return re_date;
	}

	public void setRe_date(String re_date) {
		this.re_date = re_date;
	}

	public int getQna_id() {
		return qna_id;
	}

	public void setQna_id(int qna_id) {
		this.qna_id = qna_id;
	}
	
	
}
