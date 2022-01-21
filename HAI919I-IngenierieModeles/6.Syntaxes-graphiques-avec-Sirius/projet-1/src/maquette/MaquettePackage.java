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
	 * The feature id for the '<em><b>Comp�tences Enseign�es</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMATION__COMP�TENCES_ENSEIGN�ES = 2;

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
	 * The feature id for the '<em><b>Comp�tence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UE__COMP�TENCE = 1;

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
	 * The meta object id for the '{@link maquette.impl.Comp�tenceImpl <em>Comp�tence</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see maquette.impl.Comp�tenceImpl
	 * @see maquette.impl.MaquettePackageImpl#getComp�tence()
	 * @generated
	 */
	int COMP�TENCE = 3;

	/**
	 * The feature id for the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMP�TENCE__NOM = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMP�TENCE__DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>Ues</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMP�TENCE__UES = 2;

	/**
	 * The number of structural features of the '<em>Comp�tence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMP�TENCE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Comp�tence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMP�TENCE_OPERATION_COUNT = 0;

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
	 * Returns the meta object for the containment reference list '{@link maquette.Formation#getComp�tencesEnseign�es <em>Comp�tences Enseign�es</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Comp�tences Enseign�es</em>'.
	 * @see maquette.Formation#getComp�tencesEnseign�es()
	 * @see #getFormation()
	 * @generated
	 */
	EReference getFormation_Comp�tencesEnseign�es();

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
	 * Returns the meta object for the reference list '{@link maquette.UE#getComp�tence <em>Comp�tence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Comp�tence</em>'.
	 * @see maquette.UE#getComp�tence()
	 * @see #getUE()
	 * @generated
	 */
	EReference getUE_Comp�tence();

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
	 * Returns the meta object for class '{@link maquette.Comp�tence <em>Comp�tence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Comp�tence</em>'.
	 * @see maquette.Comp�tence
	 * @generated
	 */
	EClass getComp�tence();

	/**
	 * Returns the meta object for the attribute '{@link maquette.Comp�tence#getNom <em>Nom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nom</em>'.
	 * @see maquette.Comp�tence#getNom()
	 * @see #getComp�tence()
	 * @generated
	 */
	EAttribute getComp�tence_Nom();

	/**
	 * Returns the meta object for the attribute '{@link maquette.Comp�tence#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see maquette.Comp�tence#getDescription()
	 * @see #getComp�tence()
	 * @generated
	 */
	EAttribute getComp�tence_Description();

	/**
	 * Returns the meta object for the reference list '{@link maquette.Comp�tence#getUes <em>Ues</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Ues</em>'.
	 * @see maquette.Comp�tence#getUes()
	 * @see #getComp�tence()
	 * @generated
	 */
	EReference getComp�tence_Ues();

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
		 * The meta object literal for the '<em><b>Comp�tences Enseign�es</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FORMATION__COMP�TENCES_ENSEIGN�ES = eINSTANCE.getFormation_Comp�tencesEnseign�es();

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
		 * The meta object literal for the '<em><b>Comp�tence</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UE__COMP�TENCE = eINSTANCE.getUE_Comp�tence();

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
		 * The meta object literal for the '{@link maquette.impl.Comp�tenceImpl <em>Comp�tence</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see maquette.impl.Comp�tenceImpl
		 * @see maquette.impl.MaquettePackageImpl#getComp�tence()
		 * @generated
		 */
		EClass COMP�TENCE = eINSTANCE.getComp�tence();

		/**
		 * The meta object literal for the '<em><b>Nom</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMP�TENCE__NOM = eINSTANCE.getComp�tence_Nom();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMP�TENCE__DESCRIPTION = eINSTANCE.getComp�tence_Description();

		/**
		 * The meta object literal for the '<em><b>Ues</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMP�TENCE__UES = eINSTANCE.getComp�tence_Ues();

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
