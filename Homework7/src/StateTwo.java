
public class StateTwo implements IState {
	private StateMachine _stateMachine;

	public StateTwo(StateMachine stateMachine) {
		_stateMachine = stateMachine;
	}

	public void StateA() {
		_stateMachine.SetState(_stateMachine.stateOne);
	}

	public void StateB() {
		_stateMachine.SetState(_stateMachine.stateFour);
	}

	public void StateC() {
		_stateMachine.SetState(_stateMachine.stateThree);
	}

	public void CurrentState() {
		System.out.println("Current State: State Two");
	}
}
