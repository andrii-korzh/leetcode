package com.crexb.templates.trie;

import java.util.HashMap;
import java.util.Map;

class TrieMap {
  static class Node {
    Map<Character, Node> children = new HashMap<>();
    boolean word;
  }
  Node root = new Node();

  public void insert(String word) {
    Node cur = root;
    for(int i = 0; i < word.length(); i++){
      char c = word.charAt(i);
      if(cur.children.get(c) == null){
        cur.children.put(c, new Node());
      }
      cur = cur.children.get(c);
    }
    cur.word = true;
  }

  public boolean search(String word) {
    Node node = getNode(word);
    return node != null && node.word;
  }

  public boolean startsWith(String prefix) {
    return getNode(prefix) != null;
  }

  private Node getNode(String prefix) {
    Node cur = root;
    for (int i = 0; i < prefix.length(); i++) {
      char c = prefix.charAt(i);
      Node node = cur.children.get(c);
      if (node == null) {
        return null;
      }
      cur = node;
    }
    return cur;
  }
}
