package Main;

public class StateReady implements IState {
	private StateMachine _stateMachine;

	public StateReady(StateMachine stateMachine) {
		_stateMachine = stateMachine;
	}

	public void StateServiceDisabledByUser() {
		_stateMachine.SetState(_stateMachine.stateDisabled);		
	}


	public void StateServiceEnabled() {
		_stateMachine.SetState(_stateMachine.stateReady);
		
	}

	public void StateHealthCheckIsGood() {
		_stateMachine.SetState(_stateMachine.stateReady);	
		
	}

	public void ServiceHealthCheckTimesOut() {
		_stateMachine.SetState(_stateMachine.stateUnknown);	
		
	}

	public void HealthCheckIsBad() {
		_stateMachine.SetState(_stateMachine.stateDown);	
		
	}
	
	public void CurrentState() {
		System.out.println("Current State: Ready\n");
	}
}
