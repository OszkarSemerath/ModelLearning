/**
 */
package sgraph.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import sgraph.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see sgraph.SgraphPackage
 * @generated
 */
public class SgraphAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static SgraphPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SgraphAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = SgraphPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SgraphSwitch<Adapter> modelSwitch =
		new SgraphSwitch<Adapter>() {
			@Override
			public Adapter casePseudostate(Pseudostate object) {
				return createPseudostateAdapter();
			}
			@Override
			public Adapter caseVertex(Vertex object) {
				return createVertexAdapter();
			}
			@Override
			public Adapter caseRegion(Region object) {
				return createRegionAdapter();
			}
			@Override
			public Adapter caseTransition(Transition object) {
				return createTransitionAdapter();
			}
			@Override
			public Adapter caseStatechart(Statechart object) {
				return createStatechartAdapter();
			}
			@Override
			public Adapter caseEntry(Entry object) {
				return createEntryAdapter();
			}
			@Override
			public Adapter caseSynchronization(Synchronization object) {
				return createSynchronizationAdapter();
			}
			@Override
			public Adapter caseState(State object) {
				return createStateAdapter();
			}
			@Override
			public Adapter caseRegularState(RegularState object) {
				return createRegularStateAdapter();
			}
			@Override
			public Adapter caseCompositeElement(CompositeElement object) {
				return createCompositeElementAdapter();
			}
			@Override
			public Adapter caseChoice(Choice object) {
				return createChoiceAdapter();
			}
			@Override
			public Adapter caseExit(Exit object) {
				return createExitAdapter();
			}
			@Override
			public Adapter caseFinalState(FinalState object) {
				return createFinalStateAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link sgraph.Pseudostate <em>Pseudostate</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sgraph.Pseudostate
	 * @generated
	 */
	public Adapter createPseudostateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sgraph.Vertex <em>Vertex</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sgraph.Vertex
	 * @generated
	 */
	public Adapter createVertexAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sgraph.Region <em>Region</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sgraph.Region
	 * @generated
	 */
	public Adapter createRegionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sgraph.Transition <em>Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sgraph.Transition
	 * @generated
	 */
	public Adapter createTransitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sgraph.Statechart <em>Statechart</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sgraph.Statechart
	 * @generated
	 */
	public Adapter createStatechartAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sgraph.Entry <em>Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sgraph.Entry
	 * @generated
	 */
	public Adapter createEntryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sgraph.Synchronization <em>Synchronization</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sgraph.Synchronization
	 * @generated
	 */
	public Adapter createSynchronizationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sgraph.State <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sgraph.State
	 * @generated
	 */
	public Adapter createStateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sgraph.RegularState <em>Regular State</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sgraph.RegularState
	 * @generated
	 */
	public Adapter createRegularStateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sgraph.CompositeElement <em>Composite Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sgraph.CompositeElement
	 * @generated
	 */
	public Adapter createCompositeElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sgraph.Choice <em>Choice</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sgraph.Choice
	 * @generated
	 */
	public Adapter createChoiceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sgraph.Exit <em>Exit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sgraph.Exit
	 * @generated
	 */
	public Adapter createExitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sgraph.FinalState <em>Final State</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sgraph.FinalState
	 * @generated
	 */
	public Adapter createFinalStateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //SgraphAdapterFactory
