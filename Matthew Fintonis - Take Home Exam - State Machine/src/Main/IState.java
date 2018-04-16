package Main;

public interface IState {
	
	public void StateServiceDisabledByUser();

	public void StateServiceEnabled();

	public void StateHealthCheckIsGood();
	
	public void ServiceHealthCheckTimesOut();
	
	public void HealthCheckIsBad();
	
	public void CurrentState();

}
