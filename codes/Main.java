/*
 * generated by Xtext 2.15.0
 */
package org.xtext.compilation.generator;

import java.util.List;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.xtext.generator.GeneratorContext;
import org.eclipse.xtext.generator.GeneratorDelegate;
import org.eclipse.xtext.generator.JavaIoFileSystemAccess;
import org.eclipse.xtext.util.CancelIndicator;
import org.eclipse.xtext.validation.CheckMode;
import org.eclipse.xtext.validation.IResourceValidator;
import org.eclipse.xtext.validation.Issue;
import org.xtext.compilation.While_lStandaloneSetup;

import com.google.inject.Inject;
import com.google.inject.Injector;
import com.google.inject.Provider;

public class Main {
	
	private static final int DEFAULT_INDENT = 2;
//	private static final int DEFAULT_COMMAND_INDENT = 2;
//	private static final int DEFAULT_WHILE_INDENT = 2;
//	private static final int DEFAULT_FOR_INDENT = 2;
	
//	private static int IF_INDENT = DEFAULT_IF_INDENT;
//	private static int COMMAND_INDENT = DEFAULT_COMMAND_INDENT;
//	private static int WHILE_INDENT = DEFAULT_WHILE_INDENT;
//	private static int FOR_INDENT = DEFAULT_FOR_INDENT;
	
	private static final String DEFAULT_NAME = "result.wh";
	private static String inputFileName = "test.wh";
private static String outputFileName = DEFAULT_NAME;

	public static void main(String[] args) {
//		if (args.length == 0) {
//			System.err.println("Aborting: no path to EMF resource provided!");
//			return;
//		}
		Injector injector = new While_lStandaloneSetup().createInjectorAndDoEMFRegistration();
		Main main = injector.getInstance(Main.class);
		main.runGenerator(inputFileName, outputFileName);
	}

	@Inject
	private Provider<ResourceSet> resourceSetProvider;

	@Inject
	private IResourceValidator validator;

	@Inject
	private GeneratorDelegate generator;

	@Inject 
	private JavaIoFileSystemAccess fileAccess;

	protected void runGenerator(String inputfile, String outputfile) {
		// Load the resource
		ResourceSet set = resourceSetProvider.get();
		Resource resource = set.getResource(URI.createFileURI(inputfile), true);

		// Validate the resource
		List<Issue> list = validator.validate(resource, CheckMode.ALL, CancelIndicator.NullImpl);
		if (!list.isEmpty()) {
			for (Issue issue : list) {
				System.err.println(issue);
			}
			return;
		}

		// Configure and start the generator
		fileAccess.setOutputPath("src-gen/");
		GeneratorContext context = new GeneratorContext();
		context.setCancelIndicator(CancelIndicator.NullImpl);
		
		//Initialisation du generator
		While_lGenerator while_l = new While_lGenerator();
		while_l.doGenerate(resource, fileAccess, context, outputfile, DEFAULT_INDENT, DEFAULT_INDENT, DEFAULT_INDENT, DEFAULT_INDENT, DEFAULT_INDENT );

		System.out.println("Code generation finished.");
	}
}
