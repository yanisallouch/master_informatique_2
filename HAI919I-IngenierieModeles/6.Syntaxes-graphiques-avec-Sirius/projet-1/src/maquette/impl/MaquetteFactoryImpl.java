/**
 */
package maquette.impl;

import maquette.*;

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
public class MaquetteFactoryImpl extends EFactoryImpl implements MaquetteFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static MaquetteFactory init() {
		try {
			MaquetteFactory theMaquetteFactory = (MaquetteFactory)EPackage.Registry.INSTANCE.getEFactory(MaquettePackage.eNS_URI);
			if (theMaquetteFactory != null) {
				return theMaquetteFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new MaquetteFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MaquetteFactoryImpl() {
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
			case MaquettePackage.FORMATION: return createFormation();
			case MaquettePackage.SEMESTRE: return createSemestre();
			case MaquettePackage.UE: return createUE();
			case MaquettePackage.COMPÉTENCE: return createCompétence();
			case MaquettePackage.FORMATIONS: return createFormations();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Formation createFormation() {
		FormationImpl formation = new FormationImpl();
		return formation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Semestre createSemestre() {
		SemestreImpl semestre = new SemestreImpl();
		return semestre;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UE createUE() {
		UEImpl ue = new UEImpl();
		return ue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Compétence createCompétence() {
		CompétenceImpl compétence = new CompétenceImpl();
		return compétence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Formations createFormations() {
		FormationsImpl formations = new FormationsImpl();
		return formations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MaquettePackage getMaquettePackage() {
		return (MaquettePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static MaquettePackage getPackage() {
		return MaquettePackage.eINSTANCE;
	}

} //MaquetteFactoryImpl
