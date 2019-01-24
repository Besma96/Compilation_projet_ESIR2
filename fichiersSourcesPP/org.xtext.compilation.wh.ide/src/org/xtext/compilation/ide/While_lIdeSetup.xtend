/*
 * generated by Xtext 2.15.0
 */
package org.xtext.compilation.ide

import com.google.inject.Guice
import org.eclipse.xtext.util.Modules2
import org.xtext.compilation.While_lRuntimeModule
import org.xtext.compilation.While_lStandaloneSetup

/**
 * Initialization support for running Xtext languages as language servers.
 */
class While_lIdeSetup extends While_lStandaloneSetup {

	override createInjector() {
		Guice.createInjector(Modules2.mixin(new While_lRuntimeModule, new While_lIdeModule))
	}
	
}