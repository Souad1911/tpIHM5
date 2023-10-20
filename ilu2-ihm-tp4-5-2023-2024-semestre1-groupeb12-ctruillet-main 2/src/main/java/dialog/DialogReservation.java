/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dialog;

import interface_noyau_fonctionnel.InterfaceNoyauFonctionnel;
import java.awt.EventQueue;
import java.time.LocalDate;
import javax.swing.JOptionPane;
import presentation.FrameReservation;


      

public class DialogReservation {

    private FrameReservation frameReservation;
    private InterfaceNoyauFonctionnel inf;

    public DialogReservation(InterfaceNoyauFonctionnel inf) {
        this.inf = inf;
    }

    public void initDialog() {
        frameReservation = new FrameReservation();
        frameReservation.initFrame();
        frameReservation.setDialog(this);
        frameReservation.setVisible(true);
    }
      private LocalDate date;
	private String time;
	private String numPersons;
	private int numTable;

    public void handleDateSelectedEvent(LocalDate date) {
        //TODO
        this.date = date;
        this.frameReservation.enableTime();
        throw new UnsupportedOperationException("Not implemented yet");
    }

    public void handleTimeSelectedEvent(String time) {
        //TODO
        this.time = time;
		this.frameReservation.enableNumofPersons();
        throw new UnsupportedOperationException("Not implemented yet");
    }

    public void handleNumOfPersonsSelectedEvent(int nbPersons) {
        //TODO
        this.numPersons = numPersons;
	this.frameReservation.enableTableMap();
        throw new UnsupportedOperationException("Not implemented yet");
    }

    public void handleTableSelectedEvent(int numTable) {
        //TODO
        	this.numTable = numTable;
		System.out.println(numTable);
		this.frameReservation.enableValidationInformation(this.date, this.time, this.numPersons, numTable);
        throw new UnsupportedOperationException("Not implemented yet");
    }

    public void handleCancelEvent() {
        //TODO
     throw new UnsupportedOperationException("Not implemented yet");
    }

    //public void handleValidationEvent() {
        //TODO
        //throw new UnsupportedOperationException("Not implemented yet");
   // }
    public void handleValidateEvent() {
		// Display confirmation window using JOptionPane
		this.frameReservation.enableValidationInformation(this.date, this.time, this.numPersons, this.numTable);
		JOptionPane.showMessageDialog(null, "Confirmation de réservation\n\n Réservation confirmée le " + this.date
				+ " à " + this.time + " pour " + this.numPersons + " personnes à la table " + this.numTable + ".");
	}

    public static void main(String[] args) {
        DialogReservation dialog = new DialogReservation(new InterfaceNoyauFonctionnel());
        EventQueue.invokeLater(() -> {
            dialog.initDialog();
        });
    }

}
