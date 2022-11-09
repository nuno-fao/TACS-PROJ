/**
 */
package cV;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Contacts</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link cV.Contacts#getAddress <em>Address</em>}</li>
 *   <li>{@link cV.Contacts#getPhone <em>Phone</em>}</li>
 *   <li>{@link cV.Contacts#getEmail <em>Email</em>}</li>
 *   <li>{@link cV.Contacts#getLinks <em>Links</em>}</li>
 * </ul>
 *
 * @see cV.CVPackage#getContacts()
 * @model
 * @generated
 */
public interface Contacts extends Section {
	/**
	 * Returns the value of the '<em><b>Address</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Address</em>' reference.
	 * @see #setAddress(Text)
	 * @see cV.CVPackage#getContacts_Address()
	 * @model
	 * @generated
	 */
	Text getAddress();

	/**
	 * Sets the value of the '{@link cV.Contacts#getAddress <em>Address</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Address</em>' reference.
	 * @see #getAddress()
	 * @generated
	 */
	void setAddress(Text value);

	/**
	 * Returns the value of the '<em><b>Phone</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Phone</em>' reference.
	 * @see #setPhone(Text)
	 * @see cV.CVPackage#getContacts_Phone()
	 * @model
	 * @generated
	 */
	Text getPhone();

	/**
	 * Sets the value of the '{@link cV.Contacts#getPhone <em>Phone</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Phone</em>' reference.
	 * @see #getPhone()
	 * @generated
	 */
	void setPhone(Text value);

	/**
	 * Returns the value of the '<em><b>Email</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Email</em>' reference.
	 * @see #setEmail(Text)
	 * @see cV.CVPackage#getContacts_Email()
	 * @model
	 * @generated
	 */
	Text getEmail();

	/**
	 * Sets the value of the '{@link cV.Contacts#getEmail <em>Email</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Email</em>' reference.
	 * @see #getEmail()
	 * @generated
	 */
	void setEmail(Text value);

	/**
	 * Returns the value of the '<em><b>Links</b></em>' reference list.
	 * The list contents are of type {@link cV.URL}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Links</em>' reference list.
	 * @see cV.CVPackage#getContacts_Links()
	 * @model
	 * @generated
	 */
	EList<URL> getLinks();

} // Contacts
