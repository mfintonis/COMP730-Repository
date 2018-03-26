
public class StateOne implements IState {
	private StateMachine _stateMachine;

	public StateOne(StateMachine stateMachine) {
		_stateMachine = stateMachine;
	}

	public void StateA() {
		// This really doesn't do anything and this function could be left empty
		// This path tells the state to set it to itself
		_stateMachine.SetState(_stateMachine.stateOne);
	}

	public void StateB() {
		_stateMachine.SetState(_stateMachine.stateTwo);
	}

	public void StateC() {
		_stateMachine.SetState(_stateMachine.stateThree);
	}

	public void CurrentState() {
		System.out.println("Current State: State One");
	}
}
