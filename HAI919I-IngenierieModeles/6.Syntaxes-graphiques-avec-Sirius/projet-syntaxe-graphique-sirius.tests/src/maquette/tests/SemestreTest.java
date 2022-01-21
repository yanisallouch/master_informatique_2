/**
 */
package maquette.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import maquette.MaquetteFactory;
import maquette.Semestre;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Semestre</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class SemestreTest extends TestCase {

	/**
	 * The fixture for this Semestre test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Semestre fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(SemestreTest.class);
	}

	/**
	 * Constructs a new Semestre test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SemestreTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Semestre test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Semestre fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Semestre test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Semestre getFixture() {
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
		setFixture(MaquetteFactory.eINSTANCE.createSemestre());
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

} //SemestreTest
