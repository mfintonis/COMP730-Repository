
public class StateThree implements IState {
	private StateMachine _stateMachine;

	public StateThree(StateMachine stateMachine) {
		_stateMachine = stateMachine;
	}

	public void StateA() {
		// This really doesn't do anything and this function could be left empty
		// This path tells the state to set it to itself
		_stateMachine.SetState(_stateMachine.stateThree);
	}

	public void StateB() {
		_stateMachine.SetState(_stateMachine.stateOne);
	}

	public void StateC() {
		System.out.println("Reached end of prgram. Quitting.");
		_stateMachine.EndApp();
	}

	public void CurrentState() {
		System.out.println("Current State: State Three");
	}
}
