public class Autobus
{
    private String kennzeichen;
    private int sitzplatze;
    private boolean anhanger; 
    
    public Autobus(String neuesKennzeichen,int neueSitzplatze,boolean neuerAnhanger)
    {
        setKennzeichen(neuesKennzeichen);
        setSitzplatze(neueSitzplatze);
        setAnhanger(neuerAnhanger);
    }
    
    public String getKenzeichen()
    {
    return kennzeichen;
}
 
    public int getSitzplatze()
    {
    return sitzplatze;
}

    public boolean getAnhanger()
    { 
        return anhanger;
    }

    public void setKennzeichen(String neuesKennzeichen)
    {
        kennzeichen=neuesKennzeichen;
    }
    
    public void setSitzplatze(int neueSitzplatze)
    {
        sitzplatze=neueSitzplatze;
    }
    
    public void setAnhanger(boolean neuerAnhanger)
    {
        anhanger=neuerAnhanger;
    }
    
}

