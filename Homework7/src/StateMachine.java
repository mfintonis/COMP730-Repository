
public class StateMachine {

	public IState stateOne, stateTwo, stateThree, stateFour;
	IState _state = null;

	public StateMachine() {

		stateOne = new StateOne(this);
		stateTwo = new StateTwo(this);
		stateThree = new StateThree(this);
		stateFour = new StateFour(this);

		_state = stateOne;
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

	public void TakePath(StatePaths action) {
		
		switch(action) {
		case a:
			StateA();
		case b:
			StateB();
		case c:
			StateC();
		}
	}

	private void StateA() {
		_state.StateA();
	}

	private void StateB() {
		_state.StateB();
	}

	private void StateC() {
		_state.StateC();
	}
}
