package hometask5.domain;

import java.util.ArrayList;
import java.util.List;

public class Word {
    private final List<Symbol> symbols;

    public Word(List<Symbol> symbols) {
        this.symbols = symbols;
    }

    public List<Symbol> getSymbols() {
        return symbols == null ? null : new ArrayList<>(symbols);
    }

    @Override
    public String toString() {
        if (symbols == null || symbols.size() == 0){
            return "";
        }else {
            StringBuilder stringBuilder = new StringBuilder();

            for (Symbol i : symbols){
                stringBuilder.append(i.getSymbol());
            }
            return stringBuilder.toString();
        }
    }
}