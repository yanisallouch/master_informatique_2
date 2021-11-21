package com.yanisallouch.tp2;

import java.util.List;

import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Operation;
import org.eclipse.uml2.uml.State;
import org.eclipse.uml2.uml.StateMachine;

public class TransformationState {

	/*
	 * Question 5.
	 *
	 * @param aStateMachine a StateMachine.
	 *
	 * @return L'application du pattern State a la machine a etat.
	 */
	public void applyStatePatternFromWellFormedStateMachine(final StateMachine aStateMachine) {
		// TODO
	}

	/*
	 * Question 6.
	 *
	 * @param fileToUml Le nom d'un fichier pointant sur un modele UML contenant des
	 * classes possedant des machines a etats.
	 *
	 * @return L'application du pattern State a la machine a etat.
	 */
	public void applyStatePatternToAllClassesInFile(final String fileToUml) {
		// TODO
	}

	/*
	 * Question 4.
	 *
	 * @param aStateMachine a StateMachine.
	 *
	 * @return La liste des opérations se trouvant comme trigger dans la machine a
	 * etat.
	 */
	public List<Operation> getOperationsFromWellFormedStateMachine(final StateMachine aStateMachine) {
		// TODO
		return null;
	}

	/*
	 * Question 1.
	 *
	 * @param aClass a Class.
	 *
	 * @return La liste des machines a etat decrivant aClass.
	 */
	public List<StateMachine> getStateMachinesFromClass(final Class aClass) {
		// TODO
		return null;
	}

	/*
	 * Question 3.
	 *
	 * @param aStateMachine a StateMachine.
	 *
	 * @return La liste des états composant la machine a etat.
	 */
	public List<State> getStatesFromWellFormedStateMachine(final StateMachine aStateMachine) {
		// TODO
		return null;
	}

	/*
	 * Question 2.
	 *
	 * @param aStateMachine a StateMachine.
	 *
	 * @return true si la machine a etat est bien former (1 region), false si la
	 * machine a etat est mal former (plusieurs regions).
	 */
	public boolean isWellFormedStateMachine(final StateMachine aStateMachine) {
		// TODO
		return false;
	}

}
