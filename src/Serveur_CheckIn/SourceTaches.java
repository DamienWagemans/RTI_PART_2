/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Serveur_CheckIn;

/**
 *
 * @author damien
 */
public interface SourceTaches {
    public Runnable getTache() throws InterruptedException ;
    public boolean existTaches();
    public void recordTache (Runnable r);
}
