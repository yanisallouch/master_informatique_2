/**
 */
package objetPersonnalisablePackage;

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
 * @see objetPersonnalisablePackage.ObjetPersonnalisablePackageFactory
 * @model kind="package"
 * @generated
 */
public interface ObjetPersonnalisablePackagePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "objetPersonnalisablePackage";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://objetPersonnalisable/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "objetPersonnalisable";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ObjetPersonnalisablePackagePackage eINSTANCE = objetPersonnalisablePackage.impl.ObjetPersonnalisablePackagePackageImpl.init();

	/**
	 * The meta object id for the '{@link objetPersonnalisablePackage.impl.GammePersonnalisableImpl <em>Gamme Personnalisable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see objetPersonnalisablePackage.impl.GammePersonnalisableImpl
	 * @see objetPersonnalisablePackage.impl.ObjetPersonnalisablePackagePackageImpl#getGammePersonnalisable()
	 * @generated
	 */
	int GAMME_PERSONNALISABLE = 0;

	/**
	 * The feature id for the '<em><b>Objets</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAMME_PERSONNALISABLE__OBJETS = 0;

	/**
	 * The feature id for the '<em><b>Elementsdepersonnalisation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAMME_PERSONNALISABLE__ELEMENTSDEPERSONNALISATION = 1;

	/**
	 * The feature id for the '<em><b>Elementsvariables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAMME_PERSONNALISABLE__ELEMENTSVARIABLES = 2;

	/**
	 * The number of structural features of the '<em>Gamme Personnalisable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAMME_PERSONNALISABLE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Gamme Personnalisable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAMME_PERSONNALISABLE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link objetPersonnalisablePackage.impl.NamedElementImpl <em>Named Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see objetPersonnalisablePackage.impl.NamedElementImpl
	 * @see objetPersonnalisablePackage.impl.ObjetPersonnalisablePackagePackageImpl#getNamedElement()
	 * @generated
	 */
	int NAMED_ELEMENT = 3;

	/**
	 * The feature id for the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__NOM = 0;

	/**
	 * The number of structural features of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link objetPersonnalisablePackage.impl.ObjetImpl <em>Objet</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see objetPersonnalisablePackage.impl.ObjetImpl
	 * @see objetPersonnalisablePackage.impl.ObjetPersonnalisablePackagePackageImpl#getObjet()
	 * @generated
	 */
	int OBJET = 1;

	/**
	 * The feature id for the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJET__NOM = NAMED_ELEMENT__NOM;

	/**
	 * The number of structural features of the '<em>Objet</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJET_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Objet</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJET_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link objetPersonnalisablePackage.impl.CaracteristiqueVariableImpl <em>Caracteristique Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see objetPersonnalisablePackage.impl.CaracteristiqueVariableImpl
	 * @see objetPersonnalisablePackage.impl.ObjetPersonnalisablePackagePackageImpl#getCaracteristiqueVariable()
	 * @generated
	 */
	int CARACTERISTIQUE_VARIABLE = 2;

	/**
	 * The feature id for the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARACTERISTIQUE_VARIABLE__NOM = NAMED_ELEMENT__NOM;

	/**
	 * The number of structural features of the '<em>Caracteristique Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARACTERISTIQUE_VARIABLE_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Caracteristique Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARACTERISTIQUE_VARIABLE_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link objetPersonnalisablePackage.impl.ElementDePersonnalisationImpl <em>Element De Personnalisation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see objetPersonnalisablePackage.impl.ElementDePersonnalisationImpl
	 * @see objetPersonnalisablePackage.impl.ObjetPersonnalisablePackagePackageImpl#getElementDePersonnalisation()
	 * @generated
	 */
	int ELEMENT_DE_PERSONNALISATION = 4;

	/**
	 * The feature id for the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_DE_PERSONNALISATION__NOM = NAMED_ELEMENT__NOM;

	/**
	 * The number of structural features of the '<em>Element De Personnalisation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_DE_PERSONNALISATION_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Element De Personnalisation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_DE_PERSONNALISATION_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link objetPersonnalisablePackage.GammePersonnalisable <em>Gamme Personnalisable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gamme Personnalisable</em>'.
	 * @see objetPersonnalisablePackage.GammePersonnalisable
	 * @generated
	 */
	EClass getGammePersonnalisable();

	/**
	 * Returns the meta object for the containment reference list '{@link objetPersonnalisablePackage.GammePersonnalisable#getObjets <em>Objets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Objets</em>'.
	 * @see objetPersonnalisablePackage.GammePersonnalisable#getObjets()
	 * @see #getGammePersonnalisable()
	 * @generated
	 */
	EReference getGammePersonnalisable_Objets();

	/**
	 * Returns the meta object for the containment reference list '{@link objetPersonnalisablePackage.GammePersonnalisable#getElementsdepersonnalisation <em>Elementsdepersonnalisation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Elementsdepersonnalisation</em>'.
	 * @see objetPersonnalisablePackage.GammePersonnalisable#getElementsdepersonnalisation()
	 * @see #getGammePersonnalisable()
	 * @generated
	 */
	EReference getGammePersonnalisable_Elementsdepersonnalisation();

	/**
	 * Returns the meta object for the containment reference list '{@link objetPersonnalisablePackage.GammePersonnalisable#getElementsvariables <em>Elementsvariables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Elementsvariables</em>'.
	 * @see objetPersonnalisablePackage.GammePersonnalisable#getElementsvariables()
	 * @see #getGammePersonnalisable()
	 * @generated
	 */
	EReference getGammePersonnalisable_Elementsvariables();

	/**
	 * Returns the meta object for class '{@link objetPersonnalisablePackage.Objet <em>Objet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Objet</em>'.
	 * @see objetPersonnalisablePackage.Objet
	 * @generated
	 */
	EClass getObjet();

	/**
	 * Returns the meta object for class '{@link objetPersonnalisablePackage.CaracteristiqueVariable <em>Caracteristique Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Caracteristique Variable</em>'.
	 * @see objetPersonnalisablePackage.CaracteristiqueVariable
	 * @generated
	 */
	EClass getCaracteristiqueVariable();

	/**
	 * Returns the meta object for class '{@link objetPersonnalisablePackage.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Element</em>'.
	 * @see objetPersonnalisablePackage.NamedElement
	 * @generated
	 */
	EClass getNamedElement();

	/**
	 * Returns the meta object for the attribute '{@link objetPersonnalisablePackage.NamedElement#getNom <em>Nom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nom</em>'.
	 * @see objetPersonnalisablePackage.NamedElement#getNom()
	 * @see #getNamedElement()
	 * @generated
	 */
	EAttribute getNamedElement_Nom();

	/**
	 * Returns the meta object for class '{@link objetPersonnalisablePackage.ElementDePersonnalisation <em>Element De Personnalisation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Element De Personnalisation</em>'.
	 * @see objetPersonnalisablePackage.ElementDePersonnalisation
	 * @generated
	 */
	EClass getElementDePersonnalisation();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ObjetPersonnalisablePackageFactory getObjetPersonnalisablePackageFactory();

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
		 * The meta object literal for the '{@link objetPersonnalisablePackage.impl.GammePersonnalisableImpl <em>Gamme Personnalisable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see objetPersonnalisablePackage.impl.GammePersonnalisableImpl
		 * @see objetPersonnalisablePackage.impl.ObjetPersonnalisablePackagePackageImpl#getGammePersonnalisable()
		 * @generated
		 */
		EClass GAMME_PERSONNALISABLE = eINSTANCE.getGammePersonnalisable();

		/**
		 * The meta object literal for the '<em><b>Objets</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GAMME_PERSONNALISABLE__OBJETS = eINSTANCE.getGammePersonnalisable_Objets();

		/**
		 * The meta object literal for the '<em><b>Elementsdepersonnalisation</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GAMME_PERSONNALISABLE__ELEMENTSDEPERSONNALISATION = eINSTANCE.getGammePersonnalisable_Elementsdepersonnalisation();

		/**
		 * The meta object literal for the '<em><b>Elementsvariables</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GAMME_PERSONNALISABLE__ELEMENTSVARIABLES = eINSTANCE.getGammePersonnalisable_Elementsvariables();

		/**
		 * The meta object literal for the '{@link objetPersonnalisablePackage.impl.ObjetImpl <em>Objet</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see objetPersonnalisablePackage.impl.ObjetImpl
		 * @see objetPersonnalisablePackage.impl.ObjetPersonnalisablePackagePackageImpl#getObjet()
		 * @generated
		 */
		EClass OBJET = eINSTANCE.getObjet();

		/**
		 * The meta object literal for the '{@link objetPersonnalisablePackage.impl.CaracteristiqueVariableImpl <em>Caracteristique Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see objetPersonnalisablePackage.impl.CaracteristiqueVariableImpl
		 * @see objetPersonnalisablePackage.impl.ObjetPersonnalisablePackagePackageImpl#getCaracteristiqueVariable()
		 * @generated
		 */
		EClass CARACTERISTIQUE_VARIABLE = eINSTANCE.getCaracteristiqueVariable();

		/**
		 * The meta object literal for the '{@link objetPersonnalisablePackage.impl.NamedElementImpl <em>Named Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see objetPersonnalisablePackage.impl.NamedElementImpl
		 * @see objetPersonnalisablePackage.impl.ObjetPersonnalisablePackagePackageImpl#getNamedElement()
		 * @generated
		 */
		EClass NAMED_ELEMENT = eINSTANCE.getNamedElement();

		/**
		 * The meta object literal for the '<em><b>Nom</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMED_ELEMENT__NOM = eINSTANCE.getNamedElement_Nom();

		/**
		 * The meta object literal for the '{@link objetPersonnalisablePackage.impl.ElementDePersonnalisationImpl <em>Element De Personnalisation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see objetPersonnalisablePackage.impl.ElementDePersonnalisationImpl
		 * @see objetPersonnalisablePackage.impl.ObjetPersonnalisablePackagePackageImpl#getElementDePersonnalisation()
		 * @generated
		 */
		EClass ELEMENT_DE_PERSONNALISATION = eINSTANCE.getElementDePersonnalisation();

	}

} //ObjetPersonnalisablePackagePackage
