package cn.javass.hello.struts2impl.action;

import com.opensymphony.xwork2.ActionSupport;

public class HelloWordAction extends ActionSupport {

	private String account;
	private String password;
	private String submitFlag;

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getSubmitFlag() {
		return submitFlag;
	}

	public void setSubmitFlag(String submitFlag) {
		this.submitFlag = submitFlag;
	}

	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub

		this.busssinessExectue();
		return "toWelcome";
	}

	@Override
	public void validate() {
		// TODO Auto-generated method stub

		System.out.println("public void validate() {/////////");

		if (account == null || account.trim().length() == 0) {
			this.addFieldError("account", "账号不许为空");
		}

		if (password == null || password.trim().length() == 0) {
			this.addFieldError("password", "密碼不许为空");
		}

		if (password == null || password.trim().length() <= 6) {
			this.addFieldError("password", "密碼長度必須在六位以上");
		}

	}

	public void busssinessExectue() {
		System.out.println("password----->" + password + ";;account----->"
				+ account + ";;submitFlag---->" + submitFlag);
	}

	public static void main(String[] args) throws Exception {

		HelloWordAction action = new HelloWordAction();

		action.setAccount("111");
		action.setPassword("ccc");

		action.execute();
	}

}
