/**
 */
package objetPersonnalisablePackage.impl;

import objetPersonnalisablePackage.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ObjetPersonnalisablePackageFactoryImpl extends EFactoryImpl implements ObjetPersonnalisablePackageFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ObjetPersonnalisablePackageFactory init() {
		try {
			ObjetPersonnalisablePackageFactory theObjetPersonnalisablePackageFactory = (ObjetPersonnalisablePackageFactory)EPackage.Registry.INSTANCE.getEFactory(ObjetPersonnalisablePackagePackage.eNS_URI);
			if (theObjetPersonnalisablePackageFactory != null) {
				return theObjetPersonnalisablePackageFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ObjetPersonnalisablePackageFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjetPersonnalisablePackageFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case ObjetPersonnalisablePackagePackage.GAMME_PERSONNALISABLE: return createGammePersonnalisable();
			case ObjetPersonnalisablePackagePackage.OBJET: return createObjet();
			case ObjetPersonnalisablePackagePackage.CARACTERISTIQUE_VARIABLE: return createCaracteristiqueVariable();
			case ObjetPersonnalisablePackagePackage.ELEMENT_DE_PERSONNALISATION: return createElementDePersonnalisation();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GammePersonnalisable createGammePersonnalisable() {
		GammePersonnalisableImpl gammePersonnalisable = new GammePersonnalisableImpl();
		return gammePersonnalisable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Objet createObjet() {
		ObjetImpl objet = new ObjetImpl();
		return objet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CaracteristiqueVariable createCaracteristiqueVariable() {
		CaracteristiqueVariableImpl caracteristiqueVariable = new CaracteristiqueVariableImpl();
		return caracteristiqueVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElementDePersonnalisation createElementDePersonnalisation() {
		ElementDePersonnalisationImpl elementDePersonnalisation = new ElementDePersonnalisationImpl();
		return elementDePersonnalisation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjetPersonnalisablePackagePackage getObjetPersonnalisablePackagePackage() {
		return (ObjetPersonnalisablePackagePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ObjetPersonnalisablePackagePackage getPackage() {
		return ObjetPersonnalisablePackagePackage.eINSTANCE;
	}

} //ObjetPersonnalisablePackageFactoryImpl
