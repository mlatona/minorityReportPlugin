
package model.diagram.part;

import java.util.Collections;

import org.eclipse.gef.palette.PaletteContainer;
import org.eclipse.gef.palette.PaletteGroup;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.ToolEntry;
import org.eclipse.gmf.tooling.runtime.part.DefaultNodeToolEntry;

import model.diagram.providers.ModelElementTypes;

/**
 * @generated
 */
public class ModelPaletteFactory {

	/**
	* @generated
	*/
	public void fillPalette(PaletteRoot paletteRoot) {
		paletteRoot.add(createModel1Group());
	}

	/**
	* Creates "model" palette tool group
	* @generated
	*/
	private PaletteContainer createModel1Group() {
		PaletteGroup paletteContainer = new PaletteGroup(Messages.Model1Group_title);
		paletteContainer.setId("createModel1Group"); //$NON-NLS-1$
		paletteContainer.add(createType1CreationTool());
		paletteContainer.add(createInstance2CreationTool());
		paletteContainer.add(createParameter3CreationTool());
		paletteContainer.add(createContextRelation4CreationTool());
		paletteContainer.add(createPrimitiveEvent5CreationTool());
		paletteContainer.add(createComplexEvent6CreationTool());
		paletteContainer.add(createBehaviouralDescription7CreationTool());
		paletteContainer.add(createHoldsAt8CreationTool());
		paletteContainer.add(createHappens9CreationTool());
		paletteContainer.add(createHoldsAtBetween10CreationTool());
		paletteContainer.add(createInitially11CreationTool());
		return paletteContainer;
	}

	/**
	* @generated
	*/
	private ToolEntry createType1CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Type1CreationTool_title,
				Messages.Type1CreationTool_desc, Collections.singletonList(ModelElementTypes.Type_2001));
		entry.setId("createType1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ModelDiagramEditorPlugin
				.findImageDescriptor("/org.eclipse.minorityReportPlugin.edit/icons/typelogo.gif")); //$NON-NLS-1$
		entry.setLargeIcon(ModelDiagramEditorPlugin
				.findImageDescriptor("/org.eclipse.minorityReportPlugin.edit/icons/typelogo.gif")); //$NON-NLS-1$
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createInstance2CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Instance2CreationTool_title,
				Messages.Instance2CreationTool_desc, Collections.singletonList(ModelElementTypes.Instance_2004));
		entry.setId("createInstance2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ModelElementTypes.getImageDescriptor(ModelElementTypes.Instance_2004));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createParameter3CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Parameter3CreationTool_title,
				Messages.Parameter3CreationTool_desc, Collections.singletonList(ModelElementTypes.Parameter_2002));
		entry.setId("createParameter3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ModelElementTypes.getImageDescriptor(ModelElementTypes.Parameter_2002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createContextRelation4CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.ContextRelation4CreationTool_title,
				Messages.ContextRelation4CreationTool_desc,
				Collections.singletonList(ModelElementTypes.ContextRelation_2011));
		entry.setId("createContextRelation4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ModelElementTypes.getImageDescriptor(ModelElementTypes.ContextRelation_2011));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createPrimitiveEvent5CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.PrimitiveEvent5CreationTool_title,
				Messages.PrimitiveEvent5CreationTool_desc,
				Collections.singletonList(ModelElementTypes.PrimitiveEvent_2009));
		entry.setId("createPrimitiveEvent5CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ModelElementTypes.getImageDescriptor(ModelElementTypes.PrimitiveEvent_2009));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createComplexEvent6CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.ComplexEvent6CreationTool_title,
				Messages.ComplexEvent6CreationTool_desc,
				Collections.singletonList(ModelElementTypes.ComplexEvent_2010));
		entry.setId("createComplexEvent6CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ModelElementTypes.getImageDescriptor(ModelElementTypes.ComplexEvent_2010));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createBehaviouralDescription7CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.BehaviouralDescription7CreationTool_title,
				Messages.BehaviouralDescription7CreationTool_desc,
				Collections.singletonList(ModelElementTypes.BehaviouralDescription_2007));
		entry.setId("createBehaviouralDescription7CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ModelElementTypes.getImageDescriptor(ModelElementTypes.BehaviouralDescription_2007));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createHoldsAt8CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.HoldsAt8CreationTool_title,
				Messages.HoldsAt8CreationTool_desc, Collections.singletonList(ModelElementTypes.HoldsAt_2008));
		entry.setId("createHoldsAt8CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ModelElementTypes.getImageDescriptor(ModelElementTypes.HoldsAt_2008));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createHappens9CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Happens9CreationTool_title,
				Messages.Happens9CreationTool_desc, Collections.singletonList(ModelElementTypes.Happens_2005));
		entry.setId("createHappens9CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ModelElementTypes.getImageDescriptor(ModelElementTypes.Happens_2005));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createHoldsAtBetween10CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.HoldsAtBetween10CreationTool_title,
				Messages.HoldsAtBetween10CreationTool_desc,
				Collections.singletonList(ModelElementTypes.HoldsAtBetween_2003));
		entry.setId("createHoldsAtBetween10CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ModelElementTypes.getImageDescriptor(ModelElementTypes.HoldsAtBetween_2003));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createInitially11CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Initially11CreationTool_title,
				Messages.Initially11CreationTool_desc, Collections.singletonList(ModelElementTypes.Initially_2006));
		entry.setId("createInitially11CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ModelElementTypes.getImageDescriptor(ModelElementTypes.Initially_2006));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

}
