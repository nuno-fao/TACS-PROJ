/**
 */
package cV;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Personal Data</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link cV.PersonalData#getName <em>Name</em>}</li>
 *   <li>{@link cV.PersonalData#getPhoto <em>Photo</em>}</li>
 *   <li>{@link cV.PersonalData#getBirthdate <em>Birthdate</em>}</li>
 *   <li>{@link cV.PersonalData#getAbout_me <em>About me</em>}</li>
 *   <li>{@link cV.PersonalData#getAddress <em>Address</em>}</li>
 * </ul>
 *
 * @see cV.CVPackage#getPersonalData()
 * @model
 * @generated
 */
public interface PersonalData extends Section {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' containment reference.
	 * @see #setName(Text)
	 * @see cV.CVPackage#getPersonalData_Name()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Text getName();

	/**
	 * Sets the value of the '{@link cV.PersonalData#getName <em>Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' containment reference.
	 * @see #getName()
	 * @generated
	 */
	void setName(Text value);

	/**
	 * Returns the value of the '<em><b>Photo</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Photo</em>' containment reference.
	 * @see #setPhoto(Image)
	 * @see cV.CVPackage#getPersonalData_Photo()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Image getPhoto();

	/**
	 * Sets the value of the '{@link cV.PersonalData#getPhoto <em>Photo</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Photo</em>' containment reference.
	 * @see #getPhoto()
	 * @generated
	 */
	void setPhoto(Image value);

	/**
	 * Returns the value of the '<em><b>Birthdate</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Birthdate</em>' containment reference.
	 * @see #setBirthdate(Date)
	 * @see cV.CVPackage#getPersonalData_Birthdate()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Date getBirthdate();

	/**
	 * Sets the value of the '{@link cV.PersonalData#getBirthdate <em>Birthdate</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Birthdate</em>' containment reference.
	 * @see #getBirthdate()
	 * @generated
	 */
	void setBirthdate(Date value);

	/**
	 * Returns the value of the '<em><b>About me</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>About me</em>' containment reference.
	 * @see #setAbout_me(Text)
	 * @see cV.CVPackage#getPersonalData_About_me()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Text getAbout_me();

	/**
	 * Sets the value of the '{@link cV.PersonalData#getAbout_me <em>About me</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>About me</em>' containment reference.
	 * @see #getAbout_me()
	 * @generated
	 */
	void setAbout_me(Text value);

	/**
	 * Returns the value of the '<em><b>Address</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Address</em>' containment reference.
	 * @see #setAddress(Text)
	 * @see cV.CVPackage#getPersonalData_Address()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Text getAddress();

	/**
	 * Sets the value of the '{@link cV.PersonalData#getAddress <em>Address</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Address</em>' containment reference.
	 * @see #getAddress()
	 * @generated
	 */
	void setAddress(Text value);

} // PersonalData
