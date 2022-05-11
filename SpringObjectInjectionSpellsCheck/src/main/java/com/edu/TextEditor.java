package com.edu;

public class TextEditor {
	private SpellChecker text;
	
	//generate setter and getter method

   public SpellChecker getText() {
		return text;
	}

	public void setText(SpellChecker text) {
		text = text;
	}
	public void check()
	{
		if(text!=null)
		{
			text.check();
		}
		else
		{
			System.out.println("Spelling is not Check");
		}
	}
}

	

