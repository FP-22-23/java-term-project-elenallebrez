package baseball;

import java.time.LocalDate;
import java.util.Objects;

import utils.Checkers;

public class Baseball{
	
	private Types type;
	private LocalDate date;
	private Double speed;
	private String player;
	private String event;
	private String description;
	private Integer zone;
	private Boolean p_throws;
	private String home_team;
	private String away_team;
	
	public Baseball(Types type,LocalDate date,Double speed,
			String player, String event,String description,
			Integer zone,Boolean p_throws,String home_team,String away_team ){
		this.type = type;
		this.date = date;
		this.speed = speed;
		this.player = player;
		this.event = event;
		this.description = description;
		this.zone = zone;
		this.p_throws = p_throws;
		this.home_team = home_team;
		this.away_team = away_team;
	}
	public Baseball(Types type,LocalDate date,Double speed,
			String player, String event,
			String home_team,String away_team ){
		this.type = type;
		this.date = date;
		this.speed = speed;
		this.player = player;
		this.event = event;
		this.home_team = home_team;
		this.away_team = away_team;	
	}
	
	public Baseball(String string, int i, double speed2, String player2, String event2, String description2, int zone2,
			String string2, String home_team2, String away_team2) {
		// TODO Auto-generated constructor stub
	}
	public Types getType() {
		return type;
	}

	public void setType(Types type) {
		this.type = type;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public Double getSpeed() {
		return speed;
	}

	public void setSpeed(Double speed) {
		Checkers.check("The speed is never zero or negative",speed>=0);
		this.speed = speed;
	}

	public String getPlayer() {
		return player;
	}

	public void setPlayer(String player) {
		this.player = player;
	}

	public String getEvent() {
		return event;
	}

	public void setEvent(String event) {
		this.event = event;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Integer getZone() {
		return zone;
	}

	public void setZone(Integer zone) {
		this.zone = zone;
	}

	public Boolean getP_throws() {
		return p_throws;
	}

	public void setP_throws(Boolean p_throws) {
		this.p_throws = p_throws;
	}

	public String getHome_team() {
		return home_team;
	}

	public void setHome_team(String home_team) {
		this.home_team = home_team;
	}

	public String getAway_team() {
		return away_team;
	}

	public void setAway_team(String away_team) {
		Checkers.check("The away team is never the same as the home team", 
				home_team.compareTo(away_team)<0);
		this.away_team = away_team;
	}
	@Override
	public String toString() {
		return "baseball [type=" + type + ", player:" + player + ", date:" + date + 
				"teams who are playing: " + home_team + away_team;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Baseball other = (Baseball) obj;
		return Objects.equals(date, other.date) && Objects.equals(player, other.player);
	}
	
	public int compareTo(Baseball m) {
		int res = 0;
		if (getDate() != null && m.getDate()!= null)
			res = getDate().compareTo(m.date);
		if (res == 0)
			res = getPlayer().compareTo(m.player);
		return res;	
	}

}
