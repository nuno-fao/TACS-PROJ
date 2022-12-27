/**
 */
package cV;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see cV.CVFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/OCL/Import ecore='http://www.eclipse.org/emf/2002/Ecore'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore invocationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' settingDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' validationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot'"
 * @generated
 */
public interface CVPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "cV";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/cV";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "cV";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CVPackage eINSTANCE = cV.impl.CVPackageImpl.init();

	/**
	 * The meta object id for the '{@link cV.impl.CVImpl <em>CV</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cV.impl.CVImpl
	 * @see cV.impl.CVPackageImpl#getCV()
	 * @generated
	 */
	int CV = 0;

	/**
	 * The feature id for the '<em><b>Sections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CV__SECTIONS = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CV__NAME = 1;

	/**
	 * The number of structural features of the '<em>CV</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CV_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>CV</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CV_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link cV.impl.SectionImpl <em>Section</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cV.impl.SectionImpl
	 * @see cV.impl.CVPackageImpl#getSection()
	 * @generated
	 */
	int SECTION = 1;

	/**
	 * The feature id for the '<em><b>Header</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION__HEADER = 0;

	/**
	 * The feature id for the '<em><b>Fields</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION__FIELDS = 1;

	/**
	 * The number of structural features of the '<em>Section</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Section</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link cV.impl.FieldImpl <em>Field</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cV.impl.FieldImpl
	 * @see cV.impl.CVPackageImpl#getField()
	 * @generated
	 */
	int FIELD = 2;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__TITLE = 0;

	/**
	 * The feature id for the '<em><b>Items</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__ITEMS = 1;

	/**
	 * The number of structural features of the '<em>Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link cV.impl.ItemImpl <em>Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cV.impl.ItemImpl
	 * @see cV.impl.CVPackageImpl#getItem()
	 * @generated
	 */
	int ITEM = 3;

	/**
	 * The number of structural features of the '<em>Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link cV.impl.TextImpl <em>Text</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cV.impl.TextImpl
	 * @see cV.impl.CVPackageImpl#getText()
	 * @generated
	 */
	int TEXT = 4;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT__VALUE = ITEM_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Text</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_FEATURE_COUNT = ITEM_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Text</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_OPERATION_COUNT = ITEM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cV.impl.DateImpl <em>Date</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cV.impl.DateImpl
	 * @see cV.impl.CVPackageImpl#getDate()
	 * @generated
	 */
	int DATE = 5;

	/**
	 * The feature id for the '<em><b>Start date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE__START_DATE = ITEM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Ending date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE__ENDING_DATE = ITEM_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Date</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_FEATURE_COUNT = ITEM_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Date</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_OPERATION_COUNT = ITEM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cV.impl.URLImpl <em>URL</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cV.impl.URLImpl
	 * @see cV.impl.CVPackageImpl#getURL()
	 * @generated
	 */
	int URL = 6;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int URL__VALUE = ITEM_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>URL</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int URL_FEATURE_COUNT = ITEM_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>URL</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int URL_OPERATION_COUNT = ITEM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cV.impl.ImageImpl <em>Image</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cV.impl.ImageImpl
	 * @see cV.impl.CVPackageImpl#getImage()
	 * @generated
	 */
	int IMAGE = 7;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE__VALUE = ITEM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE__WIDTH = ITEM_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE__HEIGHT = ITEM_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Image</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_FEATURE_COUNT = ITEM_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Image</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_OPERATION_COUNT = ITEM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cV.impl.BibliographicEntryImpl <em>Bibliographic Entry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cV.impl.BibliographicEntryImpl
	 * @see cV.impl.CVPackageImpl#getBibliographicEntry()
	 * @generated
	 */
	int BIBLIOGRAPHIC_ENTRY = 8;

	/**
	 * The feature id for the '<em><b>Author</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIBLIOGRAPHIC_ENTRY__AUTHOR = ITEM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Year</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIBLIOGRAPHIC_ENTRY__YEAR = ITEM_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIBLIOGRAPHIC_ENTRY__TITLE = ITEM_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Bibliographic Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIBLIOGRAPHIC_ENTRY_FEATURE_COUNT = ITEM_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Bibliographic Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIBLIOGRAPHIC_ENTRY_OPERATION_COUNT = ITEM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cV.impl.TableImpl <em>Table</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cV.impl.TableImpl
	 * @see cV.impl.CVPackageImpl#getTable()
	 * @generated
	 */
	int TABLE = 9;

	/**
	 * The feature id for the '<em><b>Header</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__HEADER = 0;

	/**
	 * The feature id for the '<em><b>Field</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__FIELD = 1;

	/**
	 * The feature id for the '<em><b>Rows</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__ROWS = 2;

	/**
	 * The number of structural features of the '<em>Table</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Table</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link cV.impl.TableRowImpl <em>Table Row</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cV.impl.TableRowImpl
	 * @see cV.impl.CVPackageImpl#getTableRow()
	 * @generated
	 */
	int TABLE_ROW = 10;

	/**
	 * The feature id for the '<em><b>Items</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_ROW__ITEMS = 0;

	/**
	 * The number of structural features of the '<em>Table Row</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_ROW_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Table Row</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_ROW_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link cV.impl.PersonalDataImpl <em>Personal Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cV.impl.PersonalDataImpl
	 * @see cV.impl.CVPackageImpl#getPersonalData()
	 * @generated
	 */
	int PERSONAL_DATA = 11;

	/**
	 * The feature id for the '<em><b>Header</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSONAL_DATA__HEADER = SECTION__HEADER;

	/**
	 * The feature id for the '<em><b>Fields</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSONAL_DATA__FIELDS = SECTION__FIELDS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSONAL_DATA__NAME = SECTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Photo</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSONAL_DATA__PHOTO = SECTION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Birthdate</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSONAL_DATA__BIRTHDATE = SECTION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>About me</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSONAL_DATA__ABOUT_ME = SECTION_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Personal Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSONAL_DATA_FEATURE_COUNT = SECTION_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Personal Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSONAL_DATA_OPERATION_COUNT = SECTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cV.impl.ContactsImpl <em>Contacts</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cV.impl.ContactsImpl
	 * @see cV.impl.CVPackageImpl#getContacts()
	 * @generated
	 */
	int CONTACTS = 12;

	/**
	 * The feature id for the '<em><b>Header</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACTS__HEADER = SECTION__HEADER;

	/**
	 * The feature id for the '<em><b>Fields</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACTS__FIELDS = SECTION__FIELDS;

	/**
	 * The feature id for the '<em><b>Address</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACTS__ADDRESS = SECTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Phone</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACTS__PHONE = SECTION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Email</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACTS__EMAIL = SECTION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Links</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACTS__LINKS = SECTION_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Contacts</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACTS_FEATURE_COUNT = SECTION_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Contacts</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACTS_OPERATION_COUNT = SECTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cV.impl.EducationImpl <em>Education</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cV.impl.EducationImpl
	 * @see cV.impl.CVPackageImpl#getEducation()
	 * @generated
	 */
	int EDUCATION = 13;

	/**
	 * The feature id for the '<em><b>Header</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDUCATION__HEADER = SECTION__HEADER;

	/**
	 * The feature id for the '<em><b>Fields</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDUCATION__FIELDS = SECTION__FIELDS;

	/**
	 * The feature id for the '<em><b>Education Entries</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDUCATION__EDUCATION_ENTRIES = SECTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Education</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDUCATION_FEATURE_COUNT = SECTION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Education</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDUCATION_OPERATION_COUNT = SECTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cV.impl.JobEntryImpl <em>Job Entry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cV.impl.JobEntryImpl
	 * @see cV.impl.CVPackageImpl#getJobEntry()
	 * @generated
	 */
	int JOB_ENTRY = 14;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_ENTRY__TITLE = ITEM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Employer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_ENTRY__EMPLOYER = ITEM_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Date</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_ENTRY__DATE = ITEM_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_ENTRY__DESCRIPTION = ITEM_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Job Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_ENTRY_FEATURE_COUNT = ITEM_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Job Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_ENTRY_OPERATION_COUNT = ITEM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cV.impl.EducationEntryImpl <em>Education Entry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cV.impl.EducationEntryImpl
	 * @see cV.impl.CVPackageImpl#getEducationEntry()
	 * @generated
	 */
	int EDUCATION_ENTRY = 15;

	/**
	 * The feature id for the '<em><b>Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDUCATION_ENTRY__LEVEL = ITEM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>School</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDUCATION_ENTRY__SCHOOL = ITEM_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Date</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDUCATION_ENTRY__DATE = ITEM_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Education Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDUCATION_ENTRY_FEATURE_COUNT = ITEM_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Education Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDUCATION_ENTRY_OPERATION_COUNT = ITEM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cV.impl.WorkExperienceImpl <em>Work Experience</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cV.impl.WorkExperienceImpl
	 * @see cV.impl.CVPackageImpl#getWorkExperience()
	 * @generated
	 */
	int WORK_EXPERIENCE = 16;

	/**
	 * The feature id for the '<em><b>Header</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_EXPERIENCE__HEADER = SECTION__HEADER;

	/**
	 * The feature id for the '<em><b>Fields</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_EXPERIENCE__FIELDS = SECTION__FIELDS;

	/**
	 * The feature id for the '<em><b>Job Entries</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_EXPERIENCE__JOB_ENTRIES = SECTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Work Experience</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_EXPERIENCE_FEATURE_COUNT = SECTION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Work Experience</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_EXPERIENCE_OPERATION_COUNT = SECTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cV.impl.SkillsImpl <em>Skills</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cV.impl.SkillsImpl
	 * @see cV.impl.CVPackageImpl#getSkills()
	 * @generated
	 */
	int SKILLS = 17;

	/**
	 * The feature id for the '<em><b>Header</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKILLS__HEADER = SECTION__HEADER;

	/**
	 * The feature id for the '<em><b>Fields</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKILLS__FIELDS = SECTION__FIELDS;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKILLS__TITLE = SECTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Skills</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKILLS__SKILLS = SECTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Skills</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKILLS_FEATURE_COUNT = SECTION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Skills</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKILLS_OPERATION_COUNT = SECTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cV.impl.SkillEntryImpl <em>Skill Entry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cV.impl.SkillEntryImpl
	 * @see cV.impl.CVPackageImpl#getSkillEntry()
	 * @generated
	 */
	int SKILL_ENTRY = 18;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKILL_ENTRY__TITLE = ITEM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Skill Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKILL_ENTRY__SKILL_VALUE = ITEM_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Skill Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKILL_ENTRY_FEATURE_COUNT = ITEM_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Skill Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKILL_ENTRY_OPERATION_COUNT = ITEM_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link cV.CV <em>CV</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CV</em>'.
	 * @see cV.CV
	 * @generated
	 */
	EClass getCV();

	/**
	 * Returns the meta object for the containment reference list '{@link cV.CV#getSections <em>Sections</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sections</em>'.
	 * @see cV.CV#getSections()
	 * @see #getCV()
	 * @generated
	 */
	EReference getCV_Sections();

	/**
	 * Returns the meta object for the attribute '{@link cV.CV#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see cV.CV#getName()
	 * @see #getCV()
	 * @generated
	 */
	EAttribute getCV_Name();

	/**
	 * Returns the meta object for class '{@link cV.Section <em>Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Section</em>'.
	 * @see cV.Section
	 * @generated
	 */
	EClass getSection();

	/**
	 * Returns the meta object for the attribute '{@link cV.Section#getHeader <em>Header</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Header</em>'.
	 * @see cV.Section#getHeader()
	 * @see #getSection()
	 * @generated
	 */
	EAttribute getSection_Header();

	/**
	 * Returns the meta object for the containment reference list '{@link cV.Section#getFields <em>Fields</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fields</em>'.
	 * @see cV.Section#getFields()
	 * @see #getSection()
	 * @generated
	 */
	EReference getSection_Fields();

	/**
	 * Returns the meta object for class '{@link cV.Field <em>Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Field</em>'.
	 * @see cV.Field
	 * @generated
	 */
	EClass getField();

	/**
	 * Returns the meta object for the attribute '{@link cV.Field#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see cV.Field#getTitle()
	 * @see #getField()
	 * @generated
	 */
	EAttribute getField_Title();

	/**
	 * Returns the meta object for the containment reference list '{@link cV.Field#getItems <em>Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Items</em>'.
	 * @see cV.Field#getItems()
	 * @see #getField()
	 * @generated
	 */
	EReference getField_Items();

	/**
	 * Returns the meta object for class '{@link cV.Item <em>Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Item</em>'.
	 * @see cV.Item
	 * @generated
	 */
	EClass getItem();

	/**
	 * Returns the meta object for class '{@link cV.Text <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Text</em>'.
	 * @see cV.Text
	 * @generated
	 */
	EClass getText();

	/**
	 * Returns the meta object for the attribute '{@link cV.Text#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see cV.Text#getValue()
	 * @see #getText()
	 * @generated
	 */
	EAttribute getText_Value();

	/**
	 * Returns the meta object for class '{@link cV.Date <em>Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Date</em>'.
	 * @see cV.Date
	 * @generated
	 */
	EClass getDate();

	/**
	 * Returns the meta object for the attribute '{@link cV.Date#getStart_date <em>Start date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start date</em>'.
	 * @see cV.Date#getStart_date()
	 * @see #getDate()
	 * @generated
	 */
	EAttribute getDate_Start_date();

	/**
	 * Returns the meta object for the attribute '{@link cV.Date#getEnding_date <em>Ending date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ending date</em>'.
	 * @see cV.Date#getEnding_date()
	 * @see #getDate()
	 * @generated
	 */
	EAttribute getDate_Ending_date();

	/**
	 * Returns the meta object for class '{@link cV.URL <em>URL</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>URL</em>'.
	 * @see cV.URL
	 * @generated
	 */
	EClass getURL();

	/**
	 * Returns the meta object for the attribute '{@link cV.URL#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see cV.URL#getValue()
	 * @see #getURL()
	 * @generated
	 */
	EAttribute getURL_Value();

	/**
	 * Returns the meta object for class '{@link cV.Image <em>Image</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Image</em>'.
	 * @see cV.Image
	 * @generated
	 */
	EClass getImage();

	/**
	 * Returns the meta object for the attribute '{@link cV.Image#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see cV.Image#getValue()
	 * @see #getImage()
	 * @generated
	 */
	EAttribute getImage_Value();

	/**
	 * Returns the meta object for the attribute '{@link cV.Image#getWidth <em>Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Width</em>'.
	 * @see cV.Image#getWidth()
	 * @see #getImage()
	 * @generated
	 */
	EAttribute getImage_Width();

	/**
	 * Returns the meta object for the attribute '{@link cV.Image#getHeight <em>Height</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Height</em>'.
	 * @see cV.Image#getHeight()
	 * @see #getImage()
	 * @generated
	 */
	EAttribute getImage_Height();

	/**
	 * Returns the meta object for class '{@link cV.BibliographicEntry <em>Bibliographic Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bibliographic Entry</em>'.
	 * @see cV.BibliographicEntry
	 * @generated
	 */
	EClass getBibliographicEntry();

	/**
	 * Returns the meta object for the attribute '{@link cV.BibliographicEntry#getAuthor <em>Author</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Author</em>'.
	 * @see cV.BibliographicEntry#getAuthor()
	 * @see #getBibliographicEntry()
	 * @generated
	 */
	EAttribute getBibliographicEntry_Author();

	/**
	 * Returns the meta object for the attribute '{@link cV.BibliographicEntry#getYear <em>Year</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Year</em>'.
	 * @see cV.BibliographicEntry#getYear()
	 * @see #getBibliographicEntry()
	 * @generated
	 */
	EAttribute getBibliographicEntry_Year();

	/**
	 * Returns the meta object for the attribute '{@link cV.BibliographicEntry#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see cV.BibliographicEntry#getTitle()
	 * @see #getBibliographicEntry()
	 * @generated
	 */
	EAttribute getBibliographicEntry_Title();

	/**
	 * Returns the meta object for class '{@link cV.Table <em>Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Table</em>'.
	 * @see cV.Table
	 * @generated
	 */
	EClass getTable();

	/**
	 * Returns the meta object for the attribute list '{@link cV.Table#getHeader <em>Header</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Header</em>'.
	 * @see cV.Table#getHeader()
	 * @see #getTable()
	 * @generated
	 */
	EAttribute getTable_Header();

	/**
	 * Returns the meta object for the reference '{@link cV.Table#getField <em>Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Field</em>'.
	 * @see cV.Table#getField()
	 * @see #getTable()
	 * @generated
	 */
	EReference getTable_Field();

	/**
	 * Returns the meta object for the containment reference list '{@link cV.Table#getRows <em>Rows</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rows</em>'.
	 * @see cV.Table#getRows()
	 * @see #getTable()
	 * @generated
	 */
	EReference getTable_Rows();

	/**
	 * Returns the meta object for class '{@link cV.TableRow <em>Table Row</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Table Row</em>'.
	 * @see cV.TableRow
	 * @generated
	 */
	EClass getTableRow();

	/**
	 * Returns the meta object for the containment reference list '{@link cV.TableRow#getItems <em>Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Items</em>'.
	 * @see cV.TableRow#getItems()
	 * @see #getTableRow()
	 * @generated
	 */
	EReference getTableRow_Items();

	/**
	 * Returns the meta object for class '{@link cV.PersonalData <em>Personal Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Personal Data</em>'.
	 * @see cV.PersonalData
	 * @generated
	 */
	EClass getPersonalData();

	/**
	 * Returns the meta object for the reference '{@link cV.PersonalData#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Name</em>'.
	 * @see cV.PersonalData#getName()
	 * @see #getPersonalData()
	 * @generated
	 */
	EReference getPersonalData_Name();

	/**
	 * Returns the meta object for the reference '{@link cV.PersonalData#getPhoto <em>Photo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Photo</em>'.
	 * @see cV.PersonalData#getPhoto()
	 * @see #getPersonalData()
	 * @generated
	 */
	EReference getPersonalData_Photo();

	/**
	 * Returns the meta object for the reference '{@link cV.PersonalData#getBirthdate <em>Birthdate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Birthdate</em>'.
	 * @see cV.PersonalData#getBirthdate()
	 * @see #getPersonalData()
	 * @generated
	 */
	EReference getPersonalData_Birthdate();

	/**
	 * Returns the meta object for the reference '{@link cV.PersonalData#getAbout_me <em>About me</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>About me</em>'.
	 * @see cV.PersonalData#getAbout_me()
	 * @see #getPersonalData()
	 * @generated
	 */
	EReference getPersonalData_About_me();

	/**
	 * Returns the meta object for class '{@link cV.Contacts <em>Contacts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Contacts</em>'.
	 * @see cV.Contacts
	 * @generated
	 */
	EClass getContacts();

	/**
	 * Returns the meta object for the reference '{@link cV.Contacts#getAddress <em>Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Address</em>'.
	 * @see cV.Contacts#getAddress()
	 * @see #getContacts()
	 * @generated
	 */
	EReference getContacts_Address();

	/**
	 * Returns the meta object for the reference '{@link cV.Contacts#getPhone <em>Phone</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Phone</em>'.
	 * @see cV.Contacts#getPhone()
	 * @see #getContacts()
	 * @generated
	 */
	EReference getContacts_Phone();

	/**
	 * Returns the meta object for the reference '{@link cV.Contacts#getEmail <em>Email</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Email</em>'.
	 * @see cV.Contacts#getEmail()
	 * @see #getContacts()
	 * @generated
	 */
	EReference getContacts_Email();

	/**
	 * Returns the meta object for the reference list '{@link cV.Contacts#getLinks <em>Links</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Links</em>'.
	 * @see cV.Contacts#getLinks()
	 * @see #getContacts()
	 * @generated
	 */
	EReference getContacts_Links();

	/**
	 * Returns the meta object for class '{@link cV.Education <em>Education</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Education</em>'.
	 * @see cV.Education
	 * @generated
	 */
	EClass getEducation();

	/**
	 * Returns the meta object for the containment reference list '{@link cV.Education#getEducationEntries <em>Education Entries</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Education Entries</em>'.
	 * @see cV.Education#getEducationEntries()
	 * @see #getEducation()
	 * @generated
	 */
	EReference getEducation_EducationEntries();

	/**
	 * Returns the meta object for class '{@link cV.JobEntry <em>Job Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Job Entry</em>'.
	 * @see cV.JobEntry
	 * @generated
	 */
	EClass getJobEntry();

	/**
	 * Returns the meta object for the attribute '{@link cV.JobEntry#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see cV.JobEntry#getTitle()
	 * @see #getJobEntry()
	 * @generated
	 */
	EAttribute getJobEntry_Title();

	/**
	 * Returns the meta object for the attribute '{@link cV.JobEntry#getEmployer <em>Employer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Employer</em>'.
	 * @see cV.JobEntry#getEmployer()
	 * @see #getJobEntry()
	 * @generated
	 */
	EAttribute getJobEntry_Employer();

	/**
	 * Returns the meta object for the reference '{@link cV.JobEntry#getDate <em>Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Date</em>'.
	 * @see cV.JobEntry#getDate()
	 * @see #getJobEntry()
	 * @generated
	 */
	EReference getJobEntry_Date();

	/**
	 * Returns the meta object for the attribute '{@link cV.JobEntry#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see cV.JobEntry#getDescription()
	 * @see #getJobEntry()
	 * @generated
	 */
	EAttribute getJobEntry_Description();

	/**
	 * Returns the meta object for class '{@link cV.EducationEntry <em>Education Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Education Entry</em>'.
	 * @see cV.EducationEntry
	 * @generated
	 */
	EClass getEducationEntry();

	/**
	 * Returns the meta object for the attribute '{@link cV.EducationEntry#getLevel <em>Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Level</em>'.
	 * @see cV.EducationEntry#getLevel()
	 * @see #getEducationEntry()
	 * @generated
	 */
	EAttribute getEducationEntry_Level();

	/**
	 * Returns the meta object for the attribute '{@link cV.EducationEntry#getSchool <em>School</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>School</em>'.
	 * @see cV.EducationEntry#getSchool()
	 * @see #getEducationEntry()
	 * @generated
	 */
	EAttribute getEducationEntry_School();

	/**
	 * Returns the meta object for the reference '{@link cV.EducationEntry#getDate <em>Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Date</em>'.
	 * @see cV.EducationEntry#getDate()
	 * @see #getEducationEntry()
	 * @generated
	 */
	EReference getEducationEntry_Date();

	/**
	 * Returns the meta object for class '{@link cV.WorkExperience <em>Work Experience</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Work Experience</em>'.
	 * @see cV.WorkExperience
	 * @generated
	 */
	EClass getWorkExperience();

	/**
	 * Returns the meta object for the containment reference list '{@link cV.WorkExperience#getJobEntries <em>Job Entries</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Job Entries</em>'.
	 * @see cV.WorkExperience#getJobEntries()
	 * @see #getWorkExperience()
	 * @generated
	 */
	EReference getWorkExperience_JobEntries();

	/**
	 * Returns the meta object for class '{@link cV.Skills <em>Skills</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Skills</em>'.
	 * @see cV.Skills
	 * @generated
	 */
	EClass getSkills();

	/**
	 * Returns the meta object for the attribute '{@link cV.Skills#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see cV.Skills#getTitle()
	 * @see #getSkills()
	 * @generated
	 */
	EAttribute getSkills_Title();

	/**
	 * Returns the meta object for the containment reference list '{@link cV.Skills#getSkills <em>Skills</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Skills</em>'.
	 * @see cV.Skills#getSkills()
	 * @see #getSkills()
	 * @generated
	 */
	EReference getSkills_Skills();

	/**
	 * Returns the meta object for class '{@link cV.SkillEntry <em>Skill Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Skill Entry</em>'.
	 * @see cV.SkillEntry
	 * @generated
	 */
	EClass getSkillEntry();

	/**
	 * Returns the meta object for the attribute '{@link cV.SkillEntry#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see cV.SkillEntry#getTitle()
	 * @see #getSkillEntry()
	 * @generated
	 */
	EAttribute getSkillEntry_Title();

	/**
	 * Returns the meta object for the attribute '{@link cV.SkillEntry#getSkillValue <em>Skill Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Skill Value</em>'.
	 * @see cV.SkillEntry#getSkillValue()
	 * @see #getSkillEntry()
	 * @generated
	 */
	EAttribute getSkillEntry_SkillValue();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	CVFactory getCVFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link cV.impl.CVImpl <em>CV</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cV.impl.CVImpl
		 * @see cV.impl.CVPackageImpl#getCV()
		 * @generated
		 */
		EClass CV = eINSTANCE.getCV();

		/**
		 * The meta object literal for the '<em><b>Sections</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CV__SECTIONS = eINSTANCE.getCV_Sections();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CV__NAME = eINSTANCE.getCV_Name();

		/**
		 * The meta object literal for the '{@link cV.impl.SectionImpl <em>Section</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cV.impl.SectionImpl
		 * @see cV.impl.CVPackageImpl#getSection()
		 * @generated
		 */
		EClass SECTION = eINSTANCE.getSection();

		/**
		 * The meta object literal for the '<em><b>Header</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SECTION__HEADER = eINSTANCE.getSection_Header();

		/**
		 * The meta object literal for the '<em><b>Fields</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SECTION__FIELDS = eINSTANCE.getSection_Fields();

		/**
		 * The meta object literal for the '{@link cV.impl.FieldImpl <em>Field</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cV.impl.FieldImpl
		 * @see cV.impl.CVPackageImpl#getField()
		 * @generated
		 */
		EClass FIELD = eINSTANCE.getField();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIELD__TITLE = eINSTANCE.getField_Title();

		/**
		 * The meta object literal for the '<em><b>Items</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FIELD__ITEMS = eINSTANCE.getField_Items();

		/**
		 * The meta object literal for the '{@link cV.impl.ItemImpl <em>Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cV.impl.ItemImpl
		 * @see cV.impl.CVPackageImpl#getItem()
		 * @generated
		 */
		EClass ITEM = eINSTANCE.getItem();

		/**
		 * The meta object literal for the '{@link cV.impl.TextImpl <em>Text</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cV.impl.TextImpl
		 * @see cV.impl.CVPackageImpl#getText()
		 * @generated
		 */
		EClass TEXT = eINSTANCE.getText();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXT__VALUE = eINSTANCE.getText_Value();

		/**
		 * The meta object literal for the '{@link cV.impl.DateImpl <em>Date</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cV.impl.DateImpl
		 * @see cV.impl.CVPackageImpl#getDate()
		 * @generated
		 */
		EClass DATE = eINSTANCE.getDate();

		/**
		 * The meta object literal for the '<em><b>Start date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATE__START_DATE = eINSTANCE.getDate_Start_date();

		/**
		 * The meta object literal for the '<em><b>Ending date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATE__ENDING_DATE = eINSTANCE.getDate_Ending_date();

		/**
		 * The meta object literal for the '{@link cV.impl.URLImpl <em>URL</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cV.impl.URLImpl
		 * @see cV.impl.CVPackageImpl#getURL()
		 * @generated
		 */
		EClass URL = eINSTANCE.getURL();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute URL__VALUE = eINSTANCE.getURL_Value();

		/**
		 * The meta object literal for the '{@link cV.impl.ImageImpl <em>Image</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cV.impl.ImageImpl
		 * @see cV.impl.CVPackageImpl#getImage()
		 * @generated
		 */
		EClass IMAGE = eINSTANCE.getImage();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMAGE__VALUE = eINSTANCE.getImage_Value();

		/**
		 * The meta object literal for the '<em><b>Width</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMAGE__WIDTH = eINSTANCE.getImage_Width();

		/**
		 * The meta object literal for the '<em><b>Height</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMAGE__HEIGHT = eINSTANCE.getImage_Height();

		/**
		 * The meta object literal for the '{@link cV.impl.BibliographicEntryImpl <em>Bibliographic Entry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cV.impl.BibliographicEntryImpl
		 * @see cV.impl.CVPackageImpl#getBibliographicEntry()
		 * @generated
		 */
		EClass BIBLIOGRAPHIC_ENTRY = eINSTANCE.getBibliographicEntry();

		/**
		 * The meta object literal for the '<em><b>Author</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BIBLIOGRAPHIC_ENTRY__AUTHOR = eINSTANCE.getBibliographicEntry_Author();

		/**
		 * The meta object literal for the '<em><b>Year</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BIBLIOGRAPHIC_ENTRY__YEAR = eINSTANCE.getBibliographicEntry_Year();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BIBLIOGRAPHIC_ENTRY__TITLE = eINSTANCE.getBibliographicEntry_Title();

		/**
		 * The meta object literal for the '{@link cV.impl.TableImpl <em>Table</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cV.impl.TableImpl
		 * @see cV.impl.CVPackageImpl#getTable()
		 * @generated
		 */
		EClass TABLE = eINSTANCE.getTable();

		/**
		 * The meta object literal for the '<em><b>Header</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TABLE__HEADER = eINSTANCE.getTable_Header();

		/**
		 * The meta object literal for the '<em><b>Field</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TABLE__FIELD = eINSTANCE.getTable_Field();

		/**
		 * The meta object literal for the '<em><b>Rows</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TABLE__ROWS = eINSTANCE.getTable_Rows();

		/**
		 * The meta object literal for the '{@link cV.impl.TableRowImpl <em>Table Row</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cV.impl.TableRowImpl
		 * @see cV.impl.CVPackageImpl#getTableRow()
		 * @generated
		 */
		EClass TABLE_ROW = eINSTANCE.getTableRow();

		/**
		 * The meta object literal for the '<em><b>Items</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TABLE_ROW__ITEMS = eINSTANCE.getTableRow_Items();

		/**
		 * The meta object literal for the '{@link cV.impl.PersonalDataImpl <em>Personal Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cV.impl.PersonalDataImpl
		 * @see cV.impl.CVPackageImpl#getPersonalData()
		 * @generated
		 */
		EClass PERSONAL_DATA = eINSTANCE.getPersonalData();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERSONAL_DATA__NAME = eINSTANCE.getPersonalData_Name();

		/**
		 * The meta object literal for the '<em><b>Photo</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERSONAL_DATA__PHOTO = eINSTANCE.getPersonalData_Photo();

		/**
		 * The meta object literal for the '<em><b>Birthdate</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERSONAL_DATA__BIRTHDATE = eINSTANCE.getPersonalData_Birthdate();

		/**
		 * The meta object literal for the '<em><b>About me</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERSONAL_DATA__ABOUT_ME = eINSTANCE.getPersonalData_About_me();

		/**
		 * The meta object literal for the '{@link cV.impl.ContactsImpl <em>Contacts</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cV.impl.ContactsImpl
		 * @see cV.impl.CVPackageImpl#getContacts()
		 * @generated
		 */
		EClass CONTACTS = eINSTANCE.getContacts();

		/**
		 * The meta object literal for the '<em><b>Address</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTACTS__ADDRESS = eINSTANCE.getContacts_Address();

		/**
		 * The meta object literal for the '<em><b>Phone</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTACTS__PHONE = eINSTANCE.getContacts_Phone();

		/**
		 * The meta object literal for the '<em><b>Email</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTACTS__EMAIL = eINSTANCE.getContacts_Email();

		/**
		 * The meta object literal for the '<em><b>Links</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTACTS__LINKS = eINSTANCE.getContacts_Links();

		/**
		 * The meta object literal for the '{@link cV.impl.EducationImpl <em>Education</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cV.impl.EducationImpl
		 * @see cV.impl.CVPackageImpl#getEducation()
		 * @generated
		 */
		EClass EDUCATION = eINSTANCE.getEducation();

		/**
		 * The meta object literal for the '<em><b>Education Entries</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EDUCATION__EDUCATION_ENTRIES = eINSTANCE.getEducation_EducationEntries();

		/**
		 * The meta object literal for the '{@link cV.impl.JobEntryImpl <em>Job Entry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cV.impl.JobEntryImpl
		 * @see cV.impl.CVPackageImpl#getJobEntry()
		 * @generated
		 */
		EClass JOB_ENTRY = eINSTANCE.getJobEntry();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JOB_ENTRY__TITLE = eINSTANCE.getJobEntry_Title();

		/**
		 * The meta object literal for the '<em><b>Employer</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JOB_ENTRY__EMPLOYER = eINSTANCE.getJobEntry_Employer();

		/**
		 * The meta object literal for the '<em><b>Date</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JOB_ENTRY__DATE = eINSTANCE.getJobEntry_Date();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JOB_ENTRY__DESCRIPTION = eINSTANCE.getJobEntry_Description();

		/**
		 * The meta object literal for the '{@link cV.impl.EducationEntryImpl <em>Education Entry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cV.impl.EducationEntryImpl
		 * @see cV.impl.CVPackageImpl#getEducationEntry()
		 * @generated
		 */
		EClass EDUCATION_ENTRY = eINSTANCE.getEducationEntry();

		/**
		 * The meta object literal for the '<em><b>Level</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EDUCATION_ENTRY__LEVEL = eINSTANCE.getEducationEntry_Level();

		/**
		 * The meta object literal for the '<em><b>School</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EDUCATION_ENTRY__SCHOOL = eINSTANCE.getEducationEntry_School();

		/**
		 * The meta object literal for the '<em><b>Date</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EDUCATION_ENTRY__DATE = eINSTANCE.getEducationEntry_Date();

		/**
		 * The meta object literal for the '{@link cV.impl.WorkExperienceImpl <em>Work Experience</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cV.impl.WorkExperienceImpl
		 * @see cV.impl.CVPackageImpl#getWorkExperience()
		 * @generated
		 */
		EClass WORK_EXPERIENCE = eINSTANCE.getWorkExperience();

		/**
		 * The meta object literal for the '<em><b>Job Entries</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORK_EXPERIENCE__JOB_ENTRIES = eINSTANCE.getWorkExperience_JobEntries();

		/**
		 * The meta object literal for the '{@link cV.impl.SkillsImpl <em>Skills</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cV.impl.SkillsImpl
		 * @see cV.impl.CVPackageImpl#getSkills()
		 * @generated
		 */
		EClass SKILLS = eINSTANCE.getSkills();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SKILLS__TITLE = eINSTANCE.getSkills_Title();

		/**
		 * The meta object literal for the '<em><b>Skills</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SKILLS__SKILLS = eINSTANCE.getSkills_Skills();

		/**
		 * The meta object literal for the '{@link cV.impl.SkillEntryImpl <em>Skill Entry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cV.impl.SkillEntryImpl
		 * @see cV.impl.CVPackageImpl#getSkillEntry()
		 * @generated
		 */
		EClass SKILL_ENTRY = eINSTANCE.getSkillEntry();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SKILL_ENTRY__TITLE = eINSTANCE.getSkillEntry_Title();

		/**
		 * The meta object literal for the '<em><b>Skill Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SKILL_ENTRY__SKILL_VALUE = eINSTANCE.getSkillEntry_SkillValue();

	}

} //CVPackage
