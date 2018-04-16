package Main;

public class StateMachine {

	public IState stateUnknown, stateReady, stateDown, stateDisabled;
	
	//This has to be public otherwise the test case throws an error about not being able to access this.
	public IState _state = null;

	public StateMachine() {

		stateUnknown = new StateUnknown(this);
		stateReady = new StateReady(this);
		stateDown = new StateDown(this);
		stateDisabled = new StateDisabled(this);

		_state = stateUnknown;
	}

	public void SetState(IState state) {
		_state = state;
	}

	public void EndApp() {
		//If this was a more proper program, I would take time to implement a more elegant quit/endapp function
		System.exit(0);
	}

	public void GetCurrentState() {
		_state.CurrentState();
	}
	
	
	public void StateServiceDisabledByUser(){
		_state.StateServiceDisabledByUser();
	}
	
	public void StateServiceEnabled(){
		_state.StateServiceEnabled();
	}

	public void StateHealthCheckIsGood() {
		_state.StateHealthCheckIsGood();
	}
	
	public void StateServiceHealthCheckTimesOut() {
		_state.ServiceHealthCheckTimesOut();
	}
	
	public void StateHealthCheckIsBad() {
		_state.HealthCheckIsBad();
	}
	
}
