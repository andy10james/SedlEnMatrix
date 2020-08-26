package enMatrix;
public class person {

	protected int PID;
	protected String FNAME;
	protected String SNAME;
	protected int DIV;
	
	protected int TCBrief;
	protected int DB;
	protected int mail;
	protected int mailListSent;
	protected int	mailListConf;
	protected int accDetailsSent;
	protected int sms;
	protected int email;
	protected int annEmail;
	
	public person () {
		
		
	}
	
	public person(int PID, String FNAME, String SNAME, int DIV, int TCBrief, int DB, int mail, int mailListSent, int mailListConf, int accDetailsSent, int sms,	int email, int annEmail) {
		this.PID = PID;
		this.FNAME = FNAME;
		this.SNAME = SNAME;
		this.DIV = DIV;
		
		this.TCBrief = TCBrief;
		this.DB =  DB;
		this.mail = mail;
		this.mailListSent = mailListSent;
		this.mailListConf = mailListConf;
		this.accDetailsSent = accDetailsSent;
		this.sms = sms;
		this.email = email;
		this.annEmail = annEmail;
		
	}

	/**
	 * @return the Person ID
	 */
	public int getPID() {
		return PID;
	}

	/**
	 * @return the Firstname
	 */
	public String getFNAME() {
		return FNAME;
	}

	/**
	 * @return the Surname
	 */
	public String getSNAME() {
		return SNAME;
	}

	/**
	 * @return the Division ID
	 */
	public int getDIV() {
		return DIV;
	}

	/**
	 * @return The Terms and Conditions Briefing Completion status
	 */
	public int getTCBrief() {
		return TCBrief;
	}

	/**
	 * @return the Database Completion status
	 */
	public int getDB() {
		return DB;
	}

	/**
	 * @return the Mail Setup Completion status
	 */
	public int getMail() {
		return mail;
	}

	/**
	 * @return the Mailing List Sent status
	 */
	public int getMailListSent() {
		return mailListSent;
	}

	/**
	 * @return the Mailing List Confirmed status
	 */
	public int getMailListConf() {
		return mailListConf;
	}

	/**
	 * @return the Account Details Sent status
	 */
	public int getAccDetailsSent() {
		return accDetailsSent;
	}

	/**
	 * @return the Welcome SMS Sent status
	 */
	public int getSms() {
		return sms;
	}

	/**
	 * @return the Welcome Email Sent status
	 */
	public int getEmail() {
		return email;
	}

	/**
	 * @return the Announcement Email Sent status
	 */
	public int getAnnEmail() {
		return annEmail;
	}

	/**
	 * @param PersonID
	 */
	public void setPID(int pID) {
		PID = pID;
	}

	/**
	 * @param First Name
	 */
	public void setFNAME(String fNAME) {
		FNAME = fNAME;
	}

	/**
	 * @param Second Name
	 */
	public void setSNAME(String sNAME) {
		SNAME = sNAME;
	}

	/**
	 * @param Division ID
	 */
	public void setDIV(int dIV) {
		DIV = dIV;
	}

	/**
	 * @param Terms and Conditions Brief status
	 */
	public void setTCBrief(int tCBrief) {
		TCBrief = tCBrief;
	}

	/**
	 * @param Database Completion status
	 */
	public void setDB(int dB) {
		DB = dB;
	}

	/**
	 * @param Mail Account setup status
	 */
	public void setMail(int mail) {
		this.mail = mail;
	}

	/**
	 * @param Mailing List Sent status
	 */
	public void setMailListSent(int mailListSent) {
		this.mailListSent = mailListSent;
	}

	/**
	 * @param Mailing List Confirmed status
	 */
	public void setMailListConf(int mailListConf) {
		this.mailListConf = mailListConf;
	}

	/**
	 * @param Account Details Sent status
	 */
	public void setAccDetailsSent(int accDetailsSent) {
		this.accDetailsSent = accDetailsSent;
	}

	/**
	 * @param Welcome SMS Sent status
	 */
	public void setSms(int sms) {
		this.sms = sms;
	}

	/**
	 * @param Welcome Email Sent status
	 */
	public void setEmail(int email) {
		this.email = email;
	}

	/**
	 * @param Announcement Email Sent status
	 */
	public void setAnnEmail(int annEmail) {
		this.annEmail = annEmail;
	}
	
	
	
}
