/**
 */
package cV.impl;

import cV.CVPackage;
import cV.Date;
import cV.EducationEntry;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Education Entry</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link cV.impl.EducationEntryImpl#getLevel <em>Level</em>}</li>
 *   <li>{@link cV.impl.EducationEntryImpl#getSchool <em>School</em>}</li>
 *   <li>{@link cV.impl.EducationEntryImpl#getDate <em>Date</em>}</li>
 *   <li>{@link cV.impl.EducationEntryImpl#getTitle <em>Title</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EducationEntryImpl extends ItemImpl implements EducationEntry {
	/**
	 * The default value of the '{@link #getLevel() <em>Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLevel()
	 * @generated
	 * @ordered
	 */
	protected static final String LEVEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLevel() <em>Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLevel()
	 * @generated
	 * @ordered
	 */
	protected String level = LEVEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getSchool() <em>School</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSchool()
	 * @generated
	 * @ordered
	 */
	protected static final String SCHOOL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSchool() <em>School</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSchool()
	 * @generated
	 * @ordered
	 */
	protected String school = SCHOOL_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDate() <em>Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDate()
	 * @generated
	 * @ordered
	 */
	protected Date date;

	/**
	 * The default value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected static final String TITLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected String title = TITLE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EducationEntryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CVPackage.Literals.EDUCATION_ENTRY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLevel() {
		return level;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLevel(String newLevel) {
		String oldLevel = level;
		level = newLevel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CVPackage.EDUCATION_ENTRY__LEVEL, oldLevel, level));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSchool() {
		return school;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSchool(String newSchool) {
		String oldSchool = school;
		school = newSchool;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CVPackage.EDUCATION_ENTRY__SCHOOL, oldSchool,
					school));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getDate() {
		return date;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDate(Date newDate, NotificationChain msgs) {
		Date oldDate = date;
		date = newDate;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CVPackage.EDUCATION_ENTRY__DATE, oldDate, newDate);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDate(Date newDate) {
		if (newDate != date) {
			NotificationChain msgs = null;
			if (date != null)
				msgs = ((InternalEObject) date).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CVPackage.EDUCATION_ENTRY__DATE, null, msgs);
			if (newDate != null)
				msgs = ((InternalEObject) newDate).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CVPackage.EDUCATION_ENTRY__DATE, null, msgs);
			msgs = basicSetDate(newDate, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CVPackage.EDUCATION_ENTRY__DATE, newDate, newDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTitle(String newTitle) {
		String oldTitle = title;
		title = newTitle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CVPackage.EDUCATION_ENTRY__TITLE, oldTitle, title));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CVPackage.EDUCATION_ENTRY__DATE:
			return basicSetDate(null, msgs);
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
		case CVPackage.EDUCATION_ENTRY__LEVEL:
			return getLevel();
		case CVPackage.EDUCATION_ENTRY__SCHOOL:
			return getSchool();
		case CVPackage.EDUCATION_ENTRY__DATE:
			return getDate();
		case CVPackage.EDUCATION_ENTRY__TITLE:
			return getTitle();
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
		case CVPackage.EDUCATION_ENTRY__LEVEL:
			setLevel((String) newValue);
			return;
		case CVPackage.EDUCATION_ENTRY__SCHOOL:
			setSchool((String) newValue);
			return;
		case CVPackage.EDUCATION_ENTRY__DATE:
			setDate((Date) newValue);
			return;
		case CVPackage.EDUCATION_ENTRY__TITLE:
			setTitle((String) newValue);
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
		case CVPackage.EDUCATION_ENTRY__LEVEL:
			setLevel(LEVEL_EDEFAULT);
			return;
		case CVPackage.EDUCATION_ENTRY__SCHOOL:
			setSchool(SCHOOL_EDEFAULT);
			return;
		case CVPackage.EDUCATION_ENTRY__DATE:
			setDate((Date) null);
			return;
		case CVPackage.EDUCATION_ENTRY__TITLE:
			setTitle(TITLE_EDEFAULT);
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
		case CVPackage.EDUCATION_ENTRY__LEVEL:
			return LEVEL_EDEFAULT == null ? level != null : !LEVEL_EDEFAULT.equals(level);
		case CVPackage.EDUCATION_ENTRY__SCHOOL:
			return SCHOOL_EDEFAULT == null ? school != null : !SCHOOL_EDEFAULT.equals(school);
		case CVPackage.EDUCATION_ENTRY__DATE:
			return date != null;
		case CVPackage.EDUCATION_ENTRY__TITLE:
			return TITLE_EDEFAULT == null ? title != null : !TITLE_EDEFAULT.equals(title);
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
		result.append(" (level: ");
		result.append(level);
		result.append(", school: ");
		result.append(school);
		result.append(", title: ");
		result.append(title);
		result.append(')');
		return result.toString();
	}

} //EducationEntryImpl
