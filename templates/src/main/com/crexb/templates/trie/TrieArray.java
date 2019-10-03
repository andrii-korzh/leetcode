package com.crexb.templates.trie;

class TrieArray implements Trie {
  static class Node {
    static final int NODES = 26;
    char val;
    boolean word = false;
    Node[] nodes = new Node[NODES];

    Node(char val) {
      this.val = val;
    }
  }

  final static int CODE_A = 'a';
  Node root = new Node(' ');

  public void insert(String word) {
    Node node = root;
    for (int i = 0; i < word.length(); i++) {
      char x = word.charAt(i);
      int index = x - CODE_A;
      if (node.nodes[index] == null) {
        node.nodes[index] = new Node(x);
      }
      node = node.nodes[index];
    }
    node.word = true;
  }

  public boolean search(String word) {
    Node node = getNode(word);
    return node != null && node.word;
  }

  public boolean startsWith(String prefix) {
    return getNode(prefix) != null;
  }

  private Node getNode(String prefix) {
    Node node = root;
    for (int i = 0; i < prefix.length(); i++) {
      int index = prefix.charAt(i) - CODE_A;
      if (node.nodes[index] == null) {
        return null;
      }
      node = node.nodes[index];
    }
    return node;
  }
}
