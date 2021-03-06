/*******************************************************************************
 * This file is part of the Twig eclipse plugin.
 *
 * (c) Robert Gruendler <r.gruendler@gmail.com>
 *
 * For the full copyright and license information, please view the LICENSE
 * file that was distributed with this source code.
 ******************************************************************************/
package com.dubture.twig.core.codeassist.context;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.jface.text.IDocument;
import org.eclipse.php.internal.core.util.text.TextSequence;

import com.dubture.twig.core.documentModel.parser.partitioner.TwigPartitionTypes;
import com.dubture.twig.core.log.Logger;
import com.dubture.twig.core.util.text.TwigTextSequenceUtilities;

/**
 *
 * Completion context for local template variables, ie:
 *
 *
 * <pre>
 *
 *     {% for user in users %}
 *     {{ |  <--- completes user and users
 *
 *
 * </pre>
 *
 *
 *
 *
 * @author Robert Gruendler <r.gruendler@gmail.com>
 *
 */
@SuppressWarnings("restriction")
public class TemplateVariablesContext extends AbstractTwigCompletionContext {
	@Override
	public boolean isValid(IDocument template, int offset, IProgressMonitor monitor) {
		if (!super.isValid(template, offset, monitor)) {
			return false;
		}

		try {

			if (getPartitionType() == TwigPartitionTypes.TWIG_QUOTED_STRING)
				return false;

			TextSequence sequence = getStatementText();

			if (TwigTextSequenceUtilities.isInField(sequence)) {
				return false;
			}

			return true;

		} catch (Exception e) {
			Logger.logException(e);
		}
		return false;
	}
}
