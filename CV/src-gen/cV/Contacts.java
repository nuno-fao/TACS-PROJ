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
	 * Returns the value of the '<em><b>Phone</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Phone</em>' containment reference.
	 * @see #setPhone(Text)
	 * @see cV.CVPackage#getContacts_Phone()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Text getPhone();

	/**
	 * Sets the value of the '{@link cV.Contacts#getPhone <em>Phone</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Phone</em>' containment reference.
	 * @see #getPhone()
	 * @generated
	 */
	void setPhone(Text value);

	/**
	 * Returns the value of the '<em><b>Email</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Email</em>' containment reference.
	 * @see #setEmail(Text)
	 * @see cV.CVPackage#getContacts_Email()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Text getEmail();

	/**
	 * Sets the value of the '{@link cV.Contacts#getEmail <em>Email</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Email</em>' containment reference.
	 * @see #getEmail()
	 * @generated
	 */
	void setEmail(Text value);

	/**
	 * Returns the value of the '<em><b>Links</b></em>' containment reference list.
	 * The list contents are of type {@link cV.URL}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Links</em>' containment reference list.
	 * @see cV.CVPackage#getContacts_Links()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<URL> getLinks();

} // Contacts
