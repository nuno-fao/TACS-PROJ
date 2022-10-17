/**
 */
package university;

import java.util.Date;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Professor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link university.Professor#getName <em>Name</em>}</li>
 *   <li>{@link university.Professor#getDate_of_birth <em>Date of birth</em>}</li>
 * </ul>
 *
 * @see university.UniversityPackage#getProfessor()
 * @model
 * @generated
 */
public interface Professor extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see university.UniversityPackage#getProfessor_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link university.Professor#getName <em>Name</em>}' attribute.
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
	 * @see university.UniversityPackage#getProfessor_Date_of_birth()
	 * @model
	 * @generated
	 */
	Date getDate_of_birth();

	/**
	 * Sets the value of the '{@link university.Professor#getDate_of_birth <em>Date of birth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date of birth</em>' attribute.
	 * @see #getDate_of_birth()
	 * @generated
	 */
	void setDate_of_birth(Date value);

} // Professor
