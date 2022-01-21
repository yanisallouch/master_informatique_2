/**
 */
package maquette;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see maquette.MaquetteFactory
 * @model kind="package"
 * @generated
 */
public interface MaquettePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "maquette";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "fs://maquette";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "maquette";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MaquettePackage eINSTANCE = maquette.impl.MaquettePackageImpl.init();

	/**
	 * The meta object id for the '{@link maquette.impl.FormationImpl <em>Formation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see maquette.impl.FormationImpl
	 * @see maquette.impl.MaquettePackageImpl#getFormation()
	 * @generated
	 */
	int FORMATION = 0;

	/**
	 * The feature id for the '<em><b>Nb Semestres</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMATION__NB_SEMESTRES = 0;

	/**
	 * The feature id for the '<em><b>Semestres</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMATION__SEMESTRES = 1;

	/**
	 * The feature id for the '<em><b>Compétences Enseignées</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMATION__COMPÉTENCES_ENSEIGNÉES = 2;

	/**
	 * The feature id for the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMATION__NOM = 3;

	/**
	 * The feature id for the '<em><b>Ues Potentielles</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMATION__UES_POTENTIELLES = 4;

	/**
	 * The number of structural features of the '<em>Formation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMATION_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Formation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link maquette.impl.SemestreImpl <em>Semestre</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see maquette.impl.SemestreImpl
	 * @see maquette.impl.MaquettePackageImpl#getSemestre()
	 * @generated
	 */
	int SEMESTRE = 1;

	/**
	 * The feature id for the '<em><b>Nb ECTS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMESTRE__NB_ECTS = 0;

	/**
	 * The feature id for the '<em><b>Numero</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMESTRE__NUMERO = 1;

	/**
	 * The feature id for the '<em><b>Ues</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMESTRE__UES = 2;

	/**
	 * The number of structural features of the '<em>Semestre</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMESTRE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Semestre</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMESTRE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link maquette.impl.UEImpl <em>UE</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see maquette.impl.UEImpl
	 * @see maquette.impl.MaquettePackageImpl#getUE()
	 * @generated
	 */
	int UE = 2;

	/**
	 * The feature id for the '<em><b>Nb ECTS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UE__NB_ECTS = 0;

	/**
	 * The feature id for the '<em><b>Compétence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UE__COMPÉTENCE = 1;

	/**
	 * The feature id for the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UE__NOM = 2;

	/**
	 * The feature id for the '<em><b>Disciplinaire</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UE__DISCIPLINAIRE = 3;

	/**
	 * The number of structural features of the '<em>UE</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>UE</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link maquette.impl.CompétenceImpl <em>Compétence</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see maquette.impl.CompétenceImpl
	 * @see maquette.impl.MaquettePackageImpl#getCompétence()
	 * @generated
	 */
	int COMPÉTENCE = 3;

	/**
	 * The feature id for the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPÉTENCE__NOM = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPÉTENCE__DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>Ues</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPÉTENCE__UES = 2;

	/**
	 * The number of structural features of the '<em>Compétence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPÉTENCE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Compétence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPÉTENCE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link maquette.impl.FormationsImpl <em>Formations</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see maquette.impl.FormationsImpl
	 * @see maquette.impl.MaquettePackageImpl#getFormations()
	 * @generated
	 */
	int FORMATIONS = 4;

	/**
	 * The feature id for the '<em><b>Formations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMATIONS__FORMATIONS = 0;

	/**
	 * The number of structural features of the '<em>Formations</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMATIONS_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Formations</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMATIONS_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link maquette.Formation <em>Formation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Formation</em>'.
	 * @see maquette.Formation
	 * @generated
	 */
	EClass getFormation();

	/**
	 * Returns the meta object for the attribute '{@link maquette.Formation#getNbSemestres <em>Nb Semestres</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nb Semestres</em>'.
	 * @see maquette.Formation#getNbSemestres()
	 * @see #getFormation()
	 * @generated
	 */
	EAttribute getFormation_NbSemestres();

	/**
	 * Returns the meta object for the containment reference list '{@link maquette.Formation#getSemestres <em>Semestres</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Semestres</em>'.
	 * @see maquette.Formation#getSemestres()
	 * @see #getFormation()
	 * @generated
	 */
	EReference getFormation_Semestres();

	/**
	 * Returns the meta object for the containment reference list '{@link maquette.Formation#getCompétencesEnseignées <em>Compétences Enseignées</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Compétences Enseignées</em>'.
	 * @see maquette.Formation#getCompétencesEnseignées()
	 * @see #getFormation()
	 * @generated
	 */
	EReference getFormation_CompétencesEnseignées();

	/**
	 * Returns the meta object for the attribute '{@link maquette.Formation#getNom <em>Nom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nom</em>'.
	 * @see maquette.Formation#getNom()
	 * @see #getFormation()
	 * @generated
	 */
	EAttribute getFormation_Nom();

	/**
	 * Returns the meta object for the containment reference list '{@link maquette.Formation#getUesPotentielles <em>Ues Potentielles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ues Potentielles</em>'.
	 * @see maquette.Formation#getUesPotentielles()
	 * @see #getFormation()
	 * @generated
	 */
	EReference getFormation_UesPotentielles();

	/**
	 * Returns the meta object for class '{@link maquette.Semestre <em>Semestre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Semestre</em>'.
	 * @see maquette.Semestre
	 * @generated
	 */
	EClass getSemestre();

	/**
	 * Returns the meta object for the attribute '{@link maquette.Semestre#getNbECTS <em>Nb ECTS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nb ECTS</em>'.
	 * @see maquette.Semestre#getNbECTS()
	 * @see #getSemestre()
	 * @generated
	 */
	EAttribute getSemestre_NbECTS();

	/**
	 * Returns the meta object for the attribute '{@link maquette.Semestre#getNumero <em>Numero</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Numero</em>'.
	 * @see maquette.Semestre#getNumero()
	 * @see #getSemestre()
	 * @generated
	 */
	EAttribute getSemestre_Numero();

	/**
	 * Returns the meta object for the reference list '{@link maquette.Semestre#getUes <em>Ues</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Ues</em>'.
	 * @see maquette.Semestre#getUes()
	 * @see #getSemestre()
	 * @generated
	 */
	EReference getSemestre_Ues();

	/**
	 * Returns the meta object for class '{@link maquette.UE <em>UE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>UE</em>'.
	 * @see maquette.UE
	 * @generated
	 */
	EClass getUE();

	/**
	 * Returns the meta object for the attribute '{@link maquette.UE#getNbECTS <em>Nb ECTS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nb ECTS</em>'.
	 * @see maquette.UE#getNbECTS()
	 * @see #getUE()
	 * @generated
	 */
	EAttribute getUE_NbECTS();

	/**
	 * Returns the meta object for the reference list '{@link maquette.UE#getCompétence <em>Compétence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Compétence</em>'.
	 * @see maquette.UE#getCompétence()
	 * @see #getUE()
	 * @generated
	 */
	EReference getUE_Compétence();

	/**
	 * Returns the meta object for the attribute '{@link maquette.UE#getNom <em>Nom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nom</em>'.
	 * @see maquette.UE#getNom()
	 * @see #getUE()
	 * @generated
	 */
	EAttribute getUE_Nom();

	/**
	 * Returns the meta object for the attribute '{@link maquette.UE#isDisciplinaire <em>Disciplinaire</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Disciplinaire</em>'.
	 * @see maquette.UE#isDisciplinaire()
	 * @see #getUE()
	 * @generated
	 */
	EAttribute getUE_Disciplinaire();

	/**
	 * Returns the meta object for class '{@link maquette.Compétence <em>Compétence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Compétence</em>'.
	 * @see maquette.Compétence
	 * @generated
	 */
	EClass getCompétence();

	/**
	 * Returns the meta object for the attribute '{@link maquette.Compétence#getNom <em>Nom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nom</em>'.
	 * @see maquette.Compétence#getNom()
	 * @see #getCompétence()
	 * @generated
	 */
	EAttribute getCompétence_Nom();

	/**
	 * Returns the meta object for the attribute '{@link maquette.Compétence#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see maquette.Compétence#getDescription()
	 * @see #getCompétence()
	 * @generated
	 */
	EAttribute getCompétence_Description();

	/**
	 * Returns the meta object for the reference list '{@link maquette.Compétence#getUes <em>Ues</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Ues</em>'.
	 * @see maquette.Compétence#getUes()
	 * @see #getCompétence()
	 * @generated
	 */
	EReference getCompétence_Ues();

	/**
	 * Returns the meta object for class '{@link maquette.Formations <em>Formations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Formations</em>'.
	 * @see maquette.Formations
	 * @generated
	 */
	EClass getFormations();

	/**
	 * Returns the meta object for the containment reference list '{@link maquette.Formations#getFormations <em>Formations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Formations</em>'.
	 * @see maquette.Formations#getFormations()
	 * @see #getFormations()
	 * @generated
	 */
	EReference getFormations_Formations();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	MaquetteFactory getMaquetteFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link maquette.impl.FormationImpl <em>Formation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see maquette.impl.FormationImpl
		 * @see maquette.impl.MaquettePackageImpl#getFormation()
		 * @generated
		 */
		EClass FORMATION = eINSTANCE.getFormation();

		/**
		 * The meta object literal for the '<em><b>Nb Semestres</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FORMATION__NB_SEMESTRES = eINSTANCE.getFormation_NbSemestres();

		/**
		 * The meta object literal for the '<em><b>Semestres</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FORMATION__SEMESTRES = eINSTANCE.getFormation_Semestres();

		/**
		 * The meta object literal for the '<em><b>Compétences Enseignées</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FORMATION__COMPÉTENCES_ENSEIGNÉES = eINSTANCE.getFormation_CompétencesEnseignées();

		/**
		 * The meta object literal for the '<em><b>Nom</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FORMATION__NOM = eINSTANCE.getFormation_Nom();

		/**
		 * The meta object literal for the '<em><b>Ues Potentielles</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FORMATION__UES_POTENTIELLES = eINSTANCE.getFormation_UesPotentielles();

		/**
		 * The meta object literal for the '{@link maquette.impl.SemestreImpl <em>Semestre</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see maquette.impl.SemestreImpl
		 * @see maquette.impl.MaquettePackageImpl#getSemestre()
		 * @generated
		 */
		EClass SEMESTRE = eINSTANCE.getSemestre();

		/**
		 * The meta object literal for the '<em><b>Nb ECTS</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEMESTRE__NB_ECTS = eINSTANCE.getSemestre_NbECTS();

		/**
		 * The meta object literal for the '<em><b>Numero</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEMESTRE__NUMERO = eINSTANCE.getSemestre_Numero();

		/**
		 * The meta object literal for the '<em><b>Ues</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEMESTRE__UES = eINSTANCE.getSemestre_Ues();

		/**
		 * The meta object literal for the '{@link maquette.impl.UEImpl <em>UE</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see maquette.impl.UEImpl
		 * @see maquette.impl.MaquettePackageImpl#getUE()
		 * @generated
		 */
		EClass UE = eINSTANCE.getUE();

		/**
		 * The meta object literal for the '<em><b>Nb ECTS</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UE__NB_ECTS = eINSTANCE.getUE_NbECTS();

		/**
		 * The meta object literal for the '<em><b>Compétence</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UE__COMPÉTENCE = eINSTANCE.getUE_Compétence();

		/**
		 * The meta object literal for the '<em><b>Nom</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UE__NOM = eINSTANCE.getUE_Nom();

		/**
		 * The meta object literal for the '<em><b>Disciplinaire</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UE__DISCIPLINAIRE = eINSTANCE.getUE_Disciplinaire();

		/**
		 * The meta object literal for the '{@link maquette.impl.CompétenceImpl <em>Compétence</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see maquette.impl.CompétenceImpl
		 * @see maquette.impl.MaquettePackageImpl#getCompétence()
		 * @generated
		 */
		EClass COMPÉTENCE = eINSTANCE.getCompétence();

		/**
		 * The meta object literal for the '<em><b>Nom</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPÉTENCE__NOM = eINSTANCE.getCompétence_Nom();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPÉTENCE__DESCRIPTION = eINSTANCE.getCompétence_Description();

		/**
		 * The meta object literal for the '<em><b>Ues</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPÉTENCE__UES = eINSTANCE.getCompétence_Ues();

		/**
		 * The meta object literal for the '{@link maquette.impl.FormationsImpl <em>Formations</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see maquette.impl.FormationsImpl
		 * @see maquette.impl.MaquettePackageImpl#getFormations()
		 * @generated
		 */
		EClass FORMATIONS = eINSTANCE.getFormations();

		/**
		 * The meta object literal for the '<em><b>Formations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FORMATIONS__FORMATIONS = eINSTANCE.getFormations_Formations();

	}

} //MaquettePackage
