/**
 */
package cV;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Skill Entry</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link cV.SkillEntry#getTitle <em>Title</em>}</li>
 *   <li>{@link cV.SkillEntry#getSkillValue <em>Skill Value</em>}</li>
 * </ul>
 *
 * @see cV.CVPackage#getSkillEntry()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='limit_value'"
 * @generated
 */
public interface SkillEntry extends Item {
	/**
	 * Returns the value of the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Title</em>' attribute.
	 * @see #setTitle(String)
	 * @see cV.CVPackage#getSkillEntry_Title()
	 * @model required="true"
	 * @generated
	 */
	String getTitle();

	/**
	 * Sets the value of the '{@link cV.SkillEntry#getTitle <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' attribute.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(String value);

	/**
	 * Returns the value of the '<em><b>Skill Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Skill Value</em>' attribute.
	 * @see #setSkillValue(int)
	 * @see cV.CVPackage#getSkillEntry_SkillValue()
	 * @model required="true"
	 * @generated
	 */
	int getSkillValue();

	/**
	 * Sets the value of the '{@link cV.SkillEntry#getSkillValue <em>Skill Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Skill Value</em>' attribute.
	 * @see #getSkillValue()
	 * @generated
	 */
	void setSkillValue(int value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='self.skillValue &gt;= 1 and self.skillValue &lt;= 5'"
	 * @generated
	 */
	boolean limit_value(DiagnosticChain diagnostics, Map<Object, Object> context);

} // SkillEntry
