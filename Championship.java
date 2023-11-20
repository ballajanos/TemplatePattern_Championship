package Championship;

public class Championship {

	public static void main(String[] args) {

		ChampionshipTemplate footballChampionship= new FootballChampionship();
		System.out.println("Football Championship: ");
		footballChampionship.organizeChampionship();
		
		System.out.println("\n");

		ChampionshipTemplate basketballChampionship= new BasketballChampionship();
		System.out.println("Basketball Championship: ");
		basketballChampionship.organizeChampionship();
		
		System.out.println("\n");
		
		ChampionshipTemplate chessChampionship= new ChessChampionship();
		System.out.println("Chess Championship: ");
		chessChampionship.organizeChampionship();
	}

}
