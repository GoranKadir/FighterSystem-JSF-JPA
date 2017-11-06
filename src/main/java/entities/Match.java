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
	
	@ManyToOne
	@JoinColumn(name="fighterid", referencedColumnName="id")
	private Fighter winner;
	
	@ManyToOne
	@JoinColumn(name="opponentid", referencedColumnName="id")
	private Fighter loser;
	
	@Column
	private String event;
	@Column
	private String method;
	@Column
	private int round;
	@Column
	private int time;

	public Match(){}
	
	public void showName(){
		
		System.out.println(winner.getName() + loser.getName());
	}
	
	
	public int getMatchid() {
		return matchid;
	}

	public void setMatchid(int matchid) {
		this.matchid = matchid;
	}



	public Fighter getWinner() {
		return winner;
	}


	public void setWinner(Fighter winner) {
		this.winner = winner;
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


	public Fighter getLoser() {
		return loser;
	}


	public void setLoser(Fighter loser) {
		this.loser = loser;
	}


	public String getRecord() {
		return record;
	}

	public void setRecord(String record) {
		this.record = record;
	}


}
