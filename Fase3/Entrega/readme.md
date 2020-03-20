# README

* Dirección a la ruta adecuada

	cd implementacion/

* Generación analizador léxico con JLex

	java -cp /lib/JLex.jar JLex.Main /src/lex/Tiny.l

* Generación analizador léxico con CUP

	java -cp lib/cup.jar java_cup.Main -parser TinySyntaxAnalyzer -symbols LexicalClass -nopositions src/synt/Tiny.cup

* Actualización ficheros

	mv Tiny.l.java src/lex/TinyLexicalAnalyzer.java
	mv TinySyntaxAnalyzer.java src/synt/
	mv LexicalClass.java src/synt/

* Mover ficheros imput

	mv ../pruebas/* ./

