package com.crexb.templates.trie.space;

import java.util.HashMap;
import java.util.Map;

public class TrieNode {
    public static final int SIZE = 26;
    public TrieNode []children = new TrieNode[SIZE];
    boolean word;
}
