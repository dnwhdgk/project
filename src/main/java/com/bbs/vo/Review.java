package com.bbs.vo;

public class Review {

    private int rev_id;
    private String rev_title;
    private String rev_contents;
    private String rev_date;
    private int accom_id;
    private int room_id;
    private int user_id;
    
    public Review() {}

	public Review(int rev_id, String rev_title, String rev_contents, String rev_date, int accom_id, int room_id,
			int user_id) {
		super();
		this.rev_id = rev_id;
		this.rev_title = rev_title;
		this.rev_contents = rev_contents;
		this.rev_date = rev_date;
		this.accom_id = accom_id;
		this.room_id = room_id;
		this.user_id = user_id;
	}

	public int getRev_id() {
		return rev_id;
	}

	public void setRev_id(int rev_id) {
		this.rev_id = rev_id;
	}

	public String getRev_title() {
		return rev_title;
	}

	public void setRev_title(String rev_title) {
		this.rev_title = rev_title;
	}

	public String getRev_contents() {
		return rev_contents;
	}

	public void setRev_contents(String rev_contents) {
		this.rev_contents = rev_contents;
	}

	public String getRev_date() {
		return rev_date;
	}

	public void setRev_date(String rev_date) {
		this.rev_date = rev_date;
	}

	public int getAccom_id() {
		return accom_id;
	}

	public void setAccom_id(int accom_id) {
		this.accom_id = accom_id;
	}

	public int getRoom_id() {
		return room_id;
	}

	public void setRoom_id(int room_id) {
		this.room_id = room_id;
	}

	public int getUser_id() {
		return user_id;
	}

	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
    
    
}
