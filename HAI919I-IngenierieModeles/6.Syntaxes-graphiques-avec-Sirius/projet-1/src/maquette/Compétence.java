/**
 */
package maquette;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Comp�tence</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link maquette.Comp�tence#getNom <em>Nom</em>}</li>
 *   <li>{@link maquette.Comp�tence#getDescription <em>Description</em>}</li>
 *   <li>{@link maquette.Comp�tence#getUes <em>Ues</em>}</li>
 * </ul>
 *
 * @see maquette.MaquettePackage#getComp�tence()
 * @model
 * @generated
 */
public interface Comp�tence extends EObject {
	/**
	 * Returns the value of the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nom</em>' attribute.
	 * @see #setNom(String)
	 * @see maquette.MaquettePackage#getComp�tence_Nom()
	 * @model
	 * @generated
	 */
	String getNom();

	/**
	 * Sets the value of the '{@link maquette.Comp�tence#getNom <em>Nom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nom</em>' attribute.
	 * @see #getNom()
	 * @generated
	 */
	void setNom(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see maquette.MaquettePackage#getComp�tence_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link maquette.Comp�tence#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Ues</b></em>' reference list.
	 * The list contents are of type {@link maquette.UE}.
	 * It is bidirectional and its opposite is '{@link maquette.UE#getComp�tence <em>Comp�tence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ues</em>' reference list.
	 * @see maquette.MaquettePackage#getComp�tence_Ues()
	 * @see maquette.UE#getComp�tence
	 * @model opposite="comp�tence"
	 * @generated
	 */
	EList<UE> getUes();

} // Comp�tence
