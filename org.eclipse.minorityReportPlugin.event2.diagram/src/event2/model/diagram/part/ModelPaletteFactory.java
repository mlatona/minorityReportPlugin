
package event2.model.diagram.part;

import java.util.Collections;

import org.eclipse.gef.palette.PaletteContainer;
import org.eclipse.gef.palette.PaletteGroup;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.ToolEntry;
import org.eclipse.gmf.tooling.runtime.part.DefaultNodeToolEntry;

import event2.model.diagram.providers.ModelElementTypes;

/**
 * @generated
 */
public class ModelPaletteFactory {

	/**
	* @generated
	*/
	public void fillPalette(PaletteRoot paletteRoot) {
		paletteRoot.add(createDefault1Group());
	}

	/**
	* Creates "default" palette tool group
	* @generated
	*/
	private PaletteContainer createDefault1Group() {
		PaletteGroup paletteContainer = new PaletteGroup(Messages.Default1Group_title);
		paletteContainer.setId("createDefault1Group"); //$NON-NLS-1$
		paletteContainer.add(createAgent1CreationTool());
		paletteContainer.add(createObserver2CreationTool());
		paletteContainer.add(createAddParam3CreationTool());
		return paletteContainer;
	}

	/**
	* @generated
	*/
	private ToolEntry createAgent1CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Agent1CreationTool_title, null,
				Collections.singletonList(ModelElementTypes.Agent_2001));
		entry.setId("createAgent1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ModelElementTypes.getImageDescriptor(ModelElementTypes.Agent_2001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createObserver2CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Observer2CreationTool_title, null,
				Collections.singletonList(ModelElementTypes.Observer_2002));
		entry.setId("createObserver2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ModelElementTypes.getImageDescriptor(ModelElementTypes.Observer_2002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createAddParam3CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.AddParam3CreationTool_title,
				Messages.AddParam3CreationTool_desc, Collections.singletonList(ModelElementTypes.Parameter_2003));
		entry.setId("createAddParam3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ModelElementTypes.getImageDescriptor(ModelElementTypes.Parameter_2003));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

}
