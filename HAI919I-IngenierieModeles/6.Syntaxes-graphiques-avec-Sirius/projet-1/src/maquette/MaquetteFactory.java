/**
 */
package maquette;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see maquette.MaquettePackage
 * @generated
 */
public interface MaquetteFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MaquetteFactory eINSTANCE = maquette.impl.MaquetteFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Formation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Formation</em>'.
	 * @generated
	 */
	Formation createFormation();

	/**
	 * Returns a new object of class '<em>Semestre</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Semestre</em>'.
	 * @generated
	 */
	Semestre createSemestre();

	/**
	 * Returns a new object of class '<em>UE</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>UE</em>'.
	 * @generated
	 */
	UE createUE();

	/**
	 * Returns a new object of class '<em>Compétence</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Compétence</em>'.
	 * @generated
	 */
	Compétence createCompétence();

	/**
	 * Returns a new object of class '<em>Formations</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Formations</em>'.
	 * @generated
	 */
	Formations createFormations();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	MaquettePackage getMaquettePackage();

} //MaquetteFactory
