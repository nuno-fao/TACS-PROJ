/**
 */
package cV;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Table</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link cV.Table#getHeader <em>Header</em>}</li>
 *   <li>{@link cV.Table#getField <em>Field</em>}</li>
 *   <li>{@link cV.Table#getRows <em>Rows</em>}</li>
 * </ul>
 *
 * @see cV.CVPackage#getTable()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='rows_same_length_as_header'"
 * @generated
 */
public interface Table extends EObject {
	/**
	 * Returns the value of the '<em><b>Header</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Header</em>' attribute list.
	 * @see cV.CVPackage#getTable_Header()
	 * @model
	 * @generated
	 */
	EList<String> getHeader();

	/**
	 * Returns the value of the '<em><b>Field</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Field</em>' reference.
	 * @see #setField(Field)
	 * @see cV.CVPackage#getTable_Field()
	 * @model required="true"
	 * @generated
	 */
	Field getField();

	/**
	 * Sets the value of the '{@link cV.Table#getField <em>Field</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Field</em>' reference.
	 * @see #getField()
	 * @generated
	 */
	void setField(Field value);

	/**
	 * Returns the value of the '<em><b>Rows</b></em>' containment reference list.
	 * The list contents are of type {@link cV.TableRow}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rows</em>' containment reference list.
	 * @see cV.CVPackage#getTable_Rows()
	 * @model containment="true"
	 * @generated
	 */
	EList<TableRow> getRows();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='self.header-&gt;size() = 1 implies self.rows-&gt;forAll(r | r.items-&gt;size() = self.header-&gt;size())'"
	 * @generated
	 */
	boolean rows_same_length_as_header(DiagnosticChain diagnostics, Map<Object, Object> context);

} // Table
