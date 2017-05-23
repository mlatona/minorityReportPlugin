package general.model.diagram.navigator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;

import org.eclipse.core.resources.IFile;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.workspace.util.WorkspaceSynchronizer;
import org.eclipse.gmf.runtime.emf.core.GMFEditingDomainFactory;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.Edge;
import org.eclipse.gmf.runtime.notation.Node;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.ui.IMemento;
import org.eclipse.ui.navigator.ICommonContentExtensionSite;
import org.eclipse.ui.navigator.ICommonContentProvider;

import general.model.diagram.edit.parts.BehaviouralDescriptionEditPart;
import general.model.diagram.edit.parts.BehaviouralDescriptionHappensEditPart;
import general.model.diagram.edit.parts.BehaviouralDescriptionHoldsAtBetweensEditPart;
import general.model.diagram.edit.parts.BehaviouralDescriptionHoldsAtsEditPart;
import general.model.diagram.edit.parts.ComplexEventBehaviouralDescriptionsEditPart;
import general.model.diagram.edit.parts.ComplexEventEditPart;
import general.model.diagram.edit.parts.ContextRelationEditPart;
import general.model.diagram.edit.parts.ContextRelationEndingComplexEventEditPart;
import general.model.diagram.edit.parts.ContextRelationInitialComplexEventEditPart;
import general.model.diagram.edit.parts.ContextRelationParametersEditPart;
import general.model.diagram.edit.parts.EnvironmentEditPart;
import general.model.diagram.edit.parts.EventParametersEditPart;
import general.model.diagram.edit.parts.HappensEditPart;
import general.model.diagram.edit.parts.HappensEventEditPart;
import general.model.diagram.edit.parts.HoldsAtBetweenContextRelationEditPart;
import general.model.diagram.edit.parts.HoldsAtBetweenEditPart;
import general.model.diagram.edit.parts.HoldsAtContextRelationEditPart;
import general.model.diagram.edit.parts.HoldsAtEditPart;
import general.model.diagram.edit.parts.InitiallyContextRelationEditPart;
import general.model.diagram.edit.parts.InitiallyEditPart;
import general.model.diagram.edit.parts.InitiallyHappensEditPart;
import general.model.diagram.edit.parts.InitiallyHoldsAtBetweensEditPart;
import general.model.diagram.edit.parts.InitiallyHoldsAtsEditPart;
import general.model.diagram.edit.parts.InstanceEditPart;
import general.model.diagram.edit.parts.InstanceTypeEditPart;
import general.model.diagram.edit.parts.ParameterEditPart;
import general.model.diagram.edit.parts.ParameterInstanceEditPart;
import general.model.diagram.edit.parts.ParameterTypeEditPart;
import general.model.diagram.edit.parts.PrimitiveEventEditPart;
import general.model.diagram.edit.parts.TypeEditPart;
import general.model.diagram.part.Messages;
import general.model.diagram.part.ModelVisualIDRegistry;

/**
 * @generated
 */
public class ModelNavigatorContentProvider implements ICommonContentProvider {

	/**
	* @generated
	*/
	private static final Object[] EMPTY_ARRAY = new Object[0];

	/**
	* @generated
	*/
	private Viewer myViewer;

	/**
	* @generated
	*/
	private AdapterFactoryEditingDomain myEditingDomain;

	/**
	* @generated
	*/
	private WorkspaceSynchronizer myWorkspaceSynchronizer;

	/**
	* @generated
	*/
	private Runnable myViewerRefreshRunnable;

	/**
	* @generated
	*/
	@SuppressWarnings({ "unchecked", "serial", "rawtypes" })
	public ModelNavigatorContentProvider() {
		TransactionalEditingDomain editingDomain = GMFEditingDomainFactory.INSTANCE.createEditingDomain();
		myEditingDomain = (AdapterFactoryEditingDomain) editingDomain;
		myEditingDomain.setResourceToReadOnlyMap(new HashMap() {
			public Object get(Object key) {
				if (!containsKey(key)) {
					put(key, Boolean.TRUE);
				}
				return super.get(key);
			}
		});
		myViewerRefreshRunnable = new Runnable() {
			public void run() {
				if (myViewer != null) {
					myViewer.refresh();
				}
			}
		};
		myWorkspaceSynchronizer = new WorkspaceSynchronizer(editingDomain, new WorkspaceSynchronizer.Delegate() {
			public void dispose() {
			}

			public boolean handleResourceChanged(final Resource resource) {
				unloadAllResources();
				asyncRefresh();
				return true;
			}

			public boolean handleResourceDeleted(Resource resource) {
				unloadAllResources();
				asyncRefresh();
				return true;
			}

			public boolean handleResourceMoved(Resource resource, final URI newURI) {
				unloadAllResources();
				asyncRefresh();
				return true;
			}
		});
	}

	/**
	* @generated
	*/
	public void dispose() {
		myWorkspaceSynchronizer.dispose();
		myWorkspaceSynchronizer = null;
		myViewerRefreshRunnable = null;
		myViewer = null;
		unloadAllResources();
		((TransactionalEditingDomain) myEditingDomain).dispose();
		myEditingDomain = null;
	}

	/**
	* @generated
	*/
	public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
		myViewer = viewer;
	}

	/**
	* @generated
	*/
	void unloadAllResources() {
		for (Resource nextResource : myEditingDomain.getResourceSet().getResources()) {
			nextResource.unload();
		}
	}

	/**
	* @generated
	*/
	void asyncRefresh() {
		if (myViewer != null && !myViewer.getControl().isDisposed()) {
			myViewer.getControl().getDisplay().asyncExec(myViewerRefreshRunnable);
		}
	}

	/**
	* @generated
	*/
	public Object[] getElements(Object inputElement) {
		return getChildren(inputElement);
	}

	/**
	* @generated
	*/
	public void restoreState(IMemento aMemento) {
	}

	/**
	 * @generated
	 */
	public void saveState(IMemento aMemento) {
	}

	/**
	* @generated
	*/
	public void init(ICommonContentExtensionSite aConfig) {
	}

	/**
	* @generated
	*/
	public Object[] getChildren(Object parentElement) {
		if (parentElement instanceof IFile) {
			IFile file = (IFile) parentElement;
			URI fileURI = URI.createPlatformResourceURI(file.getFullPath().toString(), true);
			Resource resource = myEditingDomain.getResourceSet().getResource(fileURI, true);
			ArrayList<ModelNavigatorItem> result = new ArrayList<ModelNavigatorItem>();
			ArrayList<View> topViews = new ArrayList<View>(resource.getContents().size());
			for (EObject o : resource.getContents()) {
				if (o instanceof View) {
					topViews.add((View) o);
				}
			}
			result.addAll(createNavigatorItems(selectViewsByType(topViews, EnvironmentEditPart.MODEL_ID), file, false));
			return result.toArray();
		}

		if (parentElement instanceof ModelNavigatorGroup) {
			ModelNavigatorGroup group = (ModelNavigatorGroup) parentElement;
			return group.getChildren();
		}

		if (parentElement instanceof ModelNavigatorItem) {
			ModelNavigatorItem navigatorItem = (ModelNavigatorItem) parentElement;
			if (navigatorItem.isLeaf() || !isOwnView(navigatorItem.getView())) {
				return EMPTY_ARRAY;
			}
			return getViewChildren(navigatorItem.getView(), parentElement);
		}

		return EMPTY_ARRAY;
	}

	/**
	* @generated
	*/
	private Object[] getViewChildren(View view, Object parentElement) {
		switch (ModelVisualIDRegistry.getVisualID(view)) {

		case EnvironmentEditPart.VISUAL_ID: {
			LinkedList<ModelAbstractNavigatorItem> result = new LinkedList<ModelAbstractNavigatorItem>();
			Diagram sv = (Diagram) view;
			ModelNavigatorGroup links = new ModelNavigatorGroup(Messages.NavigatorGroupName_Environment_1000_links,
					"icons/linksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					ModelVisualIDRegistry.getType(TypeEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					ModelVisualIDRegistry.getType(ParameterEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					ModelVisualIDRegistry.getType(HoldsAtBetweenEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					ModelVisualIDRegistry.getType(InstanceEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					ModelVisualIDRegistry.getType(HappensEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					ModelVisualIDRegistry.getType(InitiallyEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					ModelVisualIDRegistry.getType(BehaviouralDescriptionEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					ModelVisualIDRegistry.getType(HoldsAtEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					ModelVisualIDRegistry.getType(PrimitiveEventEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					ModelVisualIDRegistry.getType(ComplexEventEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					ModelVisualIDRegistry.getType(ContextRelationEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getDiagramLinksByType(Collections.singleton(sv),
					ModelVisualIDRegistry.getType(HoldsAtContextRelationEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(Collections.singleton(sv),
					ModelVisualIDRegistry.getType(ParameterInstanceEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(Collections.singleton(sv),
					ModelVisualIDRegistry.getType(ContextRelationParametersEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(Collections.singleton(sv),
					ModelVisualIDRegistry.getType(ParameterTypeEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(Collections.singleton(sv),
					ModelVisualIDRegistry.getType(InitiallyContextRelationEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(Collections.singleton(sv),
					ModelVisualIDRegistry.getType(ContextRelationEndingComplexEventEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(Collections.singleton(sv),
					ModelVisualIDRegistry.getType(HappensEventEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(Collections.singleton(sv),
					ModelVisualIDRegistry.getType(InitiallyHoldsAtsEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(Collections.singleton(sv),
					ModelVisualIDRegistry.getType(InitiallyHoldsAtBetweensEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(Collections.singleton(sv),
					ModelVisualIDRegistry.getType(ComplexEventBehaviouralDescriptionsEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(Collections.singleton(sv),
					ModelVisualIDRegistry.getType(InitiallyHappensEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(Collections.singleton(sv),
					ModelVisualIDRegistry.getType(EventParametersEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(Collections.singleton(sv),
					ModelVisualIDRegistry.getType(HoldsAtBetweenContextRelationEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(Collections.singleton(sv),
					ModelVisualIDRegistry.getType(BehaviouralDescriptionHoldsAtBetweensEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(Collections.singleton(sv),
					ModelVisualIDRegistry.getType(BehaviouralDescriptionHoldsAtsEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(Collections.singleton(sv),
					ModelVisualIDRegistry.getType(ContextRelationInitialComplexEventEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(Collections.singleton(sv),
					ModelVisualIDRegistry.getType(BehaviouralDescriptionHappensEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(Collections.singleton(sv),
					ModelVisualIDRegistry.getType(InstanceTypeEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			if (!links.isEmpty()) {
				result.add(links);
			}
			return result.toArray();
		}

		case TypeEditPart.VISUAL_ID: {
			LinkedList<ModelAbstractNavigatorItem> result = new LinkedList<ModelAbstractNavigatorItem>();
			Node sv = (Node) view;
			ModelNavigatorGroup incominglinks = new ModelNavigatorGroup(
					Messages.NavigatorGroupName_Type_2001_incominglinks, "icons/incomingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					ModelVisualIDRegistry.getType(ParameterTypeEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					ModelVisualIDRegistry.getType(InstanceTypeEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}

		case ParameterEditPart.VISUAL_ID: {
			LinkedList<ModelAbstractNavigatorItem> result = new LinkedList<ModelAbstractNavigatorItem>();
			Node sv = (Node) view;
			ModelNavigatorGroup outgoinglinks = new ModelNavigatorGroup(
					Messages.NavigatorGroupName_Parameter_2002_outgoinglinks, "icons/outgoingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			ModelNavigatorGroup incominglinks = new ModelNavigatorGroup(
					Messages.NavigatorGroupName_Parameter_2002_incominglinks, "icons/incomingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			Collection<View> connectedViews;
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					ModelVisualIDRegistry.getType(ParameterInstanceEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					ModelVisualIDRegistry.getType(ContextRelationParametersEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					ModelVisualIDRegistry.getType(ParameterTypeEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					ModelVisualIDRegistry.getType(EventParametersEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}

		case HoldsAtBetweenEditPart.VISUAL_ID: {
			LinkedList<ModelAbstractNavigatorItem> result = new LinkedList<ModelAbstractNavigatorItem>();
			Node sv = (Node) view;
			ModelNavigatorGroup incominglinks = new ModelNavigatorGroup(
					Messages.NavigatorGroupName_HoldsAtBetween_2003_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			ModelNavigatorGroup outgoinglinks = new ModelNavigatorGroup(
					Messages.NavigatorGroupName_HoldsAtBetween_2003_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					ModelVisualIDRegistry.getType(InitiallyHoldsAtBetweensEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					ModelVisualIDRegistry.getType(HoldsAtBetweenContextRelationEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					ModelVisualIDRegistry.getType(BehaviouralDescriptionHoldsAtBetweensEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case InstanceEditPart.VISUAL_ID: {
			LinkedList<ModelAbstractNavigatorItem> result = new LinkedList<ModelAbstractNavigatorItem>();
			Node sv = (Node) view;
			ModelNavigatorGroup incominglinks = new ModelNavigatorGroup(
					Messages.NavigatorGroupName_Instance_2004_incominglinks, "icons/incomingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			ModelNavigatorGroup outgoinglinks = new ModelNavigatorGroup(
					Messages.NavigatorGroupName_Instance_2004_outgoinglinks, "icons/outgoingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					ModelVisualIDRegistry.getType(ParameterInstanceEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					ModelVisualIDRegistry.getType(InstanceTypeEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case HappensEditPart.VISUAL_ID: {
			LinkedList<ModelAbstractNavigatorItem> result = new LinkedList<ModelAbstractNavigatorItem>();
			Node sv = (Node) view;
			ModelNavigatorGroup outgoinglinks = new ModelNavigatorGroup(
					Messages.NavigatorGroupName_Happens_2005_outgoinglinks, "icons/outgoingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			ModelNavigatorGroup incominglinks = new ModelNavigatorGroup(
					Messages.NavigatorGroupName_Happens_2005_incominglinks, "icons/incomingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			Collection<View> connectedViews;
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					ModelVisualIDRegistry.getType(HappensEventEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					ModelVisualIDRegistry.getType(InitiallyHappensEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					ModelVisualIDRegistry.getType(BehaviouralDescriptionHappensEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}

		case InitiallyEditPart.VISUAL_ID: {
			LinkedList<ModelAbstractNavigatorItem> result = new LinkedList<ModelAbstractNavigatorItem>();
			Node sv = (Node) view;
			ModelNavigatorGroup outgoinglinks = new ModelNavigatorGroup(
					Messages.NavigatorGroupName_Initially_2006_outgoinglinks, "icons/outgoingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			Collection<View> connectedViews;
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					ModelVisualIDRegistry.getType(InitiallyContextRelationEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					ModelVisualIDRegistry.getType(InitiallyHoldsAtsEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					ModelVisualIDRegistry.getType(InitiallyHoldsAtBetweensEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					ModelVisualIDRegistry.getType(InitiallyHappensEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case BehaviouralDescriptionEditPart.VISUAL_ID: {
			LinkedList<ModelAbstractNavigatorItem> result = new LinkedList<ModelAbstractNavigatorItem>();
			Node sv = (Node) view;
			ModelNavigatorGroup incominglinks = new ModelNavigatorGroup(
					Messages.NavigatorGroupName_BehaviouralDescription_2007_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			ModelNavigatorGroup outgoinglinks = new ModelNavigatorGroup(
					Messages.NavigatorGroupName_BehaviouralDescription_2007_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					ModelVisualIDRegistry.getType(ComplexEventBehaviouralDescriptionsEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					ModelVisualIDRegistry.getType(BehaviouralDescriptionHoldsAtBetweensEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					ModelVisualIDRegistry.getType(BehaviouralDescriptionHoldsAtsEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					ModelVisualIDRegistry.getType(BehaviouralDescriptionHappensEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case HoldsAtEditPart.VISUAL_ID: {
			LinkedList<ModelAbstractNavigatorItem> result = new LinkedList<ModelAbstractNavigatorItem>();
			Node sv = (Node) view;
			ModelNavigatorGroup outgoinglinks = new ModelNavigatorGroup(
					Messages.NavigatorGroupName_HoldsAt_2008_outgoinglinks, "icons/outgoingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			ModelNavigatorGroup incominglinks = new ModelNavigatorGroup(
					Messages.NavigatorGroupName_HoldsAt_2008_incominglinks, "icons/incomingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			Collection<View> connectedViews;
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					ModelVisualIDRegistry.getType(HoldsAtContextRelationEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					ModelVisualIDRegistry.getType(InitiallyHoldsAtsEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					ModelVisualIDRegistry.getType(BehaviouralDescriptionHoldsAtsEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}

		case ComplexEventEditPart.VISUAL_ID: {
			LinkedList<ModelAbstractNavigatorItem> result = new LinkedList<ModelAbstractNavigatorItem>();
			Node sv = (Node) view;
			ModelNavigatorGroup incominglinks = new ModelNavigatorGroup(
					Messages.NavigatorGroupName_ComplexEvent_2010_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			ModelNavigatorGroup outgoinglinks = new ModelNavigatorGroup(
					Messages.NavigatorGroupName_ComplexEvent_2010_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					ModelVisualIDRegistry.getType(ContextRelationEndingComplexEventEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					ModelVisualIDRegistry.getType(HappensEventEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					ModelVisualIDRegistry.getType(ComplexEventBehaviouralDescriptionsEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					ModelVisualIDRegistry.getType(EventParametersEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					ModelVisualIDRegistry.getType(ContextRelationInitialComplexEventEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case ContextRelationEditPart.VISUAL_ID: {
			LinkedList<ModelAbstractNavigatorItem> result = new LinkedList<ModelAbstractNavigatorItem>();
			Node sv = (Node) view;
			ModelNavigatorGroup incominglinks = new ModelNavigatorGroup(
					Messages.NavigatorGroupName_ContextRelation_2011_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			ModelNavigatorGroup outgoinglinks = new ModelNavigatorGroup(
					Messages.NavigatorGroupName_ContextRelation_2011_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					ModelVisualIDRegistry.getType(HoldsAtContextRelationEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					ModelVisualIDRegistry.getType(ContextRelationParametersEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					ModelVisualIDRegistry.getType(InitiallyContextRelationEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					ModelVisualIDRegistry.getType(ContextRelationEndingComplexEventEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					ModelVisualIDRegistry.getType(HoldsAtBetweenContextRelationEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					ModelVisualIDRegistry.getType(ContextRelationInitialComplexEventEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case PrimitiveEventEditPart.VISUAL_ID: {
			LinkedList<ModelAbstractNavigatorItem> result = new LinkedList<ModelAbstractNavigatorItem>();
			Node sv = (Node) view;
			ModelNavigatorGroup incominglinks = new ModelNavigatorGroup(
					Messages.NavigatorGroupName_PrimitiveEvent_2012_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			ModelNavigatorGroup outgoinglinks = new ModelNavigatorGroup(
					Messages.NavigatorGroupName_PrimitiveEvent_2012_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					ModelVisualIDRegistry.getType(HappensEventEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					ModelVisualIDRegistry.getType(EventParametersEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case HoldsAtContextRelationEditPart.VISUAL_ID: {
			LinkedList<ModelAbstractNavigatorItem> result = new LinkedList<ModelAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			ModelNavigatorGroup target = new ModelNavigatorGroup(
					Messages.NavigatorGroupName_HoldsAtContextRelation_4001_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			ModelNavigatorGroup source = new ModelNavigatorGroup(
					Messages.NavigatorGroupName_HoldsAtContextRelation_4001_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ModelVisualIDRegistry.getType(ContextRelationEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ModelVisualIDRegistry.getType(HoldsAtEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case ParameterInstanceEditPart.VISUAL_ID: {
			LinkedList<ModelAbstractNavigatorItem> result = new LinkedList<ModelAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			ModelNavigatorGroup target = new ModelNavigatorGroup(
					Messages.NavigatorGroupName_ParameterInstance_4002_target, "icons/linkTargetNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			ModelNavigatorGroup source = new ModelNavigatorGroup(
					Messages.NavigatorGroupName_ParameterInstance_4002_source, "icons/linkSourceNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ModelVisualIDRegistry.getType(InstanceEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ModelVisualIDRegistry.getType(ParameterEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case ContextRelationParametersEditPart.VISUAL_ID: {
			LinkedList<ModelAbstractNavigatorItem> result = new LinkedList<ModelAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			ModelNavigatorGroup target = new ModelNavigatorGroup(
					Messages.NavigatorGroupName_ContextRelationParameters_4003_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			ModelNavigatorGroup source = new ModelNavigatorGroup(
					Messages.NavigatorGroupName_ContextRelationParameters_4003_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ModelVisualIDRegistry.getType(ParameterEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ModelVisualIDRegistry.getType(ContextRelationEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case ParameterTypeEditPart.VISUAL_ID: {
			LinkedList<ModelAbstractNavigatorItem> result = new LinkedList<ModelAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			ModelNavigatorGroup target = new ModelNavigatorGroup(Messages.NavigatorGroupName_ParameterType_4004_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			ModelNavigatorGroup source = new ModelNavigatorGroup(Messages.NavigatorGroupName_ParameterType_4004_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ModelVisualIDRegistry.getType(TypeEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ModelVisualIDRegistry.getType(ParameterEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case InitiallyContextRelationEditPart.VISUAL_ID: {
			LinkedList<ModelAbstractNavigatorItem> result = new LinkedList<ModelAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			ModelNavigatorGroup target = new ModelNavigatorGroup(
					Messages.NavigatorGroupName_InitiallyContextRelation_4005_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			ModelNavigatorGroup source = new ModelNavigatorGroup(
					Messages.NavigatorGroupName_InitiallyContextRelation_4005_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ModelVisualIDRegistry.getType(ContextRelationEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ModelVisualIDRegistry.getType(InitiallyEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case ContextRelationEndingComplexEventEditPart.VISUAL_ID: {
			LinkedList<ModelAbstractNavigatorItem> result = new LinkedList<ModelAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			ModelNavigatorGroup target = new ModelNavigatorGroup(
					Messages.NavigatorGroupName_ContextRelationEndingComplexEvent_4006_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			ModelNavigatorGroup source = new ModelNavigatorGroup(
					Messages.NavigatorGroupName_ContextRelationEndingComplexEvent_4006_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ModelVisualIDRegistry.getType(ComplexEventEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ModelVisualIDRegistry.getType(ContextRelationEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case HappensEventEditPart.VISUAL_ID: {
			LinkedList<ModelAbstractNavigatorItem> result = new LinkedList<ModelAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			ModelNavigatorGroup target = new ModelNavigatorGroup(Messages.NavigatorGroupName_HappensEvent_4007_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			ModelNavigatorGroup source = new ModelNavigatorGroup(Messages.NavigatorGroupName_HappensEvent_4007_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ModelVisualIDRegistry.getType(PrimitiveEventEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ModelVisualIDRegistry.getType(ComplexEventEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ModelVisualIDRegistry.getType(HappensEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case InitiallyHoldsAtsEditPart.VISUAL_ID: {
			LinkedList<ModelAbstractNavigatorItem> result = new LinkedList<ModelAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			ModelNavigatorGroup target = new ModelNavigatorGroup(
					Messages.NavigatorGroupName_InitiallyHoldsAts_4008_target, "icons/linkTargetNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			ModelNavigatorGroup source = new ModelNavigatorGroup(
					Messages.NavigatorGroupName_InitiallyHoldsAts_4008_source, "icons/linkSourceNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ModelVisualIDRegistry.getType(HoldsAtEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ModelVisualIDRegistry.getType(InitiallyEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case InitiallyHoldsAtBetweensEditPart.VISUAL_ID: {
			LinkedList<ModelAbstractNavigatorItem> result = new LinkedList<ModelAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			ModelNavigatorGroup target = new ModelNavigatorGroup(
					Messages.NavigatorGroupName_InitiallyHoldsAtBetweens_4009_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			ModelNavigatorGroup source = new ModelNavigatorGroup(
					Messages.NavigatorGroupName_InitiallyHoldsAtBetweens_4009_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ModelVisualIDRegistry.getType(HoldsAtBetweenEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ModelVisualIDRegistry.getType(InitiallyEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case ComplexEventBehaviouralDescriptionsEditPart.VISUAL_ID: {
			LinkedList<ModelAbstractNavigatorItem> result = new LinkedList<ModelAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			ModelNavigatorGroup target = new ModelNavigatorGroup(
					Messages.NavigatorGroupName_ComplexEventBehaviouralDescriptions_4010_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			ModelNavigatorGroup source = new ModelNavigatorGroup(
					Messages.NavigatorGroupName_ComplexEventBehaviouralDescriptions_4010_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ModelVisualIDRegistry.getType(BehaviouralDescriptionEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ModelVisualIDRegistry.getType(ComplexEventEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case InitiallyHappensEditPart.VISUAL_ID: {
			LinkedList<ModelAbstractNavigatorItem> result = new LinkedList<ModelAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			ModelNavigatorGroup target = new ModelNavigatorGroup(
					Messages.NavigatorGroupName_InitiallyHappens_4011_target, "icons/linkTargetNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			ModelNavigatorGroup source = new ModelNavigatorGroup(
					Messages.NavigatorGroupName_InitiallyHappens_4011_source, "icons/linkSourceNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ModelVisualIDRegistry.getType(HappensEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ModelVisualIDRegistry.getType(InitiallyEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case EventParametersEditPart.VISUAL_ID: {
			LinkedList<ModelAbstractNavigatorItem> result = new LinkedList<ModelAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			ModelNavigatorGroup target = new ModelNavigatorGroup(
					Messages.NavigatorGroupName_EventParameters_4012_target, "icons/linkTargetNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			ModelNavigatorGroup source = new ModelNavigatorGroup(
					Messages.NavigatorGroupName_EventParameters_4012_source, "icons/linkSourceNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ModelVisualIDRegistry.getType(ParameterEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ModelVisualIDRegistry.getType(PrimitiveEventEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ModelVisualIDRegistry.getType(ComplexEventEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case HoldsAtBetweenContextRelationEditPart.VISUAL_ID: {
			LinkedList<ModelAbstractNavigatorItem> result = new LinkedList<ModelAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			ModelNavigatorGroup target = new ModelNavigatorGroup(
					Messages.NavigatorGroupName_HoldsAtBetweenContextRelation_4013_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			ModelNavigatorGroup source = new ModelNavigatorGroup(
					Messages.NavigatorGroupName_HoldsAtBetweenContextRelation_4013_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ModelVisualIDRegistry.getType(ContextRelationEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ModelVisualIDRegistry.getType(HoldsAtBetweenEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case BehaviouralDescriptionHoldsAtBetweensEditPart.VISUAL_ID: {
			LinkedList<ModelAbstractNavigatorItem> result = new LinkedList<ModelAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			ModelNavigatorGroup target = new ModelNavigatorGroup(
					Messages.NavigatorGroupName_BehaviouralDescriptionHoldsAtBetweens_4014_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			ModelNavigatorGroup source = new ModelNavigatorGroup(
					Messages.NavigatorGroupName_BehaviouralDescriptionHoldsAtBetweens_4014_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ModelVisualIDRegistry.getType(HoldsAtBetweenEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ModelVisualIDRegistry.getType(BehaviouralDescriptionEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case BehaviouralDescriptionHoldsAtsEditPart.VISUAL_ID: {
			LinkedList<ModelAbstractNavigatorItem> result = new LinkedList<ModelAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			ModelNavigatorGroup target = new ModelNavigatorGroup(
					Messages.NavigatorGroupName_BehaviouralDescriptionHoldsAts_4015_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			ModelNavigatorGroup source = new ModelNavigatorGroup(
					Messages.NavigatorGroupName_BehaviouralDescriptionHoldsAts_4015_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ModelVisualIDRegistry.getType(HoldsAtEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ModelVisualIDRegistry.getType(BehaviouralDescriptionEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case ContextRelationInitialComplexEventEditPart.VISUAL_ID: {
			LinkedList<ModelAbstractNavigatorItem> result = new LinkedList<ModelAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			ModelNavigatorGroup target = new ModelNavigatorGroup(
					Messages.NavigatorGroupName_ContextRelationInitialComplexEvent_4016_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			ModelNavigatorGroup source = new ModelNavigatorGroup(
					Messages.NavigatorGroupName_ContextRelationInitialComplexEvent_4016_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ModelVisualIDRegistry.getType(ComplexEventEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ModelVisualIDRegistry.getType(ContextRelationEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case BehaviouralDescriptionHappensEditPart.VISUAL_ID: {
			LinkedList<ModelAbstractNavigatorItem> result = new LinkedList<ModelAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			ModelNavigatorGroup target = new ModelNavigatorGroup(
					Messages.NavigatorGroupName_BehaviouralDescriptionHappens_4017_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			ModelNavigatorGroup source = new ModelNavigatorGroup(
					Messages.NavigatorGroupName_BehaviouralDescriptionHappens_4017_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ModelVisualIDRegistry.getType(HappensEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ModelVisualIDRegistry.getType(BehaviouralDescriptionEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case InstanceTypeEditPart.VISUAL_ID: {
			LinkedList<ModelAbstractNavigatorItem> result = new LinkedList<ModelAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			ModelNavigatorGroup target = new ModelNavigatorGroup(Messages.NavigatorGroupName_InstanceType_4018_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			ModelNavigatorGroup source = new ModelNavigatorGroup(Messages.NavigatorGroupName_InstanceType_4018_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ModelVisualIDRegistry.getType(TypeEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ModelVisualIDRegistry.getType(InstanceEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}
		}
		return EMPTY_ARRAY;
	}

	/**
	* @generated
	*/
	private Collection<View> getLinksSourceByType(Collection<Edge> edges, String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (Edge nextEdge : edges) {
			View nextEdgeSource = nextEdge.getSource();
			if (type.equals(nextEdgeSource.getType()) && isOwnView(nextEdgeSource)) {
				result.add(nextEdgeSource);
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getLinksTargetByType(Collection<Edge> edges, String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (Edge nextEdge : edges) {
			View nextEdgeTarget = nextEdge.getTarget();
			if (type.equals(nextEdgeTarget.getType()) && isOwnView(nextEdgeTarget)) {
				result.add(nextEdgeTarget);
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getOutgoingLinksByType(Collection<? extends View> nodes, String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (View nextNode : nodes) {
			result.addAll(selectViewsByType(nextNode.getSourceEdges(), type));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getIncomingLinksByType(Collection<? extends View> nodes, String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (View nextNode : nodes) {
			result.addAll(selectViewsByType(nextNode.getTargetEdges(), type));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getChildrenByType(Collection<? extends View> nodes, String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (View nextNode : nodes) {
			result.addAll(selectViewsByType(nextNode.getChildren(), type));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getDiagramLinksByType(Collection<Diagram> diagrams, String type) {
		ArrayList<View> result = new ArrayList<View>();
		for (Diagram nextDiagram : diagrams) {
			result.addAll(selectViewsByType(nextDiagram.getEdges(), type));
		}
		return result;
	}

	// TODO refactor as static method
	/**
	 * @generated
	 */
	private Collection<View> selectViewsByType(Collection<View> views, String type) {
		ArrayList<View> result = new ArrayList<View>();
		for (View nextView : views) {
			if (type.equals(nextView.getType()) && isOwnView(nextView)) {
				result.add(nextView);
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isOwnView(View view) {
		return EnvironmentEditPart.MODEL_ID.equals(ModelVisualIDRegistry.getModelID(view));
	}

	/**
	 * @generated
	 */
	private Collection<ModelNavigatorItem> createNavigatorItems(Collection<View> views, Object parent,
			boolean isLeafs) {
		ArrayList<ModelNavigatorItem> result = new ArrayList<ModelNavigatorItem>(views.size());
		for (View nextView : views) {
			result.add(new ModelNavigatorItem(nextView, parent, isLeafs));
		}
		return result;
	}

	/**
	* @generated
	*/
	public Object getParent(Object element) {
		if (element instanceof ModelAbstractNavigatorItem) {
			ModelAbstractNavigatorItem abstractNavigatorItem = (ModelAbstractNavigatorItem) element;
			return abstractNavigatorItem.getParent();
		}
		return null;
	}

	/**
	* @generated
	*/
	public boolean hasChildren(Object element) {
		return element instanceof IFile || getChildren(element).length > 0;
	}

}
