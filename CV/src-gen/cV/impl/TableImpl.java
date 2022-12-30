/**
 */
package cV.impl;

import cV.CVPackage;
import cV.CVTables;
import cV.Field;
import cV.Item;
import cV.Table;
import cV.TableRow;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.ocl.pivot.evaluation.Executor;
import org.eclipse.ocl.pivot.ids.IdResolver;
import org.eclipse.ocl.pivot.ids.TypeId;
import org.eclipse.ocl.pivot.library.collection.CollectionSizeOperation;
import org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation;
import org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation;
import org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation;
import org.eclipse.ocl.pivot.messages.PivotMessages;
import org.eclipse.ocl.pivot.utilities.PivotUtil;
import org.eclipse.ocl.pivot.utilities.ValueUtil;
import org.eclipse.ocl.pivot.values.IntegerValue;
import org.eclipse.ocl.pivot.values.InvalidValueException;
import org.eclipse.ocl.pivot.values.OrderedSetValue;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Table</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link cV.impl.TableImpl#getHeader <em>Header</em>}</li>
 *   <li>{@link cV.impl.TableImpl#getField <em>Field</em>}</li>
 *   <li>{@link cV.impl.TableImpl#getRows <em>Rows</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TableImpl extends MinimalEObjectImpl.Container implements Table {
	/**
	 * The cached value of the '{@link #getHeader() <em>Header</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeader()
	 * @generated
	 * @ordered
	 */
	protected EList<String> header;

	/**
	 * The cached value of the '{@link #getField() <em>Field</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getField()
	 * @generated
	 * @ordered
	 */
	protected Field field;

	/**
	 * The cached value of the '{@link #getRows() <em>Rows</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRows()
	 * @generated
	 * @ordered
	 */
	protected EList<TableRow> rows;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TableImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CVPackage.Literals.TABLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getHeader() {
		if (header == null) {
			header = new EDataTypeUniqueEList<String>(String.class, this, CVPackage.TABLE__HEADER);
		}
		return header;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Field getField() {
		return field;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetField(Field newField, NotificationChain msgs) {
		Field oldField = field;
		field = newField;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CVPackage.TABLE__FIELD,
					oldField, newField);
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
	public void setField(Field newField) {
		if (newField != field) {
			NotificationChain msgs = null;
			if (field != null)
				msgs = ((InternalEObject) field).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CVPackage.TABLE__FIELD,
						null, msgs);
			if (newField != null)
				msgs = ((InternalEObject) newField).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CVPackage.TABLE__FIELD,
						null, msgs);
			msgs = basicSetField(newField, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CVPackage.TABLE__FIELD, newField, newField));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TableRow> getRows() {
		if (rows == null) {
			rows = new EObjectContainmentEList<TableRow>(TableRow.class, this, CVPackage.TABLE__ROWS);
		}
		return rows;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean rows_same_length_as_header(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "Table::rows_same_length_as_header";
		try {
			/**
			 *
			 * inv rows_same_length_as_header:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let
			 *         result : Boolean[?] = self.header->size() = 1 implies
			 *         self.rows->forAll(r | r.items->size() = self.header->size())
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this, context);
			final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor,
					CVPackage.Literals.TABLE___ROWS_SAME_LENGTH_AS_HEADER__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE
					.evaluate(executor, severity_0, CVTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean local_0;
			if (le) {
				local_0 = true;
			} else {
				/*@Caught*/ Object CAUGHT_result;
				try {
					final /*@NonInvalid*/ List<String> header = this.getHeader();
					final /*@NonInvalid*/ OrderedSetValue BOXED_header = idResolver
							.createOrderedSetOfAll(CVTables.ORD_PRIMid_String, header);
					final /*@NonInvalid*/ IntegerValue size = CollectionSizeOperation.INSTANCE.evaluate(BOXED_header);
					final /*@NonInvalid*/ boolean eq = size.equals(CVTables.INT_1);
					final /*@Thrown*/ Boolean result;
					if (!eq) {
						result = ValueUtil.TRUE_VALUE;
					} else {
						final /*@NonInvalid*/ List<TableRow> rows = this.getRows();
						final /*@NonInvalid*/ OrderedSetValue BOXED_rows = idResolver
								.createOrderedSetOfAll(CVTables.ORD_CLSSid_TableRow, rows);
						/*@Thrown*/ Object accumulator = ValueUtil.TRUE_VALUE;
						Iterator<Object> ITERATOR_r = BOXED_rows.iterator();
						/*@NonInvalid*/ Boolean forAll;
						while (true) {
							if (!ITERATOR_r.hasNext()) {
								if (accumulator == ValueUtil.TRUE_VALUE) {
									forAll = ValueUtil.TRUE_VALUE;
								} else {
									throw (InvalidValueException) accumulator;
								}
								break;
							}
							/*@NonInvalid*/ TableRow r = (TableRow) ITERATOR_r.next();
							/**
							 * r.items->size() = self.header->size()
							 */
							final /*@NonInvalid*/ List<Item> items = r.getItems();
							final /*@NonInvalid*/ OrderedSetValue BOXED_items = idResolver
									.createOrderedSetOfAll(CVTables.ORD_CLSSid_Item, items);
							final /*@NonInvalid*/ IntegerValue size_0 = CollectionSizeOperation.INSTANCE
									.evaluate(BOXED_items);
							final /*@NonInvalid*/ boolean eq_0 = size_0.equals(size);
							//
							if (!eq_0) { // Normal unsuccessful body evaluation result
								forAll = ValueUtil.FALSE_VALUE;
								break; // Stop immediately
							} else if (eq_0) { // Normal successful body evaluation result
								; // Carry on
							} else { // Impossible badly typed result
								accumulator = new InvalidValueException(PivotMessages.NonBooleanBody, "forAll");
							}
						}
						if (forAll == ValueUtil.TRUE_VALUE) {
							result = ValueUtil.TRUE_VALUE;
						} else {
							if (forAll == null) {
								result = null;
							} else {
								result = ValueUtil.FALSE_VALUE;
							}
						}
					}
					CAUGHT_result = result;
				} catch (Exception e) {
					CAUGHT_result = ValueUtil.createInvalidValue(e);
				}
				final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE
						.evaluate(executor, TypeId.BOOLEAN, constraintName, this, (Object) null, diagnostics, context,
								(Object) null, severity_0, CAUGHT_result, CVTables.INT_0)
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
		case CVPackage.TABLE__FIELD:
			return basicSetField(null, msgs);
		case CVPackage.TABLE__ROWS:
			return ((InternalEList<?>) getRows()).basicRemove(otherEnd, msgs);
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
		case CVPackage.TABLE__HEADER:
			return getHeader();
		case CVPackage.TABLE__FIELD:
			return getField();
		case CVPackage.TABLE__ROWS:
			return getRows();
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
		case CVPackage.TABLE__HEADER:
			getHeader().clear();
			getHeader().addAll((Collection<? extends String>) newValue);
			return;
		case CVPackage.TABLE__FIELD:
			setField((Field) newValue);
			return;
		case CVPackage.TABLE__ROWS:
			getRows().clear();
			getRows().addAll((Collection<? extends TableRow>) newValue);
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
		case CVPackage.TABLE__HEADER:
			getHeader().clear();
			return;
		case CVPackage.TABLE__FIELD:
			setField((Field) null);
			return;
		case CVPackage.TABLE__ROWS:
			getRows().clear();
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
		case CVPackage.TABLE__HEADER:
			return header != null && !header.isEmpty();
		case CVPackage.TABLE__FIELD:
			return field != null;
		case CVPackage.TABLE__ROWS:
			return rows != null && !rows.isEmpty();
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
		case CVPackage.TABLE___ROWS_SAME_LENGTH_AS_HEADER__DIAGNOSTICCHAIN_MAP:
			return rows_same_length_as_header((DiagnosticChain) arguments.get(0),
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
		result.append(" (header: ");
		result.append(header);
		result.append(')');
		return result.toString();
	}

} //TableImpl
