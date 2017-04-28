
package model.diagram.part;

import java.util.Collections;

import org.eclipse.gef.palette.PaletteContainer;
import org.eclipse.gef.palette.PaletteGroup;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.ToolEntry;
import org.eclipse.gmf.tooling.runtime.part.DefaultLinkToolEntry;
import org.eclipse.gmf.tooling.runtime.part.DefaultNodeToolEntry;

import model.diagram.providers.GeneratorElementTypes;

/**
 * @generated
 */
public class GeneratorPaletteFactory {

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
		paletteContainer.add(createEventParameters6CreationTool());
		paletteContainer.add(createComplexEvent7CreationTool());
		paletteContainer.add(createBehaviouralDescription8CreationTool());
		paletteContainer.add(createBehaviouralDescriptionHoldsAts9CreationTool());
		paletteContainer.add(createBehaviouralDescriptionHappens10CreationTool());
		paletteContainer.add(createBehaviouralDescriptionHoldsAtBetweens11CreationTool());
		paletteContainer.add(createHoldsAt12CreationTool());
		paletteContainer.add(createHappens13CreationTool());
		paletteContainer.add(createHoldsAtBetween14CreationTool());
		paletteContainer.add(createInitially15CreationTool());
		return paletteContainer;
	}

	/**
	* @generated
	*/
	private ToolEntry createType1CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Type1CreationTool_title,
				Messages.Type1CreationTool_desc, Collections.singletonList(GeneratorElementTypes.Type_2008));
		entry.setId("createType1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(GeneratorElementTypes.getImageDescriptor(GeneratorElementTypes.Type_2008));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createInstance2CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Instance2CreationTool_title,
				Messages.Instance2CreationTool_desc, Collections.singletonList(GeneratorElementTypes.Instance_2001));
		entry.setId("createInstance2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(GeneratorElementTypes.getImageDescriptor(GeneratorElementTypes.Instance_2001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createParameter3CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Parameter3CreationTool_title,
				Messages.Parameter3CreationTool_desc, Collections.singletonList(GeneratorElementTypes.Parameter_2006));
		entry.setId("createParameter3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(GeneratorElementTypes.getImageDescriptor(GeneratorElementTypes.Parameter_2006));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createContextRelation4CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.ContextRelation4CreationTool_title,
				Messages.ContextRelation4CreationTool_desc,
				Collections.singletonList(GeneratorElementTypes.ContextRelation_2002));
		entry.setId("createContextRelation4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(GeneratorElementTypes.getImageDescriptor(GeneratorElementTypes.ContextRelation_2002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createPrimitiveEvent5CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.PrimitiveEvent5CreationTool_title,
				Messages.PrimitiveEvent5CreationTool_desc,
				Collections.singletonList(GeneratorElementTypes.PrimitiveEvent_2004));
		entry.setId("createPrimitiveEvent5CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(GeneratorElementTypes.getImageDescriptor(GeneratorElementTypes.PrimitiveEvent_2004));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createEventParameters6CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(Messages.EventParameters6CreationTool_title,
				Messages.EventParameters6CreationTool_desc,
				Collections.singletonList(GeneratorElementTypes.ParameterInstance_4011));
		entry.setId("createEventParameters6CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(GeneratorElementTypes.getImageDescriptor(GeneratorElementTypes.ParameterInstance_4011));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createComplexEvent7CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.ComplexEvent7CreationTool_title,
				Messages.ComplexEvent7CreationTool_desc,
				Collections.singletonList(GeneratorElementTypes.ComplexEvent_2005));
		entry.setId("createComplexEvent7CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(GeneratorElementTypes.getImageDescriptor(GeneratorElementTypes.ComplexEvent_2005));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createBehaviouralDescription8CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.BehaviouralDescription8CreationTool_title,
				Messages.BehaviouralDescription8CreationTool_desc,
				Collections.singletonList(GeneratorElementTypes.BehaviouralDescription_2010));
		entry.setId("createBehaviouralDescription8CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(GeneratorElementTypes.getImageDescriptor(GeneratorElementTypes.BehaviouralDescription_2010));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createBehaviouralDescriptionHoldsAts9CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(
				Messages.BehaviouralDescriptionHoldsAts9CreationTool_title,
				Messages.BehaviouralDescriptionHoldsAts9CreationTool_desc,
				Collections.singletonList(GeneratorElementTypes.ContextRelationParameters_4012));
		entry.setId("createBehaviouralDescriptionHoldsAts9CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(
				GeneratorElementTypes.getImageDescriptor(GeneratorElementTypes.ContextRelationParameters_4012));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createBehaviouralDescriptionHappens10CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(
				Messages.BehaviouralDescriptionHappens10CreationTool_title,
				Messages.BehaviouralDescriptionHappens10CreationTool_desc,
				Collections.singletonList(GeneratorElementTypes.ContextRelationEndingComplexEvent_4001));
		entry.setId("createBehaviouralDescriptionHappens10CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(
				GeneratorElementTypes.getImageDescriptor(GeneratorElementTypes.ContextRelationEndingComplexEvent_4001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createBehaviouralDescriptionHoldsAtBetweens11CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(
				Messages.BehaviouralDescriptionHoldsAtBetweens11CreationTool_title,
				Messages.BehaviouralDescriptionHoldsAtBetweens11CreationTool_desc,
				Collections.singletonList(GeneratorElementTypes.ContextRelationInitialComplexEvent_4016));
		entry.setId("createBehaviouralDescriptionHoldsAtBetweens11CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(GeneratorElementTypes
				.getImageDescriptor(GeneratorElementTypes.ContextRelationInitialComplexEvent_4016));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createHoldsAt12CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.HoldsAt12CreationTool_title,
				Messages.HoldsAt12CreationTool_desc, Collections.singletonList(GeneratorElementTypes.HoldsAt_2003));
		entry.setId("createHoldsAt12CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(GeneratorElementTypes.getImageDescriptor(GeneratorElementTypes.HoldsAt_2003));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createHappens13CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Happens13CreationTool_title,
				Messages.Happens13CreationTool_desc, Collections.singletonList(GeneratorElementTypes.Happens_2009));
		entry.setId("createHappens13CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(GeneratorElementTypes.getImageDescriptor(GeneratorElementTypes.Happens_2009));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createHoldsAtBetween14CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.HoldsAtBetween14CreationTool_title,
				Messages.HoldsAtBetween14CreationTool_desc,
				Collections.singletonList(GeneratorElementTypes.HoldsAtBetween_2011));
		entry.setId("createHoldsAtBetween14CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(GeneratorElementTypes.getImageDescriptor(GeneratorElementTypes.HoldsAtBetween_2011));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createInitially15CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Initially15CreationTool_title,
				Messages.Initially15CreationTool_desc, Collections.singletonList(GeneratorElementTypes.Initially_2007));
		entry.setId("createInitially15CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(GeneratorElementTypes.getImageDescriptor(GeneratorElementTypes.Initially_2007));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

}
