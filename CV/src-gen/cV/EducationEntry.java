/**
 */
package cV;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Education Entry</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link cV.EducationEntry#getLevel <em>Level</em>}</li>
 *   <li>{@link cV.EducationEntry#getSchool <em>School</em>}</li>
 *   <li>{@link cV.EducationEntry#getDate <em>Date</em>}</li>
 *   <li>{@link cV.EducationEntry#getTitle <em>Title</em>}</li>
 * </ul>
 *
 * @see cV.CVPackage#getEducationEntry()
 * @model
 * @generated
 */
public interface EducationEntry extends Item {
	/**
	 * Returns the value of the '<em><b>Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Level</em>' attribute.
	 * @see #setLevel(String)
	 * @see cV.CVPackage#getEducationEntry_Level()
	 * @model required="true"
	 * @generated
	 */
	String getLevel();

	/**
	 * Sets the value of the '{@link cV.EducationEntry#getLevel <em>Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Level</em>' attribute.
	 * @see #getLevel()
	 * @generated
	 */
	void setLevel(String value);

	/**
	 * Returns the value of the '<em><b>School</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>School</em>' attribute.
	 * @see #setSchool(String)
	 * @see cV.CVPackage#getEducationEntry_School()
	 * @model required="true"
	 * @generated
	 */
	String getSchool();

	/**
	 * Sets the value of the '{@link cV.EducationEntry#getSchool <em>School</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>School</em>' attribute.
	 * @see #getSchool()
	 * @generated
	 */
	void setSchool(String value);

	/**
	 * Returns the value of the '<em><b>Date</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date</em>' containment reference.
	 * @see #setDate(Date)
	 * @see cV.CVPackage#getEducationEntry_Date()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Date getDate();

	/**
	 * Sets the value of the '{@link cV.EducationEntry#getDate <em>Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date</em>' containment reference.
	 * @see #getDate()
	 * @generated
	 */
	void setDate(Date value);

	/**
	 * Returns the value of the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Title</em>' attribute.
	 * @see #setTitle(String)
	 * @see cV.CVPackage#getEducationEntry_Title()
	 * @model
	 * @generated
	 */
	String getTitle();

	/**
	 * Sets the value of the '{@link cV.EducationEntry#getTitle <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' attribute.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(String value);

} // EducationEntry
