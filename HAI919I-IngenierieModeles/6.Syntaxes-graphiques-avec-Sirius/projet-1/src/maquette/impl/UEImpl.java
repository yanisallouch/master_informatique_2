/**
 */
package maquette.impl;

import java.util.Collection;

import maquette.Compétence;
import maquette.MaquettePackage;
import maquette.UE;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>UE</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link maquette.impl.UEImpl#getNbECTS <em>Nb ECTS</em>}</li>
 *   <li>{@link maquette.impl.UEImpl#getCompétence <em>Compétence</em>}</li>
 *   <li>{@link maquette.impl.UEImpl#getNom <em>Nom</em>}</li>
 *   <li>{@link maquette.impl.UEImpl#isDisciplinaire <em>Disciplinaire</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UEImpl extends MinimalEObjectImpl.Container implements UE {
	/**
	 * The default value of the '{@link #getNbECTS() <em>Nb ECTS</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNbECTS()
	 * @generated
	 * @ordered
	 */
	protected static final int NB_ECTS_EDEFAULT = 0;

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
	 * The cached value of the '{@link #getCompétence() <em>Compétence</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompétence()
	 * @generated
	 * @ordered
	 */
	protected EList<Compétence> compétence;

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
	 * The default value of the '{@link #isDisciplinaire() <em>Disciplinaire</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDisciplinaire()
	 * @generated
	 * @ordered
	 */
	protected static final boolean DISCIPLINAIRE_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isDisciplinaire() <em>Disciplinaire</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDisciplinaire()
	 * @generated
	 * @ordered
	 */
	protected boolean disciplinaire = DISCIPLINAIRE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UEImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MaquettePackage.Literals.UE;
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
	public void setNbECTS(int newNbECTS) {
		int oldNbECTS = nbECTS;
		nbECTS = newNbECTS;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MaquettePackage.UE__NB_ECTS, oldNbECTS, nbECTS));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Compétence> getCompétence() {
		if (compétence == null) {
			compétence = new EObjectWithInverseResolvingEList.ManyInverse<Compétence>(Compétence.class, this, MaquettePackage.UE__COMPÉTENCE, MaquettePackage.COMPÉTENCE__UES);
		}
		return compétence;
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
			eNotify(new ENotificationImpl(this, Notification.SET, MaquettePackage.UE__NOM, oldNom, nom));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isDisciplinaire() {
		return disciplinaire;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDisciplinaire(boolean newDisciplinaire) {
		boolean oldDisciplinaire = disciplinaire;
		disciplinaire = newDisciplinaire;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MaquettePackage.UE__DISCIPLINAIRE, oldDisciplinaire, disciplinaire));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MaquettePackage.UE__COMPÉTENCE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getCompétence()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MaquettePackage.UE__COMPÉTENCE:
				return ((InternalEList<?>)getCompétence()).basicRemove(otherEnd, msgs);
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
			case MaquettePackage.UE__NB_ECTS:
				return getNbECTS();
			case MaquettePackage.UE__COMPÉTENCE:
				return getCompétence();
			case MaquettePackage.UE__NOM:
				return getNom();
			case MaquettePackage.UE__DISCIPLINAIRE:
				return isDisciplinaire();
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
			case MaquettePackage.UE__NB_ECTS:
				setNbECTS((Integer)newValue);
				return;
			case MaquettePackage.UE__COMPÉTENCE:
				getCompétence().clear();
				getCompétence().addAll((Collection<? extends Compétence>)newValue);
				return;
			case MaquettePackage.UE__NOM:
				setNom((String)newValue);
				return;
			case MaquettePackage.UE__DISCIPLINAIRE:
				setDisciplinaire((Boolean)newValue);
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
			case MaquettePackage.UE__NB_ECTS:
				setNbECTS(NB_ECTS_EDEFAULT);
				return;
			case MaquettePackage.UE__COMPÉTENCE:
				getCompétence().clear();
				return;
			case MaquettePackage.UE__NOM:
				setNom(NOM_EDEFAULT);
				return;
			case MaquettePackage.UE__DISCIPLINAIRE:
				setDisciplinaire(DISCIPLINAIRE_EDEFAULT);
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
			case MaquettePackage.UE__NB_ECTS:
				return nbECTS != NB_ECTS_EDEFAULT;
			case MaquettePackage.UE__COMPÉTENCE:
				return compétence != null && !compétence.isEmpty();
			case MaquettePackage.UE__NOM:
				return NOM_EDEFAULT == null ? nom != null : !NOM_EDEFAULT.equals(nom);
			case MaquettePackage.UE__DISCIPLINAIRE:
				return disciplinaire != DISCIPLINAIRE_EDEFAULT;
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
		result.append(", nom: ");
		result.append(nom);
		result.append(", disciplinaire: ");
		result.append(disciplinaire);
		result.append(')');
		return result.toString();
	}

} //UEImpl
