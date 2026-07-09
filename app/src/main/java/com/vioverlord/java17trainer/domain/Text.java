package com.vioverlord.java17trainer.domain;
public final class Text { public final String zh; public final String ja; public Text(String zh, String ja){this.zh=zh;this.ja=ja;} public String get(String lang){return "ja".equals(lang)?ja:zh;} }
