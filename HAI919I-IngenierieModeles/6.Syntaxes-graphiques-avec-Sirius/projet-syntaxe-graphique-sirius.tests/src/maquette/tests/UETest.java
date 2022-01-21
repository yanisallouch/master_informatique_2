/**
 */
package maquette.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import maquette.MaquetteFactory;
import maquette.UE;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>UE</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class UETest extends TestCase {

	/**
	 * The fixture for this UE test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UE fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(UETest.class);
	}

	/**
	 * Constructs a new UE test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UETest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this UE test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(UE fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this UE test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UE getFixture() {
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
		setFixture(MaquetteFactory.eINSTANCE.createUE());
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

} //UETest
