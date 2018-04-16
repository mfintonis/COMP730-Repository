package Main;

public class StateDown implements IState {
	private StateMachine _stateMachine;

	public StateDown(StateMachine stateMachine) {
		_stateMachine = stateMachine;
	}

	public void StateServiceDisabledByUser() {
		_stateMachine.SetState(_stateMachine.stateDown);		
	}


	public void StateServiceEnabled() {
		_stateMachine.SetState(_stateMachine.stateDown);
		
	}

	public void StateHealthCheckIsGood() {
		_stateMachine.SetState(_stateMachine.stateReady);	
		
	}

	public void ServiceHealthCheckTimesOut() {
		_stateMachine.SetState(_stateMachine.stateDown);	
		
	}

	public void HealthCheckIsBad() {
		_stateMachine.SetState(_stateMachine.stateDown);	
		
	}
	
	public void CurrentState() {
		System.out.println("Current State: Down\n");
	}
}
