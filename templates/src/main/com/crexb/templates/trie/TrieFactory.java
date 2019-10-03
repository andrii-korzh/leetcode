package com.crexb.templates.trie;

public class TrieFactory {
  private TrieFactory() {
  }

  public static Trie createTrie() {
    return new TrieArray();
//    return new TrieMap();
  }
}
