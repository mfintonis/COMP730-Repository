
public class StateFour implements IState {
	private StateMachine _stateMachine;

	public StateFour(StateMachine stateMachine) {
		_stateMachine = stateMachine;
	}


	public void StateA() {
		_stateMachine.SetState(_stateMachine.stateOne);
	}

	public void StateB() {
		_stateMachine.SetState(_stateMachine.stateTwo);
	}

	public void StateC() {
		_stateMachine.SetState(_stateMachine.stateThree);
	}

	public void CurrentState() {
		System.out.println("Current State: State Four");
	}
}
