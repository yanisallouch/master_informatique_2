/**
 */
package maquette.impl;

import java.util.Collection;

import maquette.Comp�tence;
import maquette.Formation;
import maquette.MaquettePackage;
import maquette.Semestre;
import maquette.UE;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Formation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link maquette.impl.FormationImpl#getNbSemestres <em>Nb Semestres</em>}</li>
 *   <li>{@link maquette.impl.FormationImpl#getSemestres <em>Semestres</em>}</li>
 *   <li>{@link maquette.impl.FormationImpl#getComp�tencesEnseign�es <em>Comp�tences Enseign�es</em>}</li>
 *   <li>{@link maquette.impl.FormationImpl#getNom <em>Nom</em>}</li>
 *   <li>{@link maquette.impl.FormationImpl#getUesPotentielles <em>Ues Potentielles</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FormationImpl extends MinimalEObjectImpl.Container implements Formation {
	/**
	 * The default value of the '{@link #getNbSemestres() <em>Nb Semestres</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNbSemestres()
	 * @generated
	 * @ordered
	 */
	protected static final int NB_SEMESTRES_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNbSemestres() <em>Nb Semestres</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNbSemestres()
	 * @generated
	 * @ordered
	 */
	protected int nbSemestres = NB_SEMESTRES_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSemestres() <em>Semestres</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSemestres()
	 * @generated
	 * @ordered
	 */
	protected EList<Semestre> semestres;

	/**
	 * The cached value of the '{@link #getComp�tencesEnseign�es() <em>Comp�tences Enseign�es</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComp�tencesEnseign�es()
	 * @generated
	 * @ordered
	 */
	protected EList<Comp�tence> comp�tencesEnseign�es;

	/**
	 * The default value of the '{@link #getNom() <em>Nom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNom()
	 * @generated
	 * @ordered
	 */
	protected static final String NOM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNom() <em>Nom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNom()
	 * @generated
	 * @ordered
	 */
	protected String nom = NOM_EDEFAULT;

	/**
	 * The cached value of the '{@link #getUesPotentielles() <em>Ues Potentielles</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUesPotentielles()
	 * @generated
	 * @ordered
	 */
	protected EList<UE> uesPotentielles;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FormationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MaquettePackage.Literals.FORMATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNbSemestres() {
		return nbSemestres;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNbSemestres(int newNbSemestres) {
		int oldNbSemestres = nbSemestres;
		nbSemestres = newNbSemestres;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MaquettePackage.FORMATION__NB_SEMESTRES, oldNbSemestres, nbSemestres));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Semestre> getSemestres() {
		if (semestres == null) {
			semestres = new EObjectContainmentEList<Semestre>(Semestre.class, this, MaquettePackage.FORMATION__SEMESTRES);
		}
		return semestres;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Comp�tence> getComp�tencesEnseign�es() {
		if (comp�tencesEnseign�es == null) {
			comp�tencesEnseign�es = new EObjectContainmentEList<Comp�tence>(Comp�tence.class, this, MaquettePackage.FORMATION__COMP�TENCES_ENSEIGN�ES);
		}
		return comp�tencesEnseign�es;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNom(String newNom) {
		String oldNom = nom;
		nom = newNom;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MaquettePackage.FORMATION__NOM, oldNom, nom));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<UE> getUesPotentielles() {
		if (uesPotentielles == null) {
			uesPotentielles = new EObjectContainmentEList<UE>(UE.class, this, MaquettePackage.FORMATION__UES_POTENTIELLES);
		}
		return uesPotentielles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MaquettePackage.FORMATION__SEMESTRES:
				return ((InternalEList<?>)getSemestres()).basicRemove(otherEnd, msgs);
			case MaquettePackage.FORMATION__COMP�TENCES_ENSEIGN�ES:
				return ((InternalEList<?>)getComp�tencesEnseign�es()).basicRemove(otherEnd, msgs);
			case MaquettePackage.FORMATION__UES_POTENTIELLES:
				return ((InternalEList<?>)getUesPotentielles()).basicRemove(otherEnd, msgs);
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
			case MaquettePackage.FORMATION__NB_SEMESTRES:
				return getNbSemestres();
			case MaquettePackage.FORMATION__SEMESTRES:
				return getSemestres();
			case MaquettePackage.FORMATION__COMP�TENCES_ENSEIGN�ES:
				return getComp�tencesEnseign�es();
			case MaquettePackage.FORMATION__NOM:
				return getNom();
			case MaquettePackage.FORMATION__UES_POTENTIELLES:
				return getUesPotentielles();
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
			case MaquettePackage.FORMATION__NB_SEMESTRES:
				setNbSemestres((Integer)newValue);
				return;
			case MaquettePackage.FORMATION__SEMESTRES:
				getSemestres().clear();
				getSemestres().addAll((Collection<? extends Semestre>)newValue);
				return;
			case MaquettePackage.FORMATION__COMP�TENCES_ENSEIGN�ES:
				getComp�tencesEnseign�es().clear();
				getComp�tencesEnseign�es().addAll((Collection<? extends Comp�tence>)newValue);
				return;
			case MaquettePackage.FORMATION__NOM:
				setNom((String)newValue);
				return;
			case MaquettePackage.FORMATION__UES_POTENTIELLES:
				getUesPotentielles().clear();
				getUesPotentielles().addAll((Collection<? extends UE>)newValue);
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
			case MaquettePackage.FORMATION__NB_SEMESTRES:
				setNbSemestres(NB_SEMESTRES_EDEFAULT);
				return;
			case MaquettePackage.FORMATION__SEMESTRES:
				getSemestres().clear();
				return;
			case MaquettePackage.FORMATION__COMP�TENCES_ENSEIGN�ES:
				getComp�tencesEnseign�es().clear();
				return;
			case MaquettePackage.FORMATION__NOM:
				setNom(NOM_EDEFAULT);
				return;
			case MaquettePackage.FORMATION__UES_POTENTIELLES:
				getUesPotentielles().clear();
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
			case MaquettePackage.FORMATION__NB_SEMESTRES:
				return nbSemestres != NB_SEMESTRES_EDEFAULT;
			case MaquettePackage.FORMATION__SEMESTRES:
				return semestres != null && !semestres.isEmpty();
			case MaquettePackage.FORMATION__COMP�TENCES_ENSEIGN�ES:
				return comp�tencesEnseign�es != null && !comp�tencesEnseign�es.isEmpty();
			case MaquettePackage.FORMATION__NOM:
				return NOM_EDEFAULT == null ? nom != null : !NOM_EDEFAULT.equals(nom);
			case MaquettePackage.FORMATION__UES_POTENTIELLES:
				return uesPotentielles != null && !uesPotentielles.isEmpty();
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
		result.append(" (nbSemestres: ");
		result.append(nbSemestres);
		result.append(", nom: ");
		result.append(nom);
		result.append(')');
		return result.toString();
	}

} //FormationImpl
