package enMatrix;

import java.beans.XMLDecoder;
import java.beans.XMLEncoder;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.LinkedList;

import enMatrix.person;



public class console {
	
	protected final static String password = "98019821";
	private LinkedList<person> personnel;
	String fileName = "enData.enm";
	
	public console() {
		
		personnel = new LinkedList<person>();
		//load data here later
		
	    boolean loaded = loadData(fileName);
	    if (!loaded) {
	    	System.out.println("        < No file was loaded >        ");
	    	System.out.println();
	    }
		
	}
	
	public static void main(String[] args) {
	
		System.out.println("............................................................................");
		System.out.println(".......................... SEDL enMatrix v.1.1.0 ...........................");
		System.out.println("................. © SEDL Europe. 2011. All Rights Reserved .................");
		System.out.println("............................................................................");
		System.out.println("¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯");
		System.out.println();
		System.out.print  ("         ");
		
		if (TextInputPrompt.getString("PASSWORD: ").equals(password)) {
			console enMatrix = new console();
			enMatrix.run();
		}
			
	}

	private void run() {
		
		boolean exit = false;
		do {
			System.out.println();
			System.out.println("¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯");
			System.out.println("¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯ Welcome to SEDL Europe enMatrix ¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯");
			System.out.println("¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯");
			System.out.println();
			System.out.println("  1 \t Add New Enrolement Record");
			System.out.println("  2 \t List all Enrolement Records");
			System.out.println("  3 \t Open Enrolement Record");
			System.out.println("  4 \t About enMatrix");
			System.out.println("  5 \t Exit enMatrix");
			System.out.println();
			int selection = TextInputPrompt.getInt("  Enter Selection: ");
			System.out.println();
	
			switch (selection) {
				case 1:
					addNewReport();
					break;
				case 2:
					listAll();
					break;
				case 3:
					open();
					break;
				case 4:
					header("About SEDL enMatrix");
					about();
					break;
				case 5:
					exit = true;
			}
			
		} while (exit != true);
		
		saveData(this.fileName);
		
	}

	private void addNewReport() {
		header("New Enrolement Report");
		System.out.println("Enter the following details...");
		System.out.print("");
		int PID = TextInputPrompt.getInt(" PID: \t");
		String FNAME = TextInputPrompt.getString(" First Name: \t");
		String SNAME = TextInputPrompt.getString(" Surname: \t");
		int DIV = TextInputPrompt.getInt(" Division ID: \t");
		
		System.out.println();
		System.out.println("Enter the PID of the Administrator who performed the following...");
		System.out.println(" (1 = Not Nessacary, 2 = TO DO) ");
		System.out.println();
		
		int TCBrief = TextInputPrompt.getInt(" Terms and Condition Briefing: \t");
		int DB = TextInputPrompt.getInt(" Details Entered in Online Database: \t");
		int mail = TextInputPrompt.getInt(" Mailing Account Setup: \t");
		int mailListSent = TextInputPrompt.getInt(" Mailing List Sent: \t");
		int mailListConf = TextInputPrompt.getInt(" Mailing List Confirmed: \t");
		int accDetailsSent = TextInputPrompt.getInt(" Account Details Sent to Member: \t");
		int sms = TextInputPrompt.getInt(" Welcome SMS Sent: \t");
		int email = TextInputPrompt.getInt(" Welcome Email Sent: \t");
		int annEmail = TextInputPrompt.getInt(" Announcement of Join Email Sent: \t");
		
		person newPerson = new person(PID, FNAME, SNAME, DIV, TCBrief, DB, mail, mailListSent, mailListConf, accDetailsSent, sms, email, annEmail);
		personnel.add(newPerson);
		
		System.out.println();
		System.out.println("Person Added to Database");
		TextInputPrompt.pause();
		System.out.println();
		
	}

	private void listAll() {
		
		header("All Enrollment Reports");
		
		if (personnel.size() == 0) {
			System.out.println("No Records");
			TextInputPrompt.pause();
			System.out.println();
			return;
		}
		
		for (int i = 0; i < personnel.size(); i++) {
			
			System.out.print(personnel.get(i).getPID() + "\t\t");
			System.out.print(personnel.get(i).getFNAME());
			if (personnel.get(i).getFNAME().length() >= 8) { System.out.print("\t"); } else { System.out.print("\t\t"); }
			System.out.print(personnel.get(i).getSNAME());
			if (personnel.get(i).getSNAME().length() >= 8) { System.out.print("\t"); } else { System.out.print("\t\t"); }
			int DIV = personnel.get(i).getDIV();
			switch (DIV) {
				case 1:
					System.out.println("SOLAR");
                    break;
				case 2:
					System.out.println("DESTINY");
                    break;
				case 3:
					System.out.println("ECLIPSE");
                    break;
				case 4:
					System.out.println("LEGACY");
			}
				
		}
		
		System.out.println();
		int request = TextInputPrompt.getInt("Enter PID: ");
		
		int pidLoc = pidSearch(request);
		
		if (pidLoc != 99999) {
			printRecord(pidLoc);
			System.out.println();
		} else {
			System.out.println("Record with PID " + request + " was not found. ");
		}
		
		
		
		TextInputPrompt.pause();
		System.out.println();
		
	}

	private void open() {
		
		header("Open Enrolement Report");
		
		int request = TextInputPrompt.getInt("Enter PID: ");
		
		int pidLoc = pidSearch(request);
		
		if (pidLoc != 99999) {
			printRecord(pidLoc);
			System.out.println();
		} else {
			System.out.println("Record with PID " + request + " was not found. ");
		}
		
		TextInputPrompt.pause();
		System.out.println();
		
	}
	
	private int pidSearch(int PID) {
		
		for (int i = 0; i < personnel.size(); i++) {
			if (personnel.get(i).getPID() == PID ) {
				return i;
			}
		}
		
		return 99999;
		
	}

	private void printRecord(int pidLoc) {
		System.out.println();
		header("Enrolement Report for " + personnel.get(pidLoc).getPID());
		System.out.println();
		System.out.println("PID: \t\t\t" + personnel.get(pidLoc).getPID() + "     ");
		System.out.println("First Name: \t\t" + personnel.get(pidLoc).getFNAME() + "     ");
		System.out.println("Second Name: \t\t" + personnel.get(pidLoc).getSNAME());
		System.out.print("Division: \t\t");
		int DIV = personnel.get(pidLoc).getDIV();
		switch (DIV) {
			case 1:
				System.out.println("SOLAR");
				break;
			case 2:
				System.out.println("DESTINY");
				break;
			case 3:
				System.out.println("ECLIPSE");
				break;
			case 4:
				System.out.println("LEGACY");
		}
		System.out.println();
		
		
		int Q;
		
		System.out.print("Terms Brief: \t\t\t");
		Q = personnel.get(pidLoc).getTCBrief();
		switch (Q) {
			case 1:
				System.out.println("N/A");
				break;
			case 2:
				System.out.println("TO DO");
				break;			
			default:
				System.out.println(Q);
		}	
		
		System.out.print("Database Entry: \t\t");
		Q = personnel.get(pidLoc).getDB();
		switch (Q) {
			case 1:
				System.out.println("N/A");
				break;
			case 2:
				System.out.println("TO DO");
				break;			
			default:
				System.out.println(Q);
		}
		
		System.out.print("Mail Setup: \t\t\t");
		Q = personnel.get(pidLoc).getMail();
		switch (Q) {
			case 1:
				System.out.println("N/A");
				break;
			case 2:
				System.out.println("TO DO");
				break;			
			default:
				System.out.println(Q);
		}
		
		
		System.out.print("Mailing List Send: \t\t");
		Q = personnel.get(pidLoc).getMailListSent();
		switch (Q) {
			case 1:
				System.out.println("N/A");
				break;
			case 2:
				System.out.println("TO DO");
				break;			
			default:
				System.out.println(Q);
		}
		
		
		System.out.print("Mailing List Confirmed: \t");
		Q = personnel.get(pidLoc).getMailListConf();
		switch (Q) {
			case 1:
				System.out.println("N/A");
				break;
			case 2:
				System.out.println("TO DO");
				break;			
			default:
				System.out.println(Q);
		}
		
		
		System.out.print("Account Details Send: \t\t");
		Q = personnel.get(pidLoc).getAccDetailsSent();
		switch (Q) {
			case 1:
				System.out.println("N/A");
				break;
			case 2:
				System.out.println("TO DO");
				break;			
			default:
				System.out.println(Q);
		}
		
		
		System.out.print("Welcome SMS Send: \t\t");
		Q = personnel.get(pidLoc).getSms();
		switch (Q) {
			case 1:
				System.out.println("N/A");
				break;
			case 2:
				System.out.println("TO DO");
				break;			
			default:
				System.out.println(Q);
		}
		
		
		
		System.out.print("Welcome EMail Send: \t\t");
		Q = personnel.get(pidLoc).getEmail();
		switch (Q) {
			case 1:
				System.out.println("N/A");
				break;
			case 2:
				System.out.println("TO DO");
				break;			
			default:
				System.out.println(Q);
		}
		
		
		System.out.print("Announcement Email Send: \t");
		Q = personnel.get(pidLoc).getAnnEmail();
		switch (Q) {
			case 1:
				System.out.println("N/A");
				break;
			case 2:
				System.out.println("TO DO");
				break;			
			default:
				System.out.println(Q);
		}
		
	}

	private void about() {
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println(" SEDL enMatrix ");
		System.out.println(" Version 1.1.0: 24th March 2011");
		System.out.println(" © SEDL Europe. 2011. All Rights Reserved. ");
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		TextInputPrompt.pause();
	}
	
	
	private void header (String header) {
		System.out.println(header);
		System.out.println("¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯");
	}
	
	private boolean loadData(String fileName) {
		
		
		boolean readOK = true;
		try {
			XMLDecoder decoder = new XMLDecoder(new FileInputStream(fileName));
			personnel = (LinkedList<person>) decoder.readObject();
			decoder.close();
		} catch (Exception e) {
			// File not found
			readOK = false;
		}

		return readOK;
		
		
	}
	
	public boolean saveData(String fileName){
		boolean savedOK = true;
		try {
			XMLEncoder encoder = new XMLEncoder(new FileOutputStream(fileName));
			encoder.writeObject(personnel);
			encoder.close();
		} catch (Exception e) {
			savedOK = false;
		}
		return savedOK;
	}
	
}
