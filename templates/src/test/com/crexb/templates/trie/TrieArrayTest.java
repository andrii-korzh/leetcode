package com.crexb.templates.trie;

import jdk.Exported;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class TrieArrayTest {

  Trie trie;
  @BeforeEach
  void beforeEach() {
    trie = new TrieArray();
  }

  @DisplayName("Insert words(Positive test cases)")
  @ParameterizedTest(name = "Insert \"{0}\"")
  @ValueSource(strings = { "", "a","z", "good"})
  void insert(String word) {
    trie.insert(word);
    assertTrue(trie.search(word));
  }

  @DisplayName("Insert unsupported words")
  @ParameterizedTest(name = "\"{0}\" is not supported by dictionary")
  @ValueSource(strings = {" ", "1","?"})
  void insertException(String word) {
    Assertions.assertThrows(Exception.class, () -> {
      trie.insert(word);
    });
  }

  @DisplayName("Search words(Positive test cases)")
  @ParameterizedTest(name = "Word \"{0}\"")
  @ValueSource(strings = { "", "a","z", "good"})
  void search(String word) {
    trie.insert(word);
    assertTrue(trie.search(word));
    assertFalse(trie.search(word+"a"));//TODO separate test
  }

  @DisplayName("Search prefix(Positive test cases)")
  @ParameterizedTest(name = "Prefix \"{0}\"")
  @ValueSource(strings = { "", "a","z", "good"})
  void searchWith(String prefix) {
    trie.insert(prefix);
    StringBuilder sb = new StringBuilder();
    for(int i = 0; i < prefix.length(); i++) {
      sb.append(prefix.charAt(i));
      assertTrue(trie.startsWith(sb.toString()));
    }
    //TODO separate test
    sb.append("x");
    assertFalse(trie.startsWith(sb.toString()));
  }
}