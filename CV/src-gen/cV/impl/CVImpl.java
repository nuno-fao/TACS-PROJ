/**
 */
package cV.impl;

import cV.CV;
import cV.CVPackage;
import cV.CVTables;
import cV.Section;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.ocl.pivot.evaluation.Executor;

import org.eclipse.ocl.pivot.ids.IdResolver;
import org.eclipse.ocl.pivot.ids.TypeId;

import org.eclipse.ocl.pivot.library.classifier.ClassifierAllInstancesOperation;

import org.eclipse.ocl.pivot.library.collection.CollectionSizeOperation;

import org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation;

import org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation;
import org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation;

import org.eclipse.ocl.pivot.utilities.PivotUtil;
import org.eclipse.ocl.pivot.utilities.ValueUtil;

import org.eclipse.ocl.pivot.values.IntegerValue;
import org.eclipse.ocl.pivot.values.SetValue;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CV</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link cV.impl.CVImpl#getSections <em>Sections</em>}</li>
 *   <li>{@link cV.impl.CVImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CVImpl extends MinimalEObjectImpl.Container implements CV {
	/**
	 * The cached value of the '{@link #getSections() <em>Sections</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSections()
	 * @generated
	 * @ordered
	 */
	protected EList<Section> sections;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CVImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CVPackage.Literals.CV;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Section> getSections() {
		if (sections == null) {
			sections = new EObjectContainmentEList<Section>(Section.class, this, CVPackage.CV__SECTIONS);
		}
		return sections;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CVPackage.CV__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean obligatory_contacts_section(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "CV::obligatory_contacts_section";
		try {
			/**
			 *
			 * inv obligatory_contacts_section:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let result : Boolean[1] = Contacts.allInstances()->size() = 1
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this, context);
			final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor,
					CVPackage.Literals.CV___OBLIGATORY_CONTACTS_SECTION__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE
					.evaluate(executor, severity_0, CVTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean local_0;
			if (le) {
				local_0 = true;
			} else {
				final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_cV_c_c_Contacts = idResolver
						.getClass(CVTables.CLSSid_Contacts, null);
				final /*@NonInvalid*/ SetValue allInstances = ClassifierAllInstancesOperation.INSTANCE
						.evaluate(executor, CVTables.SET_CLSSid_Contacts, TYP_cV_c_c_Contacts);
				final /*@NonInvalid*/ IntegerValue size = CollectionSizeOperation.INSTANCE.evaluate(allInstances);
				final /*@NonInvalid*/ boolean result = size.equals(CVTables.INT_1);
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
	public boolean obligatory_personal_data_section(final DiagnosticChain diagnostics,
			final Map<Object, Object> context) {
		final String constraintName = "CV::obligatory_personal_data_section";
		try {
			/**
			 *
			 * inv obligatory_personal_data_section:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let result : Boolean[1] = PersonalData.allInstances()->size() = 1
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this, context);
			final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor,
					CVPackage.Literals.CV___OBLIGATORY_PERSONAL_DATA_SECTION__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE
					.evaluate(executor, severity_0, CVTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean local_0;
			if (le) {
				local_0 = true;
			} else {
				final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_cV_c_c_PersonalData = idResolver
						.getClass(CVTables.CLSSid_PersonalData, null);
				final /*@NonInvalid*/ SetValue allInstances = ClassifierAllInstancesOperation.INSTANCE
						.evaluate(executor, CVTables.SET_CLSSid_PersonalData, TYP_cV_c_c_PersonalData);
				final /*@NonInvalid*/ IntegerValue size = CollectionSizeOperation.INSTANCE.evaluate(allInstances);
				final /*@NonInvalid*/ boolean result = size.equals(CVTables.INT_1);
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
	public boolean at_most_one_education_section(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "CV::at_most_one_education_section";
		try {
			/**
			 *
			 * inv at_most_one_education_section:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let result : Boolean[1] = Education.allInstances()->size() <= 1
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this, context);
			final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor,
					CVPackage.Literals.CV___AT_MOST_ONE_EDUCATION_SECTION__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE
					.evaluate(executor, severity_0, CVTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean local_0;
			if (le) {
				local_0 = true;
			} else {
				final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_cV_c_c_Education = idResolver
						.getClass(CVTables.CLSSid_Education, null);
				final /*@NonInvalid*/ SetValue allInstances = ClassifierAllInstancesOperation.INSTANCE
						.evaluate(executor, CVTables.SET_CLSSid_Education, TYP_cV_c_c_Education);
				final /*@NonInvalid*/ IntegerValue size = CollectionSizeOperation.INSTANCE.evaluate(allInstances);
				final /*@NonInvalid*/ boolean result = OclComparableLessThanEqualOperation.INSTANCE
						.evaluate(executor, size, CVTables.INT_1).booleanValue();
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
	public boolean at_most_one_work_experience_section(final DiagnosticChain diagnostics,
			final Map<Object, Object> context) {
		final String constraintName = "CV::at_most_one_work_experience_section";
		try {
			/**
			 *
			 * inv at_most_one_work_experience_section:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let result : Boolean[1] = WorkExperience.allInstances()->size() <= 1
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this, context);
			final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor,
					CVPackage.Literals.CV___AT_MOST_ONE_WORK_EXPERIENCE_SECTION__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE
					.evaluate(executor, severity_0, CVTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean local_0;
			if (le) {
				local_0 = true;
			} else {
				final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_cV_c_c_WorkExperience = idResolver
						.getClass(CVTables.CLSSid_WorkExperience, null);
				final /*@NonInvalid*/ SetValue allInstances = ClassifierAllInstancesOperation.INSTANCE
						.evaluate(executor, CVTables.SET_CLSSid_WorkExperience, TYP_cV_c_c_WorkExperience);
				final /*@NonInvalid*/ IntegerValue size = CollectionSizeOperation.INSTANCE.evaluate(allInstances);
				final /*@NonInvalid*/ boolean result = OclComparableLessThanEqualOperation.INSTANCE
						.evaluate(executor, size, CVTables.INT_1).booleanValue();
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
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CVPackage.CV__SECTIONS:
			return ((InternalEList<?>) getSections()).basicRemove(otherEnd, msgs);
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
		case CVPackage.CV__SECTIONS:
			return getSections();
		case CVPackage.CV__NAME:
			return getName();
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
		case CVPackage.CV__SECTIONS:
			getSections().clear();
			getSections().addAll((Collection<? extends Section>) newValue);
			return;
		case CVPackage.CV__NAME:
			setName((String) newValue);
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
		case CVPackage.CV__SECTIONS:
			getSections().clear();
			return;
		case CVPackage.CV__NAME:
			setName(NAME_EDEFAULT);
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
		case CVPackage.CV__SECTIONS:
			return sections != null && !sections.isEmpty();
		case CVPackage.CV__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
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
		case CVPackage.CV___OBLIGATORY_CONTACTS_SECTION__DIAGNOSTICCHAIN_MAP:
			return obligatory_contacts_section((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
		case CVPackage.CV___OBLIGATORY_PERSONAL_DATA_SECTION__DIAGNOSTICCHAIN_MAP:
			return obligatory_personal_data_section((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
		case CVPackage.CV___AT_MOST_ONE_EDUCATION_SECTION__DIAGNOSTICCHAIN_MAP:
			return at_most_one_education_section((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
		case CVPackage.CV___AT_MOST_ONE_WORK_EXPERIENCE_SECTION__DIAGNOSTICCHAIN_MAP:
			return at_most_one_work_experience_section((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
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
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //CVImpl
