/**
 */
package cV.impl;

import cV.CVPackage;
import cV.Education;
import cV.EducationEntry;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Education</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link cV.impl.EducationImpl#getEducationEntries <em>Education Entries</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EducationImpl extends SectionImpl implements Education {
	/**
	 * The cached value of the '{@link #getEducationEntries() <em>Education Entries</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEducationEntries()
	 * @generated
	 * @ordered
	 */
	protected EList<EducationEntry> educationEntries;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EducationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CVPackage.Literals.EDUCATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EducationEntry> getEducationEntries() {
		if (educationEntries == null) {
			educationEntries = new EObjectContainmentEList<EducationEntry>(EducationEntry.class, this,
					CVPackage.EDUCATION__EDUCATION_ENTRIES);
		}
		return educationEntries;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CVPackage.EDUCATION__EDUCATION_ENTRIES:
			return ((InternalEList<?>) getEducationEntries()).basicRemove(otherEnd, msgs);
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
		case CVPackage.EDUCATION__EDUCATION_ENTRIES:
			return getEducationEntries();
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
		case CVPackage.EDUCATION__EDUCATION_ENTRIES:
			getEducationEntries().clear();
			getEducationEntries().addAll((Collection<? extends EducationEntry>) newValue);
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
		case CVPackage.EDUCATION__EDUCATION_ENTRIES:
			getEducationEntries().clear();
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
		case CVPackage.EDUCATION__EDUCATION_ENTRIES:
			return educationEntries != null && !educationEntries.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //EducationImpl
