/**
 * generated by Xtext 2.15.0
 */
package org.xtext.comp.ide;

import com.google.inject.Guice;
import com.google.inject.Injector;
import org.eclipse.xtext.util.Modules2;
import org.xtext.comp.PyRuntimeModule;
import org.xtext.comp.PyStandaloneSetup;
import org.xtext.comp.ide.PyIdeModule;

/**
 * Initialization support for running Xtext languages as language servers.
 */
@SuppressWarnings("all")
public class PyIdeSetup extends PyStandaloneSetup {
  @Override
  public Injector createInjector() {
    PyRuntimeModule _pyRuntimeModule = new PyRuntimeModule();
    PyIdeModule _pyIdeModule = new PyIdeModule();
    return Guice.createInjector(Modules2.mixin(_pyRuntimeModule, _pyIdeModule));
  }
}
