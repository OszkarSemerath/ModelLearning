/**
 */
package sgraph;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Composite Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sgraph.CompositeElement#getRegions <em>Regions</em>}</li>
 * </ul>
 *
 * @see sgraph.SgraphPackage#getCompositeElement()
 * @model abstract="true"
 * @generated
 */
public interface CompositeElement extends EObject {
	/**
	 * Returns the value of the '<em><b>Regions</b></em>' containment reference list.
	 * The list contents are of type {@link sgraph.Region}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Regions</em>' containment reference list.
	 * @see sgraph.SgraphPackage#getCompositeElement_Regions()
	 * @model containment="true"
	 * @generated
	 */
	EList<Region> getRegions();

} // CompositeElement
