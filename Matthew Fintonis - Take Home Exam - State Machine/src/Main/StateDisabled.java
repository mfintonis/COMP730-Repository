package Main;

public class StateDisabled implements IState {
	private StateMachine _stateMachine;

	public StateDisabled(StateMachine stateMachine) {
		_stateMachine = stateMachine;
	}

	public void StateServiceDisabledByUser() {
		_stateMachine.SetState(_stateMachine.stateDisabled);		
	}


	public void StateServiceEnabled() {
		_stateMachine.SetState(_stateMachine.stateUnknown);
		
	}

	public void StateHealthCheckIsGood() {
		_stateMachine.SetState(_stateMachine.stateDisabled);	
		
	}

	public void ServiceHealthCheckTimesOut() {
		_stateMachine.SetState(_stateMachine.stateDisabled);	
		
	}

	public void HealthCheckIsBad() {
		_stateMachine.SetState(_stateMachine.stateDisabled);	
		
	}
	
	public void CurrentState() {
		System.out.println("Current State: Disabled\n");
	}
}
