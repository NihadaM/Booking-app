package project;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nihada
 */
public class Smjestaj {
    private int id_smjestaj,sprat,id_izdavac,kapacitet;
    private Boolean parking,bazen,kucni_ljubimci,wifi,balkon,rostilj,status;
    private String vrsta_smjestaja, velicina, lokacija;
    private double cijena, ocjena;
    
    public Smjestaj(int id_smjestaj,Boolean parking,Boolean bazen,Boolean kucni_ljubimci,Boolean wifi,Boolean balkon,
            Boolean rostilj,int sprat,int id_izdavac,int kapacitet,Boolean status, String vrsta_smjestaja,String velicina,
            String lokacija, double cijena, double ocjena) {
        this.id_smjestaj=id_smjestaj;
        this.vrsta_smjestaja=vrsta_smjestaja;
        this.velicina=velicina;
        this.parking=parking;
        this.wifi=wifi;
        this.balkon=balkon;
        this.bazen=bazen;
        this.kucni_ljubimci=kucni_ljubimci;
        this.rostilj=rostilj;
        this.sprat=sprat;
        this.id_izdavac=id_izdavac;
        this.kapacitet=kapacitet;
        this.cijena=cijena;
        this.ocjena = ocjena;
        this.lokacija=lokacija;
        this.status=status;
      
    }
    
    public int getid_smjestaj() {
    return id_smjestaj;
    }
    
    public Boolean getparking() {
    return parking;
    }
    
    public Boolean getbazen() {
    return bazen;
    }
    
    public Boolean getkucni_ljubimci() {
    return kucni_ljubimci;
    }
    
    public Boolean getwifi() {
    return wifi;
    }
    
    public Boolean getbalkon() {
    return balkon;
    }
    
    public Boolean getrostilj() {
    return rostilj;
    }
    
    public int getsprat() {
    return sprat;
    }
    
    public int getid_izdavac() {
    return id_izdavac;
    }
    
    public int getkapacitet() {
    return kapacitet;
    }
    
    public Boolean getstatus() {
    return status;
    }
    
    public String getvrsta_smjestaja() {
    return vrsta_smjestaja;
    }
    
    public String getvelicina() {
    return velicina;
    }
    
    public String getlokacija() {
    return lokacija;
    }
    
    public double getcijena() {
    return cijena;
    }
    
    public double getocjena() {
        return ocjena;
    }
}
