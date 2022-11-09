/**
 */
package cV;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Education</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link cV.Education#getEducationEntries <em>Education Entries</em>}</li>
 * </ul>
 *
 * @see cV.CVPackage#getEducation()
 * @model
 * @generated
 */
public interface Education extends Section {
	/**
	 * Returns the value of the '<em><b>Education Entries</b></em>' containment reference list.
	 * The list contents are of type {@link cV.EducationEntry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Education Entries</em>' containment reference list.
	 * @see cV.CVPackage#getEducation_EducationEntries()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<EducationEntry> getEducationEntries();

} // Education
