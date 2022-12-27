/**
 */
package cV;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CV</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link cV.CV#getSections <em>Sections</em>}</li>
 *   <li>{@link cV.CV#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see cV.CVPackage#getCV()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='obligatory_personal_data_section obligatory_contacts_section at_most_one_education_section at_most_one_work_experience_section'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot obligatory_personal_data_section='PersonalData.allInstances()-&gt;size() = 1' obligatory_contacts_section='Contacts.allInstances()-&gt;size() = 1' at_most_one_education_section='Education.allInstances()-&gt;size() &lt;= 1' at_most_one_work_experience_section='WorkExperience.allInstances()-&gt;size() &lt;= 1'"
 * @generated
 */
public interface CV extends EObject {
	/**
	 * Returns the value of the '<em><b>Sections</b></em>' containment reference list.
	 * The list contents are of type {@link cV.Section}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sections</em>' containment reference list.
	 * @see cV.CVPackage#getCV_Sections()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Section> getSections();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see cV.CVPackage#getCV_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link cV.CV#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // CV
