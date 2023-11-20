package Championship;

public abstract class ChampionshipTemplate {

	public void organizeChampionship() {
		openingCeremony();
		playMatches();
		awardCeremony();
	}

	protected void openingCeremony() {
		System.out.println("Opening Ceremony");
	}
	
	protected abstract void playMatches();

	protected void awardCeremony() {
		System.out.println("Award Ceremony");
	}

}
