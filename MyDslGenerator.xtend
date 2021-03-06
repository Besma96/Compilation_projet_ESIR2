/*
 * generated by Xtext 2.15.0
 */
package org.xtext.example.mydsl.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import org.xtext.example.mydsl.myDsl.Function
import org.xtext.example.mydsl.myDsl.Program
import org.xtext.example.mydsl.myDsl.Commands
import org.xtext.example.mydsl.myDsl.Command
import org.xtext.example.mydsl.myDsl.If
import org.xtext.example.mydsl.myDsl.For
import org.xtext.example.mydsl.myDsl.While
import org.xtext.example.mydsl.myDsl.Nop
import org.xtext.example.mydsl.myDsl.Affect
import org.xtext.example.mydsl.myDsl.Expr
import org.xtext.example.mydsl.myDsl.ExprSimple
import org.xtext.example.mydsl.myDsl.ExprAnd
import org.xtext.example.mydsl.myDsl.ExprOr
import org.xtext.example.mydsl.myDsl.ExprCons
import org.xtext.example.mydsl.myDsl.ExprList
import org.xtext.example.mydsl.myDsl.ExprHd
import org.xtext.example.mydsl.myDsl.ExprTl
import org.xtext.example.mydsl.myDsl.ExprSym
import org.xtext.example.mydsl.myDsl.ExprNot
import org.xtext.example.mydsl.myDsl.ExprEq
import org.xtext.example.mydsl.myDsl.Definition
import org.xtext.example.mydsl.myDsl.Input
import org.xtext.example.mydsl.myDsl.Output
import org.xtext.example.mydsl.myDsl.Foreach

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
class MyDslGenerator extends AbstractGenerator {
	override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
		
	}
	def doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context,
					String name_file,int global_indent,int if_indent,int for_indent,
					int while_indent,int foreach_indent
	)
	{
		for(r:resource.allContents.toIterable.filter(Program)){
			fsa.generateFile(name_file,r.compile(global_indent,if_indent,for_indent,while_indent
				,foreach_indent
			))	
		}
	}
	
	def compile(Program p,int global_indent,int if_indent,int for_indent,int while_indent
		,int foreach_indent		
	){/* 		'''
		«FOR f:p.functions»
		«f.compile(global_indent,if_indent,for_indent,while_indent)»	
		«ENDFOR»
		'''*/
		var res="";
		val size=p.functions.size;
		if(size==1){
		res=p.functions.get(0).compile(global_indent,if_indent,for_indent,while_indent
					,foreach_indent)
		}
		else{
			for(var i=0;i<size-1;i++){
				res+=p.functions.get(i).compile(global_indent,if_indent,for_indent,while_indent
					,foreach_indent
				)+"\n\n"
			}
			res+=p.functions.get(size-1).compile(global_indent,if_indent,for_indent,while_indent
				,foreach_indent)
		}
	return res;
	}
	def compile(Function f,int global_indent,int if_indent,int for_indent,int while_indent
		,int foreach_indent		
	){
		/* 
		'''
			function «f.name»:
			read  «FOR e: f.definition.input.vars SEPARATOR ','»«e»«ENDFOR»
			%
			«f.definition.commands.compile(global_indent,if_indent,for_indent,while_indent,)»
			%
			write «FOR e: f.definition.output.vars SEPARATOR ','»«e»«ENDFOR»
			
		'''*/
		
		return "function "+f.name+":\n"+f.definition.compile(global_indent,if_indent,for_indent,
			while_indent,foreach_indent
		);

	}
	
	def compile(Definition d, int global_indent,int if_indent,int for_indent,int while_indent
	,int foreach_indent){
		return "read "+d.input.compile( global_indent, if_indent, for_indent, while_indent,foreach_indent
	)+"\n"+"%\n"+d.commands.compile(global_indent,if_indent,for_indent,while_indent,foreach_indent)+"\n"+
	"%\n"
	+"write "+d.output.compile(global_indent,if_indent,for_indent,while_indent,foreach_indent);
	}
	
	def compile(Input i,int global_indent,int if_indent,int for_indent,int while_indent,int foreach_indent
	){
		var inputs="";
		val size=i.vars.size;
		if(size==1){
			inputs+=i.vars.get(0);
		}
		else{
		for(var j=0;j<size-1;j++){
			inputs+=i.vars.get(j)+",";
		}	
		inputs+=i.vars.get(size-1);
		}
		return inputs;
	}
	
	def compile(Output o,int global_indent,int if_indent,int for_indent,int while_indent,int foreach_indent 
	){
		var outputs="";
		val size=o.vars.size;
		if(size==1){
			outputs+=o.vars.get(0);
		}
		else{
		for(var j=0;j<size-1;j++){
			outputs+=o.vars.get(j)+",";
		}	
		outputs+=o.vars.get(size-1);
		}
		
		return outputs;
	}	
	
	def compile(Commands cs,int global_indent,int if_indent,int for_indent,int while_indent,int foreach_indent
	)
	{
		var size=cs.commands.size;
		var res="";
		for(Command c :cs.commands)
		{
			if(size==1)
			{
				res+=c.compile(global_indent,if_indent,for_indent,while_indent,foreach_indent)+"";	
			}
			else
			{
				res+=c.compile(global_indent,if_indent,for_indent,while_indent,foreach_indent)+";\n";
				size--;
			}
		}
	return res; 
	}
	def compile(Command c,int global_indent,int if_indent,int for_indent,int while_indent,int foreach_indent 
	)
	{
		var global="";
			for(var j=0;j<global_indent;j++){
				global+=" ";
			}
		
		if(c.cmd instanceof If){
			
			var indentation="";
			for(var i=0;i<(global_indent+if_indent);i++){
				indentation+=" ";
			}
			
		if((c.cmd as If).commands2 !== null){
			return global+"if "+(c.cmd as If).expr.compile(global_indent,if_indent,for_indent,while_indent,
						foreach_indent)
			+" then"+"\n"+(c.cmd as If).commands1.compile(if_indent+global_indent,
						if_indent,for_indent,while_indent,foreach_indent)+"\n"+global
						+"else\n"+(c.cmd as If).commands2.compile(global_indent+if_indent,if_indent,for_indent,while_indent,foreach_indent)+
						"\n"+global+"fi";
						}
			
		else{
			return global+"if "+(c.cmd as If).expr.compile(global_indent,if_indent,for_indent,while_indent,
						foreach_indent)+" then"+"\n"+(c.cmd as If).commands1.compile(global_indent+if_indent,
						if_indent,for_indent,while_indent,foreach_indent)+"\n"+global+"fi";
		}
			
		}
		if(c.cmd instanceof For){
			var indentation="";
			for(var i=0;i<(global_indent+for_indent);i++){
				indentation+=" ";
			}
			
		return global+"for "+(c.cmd as For).expr.compile(global_indent,if_indent,for_indent,while_indent,
						foreach_indent)+" do\n"+(c.cmd as For).cmds.compile(global_indent+for_indent,if_indent,for_indent
			,while_indent,foreach_indent										
									)+"\n"+global+"od";
		
		}
		if(c.cmd instanceof Foreach){
			var indentation="";
			for(var i=0;i<(global_indent+foreach_indent);i++){
				indentation+=" ";
			}
			return global+"foreach "+(c.cmd as Foreach).expr.compile(global_indent,if_indent,for_indent,while_indent,
						foreach_indent)+" in "+
					(c.cmd as Foreach).expr2.compile(global_indent,if_indent,for_indent,while_indent,
						foreach_indent)+" do\n"+
					(c.cmd as Foreach).cmd.compile(global_indent+foreach_indent,if_indent,for_indent,while_indent,
						foreach_indent
					)+"\n"+global+"od";
		}
		if(c.cmd instanceof While){
			var indentation="";
			for(var i=0;i<(global_indent+while_indent);i++){
				indentation+=" ";
			}
			
		return global+"while "+(c.cmd as While).expr.compile(global_indent,if_indent,for_indent,while_indent,
						foreach_indent)
									+" do\n"+(c.cmd as While).cmds.compile(global_indent+while_indent
										,if_indent,for_indent,
										while_indent,foreach_indent
										)+"\n"+global+"od";
			
		}
		if(c.cmd instanceof Nop){
			return "nop";
		}
		if( c.cmd instanceof Affect){
		return global+(c.cmd as Affect).compile(global_indent,if_indent,for_indent,while_indent,
						foreach_indent);
		
		}
	}
	
	def compile (Affect v,int global_indent,int if_indent,int for_indent,int while_indent,
						int foreach_indent)
	{
	val size_vars=v.vars.size;
		if(size_vars==1){
			return v.vars.get(0)+" := "+v.exprs.get(0).compile(global_indent,if_indent,for_indent,while_indent,
						foreach_indent);
		}
		else
		{
			var res="";
			for(var i=0;i<size_vars-1;i++){
				res+=v.vars.get(i)+' ,';
			}
			res+=v.vars.get(size_vars-1)+" := ";
			
			val size_exprs=v.exprs.size;
			for(var i=0;i<size_exprs-1;i++){
				res+=v.exprs.get(i).compile(global_indent,if_indent,for_indent,while_indent,
						foreach_indent)+" ,";
			}
			res+=v.exprs.get(size_exprs-1).compile(global_indent,if_indent,for_indent,while_indent,
						foreach_indent);
			return res;
		}
	}
	def compile (Expr e,int global_indent,int if_indent,int for_indent,int while_indent,
						int foreach_indent){
		if(e.expr instanceof ExprAnd){
		return (e.expr as ExprAnd).arg1.compile(global_indent,if_indent,for_indent,while_indent,
						foreach_indent)+"and"+(e.expr as ExprAnd).arg2.compile(global_indent,if_indent,for_indent,while_indent,
						foreach_indent);
		}
		if(e.expr instanceof ExprOr){
		return (e.expr as ExprOr).arg1.compile(global_indent,if_indent,for_indent,while_indent,
						foreach_indent)+"or"+(e.expr as ExprOr).arg2.compile(global_indent,if_indent,for_indent,while_indent,
						foreach_indent);
		}
		if(e.expr instanceof ExprSimple){
			return (e.expr as ExprSimple).compile(global_indent,if_indent,for_indent,while_indent,
						foreach_indent)
		}
		if(e.expr instanceof ExprCons){
			return "("+"cons "+(e.expr as ExprCons).arg1.compile(global_indent,if_indent,for_indent,while_indent,
						foreach_indent)+" "+(e.expr as ExprCons).arg2.compile(global_indent,if_indent,for_indent,while_indent,
						foreach_indent)+")"
		}
		if(e.expr instanceof ExprList){
			val size=(e.expr as ExprList).arg.size;
			if(size==1){
			return "("+"list "+(e.expr as ExprList).arg.get(0).compile(global_indent,if_indent,for_indent,while_indent,
						foreach_indent)+")";	
			}
			else
			{
			var res="("+"list ";
			for(var i=0;i<size-1;i++){
				res+=(e.expr as ExprList).arg.get(i).compile(global_indent,if_indent,for_indent,while_indent,
						foreach_indent)+""
			}
			res+=(e.expr as ExprList).arg.get(size-1).compile(global_indent,if_indent,for_indent,while_indent,
						foreach_indent)+")"
			(e.expr as ExprList).arg.get(0).compile(global_indent,if_indent,for_indent,while_indent,
						foreach_indent)
			}	
		}
		if(e.expr instanceof ExprHd){
			"("+"hd "+(e.expr as ExprHd).arg.compile(global_indent,if_indent,for_indent,while_indent,
						foreach_indent)+")";
		}
		if(e.expr instanceof ExprTl){
			"("+"Tl "+(e.expr as ExprTl).arg.compile(global_indent,if_indent,for_indent,while_indent,
						foreach_indent)+ ')';
		}
		if(e.expr instanceof ExprSym){
			val size=(e.expr as ExprSym).arg2.size;
			if(size==1){
				return "("+(e.expr as ExprSym).arg1+(e.expr as ExprSym).arg2.get(0).compile(global_indent,if_indent,for_indent,while_indent,
						foreach_indent)+")";
			}
			else
			{
				var res="("+(e.expr as ExprSym).arg1;
				for(var i=0;i<size-1;i++){
					res+=(e.expr as ExprSym).arg2.get(i).compile(global_indent,if_indent,for_indent,while_indent,
						foreach_indent)+"";
				}
				res+=(e.expr as ExprSym).arg2.get(size-1).compile(global_indent,if_indent,for_indent,while_indent,
						foreach_indent)+")";
				return res;	
			}
			
		}
		if(e.expr instanceof ExprNot){
			return "not"+(e.expr as ExprNot).arg1.compile(global_indent,if_indent,for_indent,while_indent,
						foreach_indent);
		}
		if(e.expr instanceof ExprEq){
			return (e.expr as ExprEq).compile(global_indent,if_indent,for_indent,while_indent,
						foreach_indent);
		}
		/*if(e.expr.expr1!==null){
			return '('+e.expr1.compile(global_indent,if_indent,for_indent,while_indent,
						foreach_indent)+')'
		}*/
	}
	def compile(ExprSimple e,int global_indent,int if_indent,int for_indent,int while_indent,
						int foreach_indent){
		if(e.nameFunction!==null){
			return '('+e.nameFunction+" "+e.vars.compile(global_indent,if_indent,for_indent,while_indent,
						foreach_indent)+')';
		}
		else if(e.sym!==null){
				return e.sym;
			}
			else if(e.varSimple!==null){
					return e.varSimple;
				}
				else{
					return e.str;
				}
			}
		
	
	def compile(ExprEq e,int  global_indent,int if_indent,int for_indent,int while_indent,
						int foreach_indent){
		return e.arg1.compile(global_indent,if_indent,for_indent,while_indent,
						foreach_indent)+"=?"+e.arg2.compile(global_indent,if_indent,for_indent,while_indent,
						foreach_indent);
	}

		
}
