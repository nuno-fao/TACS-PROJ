/**
 */
package university;

import java.util.Date;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Student</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link university.Student#getName <em>Name</em>}</li>
 *   <li>{@link university.Student#getDate_of_birth <em>Date of birth</em>}</li>
 * </ul>
 *
 * @see university.UniversityPackage#getStudent()
 * @model
 * @generated
 */
public interface Student extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see university.UniversityPackage#getStudent_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link university.Student#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Date of birth</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date of birth</em>' attribute.
	 * @see #setDate_of_birth(Date)
	 * @see university.UniversityPackage#getStudent_Date_of_birth()
	 * @model
	 * @generated
	 */
	Date getDate_of_birth();

	/**
	 * Sets the value of the '{@link university.Student#getDate_of_birth <em>Date of birth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date of birth</em>' attribute.
	 * @see #getDate_of_birth()
	 * @generated
	 */
	void setDate_of_birth(Date value);

} // Student
