package step1;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;

import org.apache.commons.io.FileUtils;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jdt.core.dom.AST;
import org.eclipse.jdt.core.dom.ASTParser;
import org.eclipse.jdt.core.dom.CompilationUnit;

public class Parser {

	public static final String projectPath = "C:\\Users\\BenjaminLaroche\\Documents\\gitlab\\master_informatique_2\\HAI913I-EvolutionRestructurationLog\\Seance2\\CorrectionTP1_Partie1\\CodeTD2-step1";
	public static final String projectSourcePath = Parser.projectPath + "\\src";
	public static final String jrePath = "C:\\Program Files\\Java\\jre1.8.0_301\\lib\\rt.jar";

	// read all java files from specific folder
	public static ArrayList<File> listJavaFilesForFolder(final File folder) {
		ArrayList<File> javaFiles = new ArrayList<>();
		for (File fileEntry : folder.listFiles()) {
			if (fileEntry.isDirectory()) {
				javaFiles.addAll(Parser.listJavaFilesForFolder(fileEntry));
			} else if (fileEntry.getName().contains(".java")) {
				//System.out.println(fileEntry.getName());
				javaFiles.add(fileEntry);
			}
		}

		return javaFiles;
	}

	public static void main(String[] args) throws IOException {

		// read java files
		final File folder = new File(Parser.projectSourcePath);
		ArrayList<File> javaFiles = Parser.listJavaFilesForFolder(folder);

		for (File fileEntry : javaFiles) {
			String content = FileUtils.readFileToString(fileEntry);
			//System.out.println(content);

			Parser.parse(content.toCharArray());

		}
	}

	// create AST
	private static CompilationUnit parse(char[] classSource) {
		ASTParser parser = ASTParser.newParser(AST.JLS4); // java +1.6
		parser.setResolveBindings(true);
		parser.setKind(ASTParser.K_COMPILATION_UNIT);

		parser.setBindingsRecovery(true);

		Map options = JavaCore.getOptions();
		parser.setCompilerOptions(options);

		parser.setUnitName("");

		String[] sources = { Parser.projectSourcePath };
		String[] classpath = { Parser.jrePath };

		parser.setEnvironment(classpath, sources, new String[] { "UTF-8" }, true);
		parser.setSource(classSource);

		return (CompilationUnit) parser.createAST(null); // create and parse
	}

}
