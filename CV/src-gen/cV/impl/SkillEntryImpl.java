/**
 */
package cV.impl;

import cV.CVPackage;
import cV.CVTables;
import cV.SkillEntry;

import java.lang.reflect.InvocationTargetException;

import java.util.Map;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.ocl.pivot.evaluation.Executor;

import org.eclipse.ocl.pivot.ids.TypeId;

import org.eclipse.ocl.pivot.library.oclany.OclComparableGreaterThanEqualOperation;
import org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation;

import org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation;
import org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation;

import org.eclipse.ocl.pivot.utilities.PivotUtil;
import org.eclipse.ocl.pivot.utilities.ValueUtil;

import org.eclipse.ocl.pivot.values.IntegerValue;

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
			eNotify(new ENotificationImpl(this, Notification.SET, CVPackage.SKILL_ENTRY__SKILL_VALUE, oldSkillValue,
					skillValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean limit_value(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "SkillEntry::limit_value";
		try {
			/**
			 *
			 * inv limit_value:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let result : Boolean[?] = self.skillValue >= 1 and self.skillValue <= 5
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this, context);
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor,
					CVPackage.Literals.SKILL_ENTRY___LIMIT_VALUE__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE
					.evaluate(executor, severity_0, CVTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean local_0;
			if (le) {
				local_0 = true;
			} else {
				final /*@NonInvalid*/ int skillValue_0 = this.getSkillValue();
				final /*@NonInvalid*/ IntegerValue BOXED_skillValue_0 = ValueUtil.integerValueOf(skillValue_0);
				final /*@NonInvalid*/ boolean ge = OclComparableGreaterThanEqualOperation.INSTANCE
						.evaluate(executor, BOXED_skillValue_0, CVTables.INT_1).booleanValue();
				final /*@NonInvalid*/ Boolean result;
				if (!ge) {
					result = ValueUtil.FALSE_VALUE;
				} else {
					final /*@NonInvalid*/ boolean le_0 = OclComparableLessThanEqualOperation.INSTANCE
							.evaluate(executor, BOXED_skillValue_0, CVTables.INT_5).booleanValue();
					if (!le_0) {
						result = ValueUtil.FALSE_VALUE;
					} else {
						result = ValueUtil.TRUE_VALUE;
					}
				}
				final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE
						.evaluate(executor, TypeId.BOOLEAN, constraintName, this, (Object) null, diagnostics, context,
								(Object) null, severity_0, result, CVTables.INT_0)
						.booleanValue();
				local_0 = logDiagnostic;
			}
			return local_0;
		} catch (Throwable e) {
			return ValueUtil.validationFailedDiagnostic(constraintName, this, diagnostics, context, e);
		}
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
			setTitle((String) newValue);
			return;
		case CVPackage.SKILL_ENTRY__SKILL_VALUE:
			setSkillValue((Integer) newValue);
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
	@SuppressWarnings("unchecked")
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
		case CVPackage.SKILL_ENTRY___LIMIT_VALUE__DIAGNOSTICCHAIN_MAP:
			return limit_value((DiagnosticChain) arguments.get(0), (Map<Object, Object>) arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
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
		result.append(" (title: ");
		result.append(title);
		result.append(", skillValue: ");
		result.append(skillValue);
		result.append(')');
		return result.toString();
	}

} //SkillEntryImpl
