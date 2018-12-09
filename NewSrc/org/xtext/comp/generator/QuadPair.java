package org.xtext.comp.generator;

import org.xtext.comp.generator.Quadruplet;

public class QuadPair extends Quadruplet<OPCode<OP, String>, String, String, String>{

		public QuadPair(OPCode<OP, String> operateur, String reponse, String arg1, String arg2) {
			super(operateur, reponse, arg1, arg2);
		}

	}
