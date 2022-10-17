/**
 */
package university;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>University</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link university.University#getName <em>Name</em>}</li>
 *   <li>{@link university.University#getCity <em>City</em>}</li>
 *   <li>{@link university.University#getYear_of_foundation <em>Year of foundation</em>}</li>
 *   <li>{@link university.University#getFaculties <em>Faculties</em>}</li>
 * </ul>
 *
 * @see university.UniversityPackage#getUniversity()
 * @model
 * @generated
 */
public interface University extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see university.UniversityPackage#getUniversity_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link university.University#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>City</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>City</em>' attribute.
	 * @see #setCity(String)
	 * @see university.UniversityPackage#getUniversity_City()
	 * @model unique="false"
	 * @generated
	 */
	String getCity();

	/**
	 * Sets the value of the '{@link university.University#getCity <em>City</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>City</em>' attribute.
	 * @see #getCity()
	 * @generated
	 */
	void setCity(String value);

	/**
	 * Returns the value of the '<em><b>Year of foundation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Year of foundation</em>' attribute.
	 * @see #setYear_of_foundation(int)
	 * @see university.UniversityPackage#getUniversity_Year_of_foundation()
	 * @model unique="false"
	 * @generated
	 */
	int getYear_of_foundation();

	/**
	 * Sets the value of the '{@link university.University#getYear_of_foundation <em>Year of foundation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Year of foundation</em>' attribute.
	 * @see #getYear_of_foundation()
	 * @generated
	 */
	void setYear_of_foundation(int value);

	/**
	 * Returns the value of the '<em><b>Faculties</b></em>' reference list.
	 * The list contents are of type {@link university.Faculty}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Faculties</em>' reference list.
	 * @see university.UniversityPackage#getUniversity_Faculties()
	 * @model
	 * @generated
	 */
	EList<Faculty> getFaculties();

} // University
