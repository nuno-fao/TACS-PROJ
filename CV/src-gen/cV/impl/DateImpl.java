/**
 */
package cV.impl;

import cV.CVPackage;
import cV.Date;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Date</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link cV.impl.DateImpl#getStart_date <em>Start date</em>}</li>
 *   <li>{@link cV.impl.DateImpl#getEnding_date <em>Ending date</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DateImpl extends ItemImpl implements Date {
	/**
	 * The default value of the '{@link #getStart_date() <em>Start date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStart_date()
	 * @generated
	 * @ordered
	 */
	protected static final java.util.Date START_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStart_date() <em>Start date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStart_date()
	 * @generated
	 * @ordered
	 */
	protected java.util.Date start_date = START_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getEnding_date() <em>Ending date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnding_date()
	 * @generated
	 * @ordered
	 */
	protected static final java.util.Date ENDING_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEnding_date() <em>Ending date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnding_date()
	 * @generated
	 * @ordered
	 */
	protected java.util.Date ending_date = ENDING_DATE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CVPackage.Literals.DATE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public java.util.Date getStart_date() {
		return start_date;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStart_date(java.util.Date newStart_date) {
		java.util.Date oldStart_date = start_date;
		start_date = newStart_date;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CVPackage.DATE__START_DATE, oldStart_date,
					start_date));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public java.util.Date getEnding_date() {
		return ending_date;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnding_date(java.util.Date newEnding_date) {
		java.util.Date oldEnding_date = ending_date;
		ending_date = newEnding_date;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CVPackage.DATE__ENDING_DATE, oldEnding_date,
					ending_date));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case CVPackage.DATE__START_DATE:
			return getStart_date();
		case CVPackage.DATE__ENDING_DATE:
			return getEnding_date();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case CVPackage.DATE__START_DATE:
			setStart_date((java.util.Date) newValue);
			return;
		case CVPackage.DATE__ENDING_DATE:
			setEnding_date((java.util.Date) newValue);
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
		case CVPackage.DATE__START_DATE:
			setStart_date(START_DATE_EDEFAULT);
			return;
		case CVPackage.DATE__ENDING_DATE:
			setEnding_date(ENDING_DATE_EDEFAULT);
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
		case CVPackage.DATE__START_DATE:
			return START_DATE_EDEFAULT == null ? start_date != null : !START_DATE_EDEFAULT.equals(start_date);
		case CVPackage.DATE__ENDING_DATE:
			return ENDING_DATE_EDEFAULT == null ? ending_date != null : !ENDING_DATE_EDEFAULT.equals(ending_date);
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
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (start_date: ");
		result.append(start_date);
		result.append(", ending_date: ");
		result.append(ending_date);
		result.append(')');
		return result.toString();
	}

} //DateImpl
