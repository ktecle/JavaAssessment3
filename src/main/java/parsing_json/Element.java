package parsing_json;

import java.util.ArrayList;

public class Element {
    private String name;
    private String appearance;
    private Double atomicMass;
    private Double boil;
    private String category;
    private String color;
    private Double density;
    private String discovered_by;
    private Double melt;
    private Double molar_heat;
    private String named_by;
    private int number;
    private int period;
    private String phase;
    private String source;
    private String spectral_img;
    private String summary;
    private String symbol;
    private int xpos;
    private int ypos;
    private ArrayList<Integer> shells;

    public Element(String name,String appearance,Double atomicMass,Double boil,
                   String category,String color,Double density,String discovered_by,Double melt,
                   Double molar_heat,String named_by,int number,int period,String phase,
                   String source,String spectral_img,String summary,String symbol,int xpos,
                   int ypos,ArrayList<Integer>shells){
        this.name = name;
        this.appearance=appearance;
        this.atomicMass=atomicMass;
        this.boil=boil;
        this.category = category;
        this.color = color;
        this.density=density;
        this.discovered_by=discovered_by;
        this.melt=melt;
        this.molar_heat = molar_heat;
        this.named_by=named_by;
        this.number=number;
        this.period=period;
        this.phase=phase;
        this.source=source;
        this.spectral_img=spectral_img;
        this.summary=summary;
        this.symbol=symbol;
        this.xpos=xpos;
        this.ypos=ypos;
        this.shells=shells;
    }
    public String getName(){ return this.name; }
    public String getAppearance(){return this.appearance;}
    public Double getAtomic_mass(){return this.atomicMass;}
    public Double getBoil(){return this.boil;}
    public String getCategory(){return this.category;}
    public String getColor(){return this.color;}
    public Double getDensity(){return this.density;}
    public String getDiscovered_by(){return this.discovered_by;}
    public Double getMelt(){return this.melt;}
    public Double getMolar_heat(){return this.molar_heat;}
    public String getNamed_by(){return this.named_by;}
    public int getNumber(){return this.number;}
    public int     getPeriod(){return this.period;}
    public String getPhase(){return this.phase;}
    public String getSource(){return this.source;}
    public String getSpectral_img(){return this.spectral_img;}
    public String getSummary(){return this.summary;}
    public String getSymbol(){return this.symbol;}
    public int getXpos(){return this.xpos;}
    public int getYpos() { return this.ypos; }
    public ArrayList<Integer> getShells() { return this.shells; }
}