package com.xworkz.cricket.odi;

public class Odi {
	String team;
	byte matches;
	byte rating;
	byte overs;
	byte rank;
	short points;
	int won;
	int lost;
	int yearOfFistOdi;
	
	public Odi(String team) {
		this.team = team;
	}

	public Odi(String team, byte matches) {
		this(team);
		this.matches = matches;
	}

	public Odi(String team, byte matches, byte rating, byte overs) {
		this(team,matches);
		this.rating = rating;
		this.overs = overs;
	}

	public Odi(String team, byte matches, byte rating, byte overs, short points) {
		this(team,matches,rating,overs);
		this.points = points;
	}

	public Odi(String team, byte matches, byte rating, byte overs, short points, int won, int lost) {
		this(team,matches,rating,overs,points);
		this.won = won;
		this.lost = lost;
	}

	public Odi(byte rank,String team, byte matches, byte rating, byte overs, short points, int won, int lost, int yearOfFistOdi) {
		this(team,matches,rating,overs,points,won,lost);
		this.yearOfFistOdi = yearOfFistOdi;
		this.rank = rank;
	}
	
	public String printAll() {
		String result = "team :" + team + "\n" + "matches :" + matches + "\n" + "rating :" + rating + "\n" + "overs :" + overs + "\n" + "points :" + points + "\n" + "won :" + won + "\n" + "lost :" + lost + "\n" + "yearOfFistOdi :" + yearOfFistOdi + "\n" + "rank :" + rank;
		System.out.println("\n");
		return result;	
	}
		
	}

