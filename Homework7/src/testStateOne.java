

import static org.junit.Assert.*;

import org.junit.Test;

public class testStateOne {

	@Test
	public void test() {
		StateMachine stateMach = new StateMachine();
		StateOne stateOne = new StateOne(stateMach);
		
		stateMach.StateA();
		
		assertEquals(stateMach.stateOne, stateMach._state);
	}

}
