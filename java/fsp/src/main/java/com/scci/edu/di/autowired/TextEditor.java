package com.scci.edu.di.autowired;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class TextEditor {
   private SpellChecker spellChecker;
   private Speaker speaker;
   @Autowired
   public TextEditor(SpellChecker spellChecker, @Qualifier("lgSpeaker") Speaker speaker){
      System.out.println("Inside TextEditor constructor." );
      this.spellChecker = spellChecker;
      this.speaker = speaker;
   }
   public void spellCheck(){
      spellChecker.checkSpelling();
   }
}
