/**
 */
package maquette;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Formation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link maquette.Formation#getNbSemestres <em>Nb Semestres</em>}</li>
 *   <li>{@link maquette.Formation#getSemestres <em>Semestres</em>}</li>
 *   <li>{@link maquette.Formation#getCompétencesEnseignées <em>Compétences Enseignées</em>}</li>
 *   <li>{@link maquette.Formation#getNom <em>Nom</em>}</li>
 *   <li>{@link maquette.Formation#getUesPotentielles <em>Ues Potentielles</em>}</li>
 * </ul>
 *
 * @see maquette.MaquettePackage#getFormation()
 * @model
 * @generated
 */
public interface Formation extends EObject {
	/**
	 * Returns the value of the '<em><b>Nb Semestres</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nb Semestres</em>' attribute.
	 * @see #setNbSemestres(int)
	 * @see maquette.MaquettePackage#getFormation_NbSemestres()
	 * @model
	 * @generated
	 */
	int getNbSemestres();

	/**
	 * Sets the value of the '{@link maquette.Formation#getNbSemestres <em>Nb Semestres</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nb Semestres</em>' attribute.
	 * @see #getNbSemestres()
	 * @generated
	 */
	void setNbSemestres(int value);

	/**
	 * Returns the value of the '<em><b>Semestres</b></em>' containment reference list.
	 * The list contents are of type {@link maquette.Semestre}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Semestres</em>' containment reference list.
	 * @see maquette.MaquettePackage#getFormation_Semestres()
	 * @model containment="true"
	 * @generated
	 */
	EList<Semestre> getSemestres();

	/**
	 * Returns the value of the '<em><b>Compétences Enseignées</b></em>' containment reference list.
	 * The list contents are of type {@link maquette.Compétence}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Compétences Enseignées</em>' containment reference list.
	 * @see maquette.MaquettePackage#getFormation_CompétencesEnseignées()
	 * @model containment="true"
	 * @generated
	 */
	EList<Compétence> getCompétencesEnseignées();

	/**
	 * Returns the value of the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nom</em>' attribute.
	 * @see #setNom(String)
	 * @see maquette.MaquettePackage#getFormation_Nom()
	 * @model
	 * @generated
	 */
	String getNom();

	/**
	 * Sets the value of the '{@link maquette.Formation#getNom <em>Nom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nom</em>' attribute.
	 * @see #getNom()
	 * @generated
	 */
	void setNom(String value);

	/**
	 * Returns the value of the '<em><b>Ues Potentielles</b></em>' containment reference list.
	 * The list contents are of type {@link maquette.UE}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ues Potentielles</em>' containment reference list.
	 * @see maquette.MaquettePackage#getFormation_UesPotentielles()
	 * @model containment="true"
	 * @generated
	 */
	EList<UE> getUesPotentielles();

} // Formation
