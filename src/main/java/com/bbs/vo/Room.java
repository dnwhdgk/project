package com.bbs.vo;

public class Room {
	private int room_id;
	private int room_num;
	private String room_name;
	private String room_img;
	private String room_text;
	
	public Room() {}

	public Room(int room_id, int room_num, String room_name, String room_img, String room_text) {
		super();
		this.room_id = room_id;
		this.room_num = room_num;
		this.room_name = room_name;
		this.room_img = room_img;
		this.room_text = room_text;
	}

	public int getRoom_id() {
		return room_id;
	}

	public void setRoom_id(int room_id) {
		this.room_id = room_id;
	}

	public int getRoom_num() {
		return room_num;
	}

	public void setRoom_num(int room_num) {
		this.room_num = room_num;
	}

	public String getRoom_name() {
		return room_name;
	}

	public void setRoom_name(String room_name) {
		this.room_name = room_name;
	}

	public String getRoom_img() {
		return room_img;
	}

	public void setRoom_img(String room_img) {
		this.room_img = room_img;
	}

	public String getRoom_text() {
		return room_text;
	}

	public void setRoom_text(String room_text) {
		this.room_text = room_text;
	}
	
	
}
