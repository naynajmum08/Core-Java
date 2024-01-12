//driver class
package com.tnsif.multilevelinher;

public class TextEditor {

	public static void main(String[] args) {
		Word word=new Word();
		
		word.write("Hello");
		word.display();
		word.formatText(true);
		word.display();
		
		word.spellCheck();
		word.enableSpellCheck(false);
		word.spellCheck();

	}

}
