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
 * </ul>
 *
 * @see cV.CVPackage#getPersonalData()
 * @model
 * @generated
 */
public interface PersonalData extends Section {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' reference.
	 * @see #setName(Text)
	 * @see cV.CVPackage#getPersonalData_Name()
	 * @model
	 * @generated
	 */
	Text getName();

	/**
	 * Sets the value of the '{@link cV.PersonalData#getName <em>Name</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' reference.
	 * @see #getName()
	 * @generated
	 */
	void setName(Text value);

	/**
	 * Returns the value of the '<em><b>Photo</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Photo</em>' reference.
	 * @see #setPhoto(Image)
	 * @see cV.CVPackage#getPersonalData_Photo()
	 * @model
	 * @generated
	 */
	Image getPhoto();

	/**
	 * Sets the value of the '{@link cV.PersonalData#getPhoto <em>Photo</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Photo</em>' reference.
	 * @see #getPhoto()
	 * @generated
	 */
	void setPhoto(Image value);

	/**
	 * Returns the value of the '<em><b>Birthdate</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Birthdate</em>' reference.
	 * @see #setBirthdate(Text)
	 * @see cV.CVPackage#getPersonalData_Birthdate()
	 * @model
	 * @generated
	 */
	Text getBirthdate();

	/**
	 * Sets the value of the '{@link cV.PersonalData#getBirthdate <em>Birthdate</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Birthdate</em>' reference.
	 * @see #getBirthdate()
	 * @generated
	 */
	void setBirthdate(Text value);

	/**
	 * Returns the value of the '<em><b>About me</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>About me</em>' reference.
	 * @see #setAbout_me(Text)
	 * @see cV.CVPackage#getPersonalData_About_me()
	 * @model
	 * @generated
	 */
	Text getAbout_me();

	/**
	 * Sets the value of the '{@link cV.PersonalData#getAbout_me <em>About me</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>About me</em>' reference.
	 * @see #getAbout_me()
	 * @generated
	 */
	void setAbout_me(Text value);

} // PersonalData
