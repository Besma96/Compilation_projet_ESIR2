//package org.xtext.compilateur.generator;
//
//import java.io.FileNotFoundException;
//import java.io.PrintWriter;
//import java.net.URI;
//import java.util.List;
//import java.util.Map;
//
////import javax.annotation.Resource;
////
////import org.antlr.runtime.tree.TreeIterator;
////import org.eclipse.emf.ecore.EObject;
////import org.eclipse.emf.ecore.resource.ResourceSet;
////import org.eclipse.xtext.util.CancelIndicator;
////import org.eclipse.xtext.validation.CheckMode;
////import org.eclipse.xtext.validation.Issue;
////import org.xtext.compilateur.PyStandaloneSetup;
////import org.xtext.compilation.while_l.Program;
//
//
//import org.eclipse.emf.common.util.EList;
//import org.eclipse.emf.common.util.TreeIterator;
//import org.eclipse.emf.common.util.URI;
//import org.eclipse.emf.ecore.EObject;
//import org.eclipse.emf.ecore.resource.Resource;
//import org.eclipse.emf.ecore.resource.ResourceSet;
//import org.eclipse.xtext.util.CancelIndicator;
//import org.eclipse.xtext.validation.CheckMode;
//import org.eclipse.xtext.validation.IResourceValidator;
//import org.eclipse.xtext.validation.Issue;
//
//import com.google.inject.Inject;
//import com.google.inject.Provider;
//
//public class NewSymbolTable {
//
//	private Map<String, FunctionDef> listFunction;
//	private Map<String, String> symboles;
//	CodeIntermediaire codeI = new CodeIntermediaire();
//
//	public static NewSymbolTable instance;
//
//
//	/**
//	 * Get the singleton instance of the GeneratorAddr
//	 * @return The unique instance of the GeneratorAddr
//	 */
//	public static NewSymbolTable getInstance() {
//		if (instance == null) {
//			return new PyStandaloneSetup().createInjectorAndDoEMFRegistration().getInstance(NewSymbolTable.class);
//		} else {
//			return instance;
//		}
//	}
//	
//	public void createSymTable(String inputFilePath, String outputFilePath)
//		//	throws SymTableException, ThreeAddressCodeException, CS_TranslatorException {
//		// Load the resource
//		ResourceSet set = ResourceSet.get();
//		Resource resource = set.getResource(URI.createFileURI(inputFilePath), true);
//
//		// Validate the resource
//		List<Issue> list = validator.validate(resource, CheckMode.ALL, CancelIndicator.NullImpl);
//		if (!list.isEmpty()) {
//			for (Issue issue : list) {
//				System.err.println(issue);
//			}
//			return;
//		}
//
//		TreeIterator<EObject> tree = resource.getAllContents();
//		while (tree.hasNext()) {
//			EObject next = tree.next(); //AST
//			if (next instanceof Program) {
//				discoverFunctions((Program) next); // Just read the function's names and inputs / outputs
//				iterateAST((Program) next); // Start to discover all the program
//			}
//		}
//
//	//	checkSymbolsUsage(); // Check all the symbols usage
//	//	if (DISPLAY_THREE_ADDR_CODE) {
//			System.out.println(code3Addresses); // Print the 3@ code
//		}
//
////		if(WARNINGS){
////			System.out.println(checkVarUse());
////		}
//
//		// Translator
//		Translator_Python translator = new Translator_Python(code3Addresses);
//		translator.translate();
//
//		//Printing on console
//		if (DISPLAY_SYM_TABLE) {
//			displaySymTable(); 		// Print the symbols table
//		}
//		//if (DISPLAY_TRANSLATION) {	// Print C# code generated
//			System.out.println(translator);
//		}
//		if (PRINT_TRANSLATION) { 	// Write C# code generated in a file
//			try (PrintWriter out = new PrintWriter(outputFilePath)) {
//				out.println(translator.toString());
//			} catch (FileNotFoundException e) {
//				e.printStackTrace();
//			}
//		}
//}
//}
