/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tableviewornek;

/**
 *
 * @author ecir
 */
public class Ogrenci {
    private String ogrno;
    private String ogradi;
    private String ogrsadi;
    
    public Ogrenci(String ogrno,String ogradi,String ogrsadi){
        this.ogrno=ogrno;
        this.ogradi=ogradi;
        this.ogrsadi=ogrsadi;
    }

    /**
     * @return the ogrno
     */
    public String getOgrno() {
        return ogrno;
    }

    /**
     * @param ogrno the ogrno to set
     */
    public void setOgrno(String ogrno) {
        this.ogrno = ogrno;
    }

    /**
     * @return the ogradi
     */
    public String getOgradi() {
        return ogradi;
    }

    /**
     * @param ogradi the ogradi to set
     */
    public void setOgradi(String ogradi) {
        this.ogradi = ogradi;
    }

    /**
     * @return the ogrsadi
     */
    public String getOgrsadi() {
        return ogrsadi;
    }

    /**
     * @param ogrsadi the ogrsadi to set
     */
    public void setOgrsadi(String ogrsadi) {
        this.ogrsadi = ogrsadi;
    }
    
}
