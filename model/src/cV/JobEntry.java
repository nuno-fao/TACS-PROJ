/**
 */
package cV;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Job Entry</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link cV.JobEntry#getTitle <em>Title</em>}</li>
 *   <li>{@link cV.JobEntry#getEmployer <em>Employer</em>}</li>
 *   <li>{@link cV.JobEntry#getDate <em>Date</em>}</li>
 *   <li>{@link cV.JobEntry#getDescription <em>Description</em>}</li>
 * </ul>
 *
 * @see cV.CVPackage#getJobEntry()
 * @model
 * @generated
 */
public interface JobEntry extends Item {
	/**
	 * Returns the value of the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Title</em>' attribute.
	 * @see #setTitle(String)
	 * @see cV.CVPackage#getJobEntry_Title()
	 * @model required="true"
	 * @generated
	 */
	String getTitle();

	/**
	 * Sets the value of the '{@link cV.JobEntry#getTitle <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' attribute.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(String value);

	/**
	 * Returns the value of the '<em><b>Employer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Employer</em>' attribute.
	 * @see #setEmployer(String)
	 * @see cV.CVPackage#getJobEntry_Employer()
	 * @model required="true"
	 * @generated
	 */
	String getEmployer();

	/**
	 * Sets the value of the '{@link cV.JobEntry#getEmployer <em>Employer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Employer</em>' attribute.
	 * @see #getEmployer()
	 * @generated
	 */
	void setEmployer(String value);

	/**
	 * Returns the value of the '<em><b>Date</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date</em>' reference.
	 * @see #setDate(Date)
	 * @see cV.CVPackage#getJobEntry_Date()
	 * @model required="true"
	 * @generated
	 */
	Date getDate();

	/**
	 * Sets the value of the '{@link cV.JobEntry#getDate <em>Date</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date</em>' reference.
	 * @see #getDate()
	 * @generated
	 */
	void setDate(Date value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see cV.CVPackage#getJobEntry_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link cV.JobEntry#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

} // JobEntry
