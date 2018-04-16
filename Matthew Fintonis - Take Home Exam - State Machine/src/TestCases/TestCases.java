package TestCases;
import static org.junit.Assert.*;

import org.junit.Test;

import Main.StateMachine;

public class TestCases {

	@Test
	public void testReadyState() {
		
		StateMachine stateMach = new StateMachine();
		
		stateMach.StateHealthCheckIsGood();
		
		assertEquals(stateMach.stateReady, stateMach._state);
	}
	
	@Test
	public void testDownState() {
		
		StateMachine stateMach = new StateMachine();
		
		stateMach.StateHealthCheckIsGood();
		
		assertEquals(stateMach.stateReady, stateMach._state);
		
		stateMach.StateHealthCheckIsBad();
		
		assertEquals(stateMach.stateDown, stateMach._state);
		
	}

}
