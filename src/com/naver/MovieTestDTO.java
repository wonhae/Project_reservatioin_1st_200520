package com.naver;

import java.io.Serializable;

public class MovieTestDTO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String id;
	private String name;
	private String title;
	private String theater;
	private String day;
	private int howMany;
	private int cost;
	private String seatNumber;
	
	public MovieTestDTO() {
		// TODO Auto-generated constructor stub
	}

	
	
	
	public MovieTestDTO(String id, String name, String title, String theater, String day, int howMany, int cost,
			String seatNumber) {
		super();
		this.id = id;
		this.name = name;
		this.title = title;
		this.theater = theater;
		this.day = day;
		this.howMany = howMany;
		this.cost = cost;
		this.seatNumber = seatNumber;
	}
	
	public String getId() {
		return id;
	}




	public void setId(String id) {
		this.id = id;
	}




	public String getName() {
		return name;
	}




	public void setName(String name) {
		this.name = name;
	}




	public String getTitle() {
		return title;
	}




	public void setTitle(String title) {
		this.title = title;
	}




	public String getTheater() {
		return theater;
	}




	public void setTheater(String theater) {
		this.theater = theater;
	}




	public String getDay() {
		return day;
	}




	public void setDay(String day) {
		this.day = day;
	}




	public int getHowMany() {
		return howMany;
	}




	public void setHowMany(int howMany) {
		this.howMany = howMany;
	}




	public int getCost() {
		return cost;
	}




	public void setCost(int cost) {
		this.cost = cost;
	}




	public String getSeatNumber() {
		return seatNumber;
	}




	public void setSeatNumber(String seatNumber) {
		this.seatNumber = seatNumber;
	}




	public static long getSerialversionuid() {
		return serialVersionUID;
	}


	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}




	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MovieTestDTO other = (MovieTestDTO) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}




	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return "예약결과" + "영화제목 : " + title  + " / 영화관 : " + theater ;
	}
}
