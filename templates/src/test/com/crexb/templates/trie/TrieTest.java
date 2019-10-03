package com.crexb.templates.trie;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TrieTest {

  @Test
  void insert() {
    TrieMap trie = new TrieMap();
    trie.insert("g");
    assertEquals(1, trie.root.children.size());
    assertTrue(trie.root.children.get('g').word);
  }

  @Test
  void search() {
    TrieMap trie = new TrieMap();
    trie.insert("good");
    assertFalse(trie.search("g"));
    assertFalse(trie.search("go"));
    assertFalse(trie.search("goo"));
    assertTrue(trie.search("good"));
    assertFalse(trie.search("goods"));
  }

  @Test
  void startsWith() {
    TrieMap trie = new TrieMap();
    trie.insert("good");
    assertTrue(trie.startsWith("g"));
    assertTrue(trie.startsWith("go"));
    assertTrue(trie.startsWith("goo"));
    assertTrue(trie.startsWith("good"));
    assertFalse(trie.startsWith("goods"));
  }
}