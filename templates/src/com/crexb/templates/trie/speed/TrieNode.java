package com.crexb.templates.trie.speed;

import java.util.HashMap;
import java.util.Map;

public class TrieNode {
    Map<Character, TrieNode> children = new HashMap<>();
    boolean word;
    char c;
}
