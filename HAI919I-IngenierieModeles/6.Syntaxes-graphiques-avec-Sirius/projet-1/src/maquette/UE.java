/**
 */
package maquette;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>UE</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link maquette.UE#getNbECTS <em>Nb ECTS</em>}</li>
 *   <li>{@link maquette.UE#getCompétence <em>Compétence</em>}</li>
 *   <li>{@link maquette.UE#getNom <em>Nom</em>}</li>
 *   <li>{@link maquette.UE#isDisciplinaire <em>Disciplinaire</em>}</li>
 * </ul>
 *
 * @see maquette.MaquettePackage#getUE()
 * @model
 * @generated
 */
public interface UE extends EObject {
	/**
	 * Returns the value of the '<em><b>Nb ECTS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nb ECTS</em>' attribute.
	 * @see #setNbECTS(int)
	 * @see maquette.MaquettePackage#getUE_NbECTS()
	 * @model
	 * @generated
	 */
	int getNbECTS();

	/**
	 * Sets the value of the '{@link maquette.UE#getNbECTS <em>Nb ECTS</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nb ECTS</em>' attribute.
	 * @see #getNbECTS()
	 * @generated
	 */
	void setNbECTS(int value);

	/**
	 * Returns the value of the '<em><b>Compétence</b></em>' reference list.
	 * The list contents are of type {@link maquette.Compétence}.
	 * It is bidirectional and its opposite is '{@link maquette.Compétence#getUes <em>Ues</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Compétence</em>' reference list.
	 * @see maquette.MaquettePackage#getUE_Compétence()
	 * @see maquette.Compétence#getUes
	 * @model opposite="ues"
	 * @generated
	 */
	EList<Compétence> getCompétence();

	/**
	 * Returns the value of the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nom</em>' attribute.
	 * @see #setNom(String)
	 * @see maquette.MaquettePackage#getUE_Nom()
	 * @model
	 * @generated
	 */
	String getNom();

	/**
	 * Sets the value of the '{@link maquette.UE#getNom <em>Nom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nom</em>' attribute.
	 * @see #getNom()
	 * @generated
	 */
	void setNom(String value);

	/**
	 * Returns the value of the '<em><b>Disciplinaire</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Disciplinaire</em>' attribute.
	 * @see #setDisciplinaire(boolean)
	 * @see maquette.MaquettePackage#getUE_Disciplinaire()
	 * @model default="true"
	 * @generated
	 */
	boolean isDisciplinaire();

	/**
	 * Sets the value of the '{@link maquette.UE#isDisciplinaire <em>Disciplinaire</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Disciplinaire</em>' attribute.
	 * @see #isDisciplinaire()
	 * @generated
	 */
	void setDisciplinaire(boolean value);

} // UE
