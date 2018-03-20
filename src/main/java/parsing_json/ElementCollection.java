package parsing_json;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ElementCollection extends ArrayList<Element> {
    //My approach to solving the problem was to read the json file, create an arraylist which holds Element object
    //Each element object will then hold all the properties associated with the Element object(name, atomic_number etc
    //After that by the getters defined in the Element class, it would be easy to retrieve the properties of an element.
    //However I am not able to popoluate my arraylist as I couldn't read the Json file.

    public ArrayList<Element> periodicTableOfElements;

    public Element findByAtomicNumber(int atomic_number) {

        while (super.listIterator().hasNext()) {
            Element e = super.listIterator().next();
            if (e.getNumber() == atomic_number) {
                return e;
            }

        }
        return null;
    }

    public Element findByName(String name) {

        for (int i = 0; i < this.size(); i++) {
            if (this.get(i).getName().equals(name)) {
                return this.get(i);
            }
        }
        return null;
    }


    public ElementCollection where(String fieldName, Object value) {
        int counter = 0;
        for (Element elements : periodicTableOfElements) {
            //if()
        }
        return null;
    }
}

//    public String findName(String element) {
//        Pattern namePattern = Pattern.compile("(?<=([Nn][Aa][Mm][Ee][^A-Za-z])).*?(?=[^A-Za-z0])");
//        Matcher regexMatcher1 = namePattern.matcher(element);
//        String name = regexMatcher1.group();
//        return name;
//    }
//
//    public String findAppearance(String element) {
//        Pattern namePattern = Pattern.compile("(?<=([Aa][Pp][Ee][Aa][Rr][Aa][Nn][Cc][Ee])).*?(?=[^A-Za-z0])");
//        Matcher regexMatcher = namePattern.matcher(element);
//        String appearance = regexMatcher.group();
//        return appearance;
//    }
//
//    public Double findAtomicMass(String element) {
//        Pattern namePattern = Pattern.compile("(?<=([Aa][t][o][m][i][c][_][m][a][s][s])).*?(?=[^A-Za-z0])");
//        Matcher regexMatcher = namePattern.matcher(element);
//        Double atomicMass = Double.parseDouble(regexMatcher.group());
//        return atomicMass;
//    }
//
//    public Double findBoil(String element) {
//        Pattern namePattern = Pattern.compile("(?<=([b][o][i][l])).*?(?=[^A-Za-z0])");
//        Matcher regexMatcher = namePattern.matcher(element);
//        Double boil = Double.parseDouble(regexMatcher.group());
//        return boil;
//    }
//
//    public String findCategory(String element) {
//        Pattern namePattern = Pattern.compile("(?<=([c][a][t][e][g][o][r][y])).*?(?=[^A-Za-z0])");
//        Matcher regexMatcher = namePattern.matcher(element);
//        String category = regexMatcher.group();
//        return category;
//    }
//
//    public String findColor(String element) {
//        Pattern namePattern = Pattern.compile("(?<=([c][o][l][o][r])).*?(?=[^A-Za-z0])");
//        Matcher regexMatcher = namePattern.matcher(element);
//        String color = regexMatcher.group();
//        return color;
//    }
//
//    public Double findDensity(String element) {
//        Pattern namePattern = Pattern.compile("(?<=([d][e][n][s][i][t][y])).*?(?=[^A-Za-z0])");
//        Matcher regexMatcher = namePattern.matcher(element);
//        Double density = Double.parseDouble(regexMatcher.group());
//        return density;
//    }
//
//    public String findDiscoveredBy(String element) {
//        Pattern namePattern = Pattern.compile("(?<=([d][i][s][c][o][v][e][r][e][d][_][b][y])).*?(?=[^A-Za-z0])");
//        Matcher regexMatcher = namePattern.matcher(element);
//        String discoveredBy = regexMatcher.group();
//        return discoveredBy;
//    }
//
//    public Double findMelt(String element) {
//        Pattern namePattern = Pattern.compile("(?<=([m][e][l][t])).*?(?=[^A-Za-z0])");
//        Matcher regexMatcher = namePattern.matcher(element);
//        Double melt = Double.parseDouble(regexMatcher.group());
//        return melt;
//    }
//
//    public Double findMolarHeat(String element) {
//        Pattern namePattern = Pattern.compile("(?<=([m][o][r][a][l][h][e][a][t])).*?(?=[^A-Za-z0])");
//        Matcher regexMatcher = namePattern.matcher(element);
//        Double density = Double.parseDouble(regexMatcher.group());
//        return density;
//    }
//
//    public String findNamedBy(String element) {
//        Pattern namePattern = Pattern.compile("(?<=([n][a][m][e][d][_][b][y])).*?(?=[^A-Za-z0])");
//        Matcher regexMatcher = namePattern.matcher(element);
//        String namedBy = regexMatcher.group();
//        return namedBy;
//    }
//
//    public Integer findNumber(String element) {
//        Pattern namePattern = Pattern.compile("(?<=([n][u][m][b][e][r])).*?(?=[^A-Za-z0])");
//        Matcher regexMatcher = namePattern.matcher(element);
//        Integer number = Integer.parseInt(regexMatcher.group());
//        return number;
//    }
//
//    public Integer findPeriod(String element) {
//        Pattern namePattern = Pattern.compile("(?<=([p][e][r][i][o][d])).*?(?=[^A-Za-z0])");
//        Matcher regexMatcher = namePattern.matcher(element);
//        Integer number = Integer.parseInt(regexMatcher.group());
//        return number;
//    }
//
//    public String findPhase(String element) {
//        Pattern namePattern = Pattern.compile("(?<=([p][h][a][s][e])).*?(?=[^A-Za-z0])");
//        Matcher regexMatcher = namePattern.matcher(element);
//        String phase = regexMatcher.group();
//        return phase;
//    }
//
//    public String findSource(String element) {
//        Pattern namePattern = Pattern.compile("(?<=([s][o][u][r][c][e])).*?(?=[^A-Za-z0])");
//        Matcher regexMatcher = namePattern.matcher(element);
//        String namedBy = regexMatcher.group();
//        return namedBy;
//    }
//
//    public String findSpectralImg(String element) {
//        Pattern namePattern = Pattern.compile("(?<=([s][p][e][c][t][r][a][l][_][i][m][g])).*?(?=[^A-Za-z0])");
//        Matcher regexMatcher = namePattern.matcher(element);
//        String spectralImg = regexMatcher.group();
//        return spectralImg;
//    }
//
//    public String findSumary(String element) {
//        Pattern namePattern = Pattern.compile("(?<=([s][u][m][m][a][r][r][y])).*?(?=[^A-Za-z0])");
//        Matcher regexMatcher = namePattern.matcher(element);
//        String summary = regexMatcher.group();
//        return summary;
//    }
//
//    public String findSymbol(String element) {
//        Pattern namePattern = Pattern.compile("(?<=([s][y][m][b][o][l])).*?(?=[^A-Za-z0])");
//        Matcher regexMatcher = namePattern.matcher(element);
//        String symbol = regexMatcher.group();
//        return symbol;
//    }
//
//    public Integer findXpos(String element) {
//        Pattern namePattern = Pattern.compile("(?<=([x][p][o][s])).*?(?=[^A-Za-z0])");
//        Matcher regexMatcher = namePattern.matcher(element);
//        Integer xpos = Integer.parseInt(regexMatcher.group());
//        return xpos;
//    }
//
//    public Integer findYpos(String element) {
//        Pattern namePattern = Pattern.compile("(?<=([y][p][o][s])).*?(?=[^A-Za-z0])");
//        Matcher regexMatcher = namePattern.matcher(element);
//        Integer ypos = Integer.parseInt(regexMatcher.group());
//        return ypos;
//    }
//
//    public ArrayList<Integer> findShells(String element) {
//        Pattern namePattern = Pattern.compile("(?<=([x][p][o][s])).*?(?=[^A-Za-z0])");
//        Matcher regexMatcher = namePattern.matcher(element);
//        String shells = regexMatcher.group();
//        return null;
//        //return new ArrayList<Integer>(Arrays.asList(shells.split(",")))
//    }

    // creates an instance of Element by calling the Element class constructor and passing all
    //attributes of an element.
//    public Element parseStringIntoElement(String element) {
//        String name = findName(element);
//        String appearance = findAppearance(element);
//        Double atomicMass = findAtomicMass(element);
//        Double boil = findBoil(element);
//        String category = findCategory(element);
//        String color = findColor(element);
//        Double density = findDensity(element);
//        String discovered_by = findDiscoveredBy(element);
//        Double melt = findMelt(element);
//        Double molar_heat = findMolarHeat(element);
//        String named_by = findNamedBy(element);
//        Integer number = findNumber(element);
//        Integer period = findPeriod(element);
//        String phase = findPhase(element);
//        String source = findSource(element);
//        String spectral_img = findSpectralImg(element);
//        String summary = findSumary(element);
//        String symbol = findSymbol(element);
//        Integer xpos = findXpos(element);
//        Integer ypos = findYpos(element);
//        ArrayList<Integer> shells = findShells(element);
//        return new Element(name, appearance, atomicMass, boil, category, color,
//                density, discovered_by, melt, molar_heat, named_by, number, period,
//                phase, source, spectral_img, summary, symbol, xpos, ypos, shells);
//    }

