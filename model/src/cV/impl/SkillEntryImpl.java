/**
 */
package cV.impl;

import cV.CVPackage;
import cV.SkillEntry;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Skill Entry</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link cV.impl.SkillEntryImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link cV.impl.SkillEntryImpl#getSkillValue <em>Skill Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SkillEntryImpl extends ItemImpl implements SkillEntry {
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
	 * The default value of the '{@link #getSkillValue() <em>Skill Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSkillValue()
	 * @generated
	 * @ordered
	 */
	protected static final int SKILL_VALUE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getSkillValue() <em>Skill Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSkillValue()
	 * @generated
	 * @ordered
	 */
	protected int skillValue = SKILL_VALUE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SkillEntryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CVPackage.Literals.SKILL_ENTRY;
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
			eNotify(new ENotificationImpl(this, Notification.SET, CVPackage.SKILL_ENTRY__TITLE, oldTitle, title));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getSkillValue() {
		return skillValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSkillValue(int newSkillValue) {
		int oldSkillValue = skillValue;
		skillValue = newSkillValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CVPackage.SKILL_ENTRY__SKILL_VALUE, oldSkillValue, skillValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CVPackage.SKILL_ENTRY__TITLE:
				return getTitle();
			case CVPackage.SKILL_ENTRY__SKILL_VALUE:
				return getSkillValue();
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
			case CVPackage.SKILL_ENTRY__TITLE:
				setTitle((String)newValue);
				return;
			case CVPackage.SKILL_ENTRY__SKILL_VALUE:
				setSkillValue((Integer)newValue);
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
			case CVPackage.SKILL_ENTRY__TITLE:
				setTitle(TITLE_EDEFAULT);
				return;
			case CVPackage.SKILL_ENTRY__SKILL_VALUE:
				setSkillValue(SKILL_VALUE_EDEFAULT);
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
			case CVPackage.SKILL_ENTRY__TITLE:
				return TITLE_EDEFAULT == null ? title != null : !TITLE_EDEFAULT.equals(title);
			case CVPackage.SKILL_ENTRY__SKILL_VALUE:
				return skillValue != SKILL_VALUE_EDEFAULT;
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
		result.append(" (title: ");
		result.append(title);
		result.append(", skillValue: ");
		result.append(skillValue);
		result.append(')');
		return result.toString();
	}

} //SkillEntryImpl
