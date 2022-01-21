/**
 */
package maquette.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import maquette.Formation;
import maquette.MaquetteFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Formation</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class FormationTest extends TestCase {

	/**
	 * The fixture for this Formation test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Formation fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(FormationTest.class);
	}

	/**
	 * Constructs a new Formation test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FormationTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Formation test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Formation fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Formation test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Formation getFixture() {
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
		setFixture(MaquetteFactory.eINSTANCE.createFormation());
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

} //FormationTest
