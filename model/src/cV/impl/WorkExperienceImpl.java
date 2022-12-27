/**
 */
package cV.impl;

import cV.CVPackage;
import cV.JobEntry;
import cV.WorkExperience;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Work Experience</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link cV.impl.WorkExperienceImpl#getJobEntries <em>Job Entries</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WorkExperienceImpl extends SectionImpl implements WorkExperience {
	/**
	 * The cached value of the '{@link #getJobEntries() <em>Job Entries</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJobEntries()
	 * @generated
	 * @ordered
	 */
	protected EList<JobEntry> jobEntries;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WorkExperienceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CVPackage.Literals.WORK_EXPERIENCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<JobEntry> getJobEntries() {
		if (jobEntries == null) {
			jobEntries = new EObjectContainmentEList<JobEntry>(JobEntry.class, this, CVPackage.WORK_EXPERIENCE__JOB_ENTRIES);
		}
		return jobEntries;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CVPackage.WORK_EXPERIENCE__JOB_ENTRIES:
				return ((InternalEList<?>)getJobEntries()).basicRemove(otherEnd, msgs);
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
			case CVPackage.WORK_EXPERIENCE__JOB_ENTRIES:
				return getJobEntries();
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
			case CVPackage.WORK_EXPERIENCE__JOB_ENTRIES:
				getJobEntries().clear();
				getJobEntries().addAll((Collection<? extends JobEntry>)newValue);
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
			case CVPackage.WORK_EXPERIENCE__JOB_ENTRIES:
				getJobEntries().clear();
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
			case CVPackage.WORK_EXPERIENCE__JOB_ENTRIES:
				return jobEntries != null && !jobEntries.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //WorkExperienceImpl
