package com.tqb.pojo;

public class User {
    private String uId;

    private String uName;

    private String uPwd;

    private String uPhone;

    private String uAddress;

    private String uMail;

    private String uDate;

    private String uNickname;

    public String getuId() {
        return uId;
    }

    public void setuId(String uId) {
        this.uId = uId == null ? null : uId.trim();
    }

    public String getuName() {
        return uName;
    }

    public void setuName(String uName) {
        this.uName = uName == null ? null : uName.trim();
    }

    public String getuPwd() {
        return uPwd;
    }

    public void setuPwd(String uPwd) {
        this.uPwd = uPwd == null ? null : uPwd.trim();
    }

    public String getuPhone() {
        return uPhone;
    }

    public void setuPhone(String uPhone) {
        this.uPhone = uPhone == null ? null : uPhone.trim();
    }

    public String getuAddress() {
        return uAddress;
    }

    public void setuAddress(String uAddress) {
        this.uAddress = uAddress == null ? null : uAddress.trim();
    }

    public String getuMail() {
        return uMail;
    }

    public void setuMail(String uMail) {
        this.uMail = uMail == null ? null : uMail.trim();
    }

    public String getuDate() {
        return uDate;
    }


	public void setuDate(String uDate) {
        this.uDate = uDate == null ? null : uDate.trim();
    }

    public String getuNickname() {
        return uNickname;
    }

    public void setuNickname(String uNickname) {
        this.uNickname = uNickname == null ? null : uNickname.trim();
    }

	@Override
	public String toString() {
		return "User [uId=" + uId + ", uName=" + uName + ", uPwd=" + uPwd + ", uPhone=" + uPhone + ", uAddress="
				+ uAddress + ", uMail=" + uMail + ", uDate=" + uDate + ", uNickname=" + uNickname + "]";
	}
}