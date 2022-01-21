/**
 */
package objetPersonnalisablePackage;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see objetPersonnalisablePackage.ObjetPersonnalisablePackagePackage
 * @generated
 */
public interface ObjetPersonnalisablePackageFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ObjetPersonnalisablePackageFactory eINSTANCE = objetPersonnalisablePackage.impl.ObjetPersonnalisablePackageFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Gamme Personnalisable</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Gamme Personnalisable</em>'.
	 * @generated
	 */
	GammePersonnalisable createGammePersonnalisable();

	/**
	 * Returns a new object of class '<em>Objet</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Objet</em>'.
	 * @generated
	 */
	Objet createObjet();

	/**
	 * Returns a new object of class '<em>Caracteristique Variable</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Caracteristique Variable</em>'.
	 * @generated
	 */
	CaracteristiqueVariable createCaracteristiqueVariable();

	/**
	 * Returns a new object of class '<em>Element De Personnalisation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Element De Personnalisation</em>'.
	 * @generated
	 */
	ElementDePersonnalisation createElementDePersonnalisation();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ObjetPersonnalisablePackagePackage getObjetPersonnalisablePackagePackage();

} //ObjetPersonnalisablePackageFactory
