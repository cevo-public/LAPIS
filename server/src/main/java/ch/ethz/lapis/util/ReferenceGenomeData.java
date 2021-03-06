package ch.ethz.lapis.util;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;


public class ReferenceGenomeData {

    private static ReferenceGenomeData instance;
    private final String nucleotideSequence;
    private final char[] nucleotideSequenceArr;
    private final Map<String, String> geneAASequences = new HashMap<>();
    private final Map<String, char[]> geneAASequencesArr = new HashMap<>();

    private ReferenceGenomeData() {
        try {
            InputStream in = getClass().getResourceAsStream("/reference-genome.json");
            JSONObject json = (JSONObject) new JSONParser().parse(new InputStreamReader(in, StandardCharsets.UTF_8));
            nucleotideSequence = (String) json.get("nucleotide_sequence");
            nucleotideSequenceArr = nucleotideSequence.toCharArray();

            JSONArray genes = (JSONArray) json.get("genes");
            for (Object _gene : genes) {
                JSONObject gene = (JSONObject) _gene;
                geneAASequences.put(
                    (String) gene.get("name"),
                    (String) gene.get("sequence")
                );
                geneAASequencesArr.put(
                    (String) gene.get("name"),
                    ((String) gene.get("sequence")).toCharArray()
                );
            }
        } catch (IOException | ParseException e) {
            throw new RuntimeException(e);
        }
    }

    synchronized public static ReferenceGenomeData getInstance() {
        if (instance == null) {
            instance = new ReferenceGenomeData();
        }
        return instance;
    }

    public String getNucleotideSequence() {
        return nucleotideSequence;
    }


    public char[] getNucleotideSequenceArr() {
        return nucleotideSequenceArr;
    }


    public Map<String, String> getGeneAASequences() {
        return geneAASequences;
    }


    public Map<String, char[]> getGeneAASequencesArr() {
        return geneAASequencesArr;
    }


    public List<String> getGeneNames() {
        return new ArrayList<>(geneAASequences.keySet());
    }


    /**
     * @param position Starts with the index 1
     */
    public char getNucleotideBase(int position) {
        return nucleotideSequenceArr[position - 1];
    }


    /**
     * @param position Starts with the index 1
     */
    public char getGeneAABase(String gene, int position) {
        return geneAASequencesArr.get(gene)[position - 1];
    }
}
