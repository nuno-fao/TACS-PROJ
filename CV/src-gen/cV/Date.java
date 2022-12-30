/**
 */
package cV;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Date</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link cV.Date#getStart_date <em>Start date</em>}</li>
 *   <li>{@link cV.Date#getEnding_date <em>Ending date</em>}</li>
 * </ul>
 *
 * @see cV.CVPackage#getDate()
 * @model
 * @generated
 */
public interface Date extends Item {
	/**
	 * Returns the value of the '<em><b>Start date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start date</em>' attribute.
	 * @see #setStart_date(String)
	 * @see cV.CVPackage#getDate_Start_date()
	 * @model
	 * @generated
	 */
	String getStart_date();

	/**
	 * Sets the value of the '{@link cV.Date#getStart_date <em>Start date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start date</em>' attribute.
	 * @see #getStart_date()
	 * @generated
	 */
	void setStart_date(String value);

	/**
	 * Returns the value of the '<em><b>Ending date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ending date</em>' attribute.
	 * @see #setEnding_date(String)
	 * @see cV.CVPackage#getDate_Ending_date()
	 * @model
	 * @generated
	 */
	String getEnding_date();

	/**
	 * Sets the value of the '{@link cV.Date#getEnding_date <em>Ending date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ending date</em>' attribute.
	 * @see #getEnding_date()
	 * @generated
	 */
	void setEnding_date(String value);

} // Date
