/**
 */
package maquette;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Semestre</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link maquette.Semestre#getNbECTS <em>Nb ECTS</em>}</li>
 *   <li>{@link maquette.Semestre#getNumero <em>Numero</em>}</li>
 *   <li>{@link maquette.Semestre#getUes <em>Ues</em>}</li>
 * </ul>
 *
 * @see maquette.MaquettePackage#getSemestre()
 * @model
 * @generated
 */
public interface Semestre extends EObject {
	/**
	 * Returns the value of the '<em><b>Nb ECTS</b></em>' attribute.
	 * The default value is <code>"30"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nb ECTS</em>' attribute.
	 * @see maquette.MaquettePackage#getSemestre_NbECTS()
	 * @model default="30" changeable="false"
	 * @generated
	 */
	int getNbECTS();

	/**
	 * Returns the value of the '<em><b>Numero</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Numero</em>' attribute.
	 * @see #setNumero(int)
	 * @see maquette.MaquettePackage#getSemestre_Numero()
	 * @model
	 * @generated
	 */
	int getNumero();

	/**
	 * Sets the value of the '{@link maquette.Semestre#getNumero <em>Numero</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Numero</em>' attribute.
	 * @see #getNumero()
	 * @generated
	 */
	void setNumero(int value);

	/**
	 * Returns the value of the '<em><b>Ues</b></em>' reference list.
	 * The list contents are of type {@link maquette.UE}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ues</em>' reference list.
	 * @see maquette.MaquettePackage#getSemestre_Ues()
	 * @model
	 * @generated
	 */
	EList<UE> getUes();

} // Semestre
