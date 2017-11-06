package entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Match {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int matchid;
	
	@Column
	private String record;
	
	@Column
	private boolean result;

	@ManyToOne
	@JoinColumn(name="fighterid", referencedColumnName="id")
	private Fighter fighter;
	
	@ManyToOne
	@JoinColumn(name="opponentid", referencedColumnName="id")
	private Fighter opponent;
	
	@Column
	private String event;
	@Column
	private String method;
	@Column
	private int round;
	@Column
	private int time;

	public Match(){}
	
	
	public int getMatchid() {
		return matchid;
	}

	public void setMatchid(int matchid) {
		this.matchid = matchid;
	}

	public boolean getResult() {
		return result;
	}

	public void setResult(boolean result) {
		this.result = result;
	}

	public Fighter getFighter() {
		return fighter;
	}

	public void setFighter(Fighter fighter) {
		this.fighter = fighter;
	}

	public String getEvent() {
		return event;
	}

	public void setEvent(String event) {
		this.event = event;
	}

	public String getMethod() {
		return method;
	}

	public void setMethod(String method) {
		this.method = method;
	}

	public int getRound() {
		return round;
	}

	public void setRound(int round) {
		this.round = round;
	}

	public int getTime() {
		return time;
	}


	public void setTime(int time) {
		this.time = time;
	}


	public Fighter getOpponent() {
		return opponent;
	}


	public void setOpponent(Fighter opponent) {
		this.opponent = opponent;
	}


	public String getRecord() {
		return record;
	}

	public void setRecord(String record) {
		this.record = record;
	}


}
