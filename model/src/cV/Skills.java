/**
 */
package cV;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Skills</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link cV.Skills#getTitle <em>Title</em>}</li>
 *   <li>{@link cV.Skills#getSkills <em>Skills</em>}</li>
 * </ul>
 *
 * @see cV.CVPackage#getSkills()
 * @model
 * @generated
 */
public interface Skills extends Section {
	/**
	 * Returns the value of the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Title</em>' attribute.
	 * @see #setTitle(String)
	 * @see cV.CVPackage#getSkills_Title()
	 * @model
	 * @generated
	 */
	String getTitle();

	/**
	 * Sets the value of the '{@link cV.Skills#getTitle <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' attribute.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(String value);

	/**
	 * Returns the value of the '<em><b>Skills</b></em>' containment reference list.
	 * The list contents are of type {@link cV.SkillEntry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Skills</em>' containment reference list.
	 * @see cV.CVPackage#getSkills_Skills()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<SkillEntry> getSkills();

} // Skills
