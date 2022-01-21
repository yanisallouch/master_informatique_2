/**
 */
package objetPersonnalisablePackage.impl;

import objetPersonnalisablePackage.CaracteristiqueVariable;
import objetPersonnalisablePackage.ElementDePersonnalisation;
import objetPersonnalisablePackage.GammePersonnalisable;
import objetPersonnalisablePackage.NamedElement;
import objetPersonnalisablePackage.Objet;
import objetPersonnalisablePackage.ObjetPersonnalisablePackageFactory;
import objetPersonnalisablePackage.ObjetPersonnalisablePackagePackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ObjetPersonnalisablePackagePackageImpl extends EPackageImpl implements ObjetPersonnalisablePackagePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gammePersonnalisableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass objetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass caracteristiqueVariableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass namedElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass elementDePersonnalisationEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see objetPersonnalisablePackage.ObjetPersonnalisablePackagePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ObjetPersonnalisablePackagePackageImpl() {
		super(eNS_URI, ObjetPersonnalisablePackageFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link ObjetPersonnalisablePackagePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ObjetPersonnalisablePackagePackage init() {
		if (isInited) return (ObjetPersonnalisablePackagePackage)EPackage.Registry.INSTANCE.getEPackage(ObjetPersonnalisablePackagePackage.eNS_URI);

		// Obtain or create and register package
		Object registeredObjetPersonnalisablePackagePackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		ObjetPersonnalisablePackagePackageImpl theObjetPersonnalisablePackagePackage = registeredObjetPersonnalisablePackagePackage instanceof ObjetPersonnalisablePackagePackageImpl ? (ObjetPersonnalisablePackagePackageImpl)registeredObjetPersonnalisablePackagePackage : new ObjetPersonnalisablePackagePackageImpl();

		isInited = true;

		// Create package meta-data objects
		theObjetPersonnalisablePackagePackage.createPackageContents();

		// Initialize created meta-data
		theObjetPersonnalisablePackagePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theObjetPersonnalisablePackagePackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ObjetPersonnalisablePackagePackage.eNS_URI, theObjetPersonnalisablePackagePackage);
		return theObjetPersonnalisablePackagePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGammePersonnalisable() {
		return gammePersonnalisableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGammePersonnalisable_Objets() {
		return (EReference)gammePersonnalisableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGammePersonnalisable_Elementsdepersonnalisation() {
		return (EReference)gammePersonnalisableEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGammePersonnalisable_Elementsvariables() {
		return (EReference)gammePersonnalisableEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getObjet() {
		return objetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCaracteristiqueVariable() {
		return caracteristiqueVariableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNamedElement() {
		return namedElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNamedElement_Nom() {
		return (EAttribute)namedElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getElementDePersonnalisation() {
		return elementDePersonnalisationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjetPersonnalisablePackageFactory getObjetPersonnalisablePackageFactory() {
		return (ObjetPersonnalisablePackageFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		gammePersonnalisableEClass = createEClass(GAMME_PERSONNALISABLE);
		createEReference(gammePersonnalisableEClass, GAMME_PERSONNALISABLE__OBJETS);
		createEReference(gammePersonnalisableEClass, GAMME_PERSONNALISABLE__ELEMENTSDEPERSONNALISATION);
		createEReference(gammePersonnalisableEClass, GAMME_PERSONNALISABLE__ELEMENTSVARIABLES);

		objetEClass = createEClass(OBJET);

		caracteristiqueVariableEClass = createEClass(CARACTERISTIQUE_VARIABLE);

		namedElementEClass = createEClass(NAMED_ELEMENT);
		createEAttribute(namedElementEClass, NAMED_ELEMENT__NOM);

		elementDePersonnalisationEClass = createEClass(ELEMENT_DE_PERSONNALISATION);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		objetEClass.getESuperTypes().add(this.getNamedElement());
		caracteristiqueVariableEClass.getESuperTypes().add(this.getNamedElement());
		elementDePersonnalisationEClass.getESuperTypes().add(this.getNamedElement());

		// Initialize classes, features, and operations; add parameters
		initEClass(gammePersonnalisableEClass, GammePersonnalisable.class, "GammePersonnalisable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGammePersonnalisable_Objets(), this.getObjet(), null, "objets", null, 0, -1, GammePersonnalisable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGammePersonnalisable_Elementsdepersonnalisation(), this.getElementDePersonnalisation(), null, "elementsdepersonnalisation", null, 0, -1, GammePersonnalisable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGammePersonnalisable_Elementsvariables(), this.getCaracteristiqueVariable(), null, "elementsvariables", null, 0, -1, GammePersonnalisable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(objetEClass, Objet.class, "Objet", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(caracteristiqueVariableEClass, CaracteristiqueVariable.class, "CaracteristiqueVariable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(namedElementEClass, NamedElement.class, "NamedElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNamedElement_Nom(), ecorePackage.getEString(), "nom", null, 0, 1, NamedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(elementDePersonnalisationEClass, ElementDePersonnalisation.class, "ElementDePersonnalisation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //ObjetPersonnalisablePackagePackageImpl
