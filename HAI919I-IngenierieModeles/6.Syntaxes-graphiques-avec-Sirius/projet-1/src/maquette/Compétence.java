/**
 */
package maquette;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Compétence</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link maquette.Compétence#getNom <em>Nom</em>}</li>
 *   <li>{@link maquette.Compétence#getDescription <em>Description</em>}</li>
 *   <li>{@link maquette.Compétence#getUes <em>Ues</em>}</li>
 * </ul>
 *
 * @see maquette.MaquettePackage#getCompétence()
 * @model
 * @generated
 */
public interface Compétence extends EObject {
	/**
	 * Returns the value of the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nom</em>' attribute.
	 * @see #setNom(String)
	 * @see maquette.MaquettePackage#getCompétence_Nom()
	 * @model
	 * @generated
	 */
	String getNom();

	/**
	 * Sets the value of the '{@link maquette.Compétence#getNom <em>Nom</em>}' attribute.
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
	 * @see maquette.MaquettePackage#getCompétence_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link maquette.Compétence#getDescription <em>Description</em>}' attribute.
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
	 * It is bidirectional and its opposite is '{@link maquette.UE#getCompétence <em>Compétence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ues</em>' reference list.
	 * @see maquette.MaquettePackage#getCompétence_Ues()
	 * @see maquette.UE#getCompétence
	 * @model opposite="compétence"
	 * @generated
	 */
	EList<UE> getUes();

} // Compétence
