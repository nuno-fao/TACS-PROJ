/**
 */
package cV;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Work Experience</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link cV.WorkExperience#getJobEntries <em>Job Entries</em>}</li>
 * </ul>
 *
 * @see cV.CVPackage#getWorkExperience()
 * @model
 * @generated
 */
public interface WorkExperience extends Section {
	/**
	 * Returns the value of the '<em><b>Job Entries</b></em>' containment reference list.
	 * The list contents are of type {@link cV.JobEntry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Job Entries</em>' containment reference list.
	 * @see cV.CVPackage#getWorkExperience_JobEntries()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<JobEntry> getJobEntries();

} // WorkExperience
