package org.xpect.expectation;


/**
 * 
 * @author Moritz Eysholdt
 */
public interface IMultiLineExpectationRegion extends IExpectationRegion {
	String getIndentation();

	int getClosingSeparatorOffset();
}
