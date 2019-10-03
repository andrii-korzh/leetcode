package com.crexb.templates.trie;

public interface Trie {
  void insert(String word);
  boolean search(String word);
  boolean startsWith(String word);
}
