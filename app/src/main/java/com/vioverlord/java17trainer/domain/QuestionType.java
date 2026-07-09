package com.vioverlord.java17trainer.domain;
public enum QuestionType { SINGLE, MULTIPLE, EXECUTION, SELECT_CORRECT, SELECT_INCORRECT, CONCEPT; public boolean single(){return this!=MULTIPLE;} }
