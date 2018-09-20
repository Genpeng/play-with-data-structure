package ch07_set_and_map;

import util.FileUtil;

import java.util.List;

/**
 * Test self-defined set class -- {@code BSTSet}.
 *
 * @author  StrongXGP (xgp1227@gmail.com)
 * @date    2018/09/20
 */
public class TestBSTSet {
    public static void main(String[] args) {
        String pathname = "data/pride-and-prejudice.txt";
        List<String> wordList = FileUtil.getAllWords(pathname);
        System.out.println(pathname);
        System.out.println("The number of words in the file is: " + wordList.size());

        Set<String> wordSet = new BSTSet<>();
        for (String word : wordList) {
            wordSet.add(word);
        }
        System.out.println("The number of unique words in the file is: " + wordSet.getSize());
    }
}
