public class autobus
{
    private String kennzeichen;
    private int sitzplatze;
    private boolean anhanger; 
    
    public String getKenzeichen()
    {
    return kennzeichen;
}
 
    public int getSitzplatze()
    {
    return sitzplatze;
}

    public boolean getzAnhanger()
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
    public void setAnganhger(boolean neuerAnhanger)
    {
        anhanger=neuerAnhanger;
    }
}

