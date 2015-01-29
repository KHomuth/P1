public abstract class RoundBasedGame 
{
	public abstract void instructPlayer();
	public abstract boolean isFinished();
	public abstract void startNextRound();
	public abstract void showResults();
	
	public void play()
	{
		instructPlayer();
		while(!isFinished())
		{
			startNextRound();
		}
		showResults();
	}
}
