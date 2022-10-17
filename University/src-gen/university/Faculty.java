/**
 */
package university;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Faculty</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link university.Faculty#getName <em>Name</em>}</li>
 *   <li>{@link university.Faculty#getYear_of_foundation <em>Year of foundation</em>}</li>
 *   <li>{@link university.Faculty#getPrograms <em>Programs</em>}</li>
 * </ul>
 *
 * @see university.UniversityPackage#getFaculty()
 * @model
 * @generated
 */
public interface Faculty extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see university.UniversityPackage#getFaculty_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link university.Faculty#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Year of foundation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Year of foundation</em>' attribute.
	 * @see #setYear_of_foundation(int)
	 * @see university.UniversityPackage#getFaculty_Year_of_foundation()
	 * @model unique="false"
	 * @generated
	 */
	int getYear_of_foundation();

	/**
	 * Sets the value of the '{@link university.Faculty#getYear_of_foundation <em>Year of foundation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Year of foundation</em>' attribute.
	 * @see #getYear_of_foundation()
	 * @generated
	 */
	void setYear_of_foundation(int value);

	/**
	 * Returns the value of the '<em><b>Programs</b></em>' reference list.
	 * The list contents are of type {@link university.Program}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Programs</em>' reference list.
	 * @see university.UniversityPackage#getFaculty_Programs()
	 * @model
	 * @generated
	 */
	EList<Program> getPrograms();

} // Faculty
