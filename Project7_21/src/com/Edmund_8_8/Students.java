package com.Edmund_8_8;

public class Students implements Comparable<Students> {
	private String id;
	private String name;
	private double scoreChinese;
	private double scoreMath;
	private double scoreEnglish;
	private double scoreAVG;
	private double scoreTotal;
	private double sortNO;
	

	public Students(String id, String name, double scoreChinese,
			double scoreMath, double scoreEnglish) {
		super();
		this.id = id;
		this.name = name;
		this.scoreChinese = scoreChinese;
		this.scoreMath = scoreMath;
		this.scoreEnglish = scoreEnglish;
		this.scoreTotal=scoreChinese+scoreMath+scoreEnglish;
		this.scoreAVG=this.scoreTotal/3.0;
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


	public double getScoreChinese() {
		return scoreChinese;
	}


	public void setScoreChinese(double scoreChinese) {
		this.scoreChinese = scoreChinese;
	}


	public double getScoreMath() {
		return scoreMath;
	}


	public void setScoreMath(double scoreMath) {
		this.scoreMath = scoreMath;
	}


	public double getScoreEnglish() {
		return scoreEnglish;
	}


	public void setScoreEnglish(double scoreEnglish) {
		this.scoreEnglish = scoreEnglish;
	}


	public double getScoreAVG() {
		return scoreAVG;
	}


	public void setScoreAVG(double scoreAVG) {
		this.scoreAVG = scoreAVG;
	}


	public double getScoreTotal() {
		return scoreTotal;
	}


	public void setScoreTotal(double scoreTotal) {
		this.scoreTotal = scoreTotal;
	}


	@Override
	public int compareTo(Students o) {
		if(scoreTotal > o.getScoreTotal()){
			return -1;
		}else if(scoreTotal < o.getScoreTotal()){
			return 1;
		}else{
			return 0;
		}
		
	}

}
