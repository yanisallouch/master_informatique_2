/**
 */
package objetPersonnalisablePackage.impl;

import java.util.Collection;

import objetPersonnalisablePackage.CaracteristiqueVariable;
import objetPersonnalisablePackage.ElementDePersonnalisation;
import objetPersonnalisablePackage.GammePersonnalisable;
import objetPersonnalisablePackage.Objet;
import objetPersonnalisablePackage.ObjetPersonnalisablePackagePackage;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Gamme Personnalisable</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link objetPersonnalisablePackage.impl.GammePersonnalisableImpl#getObjets <em>Objets</em>}</li>
 *   <li>{@link objetPersonnalisablePackage.impl.GammePersonnalisableImpl#getElementsdepersonnalisation <em>Elementsdepersonnalisation</em>}</li>
 *   <li>{@link objetPersonnalisablePackage.impl.GammePersonnalisableImpl#getElementsvariables <em>Elementsvariables</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GammePersonnalisableImpl extends MinimalEObjectImpl.Container implements GammePersonnalisable {
	/**
	 * The cached value of the '{@link #getObjets() <em>Objets</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObjets()
	 * @generated
	 * @ordered
	 */
	protected EList<Objet> objets;

	/**
	 * The cached value of the '{@link #getElementsdepersonnalisation() <em>Elementsdepersonnalisation</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElementsdepersonnalisation()
	 * @generated
	 * @ordered
	 */
	protected EList<ElementDePersonnalisation> elementsdepersonnalisation;

	/**
	 * The cached value of the '{@link #getElementsvariables() <em>Elementsvariables</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElementsvariables()
	 * @generated
	 * @ordered
	 */
	protected EList<CaracteristiqueVariable> elementsvariables;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GammePersonnalisableImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ObjetPersonnalisablePackagePackage.Literals.GAMME_PERSONNALISABLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Objet> getObjets() {
		if (objets == null) {
			objets = new EObjectContainmentEList<Objet>(Objet.class, this, ObjetPersonnalisablePackagePackage.GAMME_PERSONNALISABLE__OBJETS);
		}
		return objets;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ElementDePersonnalisation> getElementsdepersonnalisation() {
		if (elementsdepersonnalisation == null) {
			elementsdepersonnalisation = new EObjectContainmentEList<ElementDePersonnalisation>(ElementDePersonnalisation.class, this, ObjetPersonnalisablePackagePackage.GAMME_PERSONNALISABLE__ELEMENTSDEPERSONNALISATION);
		}
		return elementsdepersonnalisation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CaracteristiqueVariable> getElementsvariables() {
		if (elementsvariables == null) {
			elementsvariables = new EObjectContainmentEList<CaracteristiqueVariable>(CaracteristiqueVariable.class, this, ObjetPersonnalisablePackagePackage.GAMME_PERSONNALISABLE__ELEMENTSVARIABLES);
		}
		return elementsvariables;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ObjetPersonnalisablePackagePackage.GAMME_PERSONNALISABLE__OBJETS:
				return ((InternalEList<?>)getObjets()).basicRemove(otherEnd, msgs);
			case ObjetPersonnalisablePackagePackage.GAMME_PERSONNALISABLE__ELEMENTSDEPERSONNALISATION:
				return ((InternalEList<?>)getElementsdepersonnalisation()).basicRemove(otherEnd, msgs);
			case ObjetPersonnalisablePackagePackage.GAMME_PERSONNALISABLE__ELEMENTSVARIABLES:
				return ((InternalEList<?>)getElementsvariables()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ObjetPersonnalisablePackagePackage.GAMME_PERSONNALISABLE__OBJETS:
				return getObjets();
			case ObjetPersonnalisablePackagePackage.GAMME_PERSONNALISABLE__ELEMENTSDEPERSONNALISATION:
				return getElementsdepersonnalisation();
			case ObjetPersonnalisablePackagePackage.GAMME_PERSONNALISABLE__ELEMENTSVARIABLES:
				return getElementsvariables();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ObjetPersonnalisablePackagePackage.GAMME_PERSONNALISABLE__OBJETS:
				getObjets().clear();
				getObjets().addAll((Collection<? extends Objet>)newValue);
				return;
			case ObjetPersonnalisablePackagePackage.GAMME_PERSONNALISABLE__ELEMENTSDEPERSONNALISATION:
				getElementsdepersonnalisation().clear();
				getElementsdepersonnalisation().addAll((Collection<? extends ElementDePersonnalisation>)newValue);
				return;
			case ObjetPersonnalisablePackagePackage.GAMME_PERSONNALISABLE__ELEMENTSVARIABLES:
				getElementsvariables().clear();
				getElementsvariables().addAll((Collection<? extends CaracteristiqueVariable>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ObjetPersonnalisablePackagePackage.GAMME_PERSONNALISABLE__OBJETS:
				getObjets().clear();
				return;
			case ObjetPersonnalisablePackagePackage.GAMME_PERSONNALISABLE__ELEMENTSDEPERSONNALISATION:
				getElementsdepersonnalisation().clear();
				return;
			case ObjetPersonnalisablePackagePackage.GAMME_PERSONNALISABLE__ELEMENTSVARIABLES:
				getElementsvariables().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ObjetPersonnalisablePackagePackage.GAMME_PERSONNALISABLE__OBJETS:
				return objets != null && !objets.isEmpty();
			case ObjetPersonnalisablePackagePackage.GAMME_PERSONNALISABLE__ELEMENTSDEPERSONNALISATION:
				return elementsdepersonnalisation != null && !elementsdepersonnalisation.isEmpty();
			case ObjetPersonnalisablePackagePackage.GAMME_PERSONNALISABLE__ELEMENTSVARIABLES:
				return elementsvariables != null && !elementsvariables.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //GammePersonnalisableImpl
