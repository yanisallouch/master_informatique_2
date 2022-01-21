/**
 */
package maquette.impl;

import java.util.Collection;

import maquette.MaquettePackage;
import maquette.Semestre;
import maquette.UE;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Semestre</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link maquette.impl.SemestreImpl#getNbECTS <em>Nb ECTS</em>}</li>
 *   <li>{@link maquette.impl.SemestreImpl#getNumero <em>Numero</em>}</li>
 *   <li>{@link maquette.impl.SemestreImpl#getUes <em>Ues</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SemestreImpl extends MinimalEObjectImpl.Container implements Semestre {
	/**
	 * The default value of the '{@link #getNbECTS() <em>Nb ECTS</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNbECTS()
	 * @generated
	 * @ordered
	 */
	protected static final int NB_ECTS_EDEFAULT = 30;

	/**
	 * The cached value of the '{@link #getNbECTS() <em>Nb ECTS</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNbECTS()
	 * @generated
	 * @ordered
	 */
	protected int nbECTS = NB_ECTS_EDEFAULT;

	/**
	 * The default value of the '{@link #getNumero() <em>Numero</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumero()
	 * @generated
	 * @ordered
	 */
	protected static final int NUMERO_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNumero() <em>Numero</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumero()
	 * @generated
	 * @ordered
	 */
	protected int numero = NUMERO_EDEFAULT;

	/**
	 * The cached value of the '{@link #getUes() <em>Ues</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUes()
	 * @generated
	 * @ordered
	 */
	protected EList<UE> ues;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SemestreImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MaquettePackage.Literals.SEMESTRE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNbECTS() {
		return nbECTS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNumero() {
		return numero;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumero(int newNumero) {
		int oldNumero = numero;
		numero = newNumero;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MaquettePackage.SEMESTRE__NUMERO, oldNumero, numero));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<UE> getUes() {
		if (ues == null) {
			ues = new EObjectResolvingEList<UE>(UE.class, this, MaquettePackage.SEMESTRE__UES);
		}
		return ues;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MaquettePackage.SEMESTRE__NB_ECTS:
				return getNbECTS();
			case MaquettePackage.SEMESTRE__NUMERO:
				return getNumero();
			case MaquettePackage.SEMESTRE__UES:
				return getUes();
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
			case MaquettePackage.SEMESTRE__NUMERO:
				setNumero((Integer)newValue);
				return;
			case MaquettePackage.SEMESTRE__UES:
				getUes().clear();
				getUes().addAll((Collection<? extends UE>)newValue);
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
			case MaquettePackage.SEMESTRE__NUMERO:
				setNumero(NUMERO_EDEFAULT);
				return;
			case MaquettePackage.SEMESTRE__UES:
				getUes().clear();
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
			case MaquettePackage.SEMESTRE__NB_ECTS:
				return nbECTS != NB_ECTS_EDEFAULT;
			case MaquettePackage.SEMESTRE__NUMERO:
				return numero != NUMERO_EDEFAULT;
			case MaquettePackage.SEMESTRE__UES:
				return ues != null && !ues.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (nbECTS: ");
		result.append(nbECTS);
		result.append(", numero: ");
		result.append(numero);
		result.append(')');
		return result.toString();
	}

} //SemestreImpl
