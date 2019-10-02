package com.crexb.templates.trie;

import com.crexb.templates.trie.speed.TrieNode;

import java.util.HashMap;
import java.util.Map;

class Trie {
//  static class TrieNode {
//    static final int SIZE = 26;
//    TrieNode []children = new TrieNode[SIZE];
//    boolean word;
//  }
  static class TrieNode {
    Map<Character, TrieNode> children = new HashMap<>();
    boolean word;
  }
  TrieNode root = new TrieNode();

  public void insert(String word) {
    TrieNode cur = root;
    for(int i = 0; i < word.length(); i++){
      char c = word.charAt(i);
      if(cur.children.get(c) == null){
        cur.children.put(c, new TrieNode());
      }
      cur = cur.children.get(c);
    }
    cur.word = true;
  }

  public boolean search(String word) {
    TrieNode node = getNode(word);
    return node != null && node.word;
  }

  public boolean startsWith(String prefix) {
    return getNode(prefix) != null;
  }

  private TrieNode getNode(String prefix) {
    TrieNode cur = root;
    for (int i = 0; i < prefix.length(); i++) {
      char c = prefix.charAt(i);
      TrieNode node = cur.children.get(c);
      if (node == null) {
        return null;
      }
      cur = node;
    }
    return cur;
  }
}
