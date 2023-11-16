package org.khiemtran.arrays;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ProteinTranslator {

  private final static String METHIONINE = "Methionine";
  private final static String LEUCINE = "Leucine";
  private final static String PHENYLALANINE = "Phenylalanine";
  private final static String SERINE = "Serine";
  private final static String TYROSINE = "Tyrosine";
  private final static String CYSTEINE = "Cysteine";
  private final static String TRYPTOPHAN = "Tryptophan";
  private final static String STOP = "STOP";

  public List<String> translate(String rnaSequence) {
    return IntStream.range(0, rnaSequence.length() / 3)
        .mapToObj(index -> rnaSequence.substring(index * 3, Math.min((index + 1) * 3, rnaSequence.length())))
        .takeWhile(codon -> !receiveCoDon(codon).equals("STOP"))
        .map(ProteinTranslator::receiveCoDon)
        .collect(Collectors.toList());
  }

  private static String receiveCoDon(String codon) {
    return switch (codon) {
      case "AUG" -> METHIONINE;
      case "UUU", "UUC" -> PHENYLALANINE;
      case "UUA", "UUG" -> LEUCINE;
      case "UCU", "UCC", "UCA", "UCG" -> SERINE;
      case "UAU", "UAC" -> TYROSINE;
      case "UGU", "UGC" -> CYSTEINE;
      case "UGG" -> TRYPTOPHAN;
      default -> STOP;
    };
  }
}
