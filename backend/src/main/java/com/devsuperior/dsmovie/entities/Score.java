package com.devsuperior.dsmovie.entities;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "tb_score")
public class Score {	
	
	@EmbeddedId //id composto
	
	private ScorePK id = new ScorePK(); //duas referências para o Movie e User
	
	private Double value;
	
	public Score() {
		
	}
	
	public void setMovie(Movie movie) { //serve para informar o filme aqui e associar este filme com o Score
		id.setMovie(movie);
	}
	
	public void setUser(User user) {
		id.setUser(user);
	}
	
	public ScorePK getId() {
		return id;
	}

	public void setId(ScorePK id) {
		this.id = id;
	}

	public Double getValue() {
		return value;
	}

	public void setValue(Double value) {
		this.value = value;
	}
}
