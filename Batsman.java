package Techouts;

public class Batsman {
	String name;
	int  runsScored;
	int centuries;
	int halfCenturies;
	int ballsFaced;
	int fours;
	int sixes;
	void setData(String name,int  runsScored,int centuries,int halfCenturies,int ballsFaced,int fours,int sixes){
		this.name=name;
		this.runsScored=runsScored;
		this.centuries=centuries;
		this.halfCenturies=halfCenturies;
		this.ballsFaced=ballsFaced;
		this.fours=fours;
		this.sixes=sixes;
		
	}
	public float getStrikeRate(){
		return ((this.runsScored*100)/(this.ballsFaced));}
	public	int getRunsScoredInBoundaries(){
			return (4*this.fours + 6*this.sixes );
			 
		 }
}

