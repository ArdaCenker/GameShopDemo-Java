package Entities;

import java.time.LocalDate;

import Abstract.Entity;

public class Order implements Entity {
	private int id;
	private int userId;
	private int gameId;
	private int campaignId;
	private LocalDate date;
	
	public Order() {
		
	}

	public Order(int id, int userId, int gameId, LocalDate date) {
		super();
		this.id = id;
		this.userId = userId;
		this.gameId = gameId;
		this.date = date;
	}

	public Order(int id, int userId, int gameId, int campaignId, LocalDate date) {
		super();
		this.id = id;
		this.userId = userId;
		this.gameId = gameId;
		this.campaignId = campaignId;
		this.date = date;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public int getGameId() {
		return gameId;
	}

	public void setGameId(int gameId) {
		this.gameId = gameId;
	}

	public int getCampaignId() {
		return campaignId;
	}

	public void setCampaignId(int campaignId) {
		this.campaignId = campaignId;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}
}
