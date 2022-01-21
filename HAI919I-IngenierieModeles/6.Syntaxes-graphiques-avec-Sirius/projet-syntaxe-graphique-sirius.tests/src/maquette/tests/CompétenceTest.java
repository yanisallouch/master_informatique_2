/**
 */
package maquette.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import maquette.Compétence;
import maquette.MaquetteFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Compétence</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class CompétenceTest extends TestCase {

	/**
	 * The fixture for this Compétence test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Compétence fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(CompétenceTest.class);
	}

	/**
	 * Constructs a new Compétence test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompétenceTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Compétence test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Compétence fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Compétence test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Compétence getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(MaquetteFactory.eINSTANCE.createCompétence());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //CompétenceTest
