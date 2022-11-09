/**
 */
package cV.impl;

import cV.CVPackage;
import cV.Contacts;
import cV.Text;
import cV.URL;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Contacts</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link cV.impl.ContactsImpl#getAddress <em>Address</em>}</li>
 *   <li>{@link cV.impl.ContactsImpl#getPhone <em>Phone</em>}</li>
 *   <li>{@link cV.impl.ContactsImpl#getEmail <em>Email</em>}</li>
 *   <li>{@link cV.impl.ContactsImpl#getLinks <em>Links</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ContactsImpl extends SectionImpl implements Contacts {
	/**
	 * The cached value of the '{@link #getAddress() <em>Address</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddress()
	 * @generated
	 * @ordered
	 */
	protected Text address;

	/**
	 * The cached value of the '{@link #getPhone() <em>Phone</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhone()
	 * @generated
	 * @ordered
	 */
	protected Text phone;

	/**
	 * The cached value of the '{@link #getEmail() <em>Email</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmail()
	 * @generated
	 * @ordered
	 */
	protected Text email;

	/**
	 * The cached value of the '{@link #getLinks() <em>Links</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinks()
	 * @generated
	 * @ordered
	 */
	protected EList<URL> links;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContactsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CVPackage.Literals.CONTACTS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Text getAddress() {
		if (address != null && address.eIsProxy()) {
			InternalEObject oldAddress = (InternalEObject) address;
			address = (Text) eResolveProxy(oldAddress);
			if (address != oldAddress) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CVPackage.CONTACTS__ADDRESS, oldAddress,
							address));
			}
		}
		return address;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Text basicGetAddress() {
		return address;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAddress(Text newAddress) {
		Text oldAddress = address;
		address = newAddress;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CVPackage.CONTACTS__ADDRESS, oldAddress, address));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Text getPhone() {
		if (phone != null && phone.eIsProxy()) {
			InternalEObject oldPhone = (InternalEObject) phone;
			phone = (Text) eResolveProxy(oldPhone);
			if (phone != oldPhone) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CVPackage.CONTACTS__PHONE, oldPhone,
							phone));
			}
		}
		return phone;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Text basicGetPhone() {
		return phone;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPhone(Text newPhone) {
		Text oldPhone = phone;
		phone = newPhone;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CVPackage.CONTACTS__PHONE, oldPhone, phone));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Text getEmail() {
		if (email != null && email.eIsProxy()) {
			InternalEObject oldEmail = (InternalEObject) email;
			email = (Text) eResolveProxy(oldEmail);
			if (email != oldEmail) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CVPackage.CONTACTS__EMAIL, oldEmail,
							email));
			}
		}
		return email;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Text basicGetEmail() {
		return email;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEmail(Text newEmail) {
		Text oldEmail = email;
		email = newEmail;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CVPackage.CONTACTS__EMAIL, oldEmail, email));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<URL> getLinks() {
		if (links == null) {
			links = new EObjectResolvingEList<URL>(URL.class, this, CVPackage.CONTACTS__LINKS);
		}
		return links;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case CVPackage.CONTACTS__ADDRESS:
			if (resolve)
				return getAddress();
			return basicGetAddress();
		case CVPackage.CONTACTS__PHONE:
			if (resolve)
				return getPhone();
			return basicGetPhone();
		case CVPackage.CONTACTS__EMAIL:
			if (resolve)
				return getEmail();
			return basicGetEmail();
		case CVPackage.CONTACTS__LINKS:
			return getLinks();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case CVPackage.CONTACTS__ADDRESS:
			setAddress((Text) newValue);
			return;
		case CVPackage.CONTACTS__PHONE:
			setPhone((Text) newValue);
			return;
		case CVPackage.CONTACTS__EMAIL:
			setEmail((Text) newValue);
			return;
		case CVPackage.CONTACTS__LINKS:
			getLinks().clear();
			getLinks().addAll((Collection<? extends URL>) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case CVPackage.CONTACTS__ADDRESS:
			setAddress((Text) null);
			return;
		case CVPackage.CONTACTS__PHONE:
			setPhone((Text) null);
			return;
		case CVPackage.CONTACTS__EMAIL:
			setEmail((Text) null);
			return;
		case CVPackage.CONTACTS__LINKS:
			getLinks().clear();
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case CVPackage.CONTACTS__ADDRESS:
			return address != null;
		case CVPackage.CONTACTS__PHONE:
			return phone != null;
		case CVPackage.CONTACTS__EMAIL:
			return email != null;
		case CVPackage.CONTACTS__LINKS:
			return links != null && !links.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ContactsImpl
