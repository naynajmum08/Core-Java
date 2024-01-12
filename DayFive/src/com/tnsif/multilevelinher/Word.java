//to demonstrate child class
package com.tnsif.multilevelinher;

public class Word extends WordPad{
	private boolean spellCheckEnabled;
	
	public Word()
	{
		this.spellCheckEnabled=true;
	}
	
	public void spellCheck()
	{
		if(spellCheckEnabled)
		{
			System.out.println("Running spell check....");
		}
		else
		{
			System.out.println("Spell check is disabled");
		}
			
	}
	
	public void enableSpellCheck(boolean enable)
	{
		spellCheckEnabled=enable;
	}

}
